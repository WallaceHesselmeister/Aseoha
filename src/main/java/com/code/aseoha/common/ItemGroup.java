package com.code.aseoha.common;

import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import net.minecraft.util.Identifier;

import static com.code.aseoha.aseoha.MOD_ID;

public class ItemGroup {
    public static final OwoItemGroup aseohaGroup = OwoItemGroup
            .builder(new Identifier(MOD_ID, "aseoha_item_group"), () -> Icon.of(Items.ROUNDEL_MOLD))
            // additional builder configuration goes between these lines
            .build();
}
