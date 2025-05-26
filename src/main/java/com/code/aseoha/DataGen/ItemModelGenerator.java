package com.code.aseoha.DataGen;

import com.code.aseoha.block.AseohaBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemModelGenerator extends ItemModelProvider {


    public ItemModelGenerator(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (RegistryObject<Block> blockObj : AseohaBlocks.BLOCKS.getEntries()) {
            Block block = blockObj.get();
            String blockName = ForgeRegistries.BLOCKS.getKey(block).getPath();
            ResourceLocation loc;
            String stripped;

            if(blockName.contains("hb_")) stripped = "hb";
            else if(blockName.contains("meglos")) stripped = "meglos";
            else if(blockName.contains("roundel") && !blockName.contains("copper")) stripped = "roundel";
            else if(blockName.contains("froglight")) stripped = "froglight";
            else if(blockName.contains("controls")) stripped = "controls";
            else if(blockName.contains("alabaster")) stripped = "alabaster";
            else if(blockName.contains("railing")) stripped = "decoration";
            else if(blockName.contains("coral")) stripped = "coral";
            else if(blockName.contains("copper")) stripped = "copper";


            else stripped = "";

            switch (stripped) {

                case "hb":
                    loc = modLoc("block/hellbent/" + blockName);
                    break;
                case "meglos":
                    loc = modLoc("block/meglos/" + blockName);
                    break;
                case "roundel":
                    loc = modLoc("block/roundel/" + blockName);
                    break;
                case "froglight":
                    loc = modLoc("block/froglight/" + blockName);
                    break;
                case "controls":
                    loc = modLoc("block/controls/" + blockName);
                    break;
                case "alabaster":
                    loc = modLoc("block/alabaster/" + blockName);
                    break;
                case "decoration":
                    loc = modLoc("block/decoration/" + blockName);
                    break;
                case "coral":
                    loc = modLoc("block/coral/" + blockName);
                    break;
                case "copper":
                    loc = modLoc("block/copper/" + blockName);
                    break;
                default:
                    loc = modLoc("block/" + blockName);
                    break;
            }
            try {
                withExistingParent(blockName, loc);
            }
            catch (IllegalStateException ignored) {
                System.out.println("Block model does not exist: " + blockName);
            }
        }
    }
}