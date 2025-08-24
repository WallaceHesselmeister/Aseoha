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
import net.tardis.mod.client.models.consoles.SteamConsoleModel;
import net.tardis.mod.client.renderers.WorldText;
import net.tardis.mod.client.renderers.consoles.ConsoleRenderer;
import tama.Client.Models.Consoles.CopperConsoleModel;
import tama.Client.Models.Consoles.ModelSteamConsole;
import tama.TileEntities.Console.CopperConsoleTile;
import tama.TileEntities.Console.SteamConsoleTile;

public class SteamConsoleRenderer extends ConsoleRenderer<SteamConsoleTile, ModelSteamConsole<SteamConsoleTile>> {

    public SteamConsoleRenderer(
            BlockEntityRendererProvider.Context context,
            ModelSteamConsole<SteamConsoleTile> model,
            ResourceLocation tex) {
        super(context, model, tex);
    }

    @Override
    public void renderAdditionalData(
            ITardisLevel tardis,
            SteamConsoleTile console,
            float partialTicks,
            PoseStack pose,
            MultiBufferSource source,
            int packedLight,
            int packedOverlay,
            IAdditionalConsoleRenderData data) {}

    @Override
    public void renderExtra(
            ITardisLevel level,
            SteamConsoleTile console,
            float partialTicks,
            PoseStack pose,
            MultiBufferSource source,
            int packedLight,
            int packedOverlay) {
        super.renderExtra(level, console, partialTicks, pose, source, packedLight, packedOverlay);
    }
}
