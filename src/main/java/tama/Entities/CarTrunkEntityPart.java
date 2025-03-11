package tama.Entities;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.tardis.mod.entity.CarExteriorEntity;

public class CarTrunkEntityPart<T extends CarExteriorEntity> extends net.tardis.mod.entity.CarTrunkEntityPart {
    final EntityDimensions size;
    public CarTrunkEntityPart(CarExteriorEntity parent, float size) {
        super(parent, size);
        this.size = EntityDimensions.fixed(size, size);
        this.refreshDimensions();
    }

    public CarTrunkEntityPart(CarExteriorEntity parent, float size, float size2) {
        super(parent, size);
        this.size = EntityDimensions.fixed(size, size2);
        this.refreshDimensions();
    }

    public InteractionResult interact(Player pPlayer, InteractionHand pHand) {
        return ((CarExteriorEntity)this.getParent()).getDoorHandler().onInteract(pPlayer, pPlayer.getItemInHand(pHand), pHand).isSuccess() ? InteractionResult.sidedSuccess(pPlayer.level.isClientSide()) : InteractionResult.PASS;
    }

    public void tick() {
        super.tick();
        if (((CarExteriorEntity) this.getParent()).cachedTardis != null && !this.level.isClientSide()) {
            ((CarExteriorEntity) this.getParent()).getTeleportHandler().tick((ServerLevel) this.getLevel());
        }
    }

    public EntityDimensions getDimensions(Pose pPose) {
        return this.size;
    }
}
