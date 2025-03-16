//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.code.aseoha.data;

import com.code.aseoha.Helpers.MiscHelper;
import com.code.aseoha.WorkBench.WorkBenchRecipe;
import com.code.aseoha.aseoha;
import com.code.aseoha.misc.VortexVariant;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import lombok.Getter;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.Level;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.function.Consumer;

public class DataPackWorkbenchRecipe {
    private static final Codec<DataPackWorkbenchRecipe> CODEC = RecordCodecBuilder.create((instance) ->
            instance.group(
                    ResourceLocation.CODEC.orElse(new ResourceLocation("air")).fieldOf("1").forGetter(DataPackWorkbenchRecipe::getSlot1),
                    ResourceLocation.CODEC.orElse(new ResourceLocation("air")).fieldOf("2").forGetter(DataPackWorkbenchRecipe::getSlot2),
                    ResourceLocation.CODEC.orElse(new ResourceLocation("air")).fieldOf("3").forGetter(DataPackWorkbenchRecipe::getSlot3),
                    ResourceLocation.CODEC.orElse(new ResourceLocation("air")).fieldOf("4").forGetter(DataPackWorkbenchRecipe::getSlot4),
                    ResourceLocation.CODEC.orElse(new ResourceLocation("air")).fieldOf("result").forGetter(DataPackWorkbenchRecipe::getResult)).apply(instance, DataPackWorkbenchRecipe::new));

    public static final DataWorkbenchRecipeCodecListener DATA_LOADER;
    private ResourceLocation registryName;
    @Getter
    private final ResourceLocation slot1;
    @Getter
    private final ResourceLocation slot2;
    @Getter
    private final ResourceLocation slot3;
    @Getter
    private final ResourceLocation slot4;
    @Getter
    private final ResourceLocation result;
    @Nullable
    private String translationKey;

    public DataPackWorkbenchRecipe(ResourceLocation slot1, ResourceLocation slot2, ResourceLocation slot3, ResourceLocation slot4, ResourceLocation result) {
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
        this.result = result;
    }


    public static DataPackWorkbenchRecipe register(DataPackWorkbenchRecipe dataPackRecipe, ResourceLocation registryName) {
        DATA_LOADER.getData().put(registryName, dataPackRecipe.setRegistryName(registryName));

//        Item slot1 = MiscHelper.getItemFromResourceLocation(dataPackRecipe.getSlot1());
//        Item slot2 = MiscHelper.getItemFromResourceLocation(dataPackRecipe.getSlot2());
//        Item slot3 = MiscHelper.getItemFromResourceLocation(dataPackRecipe.getSlot3());
//        Item slot4 = MiscHelper.getItemFromResourceLocation(dataPackRecipe.getSlot4());
//        Item result = MiscHelper.getItemFromResourceLocation(dataPackRecipe.getResult());
//        WorkBenchRecipe recipe = new WorkBenchRecipe(
//            slot1,
//                slot2,
//                slot3,
//                slot4,
//                result
//        );

        if (registryName == null) {
            throw new NullPointerException();
        } else {
            return dataPackRecipe;
        }
    }

    private static DataPackWorkbenchRecipe register(DataPackWorkbenchRecipe dataPackExterior, String registryName) {
        return register(dataPackExterior, new ResourceLocation(aseoha.MODID, registryName));
    }

    public static Map<ResourceLocation, DataPackWorkbenchRecipe> registerCoreDataPackExteriors() {
        DATA_LOADER.getData().clear();
        aseoha.LOGGER.log(Level.INFO, "Cleared DataPackExterior Registry!");

        DATA_LOADER.getData().values().forEach((interior) -> {
            aseoha.LOGGER.log(Level.INFO, "Registered core Data Exterior : {}", interior.getRegistryName());
        });
        return DATA_LOADER.getData();
    }

    public static Codec<DataPackWorkbenchRecipe> getCodec() {
        return CODEC;
    }

    public static Map<ResourceLocation, DataPackWorkbenchRecipe> getRegistry() {
        return DATA_LOADER.getData();
    }

    public JsonElement toJson() {
        return (JsonElement) CODEC.encodeStart(JsonOps.INSTANCE, this).result().get();
    }

    public static void readFromJson(JsonElement json, Consumer<String> logMessageOnBadData, Consumer<DataPackWorkbenchRecipe> onGoodData) {
        CODEC.parse(JsonOps.INSTANCE, json).resultOrPartial(logMessageOnBadData).ifPresent(onGoodData);
    }

//    public CompoundNBT serialize() {
//        CompoundNBT tag = new CompoundNBT();
//        DataResult var10000 = CODEC.encodeStart(NBTDynamicOps.INSTANCE, this);
//        Logger var10001 = Tardis.LOGGER;
//        var10001.getClass();
//        var10000.resultOrPartial(var10001::error).ifPresent((data) -> {
//            tag.put("console_room", data);
//        });
//        return tag;
//    }
//
//    public static DataPackExterior deserialize(CompoundNBT tag) {
//        DataResult var10000 = CODEC.parse(new Dynamic(NBTDynamicOps.INSTANCE));
//        Logger var10001 = Tardis.LOGGER;
//        var10001.getClass();
//        DataPackExterior interior = (DataPackExterior)var10000.resultOrPartial(var10001::error).get();
//        return interior;
//    }

    public ResourceLocation getRegistryName() {
        return this.registryName;
    }

    public DataPackWorkbenchRecipe setRegistryName(ResourceLocation name) {
        this.registryName = name;
        return this;
    }

    static {
        DATA_LOADER = new DataWorkbenchRecipeCodecListener("workbench", CODEC, aseoha.LOGGER);
    }
}