package com.code.fabric.entities;

import com.code.fabric.registries.AseohaEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.Level;

public class CybermanEntity extends com.code.common.entities.CybermanEntity {
    public CybermanEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void performRangedAttack(LivingEntity livingEntity, float f) {
        if (!this.level().isClientSide && this.hasLineOfSight(livingEntity)) {
            Lazer PlasmaBoltEntity = new Lazer(AseohaEntities.LAZER.get(), this.level());

            AbstractArrow abstractArrow = PlasmaBoltEntity.createFromConstructor(this.level(), this);

            abstractArrow.setBaseDamage(20);

            abstractArrow.shootFromRotation(abstractArrow, this.getXRot(), this.yHeadRot, 0.0F, 1.5F, 0.0F);

            this.level().addFreshEntity(abstractArrow);
        }
    }
}
