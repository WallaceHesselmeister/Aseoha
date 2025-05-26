package com.code.aseoha.fluid;

import com.code.aseoha.aseoha;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, aseoha.MODID);
    public static final DeferredRegister<Block> FLUID_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, aseoha.MODID);

    public static final RegistryObject<FlowingFluid> LATINUM = register("latinum", LatinumFluid.Source::new);
    public static final RegistryObject<FlowingFluid> LATINUM_FLOWING = register("latinum_flowing", LatinumFluid.Flowing::new);

    public static final RegistryObject<FlowingFluidBlock> LATINUM_BLOCK = FLUID_BLOCKS.register("latinum", () -> new FlowingFluidBlock(LATINUM, Block.Properties.of(Material.WATER)));

    public static <T extends FlowingFluid> RegistryObject<T> register(String name, Supplier<T> fluid) {
        for(FluidState fluidstate : fluid.get().getStateDefinition().getPossibleStates()) {
            Fluid.FLUID_STATE_REGISTRY.add(fluidstate);
        }
        return FLUIDS.register(name, fluid);
    }

    public static void register(IEventBus bus) {
        FLUIDS.register(bus);
        FLUID_BLOCKS.register(bus);
    }
}