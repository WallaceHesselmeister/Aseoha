/* (C) TAMA Studios 2025 */
package tama.mixin.client;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.tardis.mod.blockentities.InteriorDoorTile;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.client.renderers.tiles.InteriorDoorRender;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import tama.Misc.HalfBOTI;

@Mixin(InteriorDoorRender.class)
public abstract class DoorRendererMixin {

    /**
     * @author codiak
     * @reason half of a BOTI effect while in flight
     */
    @Inject(remap = false, method = "render", at = @At(value = "TAIL"))
    public void render(
            ITardisLevel tardis,
            InteriorDoorTile tile,
            PoseStack pose,
            MultiBufferSource buffer,
            float ageInTicks,
            int packedLight,
            int packedOverlay,
            CallbackInfo ci) {
        HalfBOTI.render(tardis, tile, pose, buffer, ageInTicks, packedLight, packedOverlay, ci);
    }
}
