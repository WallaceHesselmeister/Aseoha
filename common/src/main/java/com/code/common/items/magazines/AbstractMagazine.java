package com.code.common.items.magazines;

import com.code.common.entities.Lazer;
import com.code.common.enums.AmmoType;
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
public abstract class AbstractMagazine extends Item implements IFireArmMagazine {
    private static final short MAX_AMMUNITION = 32;
    private short AMMUNITION;
    private final AmmoType TYPE = AmmoType.NINE_MILLIMETER;
    static String CAPACITY = "capacity";
    static String ROUNDS = "rounds";

    public AbstractMagazine(Properties properties) {
        super(properties);
    }

    @Override
    public void onCraftedBy(ItemStack itemStack, Level level, Player player) {
        super.onCraftedBy(itemStack, level, player);
        CompoundTag nbt = itemStack.getOrCreateTag();
        nbt.putShort(CAPACITY, (short) 0);
        nbt.putShort(ROUNDS, (short) 0);
    }

    @Override
    public @NotNull ItemStack getDefaultInstance() {
        ItemStack stack = new ItemStack(this);

        CompoundTag nbt = stack.getOrCreateTag();

        nbt.putShort(CAPACITY, this.GetMaxSize());

        nbt.putShort(ROUNDS, this.GetRounds());

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
    public int Empty(){
        int Amount = this.AMMUNITION;
        this.AMMUNITION = 0;
        return Amount;
    }

    @Override
    public short GetRounds() {
        return this.AMMUNITION;
    }

    public short GetMaxSize() {
        return MAX_AMMUNITION;
    }

    public AmmoType GetAmmoType(){
        return this.TYPE;
    }

    @Override
    public short LoadAmmo(short Ammo) {
        Ammo = (short) (AMMUNITION - Ammo);
        this.AMMUNITION -= Ammo;
        return Ammo;
    }
}
