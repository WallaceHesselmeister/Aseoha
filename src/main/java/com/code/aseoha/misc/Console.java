package com.code.aseoha.misc;

import com.code.aseoha.aseoha;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;

import java.util.function.Supplier;

//
//import net.minecraft.block.BlockState;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.util.Util;
//import net.minecraft.util.text.TranslationTextComponent;
//import net.minecraftforge.registries.ForgeRegistryEntry;
//
//import java.util.function.Supplier;
//
//public class Console extends ForgeRegistryEntry<Console> {
//    private String translationKey;
//    private ResourceLocation imageLocation;
//    private Supplier<BlockState> state;
//
//    public Console(Supplier<BlockState> state, ResourceLocation imageLocation) {
//        this.state = state;
//        this.imageLocation = imageLocation;
//    }
//
//    public Console(Supplier<BlockState> state, String imageLocation) {
//        this(state, new ResourceLocation("aseoha", "textures/gui/consoles/" + imageLocation + ".png"));
//    }
//
//    public BlockState getState() {
//        return (BlockState)this.state.get();
//    }
//
//    public ResourceLocation getPreviewTexture() {
//        return this.imageLocation;
//    }
//
//    public String getTranslationKey() {
//        if (this.translationKey == null) {
//            this.translationKey = Util.makeDescriptionId("console", this.getRegistryName());
//        }
//
//        return this.translationKey;
//    }
//
//    public TranslationTextComponent getDisplayName() {
//        return new TranslationTextComponent(this.getTranslationKey());
//    }
//}
public class Console extends net.tardis.mod.misc.Console{
    private ResourceLocation registryName;
    private ResourceLocation imageLocation;
    private Supplier<BlockState> state;

    @Override
    public ResourceLocation getPreviewTexture(){return this.imageLocation;}

    public Console(Supplier<BlockState> state, String imageLocation){this(state, new ResourceLocation(aseoha.MODID,"textures/gui/consoles/" + imageLocation + ".png"));}

    public Console(Supplier<BlockState> state, ResourceLocation imageLocation) {
        super(state, imageLocation);
        this.state = state;
        this.imageLocation = imageLocation;
    }
}
