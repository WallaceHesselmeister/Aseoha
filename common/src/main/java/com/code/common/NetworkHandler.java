package com.code.common;

import dev.architectury.networking.NetworkChannel;
import dev.architectury.networking.NetworkManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import static com.code.aseoha.MOD_ID;

public class NetworkHandler {
    public static final ResourceLocation OFFHAND_REMOVE_PACKET_ID = new ResourceLocation(MOD_ID, "offhand_remove");
    public static final ResourceLocation IGNITE_CREEPER_PACKET_ID = new ResourceLocation(MOD_ID, "ignite_creeper");
    public static final ResourceLocation KILL_ENTITY = new ResourceLocation(MOD_ID, "kill_entity");
    public static final ResourceLocation CURE_VILLAGER = new ResourceLocation(MOD_ID, "cure_villager");
    public static final NetworkChannel CHANNEL = NetworkChannel.create(new ResourceLocation(MOD_ID, "networking_channel"));
    public static void RegisterPackets() {

        /** Remove Offhand Item **/
        NetworkManager.registerReceiver(NetworkManager.Side.C2S, NetworkHandler.OFFHAND_REMOVE_PACKET_ID, (buf, context) -> {
            Player player = context.getPlayer();
            player.setItemSlot(EquipmentSlot.OFFHAND, ItemStack.EMPTY);
        });

        /** Ignite Creeper **/
        NetworkManager.registerReceiver(NetworkManager.Side.C2S, NetworkHandler.IGNITE_CREEPER_PACKET_ID, (buf, context) -> {
            Entity EntityToIgnite = context.getPlayer().level().getServer().getLevel(context.getPlayer().level().dimension()).getEntity(buf.readUUID());
            assert EntityToIgnite != null;
            ((Creeper) EntityToIgnite).ignite();
        });

        /** Kill Entity **/
        NetworkManager.registerReceiver(NetworkManager.Side.C2S, NetworkHandler.KILL_ENTITY, (buf, context) -> {
            Entity EntityToIgnite = context.getPlayer().level().getServer().getLevel(context.getPlayer().level().dimension()).getEntity(buf.readUUID());
            assert EntityToIgnite != null;
            EntityToIgnite.kill();
        });

        /** Cure Zombie Villager **/
        NetworkManager.registerReceiver(NetworkManager.Side.C2S, NetworkHandler.CURE_VILLAGER, (buf, context) -> {
            Entity EntityToCure = context.getPlayer().level().getServer().getLevel(context.getPlayer().level().dimension()).getEntity(buf.readUUID());
            assert EntityToCure != null;
            ((ZombieVillager) EntityToCure).convertTo(EntityType.VILLAGER, true);
        });
    }
}
