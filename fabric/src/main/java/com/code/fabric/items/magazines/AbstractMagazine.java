package com.code.fabric.items.magazines;


import com.code.common.interfaces.IFireArmMagazine;
import com.code.fabric.entities.Lazer;
import com.code.fabric.registries.AseohaEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Extend this and override GetMaxSize to make a custom magazine
 */
public abstract class AbstractMagazine extends Item implements IFireArmMagazine {
    private static final short MAX_AMMUNITION = 32;
    private short AMMUNITION = 32;
    static String CAPACITY = "capacity";

    public AbstractMagazine(Properties properties) {
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


    public AbstractArrow CreatePlasmaBolt(Level world, AbstractMagazine Mag, LivingEntity shooter) {
        Lazer PlasmaBoltEntity = new Lazer(AseohaEntities.LAZER.get(), world);
        return PlasmaBoltEntity.createFromConstructor(world, shooter);
    }

    @Override
    public void OnShoot(){
        this.RemoveRounds((short) 10);
    }

    @Override
    public void SetRounds(short i){
        this.AMMUNITION = i;
    }

    @Override
    public void RemoveRounds(short i){
        this.AMMUNITION -= i;
    }

    @Override
    public void AddRounds(short i){
        this.AMMUNITION += i;
    }

    @Override
    public short GetRounds() {
        return this.AMMUNITION;
    }

    public short GetMaxSize() {
        return MAX_AMMUNITION;
    }

    @Override
    public short LoadAmmo(short Ammo) {
        Ammo = (short) (AMMUNITION - Ammo);
        this.AMMUNITION -= Ammo;
        return Ammo;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        int charge = this.GetRounds();
        String Amount = charge == 0 ? String.valueOf(Component.translatable("tooltip.aseoha.plasma_rifle.empty")) : Integer.toString(charge);
        tooltip.add(Component.translatable("tooltip.aseoha.plasma_rifle_charge").append(": ").append(Amount));
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
