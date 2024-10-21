package com.code.aseoha.registries;

import com.code.aseoha.aseoha;
import com.code.aseoha.block.AseohaBlocks;
import com.code.aseoha.enums.EnumDoorTypes;
import com.code.aseoha.texturevariants.TextureVariants;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.misc.DoorSounds;

public class ExteriorsRegistry {
    public static final DeferredRegister<AbstractExterior> EXTERIORS =
            DeferredRegister.create(AbstractExterior.class, aseoha.MODID);


    public static final RegistryObject<AbstractExterior> CORAL = EXTERIORS.register("coral",
            () -> new TwoBlockBasicExterior(() -> AseohaBlocks.EXTERIOR_CORAL.get().defaultBlockState(), false, EnumDoorTypes.CORAL, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/coralexterior.png"), TextureVariants.CORAL));

    public static final RegistryObject<AbstractExterior> BRACKOLIN = EXTERIORS.register("brackolin",
            () -> new TwoBlockBasicExterior(() -> AseohaBlocks.exterior_brackolin.get().defaultBlockState(), false, EnumDoorTypes.BRACKOLIN, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/brackolinexterior.png")));

    public static final RegistryObject<AbstractExterior> WARDROBE = EXTERIORS.register("wardrobe",
            () -> new TwoBlockBasicExterior(() -> AseohaBlocks.exterior_wardrobe.get().defaultBlockState(), false, EnumDoorTypes.WARDROBE, DoorSounds.WOOD, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/wardrobeexterior.png"), TextureVariants.WARDROBE));

    public static final RegistryObject<AbstractExterior> RANI_NET = EXTERIORS.register("rani",
            () -> new TwoBlockBasicExterior(() -> AseohaBlocks.exterior_rani.get().defaultBlockState(), false, EnumDoorTypes.RANI, DoorSounds.WOOD, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/raniexterior.png")));

    public static final RegistryObject<AbstractExterior> OLWARRIOR = EXTERIORS.register("olwarrior",
            () -> new TwoBlockBasicExterior(() -> AseohaBlocks.exterior_olwarrior.get().defaultBlockState(), false, EnumDoorTypes.OLWARRIOR, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/olwarriorexterior.png")));

    public static final RegistryObject<AbstractExterior> BLUEDOCTOR = EXTERIORS.register("bluedoctor",
            () -> new TwoBlockBasicExterior(() -> AseohaBlocks.exterior_bluedoctor.get().defaultBlockState(), false, EnumDoorTypes.BLUEDOCTOR, DoorSounds.WOOD, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/bluedoctorexterior.png")));

    public static final RegistryObject<AbstractExterior> CLASSIC_HARTNELL = EXTERIORS.register("classic_hartnell",
            () -> new TwoBlockBasicExterior(() -> AseohaBlocks.exterior_classic_hartnell.get().defaultBlockState(), false, EnumDoorTypes.HARTNELL, DoorSounds.WOOD, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/hartnell.png")));

    public static final RegistryObject<AbstractExterior> CAPALDI = EXTERIORS.register("capaldi",
            () -> new TwoBlockBasicExterior(() -> AseohaBlocks.exterior_capaldi.get().defaultBlockState(), false, EnumDoorTypes.CAPALDI, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/capaldi.png"), TextureVariants.CAPALDI));

    public static final RegistryObject<AbstractExterior> MCGANN = EXTERIORS.register("mcgann",
            () -> new TwoBlockBasicExterior(() -> AseohaBlocks.exterior_mcgann.get().defaultBlockState(), false, EnumDoorTypes.CAPALDI, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/mcgann.png"), TextureVariants.MCGANN));

//    public static final RegistryObject<AbstractExterior> STREETSIDE = EXTERIORS.register("streetside",
//            () -> new TwoBlockBasicExterior(() -> ModBlocks.exterior_streetside.get().defaultBlockState(), false, EnumDoorTypes.STREETSIDE, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/streetside.png")));
}
