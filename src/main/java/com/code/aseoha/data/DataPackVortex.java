//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.code.aseoha.data;

import com.code.aseoha.aseoha;
import com.code.aseoha.misc.VortexVariant;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.Level;

public class DataPackVortex {
    private static final Codec<DataPackVortex> CODEC = RecordCodecBuilder.create((instance) ->
            instance.group(
                    Codec.STRING.orElse("Missing Name").fieldOf("name").forGetter(DataPackVortex::getTranslationKey),
                    ResourceLocation.CODEC.orElse(null).fieldOf("texture").forGetter(DataPackVortex::getTexture)).apply(instance, DataPackVortex::new));

    public static final DataVortexCodecListener DATA_LOADER;
    private ResourceLocation registryName;
    private final ResourceLocation texture;
    @Nullable
    private String translationKey;

    public DataPackVortex(String translationKey, ResourceLocation texture) {
        this.texture = texture;
        this.translationKey = String.valueOf(translationKey);
    }


    public static DataPackVortex register(DataPackVortex dataPackExterior, ResourceLocation registryName) {
        DATA_LOADER.getData().put(registryName, dataPackExterior.setRegistryName(registryName));

        VortexVariant vortexVariant = new VortexVariant(dataPackExterior.getTexture(), String.valueOf(dataPackExterior.getTranslationKey()));
        if(aseoha.VortexVariants.contains(vortexVariant))
            aseoha.VortexVariants.add(vortexVariant);

        if (registryName == null) {
            throw new NullPointerException();
        } else {
            return dataPackExterior;
        }
    }

    private static DataPackVortex register(DataPackVortex dataPackExterior, String registryName) {
        return register(dataPackExterior, new ResourceLocation(aseoha.MODID, registryName));
    }

    public static Map<ResourceLocation, DataPackVortex> registerCoreDataPackExteriors() {
        DATA_LOADER.getData().clear();
        aseoha.LOGGER.log(Level.INFO, "Cleared DataPackExterior Registry!");

        DATA_LOADER.getData().values().forEach((interior) -> {
            aseoha.LOGGER.log(Level.INFO, "Registered core Data Exterior : {}", interior.getRegistryName());
        });
        return DATA_LOADER.getData();
    }

    public static Codec<DataPackVortex> getCodec() {
        return CODEC;
    }

    public static Map<ResourceLocation, DataPackVortex> getRegistry() {
        return DATA_LOADER.getData();
    }

    public JsonElement toJson() {
        return (JsonElement) CODEC.encodeStart(JsonOps.INSTANCE, this).result().get();
    }

    public static void readFromJson(JsonElement json, Consumer<String> logMessageOnBadData, Consumer<DataPackVortex> onGoodData) {
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

    public DataPackVortex setRegistryName(ResourceLocation name) {
        this.registryName = name;
        return this;
    }

    public ResourceLocation getTexture() {
        return this.texture;
    }

    public String getTranslationKey() {
        if (this.translationKey == null) {
            this.translationKey = Util.makeDescriptionId("vortex", this.getRegistryName());
        }

        return this.translationKey;
    }

    public TranslationTextComponent getDisplayName() {
        return new TranslationTextComponent(String.valueOf(this.getTranslationKey()));
    }

    static {
        DATA_LOADER = new DataVortexCodecListener("vortex", CODEC, aseoha.LOGGER);
    }
}