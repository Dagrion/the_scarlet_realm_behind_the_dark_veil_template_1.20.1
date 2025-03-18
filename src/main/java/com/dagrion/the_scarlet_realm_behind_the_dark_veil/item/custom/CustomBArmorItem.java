package com.dagrion.the_scarlet_realm_behind_the_dark_veil.item.custom;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.effect.ModEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CustomBArmorItem extends ArmorItem {
    public CustomBArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient() && entity instanceof PlayerEntity player &&
                !player.hasStatusEffect(ModEffect.BLOODLUST) && player.getHealth() <= 8) { // 5 hp = 2.5 hearts
            if (player.getInventory().armor.stream()
                    .allMatch(itemStack ->
                            itemStack.getItem() instanceof ArmorItem armorItem &&
                                    armorItem.getMaterial() == this.material)) {
                player.addStatusEffect(new StatusEffectInstance(ModEffect.BLOODLUST, 100,
                        0, false, false, true));
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }
}