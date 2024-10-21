package com.code.aseoha.Controls;

import com.code.aseoha.aseoha;
import com.code.aseoha.items.AseohaItems;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.vector.Vector3d;
import net.tardis.mod.controls.BaseControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.registries.ControlRegistry.ControlEntry;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.consoles.*;

public class CoffeePot extends BaseControl {

    public static final ResourceLocation SAVE_KEY = new ResourceLocation(aseoha.MODID, "coffeepot_data");

    public CoffeePot(ControlEntry entry, ConsoleTile console, ControlEntity entity) {
        super(entry, console, entity);
    }

    @Override
    public EntitySize getSize() {
        if(this.getConsole() instanceof NemoConsoleTile)
            return EntitySize.scalable(0.125F, 0.125F);

        if(this.getConsole() instanceof GalvanicConsoleTile)
            return EntitySize.scalable(0.0625F, 0.0625F);

        if(getConsole() instanceof CoralConsoleTile){
            return EntitySize.scalable(0.125F, 0.125F);
        }

        if(this.getConsole() instanceof HartnellConsoleTile)
            return EntitySize.scalable(0.125F, 0.125F);

        if (this.getConsole() instanceof XionConsoleTile)
            return EntitySize.scalable(0.0625F, 0.0625F);

        if(this.getConsole() instanceof ToyotaConsoleTile)
            return EntitySize.scalable(0.0625F, 0.0625F);

        if(this.getConsole() instanceof NeutronConsoleTile)
            return EntitySize.scalable(0.125F, 0.125F);

        if(this.getConsole() instanceof KeltConsoleTile)
            return EntitySize.scalable(0.125F, 0.125F);

        return EntitySize.scalable(0.125F, 0.125F);
    }

    @Override
    public Vector3d getPos() {
            if (getConsole() instanceof NemoConsoleTile)
                return new Vector3d(0.222, .5, 0.779); //DONE

            if (getConsole() instanceof GalvanicConsoleTile)
                return new Vector3d(-0.808, .45, -0.178); //DONE

            if (getConsole() instanceof CoralConsoleTile)
                return new Vector3d(0.671, .5, 0.011); //DONE

            if (this.getConsole() instanceof HartnellConsoleTile)
                return new Vector3d(0.219, .47, -0.631); //DONE

            if (this.getConsole() instanceof ToyotaConsoleTile)
                return new Vector3d(-0.55, .47, -0.627); //DONE

            if (this.getConsole() instanceof XionConsoleTile)
                return new Vector3d(-0.818, .45, 0.261); //DONE

            if (this.getConsole() instanceof NeutronConsoleTile)
                return new Vector3d(-0.001, .55, -0.748); //DONE

            if (this.getConsole() instanceof KeltConsoleTile)
                return new Vector3d(-0.815, .5, -0.152); //DONE

            if (this.getConsole() instanceof SteamConsoleTile)
                return new Vector3d(0.666, 7.0 / 16.0, 0.782); //DONE

            return new Vector3d(0, 7.0 / 16.0, 0);
    }


    @Override
    public void deserializeNBT(CompoundNBT tag) {

    }

    @Override
    public CompoundNBT serializeNBT() {
        return new CompoundNBT();
    }

    @Override
    public boolean onRightClicked(ConsoleTile console, PlayerEntity player) {
        if(console == null || !console.hasLevel())
            return false;
        if(console.getArtron() >= 25) {
//            player.inventory.add(1, ModItems.COFFEE.get().getDefaultInstance());
            player.addItem(AseohaItems.COFFEE.get().getDefaultInstance());
            console.setArtron(console.getArtron() - 25);
            return true;
        }
        return false;
    }

    @Override
    public SoundEvent getFailSound(ConsoleTile console) {
        return TSounds.SONIC_FAIL.get();
    }

    @Override
    public SoundEvent getSuccessSound(ConsoleTile console) {
        return TSounds.SCREEN_BEEP_SINGLE.get();
    }

    @Override
    public ResourceLocation getAdditionalDataSaveKey() {
        return SAVE_KEY;
    }

    @Override
    public void setConsole(ConsoleTile console, ControlEntity entity) {
        super.setConsole(console, entity);
        console.registerDataHandler(SAVE_KEY, this);
    }

}
