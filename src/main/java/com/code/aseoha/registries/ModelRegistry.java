package com.code.aseoha.registries;

import com.code.aseoha.aseoha;
import com.code.aseoha.block.ModBlocks;
import com.code.aseoha.client.models.interiordoors.CoralInteriorDoor;
import com.code.aseoha.client.renderers.exteriors.CoralRenderer;
import com.code.aseoha.enums.EnumDoorTypes;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
//import net.tardis.mod.client.models.interiordoors.ModernPoliceBoxInteriorModel;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = aseoha.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModelRegistry {
    @SubscribeEvent
    public static void Register(FMLClientSetupEvent event) {
        // Render Stuff
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(ModBlocks.EXTERIOR_CORAL.get(), RenderType.translucent());
        });

        //ClientRegistry
        //Exteriors
        ClientRegistry.bindTileEntityRenderer(AseohaTiles.EXTERIOR_CORAL.get(), CoralRenderer::new);
        EnumDoorTypes.CORAL.setInteriorDoorModel(new CoralInteriorDoor());
//        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_classic_hartnell.get(), Hartnell112Render::new);
//        EnumDoorTypes.HARTNELL.setInteriorDoorModel(new TTCapsuleInteriorModel());
    }

}