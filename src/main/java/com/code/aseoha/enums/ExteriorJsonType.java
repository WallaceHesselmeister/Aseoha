package com.code.aseoha.enums;

import com.code.aseoha.data.DataPackVortex;
import com.code.aseoha.misc.IExteriorJsonType;
import net.tardis.mod.misc.TexVariant;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public enum ExteriorJsonType implements IExteriorJsonType {
    COLIN_RICHMOND("colin_richmond"),
    STEAM("steam");

    ExteriorJsonType(String name) {
        this.name = name;
    }

    public final String name;

    @Override
    public String GetJsonName() {
        return this.name;
    }

    @Override
    public void AddVariant(DataPackVortex dataPackExterior) {
        TexVariant variant = new TexVariant(dataPackExterior.getTexture(), dataPackExterior.getTranslationKey());

        //TODO: finish data stuffs!

    }

    public static ExteriorJsonType GetFromJSON(String Exterior_type) {
        AtomicReference<ExteriorJsonType> exteriorJsonTypeAtomicReference = new AtomicReference<>();
        Arrays.stream(ExteriorJsonType.values()).forEach(exteriorJsonType -> {
            if (exteriorJsonType.GetJsonName().equals(Exterior_type))
                exteriorJsonTypeAtomicReference.set(exteriorJsonType);
        });
        return exteriorJsonTypeAtomicReference.get();
    }
}