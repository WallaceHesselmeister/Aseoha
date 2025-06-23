/* (C) TAMA Studios 2025 */
package tama.Client.Renderers.Consoles;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.tardis.mod.blockentities.BaseMonitorTile;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.client.animations.AnimationHelper;
import net.tardis.mod.client.models.consoles.IAdditionalConsoleRenderData;
import net.tardis.mod.client.renderers.WorldText;
import net.tardis.mod.client.renderers.consoles.ConsoleRenderer;
import tama.Client.Models.Consoles.ported.ToyotaConsoleModel;

public class ToyotaConsoleRenderer extends ConsoleRenderer<ConsoleTile, ToyotaConsoleModel<ConsoleTile>> {

    final WorldText text =
            new WorldText(4.75F / 16.0F, 2.4F / 16.0F).minXScale(0.1F).withColor(0xFFFFFF);

    public ToyotaConsoleRenderer(
            BlockEntityRendererProvider.Context context, ToyotaConsoleModel<ConsoleTile> model, ResourceLocation tex) {
        super(context, model, tex);
    }

    @Override
    public void renderAdditionalData(
            ITardisLevel tardis,
            ConsoleTile console,
            float partialTicks,
            PoseStack pose,
            MultiBufferSource source,
            int packedLight,
            int packedOverlay,
            IAdditionalConsoleRenderData data) {}

    @Override
    public void renderExtra(
            ITardisLevel level,
            ConsoleTile console,
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
        pose.mulPose(Axis.YN.rotationDegrees(180));
        pose.mulPose(Axis.XN.rotationDegrees(90));
        pose.scale(2f, 2f, 2f);
        pose.translate(-(text.width / 2), -(text.height / 2), 0);
        pose.translate(0.05, -0.05, 0.476);

        text.renderText(BaseMonitorTile.gatherWorldText(level), pose, source);
        pose.popPose();
    }
}
