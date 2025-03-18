package com.dagrion.the_scarlet_realm_behind_the_dark_veil.item.custom;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.effect.ModEffect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class CustomTBSword extends SwordItem {
    public CustomTBSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (Math.random() < 0.15) {
            target.addStatusEffect(new StatusEffectInstance(ModEffect.BLOODLOSS,175,0));
        }
        return true;
    }

}
