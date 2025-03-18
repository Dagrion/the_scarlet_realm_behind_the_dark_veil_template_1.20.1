package com.dagrion.the_scarlet_realm_behind_the_dark_veil.item;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.TheScarletRealmBehindTheDarkVeil;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.ModEntities;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget", new Item(new FabricItemSettings().fireproof()));
    public static final Item BLOODY_INGOT = registerItem("bloody_ingot", new Item(new FabricItemSettings().fireproof()));
    public static final Item MOON_DUST = registerItem("moon_dust", new Item(new FabricItemSettings()));
    public static final Item BLOOD_MOON_DUST = registerItem("blood_moon_dust", new Item(new FabricItemSettings()));

    public static final Item EMPTY_VIAL = registerItem("empty_vial", new CustomSItem((new FabricItemSettings().maxCount(16))));
    public static final Item FILLED_VIAL = registerItem("filled_vial", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STINGER = registerItem("stinger",
            new CustomSItem((new Item.Settings()).fireproof()));

    public static final Item ENCHANTED_CARROT = registerItem("enchanted_carrot",
            new InfiniteFoodItem(new Item.Settings().food(ModFoodComponents.ENCHANTED_CARROT).maxCount(1).rarity(Rarity.RARE)));

    public static final Item BLOODY_SWORD = registerItem("bloody_sword",
            new CustomBSword(ModToolMaterials.BLOODY, 4, -2.4F, (new Item.Settings()).fireproof()));
    public static final Item BROKEN_BLOODY_SWORD = registerItem("broken_bloody_sword",
            new SwordItem(ModToolMaterials.BLOODY, 4, -10F, (new Item.Settings()).fireproof().rarity(Rarity.RARE)));
    public static final Item TRUE_BLOODY_SWORD = registerItem("true_bloody_sword",
            new CustomTBSword(ModToolMaterials.BLOODY, 5, -2.6F, (new Item.Settings()).fireproof().rarity(Rarity.EPIC)));
    public static final Item BLOODY_SCYTHE = registerItem("bloody_scythe",
            new CustomBScythe(ModToolMaterials.BLOODY, 7, -3.0F, (new Item.Settings().fireproof().rarity(Rarity.EPIC))));
    public static final Item HALF_MOON = registerItem("half_moon",
            new SwordItem(ModToolMaterials.MANAN, 32766, 32763, (new Item.Settings()).fireproof().rarity(Rarity.EPIC)));


    public static final Item BLOODY_HELMET = registerItem("bloody_helmet",
            new CustomBArmorItem(ModArmorMaterials.BLOODY, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
    public static final Item BLOODY_CHESTPLATE = registerItem("bloody_chestplate",
            new CustomBArmorItem(ModArmorMaterials.BLOODY, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
    public static final Item BLOODY_LEGGINGS = registerItem("bloody_leggings",
            new CustomBArmorItem(ModArmorMaterials.BLOODY, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
    public static final Item BLOODY_BOOTS = registerItem("bloody_boots",
            new CustomBArmorItem(ModArmorMaterials.BLOODY, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));

    public static final Item BLOOD_MOON = registerItem("blood_moon", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    public static final Item FLESH_PILE = registerItem("flesh_pile",
            new SpawnEggItem(ModEntities.FLESH_REMAIN,0xcbc6a5 ,0xff2400,new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheScarletRealmBehindTheDarkVeil.MOD_ID, name), item);

    }

    public static void registerModItems () {
        TheScarletRealmBehindTheDarkVeil.LOGGER.info("Registering Mod Items for" + TheScarletRealmBehindTheDarkVeil.MOD_ID);
    }
}