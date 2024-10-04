package com.code.aseoha.registries;

import com.code.aseoha.aseoha;
import com.code.aseoha.block.ModBlocks;
import com.code.aseoha.enums.EnumDoorTypes;
import com.code.aseoha.texturevariants.TextureVariants;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.misc.DoorSounds;

public class ExteriorsRegistry {
    public static final DeferredRegister<AbstractExterior> EXTERIORS =
            DeferredRegister.create(AbstractExterior.class, aseoha.MODID);


    public static final RegistryObject<AbstractExterior> CORAL = EXTERIORS.register("coral",
            () -> new TwoBlockBasicExterior(() -> ModBlocks.EXTERIOR_CORAL.get().defaultBlockState(), true, EnumDoorTypes.CORAL, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/coralexterior.png"), TextureVariants.CORAL));

    public static final RegistryObject<AbstractExterior> BRACKOLIN = EXTERIORS.register("brackolin",
            () -> new TwoBlockBasicExterior(() -> ModBlocks.exterior_brackolin.get().defaultBlockState(), true, EnumDoorTypes.BRACKOLIN, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/brackolinexterior.png")));

    public static final RegistryObject<AbstractExterior> WARDROBE = EXTERIORS.register("wardrobe",
            () -> new TwoBlockBasicExterior(() -> ModBlocks.exterior_wardrobe.get().defaultBlockState(), true, EnumDoorTypes.WARDROBE, DoorSounds.WOOD, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/wardrobeexterior.png"), TextureVariants.WARDROBE));

    public static final RegistryObject<AbstractExterior> RANI_NET = EXTERIORS.register("rani",
            () -> new TwoBlockBasicExterior(() -> ModBlocks.exterior_rani.get().defaultBlockState(), true, EnumDoorTypes.RANI, DoorSounds.WOOD, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/raniexterior.png")));

    public static final RegistryObject<AbstractExterior> OLWARRIOR = EXTERIORS.register("olwarrior",
            () -> new TwoBlockBasicExterior(() -> ModBlocks.exterior_olwarrior.get().defaultBlockState(), true, EnumDoorTypes.OLWARRIOR, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/olwarriorexterior.png")));

    public static final RegistryObject<AbstractExterior> BLUEDOCTOR = EXTERIORS.register("bluedoctor",
            () -> new TwoBlockBasicExterior(() -> ModBlocks.exterior_bluedoctor.get().defaultBlockState(), true, EnumDoorTypes.BLUEDOCTOR, DoorSounds.WOOD, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/bluedoctorexterior.png")));

    public static final RegistryObject<AbstractExterior> CLASSIC_HARTNELL = EXTERIORS.register("classic_hartnell",
            () -> new TwoBlockBasicExterior(() -> ModBlocks.exterior_classic_hartnell.get().defaultBlockState(), true, EnumDoorTypes.HARTNELL, DoorSounds.WOOD, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/hartnell.png")));

    public static final RegistryObject<AbstractExterior> CAPALDI = EXTERIORS.register("capaldi",
            () -> new TwoBlockBasicExterior(() -> ModBlocks.exterior_capaldi.get().defaultBlockState(), true, EnumDoorTypes.CAPALDI, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/capaldi.png"), TextureVariants.CAPALDI));

    public static final RegistryObject<AbstractExterior> MCGANN = EXTERIORS.register("mcgann",
            () -> new TwoBlockBasicExterior(() -> ModBlocks.exterior_mcgann.get().defaultBlockState(), true, EnumDoorTypes.CAPALDI, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/mcgann.png"), TextureVariants.MCGANN));

//    public static final RegistryObject<AbstractExterior> STREETSIDE = EXTERIORS.register("streetside",
//            () -> new TwoBlockBasicExterior(() -> ModBlocks.exterior_streetside.get().defaultBlockState(), true, EnumDoorTypes.STREETSIDE, DoorSounds.BASE, new ResourceLocation(aseoha.MODID, "textures/gui/exteriors/streetside.png")));
}
