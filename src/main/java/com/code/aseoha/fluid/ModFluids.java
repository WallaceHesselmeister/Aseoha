package com.code.aseoha.fluid;

import com.code.aseoha.aseoha;
import com.code.aseoha.items.AseohaItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tadditions.mod.blocks.ModBlocks;
import net.tadditions.mod.items.ModItems;


public class ModFluids {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");


    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, aseoha.MODID);


    public static final RegistryObject<FlowingFluid> LATINUM_FLUID
            = FLUIDS.register("latinum_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.LATINUM_PROPERTIES));

    public static final RegistryObject<FlowingFluid> LATINUM_FLOWING
            = FLUIDS.register("latinum_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.LATINUM_PROPERTIES));


    public static final ForgeFlowingFluid.Properties LATINUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LATINUM_FLUID.get(), () -> LATINUM_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0xffAAffff)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.LATINUM_BLOCK.get()).bucket(() -> AseohaItems.LATINUM_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> LATINUM_BLOCK = ModBlocks.BLOCKS.register("latinum",
            () -> new FlowingFluidBlock(() -> ModFluids.LATINUM_FLUID.get(), AbstractBlock.Properties.of(Material.WATER)
                    .strength(100f).noDrops()));


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }


}
