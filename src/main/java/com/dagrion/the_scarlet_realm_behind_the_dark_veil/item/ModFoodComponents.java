package com.dagrion.the_scarlet_realm_behind_the_dark_veil.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ENCHANTED_CARROT = new FoodComponent.Builder()
            .snack()
            .hunger(6)
            .saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0,false,false,false), 1.0F)
            .build();
}