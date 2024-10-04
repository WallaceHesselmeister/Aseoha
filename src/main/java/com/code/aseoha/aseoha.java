package com.code.aseoha;
import com.code.aseoha.block.ModBlocks;
import com.code.aseoha.client.Sounds;
import com.code.aseoha.commands.Commands;
import com.code.aseoha.entities.ModEntityTypes;
import com.code.aseoha.items.ModItems;
import com.code.aseoha.items.NoTadditionsItems;
import com.code.aseoha.threads.K9TickThread;
import com.code.aseoha.threads.LivingTickThread;
import com.code.aseoha.threads.TickThread;
import com.code.aseoha.networking.Networking;
import com.code.aseoha.protocol.RegisterProtocols;
import com.code.aseoha.registries.*;
import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.EOHTile;
import com.code.aseoha.upgrades.RegisterUpgrades;
import com.code.aseoha.world.biome.surface.SurfaceBuilder;
import net.minecraft.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.tardis.mod.registries.ControlRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

/**
 * @author Codiak
 * <br />
 * Why? Because I did
 */
@Mod("aseoha")
public class aseoha {
    public static final String MODID = "aseoha";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static LivingTickThread livingTickThread = new LivingTickThread();
    public static TickThread tickThread = new TickThread();
    public static K9TickThread k9TickThread = new K9TickThread();


    public aseoha() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        STStructures.DEFERRED_REGISTRY_STRUCTURE.register(modBus);
        ExteriorsRegistry.EXTERIORS.register(modBus);
        ModBlocks.register(modBus);
        ModItems.register(modBus);
        if (!(ModList.get().isLoaded("tadditions")))
            NoTadditionsItems.register(modBus);
        //ConsolesRegistry.CONSOLES.register(modBus);
        RegisterProtocols.PROTOCOLSREGISTER.register(modBus);
        ConsolesRegistry.CONSOLES.register(modBus);
        AseohaTiles.TILES.register(modBus);
        ControlsRegistry.CUSTOM_CONTROLS.register(modBus);
        Sounds.SOUNDS.register(modBus);
        ModEntityTypes.register(modBus);
        RegisterFlightEvent.FLIGHT_EVENTS.register(modBus);
        RegisterUpgrades.UPGRADES.register(modBus);
        SoundSchemeRegister.SOUND_SCHEMES.register(modBus);
        SurfaceBuilder.SurfaceBuilders.SURFACE_BUILDERS.register(modBus);

        //ModBiomes.register(eventBus);
        // For events that happen after initialization. This is probably going to be use a lot.


        /*IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        forgeBus.addListener(EventPriority.NORMAL, this::addDimensionalSpacing);


        // The comments for BiomeLoadingEvent and StructureSpawnListGatherEvent says to do HIGH for additions.
        forgeBus.addListener(EventPriority.HIGH, this::biomeModification);
        */


        modBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        modBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        modBus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        modBus.addListener(this::doClientStuff);

        //NETWORKING
        Networking.init();

        //Register the Configs
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, config.COMMON_SPEC);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, config.SERVER_SPEC);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            livingTickThread.start();
            k9TickThread.start();
            tickThread.start();
            //Flight Event
            RegisterFlightEvent.registerRandomEntries();
            Commands.registerCustomArgumentTypes();
            //ModBiomeGeneration.generateBiomes();
            STStructures.setupStructures();
            STConfiguredStructures.registerConfiguredStructures();

            SurfaceBuilder.registerConfiguredSurfaceBuilders();
        });
        // some preinit code
//        LOGGER.info("HELLO FROM PREINIT");
//        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    /*public void biomeModification(final BiomeLoadingEvent event) {
        /*
         * Add our structure to all biomes including other modded biomes.
         * You can skip or add only to certain biomes based on stuff like biome category,
         * temperature, scale, precipitation, mod id, etc. All kinds of options!
         *
         * You can even use the BiomeDictionary as well! To use BiomeDictionary, do
         * RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName()) to get the biome's
         * registrykey. Then that can be fed into the dictionary to get the biome's types.
         */
    /*
        if(Objects.requireNonNull(event.getName()).toString().equals("aseoha:newearth")){
            event.getGeneration().getStructures().add(() -> STConfiguredStructures.CONFIGURED_ROAD);
        }


    }*/
    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
//        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
        // do something that can only be done with blocks
        ClientRegistry.RegisterClientStuff(event);
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
//        InterModComms.sendTo("aseoha", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m -> m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
//    @SubscribeEvent
//    public void onServerStarting(FMLServerStartingEvent event) {
    // do something when the server starts
