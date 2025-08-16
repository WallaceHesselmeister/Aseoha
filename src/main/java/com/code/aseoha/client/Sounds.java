package com.code.aseoha.client;

import com.code.aseoha.aseoha;
import net.minecraft.block.SoundType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Sounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, aseoha.MODID);

    public static final RegistryObject<SoundEvent> AZALEA_BREAK = SOUNDS.register("block_azalea_break", () -> {
        return setupSound("block_azalea_break");
    });
    public static final RegistryObject<SoundEvent> EMPTY = SOUNDS.register("empty", () -> {
        return setupSound("empty");
    });
    public static final RegistryObject<SoundEvent> SMITH_TAKEOFF = SOUNDS.register("smith_takeoff", () -> {
        return setupSound("smith_takeoff");
    });
    public static final RegistryObject<SoundEvent> SMITH_FLIGHT_LOOP = SOUNDS.register("smith_flight_loop", () -> {
        return setupSound("smith_flight_loop");
    });
    public static final RegistryObject<SoundEvent> SMITH_LAND = SOUNDS.register("smith_landing", () -> {
        return setupSound("smith_landing");
    });
    public static final RegistryObject<SoundEvent> THROTTLE_BLAST = SOUNDS.register("throttle_blast", () -> {
        return setupSound("throttle_blast");
    });
    public static final RegistryObject<SoundEvent> AZALEA_FALL = SOUNDS.register("block_azalea_fall", () -> {
        return setupSound("block_azalea_fall");
    });
    public static final RegistryObject<SoundEvent> AZALEA_HIT = SOUNDS.register("block_azalea_hit", () -> {
        return setupSound("block_azalea_hit");
    });

    public static final RegistryObject<SoundEvent> AZALEA_PLACE = SOUNDS.register("block_azalea_place", () -> {
        return setupSound("block_azalea_fall");
    });
    public static final RegistryObject<SoundEvent> AZALEA_STEP = SOUNDS.register("block_azalea_step", () -> {
        return setupSound("block_azalea_step");
    });
    public static final RegistryObject<SoundEvent> AZALEA_LEAVES_BREAK = SOUNDS.register("block_azalea_leaves_break", () -> {
        return setupSound("block_azalea_leaves_break");
    });
    public static final RegistryObject<SoundEvent> AZALEA_LEAVES_FALL = SOUNDS.register("block_azalea_leaves_fall", () -> {
        return setupSound("block_azalea_leaves_fall");
    });
    public static final RegistryObject<SoundEvent> AZALEA_LEAVES_HIT = SOUNDS.register("block_azalea_leaves_hit", () -> {
        return setupSound("block_azalea_leaves_hit");
    });
    public static final RegistryObject<SoundEvent> AZALEA_LEAVES_PLACE = SOUNDS.register("block_azalea_leaves_place", () -> {
        return setupSound("block_azalea_leaves_place");
    });
    public static final RegistryObject<SoundEvent> AZALEA_LEAVES_STEP = SOUNDS.register("block_azalea_leaves_step", () -> {
        return setupSound("block_azalea_leaves_step");
    });
    public static final RegistryObject<SoundEvent> LOW_ARTRON_TAKEOFF = SOUNDS.register("distorted_takeoff", () -> {
        return setupSound("distorted_takeoff");
    });
    public static final RegistryObject<SoundEvent> LOW_ARTRON_LAND = SOUNDS.register("distorted_land", () -> {
        return setupSound("distorted_land");
    });
    public static final RegistryObject<SoundEvent> MAJESTIC_TALE = SOUNDS.register("majestic_tale", () -> {
        return setupSound("majestic_tale");
    });
    public static final RegistryObject<SoundEvent> CYBER_ARMY = SOUNDS.register("cyber_army", () -> {
        return setupSound("cyber_army");
    });
    public static final RegistryObject<SoundEvent> CYBERMEN = SOUNDS.register("cybermen", () -> {
        return setupSound("cybermen");
    });
    public static final RegistryObject<SoundEvent> IDIOT_BOX = SOUNDS.register("idiot_box", () -> {
        return setupSound("idiot_box");
    });

    public static final RegistryObject<SoundEvent> THIS_IS_GALLIFREY = SOUNDS.register("this_is_gallifrey", () -> {
        return setupSound("thisisgallifrey");
    });

    public static final RegistryObject<SoundEvent> WORDS_WIN_WARS = SOUNDS.register("words_win_wars", () -> {
        return setupSound("wordswinwars");
    });

    public static final RegistryObject<SoundEvent> STRANGECREATURE = SOUNDS.register("strangecreature", () -> {
        return setupSound("strangecreatures");
    });

    public static final RegistryObject<SoundEvent> SHEPHERDS_BOY = SOUNDS.register("shepherds_boy", () -> {
        return setupSound("shepherdsboy");
    });

    public static final RegistryObject<SoundEvent> WESTMINSTER = SOUNDS.register("westminster", () -> {
        return setupSound("westminster");
    });

    public static final RegistryObject<SoundEvent> IAMTHEDOCTOR = SOUNDS.register("iamthedoctor", () -> {
        return setupSound("iamthedoctor");
    });

    public static final RegistryObject<SoundEvent> THEMADMAN = SOUNDS.register("themadman", () -> {
        return setupSound("themadman");
    });

    public static final RegistryObject<SoundEvent> MADMANMUSICBOX = SOUNDS.register("madmanmusicbox", () -> {
        return setupSound("madmanmusicbox");
    });


    public static final RegistryObject<SoundEvent> AFFIRMATIVE_MASTER = SOUNDS.register("affirmative_master", () -> {
        return setupSound("affirmative_master");
    });

//    public static final SoundType AZALEA = new SoundType(1.0F, 1.0F, AZALEA_BREAK.get(), AZALEA_STEP.get(), AZALEA_PLACE.get(), AZALEA_HIT.get(), AZALEA_FALL.get());
//

    //AZALEA = new SoundType(1.0F, 1.0F, SoundEvents.AZALEA_BREAK, SoundEvents.AZALEA_STEP, SoundEvents.AZALEA_PLACE, SoundEvents.AZALEA_HIT, SoundEvents.AZALEA_FALL);

    public Sounds() {
    }

    private static SoundEvent setupSound(String soundName) {
        return new SoundEvent(new ResourceLocation("aseoha", soundName));
    }
}
