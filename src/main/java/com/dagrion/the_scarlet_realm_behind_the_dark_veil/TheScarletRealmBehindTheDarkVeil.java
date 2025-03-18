package com.dagrion.the_scarlet_realm_behind_the_dark_veil;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.block.ModBlocks;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.effect.ModEffect;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.ModEntities;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.custom.FleshRemainEntity;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.item.ModItemGroups;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.item.ModItems;
import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheScarletRealmBehindTheDarkVeil implements ModInitializer {
	public static final String MOD_ID = "the_scarlet_realm_behind_the_dark_veil";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItems();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

		ModEffect.registerEffects();

		ModEntities.registerModEntities();
		FabricDefaultAttributeRegistry.register(ModEntities.FLESH_REMAIN, FleshRemainEntity.createFleshRemainAttributes());

	}
}