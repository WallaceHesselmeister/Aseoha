package com.code.aseoha.registries;

import com.code.aseoha.aseoha;
import com.code.aseoha.block.AseohaBlocks;
import com.code.aseoha.client.models.interiordoors.*;
import com.code.aseoha.client.renderers.exteriors.*;
import com.code.aseoha.enums.EnumDoorTypes;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.tardis.mod.client.models.interiordoors.ModernPoliceBoxInteriorModel;
import net.tardis.mod.client.models.interiordoors.TTCapsuleInteriorModel;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = aseoha.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModelRegistry {
    @SubscribeEvent
    public static void Register(FMLClientSetupEvent event) {
        // Render Stuff
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(AseohaBlocks.EXTERIOR_CORAL.get(), RenderType.translucent());
        });

        //ClientRegistry
        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_CORAL.get(), CoralRenderer::new);
        EnumDoorTypes.CORAL.setInteriorDoorModel(new CoralInteriorDoor());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.exterior_brackolin.get(), BrackolinRender::new);
        EnumDoorTypes.BRACKOLIN.setInteriorDoorModel(new BrackolinInteriorDoor());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_MK2_CAPALDI.get(), mk2_capaldi_render::new);
        EnumDoorTypes.MK2_CAPALDI.setInteriorDoorModel(new ModernPoliceBoxInteriorModel());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_WHITTAKER.get(), WhittakerRender::new);
        EnumDoorTypes.WHITTAKER.setInteriorDoorModel(new ModernPoliceBoxInteriorModel());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_MK2_DAVIDSON.get(), mk2_davidson_render::new);
        EnumDoorTypes.MK2_DAVIDSON.setInteriorDoorModel(new ModernPoliceBoxInteriorModel());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_MK2_HARTNELL.get(), mk2_hartnell_render::new);
        EnumDoorTypes.MK2_HARTNELL.setInteriorDoorModel(new ModernPoliceBoxInteriorModel());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_MK2_MCGANN.get(), mk2_mcgann_render::new);
        EnumDoorTypes.MK2_MCGANN.setInteriorDoorModel(new ModernPoliceBoxInteriorModel());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_MK2_PERTWEE.get(), mk2_pertwee_render::new);
        EnumDoorTypes.MK2_PERTWEE.setInteriorDoorModel(new ModernPoliceBoxInteriorModel());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_MK2_SMITH.get(), mk2_smith_render::new);
        EnumDoorTypes.MK2_SMITH.setInteriorDoorModel(new ModernPoliceBoxInteriorModel());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_MK2_TENNANT.get(), mk2_tennant_render::new);
        EnumDoorTypes.MK2_TENNANT.setInteriorDoorModel(new ModernPoliceBoxInteriorModel());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_MK2_WHITTAKER.get(), mk2_whittaker_render::new);
        EnumDoorTypes.MK2_WHITTAKER.setInteriorDoorModel(new ModernPoliceBoxInteriorModel());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.exterior_bluedoctor.get(), BlueDoctorRender::new);
        EnumDoorTypes.BLUEDOCTOR.setInteriorDoorModel(new BlueDoctorInteriorDoor());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.exterior_olwarrior.get(), OlwarriorRender::new);
        EnumDoorTypes.OLWARRIOR.setInteriorDoorModel(new OlwarriorInteriorDoor());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.exterior_rani.get(), RaniRender::new);
        EnumDoorTypes.RANI.setInteriorDoorModel(new RaniInteriorDoor());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.exterior_wardrobe.get(), WardrobeRender::new);
        EnumDoorTypes.WARDROBE.setInteriorDoorModel(new WardrobeInteriorDoor());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.exterior_classic_hartnell.get(), Hartnell112Render::new);
        EnumDoorTypes.HARTNELL.setInteriorDoorModel(new TTCapsuleInteriorModel());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.exterior_capaldi.get(), CapaldiRender::new);
        EnumDoorTypes.CAPALDI.setInteriorDoorModel(new CapaldiInteriorDoor());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_MCGANN.get(), McGannRender::new);
        EnumDoorTypes.MCGANN.setInteriorDoorModel(new McGannInteriorDoor());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_SUTEKH_TARDIS.get(), SutekhTardisRenderer::new);
        EnumDoorTypes.SUTEKH_TARDIS.setInteriorDoorModel(new ModernPoliceBoxInteriorModel());
    }

}
