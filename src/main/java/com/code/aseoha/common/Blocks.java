package com.code.aseoha.common;

import com.code.aseoha.common.blocks.DirectionalBlockNESW;
import io.wispforest.owo.itemgroup.OwoItemSettings;
import io.wispforest.owo.registration.reflect.BlockRegistryContainer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.item.BlockItem;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.ToIntFunction;

public class Blocks implements BlockRegistryContainer {

    public static final Block LATINUM_BLOCK = new Block(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ANVIL));
    public static final Block BLUE_CRYSTAL = new Block(AbstractBlock.Settings.create());

    //****************************** ROUNDELS **********************************//
//    public static final Block BASE_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block ACACIA_PLANKS_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block BAMBOO_PLANKS_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block BIRCH_PLANKS_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block BLACK_CONCRETE_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block BLUE_CONCRETE_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block BLUE_WOOL_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block BROWN_WOOL_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block BROWN_CONCRETE_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block CLAY_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block CHERRY_PLANKS_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block COBBLED_DEEPSLATE_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block COBBLESTONE_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block COPPER_BLOCK_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block CRIMSON_PLANKS_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block CUT_COPPER_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block CYAN_CONCRETE_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block CYAN_WOOL_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block DARK_OAK_PLANKS_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block DEEPSLATE_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block EXPOSED_COPPER_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block EXPOSED_CUT_COPPER_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block GRAY_CONCRETE_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block GRAY_WOOL_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block GREEN_CONCRETE_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());
    public static final Block GREEN_WOOL_ROUNDEL = new Block(AbstractBlock.Settings.create().nonOpaque());

    //***************************** OFFSET ROUNDEL *******************************//
    public static final Block ACACIA_ROUNDEL_OFFSET = new DirectionalBlockNESW(AbstractBlock.Settings.create());
    //***************************** HEX ROUNDEL **********************************//
    public static final Block BLACK_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block BLUE_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block CYAN_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block GRAY_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block GREEN_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block LIGHT_BLUE_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block LIGHT_GREY_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block LIME_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block MAGENTA_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block ORANGE_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block PINK_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block PURPLE_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block RED_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block WHITE_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
    public static final Block YELLOW_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
//    public static final Block BLACK_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
//    public static final Block BLACK_CONCRETE_HEX_ROUNDEL = new DirectionalBlockNESW(AbstractBlock.Settings.create().nonOpaque());
//ElytraEntityModel
    @Contract(pure = true)
    public static @NotNull ToIntFunction<BlockState> setLight(int value){
        value = (value < 0 || value > 15) ? 15 : value;
        int finalValue = value;
        return BlockState -> finalValue;
    }

    @Override
    public BlockItem createBlockItem(Block block, String identifier) {
        return new BlockItem(block, new OwoItemSettings().group(ItemGroup.aseohaGroup));
    }
}