package com.code.aseoha.events;

import com.code.aseoha.Constants;
import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.Helpers.IHelpWithMonitor;
import com.code.aseoha.Helpers.PlayerHelper;
import com.code.aseoha.Helpers.TARDISHelper;
import com.code.aseoha.aseoha;
import com.code.aseoha.client.Sounds;
import com.code.aseoha.commands.Commands;
import com.code.aseoha.data.DataPackVortex;
import com.code.aseoha.data.DataPackWorkbenchRecipe;
import com.code.aseoha.entities.k9;
import com.code.aseoha.tileentities.consoles.CopperConsoleTile;
import com.code.aseoha.upgrades.AutoStabilizer;
import com.code.aseoha.upgrades.HADS;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartedEvent;
import net.mistersecret312.temporal_api.events.ControlEvent;
import net.mistersecret312.temporal_api.events.FlightEventEvent;
import net.mistersecret312.temporal_api.events.MinigameStartEvent;
import net.tardis.api.events.TardisEvent;
import net.tardis.mod.client.ClientHelper;
import net.tardis.mod.controls.AbstractControl;
import net.tardis.mod.controls.HandbrakeControl;
import net.tardis.mod.controls.ThrottleControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.subsystem.StabilizerSubsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import static com.code.aseoha.Helpers.IHelpWithMonitor.Aseoha$MonitorGetRot;

//******************************Apparently canceling the flight event with the doors crashes the game when outside the TARDIS**********************************************/
@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = aseoha.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonEvents {


//    @SubscribeEvent
//    public void attachCapability(AttachCapabilitiesEvent<TileEntity> event)
//    {
//        if (!(event.getObject() instanceof EOHTile)) return;
//
//        event.addCapability(new ResourceLocation("aseoha", "EOHEnergy"), new EOHEnergyProvider());
//    }
//
//    @SubscribeEvent
//    public void onAttachingCapabilities(final AttachCapabilitiesEvent<TileEntity> event) {
//        if (!(event.getObject() instanceof IEnergyStorage)) return;
//
//        EnergyStorage backend = new EnergyStorage(((IEnergyStorage) event.getObject()).getMaxEnergyStored());
//        LazyOptional<IEnergyStorage> optionalStorage = LazyOptional.of(() -> backend);
//
//        ICapabilityProvider provider = new ICapabilityProvider() {
//            @NotNull
//            @Override
//            public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction direction) {
//                if (cap == CapabilityEnergy.ENERGY) {
//                    return optionalStorage.cast();
//                }
//                return LazyOptional.empty();
//            }
//        };
//
//        event.addCapability(new ResourceLocation("aseoha", "fe_compatibility"), provider);
//        event.addListener(optionalStorage::invalidate);
//    }


    /**
     * @param event The RegisterCommandsEvent, I use this to register custom commands
     */
    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event) {
        Commands.register(event.getDispatcher());
    }

