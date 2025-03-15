package com.code.aseoha.enums;

import net.minecraft.util.IStringSerializable;
import org.jetbrains.annotations.NotNull;

public enum EnumConnectionTypes implements IStringSerializable {
    SINGLE("single"),
    NORTH("north"),
    EAST("east"),
    SOUTH("south"),
    WEST("west"),
    UP("up"),
    DOWN("down"),
    NORTH_EAST("north_east"),
    NORTH_WEST("north_west"),
    NORTH_SOUTH("north_south"),
    NORTH_UP("north_up"),
    NORTH_DOWN("north_down"),
    EAST_SOUTH("east_south"),
    EAST_WEST("east_west"),
    EAST_UP("east_up"),
    EAST_DOWN("east_down"),
    SOUTH_WEST("south_west"),
    SOUTH_UP("south_up"),
    SOUTH_DOWN("south_down"),
    WEST_UP("west_up"),
    WEST_DOWN("west_down"),
    UP_DOWN("up_down"),
    NORTH_EAST_SOUTH("north_east_south"),
    NORTH_EAST_WEST("north_east_west"),
    NORTH_EAST_UP("north_east_up"),
    NORTH_EAST_DOWN("north_east_down"),
    NORTH_SOUTH_WEST("north_south_west"),
    NORTH_SOUTH_UP("north_south_up"),
    NORTH_SOUTH_DOWN("north_south_down"),
    NORTH_WEST_UP("north_west_up"),
    NORTH_WEST_DOWN("north_west_down"),
    NORTH_UP_DOWN("north_up_down"),
    EAST_SOUTH_WEST("east_south_west"),
    EAST_SOUTH_UP("east_south_up"),
    EAST_SOUTH_DOWN("east_south_down"),
    EAST_WEST_UP("east_west_up"),
    EAST_WEST_DOWN("east_west_down"),
    EAST_UP_DOWN("east_up_down"),
    SOUTH_WEST_UP("south_west_up"),
    SOUTH_WEST_DOWN("south_west_down"),
    SOUTH_UP_DOWN("south_up_down"),
    WEST_UP_DOWN("west_up_down"),
    NORTH_EAST_SOUTH_WEST("north_east_south_west"),
    NORTH_EAST_SOUTH_UP("north_east_south_up"),
    NORTH_EAST_SOUTH_DOWN("north_east_south_down"),
    NORTH_EAST_WEST_UP("north_east_west_up"),
    NORTH_EAST_WEST_DOWN("north_east_west_down"),
    NORTH_EAST_UP_DOWN("north_east_up_down"),
    NORTH_SOUTH_WEST_UP("north_south_west_up"),
    NORTH_SOUTH_WEST_DOWN("north_south_west_down"),
    NORTH_SOUTH_UP_DOWN("north_south_up_down"),
    NORTH_WEST_UP_DOWN("north_west_up_down"),
    EAST_SOUTH_WEST_UP("east_south_west_up"),
    EAST_SOUTH_WEST_DOWN("east_south_west_down"),
    EAST_SOUTH_UP_DOWN("east_south_up_down"),
    EAST_WEST_UP_DOWN("east_west_up_down"),
    SOUTH_WEST_UP_DOWN("south_west_up_down"),
    NORTH_EAST_SOUTH_WEST_UP("north_east_south_west_up"),
    NORTH_EAST_SOUTH_WEST_DOWN("north_east_south_west_down"),
    NORTH_EAST_SOUTH_UP_DOWN("north_east_south_up_down"),
    NORTH_EAST_WEST_UP_DOWN("north_east_west_up_down"),
    NORTH_SOUTH_WEST_UP_DOWN("north_south_west_up_down"),
    EAST_SOUTH_WEST_UP_DOWN("east_south_west_up_down"),
    NORTH_EAST_SOUTH_WEST_UP_DOWN("north_east_south_west_up_down");

    private final String name;

    EnumConnectionTypes(String name) {
        this.name = name;
    }

    @NotNull
    public String getSerializedName() {
        return this.name;
    }
}