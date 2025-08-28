package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithExterior;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraftforge.energy.IEnergyStorage;
import net.tardis.mod.boti.IBotiEnabled;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.enums.EnumMatterState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.misc.TexVariant;
import net.tardis.mod.tileentities.ConsoleTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;
import java.util.UUID;

@Mixin(net.tardis.mod.tileentities.exteriors.ExteriorTile.class)
public abstract class ExteriorTile extends TileEntity implements ITickableTileEntity, IBotiEnabled, IEnergyStorage, IHelpWithExterior {

    public ExteriorTile(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
    }

    @Shadow(remap = false)
    public abstract TardisEntity createEntity();

    @Shadow(remap = false)
    public abstract void setMatterState(EnumMatterState state);

    @Shadow(remap = false)
    public abstract void setDoorState(EnumDoorState state);

    @Shadow(remap = false)
    private boolean hasDemated;

    @Shadow(remap = false)
    public abstract void deleteExteriorBlocks();

    @Shadow(remap = false)
    public abstract int extractEnergy(int maxExtract, boolean simulate);

    @Shadow(remap = false)
    protected RegistryKey<World> interiorDimension;

    @Shadow(remap = false)
    public abstract void tick();

    @Shadow(remap = false)
    public abstract void setVariants(TexVariant... variants);

    @Unique
    boolean Aseoha$Scale = true;

    @Unique
    boolean Aseoha$IsSnowyVariant;
    
    @Unique
    private byte Aseoha$Light = 0;

    @Unique
    private UUID Aseoha$ExteriorId;

    @Unique
    private UUID Aseoha$ConsoleId;

    @Unique
    private RegistryKey<World> Aseoha$InteriorDimensionKey;

    @Override
    public boolean Aseoha$GetScale() {
        return this.Aseoha$Scale;
    }

    @Override
    public void Aseoha$SetScale(boolean scale) {
        this.Aseoha$Scale = scale;
    }

    @Override
    public boolean Aseoha$IsSnowyVariant() {
        return this.Aseoha$IsSnowyVariant;
    }

    @Override
    public void Aseoha$SetIsSnowyVariant(boolean IsSnowyVariant) {
        this.Aseoha$IsSnowyVariant = IsSnowyVariant;
    }

    @Override
    public byte Aseoha$GetLight() {
        return this.Aseoha$Light;
    }

    @Override
    public void Aseoha$SetLight(byte light) {
        this.Aseoha$Light = light;
    }

    @Inject(method = "load(Lnet/minecraft/block/BlockState;Lnet/minecraft/nbt/CompoundNBT;)V", at = @At("TAIL"))
    private void Aseoha$Read(BlockState state, CompoundNBT compound, CallbackInfo ci) {
        this.Aseoha$Scale = compound.getBoolean("Aseoha$Scale");
        this.Aseoha$IsSnowyVariant = compound.getBoolean("Aseoha$Snowy");
        
        // Load new fields
        if (compound.contains("aseoha_light"))
            this.Aseoha$Light = compound.getByte("aseoha_light");
        if (compound.contains("aseoha_exterior_id"))
            this.Aseoha$ExteriorId = compound.getUUID("aseoha_exterior_id");
        if (compound.contains("aseoha_console_id"))
            this.Aseoha$ConsoleId = compound.getUUID("aseoha_console_id");
        if (compound.contains("aseoha_interior_dimension_key"))
            this.Aseoha$InteriorDimensionKey = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(compound.getString("aseoha_interior_dimension_key")));
    }

    @Inject(method = "save(Lnet/minecraft/nbt/CompoundNBT;)Lnet/minecraft/nbt/CompoundNBT;", at = @At("TAIL"))
    private void Aseoha$Write(CompoundNBT compound, CallbackInfoReturnable<CompoundNBT> cir) {
        compound.putBoolean("Aseoha$Scale", this.Aseoha$Scale);
        compound.putBoolean("Aseoha$Snowy", this.Aseoha$IsSnowyVariant);
        
        // Save new fields
        compound.putByte("aseoha_light", this.Aseoha$Light);
        if (this.Aseoha$ExteriorId != null)
            compound.putUUID("aseoha_exterior_id", this.Aseoha$ExteriorId);
        if (this.Aseoha$ConsoleId != null)
            compound.putUUID("aseoha_console_id", this.Aseoha$ConsoleId);
        if (this.Aseoha$InteriorDimensionKey != null)
            compound.putString("aseoha_interior_dimension_key", this.Aseoha$InteriorDimensionKey.location().toString());
    }

    @Override
    public void Aseoha$DematFly() {
        this.setMatterState(EnumMatterState.DEMAT);
        this.setDoorState(EnumDoorState.CLOSED);
        this.hasDemated = true;
        this.deleteExteriorBlocks();
    }

    // Console/Exterior ID management implementation
    @Override
    public UUID Aseoha$GetExteriorId() {
        if (this.Aseoha$ExteriorId == null) {
            this.Aseoha$ExteriorId = UUID.randomUUID();
        }
        return this.Aseoha$ExteriorId;
    }

    @Override
    public void Aseoha$SetExteriorId(UUID exteriorId) {
        this.Aseoha$ExteriorId = exteriorId;
    }

    @Override
    public UUID Aseoha$GetConsoleId() {
        return this.Aseoha$ConsoleId;
    }

    @Override
    public void Aseoha$SetConsoleId(UUID consoleId) {
        this.Aseoha$ConsoleId = consoleId;
    }

    @Override
    public RegistryKey<World> Aseoha$GetInteriorDimensionKey() {
        return this.Aseoha$InteriorDimensionKey;
    }

    @Override
    public void Aseoha$SetInteriorDimensionKey(RegistryKey<World> dimensionKey) {
        this.Aseoha$InteriorDimensionKey = dimensionKey;
    }

    @Unique
    public TardisEntity Aseoha$GetOrCreateTardisEntity() {
        if (this.hasDemated)
            return null;
        else {
            TardisEntity ent = this.createEntity();
            if (ent == null) return null;
            assert this.level != null;
            ConsoleTile console = TardisHelper.getConsole(Objects.requireNonNull(this.level.getServer()), this.interiorDimension).orElse(null);
            if (console == null) return null;
            if (console.getExteriorType().getExteriorTile(console) == null) return null;
            ent.setExteriorTile(console.getExteriorType().getExteriorTile(console));
            assert this.level != null;
            TardisHelper.getConsole(Objects.requireNonNull(this.level.getServer()), this.interiorDimension).ifPresent(
                    tile -> tile.setEntity(ent));
            return ent;
        }
    }
}