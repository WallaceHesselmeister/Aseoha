package com.code.aseoha.compat;

import com.code.aseoha.block.Coral;
import com.code.aseoha.items.AseohaItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

import static com.code.aseoha.aseoha.MODID;
import static com.code.aseoha.items.AseohaItems.ITEMS;

public class NoProjectTARDISBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> CORAL = registerBlock("tardis_coral",
            () -> new Coral(Block.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));
    }
}
