package com.code.aseoha.DataGen;

import com.code.aseoha.aseoha;
import com.code.aseoha.items.AseohaItems;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mistersecret312.temporal_api.ItemTagsInit;
import org.jetbrains.annotations.Nullable;

public class ItemTagsGen extends ItemTagsProvider {

    public ItemTagsGen(DataGenerator dataGenerator, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagsProvider, aseoha.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        add(ItemTagsInit.SONIC, AseohaItems.SONIC_SCREWDRIVER.get(), AseohaItems.SONIC_WIIMOTE.get(), AseohaItems.sonic_fourteenth.get());
        add(ItemTagsInit.MANUAL, AseohaItems.MANUAL.get());
    }

    public void add(ITag.INamedTag<Item> branch, Item item) {
        this.tag(branch).add(item);
    }

    public void add(ITag.INamedTag<Item> branch, Item... item) {
        this.tag(branch).add(item);
    }
}