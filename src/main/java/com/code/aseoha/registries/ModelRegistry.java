package com.code.aseoha.registries;

import com.code.aseoha.aseoha;
import com.code.aseoha.block.ModBlocks;
import com.code.aseoha.client.models.interiordoors.*;
import com.code.aseoha.client.renderers.blocks.TardisCoralRenderer;
import com.code.aseoha.client.renderers.blocks.UpsideDownEngineRenderer;
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
import net.tardis.mod.client.models.interiordoors.TTCapsuleInteriorModel;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = aseoha.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModelRegistry {
    @SubscribeEvent
    public static void Register(FMLClientSetupEvent event) {
        // Render Stuff
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(ModBlocks.EXTERIOR_CORAL.get(), RenderType.translucent());
        });

        //ClientRegistry
        ClientRegistry.bindTileEntityRenderer(AseohaTiles.TARDIS_CORAL.get(), TardisCoralRenderer::new);
//        ClientRegistry.bindTileEntityRenderer(AseohaTiles.UPSIDEDOWN_ENGINE.get(), UpsideDownEngineRenderer::new);
        //Exteriors
        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_CORAL.get(), CoralRenderer::new);
        EnumDoorTypes.CORAL.setInteriorDoorModel(new CoralInteriorDoor());

        ClientRegistry.bindTileEntityRenderer(AseohaTiles.exterior_brackolin.get(), BrackolinRender::new);
        EnumDoorTypes.BRACKOLIN.setInteriorDoorModel(new BrackolinInteriorDoor());

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
        EnumDoorTypes.CAPALDI.setInteriorDoorModel(new CapaldiInteriorDoor());


    }

}
