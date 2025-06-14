/* (C) TAMA Studios 2025 */
package tama.Entities;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.entity.IEntityAdditionalSpawnData;
import net.minecraftforge.entity.PartEntity;
import net.tardis.mod.blockentities.exteriors.IExteriorObject;
import net.tardis.mod.entity.CarExteriorEntity;
import net.tardis.mod.entity.IDrivable;
import net.tardis.mod.misc.IDoor;
import net.tardis.mod.misc.IHaveMatterState;
import net.tardis.mod.misc.ITeleportEntities;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DeloreanExteriorEntity extends CarExteriorEntity
        implements IDrivable,
                IHaveMatterState,
                IExteriorObject,
                IDoor,
                ITeleportEntities<net.tardis.mod.entity.CarExteriorEntity>,
                IEntityAdditionalSpawnData {
    private CarTrunkEntityPart<DeloreanExteriorEntity> trunkPart;
    private PartEntity<?>[] parts = new PartEntity[1];
    final List<Vec3> seatPositions = new ArrayList();

    public DeloreanExteriorEntity(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public void tick() {
        super.tick();
        Vec3 trunkOffset = new Vec3(0.0, 0.2, -2.0);
        Vec3 trunkPos = trunkOffset
                .yRot((float) Math.toRadians((double) (-this.getYRot())))
                .add(this.position());
        Vec3 oldPos = trunkOffset
                .yRot((float) Math.toRadians((double) (-this.getYRot())))
                .add(this.xOld, this.yOld, this.zOld);
        this.trunkPart.xOld = oldPos.x;
        this.trunkPart.yOld = oldPos.y;
        this.trunkPart.zOld = oldPos.z;
        this.trunkPart.setPos(trunkPos);
        this.trunkPart.tick();
    }

    public float getMaxSpeed() {
        return 0.075F;
    }

    public boolean isNoGravity() {
        return super.isNoGravity();
    }

    protected boolean canRide(Entity pVehicle) {
        return true;
    }

    public InteractionResult interact(Player pPlayer, InteractionHand pHand) {
        if (!this.getLevel().isClientSide()) {
            pPlayer.startRiding(this);
        }

        return InteractionResult.sidedSuccess(this.getLevel().isClientSide());
    }

    @Override
    public @Nullable PartEntity<?>[] getParts() {
        return this.parts;
    }

    @Override
    public void setupCar() {
        this.parts[0] = this.trunkPart = new tama.Entities.CarTrunkEntityPart<>(this, 1.5F, 2f);
        this.addSeat(0.5, -0.2, 0.1);
        this.addSeat(-0.5, -0.2, 0.2);
    }

    @Override
    public Level getLevel() {
        return this.level();
    }
}
