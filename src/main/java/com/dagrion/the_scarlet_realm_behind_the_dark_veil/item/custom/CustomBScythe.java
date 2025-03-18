package com.dagrion.the_scarlet_realm_behind_the_dark_veil.item.custom;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.effect.ModEffect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class CustomBScythe extends SwordItem {
    public CustomBScythe(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (Math.random() < 0.15) {
            target.addStatusEffect(new StatusEffectInstance(ModEffect.BLOODLOSS,175,0));
        }
        return true;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.setVelocity
                (
                        4*(-Math.sin(Math.toRadians(user.getYaw())) * Math.cos(Math.toRadians(user.getPitch()))),
                        3*(-Math.sin(Math.toRadians(user.getPitch()))),
                        4*(Math.cos(Math.toRadians(user.getYaw())) * Math.cos(Math.toRadians(user.getPitch())))
                );
        user.getItemCooldownManager().set(user.getMainHandStack().getItem(),400);

        return super.use(world, user, hand);
    }
}

