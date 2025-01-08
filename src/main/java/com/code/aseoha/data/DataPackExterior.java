//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.code.aseoha.data;

import com.code.aseoha.aseoha;
import com.code.aseoha.enums.ExteriorJsonType;
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
import net.tardis.mod.misc.TexVariant;
import org.apache.logging.log4j.Level;

public class DataPackExterior {
    private static final Codec<DataPackExterior> CODEC = RecordCodecBuilder.create((instance) ->
            instance.group(
                    Codec.STRING.orElse("Missing Name").fieldOf("name").forGetter(DataPackExterior::getTranslationKey),
                    ResourceLocation.CODEC.orElse(null).fieldOf("texture").forGetter(DataPackExterior::getTexture),
                    Codec.STRING.orElse("one").fieldOf("exterior_model").forGetter(DataPackExterior::getExteriorType)).apply(instance, DataPackExterior::new));

    public static final DataExteriorCodecListener DATA_LOADER;
    private ResourceLocation registryName;
    private final ResourceLocation texture;
    private final String Exterior_type;
    @Nullable
    private String translationKey;

    public DataPackExterior(String translationKey, ResourceLocation texture, String exterior_type) {
        this.Exterior_type = exterior_type;
        this.texture = texture;
        this.translationKey = String.valueOf(translationKey);
    }


    public static DataPackExterior register(DataPackExterior dataPackExterior, ResourceLocation registryName) {
        DATA_LOADER.getData().put(registryName, dataPackExterior.setRegistryName(registryName));
        aseoha.OneVariants.add(new TexVariant(dataPackExterior.getTexture(), String.valueOf(dataPackExterior.getTranslationKey())));
        if (registryName == null) {
            throw new NullPointerException();
        } else {
            return dataPackExterior;
        }
    }

    private static DataPackExterior register(DataPackExterior dataPackExterior, String registryName) {
        return register(dataPackExterior, new ResourceLocation(aseoha.MODID, registryName));
    }

    public static Map<ResourceLocation, DataPackExterior> registerCoreDataPackExteriors() {
        DATA_LOADER.getData().clear();
        aseoha.LOGGER.log(Level.INFO, "Cleared DataPackExterior Registry!");

        DATA_LOADER.getData().values().forEach((interior) -> {
            aseoha.LOGGER.log(Level.INFO, "Registered core Data Exterior : {}", interior.getRegistryName());
        });
        return DATA_LOADER.getData();
    }

    public static Codec<DataPackExterior> getCodec() {
        return CODEC;
    }

    public static Map<ResourceLocation, DataPackExterior> getRegistry() {
        return DATA_LOADER.getData();
    }

    public JsonElement toJson() {
        return (JsonElement) CODEC.encodeStart(JsonOps.INSTANCE, this).result().get();
    }

    public static void readFromJson(JsonElement json, Consumer<String> logMessageOnBadData, Consumer<DataPackExterior> onGoodData) {
        CODEC.parse(JsonOps.INSTANCE, json).resultOrPartial(logMessageOnBadData).ifPresent(onGoodData);
    }

    public ExteriorJsonType GetExteriorType(){
        return ExteriorJsonType.GetFromJSON(this.Exterior_type);
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

    public DataPackExterior setRegistryName(ResourceLocation name) {
        this.registryName = name;
        return this;
    }

    public ResourceLocation getTexture() {
        return this.texture;
    }

    public String getTranslationKey() {
        if (this.translationKey == null) {
            this.translationKey = Util.makeDescriptionId("variants", this.getRegistryName());
        }

        return this.translationKey;
    }

    public TranslationTextComponent getDisplayName() {
        return new TranslationTextComponent(String.valueOf(this.getTranslationKey()));
    }

    public String getExteriorType() {
        return this.Exterior_type;
    }

    static {
        DATA_LOADER = new DataExteriorCodecListener("exterior_variants", CODEC, aseoha.LOGGER);
    }
}