package com.code.aseoha.commands;

import com.code.aseoha.aseoha;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandSource;
import net.minecraft.command.arguments.ArgumentSerializer;
import net.minecraft.command.arguments.ArgumentTypes;
import net.minecraft.command.impl.GiveCommand;
import net.tardis.mod.Tardis;
import net.tardis.mod.commands.argument.*;
import net.tardis.mod.helper.Helper;

public class Commands {

    public static void register(CommandDispatcher<CommandSource> dispatcher){
        dispatcher.register(
                net.minecraft.command.Commands.literal(aseoha.MODID)
                        .then(FixControlsCommand.register(dispatcher))
                        .then(GiveManual.register(dispatcher))
        );
    }


    /** Register our custom Argument Types to allow for proper serialisation on the server
     * <br> Do this in FMLCommonSetup, enqueueWork lambda*/
    public static void registerCustomArgumentTypes() {
//        ArgumentTypes.register(Helper.createRLString("fix_controls_argument"), FixControlsArgument.class, new ArgumentSerializer<>(FixControlsArgument::getFixControlsArgument));
//        ArgumentTypes.register(Helper.createRLString("give_manual_argument"), GiveManualArgument.class, new ArgumentSerializer<>(GiveManualArgument::getGiveManualArgument));
//        ArgumentTypes.register(Helper.createRLString("exterior_argument"), ExteriorArgument.class, new ArgumentSerializer<>(ExteriorArgument::getExteriorArgument));
//        ArgumentTypes.register(Helper.createRLString("console_room_argument"), ConsoleRoomArgument.class, new ArgumentSerializer<>(ConsoleRoomArgument::getConsoleRoomArgument));
//        ArgumentTypes.register(Helper.createRLString("console_unit_argument"), ConsoleUnitArgument.class, new ArgumentSerializer<>(ConsoleUnitArgument::getConsoleUnitArgument));
//        ArgumentTypes.register(Helper.createRLString("mission_type_argument"), MissionTypeArgument.class, new ArgumentSerializer<>(MissionTypeArgument::getMissionTypeArgument));
//        ArgumentTypes.register(Helper.createRLString("mission_stage_argument"), MissionStageArgument.class, new ArgumentSerializer<>(MissionStageArgument::getMissionStageArgument));
//        ArgumentTypes.register(Helper.createRLString("disguise_argument"), DisguiseArgument.class, new ArgumentSerializer<>(DisguiseArgument::getDisguiseArgument));
    }

}
