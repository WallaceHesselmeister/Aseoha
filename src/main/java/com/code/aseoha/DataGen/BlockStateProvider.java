package com.code.aseoha.DataGen;

import com.google.common.annotations.VisibleForTesting;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.IGeneratedBlockstate;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BlockStateProvider implements IDataProvider {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();

    @VisibleForTesting
    protected final Map<Block, IGeneratedBlockstate> registeredBlocks = new LinkedHashMap<>();

    private final DataGenerator generator;
    private final String modid;
    private final BlockModelProvider blockModels;
    private final ItemModelProvider itemModels;

    public BlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        this.generator = gen;
        this.modid = modid;
        this.blockModels = new BlockModelProvider(gen, modid, exFileHelper) {
            @Override
            protected void registerModels() {
            }
        };
        this.itemModels = new ItemModelProvider(gen, modid, this.blockModels.existingFileHelper) {
            @Override
            protected void registerModels() {
            }
        };
    }

//    @Override
//    public void run(DirectoryCache cache) throws IOException {
////        models().clear();
////        itemModels().clear();
////        registeredBlocks.clear();
////        registerStatesAndModels();
////        models().generateAll(cache);
////        itemModels().generateAll(cache);
////        for (Map.Entry<Block, IGeneratedBlockstate> entry : registeredBlocks.entrySet()) {
////            saveBlockState(cache, entry.getValue().toJson(), entry.getKey());
////        }
//
//    }
}