package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.Helpers.IHelpWithExterior;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.misc.IDoorSoundScheme;
import net.tardis.mod.misc.IDoorType;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(TwoBlockBasicExterior.class)
public class TwoBlockBasicExteriorMixin extends AbstractExterior {


    public TwoBlockBasicExteriorMixin(boolean isUnlockedByDefault, IDoorType type, IDoorSoundScheme sounds, ResourceLocation blueprint) {
        super(isUnlockedByDefault, type, sounds, blueprint);
    }

    /**
     * Logic to handle exterior block removal during dematerialisation. <br> This is no longer true as there were issues.
     *
     * @param console
     */
    @Shadow(remap = false) public void demat(ConsoleTile console) {

    }

    /**
     * Logic to handle exterior block placing during rematerialisation
     *
     * @param console
     */
    @Shadow(remap = false) public void remat(ConsoleTile console) {

    }

    @Shadow(remap = false)
    public ExteriorTile getExteriorTile(ConsoleTile console) {
        if (Objects.requireNonNull(console.getLevel()).isClientSide()) {
            ServerWorld world = Objects.requireNonNull(console.getLevel().getServer()).getLevel(console.getCurrentDimension());
            if (world != null) {
                TileEntity te = world.getBlockEntity(console.getCurrentLocation().above());
                if (te instanceof ExteriorTile)
                    return (ExteriorTile) te;
            }
        }
        return null;
    }

    /**
     * Logic to handle exterior block removal when the exterior is being removed in a manner which is not part of flight
     * <br> E.g. Removing the Exterior Blocks from its current position so that it can be replaced on a player position to save them
     *
     * @param tile
     */
    @Shadow(remap = false) public void remove(ConsoleTile tile) {

    }

    /**
     * Logic to handle exterior block placing when the exterior is being placed in a manner which is not part of flight
     * <br> E.g. Adding the Exterior Blocks to a player position to save them
     * <br> E.g 2)  Placing the blocks of an exterior which a broken exterior will swap to
     *
     * @param tile
     * @param dimension
     * @param pos
     */
    @Shadow(remap = false) public void place(ConsoleTile tile, RegistryKey<World> dimension, BlockPos pos) {

    }

    @Shadow(remap = false) public BlockState getDefaultState() {
        return null;
    }

    /**
     * Get the width of this exterior. This is used for the Tardis landing spot finding
     *
     * @param console
     */
    @Shadow(remap = false) public int getWidth(ConsoleTile console) {
        return 0;
    }

    /**
     * Get the height of this exterior. This is used for the Tardis landing spot finding
     *
     * @param console
     */
    @Shadow(remap = false) public int getHeight(ConsoleTile console) {
        return 0;
    }


    @Inject(method = "demat(Lnet/tardis/mod/tileentities/ConsoleTile;)V", at = @At("HEAD"), remap = false)
    private void Aseoha$Demat(ConsoleTile console, CallbackInfo ci) {
        ServerWorld worldIn = Objects.requireNonNull(Objects.requireNonNull(console.getLevel()).getServer()).getLevel(console.getCurrentDimension());
        if (worldIn != null) {
            if (this.getExteriorTile(console) != null) {
                if (!((IHelpWithConsole) console).Aseoha$IsRealWorldFlight()) {
                    ((IHelpWithExterior) this.getExteriorTile(console)).Aseoha$DematFly();
                } else {
//                    ((IHelpWithConsole) console).setInteriorDimension(this.getExteriorTile(console).getInteriorDimensionKey());

                    //Don't demat on real world flight, entity replaces tile entity
                    TardisEntity entity = this.getExteriorTile(console).createEntity();
                    assert entity != null;
                    entity.setNoGravity(true);
                    if (entity != null) {
                        entity.setExteriorTile(this.getExteriorTile(console));
                        entity.setConsole(console);
                        assert worldIn != null;
                        if (worldIn.addFreshEntity(entity)) {
                            ((IHelpWithExterior) this.getExteriorTile(console)).Aseoha$DematFly();
                            console.setEntity(entity);
                        }

                    }
                }
            }
        }
    }
}