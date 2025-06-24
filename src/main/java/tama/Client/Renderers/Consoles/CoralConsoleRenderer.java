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
import tama.Client.Models.Consoles.ported.CoralConsoleModel;
import tama.TileEntities.Console.CoralConsoleTile;

public class CoralConsoleRenderer extends ConsoleRenderer<CoralConsoleTile, CoralConsoleModel<CoralConsoleTile>> {

    final WorldText text =
            new WorldText(4.75F / 16.0F, 2.4F / 16.0F).minXScale(0.1F).withColor(0xFFFFFF);

    public CoralConsoleRenderer(
            BlockEntityRendererProvider.Context context,
            CoralConsoleModel<CoralConsoleTile> model,
            ResourceLocation tex) {
        super(context, model, tex);
    }

    @Override
    public void renderAdditionalData(
            ITardisLevel tardis,
            CoralConsoleTile console,
            float partialTicks,
            PoseStack pose,
            MultiBufferSource source,
            int packedLight,
            int packedOverlay,
            IAdditionalConsoleRenderData data) {}

    @Override
    public void renderExtra(
            ITardisLevel level,
            CoralConsoleTile console,
            float partialTicks,
            PoseStack pose,
            MultiBufferSource source,
            int packedLight,
            int packedOverlay) {
        super.renderExtra(level, console, partialTicks, pose, source, packedLight, packedOverlay);

        pose.pushPose();
        model.root().translateAndRotate(pose);
        AnimationHelper.translateToCenter(pose, AnimationHelper.translateTo(pose, model.root(), "glow/monitor_screen"));
        pose.scale(0.6f, 0.6f, 0.6f);
        pose.translate(-(text.width / 2), -(text.height / 2), 0.01);
        text.renderText(BaseMonitorTile.gatherWorldText(level), pose, source);
        pose.popPose();
    }
}
