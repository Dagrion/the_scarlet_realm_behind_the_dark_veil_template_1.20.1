package com.dagrion.the_scarlet_realm_behind_the_dark_veil.item;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.TheScarletRealmBehindTheDarkVeil;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup THE_SCARLET_REALM_BEHIND_THE_DARK_VEIL_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheScarletRealmBehindTheDarkVeil.MOD_ID, "filled_vial_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FILLED_VIAL))
                    .displayName(Text.translatable("itemgroup.the_scarlet_realm_behind_the_dark_veil.the_scarlet_realm_behind_the_dark_veil_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.ENCHANTED_CARROT);

                        entries.add(ModItems.NETHERITE_NUGGET);
                            entries.add(ModItems.STINGER);

                        entries.add(ModItems.EMPTY_VIAL);
                            entries.add(ModItems.FILLED_VIAL);

                        entries.add(ModItems.BLOODY_INGOT);
                        entries.add(ModBlocks.BLOODY_BLOCK);
                            entries.add(ModItems.BLOODY_SWORD);
                            entries.add(ModItems.BROKEN_BLOODY_SWORD);
                            entries.add(ModItems.TRUE_BLOODY_SWORD);
                            entries.add(ModItems.BLOODY_SCYTHE);
                            entries.add(ModItems.BLOODY_HELMET);
                            entries.add(ModItems.BLOODY_CHESTPLATE);
                            entries.add(ModItems.BLOODY_LEGGINGS);
                            entries.add(ModItems.BLOODY_BOOTS);

                        entries.add(ModItems.MOON_DUST);
                            entries.add(ModItems.BLOOD_MOON_DUST);
                            entries.add(ModItems.BLOOD_MOON);

                        entries.add(ModItems.FLESH_PILE);

                    }).build());

    public static void registerModItems () {
        TheScarletRealmBehindTheDarkVeil.LOGGER.info("Registering Mod Items for" + TheScarletRealmBehindTheDarkVeil.MOD_ID);
    }
}
