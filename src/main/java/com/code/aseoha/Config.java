package com.code.aseoha;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.NotNull;

public class Config {
    public static final Common COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;
    public static final Server SERVER;
    public static final ForgeConfigSpec SERVER_SPEC;

    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON = specPair.getLeft();
        COMMON_SPEC = specPair.getRight();
        final Pair<Server, ForgeConfigSpec> specServerPair = new ForgeConfigSpec.Builder().configure(Server::new);
        SERVER = specServerPair.getLeft();
        SERVER_SPEC = specServerPair.getRight();
    }

    public static class Server {
        //        public ForgeConfigSpec.ConfigValue<Boolean> SummonTARDISinTARDIS;
        public ForgeConfigSpec.ConfigValue<Integer> K9PowerDrainRate;
        public ForgeConfigSpec.ConfigValue<Boolean> DebugMode;
        public ForgeConfigSpec.ConfigValue<Integer> EOHMaxFETransfer;
        public ForgeConfigSpec.ConfigValue<Integer> HADSDuration;

        public ForgeConfigSpec.ConfigValue<Integer> generator_capacity;
        public ForgeConfigSpec.ConfigValue<Integer> generator_usage;
        public ForgeConfigSpec.ConfigValue<Integer> generator_charge;
        public ForgeConfigSpec.ConfigValue<Integer> charger_capacity;
        public ForgeConfigSpec.ConfigValue<Integer> charger_usage;
        public ForgeConfigSpec.ConfigValue<Integer> charger_charge;
        public ForgeConfigSpec.ConfigValue<Integer> converter_capacity;
        public ForgeConfigSpec.ConfigValue<Integer> converter_generation;
        public ForgeConfigSpec.ConfigValue<Float> charger_max_artron;
        public ForgeConfigSpec.ConfigValue<Float> charger_rate;

        public Server(ForgeConfigSpec.Builder builder) {

//            SummonTARDISinTARDIS = builder.comment("Changes whether you can summon a TARDIS inside another TARDIS with the stattenhiem remote, true/false")
//                    .translation("Config.tardisintardis").define("SummonTARDISinTARDIS", true);

            builder.push("Numbers");

            K9PowerDrainRate = builder
                    .comment("Changes Power Drain rate of K-9, measured in seconds, 0 - 2147483647\nThis will set how many seconds it takes to drain 1% of K9's battery, default is 25")
                    .translation("Config.k9.power_rate")
                    .defineInRange("K9PowerDrainRate", 25, 0, Integer.MAX_VALUE);

            EOHMaxFETransfer = builder
                    .comment("Sets the maximum amount of FE that the Eye Of Harmony can provide (Doesn't work don't bother)")
                    .translation("Config.eoh.max_rate")
                    .defineInRange("EOHMaxFETransfer", 1000, 0, Integer.MAX_VALUE);

            builder.pop();

            DebugMode = builder
                    .comment("Enables/Disable Debug Mode, all this does is output a ton of potentially useful data to the console and log file")
                    .translation("Config.debug_mode")
                    .define("DebugMode", false);

            HADSDuration = builder
                    .comment("How long the TARDIS should stay in flight before landing when HADS is triggered in ticks(1 second is 20 ticks, the default is 10 minutes or 12000 ticks)")
                    .translation("Config.hads.time")
                    .defineInRange("HADSDuration", 1200, 0, Integer.MAX_VALUE);

            builder.push("Electric Artron Generator");

            generator_capacity = builder
                    .comment("How much energy the Electric Artron Generator can store.")
                    .define("Artron Generator Buffer", 90000);
            // This is how much regular energy (like Redstone Flux) it takes to create one unit of Artron energy.
            generator_usage = builder
                    .comment("How much energy (I.E Redstone Flux RF/Forge Energy FE) the Generator uses to make one Artron Unit.")
                    .define("FE to AU rate", 26000);
            // This is how fast the Generator can recharge its energy each game tick (1/20th of a second).
            generator_charge = builder
                    .comment("How much energy the Generator can pull in per tick to recharge.")
                    .define("Artron Generator Charge Rate", 3800);
            builder.pop();

            builder.push("Artron Converter");
            // This Artron Converter holds energy to convert Artron Units into regular energy.
            converter_capacity = builder
                    .comment("How much energy the Artron Converter can store.")
                    .define("Artron Converter Buffer", 90000);
            // This is how much regular energy you get from one Artron Unit.
            converter_generation = builder
                    .comment("How much energy you get from converting one Artron Unit.")
                    .define("AU to FE rate", 900);
            builder.pop();

            builder.push("Electric Artron Charger");
            // This controls how fast batteries can charge with Artron Units every second.
            charger_rate = builder
                    .comment("How many Artron Units batteries can charge per second.")
                    .define("Artron Charger Charge Rate", 3.8F);
            // This is how much energy the Charger can hold to do its job.
            charger_capacity = builder
                    .comment("How much energy the Artron Charger can store.")
                    .define("Artron Charger Buffer", 90000);
            // This is how much regular energy it takes to make one Artron Unit in the Charger.
            charger_usage = builder
                    .comment("How much energy the Charger needs to create one Artron Unit.")
                    .define("FE to AU rate", 26000);
            // This is how fast the Charger can refill its own energy each tick.
            charger_charge = builder
                    .comment("How much energy the Charger can pull in per tick to refill itself.")
                    .define("Artron Charger Refill Rate", 3800);
            // This is how many Artron Units the Charger can store at once.
            charger_max_artron = builder
                    .comment("How many Artron Units the Charger can hold at one time.")
                    .define("Artron Charger AU Buffer", 230F);
            builder.pop();
        }
    }

    public static class Common {
        public ForgeConfigSpec.ConfigValue<Integer> PowerFaultRarity;
        public ForgeConfigSpec.ConfigValue<Integer> TakingOverRarity;
        public ForgeConfigSpec.ConfigValue<Boolean> DebugMode;
        public ForgeConfigSpec.ConfigValue<Boolean> ShouldAmbientSoundsPlay;
        public ForgeConfigSpec.ConfigValue<Boolean> ShouldOpenGUIInFlight;


        public Common(@NotNull ForgeConfigSpec.Builder builder) {
            PowerFaultRarity = builder
                    .comment("Changes the rarity of the Power Fault, 0 - 100")
                    .translation("Config.rarity.powerfault")
                    .defineInRange("PowerFaultRarity", 25, 0, 100);

            TakingOverRarity = builder
                    .comment("Changes the rarity of the TARDIS Taking Over event, 0 - 100")
                    .translation("Config.rarity.takingover")
                    .defineInRange("TakingOverRarity", 15, 0, 100);

            DebugMode = builder
                    .comment("Enables/Disable Debug Mode, all this does is output a ton of potentially useful data to the console and log file")
                    .translation("Config.debug_mode")
                    .define("DebugMode", false);

            ShouldAmbientSoundsPlay = builder
                    .comment("Enables/Disables Creaking sounds inside TARDISs")
                    .translation("Config.tardis.creak.ambient.sounds")
                    .define("ShouldAmbientSoundsPlay", true);

            ShouldOpenGUIInFlight = builder
                    .comment("If false, GUI's such as the monitor, telepathic circuits, and the communicator will not be openable while the console is in-flight, NOTE: This only goes for GUI's opened via console controls, it won't do anything against GUI's from blocks, I.E The monitor block/ARS egg block")
                    .translation("Config.tardis.creak.ambient.sounds")
                    .define("ShouldAmbientSoundsPlay", true);
        }


    }
}