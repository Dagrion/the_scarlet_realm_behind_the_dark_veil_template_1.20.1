package com.dagrion.the_scarlet_realm_behind_the_dark_veil.item.custom;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class CustomSItem extends Item {
    public CustomSItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.getStackInHand(hand).getItem() == ModItems.STINGER && user.getOffHandStack().getItem() == ModItems.EMPTY_VIAL) {
            user.getOffHandStack().decrement(1);
            user.damage(user.getDamageSources().magic(),2f);
            user.getItemCooldownManager().set(user.getMainHandStack().getItem(),20);
            user.getItemCooldownManager().set(user.getOffHandStack().getItem(),20);
            user.giveItemStack(new ItemStack(ModItems.FILLED_VIAL));
        }
        if (user.getStackInHand(hand).getItem() == ModItems.EMPTY_VIAL && user.getOffHandStack().getItem() == ModItems.STINGER) {
            user.getMainHandStack().decrement(1);
            user.damage(user.getDamageSources().magic(),2f);
            user.getItemCooldownManager().set(user.getOffHandStack().getItem(),20);
            user.getItemCooldownManager().set(user.getMainHandStack().getItem(),20);
            user.giveItemStack(new ItemStack(ModItems.FILLED_VIAL));
        }
        return super.use(world, user, hand);
    }
}