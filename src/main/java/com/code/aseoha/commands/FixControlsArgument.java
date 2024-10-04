package com.code.aseoha.commands;

import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.registries.ExteriorRegistry;

public class FixControlsArgument implements ArgumentType<ResourceLocation>{
//    private static final Collection<String> EXAMPLES = Stream.of(ExteriorRegistry.STEAMPUNK, ExteriorRegistry.TRUNK).map((exterior) -> Objects.requireNonNull(exterior.get().getRegistryName()).toString()).collect(Collectors.toList());
    private static final DynamicCommandExceptionType INVALID_EXCEPTION = new DynamicCommandExceptionType((exterior) -> new TranslationTextComponent("argument.aseoha.interior.invalid", exterior));

    @Override
    public ResourceLocation parse(StringReader reader) throws CommandSyntaxException {
        return ResourceLocation.read(reader);
    }

////    @Override
////    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
////        Collection<ResourceLocation> exteriors = ExteriorRegistry.EXTERIOR_REGISTRY.get().getKeys();
////        return context.getSource() instanceof ISuggestionProvider ? ISuggestionProvider.suggestResource(exteriors.stream(), builder) : Suggestions.empty();
//    }
//
////    @Override
////    public Collection<String> getExamples() {
////        return EXAMPLES;
////    }

    public static FixControlsArgument getFixControlsArgument() {
        return new FixControlsArgument();
    }

//    public static AbstractExterior getFixControls(CommandContext<CommandSource> context, String name) throws CommandSyntaxException {
//        ResourceLocation resourcelocation = context.getArgument(name, ResourceLocation.class);
//        AbstractExterior room = ExteriorRegistry.EXTERIOR_REGISTRY.get().getValue(resourcelocation);
//        if (room == null)
//            throw INVALID_EXCEPTION.create(resourcelocation);
//        else
//            return room;
//    }

}
