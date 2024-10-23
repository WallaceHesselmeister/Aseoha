package com.code.aseoha.misc;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public class CoverPageSerializer extends PageSerializer {

    public CoverPageSerializer() {
        super(str -> str.contentEquals("cover"));
    }

    @Override
    public List<com.code.aseoha.misc.Page> read(JsonObject root) {
        com.code.aseoha.misc.CoverPage page = new com.code.aseoha.misc.CoverPage();

        page.setTitle(root.get("title").getAsString());

        if(root.has("icon"))
            page.setIcon(new ResourceLocation(root.get("icon").getAsString()));

        return Lists.newArrayList(page);
    }
}
