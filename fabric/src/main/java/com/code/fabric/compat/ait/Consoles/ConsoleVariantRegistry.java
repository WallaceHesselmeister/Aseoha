//package com.code.fabric.compat.ait.Consoles;
//
//import com.mojang.serialization.Codec;
//import loqor.ait.data.datapack.DatapackConsole;
//import loqor.ait.data.schema.console.ConsoleVariantSchema;
//import loqor.ait.registry.unlockable.UnlockableRegistry;
//import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
//import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
//import net.minecraft.network.FriendlyByteBuf;
//import net.minecraft.server.level.ServerPlayer;
//import net.minecraft.server.packs.resources.ResourceManager;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import static loqor.ait.registry.impl.console.variant.ConsoleVariantRegistry.registerStatic;
//
//public class ConsoleVariantRegistry extends UnlockableRegistry<ConsoleVariantSchema> {
//    private static loqor.ait.registry.impl.console.variant.ConsoleVariantRegistry INSTANCE;
//    public static ConsoleVariantSchema CUSTARD;
//
//    protected ConsoleVariantRegistry() {
//        super(DatapackConsole::fromInputStream, (Codec) null, "console_variants", "console", true);
//    }
//
//    @Override
//    public ConsoleVariantSchema fallback() { return null; }
//
////    public static ConsoleVariantSchema registerStatic(ConsoleVariantSchema schema) {
////        return (ConsoleVariantSchema) getInstance().register(schema);
////    }
////
////    public ConsoleVariantSchema fallback() {
////        return null;
////    }
////
////    public void syncToClient(ServerPlayer player) {
////        FriendlyByteBuf buf = PacketByteBufs.create();
////        buf.writeInt(this.REGISTRY.size());
////        Iterator var3 = this.REGISTRY.values().iterator();
////
////        while (var3.hasNext()) {
////            ConsoleVariantSchema schema = (ConsoleVariantSchema) var3.next();
////            if (schema instanceof DatapackConsole variant) {
////                buf.writeJsonWithCodec(DatapackConsole.CODEC, variant);
////            } else {
////                buf.writeJsonWithCodec(DatapackConsole.CODEC, new DatapackConsole(schema.id(), schema.parent().id(), DatapackExterior.DEFAULT_TEXTURE, DatapackExterior.DEFAULT_TEXTURE, false));
////            }
////        }
////
////        ServerPlayNetworking.send(player, this.packet, buf);
////    }
//
////    public void readFromServer(FriendlyByteBuf buf) {
////        FriendlyByteBuf copy = PacketByteBufs.copy(buf);
////        ClientConsoleVariantRegistry.getInstance().readFromServer(copy);
////        this.REGISTRY.clear();
////        this.defaults();
////        int size = buf.readInt();
////
////        for (int i = 0; i < size; ++i) {
////            DatapackConsole variant = (DatapackConsole) buf.readJsonWithCodec(DatapackConsole.CODEC);
////            if (variant.wasDatapack()) {
////                this.register(variant);
////            }
////        }
////
////        AITMod.LOGGER.info("Read {} console variants from server", size);
////    }
//
////    public static loqor.ait.registry.impl.console.variant.ConsoleVariantRegistry getInstance() {
////        if (INSTANCE == null) {
////            AITMod.LOGGER.debug("ConsoleVariantRegistry was not initialized, Creating a new instance");
////            INSTANCE = new loqor.ait.registry.impl.console.variant.ConsoleVariantRegistry();
////        }
////
////        return INSTANCE;
////    }
//
////    public static List<ConsoleVariantSchema> withParent(ConsoleTypeSchema parent) {
////        List<ConsoleVariantSchema> list = new ArrayList();
////        Iterator var2 = getInstance().REGISTRY.values().iterator();
////
////        while (var2.hasNext()) {
////            ConsoleVariantSchema schema = (ConsoleVariantSchema) var2.next();
////            if (schema.parent().equals(parent)) {
////                list.add(schema);
////            }
////        }
////
////        return list;
////    }
//
//    protected void defaults() {
//        CUSTARD = registerStatic(new CustardVariant());
//    }
//
//    @Override
//    public void onResourceManagerReload(ResourceManager resourceManager) {
//
//    }
//}