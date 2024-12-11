package com.code.fabric.items;

import com.code.common.interfaces.IFireArm;
import com.code.fabric.registries.AseohaItems;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractFirearm extends BowItem implements IFireArm {
    AbstractPlasmaBoltMagazine Mag;
    /**
     * The amount of energy to consume every shot
     **/
    private int CONSUME_RATE;

    private boolean Switch = false;

    private int Damage;

    public AbstractFirearm(Properties settings) {
        super(settings);
    }

    @Override
    public void releaseUsing(ItemStack itemStack, Level level, LivingEntity livingEntity, int i) {
        this.Shoot(itemStack, level, livingEntity, i);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if (player.isCrouching()) {
            this.Switch = true;
            if (this.Mag != null) player.addItem(this.Mag.getDefaultInstance());
            this.Mag = null;
            if (player.getItemBySlot(EquipmentSlot.OFFHAND).getItem().equals(AseohaItems.PLASMA_BOLT_MAGAZINE.get())) {
                this.Mag = ((AbstractPlasmaBoltMagazine) player.getItemBySlot(EquipmentSlot.OFFHAND).getItem());
                player.setItemSlot(EquipmentSlot.OFFHAND, ItemStack.EMPTY);
            }
        }
        return super.use(level, player, interactionHand);
    }


    /** The amount of energy to drain from the magazine **/
    public int GetConsumeRate() {
        return this.CONSUME_RATE;
    }

    /** The amount of energy to drain from the magazine **/
    public void SetConsumeRate(int i) {
        this.CONSUME_RATE = i;
    }

    /** The amount of energy to drain from the magazine **/
    public int GetDamage() {
        return this.Damage;
    }

    /** The amount of energy to drain from the magazine **/
    public void SetDamage(int i) {
        this.Damage = i;
    }

    public void Shoot(ItemStack itemStack, Level level, LivingEntity livingEntity, int i) {
        if (livingEntity instanceof Player player) {

            boolean bl = player.getAbilities().instabuild || this.Mag.GetCharge() >= CONSUME_RATE;
            if (bl) {

                int j = this.getUseDuration(itemStack) - i;
                float f = getPowerForTime(j);
                if (!level.isClientSide) {
                    if(this.Switch){
                        this.Switch = false;
                        return;
                    }
                    if(this.Mag == null) return;
                    AbstractArrow lazer = this.Mag.CreatePlasmaBolt(level, this.Mag, livingEntity);

                    lazer.setBaseDamage(this.GetDamage());

                    lazer.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, f * 3.0F, 1.0F);

                    if (f == 1.0F) {
                        lazer.setCritArrow(true);
                    }

                    int enchantmentLevel = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, itemStack);

                    if (enchantmentLevel > 0) {
                        lazer.setBaseDamage(lazer.getBaseDamage() + (double) enchantmentLevel * 0.5 + 0.5);
                    }

                    itemStack.hurtAndBreak(1, player, (player2) -> player2.broadcastBreakEvent(player.getUsedItemHand()));

                    this.Mag.OnShoot();

                    level.addFreshEntity(lazer);
                }

                level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS, 1.0F, 1.0F / (level.getRandom().nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                player.awardStat(Stats.ITEM_USED.get(this));
            }
        }
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        int charge = this.Mag == null ? 0 : this.Mag.GetCharge();
        tooltip.add(Component.translatable("tooltip.aseoha.plasma_rifle").append(" || ").append(Component.translatable("tooltip.aseoha.plasma_rifle_charge").append(": ").append(
                charge == 0 ? Component.translatable("tooltip.aseoha.plasma_rifle.empty").toString() : Integer.toString(charge)
        )));
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}