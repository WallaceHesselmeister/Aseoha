package com.code.aseoha;

import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class ResourceLocation extends Identifier {
    protected ResourceLocation(String namespace, String path, @Nullable Identifier.ExtraData extraData) {
        super(namespace, path, extraData);
    }
    public ResourceLocation(String namespace, String path) {
        this(validateNamespace(namespace, path), validatePath(namespace, path), (ExtraData)null);
    }

    public static Identifier of(String namespace, String path) {
        return Identifier.of(namespace, path);
    }
}