//    /**
//     * I use this to check if the player respawns, if they did, give them a manual
//     */
//    @SubscribeEvent
//    public static void respawnEvent(PlayerEvent.PlayerRespawnEvent event){
//        Objects.requireNonNull(event.getPlayer().getServer()).getCommands().performCommand(event.getPlayer().getServer().createCommandSourceStack().withEntity(event.getPlayer().getEntity()).withSuppressedOutput(), "function aseoha:givemanual");
//    }

    /**
     * This is just to check if somebody enters something in chat, what they entered, and mostly for K9 voice prompts
     */
    @SubscribeEvent
    public static void onServerChat(@NotNull ServerChatEvent event) {
        aseoha.SendDebugToServer("A whole crap ton of chat crap going on right now");
        AtomicReference<String> message = new AtomicReference<>(event.getMessage());
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        //HELP ME
        if (event.getMessage().toLowerCase().replace(" ", "").contains("aseoha") && event.getMessage().toLowerCase().replace(" ", "").contains("help") && event.getMessage().toLowerCase().replace(" ", "").contains("k9")) {
//            event.getPlayer().sendMessage(new StringTextComponent("Operation of K9 Mark II: \n\nTo ensure proper operation of K-9 Mark II make sure that your K-9 Unit is located within 20 blocks of the console unit of the TARDIS you would like to operate with your K-9 unit\n\nWhenever you would like to use your K-9 Unit, start by opening the chat, and type in \"K9\", You can also type \"K 9\" or \"K-9\", it is important to note that you may type it in uppercase, or lowercase.\n\nAfter typing K9, type in one of the many keywords available, each of these keywords corresponds to one of K9s many functions\n\nKeywords can be mixed with other words and phrases and will still work, for instance, I could say \"K9 [keyword]\" or I could say \"K9, Please do [keyword] now\" and K9 would still perform the function corresponding to the keyword (Note, when using keywords, capitalization does not matter)\n\nKeywords:\n\nThe keyword for K9s math function is: \"math\" and \"calculate\", the math function allows for Addition (+) Subtraction (-) Multiplication (*) and Division (/) it also supports parentheses ()\n\nThe Keywords for K9s Power Off function are \"power\" + \"off\"/\"down\" (Please note, you must include both power AND off in your sentence) K9's Power Off function will initiate the TARDIS Power Off Procedure, Turning all the lights off, and emitting some noises as it powers down.\n\nThe Keywords for K9's Destination Set function are \"set\"+\"destination\"/\"location\"/\"coord\" (Please note: while you can say coord, you could also add letters to the end of the keyword, like coordINATE or coordBanannaCreamPie) This will set the destination coordinate for one axis (X, Y, or Z) in order to set the coordinate, you must specify the axis (X, Y, or Z) in your message\n\nThe Keyword for K9's light function is \"set\"+\"light\" followed by a number, this number can be any number from 1-15, however, if you go above 15, it will automatically be set to 15. K9's light function sets the light level of the TARDIS.\n\nThe Keyword for K9's flight function is \"fly\", K9's flight function will activate the TARDIS Stabilizers (if present) and initiate the TARDIS flight sequence (Important Note, if you are flying a Type 40 TARDIS or older, you will have to manually pilot your TARDIS around any temporal disturbances (Flight Events), unless you have the Stabilizer Circuits installed, otherwise you run the risk of crashing and damaging your timeship, and landing in the wrong location)\n\nThe Keyword for K9's lock function are \"lock\", the lock function will lock the TARDIS doors, in order to unlock them, ensure the keywords \"disengage\" or \"un\" are present in you message to K9\n\nThe Keywords for K9's deadlock function are \"dead\"+\"lock\", K9's deadlock function will deadlock the doors. (WARNING, DEADLOCKED DOORS CAN ONLY BE UNLOCKED BY A DEADLOCKER KEY WHICH MUST BE ATTUNED TO YOUR TARDIS, OR BY ANOTHER K9), If you wish to un-deadlock the TARDIS doors with your K9, ensure the keywords \"un\"/\"disengage\" are present in your message\n\nWe Thank you for purchasing your new K9 Mark II, and wish you happy travels!\nTo file a complaint with your K9 call the ASEOHA helpline by typing \"call 770-090-0461\" in the chat\nMade in China\n K9 Mark II complies with part 15 of the FCC Rules.\nOperation is subject to the following two conditions:\n(1) this device may not cause harmful interference, \nand (2) this device must accept any interference \nreceived, including interference that may cause undesired operation.\nComplies with Canadian ICES-003 Class B.\nConforme á la NMB-003 classe B du Canada."), event.getPlayer().getUUID());
            event.getPlayer().sendMessage(new StringTextComponent("Upon crafting K-9, you must tame your K-9, which you can do with your sonic screwdriver, then you must recharge your K-9 Unit, in order to do so, click on him with any item that holds an Artron Charge (Sonic Screwdriver, Artron Battery, etc) his maximum capacity is 100 AU, and by default will drain 1 AU every 25 seconds (this can be configured via the server Config), upon charging him up, it will now be able to move and you can now open up it's inventory and GUI, to open the GUI, simply right click the K-9, to open up his inventory, simply Right Click K-9 while you are Crouching. \nWe Thank you for purchasing your new K9 Mark II, and wish you happy travels!\nTo file a complaint with your K9 call the ASEOHA helpline by typing \"call 770-090-0461\" in the chat\nMade in China\n K9 Mark II complies with part 15 of the FCC Rules.\nOperation is subject to the following two conditions:\n(1) this device may not cause harmful interference, \nand (2) this device must accept any interference \nreceived, including interference that may cause undesired operation.\nComplies with Canadian ICES-003 Class B.\nConforme á la NMB-003 classe B du Canada."), event.getPlayer().getUUID());
        }
        if (event.getMessage().toLowerCase().replace("-", "").replace(" ", "").contains("7700900461")) { // The doctors phone number
            event.getPlayer().sendMessage(new StringTextComponent("You have reached the TARDIS, She's busy routing you through the vortex, please hold!"), event.getPlayer().getUUID());
        }

        TardisHelper.getConsoleInWorld(event.getPlayer().getLevel()).ifPresent((consoleTile -> {
//        assert consoleTile != null;
//        if (consoleTile.getLevel() != null) {
//            Developed for TA
//            if((message.toLowerCase().contains("meter") || message.toLowerCase().contains("metre")) && message.toLowerCase().contains("second")){
//                String[] parts = message.replace("'", "").replace("seconds", "").replace("meter", "-").replace("meters", "-").replace("metre", "-").replace("metres", "-").split("-");
//                float meters = Float.parseFloat(parts[0].replaceAll("[^1234567890.]", ""));
//                int seconds = Integer.parseInt(parts[1].replaceAll("[^1234567890]", ""));
//                //*********************Do Stuff Here**********************//
//
//            }
            //****************************************** K-9! ******************************************//
            if (Arrays.stream(Constants.waysOfSayingK9).limit(Constants.waysOfSayingK9.length).collect(Collectors.toList()).contains(message.get().toLowerCase())) {
                // Remove all instances of K9 for message parsing
                for (int i = 0; i < Constants.waysOfSayingK9.length; i++)
                    message.set(message.get().replace(Constants.waysOfSayingK9[i], ""));

                for (LivingEntity liv : consoleTile.getLevel().getEntitiesOfClass(LivingEntity.class, new AxisAlignedBB(consoleTile.getBlockPos()).inflate(20))) {
                    outofK9:
                    if (liv instanceof k9) {
                        if (((k9) liv).isDead || ((k9) liv).isNoAi()) break outofK9;
                        if (message.get().toLowerCase().contains("fly")) {
                            k9.Talk(1, event.getPlayer(), event.getPlayer().level);
                            consoleTile.getSubsystem(StabilizerSubsystem.class).ifPresent((stabs) -> stabs.setActivated(true));
                            consoleTile.takeoff();
                        }


                        if (message.get().toLowerCase().contains("power")) {
                            if (message.get().toLowerCase().contains("off") || message.get().toLowerCase().contains("down")) {
                                k9.Talk(1, event.getPlayer(), event.getPlayer().level);
                                consoleTile.onPowerDown(true);
                            }
                        }


                        if (message.get().toLowerCase().contains("set")) {
                            if (message.get().toLowerCase().contains("light")) {
                                k9.Talk(1, event.getPlayer(), event.getPlayer().level);
                                int lightLevel = Integer.parseInt(message.get().toLowerCase().replace(" ", "").replace("k-9", "").replace("k9", "").replace("k 9", "").replaceAll("[^1234567890]", ""));
                                if (lightLevel > 15) lightLevel = 15;
                                if (lightLevel < 0) lightLevel = 0;
                                consoleTile.getInteriorManager().setLight(lightLevel);

                            }

                            if (message.get().toLowerCase().contains("coord") || message.get().toLowerCase().contains("location") || message.get().toLowerCase().contains("destination")) {

                                if (message.get().toLowerCase().contains("x") && !message.get().toLowerCase().contains("y") && !message.get().toLowerCase().contains("z")) {
                                    consoleTile.setDestination(consoleTile.getDestinationDimension(), new BlockPos(Integer.parseInt(message.get().toLowerCase().replace(" ", "").replace("k-9", "").replace("k9", "").replaceAll("[^1234567890]", "")), consoleTile.getDestinationPosition().getY(), consoleTile.getDestinationPosition().getZ()));
                                    k9.Talk(1, event.getPlayer(), event.getPlayer().level);
                                }

                                if (message.get().toLowerCase().contains("y") && !message.get().toLowerCase().contains("x") && !message.get().toLowerCase().contains("z")) {
                                    consoleTile.setDestination(consoleTile.getDestinationDimension(), new BlockPos(consoleTile.getDestinationPosition().getX(), Integer.parseInt(message.get().toLowerCase().replace(" ", "").replace("k-9", "").replace("k9", "").replaceAll("[^1234567890]", "")), consoleTile.getDestinationPosition().getZ()));
                                    k9.Talk(1, event.getPlayer(), event.getPlayer().level);
                                }

                                if (message.get().toLowerCase().contains("z") && !message.get().toLowerCase().contains("x") && !message.get().toLowerCase().contains("y")) {
                                    consoleTile.setDestination(consoleTile.getDestinationDimension(), new BlockPos(consoleTile.getDestinationPosition().getX(), consoleTile.getDestinationPosition().getY(), Integer.parseInt(message.get().toLowerCase().replace(" ", "").replace("k-9", "").replace("k9", "").replaceAll("[^1234567890]", ""))));
                                    k9.Talk(1, event.getPlayer(), event.getPlayer().level);
                                }
                                if ((message.get().toLowerCase().contains("x") && message.get().toLowerCase().contains("y")) || (message.get().toLowerCase().contains("x") && message.get().contains("z")) || (message.get().toLowerCase().contains("z") && message.get().toLowerCase().contains("y"))) {
                                    k9.Talk(2, event.getPlayer(), event.getPlayer().level);
                                }
                            }
                        }

                        if (message.get().toLowerCase().contains("dead") && message.get().toLowerCase().contains("lock")) {
                            if ((message.get().toLowerCase().contains("engage") || message.get().toLowerCase().contains("on")) && !message.get().toLowerCase().contains("dis") && !message.get().toLowerCase().contains("off")) {
                                TARDISHelper.setDoorState(consoleTile, 0);
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).setAdditionalLockLevel(1);
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).copyDoorStateToInteriorDoor();
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).updateClient();
                                k9.Talk(1, event.getPlayer(), event.getPlayer().level);
                            }
                            if ((message.get().toLowerCase().contains("dis") && message.get().toLowerCase().contains("engage")) || message.get().toLowerCase().contains("off")) {
                                TARDISHelper.setDoorState(consoleTile, 0);
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).setAdditionalLockLevel(0);
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).copyDoorStateToInteriorDoor();
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).updateClient();
                                k9.Talk(1, event.getPlayer(), event.getPlayer().level);
                            }
                        }

                        if (message.get().toLowerCase().contains("lock") && !message.get().toLowerCase().contains("dead")) {
                            if (!(message.get().toLowerCase().contains("engage") && message.get().toLowerCase().contains("dis")) || !message.get().toLowerCase().contains("un")) {
                                TARDISHelper.setDoorState(consoleTile, 0);
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).setLocked(true);
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).copyDoorStateToInteriorDoor();
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).updateClient();
                                k9.Talk(1, event.getPlayer(), event.getPlayer().level);
                            } else {
                                TARDISHelper.setDoorState(consoleTile, 0);
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).setLocked(false);
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).copyDoorStateToInteriorDoor();
                                consoleTile.getExteriorType().getExteriorTile(consoleTile).updateClient();
                                k9.Talk(1, event.getPlayer(), event.getPlayer().level);
                            }
                        }


                        // Very complicated,
                        // but basically it uses regex and smart stuff
                        // to replace everything that isn't a number,
                        // and then print a JavaScript evaluation of the string
                        // (basically JS goes through the string, does mathy stuff)

                        if (message.get().toLowerCase().contains("math") || message.get().toLowerCase().contains("calculate")) {
//                            aseoha.LOGGER.info(engine.eval(message.toLowerCase().replace(" ", "").replace("k9", "").replace("k 9", "").replace("k-9", "").replaceAll("[^1234567890()^+*/-]", "")).toString());
                            try {
                                k9.Say("[K9] The result of the equation is " + engine.eval(message.get().toLowerCase().replace(" ", "").replaceAll("[^1234567890()^+*/-]", "")).toString(), event.getPlayer(), event.getPlayer().level);
                            } catch (ScriptException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        if (message.get().toLowerCase().contains("scan")) {
//                            if(new BlockPos(consoleTile.getCurrentLocation().getX()+1,consoleTile.getCurrentLocation().getY(), consoleTile.getCurrentLocation().getZ()).equals(Blocks.LAVA))
//                                if(new BlockPos(consoleTile.getCurrentLocation().getX()-1,consoleTile.getCurrentLocation().getY(), consoleTile.getCurrentLocation().getZ()).equals(Blocks.LAVA))
//                                    if(new BlockPos(consoleTile.getCurrentLocation().getX(),consoleTile.getCurrentLocation().getY(), consoleTile.getCurrentLocation().getZ()+1).equals(Blocks.LAVA))
//                                        if(new BlockPos(consoleTile.getCurrentLocation().getX(),consoleTile.getCurrentLocation().getY(), consoleTile.getCurrentLocation().getZ()-1).equals(Blocks.LAVA))
                            int DangerousBlocks = 0;
                            for (int x = -5; x <= 5; x++) {
                                for (int y = -5; x <= 5; x++) {
                                    for (int z = -5; x <= 5; x++) {
                                        BlockPos pos = new BlockPos(x, y, z);
                                        BlockState state = consoleTile.getExteriorType().getExteriorTile(consoleTile).getLevel().getBlockState(pos);
                                        if (state.equals(Blocks.LAVA.defaultBlockState()) ||
                                                state.equals(Blocks.SPAWNER.defaultBlockState()) ||
                                                state.equals(Blocks.MAGMA_BLOCK.defaultBlockState()) ||
                                                state.equals(Blocks.FIRE.defaultBlockState()) ||
                                                state.equals(Blocks.INFESTED_COBBLESTONE.defaultBlockState()) ||
                                                state.equals(Blocks.INFESTED_CHISELED_STONE_BRICKS.defaultBlockState()) ||
                                                state.equals(Blocks.TNT.defaultBlockState()) ||
                                                state.equals(Blocks.WITHER_ROSE.defaultBlockState()) ||
                                                state.equals(Blocks.GRAVEL.defaultBlockState())) {
                                            DangerousBlocks++;
                                        }
                                    }
                                }
                            }

                        }
//                    if(message.toLowerCase().contains("coord") || message.toLowerCase().contains("location") || message.toLowerCase().contains("destination")) {
//                        if (message.toLowerCase().contains("x") && !message.toLowerCase().contains("y") && !message.toLowerCase().contains("z")) {
//                            consoleTile.setDestination(consoleTile.getDestinationDimension(), new BlockPos(Integer.parseInt(nums), consoleTile.getDestinationPosition().getY(), consoleTile.getDestinationPosition().getZ()));
//                        }
//                    }
                    }
                }


            }
