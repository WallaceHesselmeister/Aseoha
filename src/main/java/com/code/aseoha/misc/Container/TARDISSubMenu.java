package com.code.aseoha.misc.Container;

import java.util.Objects;

import com.code.aseoha.client.Sounds;
import com.code.aseoha.entities.k9;
import com.code.aseoha.networking.Networking;
import com.code.aseoha.networking.Packets.c2s.TakeOffFromClientPacketC2S;
import com.code.aseoha.networking.Packets.c2s.ToggleLocksPacketC2S;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.guis.monitors.IMonitorGui;
import net.tardis.mod.client.guis.monitors.MonitorScreen;
import net.tardis.mod.client.guis.widgets.TextButton;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.tileentities.ConsoleTile;

/**
 * This contains functions for the "TARDIS" Submenu in K-9
 */

@OnlyIn(Dist.CLIENT)
public class TARDISSubMenu extends MonitorScreen {
    @Setter
    @Getter
    private int index = 0;
    private k9 K9;

    public TARDISSubMenu(IMonitorGui mon, k9 interactedK9) {
        super(mon, "aseoha.tardis.submenu");
        this.K9 = interactedK9;
    }

    /**
     * @deprecated I don't know why this is here, and it probably works just fine as well, but it doesn't seem to be used and I don't feel like breaking everything just to remove 3 lines of code
     */
    public TARDISSubMenu(IMonitorGui monitor, String type) {
        super(monitor, type);
    }

    protected void init() {
        super.init();
        ConsoleTile console;
        assert this.minecraft != null;
        assert this.minecraft.level != null;
        if (Dist.CLIENT.isClient()) {
            TileEntity te = this.minecraft.level.getBlockEntity(TardisHelper.TARDIS_POS);
            if (te instanceof ConsoleTile) {
                console = (ConsoleTile) te;
                TextButton fly;
                this.addButton(fly = (TextButton) this.createButton(this.parent.getMinX(), this.parent.getMinY(), new TranslationTextComponent("aseoha.tardis.fly"), (but) -> {
                    Networking.sendToServer(new TakeOffFromClientPacketC2S(Objects.requireNonNull(console.getLevel()).dimension().getRegistryName()));

                    Objects.requireNonNull(this.K9.level).playSound(null, this.K9.blockPosition(), Sounds.AFFIRMATIVE_MASTER.get(), SoundCategory.BLOCKS, 1.0f, 1.0f);
                }));
                this.addButton((TextButton) this.createButton(this.parent.getMinX(), this.parent.getMinY(), new TranslationTextComponent("aseoha.tardis.lock_doors"), (but) -> {
                    Networking.sendToServer(new ToggleLocksPacketC2S(Objects.requireNonNull(console.getLevel()).dimension().getRegistryName()));
                    Objects.requireNonNull(this.K9.level).playSound(null, this.K9.blockPosition(), Sounds.AFFIRMATIVE_MASTER.get(), SoundCategory.BLOCKS, 1.0f, 1.0f);

                }));
                this.addButton((TextButton) this.createButton(this.parent.getMinX(), this.parent.getMinY(), new TranslationTextComponent("aseoha.tardis.coord_z"), (but) -> {
//                if(Dist.CLIENT.isClient())
                    openCoordScreen(this.parent, console, (byte) 3);
//                    Minecraft.getInstance().setScreen(new CoordScreen(this.parent, (byte) 3, Objects.requireNonNull(console.getLevel()).dimension().getRegistryName()));
                }));
                this.addButton((TextButton) this.createButton(this.parent.getMinX(), this.parent.getMinY(), new TranslationTextComponent("aseoha.tardis.coord_y"), (but) -> {
//                if (Dist.CLIENT.isClient())
                    openCoordScreen(this.parent, console, (byte) 2);
//                DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> openCoordScreen(this.parent, console, (byte) 2));
                }));
                this.addButton((TextButton) this.createButton(this.parent.getMinX(), this.parent.getMinY(), new TranslationTextComponent("aseoha.tardis.coord_x"), (but) -> {
//                if(Dist.CLIENT.isClient())
                    openCoordScreen(this.parent, console, (byte) 1);
//                DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> openCoordScreen(this.parent, console, (byte) 1));
                }));
            }
        }
    }

    /**
     * @return 0 - Zero
     */
    public int getUsedHeight() {
        return 0;
    }

    @OnlyIn(Dist.CLIENT)
    public void openCoordScreen(IMonitorGui parent, ConsoleTile console, byte Axis) {
        Minecraft.getInstance().setScreen(new CoordScreen(parent, Axis, Objects.requireNonNull(console.getLevel()).dimension().getRegistryName()));
    }
}
