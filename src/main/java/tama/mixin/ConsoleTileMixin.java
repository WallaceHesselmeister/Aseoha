/* (C) TAMA Studios 2025 */
package tama.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ConsoleTile.class)
public abstract class ConsoleTileMixin extends BlockEntity {

    @Shadow(remap = false)
    public abstract void killAllControls();

    public ConsoleTileMixin(BlockEntityType<?> p_155228_, BlockPos p_155229_, BlockState p_155230_) {
        super(p_155228_, p_155229_, p_155230_);
    }

    @Override
    public void setRemoved() {
        super.setRemoved();
        this.killAllControls();
    }
}
