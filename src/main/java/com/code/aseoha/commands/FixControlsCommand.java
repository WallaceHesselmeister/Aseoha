package com.code.aseoha.commands;

import com.code.aseoha.networking.Networking;
import com.code.aseoha.networking.Packets.c2s.UpdateControlsPacketC2S;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;

import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.TranslationTextComponent;
import net.tardis.mod.commands.subcommands.TCommand;
import net.tardis.mod.helper.TardisHelper;

import java.util.Objects;

public class FixControlsCommand extends TCommand {

    private static int fixControls(CommandSource source) {
//            ServerWorld tardisInteriorWorld = TardisHelper.setupTardisDim(sWorld.getServer(), console.getState(), room);
            TardisHelper.getConsoleInWorld(source.getLevel()).ifPresent((consoleTile) -> {
                consoleTile.removeControls();
                consoleTile.getOrCreateControls();
                Networking.sendToServer(new UpdateControlsPacketC2S(Objects.requireNonNull(consoleTile.getLevel()).dimension().getRegistryName()));
//                Network.sendToServer(new ConsoleChangeMessage(consoleTile.getType().getRegistryName()));
                consoleTile.updateClient();
            });
            source.sendSuccess(new TranslationTextComponent("command.aseoha.controls.fixed"), true);
        return Command.SINGLE_SUCCESS;
    }

    public static ArgumentBuilder<CommandSource, ?> register(CommandDispatcher<CommandSource> dispatcher){
        return Commands.literal("fix_controls").requires(context -> context.hasPermission(2))
//                .then(Commands.argument("", FixControlsArgument.getFixControlsArgument()).executes(FixControlsCommand.)
//                );//End exterior argument
                .executes((commandSource) -> {
                    return FixControlsCommand.fixControls(commandSource.getSource());
                });
    }
//    @OnlyIn(Dist.CLIENT)
//    private void sendPacket(ConsoleTile console) {
//        new UpdateControls(Objects.requireNonNull(console.getLevel()).dimension().getRegis/tryName()));
//    }
}
