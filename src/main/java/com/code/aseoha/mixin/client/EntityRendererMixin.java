package com.code.aseoha.mixin.client;

import com.code.aseoha.Helpers.IHelpWithEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import javax.annotation.Nullable;
import java.util.List;

@Mixin(LivingRenderer.class)
public abstract class EntityRendererMixin<T extends LivingEntity, M extends EntityModel<T>> extends EntityRenderer<T> implements IEntityRenderer<T, M> {


    @Shadow protected abstract float getAttackAnim(T p_77040_1_, float p_77040_2_);

    @Shadow protected M model;

    @Shadow protected abstract float getBob(T p_77044_1_, float p_77044_2_);

    @Shadow protected abstract void setupRotations(T p_225621_1_, MatrixStack p_225621_2_, float p_225621_3_, float p_225621_4_, float p_225621_5_);

    @Shadow protected abstract void scale(T p_225620_1_, MatrixStack p_225620_2_, float p_225620_3_);

    @Shadow protected abstract boolean isBodyVisible(T p_225622_1_);

    @Shadow @Nullable protected abstract RenderType getRenderType(T p_230496_1_, boolean p_230496_2_, boolean p_230496_3_, boolean p_230496_4_);

    @Shadow
    public static int getOverlayCoords(LivingEntity p_229117_0_, float p_229117_1_) {
        return 0;
    }

    @Shadow protected abstract float getWhiteOverlayProgress(T p_225625_1_, float p_225625_2_);

    @Shadow @Final protected List<LayerRenderer<T, M>> layers;

    protected EntityRendererMixin(EntityRendererManager p_i46179_1_) {
        super(p_i46179_1_);
    }

    /**
     * @author Codiak540
     * @reason 2DIS
     */
    @Overwrite
    public void render(T entity, float p_225623_2_, float p_225623_3_, MatrixStack stack, IRenderTypeBuffer p_225623_5_, int p_225623_6_) {
        if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(new net.minecraftforge.client.event.RenderLivingEvent.Pre<T, M>(entity, ((LivingRenderer<T, M>) (Object) this), p_225623_3_, stack, p_225623_5_, p_225623_6_))) return;
        stack.pushPose();
        this.model.attackTime = this.getAttackAnim(entity, p_225623_3_);

        boolean shouldSit = entity.isPassenger() && (entity.getVehicle() != null && entity.getVehicle().shouldRiderSit());
        this.model.riding = shouldSit;
        this.model.young = entity.isBaby();
        float f = MathHelper.rotLerp(p_225623_3_, entity.yBodyRotO, entity.yBodyRot);
        float f1 = MathHelper.rotLerp(p_225623_3_, entity.yHeadRotO, entity.yHeadRot);
        float f2 = f1 - f;
        if (shouldSit && entity.getVehicle() instanceof LivingEntity) {
            LivingEntity livingentity = (LivingEntity)entity.getVehicle();
            f = MathHelper.rotLerp(p_225623_3_, livingentity.yBodyRotO, livingentity.yBodyRot);
            f2 = f1 - f;
            float f3 = MathHelper.wrapDegrees(f2);
            if (f3 < -85.0F) {
                f3 = -85.0F;
            }

            if (f3 >= 85.0F) {
                f3 = 85.0F;
            }

            f = f1 - f3;
            if (f3 * f3 > 2500.0F) {
                f += f3 * 0.2F;
            }

            f2 = f1 - f;
        }

        float f6 = MathHelper.lerp(p_225623_3_, entity.xRotO, entity.xRot);
        if (entity.getPose() == Pose.SLEEPING) {
            Direction direction = entity.getBedOrientation();
            if (direction != null) {
                float f4 = entity.getEyeHeight(Pose.STANDING) - 0.1F;
                stack.translate((double)((float)(-direction.getStepX()) * f4), 0.0D, (double)((float)(-direction.getStepZ()) * f4));
            }
        }

        float f7 = this.getBob(entity, p_225623_3_);
        this.setupRotations(entity, stack, f7, f, p_225623_3_);
        stack.scale(-1.0F, -1.0F, 1.0F);
        stack.scale(((IHelpWithEntity) entity).getAseoha$EntityScale(), 1.0f, 1.0f);
        this.scale(entity, stack, p_225623_3_);
        stack.translate(0.0D, -1.501F, 0.0D);
        float f8 = 0.0F;
        float f5 = 0.0F;
        if (!shouldSit && entity.isAlive()) {
            f8 = MathHelper.lerp(p_225623_3_, entity.animationSpeedOld, entity.animationSpeed);
            f5 = entity.animationPosition - entity.animationSpeed * (1.0F - p_225623_3_);
            if (entity.isBaby()) {
                f5 *= 3.0F;
            }

            if (f8 > 1.0F) {
                f8 = 1.0F;
            }
        }

        this.model.prepareMobModel(entity, f5, f8, p_225623_3_);
        this.model.setupAnim(entity, f5, f8, f7, f2, f6);
        Minecraft minecraft = Minecraft.getInstance();
        boolean flag = this.isBodyVisible(entity);
        boolean flag1 = !flag && !entity.isInvisibleTo(minecraft.player);
        boolean flag2 = minecraft.shouldEntityAppearGlowing(entity);
        RenderType rendertype = this.getRenderType(entity, flag, flag1, flag2);
        if (rendertype != null) {
            IVertexBuilder ivertexbuilder = p_225623_5_.getBuffer(rendertype);
            int i = getOverlayCoords(entity, this.getWhiteOverlayProgress(entity, p_225623_3_));
            this.model.renderToBuffer(stack, ivertexbuilder, p_225623_6_, i, 1.0F, 1.0F, 1.0F, flag1 ? 0.15F : 1.0F);
        }

        if (!entity.isSpectator()) {
            for(LayerRenderer<T, M> layerrenderer : this.layers) {
                layerrenderer.render(stack, p_225623_5_, p_225623_6_, entity, f5, f8, p_225623_3_, f7, f2, f6);
            }
        }

        stack.popPose();
        super.render(entity, p_225623_2_, p_225623_3_, stack, p_225623_5_, p_225623_6_);
        net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(new net.minecraftforge.client.event.RenderLivingEvent.Post<>(entity, ((LivingRenderer<T, M>) (Object) this), p_225623_3_, stack, p_225623_5_, p_225623_6_));
    }
}
