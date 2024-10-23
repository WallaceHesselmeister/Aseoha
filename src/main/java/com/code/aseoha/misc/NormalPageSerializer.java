package com.code.aseoha.misc;

import com.code.aseoha.misc.PageSerializer;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;

import java.util.List;

public class NormalPageSerializer extends PageSerializer {

    public NormalPageSerializer() {
        super(str -> str.contentEquals("normal"));
    }

    @Override
    public List<com.code.aseoha.misc.Page> read(JsonObject root) {

        if(!root.has("text"))
            return Lists.newArrayList();

        List<com.code.aseoha.misc.Page> pages = Lists.newArrayList();

        com.code.aseoha.misc.Page page = new com.code.aseoha.misc.Page();
        String leftovers = page.parseString(root.get("text").getAsString());
        pages.add(page);

        //Handle overfill
        while(!leftovers.isEmpty()){
            com.code.aseoha.misc.Page p = new com.code.aseoha.misc.Page();
            leftovers = p.parseString(leftovers);
            pages.add(p);
        }

        return pages;
    }
}
