package com.code.common.enums;

import com.code.common.interfaces.ISonicInteractionType;
import net.minecraft.network.chat.Component;

public enum SonicInteractionType implements ISonicInteractionType {
    BLOCKS(Component.translatable("aseoha.sonic.mode.block")),
    SCANNER(Component.translatable("aseoha.sonic.mode.scanner")),
    ENTITY(Component.translatable("aseoha.sonic.mode.entity"));

    private final Component Name;
    SonicInteractionType(Component Name) {
        this.Name = Name;
    }
    @Override
    public Component Name() {
        return this.Name;
    }
}
