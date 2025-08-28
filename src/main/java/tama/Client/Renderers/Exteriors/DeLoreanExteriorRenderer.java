/* (C) TAMA Studios 2025 */
package tama.Client.Renderers.Exteriors;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.animations.demat.DematAnimation;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.entity.CarExteriorEntity;
import net.tardis.mod.misc.enums.MatterState;
import org.jetbrains.annotations.NotNull;
import tama.Misc.CommonRotations;
import tama.aseoha;

@OnlyIn(Dist.CLIENT)
public class DeLoreanExteriorRenderer<T extends CarExteriorEntity, M extends HierarchicalModel<T>>
        extends EntityRenderer<T> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(aseoha.MODID, "textures/entity/delorean.png");
    private final M model;

    public DeLoreanExteriorRenderer(EntityRendererProvider.Context pContext, M model) {
        super(pContext);
        this.model = model;
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull T pEntity) {
        return TEXTURE;
    }

    public void render(
            T pEntity,
            float pEntityYaw,
            float pPartialTick,
            PoseStack pose,
            @NotNull MultiBufferSource pBuffer,
            int pPackedLight) {
        pose.pushPose();
        pose.mulPose(Axis.XP.rotationDegrees(0xB4)); // Rot 180
        pose.scale(1.3f, 1.3f, 1.3f);
        pose.mulPose(Axis.YP.rotationDegrees(pEntityYaw));
        pose.translate(0.0, 0, -1);
        DematAnimation dematAnim = ExteriorRenderer.getAnimationType(
                pEntity.getMatterStateHandler().getDematType());
        float[] colors = dematAnim.getColors(pEntity.getMatterStateHandler(), pPartialTick);
        if (pEntity.getMatterStateHandler().getMatterState() != MatterState.SOLID) {
            dematAnim.modifyPose(pose, pEntity.getMatterStateHandler(), pPartialTick);
            dematAnim.renderExtra(
                    pose,
                    pEntity.getMatterStateHandler(),
                    null,
                    pBuffer,
                    pPartialTick,
                    pPackedLight,
                    OverlayTexture.NO_OVERLAY);
        }

        this.model.setupAnim(pEntity, 0.0F, 0.0F, pPartialTick, 0.0F, 0.0F);
        this.model.renderToBuffer(
                pose,
                pBuffer.getBuffer(this.model.renderType(this.getTextureLocation(pEntity))),
                pPackedLight,
                OverlayTexture.NO_OVERLAY,
                colors[0],
                colors[1],
                colors[2],
                colors[3]);
        super.render(pEntity, pEntityYaw, pPartialTick, pose, pBuffer, pPackedLight);
        pose.popPose();
    }
}
