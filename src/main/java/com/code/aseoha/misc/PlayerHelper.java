package com.code.aseoha.misc;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public class PlayerHelper {
    public static void decreaseExp(PlayerEntity player, int amount) {
        player.giveExperiencePoints(-amount);
    }
    public static void increaseExp(PlayerEntity player, int amount){
        player.giveExperiencePoints(amount);
    }
    public static void giveItemStack(PlayerEntity player, IItemProvider item, int amount){
        player.addItem(new ItemStack(item, amount));
    }
    public static void removeItemInHand(PlayerEntity player, Hand hand, int amount){
        ItemStack itemstack = player.getItemInHand(hand);
        itemstack.shrink(amount);
    }

    public static Vector3d getVectorForRotation(float pitch, float yaw) {
        float f = pitch * ((float)Math.PI / 180F);
        float f1 = -yaw * ((float)Math.PI / 180F);
        float f2 = MathHelper.cos(f1);
        float f3 = MathHelper.sin(f1);
        float f4 = MathHelper.cos(f);
        float f5 = MathHelper.sin(f);
        return new Vector3d((double)(f3 * f4), (double)(-f5), (double)(f2 * f4));
    }
}
