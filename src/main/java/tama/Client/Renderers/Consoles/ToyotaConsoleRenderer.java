/* (C) TAMA Studios 2025 */
package tama.Client.Renderers.Consoles;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.tardis.mod.blockentities.BaseMonitorTile;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.client.animations.AnimationHelper;
import net.tardis.mod.client.models.consoles.IAdditionalConsoleRenderData;
import net.tardis.mod.client.renderers.WorldText;
import net.tardis.mod.client.renderers.consoles.ConsoleRenderer;
import tama.Client.Models.Consoles.ported.ToyotaConsoleModel;
import tama.TileEntities.Console.ToyotaConsoleTile;

public class ToyotaConsoleRenderer extends ConsoleRenderer<ToyotaConsoleTile, ToyotaConsoleModel<ToyotaConsoleTile>> {

    final WorldText text =
            new WorldText(4.75F / 16.0F, 2.4F / 16.0F).minXScale(0.1F).withColor(0xFFFFFF);

    public ToyotaConsoleRenderer(
            BlockEntityRendererProvider.Context context,
            ToyotaConsoleModel<ToyotaConsoleTile> model,
            ResourceLocation tex) {
        super(context, model, tex);
    }

    @Override
    public void renderAdditionalData(
            ITardisLevel tardis,
            ToyotaConsoleTile console,
            float partialTicks,
            PoseStack pose,
            MultiBufferSource source,
            int packedLight,
            int packedOverlay,
            IAdditionalConsoleRenderData data) {
        // pose.pushPose();
        // pose.translate(0.35, 0.3, -0.19);
        // super.renderAdditionalData(tardis, console, partialTicks, pose, source,
        // packedLight,
        // packedOverlay,
        // data);
        // pose.popPose();
    }

    @Override
    public void renderExtra(
            ITardisLevel level,
            ToyotaConsoleTile console,
            float partialTicks,
            PoseStack pose,
            MultiBufferSource source,
            int packedLight,
            int packedOverlay) {
        super.renderExtra(level, console, partialTicks, pose, source, packedLight, packedOverlay);

        pose.pushPose();
        model.root().translateAndRotate(pose);
        AnimationHelper.translateToCenter(
                pose, AnimationHelper.translateTo(pose, model.root(), "components/north_east/bone180/monitor_glow"));
        // pose.mulPose(Axis.XN.rotationDegrees(6));
        pose.scale(1.4f, 1.4f, 1.4f);
        pose.translate(-(text.width / 2), -(text.height / 2), 0.01);
        text.renderText(BaseMonitorTile.gatherWorldText(level), pose, source);
        pose.popPose();
    }
}