//                    K9.ifPresent(k9Type -> k9.Talk(1));

        }));
//        else {
//            Objects.requireNonNull(event.getPlayer().getServer()).sendMessage((ITextComponent) new TranslationTextComponent(message), event.getPlayer().getUUID());
//        }
//        }
    }

    /**
     * Use this to make sure if a player is on midnight, fire em
     */
    @SubscribeEvent
    public static void onLivingTick(LivingEvent.LivingUpdateEvent event) {
        aseoha.livingTickThread.Call(event);
    }


    @SubscribeEvent
    public static void onEventPopup(FlightEventEvent.StartFlightEvent event) {
        event.getConsole().getUpgrade(HADS.class).ifPresent(hads -> {
            if (hads.isActivated() && hads.isUsable())
                if (((IHelpWithConsole) event.getConsole()).Aseoha$GetHads())
                    event.setCanceled(true);
            ConsoleTile console = TardisHelper.getConsoleInWorld(Objects.requireNonNull(event.getConsole().getLevel())).get();
        });

        event.getConsole().getUpgrade(AutoStabilizer.class).ifPresent(autostabs -> {
            if (autostabs.isUsable() && autostabs.isActivated())
                if (event.getConsole().doesConsoleWorldHaveNoPlayers())
                    event.setCanceled(true);
        });
    }

    /**
     * Make sure TARDIS Doors close on takeoff, and low on artron sounds
     */
    @SubscribeEvent
    public static void onTardisTakeoff(TardisEvent.Takeoff event) {
//    if(!TARDISHelper.areDoorsClosed(event.getConsole()) && !HADS.hadsActivate(event.getConsole()))
//        event.setCanceled(true);
        TARDISHelper.setDoorState(event.getConsole(), 0);

        if (event.getConsole().getArtron() < 32) {
            aseoha.SendDebugToClient("TARDIS TakeOff Low On Artron Code Being Executed");
            ClientHelper.shutTheFuckUp(TSounds.TARDIS_TAKEOFF.get(), SoundCategory.BLOCKS);
            Objects.requireNonNull(event.getConsole().getLevel()).playSound(null, event.getConsole().getBlockPos(), Sounds.LOW_ARTRON_TAKEOFF.get(), SoundCategory.BLOCKS, 1.0f, 1.0f);
        }
    }

    /**
     * Keep TARDIS from taking off in maintenance mode or with handbrake on
     *
     * @param event
     */
    @SubscribeEvent
    public static void TAPIOnTARDISTakeoff(net.mistersecret312.temporal_api.events.TardisEvent.TakeoffEvent event) {

        if (((IHelpWithConsole) event.getConsole()).Aseoha$GetMaintenance())
            event.setCanceled(true);

        /** Ensure that the TARDIS *ONLY* Takes off if the brake is free **/
        event.getConsole().getControl(HandbrakeControl.class).ifPresent(brake -> event.setCanceled(!brake.isFree()));
    }

    @SubscribeEvent
    public static void MiniGameEvent(MinigameStartEvent event) {
        ConsoleTile console = TardisHelper.getConsoleInWorld(event.getPlayer().level).orElse(null);
        if (console != null && ((IHelpWithConsole) console).Aseoha$GetMaintenance())
            event.setCanceled(true);
    }

    @SubscribeEvent
    public static void ControlHitEvent(ControlEvent.ControlHitEvent event) {
        if (event.getControl().getConsole() == null) {
            event.setCanceled(true);
            return;
        }
        ConsoleTile consoleTile = event.getControl().getConsole();

        if (((IHelpWithConsole) event.getControl().getConsole()).Aseoha$GetMaintenance()) {
            event.setCanceled(true);
            return;
        }

        if (((IHelpWithConsole) consoleTile).Aseoha$GetIsomorphic() && !PlayerHelper.HasKey(event.getPlayer(), consoleTile)) {
            event.setCanceled(true);
            return;
        }

        if (((IHelpWithConsole) consoleTile).Aseoha$GetPilot() != null) return;

        ((IHelpWithConsole) consoleTile).Aseoha$SetPilot(event.getPlayer());
    }


    @SubscribeEvent
    public static void ControlClickedEvent(ControlEvents.ControlClickEvent event) {
        if (event.getControl().getConsole() == null) return;

        ConsoleTile consoleTile = event.getControl().getConsole();

        if (((IHelpWithConsole) consoleTile).Aseoha$GetIsomorphic() && !PlayerHelper.HasKey(event.getPlayer(), consoleTile)) {
            event.setCanceled(true);
            return;
        }

        if (((IHelpWithConsole) consoleTile).Aseoha$GetMaintenance()) {
            event.setCanceled(true);
            return;
        }

        if (((IHelpWithConsole) consoleTile).Aseoha$GetPilot() == null)
            ((IHelpWithConsole) consoleTile).Aseoha$SetPilot(event.getPlayer());
    }

    @SubscribeEvent
    public static void InsertSonic(ControlEvent.SonicPutEvent event) {
        if (((IHelpWithConsole) event.getControl().getConsole()).Aseoha$GetMaintenance()) {
            event.setCanceled(true);
            // Put return just in case I need to add onto this function later on
            return;
        }
    }

    @SubscribeEvent
    public static void TakeSonic(ControlEvent.SonicTakeEvent event) {
        if (((IHelpWithConsole) event.getControl().getConsole()).Aseoha$GetMaintenance())
            event.setCanceled(true);
    }

    @SubscribeEvent
    public static void onTardisLand(TardisEvent.Land event) {
        if (event.getConsole().getArtron() > 32) return;
        aseoha.SendDebugToClient("TARDIS Land Low On Artron Code Being Executed (Land)");
        ClientHelper.shutTheFuckUp(TSounds.TARDIS_LAND.get(), SoundCategory.BLOCKS);
        Objects.requireNonNull(event.getConsole().getLevel()).playSound(null, event.getConsole().getBlockPos(), Sounds.LOW_ARTRON_LAND.get(), SoundCategory.BLOCKS, 1.0f, 1.0f);
    }


    /**
     * This is SUPPOSED to trigger HADS when you hit the exterior, unfortunately I never did get it working, also used it at one point for the hammer, now all it does right is rotating the monitor on the copper console and throttle blast
     */
    @SubscribeEvent
    public static void OnAttack(AttackEntityEvent event) {
        if (!(event.getTarget() instanceof ControlEntity)) return;

        ConsoleTile consoleTile = (((ControlEntity) event.getTarget()).getControl().getConsole());

        ControlEntity control = (ControlEntity) event.getTarget();

        AbstractControl Control = control.getControl();

        if (!(event.getEntity() instanceof PlayerEntity)) return;

        if (Control instanceof ThrottleControl)
            if (consoleTile.getControl(HandbrakeControl.class).get().isFree() &&
                    !consoleTile.isLanding() &&
                    !consoleTile.isInFlight()) {
//                        ClientHelper.shutTheFuckUp(TSounds.TARDIS_TAKEOFF.get(), SoundCategory.BLOCKS);
                event.getPlayer().playSound(Sounds.THROTTLE_BLAST.get(), 1, 1);
            }
//        if (event.getTarget() instanceof TardisEntity) {
//            ((TardisEntity) event.getTarget()).getConsole().getInteriorManager().setAlarmOn(true);
//        }
//////////////////////////////////////////////////////////////////////////////////////////Old ass low on artron code + non-working hammer
//        if(event.getPlayer().getUseItem().equals(new ItemStack(ModItems.HAMMER.get()))){
//            ConsoleTile console = ((ControlEntity) event.getTarget()).getControl().getConsole();
//            console.setDestinationReachedTick(console.getReachDestinationTick() - (console.getReachDestinationTick() / 8));
//            console.getSubsystem(FluidLinksSubsystem.class).ifPresent(fluid -> fluid.getItem().setDamageValue(fluid.getItem().getDamageValue() - 300)); //Not working: (Hammer)
//                if (entity.getControl().getConsole().canFly() && !entity.getControl().getConsole().isInFlight() && !event.getPlayer().isCrouching()){
////                    console.getControl(DimensionControl.class).ifPresent((dimensionControl) -> {
//                    HandbrakeControl control = entity.getControl().getConsole().getControl(HandbrakeControl.class).get();
////                    // Check to make sure the handbreak isn't on.
//                    if (control instanceof HandbrakeControl){
//                        if (((HandbrakeControl) control).isFree()) {
//                            if(entity.getControl().getConsole().getArtron() < 64)
//                            event.getTarget().level.playSound(null, entity.getControl().getConsole().getBlockPos(), Sounds.LOW_ARTRON_TAKEOFF.get(), SoundCategory.BLOCKS, 1.0f,1.0f);
//                        }
//                    }
//                }
//        }
        if (!(consoleTile instanceof CopperConsoleTile)) return;
        if (Control.getEntry().equals(ControlRegistry.MONITOR.get()) && event.getPlayer().isCrouching()) {
            event.setCanceled(true);
            BlockPos pos = Control.getConsole().getBlockPos();
            Vector3d p = event.getPlayer().position().subtract(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5).normalize();
            float rot = Aseoha$MonitorGetRot(p);
            ((IHelpWithMonitor) Control).Aseoha$SetRot(rot);
        }
    }


