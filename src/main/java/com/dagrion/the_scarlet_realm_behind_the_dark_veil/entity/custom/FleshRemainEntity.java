package com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.custom;


import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.passive.WanderingTraderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class FleshRemainEntity extends HostileEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout;

    public FleshRemainEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(4, new WanderAroundFarGoal(this, 1D));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
        this.goalSelector.add(4, new AttackGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class,true));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, VillagerEntity.class,true));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, WanderingTraderEntity.class,true));

    }

    public static DefaultAttributeContainer.Builder createFleshRemainAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 35.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25F)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0)
                .add(EntityAttributes.GENERIC_ARMOR, 5.0)
                .add(EntityAttributes.GENERIC_MAX_HEALTH,50);

    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 40;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return 1.77F;
    }

    @Override
    public void tick() {
        super.tick();

        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
    }

    @Override
    protected @Nullable SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_DROWNED_AMBIENT_WATER;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_DROWNED_HURT_WATER;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_DROWNED_DEATH_WATER;
    }
}