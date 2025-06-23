/* (C) TAMA Studios 2025 */
package tama.Client.Renderers.Consoles;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.client.models.IAnimatableTileModel;
import net.tardis.mod.client.models.consoles.IAdditionalConsoleRenderData;
import net.tardis.mod.client.renderers.WorldText;
import net.tardis.mod.client.renderers.consoles.ConsoleRenderer;
import tama.Client.Models.Consoles.TokamakConsoleModel;
import tama.TileEntities.Console.TokamakConsoleTile;

public class TokamakConsoleRenderer
        extends ConsoleRenderer<TokamakConsoleTile, TokamakConsoleModel<TokamakConsoleTile>> {

    final WorldText text =
            new WorldText(4.75F / 16.0F, 2.4F / 16.0F).minXScale(0.1F).withColor(0xFFFFFF);

    public TokamakConsoleRenderer(
            BlockEntityRendererProvider.Context context,
            TokamakConsoleModel<TokamakConsoleTile> model,
            ResourceLocation tex) {
        super(context, model, tex);
    }

    @Override
    public void renderAdditionalData(
            ITardisLevel tardis,
            TokamakConsoleTile console,
            float partialTicks,
            PoseStack pose,
            MultiBufferSource source,
            int packedLight,
            int packedOverlay,
            IAdditionalConsoleRenderData data) {}

    @Override
    public void renderExtra(
            ITardisLevel level,
            TokamakConsoleTile console,
            float partialTicks,
            PoseStack pose,
            MultiBufferSource source,
            int packedLight,
            int packedOverlay) {
        super.renderExtra(level, console, partialTicks, pose, source, packedLight, packedOverlay);

        pose.pushPose();
        model.root().translateAndRotate(pose);
        pose.popPose();
    }

    public void render(
            TokamakConsoleTile consoleTile,
            float partialTicks,
            PoseStack poseStack,
            MultiBufferSource multiBufferSource,
            int packedLight,
            int packedOverlay) {
        long animTicks = (Long) Capabilities.getCap(Capabilities.TARDIS, consoleTile.getLevel())
                .map((tardis) -> {
                    return tardis.getAnimationTicks();
                })
                .orElse(consoleTile.getLevel().getGameTime());
        poseStack.translate(0.5, 1.5, 0.5);
        poseStack.mulPose(Axis.ZP.rotationDegrees(180.0F));
        ((IAnimatableTileModel) this.model).setupAnimations(consoleTile, (float) animTicks + partialTicks);
        this.model.renderToBuffer(
                poseStack,
                multiBufferSource.getBuffer(this.model.renderType(this.getTex(consoleTile))),
                packedLight,
                packedOverlay,
                1.0F,
                1.0F,
                1.0F,
                1.0F);
        Capabilities.getCap(Capabilities.TARDIS, Minecraft.getInstance().level).ifPresent((tardis) -> {
            this.renderExtra(
                    tardis, consoleTile, partialTicks, poseStack, multiBufferSource, packedLight, packedOverlay);
        });
        Capabilities.getCap(Capabilities.TARDIS, Minecraft.getInstance().level).ifPresent((cap) -> {
            HierarchicalModel patt4003$temp = this.model;
            if (patt4003$temp instanceof IAdditionalConsoleRenderData data) {
                poseStack.pushPose();
                this.renderAdditionalData(
                        cap, consoleTile, partialTicks, poseStack, multiBufferSource, packedLight, packedOverlay, data);
                poseStack.popPose();
            }
        });
    }
}