//        LOGGER.info("HELLO from aseoha server starting");
//    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
//            LOGGER.info("HELLO from Register Block");
        }

    }

//    @OnlyIn(Dist.DEDICATED_SERVER)
    public static void SendDebugToServer(String DebugMessage) {
        if (config.SERVER.DebugMode.get() && Dist.DEDICATED_SERVER.isDedicatedServer())
            System.out.println("[ASEOHA Debug] " + DebugMessage);
    }

//    @OnlyIn(Dist.CLIENT)
    public static void SendDebugToClient(String DebugMessage) {
        if (config.COMMON.DebugMode.get() && Dist.CLIENT.isClient())
            System.out.println("[ASEOHA Debug] " + DebugMessage);
    }


    public static void SendDebugToAll(String DebugMessage) {
        if (config.COMMON.DebugMode.get() && Dist.CLIENT.isClient())
            System.out.println("[ASEOHA Debug] " + DebugMessage);
        if (config.SERVER.DebugMode.get() && Dist.DEDICATED_SERVER.isDedicatedServer())
            System.out.println("[ASEOHA Debug] " + DebugMessage);
    }
}

/////////////////////// Reaaaaaaaally old, crappy, and non-working structure gen I was trying to use for New (x15) York.
    /*
    private static Method GETCODEC_METHOD;
    public void addDimensionalSpacing(final WorldEvent.Load event) {
        if(event.getWorld() instanceof ServerWorld){
            ServerWorld serverWorld = (ServerWorld)event.getWorld();
*/
            /*
             * Skip Terraforged's chunk generator as they are a special case of a mod locking down their chunkgenerator.
             * They will handle your structure spacing for your if you add to WorldGenRegistries.NOISE_GENERATOR_SETTINGS in your structure's registration.
             * This here is done with reflection as this tutorial is not about setting up and using Mixins.
             * If you are using mixins, you can call the codec method with an invoker mixin instead of using reflection.
             */
    /*
            try {
                if(GETCODEC_METHOD == null) GETCODEC_METHOD = ObfuscationReflectionHelper.findMethod(ChunkGenerator.class, "func_230347_a_");
                ResourceLocation cgRL = Registry.CHUNK_GENERATOR.getKey((Codec<? extends ChunkGenerator>) GETCODEC_METHOD.invoke(serverWorld.getChunkSource().generator));
                if(cgRL != null && cgRL.getNamespace().equals("terraforged")) return;
            }
            catch(Exception e){
                aseoha.LOGGER.error("Was unable to check if " + serverWorld.dimension().location() + " is using Terraforged's ChunkGenerator.");
            }
*/
            /*
             * Prevent spawning our structure in Vanilla's superflat world as
             * people seem to want their superflat worlds free of modded structures.
             * Also that vanilla superflat is really tricky and buggy to work with in my experience.
             */
    /*
            if(serverWorld.getChunkSource().getGenerator() instanceof FlatChunkGenerator &&
                    serverWorld.dimension().equals(World.OVERWORLD)){
                return;
            }

            if(!(serverWorld.dimension().equals(NEWEARTH))){
                aseoha.LOGGER.info("NOT NEW EARTH");
                return;
            }
*/

            /*   6tt
             * putIfAbsent so people can override the spacing with dimension datapacks themselves if they wish to customize spacing more precisely per dimension.
             * Requires AccessTransformer  (see resources/META-INF/accesstransformer.cfg)
             *
             * NOTE: if you add per-dimension spacing configs, you can't use putIfAbsent as WorldGenRegistries.NOISE_GENERATOR_SETTINGS in FMLCommonSetupEvent
             * already added your default structure spacing to some dimensions. You would need to override the spacing with .put(...)
             * And if you want to do dimension blacklisting, you need to remove the spacing entry entirely from the map below to prevent generation safely.
             */
    /*
            if(serverWorld.dimension().equals(NEWEARTH)){
            aseoha.LOGGER.info("NEW EARTH");
            Map<Structure<?>, StructureSeparationSettings> tempMap = new HashMap<>(serverWorld.getChunkSource().generator.getSettings().structureConfig());
            tempMap.putIfAbsent(STStructures.ROAD.get(), DimensionStructuresSettings.DEFAULTS.get(STStructures.ROAD.get()));
            serverWorld.getChunkSource().generator.getSettings().structureConfig = tempMap;
            }
        }
    }
}
*/