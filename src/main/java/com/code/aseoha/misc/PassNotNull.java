package com.code.aseoha.misc;

import net.minecraft.client.Minecraft;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.Dimension;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class PassNotNull {
    /**
     * Makes sure the dimension isn't null, if it is it defaults to the Fallback dimension, if the Fallback dimension is also null, returns the overworld
     * @param Dim The dimension to make sure isn't null
     * @param FallBack If the Dimension IS null, default to this Dimension
     * @return A RegitstryKey Dimension
     */
    public static RegistryKey<Dimension> NotNullDimensionRegKey(RegistryKey<Dimension> Dim, RegistryKey<Dimension> FallBack){
        RegistryKey<Dimension> dim;
        if(Dim == null){
            dim = FallBack == null ? Dimension.OVERWORLD : FallBack;
        }
        else dim = Dim;
        return dim;
    }

    /**
     * Makes sure the world isn't null, if it is it defaults to the Fallback dimension, if the Fallback dimension is also null, returns the overworld
     * @param world The world to make sure isn't null
     * @param FallBack If the World IS null, default to this World
     * @return A RegitstryKey World
     */
    public static RegistryKey<World> NotNullWorldRegKey(RegistryKey<World> world, RegistryKey<World> FallBack){
        RegistryKey<World> dim;
        if(world == null){
            dim = FallBack == null ? World.OVERWORLD : FallBack;
        }
        else dim = world;
        return dim;
    }

    /**
     * Makes sure the serverworld isn't null, if it is it defaults to the Fallback serverworld, if the Fallback serverworld is also null, returns the overworld
     * @param world The serverworld to make sure isn't null
     * @param FallBack If the world IS null, default to this serverworld
     * @return A serverworld
     */
    public static ServerWorld NotNullServerWorld(ServerWorld world, ServerWorld FallBack){
        ServerWorld dim;
        if(world == null){
            dim = FallBack == null ? Minecraft.getInstance().level.getServer().getLevel(Minecraft.getInstance().level.dimension() == null ? ServerWorld.OVERWORLD : Minecraft.getInstance().level.dimension()).getLevel() : FallBack;
        }
        else dim = world;
        return dim;
    }
}
