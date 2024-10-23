package com.code.aseoha.misc;

import com.google.gson.JsonObject;

import java.util.List;
import java.util.function.Predicate;

public abstract class PageSerializer {

    Predicate<String> type;

    public PageSerializer(Predicate<String> type){
        this.type = type;
    }

    public boolean match(String type){
        return this.type.test(type);
    }

    public abstract List<Page> read(JsonObject root);

}