//    @SubscribeEvent
//    public static void onHurtEvent(LivingHurtEvent event) {
//        if (event.getEntity() instanceof PlayerEntity) {
//            PlayerEntity player = (PlayerEntity) event.getEntity();
//            if (player.getVehicle() != null && player.getVehicle() instanceof TardisEntity) {
//                event.setCanceled(true);
//            }
//        }
//    }


//    @SubscribeEvent
//    public static void onMount(EntityMountEvent e) {
//        if(e.getEntityBeingMounted() instanceof TardisEntity) {
//            if(e.getEntityMounting() instanceof PlayerEntity) {
//                if(e.isDismounting()) {
//                    if(e.getEntityBeingMounted() instanceof TardisEntity) {
//                        TardisEntity tardisEntity = (TardisEntity)e.getEntityBeingMounted();
//
//                        e.setCanceled(!((IHelpWithTardisEntity) tardisEntity).canDismount());
//
//                        tardisEntity.setDeltaMovement(tardisEntity.getDeltaMovement().add(0, -1, 0));
//                    }
//                }
//            }
//        }
//    }


//    /**
//     * I was gonna use this for something. that's all.
//     */
//    @SubscribeEvent
//    public static void onEntityJoin(EntityJoinWorldEvent event) {
//        if (event.getEntity() instanceof PlayerEntity) {
////            if(TardisHelper.getConsoleInWorld(event.getWorld()).isPresent()){
////
////                TardisHelper.getConsoleInWorld(event.getWorld()).ifPresent((console) -> {
////                    if(!console.doesConsoleWorldHaveNoPlayers()){
////                        event.getWorld().getServer().tell(new TickDelayedTask(20, console::getOrCreateControls));
////                        console.updateClient();
////                    }
////                });
////            }
//        }
//        if(event.getEntity() instanceof ServerPlayerEntity) {
//            aseoha.SendDebugToAll("Player Joined World " + event.getEntity() + " With UUID " + event.getEntity().getUUID());
//
//            if(event.getEntity().getVehicle() instanceof TardisEntity) {
//                ServerPlayerEntity player = (ServerPlayerEntity)event.getEntity();
//
//                TardisEntity te = (TardisEntity) player.getVehicle();
//                if(te.getConsole() != null) {
//                    ConsoleTile tile = te.getConsole();
//                    ((IHelpWithConsole) tile).Aseoha$StopRide(true);
//                }
////                else
////                    te.remove();
//            }
//
//            event.getEntity().getCapability(Capabilities.PLAYER_DATA).ifPresent(data -> {
//                if(((ICapPlayer) data).hasFlyedInTardis() && ((ICapPlayer) data).getInteriorDimension() != null) {
//                    if(event.getEntity().level.isClientSide) {
//                        Objects.requireNonNull(event.getEntity().level.getServer()).tell(new TickDelayedTask(1, () -> {
//                            double x = 0, y = TardisHelper.TARDIS_POS.getY(), z = 0;
//                            ConsoleTile console = null;
//                            ServerWorld ws = Objects.requireNonNull(event.getEntity().level.getServer()).getLevel(((ICapPlayer) data).getInteriorDimension());
//
//                            //Get Console
//                            if(ws != null) {
//                                TileEntity te = ws.getBlockEntity(TardisHelper.TARDIS_POS);
//                                if(te instanceof ConsoleTile)
//                                    console = (ConsoleTile)te;
//                            }
//
//                            //If an interior door exists, put the player near it
//                            DoorEntity door = console != null ? console.getDoor().orElse(null) : null;
//
//
//                            if(door != null) {
//                                x = door.getX();
//                                z = door.getZ();
//                                y = door.getY();
//                            }
//
//                            if(door != null)
//                                door.addEntityToTeleportImmuneList(event.getEntity().getUUID()); //TODO: MAKE SURE THIS IS RIGHT
//
//                            Vector3d oldMotion = event.getEntity().getDeltaMovement();
//
//                            ((ICapPlayer) data).setFlyingInTardis(false);
//                            ((ICapPlayer) data).setInteriorDimension(null);
//
//                            WorldHelper.teleportEntities(event.getEntity(), ws, x, y, z, door.yRot, event.getEntity().xRot);
//
//                            //Motion
//
//                            Vector3d setMot = oldMotion.yRot(-(float)Math.toRadians(door.yRot));
//
//                            event.getEntity().level.getServer().tell(new TickDelayedTask(1, () -> {
//                                Entity ent = ws.getEntity(event.getEntity().getUUID());
//                                if(ent != null)
//                                    ent.moveTo(setMot);
//                                if(ent instanceof ServerPlayerEntity) {
//                                    ((ServerPlayerEntity)ent).connection.send(new SEntityVelocityPacket(ent));
//                                }
//                            }));
//                        }));
//                    }
//                }
//            });
//        }
//    }

    @SubscribeEvent
    public static void onEntityLeave(@NotNull PlayerEvent.PlayerLoggedOutEvent event) {
        aseoha.SendDebugToAll("Player left - " + event.getPlayer() + " With UUID " + event.getPlayer().getUUID());
        if (event.getPlayer().getVehicle() != null && event.getPlayer().getVehicle() instanceof TardisEntity) {
            TardisEntity te = (TardisEntity) event.getPlayer().getVehicle();
            if (te.getConsole() != null)
                if (((IHelpWithConsole) te.getConsole()).Aseoha$IsRealWorldFlight())
                    ((IHelpWithConsole) te.getConsole()).Aseoha$CleanupRide();


//                    event.getEntity().getCapability(Capabilities.PLAYER_DATA).ifPresent(data -> {
//                        ((ICapPlayer) data).setFlyingInTardis(true);
//                        ((ICapPlayer) data).setInteriorDimension(Objects.requireNonNull(tile.getLevel()).dimension());
//                    });
        }
    }

    @SubscribeEvent
    public static void ServerStartup(@NotNull FMLServerStartedEvent event) {
        aseoha.SendDebugToServer("Server Startup");
    }


    /**
     * A LOT of stuff
     */
    @SubscribeEvent
    public static void OnWorldTick(TickEvent.WorldTickEvent event) {
        aseoha.tickThread.Call(event);
//        /**
//         * If the light value is above 15 or below 0 it'll reset to 0 to prevent crash
//         */
//        if (event.world.dimension().equals(TDimensions.TARDIS_DIMENSIONS)) {
//            TardisHelper.getConsoleInWorld(event.world).ifPresent(consoleTile -> consoleTile.getInteriorManager().setLight((consoleTile.getInteriorManager().getLight() < 0) || (consoleTile.getInteriorManager().getLight() > 15) ? 0 : consoleTile.getInteriorManager().getLight()));
//        }
    }


