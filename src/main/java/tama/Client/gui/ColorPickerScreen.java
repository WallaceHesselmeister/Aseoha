package tama.Client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.AbstractSliderButton;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

/**
 * Simple RGB color picker screen for Forge/Mojang mappings 1.20.1.
 */
public class ColorPickerScreen extends Screen {
    public interface ColorPicked {
        void onPicked(int argb);
    }

    private final ColorPicked callback;

    private int r, g, b; // 0..255

    private EditBox hexField;
    private Button doneBtn;
    private Button cancelBtn;

    private ColorSlider rSlider;
    private ColorSlider gSlider;
    private ColorSlider bSlider;

    private int previewX, previewY, previewW, previewH;

    private boolean syncing = false;

    public ColorPickerScreen(int initialARGB, ColorPicked callback) {
        super(Component.literal("Color Picker"));
        this.callback = callback;
        this.r = (initialARGB >> 16) & 0xFF;
        this.g = (initialARGB >> 8) & 0xFF;
        this.b = (initialARGB) & 0xFF;
    }

    @Override
    protected void init() {
        System.out.println("[ColorPickerScreen] init() called");
        int centerX = this.width / 2;
        int top = this.height / 6;

        int sliderWidth = 220;
        int sliderHeight = 20;
        int gap = 8;

        // Sliders
        this.rSlider = addRenderableWidget(new ColorSlider(centerX - sliderWidth / 2, top, sliderWidth, sliderHeight,
                Component.literal("R"), r, val -> {
            r = val;
            syncHexFromRGB();
        }));
        this.gSlider = addRenderableWidget(new ColorSlider(centerX - sliderWidth / 2, top + (sliderHeight + gap), sliderWidth, sliderHeight,
                Component.literal("G"), g, val -> {
            g = val;
            syncHexFromRGB();
        }));
        this.bSlider = addRenderableWidget(new ColorSlider(centerX - sliderWidth / 2, top + 2 * (sliderHeight + gap), sliderWidth, sliderHeight,
                Component.literal("B"), b, val -> {
            b = val;
            syncHexFromRGB();
        }));

        // Hex field
        int fieldW = 140;
        this.hexField = new EditBox(this.font, centerX - fieldW / 2, top + 3 * (sliderHeight + gap) + 6, fieldW, 20, Component.literal("#RRGGBB"));
        this.hexField.setMaxLength(7);
        addRenderableWidget(this.hexField);
        syncHexFromRGB();

        // Done/Cancel
        this.doneBtn = addRenderableWidget(Button.builder(Component.translatable("gui.done"), b -> {
            try {
                if (callback != null) callback.onPicked(currentColor());
            } catch (Exception e) {
                e.printStackTrace();
            }
            onClose();
        }).size(98, 20).pos(centerX - 100, top + 3 * (sliderHeight + gap) + 36).build());

        this.cancelBtn = addRenderableWidget(Button.builder(Component.translatable("gui.cancel"), b -> onClose())
                .size(98, 20).pos(centerX + 2, top + 3 * (sliderHeight + gap) + 36).build());

        setInitialFocus(this.hexField);

        // Preview rect
        this.previewW = 220;
        this.previewH = 48;
        this.previewX = centerX - previewW / 2;
        this.previewY = top + 3 * (sliderHeight + gap) + 64;
    }

    private void syncHexFromRGB() {
        if (syncing) return;
        syncing = true;
        String hex = String.format("#%02X%02X%02X", r, g, b);
        this.hexField.setValue(hex);
        syncing = false;
    }

    private void syncRGBFromHex() {
        if (syncing) return;
        syncing = true;
        String raw = this.hexField.getValue().trim();
        if (raw.startsWith("#")) raw = raw.substring(1);
        if (raw.length() == 6) {
            try {
                int value = Integer.parseInt(raw, 16);
                r = (value >> 16) & 0xFF;
                g = (value >> 8) & 0xFF;
                b = value & 0xFF;
                if (rSlider != null) rSlider.setFromValue(r);
                if (gSlider != null) gSlider.setFromValue(g);
                if (bSlider != null) bSlider.setFromValue(b);
            } catch (NumberFormatException ignored) {}
        }
        syncing = false;
    }

    private int currentColor() {
        return 0xFF000000 | (r << 16) | (g << 8) | b;
    }

    @Override
    public void tick() {
        System.out.println("[ColorPickerScreen] tick() called");
        super.tick();
        syncRGBFromHex();
    }

    @Override
    public void render(GuiGraphics g, int mouseX, int mouseY, float partialTicks) {
        System.out.println("[ColorPickerScreen] render() called");
        this.renderBackground(g);
        g.drawCenteredString(this.font, this.title, this.width / 2, 12, 0xFFFFFF);
        super.render(g, mouseX, mouseY, partialTicks);
        int left = this.width / 2 - 120;
        g.drawString(this.font, Component.literal("Red"), left, rSlider.getY() - 10, 0xFFAAAAAA, false);
        g.drawString(this.font, Component.literal("Green"), left, gSlider.getY() - 10, 0xFFAAAAAA, false);
        g.drawString(this.font, Component.literal("Blue"), left, bSlider.getY() - 10, 0xFFAAAAAA, false);
        int color = currentColor();
        g.fill(previewX - 1, previewY - 1, previewX + previewW + 1, previewY + previewH + 1, 0xFF000000);
        g.fill(previewX, previewY, previewX + previewW, previewY + previewH, color);
        String hex = String.format("#%02X%02X%02X", r, g, b);
        int textW = this.font.width(hex);
        g.drawString(this.font, hex, previewX + (previewW - textW) / 2, previewY + previewH / 2 - 4, 0xFFFFFFFF, false);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    private static class ColorSlider extends AbstractSliderButton {
        private final Component label;
        private final IntConsumer onChange;

        ColorSlider(int x, int y, int w, int h, Component label, int initialValue, IntConsumer onChange) {
            super(x, y, w, h, Component.empty(), initialValue / 255.0D);
            this.label = label;
            this.onChange = onChange;
            updateMessage();
        }

        void setFromValue(int v) {
            v = Math.max(0, Math.min(255, v));
            this.value = v / 255.0D;
            updateMessage();
        }

        @Override
        protected void updateMessage() {
            int v = (int) Math.round(this.value * 255.0D);
            this.setMessage(Component.literal(label.getString() + ": " + v));
        }

        @Override
        protected void applyValue() {
            int v = (int) Math.round(this.value * 255.0D);
            if (onChange != null) onChange.accept(v);
        }

        @FunctionalInterface
        interface IntConsumer { void accept(int v); }
    }

    public static void open(int initialARGB, ColorPicked cb) {
        System.out.println("[ColorPickerScreen] Opening with color: " + Integer.toHexString(initialARGB));
        Minecraft.getInstance().setScreen(new ColorPickerScreen(initialARGB, cb));
    }
}
