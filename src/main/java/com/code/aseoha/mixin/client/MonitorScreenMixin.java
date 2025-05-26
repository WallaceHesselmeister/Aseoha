package com.code.aseoha.mixin.client;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.Helpers.PlayerHelper;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraftforge.registries.IForgeRegistry;
import net.tardis.mod.client.guis.monitors.IMonitorGui;
import net.tardis.mod.client.guis.monitors.MonitorScreen;
import net.tardis.mod.client.guis.widgets.TextButton;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.network.Network;
import net.tardis.mod.network.packets.ProtocolMessage;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.registries.ProtocolRegistry;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.concurrent.atomic.AtomicReference;

@Mixin(MonitorScreen.class)
public abstract class MonitorScreenMixin extends Screen {
    @Shadow(remap = false) protected ConsoleTile tile;

    @Shadow(remap = false) protected IMonitorGui parent;

    @Shadow(remap = false) public abstract int getUsedHeight();

    @Shadow(remap = false) private int id;

    protected MonitorScreenMixin(ITextComponent p_i51108_1_) {
        super(p_i51108_1_);
    }

    /**
     * @author codiak540
     * @reason Isomorphic Security System
     */
    @Overwrite
    public void render(@NotNull MatrixStack matrixStack, int p_render_1_, int p_render_2_, float p_render_3_) {
        this.renderBackground(matrixStack);
        this.parent.renderMonitor(matrixStack);

        AtomicReference<Boolean> IsIsomorphic = new AtomicReference<>();
        AtomicReference<Boolean> HasKey = new AtomicReference<>();

        assert this.minecraft != null;
        assert this.minecraft.player != null;
        TardisHelper.getConsoleInWorld(this.minecraft.player.level).ifPresent((consoleTile -> {
            IsIsomorphic.set(((IHelpWithConsole) consoleTile).Aseoha$GetIsomorphic());
            HasKey.set(PlayerHelper.HasKey(this.minecraft.player, consoleTile));
        }));

        if (!IsIsomorphic.get() || HasKey.get())
            for (Widget b : this.buttons) {
                b.render(matrixStack, p_render_1_, p_render_2_, p_render_3_);
            }
    }

    /**
     * @author codiak540
     * @reason Isomorphic Security System
     */
    @Overwrite(remap = false)
    public Button createButton(int x, int y, ResourceLocation key) {
        Protocol prot = (Protocol)((IForgeRegistry<?>) ProtocolRegistry.PROTOCOL_REGISTRY.get()).getValue(key);
        Button.IPressable press = (buttonx) -> {
            assert this.minecraft.level != null;
            TileEntity te = this.minecraft.level.getBlockEntity(TardisHelper.TARDIS_POS);
            if (te instanceof ConsoleTile) {
                assert prot != null;
                Network.sendToServer(new ProtocolMessage(prot.getRegistryName()));
                prot.call(this.minecraft.level, this.minecraft.player, (ConsoleTile)te);
            }

        };
        int var10003 = y - this.getUsedHeight();
        int var10004 = this.id;
        TextButton button = new TextButton(x, var10003 - var10004 * (int)(9.0 * 1.25), "> " + (prot != null ? prot.getDisplayName(this.tile).getString() : "ERROR"), press);
        ++this.id;
        return button;
    }

    /**
     * @author Codiak540
     * @reason Look up
     */
    @Overwrite(remap = false)
    public Button createButton(int x, int y, TextComponent trans, Button.IPressable pres) {
        int var10004 = this.id;
        TextButton button = new TextButton(x, y - var10004 * (int) (9.0 * 1.25), trans.getString(), pres);
        ++this.id;
        return button;
    }

    /**
     * @author codiak540
     * @reason up
     */
    @Overwrite(remap = false)
    public void addSubmenu(TextComponent com, String menu, int x, int y) {
        Button.IPressable press = (buttonx) -> {
            assert this.minecraft != null;
            this.minecraft.setScreen(new MonitorScreen(this.parent, menu));
        };
        int var10004 = this.id;
        TextButton button = new TextButton(x, y - var10004 * (int)(9.0 * 1.25), com.getString(), press);
        this.addButton(button);
        ++this.id;
    }

    /**
     * @author codiak540
     * @reason up
     */
    @Overwrite(remap = false)
    public void addSubmenu(TextComponent com, Button.IPressable press) {
        int var10002 = this.parent.getMinX();
        int var10003 = this.parent.getMinY() - this.getUsedHeight();
        int var10004 = this.id;
        TextButton button = new TextButton(var10002, var10003 - var10004 * (int)(9.0 * 1.25), com.getString(), press);
        this.addButton(button);
        ++this.id;
    }
}