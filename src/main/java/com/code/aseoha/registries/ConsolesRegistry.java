package com.code.aseoha.registries;

import com.code.aseoha.aseoha;
import com.code.aseoha.block.ModBlocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.misc.Console;

public class ConsolesRegistry {
    public static final DeferredRegister<Console> CONSOLES = DeferredRegister.create(net.tardis.mod.misc.Console.class, aseoha.MODID);

    public static final RegistryObject<com.code.aseoha.misc.Console> COPPER =
            CONSOLES.register("copper", () -> new com.code.aseoha.misc.Console(() -> ModBlocks.console_copper.get().defaultBlockState(), "copperconsole"));

    public static final RegistryObject<com.code.aseoha.misc.Console> CUSTARD =
            CONSOLES.register("custard", () -> new com.code.aseoha.misc.Console(() -> ModBlocks.console_custard.get().defaultBlockState(), "custardconsole"));

    public static final RegistryObject<com.code.aseoha.misc.Console> BATTLE =
            CONSOLES.register("battle", () -> new com.code.aseoha.misc.Console(() -> ModBlocks.console_battle.get().defaultBlockState(), "battleconsole"));

    public static final RegistryObject<com.code.aseoha.misc.Console> BRACKOLIN =
            CONSOLES.register("brackolin", ()-> new com.code.aseoha.misc.Console(() -> ModBlocks.console_brackolin.get().defaultBlockState(),"brackolinconsole"));

    public static final RegistryObject<com.code.aseoha.misc.Console> BLUEMARBLE =
            CONSOLES.register("bluemarble", ()-> new com.code.aseoha.misc.Console(() -> ModBlocks.console_bluemarble.get().defaultBlockState(),"bluemarble"));

    public static final RegistryObject<com.code.aseoha.misc.Console> HARTNELL =
            CONSOLES.register("hartnell", ()-> new com.code.aseoha.misc.Console(() -> ModBlocks.console_hartnell.get().defaultBlockState(),"hartnell"));

//    public static final RegistryObject<com.code.aseoha.misc.Console> TAKOMAK =
//            CONSOLES.register("takomak", ()-> new com.code.aseoha.misc.Console(() -> ModBlocks.console_takomak.get().defaultBlockState(),"takomakconsole"));
}