///////////////////////////////////////Old ass HADS code, basically just take off if a !ignored entity enters the TARDIS, can't remember why I abandoned it.
    ///////////////////////////////////I Think I remember why it's abandoned now, I think that it would take off even if you didn't have the upgrade.
//    if (!event.world.isClientSide) {
//        event.world.getServer().tell(new TickDelayedTask(1, () -> {
//            if (WorldHelper.areDimensionTypesSame(event.getWorld(), TDimensions.DimensionTypes.TARDIS_TYPE)) {
//                if (event.getEntity() instanceof IMob && !event.getEntity().getType().is(TardisEntityTypeTags.IGNORED_ALARM_ENTITIES)) {
//                    if (TardisHelper.getConsoleInWorld(event.getWorld()).isPresent()) {
//                        TardisHelper.getConsoleInWorld(event.getWorld()).ifPresent((tile) -> {
//                            ConsoleTile console = Objects.requireNonNull(TardisHelper.getConsoleInWorld(event.getWorld()).get());
//                            console.getUpgrade(HADS.class).ifPresent((hads) -> {
//                                if(hads.isActivated()){
//                                    HADS.hadsActivate(console);
//                                }
//                            });
//                        });
//                    }
//                }
//            }
//        }));

    @SubscribeEvent
    public static void AddDataPackReloadListeners(AddReloadListenerEvent event) {
        aseoha.WorkBenchRecipeHandler.getRecipeList().clear();
        aseoha.WorkBenchRecipeHandler.Init();
        event.addListener(DataPackVortex.DATA_LOADER);
        event.addListener(DataPackWorkbenchRecipe.DATA_LOADER);
    }
}