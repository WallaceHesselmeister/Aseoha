/* (C) TAMA Studios 2025 */
package tama.mixin.client;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.tardis.mod.client.gui.widgets.TextOption;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(TextOption.class)
public abstract class TextOptionMixin extends Button {

    @Shadow(remap = false)
    @Final
    private Font font;

    protected TextOptionMixin(
            int p_259075_,
            int p_259271_,
            int p_260232_,
            int p_260028_,
            Component p_259351_,
            OnPress p_260152_,
            CreateNarration p_259552_) {
        super(p_259075_, p_259271_, p_260232_, p_260028_, p_259351_, p_260152_, p_259552_);
    }

    /**
     * @author Codiak
     * @reason WHITE text NTM jeez
     */
    @Overwrite
    public void renderWidget(GuiGraphics gui, int p_275505_, int p_275674_, float p_275696_) {
        gui.drawString(this.font, "> " + this.getMessage().getString(), this.getX(), this.getY(), 0xFFFFFF, false);
    }
}
