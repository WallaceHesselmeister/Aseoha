package com.code;

import com.code.common.GrammarNazi;
import com.code.common.Util;
import com.code.common.blocks.IAmARoundel;
import com.code.common.blocks.NESWBlock;
import com.code.common.blocks.RoundelBlock;
import com.code.common.registries.AseohaBlocks;
import com.code.common.registries.AseohaEntities;
import com.code.common.registries.AseohaItems;
import com.code.common.items.AseohaTabs;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import dev.architectury.platform.Platform;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityEvent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class aseoha {
    public static final String MOD_ID = "aseoha";
    public static final Supplier<RegistrarManager> MANAGER = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        // Write common init code here.
        AseohaItems.ITEMS.register();
        AseohaTabs.TABS.register();
        AseohaBlocks.register();

        /** If this is true then ASEOHA will attempt to make roundels for every. single. block. registered.
         * With only ASEOHA, Minecraft, and AIT installed, it works rather well, however, havn't tested it beyond that, forge support is questionable, and item textures are missing
         * In order for this to work you need to make a new item deferred register, replace the ITEMS register from here \/ with your register, and register the register below this forEach, and replace the BLOCKS register with your own too
         * (that's a lot of registering)
         **/
        if (false)
            BuiltInRegistries.BLOCK.forEach((block) -> {
                if (block instanceof Block && GrammarNazi.FullIDFromBlock(block).contains("minecraft") && !GrammarNazi.IDFromBlock(block).contains("air")) {
                    RegistrySupplier<Block> reg = AseohaBlocks.BLOCKS.register(GrammarNazi.IDFromBlock(block) + "_roundel_facade",
                            () -> new RoundelBlock(
                                    BlockBehaviour.Properties.of().noOcclusion().explosionResistance(block.getExplosionResistance()).sound(block.getSoundType(block.defaultBlockState())).friction(block.getFriction()).speedFactor(block.getSpeedFactor()),
                                    block, GrammarNazi.IDFromBlock(block), false));
                    AseohaItems.ITEMS.register(
                            GrammarNazi.IDFromBlock(block) + "_roundel_facade",
                            () -> new BlockItem(reg.get(), new Item.Properties().arch$tab(AseohaTabs.GENERATED_ROUNDEL_TAB))
                    );
//                    }

                }
            });
//        }

        if (Platform.isFabric()) {
            AseohaBlocks.BLOCKS.forEach(blockRegistrySupplier -> AseohaItems.ITEMS.register(GrammarNazi.IDFromBlock(blockRegistrySupplier.get()), () -> new BlockItem(blockRegistrySupplier.get(), new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB))));

            AseohaBlocks.ROUNDELS_LIT.forEach(blockRegistrySupplier -> AseohaItems.ITEMS.register(GrammarNazi.IDFromBlock(blockRegistrySupplier.get()), () -> new BlockItem(blockRegistrySupplier.get(), new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB))));

            AseohaBlocks.ALTERNATING_ROUNDELS.forEach(blockRegistrySupplier -> AseohaItems.ITEMS.register(GrammarNazi.IDFromBlock(blockRegistrySupplier.get()), () -> new BlockItem(blockRegistrySupplier.get(), new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB))));

            AseohaBlocks.BLUE_ROUNDELS.forEach(blockRegistrySupplier -> AseohaItems.ITEMS.register(GrammarNazi.IDFromBlock(blockRegistrySupplier.get()), () -> new BlockItem(blockRegistrySupplier.get(), new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB))));
            //        if(Platform.isFabric())
//            AseohaBlocks.AUTOMATICALLY_GENERATED_ROUNDELS.forEach(blockRegistrySupplier -> AseohaItems.GENERATED_ROUNDELS.register(GrammarNazi.IDFromBlock(blockRegistrySupplier.get()), () -> new BlockItem(blockRegistrySupplier.get(), new Item.Properties().arch$tab(AseohaTabs.GENERATED_ROUNDEL_TAB))));
        }
//    }
        /** Platform specific code for entities, mainly K-9 **/
        if (Platform.isForge())
            AseohaEntities.ENTITY_TYPES.register();
    }
}