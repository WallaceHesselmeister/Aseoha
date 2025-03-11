package com.code.aseoha.common;

import loqor.ait.tardis.control.sequences.Sequence;
import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.SimpleRegistry;
import net.minecraft.util.Identifier;

public class Registry {
    public static final SimpleRegistry REGISTRY = FabricRegistryBuilder.createSimple(RegistryKey.ofRegistry(new Identifier("aseoha", "sequence"))).buildAndRegister();

}
