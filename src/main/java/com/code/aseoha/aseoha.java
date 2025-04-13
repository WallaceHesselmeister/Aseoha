package com.code.aseoha;

import com.code.aseoha.common.Blocks;
import com.code.aseoha.common.ItemGroup;
import com.code.aseoha.common.Items;
import com.code.aseoha.common.structures.Structures;
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;

public class aseoha implements ModInitializer {
    public static String MOD_ID = "aseoha";

    @Override
    public void onInitialize() {
        ItemGroup.aseohaGroup.initialize();
        FieldRegistrationHandler.register(Items.class, MOD_ID, false);
        FieldRegistrationHandler.register(Blocks.class, MOD_ID, false);

        Structures.registerStructureFeatures();
    }
}