//package com.code.fabric.compat.ait;
//
//
//import com.code.fabric.compat.ait.Consoles.CustardType;
////import loqor.ait.core.data.schema.console.ConsoleTypeSchema;
//import loqor.ait.data.schema.console.ConsoleTypeSchema;
//import loqor.ait.registry.impl.console.ConsoleRegistry;
//import net.minecraft.core.MappedRegistry;
//import net.minecraft.core.Registry;
//
//public class AITConsoleRegistry {
//    public static final MappedRegistry<ConsoleTypeSchema> REGISTRY = ConsoleRegistry.REGISTRY;//(MappedRegistry)FabricRegistryBuilder.createSimple(ResourceKey.createRegistryKey(new ResourceLocation("ait", "console"))).buildAndRegister();
////    public static ConsoleTypeSchema CORAL;
////    public static ConsoleTypeSchema HARTNELL;
////    public static ConsoleTypeSchema COPPER;
////    public static ConsoleTypeSchema TOYOTA;
////    public static ConsoleTypeSchema ALNICO;
////    public static ConsoleTypeSchema STEAM;
////    public static ConsoleTypeSchema HUDOLIN;
//    public static ConsoleTypeSchema CUSTARD;
//    public AITConsoleRegistry() {
//    }
//
//    public static ConsoleTypeSchema register(ConsoleTypeSchema schema) {
//        return (ConsoleTypeSchema)Registry.register(REGISTRY, schema.id(), schema);
//    }
//
//    public static void init() {
//        CUSTARD = register(new CustardType());
////        HARTNELL = register(new HartnellType());
////        CORAL = register(new CoralType());
////        TOYOTA = register(new ToyotaType());
////        ALNICO = register(new AlnicoType());
////        STEAM = register(new SteamType());
//    }
//}
