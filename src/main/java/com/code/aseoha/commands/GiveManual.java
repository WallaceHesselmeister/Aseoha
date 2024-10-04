package com.code.aseoha.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;

import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.ars.ConsoleRoom;
import net.tardis.mod.commands.argument.ExteriorArgument;
import net.tardis.mod.commands.subcommands.TCommand;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.misc.Console;
import net.tardis.mod.tileentities.ConsoleTile;

public class GiveManual extends TCommand {

    private static int GiveManual(CommandSource source, ServerWorld sWorld) {
        if(source.getEntity() instanceof PlayerEntity)
//            source.getEntity().removeTag("GotASEOHABook");
            source.getServer().getCommands().performCommand(source.getServer().createCommandSourceStack().withEntity(source.getEntity()).withSuppressedOutput(), "function aseoha:givemanual");
        source.sendSuccess(new TranslationTextComponent("command.aseoha.book.given"), true);
        return Command.SINGLE_SUCCESS;
    }

    public static ArgumentBuilder<CommandSource, ?> register(CommandDispatcher<CommandSource> dispatcher){
        return Commands.literal("give_manual").requires(context -> context.hasPermission(0))
                .executes((commandSource) -> {return GiveManual.GiveManual(commandSource.getSource(), commandSource.getSource().getLevel());});
    }
}
