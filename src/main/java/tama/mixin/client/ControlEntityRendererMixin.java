/* (C) TAMA Studios 2025 */
package tama.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.world.phys.EntityHitResult;
import net.tardis.mod.client.renderers.RendererControl;
import net.tardis.mod.control.ControlType;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.helpers.InventoryHelper;
import net.tardis.mod.tags.ItemTags;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import tama.Controls.CollisionControl;

@Mixin(RendererControl.class)
public abstract class ControlEntityRendererMixin extends EntityRenderer<ControlEntity<?>> {
    protected ControlEntityRendererMixin(EntityRendererProvider.Context p_174008_) {
        super(p_174008_);
    }

    /**
     * @author Codiak
     * @reason Render hitboxes if player uses F3+B
     */
    @Overwrite(remap = false)
    public void render(
            @NotNull ControlEntity Entity,
            float EntityYaw,
            float PartialTick,
            @NotNull PoseStack PoseStack,
            @NotNull MultiBufferSource Buffer,
            int PackedLight) {
        super.render(Entity, EntityYaw, PartialTick, PoseStack, Buffer, PackedLight);
        if (Entity.getControl() instanceof CollisionControl) return;
        if (Minecraft.getInstance().hitResult instanceof EntityHitResult result && result.getEntity() == Entity) {
            assert Minecraft.getInstance().player != null;
            if (InventoryHelper.isHolding(
                    Minecraft.getInstance().player, (stack) -> stack.is(ItemTags.SHOW_CONTROL_ITEMS)))
                this.renderNameTag(
                        Entity,
                        Component.translatable(
                                ((ControlType<?>) Entity.getControl().getType()).getTranslationKey()),
                        PoseStack,
                        Buffer,
                        PackedLight);
        }
    }

    /**
     * @author Codiak
     * @reason Render hitboxes if player uses F3+B
     */
    @Overwrite(remap = false)
    public boolean shouldRender(
            @NotNull ControlEntity LivingEntity, @NotNull Frustum Camera, double CamX, double CamY, double CamZ) {
        return super.shouldRender(LivingEntity, Camera, CamX, CamY, CamZ);
    }
}
