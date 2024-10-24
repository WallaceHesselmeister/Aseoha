package com.code.aseoha.DataGen;

import com.code.aseoha.aseoha;
import com.code.aseoha.block.AseohaBlocks;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.nio.file.Path;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.minecraft.block.Block;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlockStateGen implements IDataProvider {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();
    private final DataGenerator generator;

    public BlockStateGen(DataGenerator p_i232520_1_) {
        this.generator = p_i232520_1_;
    }

    @Override
    public void run(DirectoryCache p_200398_1_) {
        Path path = this.generator.getOutputFolder();
        Map<Block, IFinishedBlockState> map = Maps.newHashMap();
        Consumer<IFinishedBlockState> consumer = (p_240085_1_) -> {
            Block block = p_240085_1_.getBlock();
            if(block.getRegistryName().getNamespace().equals(aseoha.MODID)) {
                IFinishedBlockState ifinishedblockstate = map.put(block, p_240085_1_);
                if (ifinishedblockstate != null) {
                    throw new IllegalStateException("Duplicate blockstate definition for " + block);
                }
            }
        };

        Map<ResourceLocation, Supplier<JsonElement>> map1 = Maps.newHashMap();
        Set<Item> set = Sets.newHashSet();
        BiConsumer<ResourceLocation, Supplier<JsonElement>> biconsumer = (p_240086_1_, p_240086_2_) -> {
            if(p_240086_1_.getNamespace().equals(aseoha.MODID)) {
                Supplier<JsonElement> supplier = map1.put(p_240086_1_, p_240086_2_);
                if (supplier != null) {
                    throw new IllegalStateException("Duplicate model definition for " + p_240086_1_);
                }
            }
        };
        Consumer<Item> consumer1 = set::add;
        (new BlockModelProvider(consumer, biconsumer, consumer1)).run();
        (new ItemModelProvider(biconsumer)).run();
        List<RegistryObject<Block>> regBlocks = AseohaBlocks.BLOCKS.getEntries().stream().filter((p_240084_1_) -> {
            if(p_240084_1_.get().getRegistryName().getNamespace().equals(aseoha.MODID))
                return !map.containsKey(p_240084_1_.get());
            return false;
        }).collect(Collectors.toList());
        List<Block> list = new ArrayList<>();
        regBlocks.forEach(block -> {
            list.add(block.get());
        });

            AseohaBlocks.BLOCKS.getEntries().forEach((blockRegistryObject) -> {
                Block p_240087_2_ = blockRegistryObject.get();

                    Item item = Item.BY_BLOCK.get(p_240087_2_);
                    if (item != null) {
                        if (set.contains(item)) {
                            return;
                        }

                        ResourceLocation resourcelocation = ModelsResourceUtil.getModelLocation(item);
                        if (!map1.containsKey(resourcelocation)) {
                            map1.put(resourcelocation, new BlockModelWriter(ModelsResourceUtil.getModelLocation(p_240087_2_)));
                        }
                    }
            });
            this.saveCollection(p_200398_1_, path, map, BlockStateGen::createBlockStatePath);
            this.saveCollection(p_200398_1_, path, map1, BlockStateGen::createModelPath);
    }


    private <T> void saveCollection(DirectoryCache p_240081_1_, Path p_240081_2_, Map<T, ? extends Supplier<JsonElement>> p_240081_3_, BiFunction<Path, T, Path> p_240081_4_) {
        p_240081_3_.forEach((p_240088_3_, p_240088_4_) -> {
            Path path = p_240081_4_.apply(p_240081_2_, p_240088_3_);

            try {
                IDataProvider.save(GSON, p_240081_1_, p_240088_4_.get(), path);
            } catch (Exception exception) {
                LOGGER.error("Couldn't save {}", path, exception);
            }

        });
    }

    private static Path createBlockStatePath(Path p_240082_0_, Block p_240082_1_) {
        ResourceLocation resourcelocation = Registry.BLOCK.getKey(p_240082_1_);
        if(resourcelocation.getNamespace().equals(aseoha.MODID))
            return p_240082_0_.resolve("assets/" + resourcelocation.getNamespace() + "/blockstates/" + resourcelocation.getPath() + ".json");
        return null;
    }

    private static Path createModelPath(Path p_240083_0_, ResourceLocation p_240083_1_) {
        if(p_240083_1_.getNamespace().equals(aseoha.MODID))
            return p_240083_0_.resolve("assets/" + p_240083_1_.getNamespace() + "/models/" + p_240083_1_.getPath() + ".json");
        return null;
    }

    @Override
    public String getName() {
        return "Aseoha Block State Definitions";
    }
}