package com.code.aseoha.misc.Container;

import com.code.aseoha.aseoha;
import com.code.aseoha.networking.Networking;
import com.code.aseoha.networking.Packets.SetCoords;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.guis.monitors.IMonitorGui;
import net.tardis.mod.client.guis.monitors.MonitorScreen;
import net.tardis.mod.constants.TardisConstants.Translations;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.network.Network;
import net.tardis.mod.network.packets.ConsoleUpdateMessage;
import net.tardis.mod.network.packets.console.DataTypes;
import net.tardis.mod.network.packets.console.LandCode;
import net.tardis.mod.tileentities.ConsoleTile;

import java.util.Objects;

@OnlyIn(Dist.CLIENT)
public class CoordScreen extends MonitorScreen {
    private final TranslationTextComponent title = new TranslationTextComponent("aseoha.gui.coord.title");
    private final TranslationTextComponent desc = new TranslationTextComponent("aseoha.gui.coord.desc");
    private final TranslationTextComponent coord_set = new TranslationTextComponent("aseoha.gui.coord_set");
    private final TranslationTextComponent coord_suggestion_default = new TranslationTextComponent("aseoha.gui.coord.suggestion.default");
    private final TranslationTextComponent coord_suggestion_current_value = new TranslationTextComponent("aseoha.gui.coord.suggestion.current_value");
    private TextFieldWidget coord;
    private byte Axis;
    private Button setCoord;
    private Button cancel;
    private ResourceLocation console;

    /**
     * @param monitor It's the monitor, what'd you expect?
     * @param axis X, Y, or Z <br />1 = X <br />2 = Y <br />3 = Z
     * @param tile This is the resourcelocation of the consoletile
     */
    public CoordScreen(IMonitorGui monitor, byte axis, ResourceLocation tile) {
        super(monitor, "Axis");
        this.Axis = axis;
        this.console = tile;
    }

    protected void init() {
        super.init();
        this.buttons.clear();
        int centerX = this.parent.getMinX() + (this.parent.getMaxX() - this.parent.getMinX()) / 2;
        this.setCoord = this.createButton(this.parent.getMinX(), this.parent.getMinY(), this.coord_set, (but) -> {
            if (this.console != null) {
                if(this.coord.getValue().replaceAll("[^1234567890]", "").isEmpty()){
                    this.coord.setValue("0");
                }
                Networking.sendToServer(new SetCoords(this.console, this.Axis, Integer.parseInt(this.coord.getValue())));
            }
        });
        this.cancel = this.createButton(this.parent.getMinX(), this.parent.getMinY(), Translations.GUI_CANCEL, (but) -> {
            this.onClose();
        });
        this.font.getClass();
        int height = 9 + 10;
        this.addButton(this.coord = new TextFieldWidget(this.font, centerX - 75, this.parent.getMinY() - this.parent.getHeight() / 2, this.parent.getWidth() - 50, height, new StringTextComponent("")));
        this.addButton(this.setCoord);
        this.addButton(this.cancel);
    }

    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        int centerX = this.parent.getMinX() + (this.parent.getMaxX() - this.parent.getMinX()) / 2;
        drawCenteredString(matrixStack, this.font, this.title.getString(), centerX, this.parent.getMaxY() + 10, 16777215);
        drawCenteredString(matrixStack, this.font, this.desc.getString(), centerX, this.parent.getMinY() - this.parent.getHeight() / 2 - 15, 16777215);
        if (this.coord.isFocused()) {
            this.coord.setSuggestion("");
        }

        if ((!this.coord.isMouseOver((double)mouseX, (double)mouseY) || this.coord.isFocused()) && this.coord.getValue().isEmpty() && !this.coord.isFocused()) {
            assert Objects.requireNonNull(this.minecraft).level != null;
            assert this.minecraft.level != null;
            TileEntity te = this.minecraft.level.getBlockEntity(TardisHelper.TARDIS_POS);
            if (te instanceof ConsoleTile && te != null) {
                ConsoleTile console = (ConsoleTile)te;
                this.coord.setSuggestion(this.coord_suggestion_current_value.getString() + console.getDestinationPosition().getX());
            } else {
                this.coord.setSuggestion(this.coord_suggestion_default.getString());
            }
        }

    }

    public void removed() {
        super.removed();
    }
}
