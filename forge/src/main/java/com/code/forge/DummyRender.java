package com.code.forge;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.server.ServerLifecycleHooks;

public class DummyRender extends EntityRenderer {
    protected DummyRender(EntityRendererProvider.Context arg) {
        super(arg);
    }

    @Override
    public ResourceLocation getTextureLocation(Entity arg) {
        Player player = ServerLifecycleHooks.getCurrentServer().getPlayerList().getPlayerByName("[PlayerNameToGrab]");
        return Minecraft.getInstance().getEntityRenderDispatcher().getRenderer(player).getTextureLocation(player);
    }
}
