package com.code.aseoha.misc.Container;

import com.code.aseoha.entities.K9Entity;
import com.code.aseoha.misc.ScreenClientStuff;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.guis.monitors.*;
import net.tardis.mod.client.guis.widgets.TextButton;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.network.Network;
import net.tardis.mod.network.packets.WaypointOpenMessage;
import net.tardis.mod.subsystem.FlightSubsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;

/**
 * This is recycled monitor GUI code that I repurposed for K-9
 */
@OnlyIn(Dist.CLIENT)
public abstract class K9MonitorScreen extends Screen implements IMonitorGui {
    public static TranslationTextComponent TITLE = new TranslationTextComponent("aseoha.k9.container.screen");
//    public K9MonitorScreen(ITextComponent titleIn) {
//        super(titleIn);
//    }
    public K9MonitorScreen(K9Entity intK9) {
        super(TITLE);
        this.K9 = intK9;
    }
    protected ConsoleTile tile;
    private int id;
    public K9Entity K9;


    protected void init() {
        super.init();
        assert this.minecraft != null;
        assert this.minecraft.level != null;
        TardisHelper.getConsoleInWorld(this.minecraft.level).ifPresent((tile) -> this.tile = tile);
        this.id = 0;
        this.buttons.clear();
        if (this.tile != null) {
//            ((IForgeRegistry) ProtocolRegistry.PROTOCOL_REGISTRY.get()).getEntries().forEach((entry) -> {
//                if (((Protocol)entry.getClass()).getSubmenu().equals(this.menu)) {
//                    this.addButton(this.addButton(this.getMinX(), this.getMinY(), ((RegistryKey<?>)entry.getKey()).location()));
//                }
//            });
            if(this.tile.getSubsystem(FlightSubsystem.class).isPresent()) {
                this.addSubmenu(new TranslationTextComponent("aseoha.tardis.submenu"), (Button.IPressable) ((but) ->
                        ScreenClientStuff.OpenTARDISScreen(this.K9, this)));}
            this.addSubmenu(new TranslationTextComponent(TardisConstants.Strings.GUI_PROTOCOL_TITLE + "interior_properties"), (button) -> Minecraft.getInstance().setScreen(new InteriorEditScreen(this, "interior")));
            this.addSubmenu(new TranslationTextComponent("gui.tardis.protocol.waypoints"), (but) -> {Minecraft.getInstance().setScreen(new WaypointMonitorScreen(this, "waypoints"));Network.sendToServer(new WaypointOpenMessage(null));});
        }

    }

//@OnlyIn(Dist.CLIENT)
//    public void openTARDISScreen() {
//        Minecraft.getInstance().setScreen(new TARDISSubMenu(this, this.K9));
//    }



    public void addSubmenu(TextComponent com, Button.IPressable press) {
        int var10002 = this.getMinX();
        int var10003 = this.getMinY();
        int var10004 = this.id;
        assert this.minecraft != null;
//        this.minecraft.font.getClass();
        TextButton button = new TextButton(var10002, var10003 - var10004 * (int)(9.0 * 1.25), "> " + com.getString(), press);
        this.addButton(button);
        ++this.id;
    }

//    public void addSubmenu(TextComponent com, String menu) {
//        Button.IPressable press = (button) -> {
//            Minecraft.getInstance().setScreen(new MonitorScreen(this, menu));
//        };
//        this.addSubmenu(com, press);
//    }

    public void render(@NotNull MatrixStack matrixStack, int mouseX, int mouseY, float p_render_3_) {
        this.renderMonitor(matrixStack);
        super.render(matrixStack, mouseX, mouseY, p_render_3_);
    }

//    public boolean shouldCloseOnEsc() {
//        return true;
//    }

    public void removed() {
        super.removed();
    }

//    public Button addButton(int x, int y, ResourceLocation key) {
//        Protocol prot = (Protocol)((IForgeRegistry<?>)ProtocolRegistry.PROTOCOL_REGISTRY.get()).getValue(key);
//        Button.IPressable press = (buttonx) -> {
//            assert this.minecraft != null;
//            assert this.minecraft.level != null;
//            TileEntity te = this.minecraft.level.getBlockEntity(TardisHelper.TARDIS_POS);
//            if (te instanceof ConsoleTile) {
//                assert prot != null;
//                Network.sendToServer(new ProtocolMessage(prot.getRegistryName()));
//                prot.call(this.minecraft.level, this.minecraft.player, (ConsoleTile)te);
//            }
//
//        };
//        int var10004 = this.id;
//        assert this.minecraft != null;
////        this.minecraft.font.getClass();
//        TextButton button = new TextButton(x, y - var10004 * (int)(9.0 * 1.25), "> " + (prot != null ? prot.getDisplayName(this.tile).getString() : "ERROR"), press);
//        ++this.id;
//        return button;
//    }

    public boolean isPauseScreen() {
        return false;
    }
}
