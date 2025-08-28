/* (C) TAMA Studios 2025 */
package tama.mixin;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.misc.ITextureVariantBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import tama.Misc.IHelpWithConsole;

@Mixin(value = ConsoleTile.class, priority = 999)
public abstract class ConsoleTileMixin extends BlockEntity implements ITextureVariantBlockEntity, IHelpWithConsole {
    @Unique
    @Getter
    public final AnimationState aseoha$idleAnimationState = new AnimationState();

    public ConsoleTileMixin(BlockEntityType<?> p_155228_, BlockPos p_155229_, BlockState p_155230_) {
        super(p_155228_, p_155229_, p_155230_);
    }

    @Inject(remap = false, method = "lambda$clientTick$0", at = @At(value = "HEAD"))
    public void clientTick(ITardisLevel tardis, CallbackInfo ci) {
        this.getAseoha$idleAnimationState().startIfStopped((int) tardis.getAnimationTicks());
    }
}
