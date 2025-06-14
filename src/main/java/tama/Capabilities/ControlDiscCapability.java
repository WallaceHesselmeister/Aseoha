/* (C) TAMA Studios 2025 */
package tama.Capabilities;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import tama.Capabilities.Interfaces.IControlDiscCapability;

import java.util.Optional;

public class ControlDiscCapability implements IControlDiscCapability {
    public static final int powerRequired = 100;
    public Optional<ResourceKey<Level>> boundLevel = Optional.empty();
    final ItemStack item;
    public Optional<BlockPos> blockPos = Optional.empty();

    public ControlDiscCapability(ItemStack item) {
        this.item = item;
    }

    public ItemStack getItem() {
        return this.item;
    }

    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        this.boundLevel.ifPresent((key) -> {
            tag.putString("level", key.location().toString());
        });

        this.blockPos.ifPresent((pos) -> {
            tag.putInt("posX", pos.getX());
            tag.putInt("posY", pos.getY());
            tag.putInt("posZ", pos.getZ());
        });
        return tag;
    }

    public void deserializeNBT(CompoundTag tag) {
        if (tag.contains("level")) {
            this.boundLevel =
                    Optional.of(ResourceKey.create(Registries.DIMENSION, new ResourceLocation(tag.getString("level"))));
        }
        if (tag.contains("posX") && tag.contains("posY") && tag.contains("posZ")) {
            BlockPos pos = new BlockPos(tag.getInt("posX"), tag.getInt("posY"), tag.getInt("posZ"));
            this.blockPos = Optional.of(pos);
        }
    }

    @Override
    public void setDiscLevel(@Nullable ResourceKey<Level> var1) {
        this.boundLevel = Optional.ofNullable(var1);
    }

    @Override
    public void setDiscBlockPos(@Nullable BlockPos var1) {
        this.blockPos = Optional.ofNullable(var1);
    }

    @Override
    public Optional<ResourceKey<Level>> getDiscLevel() {
        return this.boundLevel;
    }

    @Override
    public Optional<BlockPos> getDiscBlockPos() {
        return this.blockPos;
    }
}
