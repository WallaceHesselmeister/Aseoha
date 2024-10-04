package com.code.aseoha;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.system.CallbackI;

public class config {
    public static final config.Common COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;
    public static final config.Server SERVER;
    public static final ForgeConfigSpec SERVER_SPEC;

    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(config.Common::new);
        COMMON = specPair.getLeft();
        COMMON_SPEC = specPair.getRight();
        final Pair<config.Server, ForgeConfigSpec> specServerPair = new ForgeConfigSpec.Builder().configure(config.Server::new);
        SERVER = specServerPair.getLeft();
        SERVER_SPEC = specServerPair.getRight();
    }

    public static class Server {
        //        public ForgeConfigSpec.ConfigValue<Boolean> SummonTARDISinTARDIS;
        public ForgeConfigSpec.ConfigValue<Integer> K9PowerDrainRate;
        public ForgeConfigSpec.ConfigValue<Boolean> DebugMode;
        public ForgeConfigSpec.ConfigValue<Integer> EOHMaxFETransfer;

        public Server(ForgeConfigSpec.Builder builder) {

//            SummonTARDISinTARDIS = builder.comment("Changes whether you can summon a TARDIS inside another TARDIS with the stattenhiem remote, true/false")
//                    .translation("config.tardisintardis").define("SummonTARDISinTARDIS", true);

            DebugMode = builder
                    .comment("Enables/Disable Debug Mode, all this does is output a ton of potentially useful data to the console and log file")
                    .translation("config.debug_mode")
                    .define("DebugMode", false);

            K9PowerDrainRate = builder
                    .comment("Changes Power Drain rate of K-9, measured in seconds, 0 - 2147483647\nThis will set how many seconds it takes to drain 1% of K9's battery, default is 25")
                    .translation("config.k9.power_rate")
                    .defineInRange("K9PowerDrainRate", 25, 0, Integer.MAX_VALUE);

            EOHMaxFETransfer = builder
                    .comment("Sets the maximum amount of FE that the Eye Of Harmony can provide")
                    .translation("config.eoh.max_rate")
                    .defineInRange("EOHMaxFETransfer", 1000000, 0, Integer.MAX_VALUE);
        }
    }

    public static class Common {
        public ForgeConfigSpec.ConfigValue<Integer> PowerFaultRarity;
        public ForgeConfigSpec.ConfigValue<Integer> TakingOverRarity;
        public ForgeConfigSpec.ConfigValue<Boolean> DebugMode;
        public ForgeConfigSpec.ConfigValue<Boolean> ShouldAmbientSoundsPlay;


        public Common(@NotNull ForgeConfigSpec.Builder builder) {
            PowerFaultRarity = builder
                    .comment("Changes the rarity of the Power Fault, 0 - 100")
                    .translation("config.rarity.powerfault")
                    .defineInRange("PowerFaultRarity", 25, 0, 100);

            TakingOverRarity = builder
                    .comment("Changes the rarity of the TARDIS Taking Over event, 0 - 100")
                    .translation("config.rarity.takingover")
                    .defineInRange("TakingOverRarity", 15, 0, 100);

            DebugMode = builder
                    .comment("Enables/Disable Debug Mode, all this does is output a ton of potentially useful data to the console and log file")
                    .translation("config.debug_mode")
                    .define("DebugMode", false);

            ShouldAmbientSoundsPlay = builder
                    .comment("Enables/Disables Creaking sounds inside TARDISs")
                    .translation("config.tardis.creak.ambient.sounds")
                    .define("ShouldAmbientSoundsPlay", true);
        }


    }
}