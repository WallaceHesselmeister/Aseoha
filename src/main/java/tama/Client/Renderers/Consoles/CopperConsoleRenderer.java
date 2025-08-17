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
import tama.Client.Models.Consoles.CopperConsoleModel;
import tama.TileEntities.Console.CopperConsoleTile;

public class CopperConsoleRenderer extends ConsoleRenderer<CopperConsoleTile, CopperConsoleModel<CopperConsoleTile>> {

    final WorldText text =
            new WorldText(4.75F / 16.0F, 2.4F / 16.0F).minXScale(0.1F).withColor(0xFFFFFF);

    public CopperConsoleRenderer(
            BlockEntityRendererProvider.Context context,
            CopperConsoleModel<CopperConsoleTile> model,
            ResourceLocation tex) {
        super(context, model, tex);
    }

    @Override
    public void renderAdditionalData(
            ITardisLevel tardis,
            CopperConsoleTile console,
            float partialTicks,
            PoseStack pose,
            MultiBufferSource source,
            int packedLight,
            int packedOverlay,
            IAdditionalConsoleRenderData data) {
    }

    @Override
    public void renderExtra(
            ITardisLevel level,
            CopperConsoleTile console,
            float partialTicks,
            PoseStack pose,
            MultiBufferSource source,
            int packedLight,
            int packedOverlay) {
        super.renderExtra(level, console, partialTicks, pose, source, packedLight, packedOverlay);

        pose.pushPose();
        model.root().translateAndRotate(pose);
        AnimationHelper.translateToCenter(
                pose, AnimationHelper.translateTo(pose, model.root(), "base/monitor/bone140_r1/screen"));
        pose.scale(3.5f, 3.5f, 3.5f);
        pose.translate((-text.width / 4) + 0.01f, (-text.height / 4), 0.003);
//        pose.translate(-text.width / 4, 0, 0);
        text.renderText(BaseMonitorTile.gatherWorldText(level), pose, source);
        pose.popPose();
    }
}