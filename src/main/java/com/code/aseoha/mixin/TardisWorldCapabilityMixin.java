package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithTardisCap;
import com.code.aseoha.misc.DynamicItemStackHandler;
import lombok.Getter;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;
import net.tardis.mod.boti.WorldShell;
import net.tardis.mod.cap.ITardisWorldData;
import net.tardis.mod.cap.TardisWorldCapability;
import net.tardis.mod.energy.TardisEnergy;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.misc.AttunementHandler;
import net.tardis.mod.misc.InteriorEffectsHandler;
import net.tardis.mod.tileentities.inventory.PanelInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TardisWorldCapability.class)
public abstract class TardisWorldCapabilityMixin implements IHelpWithTardisCap, ITardisWorldData {
    @Unique
    @Getter
    private DynamicItemStackHandler aseoha$HammerSpaceBuffer;

    @Shadow(remap = false)
    private WorldShell shell;

    @Shadow(remap = false)
    private World world;

    @Shadow(remap = false)
    public PanelInventory northInv;

    @Shadow(remap = false)
    public PanelInventory eastInv;

    @Shadow(remap = false)
    public PanelInventory southInv;

    @Shadow(remap = false)
    public PanelInventory westInv;

    @Shadow(remap = false)
    private TardisEnergy power;

    @Shadow(remap = false)
    private ItemStackHandler itemBuffer;

    @Shadow(remap = false)
    private String name;

    @Shadow(remap = false)
    private AttunementHandler attunementHandler;

    @Shadow(remap = false)
    private InteriorEffectsHandler effectsHandler;

    @Inject(method = "<init>", at = @At("TAIL"))
    public void constructorHead(World world, CallbackInfo ci) {
        this.aseoha$HammerSpaceBuffer = new DynamicItemStackHandler();
    }

    /**
     * @author Me
     * @reason Make it render the vortex if the shell is in flight
     */
    @Overwrite(remap = false)
    public WorldShell getBotiWorld() {
        TardisHelper.getConsoleInWorld(this.world).ifPresent(tile -> {
            if (tile.isInFlight()) return;
//                this.shell.setWorld();
        });
        return this.shell;
    }

    @Inject(method = "deserializeNBT(Lnet/minecraft/nbt/CompoundNBT;)V", at = @At("TAIL"), remap = false)
    private void deserializeNBT(CompoundNBT tag, CallbackInfo ci) {
        this.aseoha$HammerSpaceBuffer.getHandler().deserializeNBT(tag.getCompound("hammerspace_buffer"));
    }

    /**
     * @author me
     * @reason Hammerspace Buffer
     */
    @Overwrite(remap = false)
    public CompoundNBT serializeNBT() {
        CompoundNBT tag = new CompoundNBT();
        tag.put("north_inv", this.northInv.serializeNBT());
        tag.put("east_inv", this.eastInv.serializeNBT());
        tag.put("south_inv", this.southInv.serializeNBT());
        tag.put("west_inv", this.westInv.serializeNBT());
        tag.put("power", this.power.serializeNBT());
        tag.put("item_buffer", this.itemBuffer.serializeNBT());
        tag.put("hammerspace_buffer", this.getAseoha$HammerSpaceBuffer().getHandler().serializeNBT());
        if (this.name != null) {
            tag.putString("name", this.name);
        }

        this.attunementHandler.serialize(tag);
        tag.put("effects_handler", this.effectsHandler.serializeNBT());
        return tag;
    }
}