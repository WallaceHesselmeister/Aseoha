package com.code.aseoha.backport.ntm;

import com.jozufozu.flywheel.util.vec.Vec3;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Direction;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.tardis.mod.Tardis;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Helper {

    public static final ResourceLocation createRL(String name){
        return new ResourceLocation(Tardis.MODID, name);
    }

    public static Vector3d blockPosToVec3(BlockPos pos, boolean centered) {
        double offset = centered ? 0.5 : 0;
        return new Vector3d(pos.getX() + offset, pos.getY() + offset, pos.getZ() + offset);
    }

    public static <T> Optional<T> readRegistryFromString(CompoundNBT tag, Registry<T> registry, String name) {
        if(tag.contains(name)){
            ResourceLocation rl = new ResourceLocation(tag.getString(name));
            return Optional.of(registry.get(rl));
        }
        return Optional.empty();
    }

    public static <V> void writeRegistryToNBT(CompoundNBT tag, Registry<V> registry, V value, String name){
        ResourceLocation loc = registry.getKey(value);
        if(loc != null){
            tag.putString(name, loc.toString());
        }

    }

    public static <T extends IForgeRegistryEntry<T>> Optional<T> readRegistryFromString(CompoundNBT tag, IForgeRegistry<T> registry, String name) {
        if(tag != null && tag.contains(name)){
            ResourceLocation rl = new ResourceLocation(tag.getString(name));
            return registry.containsKey(rl) ? Optional.ofNullable(registry.getValue(rl)) : Optional.empty();
        }
        return Optional.empty();
    }

    public static <V extends IForgeRegistryEntry<V>> void writeRegistryToNBT(CompoundNBT tag, IForgeRegistry<V> registry, V value, String name){
        ResourceLocation loc = registry.getKey(value);
        if(loc != null){
            tag.putString(name, loc.toString());
        }

    }

    public static <T> Optional<T> readOptionalNBT(CompoundNBT tag, String key, BiFunction<CompoundNBT, String, T> reader) {
        if(tag.contains(key)){
            return Optional.of(reader.apply(tag, key));
        }
        return Optional.empty();
    }

    public static int randomIntWithNegative(Random random, int radius) {
        return radius - random.nextInt(radius * 2);
    }

    public static BlockPos min(BlockPos first, BlockPos second) {
        return new BlockPos(
                Math.min(first.getX(), second.getX()),
                Math.min(first.getY(), second.getY()),
                Math.min(first.getZ(), second.getZ())
        );
    }

    public static BlockPos max(BlockPos first, BlockPos second) {
        return new BlockPos(
                Math.max(first.getX(), second.getX()),
                Math.max(first.getY(), second.getY()),
                Math.max(first.getZ(), second.getZ())
        );
    }

    public static BlockPos scalePos(BlockPos pos, double scale) {
        return new BlockPos(
                Math.floor(pos.getX() * scale),
                Math.floor(pos.getY() * scale),
                Math.floor(pos.getZ() * scale)
        );
    }

    public static VoxelShape blockShapePixels(int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {
        return VoxelShapes.box(minX / 16.0F, minY / 16.0F, minZ / 16.0F,
                maxX / 16.0F, maxY / 16.0F, maxZ / 16.0F);
    }

    /**
     * See {@link #readResourceKey(CompoundNBT, String)}
     * @param tag
     * @param key
     * @param value
     */
    public static void writeResourceKey(@Nullable CompoundNBT tag, String key, @Nullable RegistryKey<?> value) {
        if(value == null || tag == null){
            if(tag != null && tag.contains(key)){
                tag.remove(key);
            }
            return;
        }
        tag.putString(key, value.getRegistryName().toString() + "|" + value.location().toString());
    }

    /**
     * Standard way to read a generic {@link RegistryKey} from nbt
     * @param tag
     * @param key
     * @return
     */
    public static Optional<RegistryKey<?>> readResourceKey(@Nullable CompoundNBT tag, String key){
        if(tag == null || !tag.contains(key)){
            return Optional.empty();
        }
        String[] parts = tag.getString(key).split("|");
        if(parts.length < 2){
            return Optional.empty();
        }
        return Optional.of(RegistryKey.create(
                RegistryKey.createRegistryKey(new ResourceLocation(parts[0])),
                new ResourceLocation(parts[1])
        ));
    }

    public static BlockPos vec3ToBlockPos(Vec3 pos) {
        return new BlockPos(Math.floor(pos.getX()), Math.floor(pos.getY()), Math.floor(pos.getZ()));
    }

    /**
     * @param value
     * @return an {@link Optional} of the value, if the value is null, return {@link Optional#empty()}
     */
    public static <T> Optional<T> nullableToOptional(@Nullable T value) {
        if(value == null)
            return Optional.empty();
        return Optional.of(value);
    }

    public static boolean isRLJson(ResourceLocation rl) {
        return rl.getPath().endsWith(".json");
    }

    public static <T> void writeListNBT(CompoundNBT tag, String name, Collection<T> values, BiConsumer<T, ListNBT> writer) {
        final ListNBT list = new ListNBT();
        for(T item : values){
            writer.accept(item, list);
        }
        tag.put(name, list);
    }

    @SuppressWarnings("unchecked")
    public static <T, N extends INBT> List<T> readListNBT(@Nullable CompoundNBT tag, @Nullable String name, int tagType, Function<N, T> reader){
        final List<T> list = new ArrayList<>();
        if(tag == null || name == null || !tag.contains(name)){
            return list;
        }

        final ListNBT listTag = tag.getList(name, tagType);

        for (INBT inbt : listTag) {
            list.add(reader.apply((N) inbt));
        }

        return list;
    }

    public static void sendHotbarMessage(PlayerEntity pPlayer, TranslationTextComponent translation) {
        if(pPlayer instanceof ServerPlayerEntity){
            ((ServerPlayerEntity) pPlayer).displayClientMessage(translation, true);
        }
    }

    public static void doServerTask(MinecraftServer server, Runnable run) {
        server.execute(new TickDelayedTask(server.getTickCount(), run));
    }

    public static Rotation getRotationFromDirection(Direction dir) {
        switch(dir){
            default: return Rotation.NONE;
            case EAST: return Rotation.CLOCKWISE_90;
            case SOUTH: return Rotation.CLOCKWISE_180;
            case WEST: return Rotation.COUNTERCLOCKWISE_90;
        }
    }

    public static String rlToFileName(String path) {
        final int indexOfSlash = path.lastIndexOf('/');
        final int indexOfDot = path.lastIndexOf('.');

        if(indexOfSlash != -1){
            path = path.substring(indexOfSlash);
        }

        if(indexOfDot != -1){
            path = path.substring(0, indexOfDot);
        }

        return path;
    }

    public static <K, V> Optional<K> getKeyFromValueHashMap(Map<K, V> map, V val) {
        for(Map.Entry<K, V> entry : map.entrySet()){
            if(entry.getValue() == val)
                return Optional.of(entry.getKey());
        }
        return Optional.empty();
    }
}
