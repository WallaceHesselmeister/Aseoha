package com.code.common.items;

import com.code.common.entities.Lazer;
import com.code.common.interfaces.IFireArmMagazine;
import com.code.common.registries.AseohaEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

/**
 * Extend this and override GetMaxSize to make a custom magazine
 */
public abstract class AbstractPlasmaBoltMagazine extends Item implements IFireArmMagazine {
    private static final double MAX_SIZE = 2000;
    private int CHARGE = 2000;
    static String CAPACITY = "capacity";

    public AbstractPlasmaBoltMagazine(Properties properties) {
        super(properties);
    }

    @Override
    public void onCraftedBy(ItemStack itemStack, Level level, Player player) {
        super.onCraftedBy(itemStack, level, player);
        CompoundTag nbt = itemStack.getOrCreateTag();
        nbt.putDouble(CAPACITY, 0);
    }

    @Override
    public @NotNull ItemStack getDefaultInstance() {
        ItemStack stack = new ItemStack(this);

        CompoundTag nbt = stack.getOrCreateTag();

        nbt.putDouble(CAPACITY, this.GetMaxSize());

        return stack;
    }


    public AbstractArrow CreatePlasmaBolt(Level world, AbstractPlasmaBoltMagazine Mag, LivingEntity shooter) {
        Lazer PlasmaBoltEntity = new Lazer(AseohaEntities.LAZER.get(), world);
        return PlasmaBoltEntity.createFromConstructor(world, shooter);
    }

    @Override
    public void OnShoot(){
        this.RemoveCharge(10);
    }

    @Override
    public void SetCharge(int i){
        this.CHARGE = i;
    }

    @Override
    public void RemoveCharge(int i){
        this.CHARGE -= i;
    }

    @Override
    public void AddCharge(int i){
        this.CHARGE += i;
    }

    @Override
    public int GetCharge() {
        return this.CHARGE;
    }

    /**
     * Override this to get different magazine capacity
     * @return The Capacity of the magazine
     */
    public double GetMaxSize() {
        return MAX_SIZE;
    }

}
