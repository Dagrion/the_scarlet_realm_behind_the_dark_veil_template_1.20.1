package com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.TheScarletRealmBehindTheDarkVeil;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.custom.FleshRemainEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<FleshRemainEntity> FLESH_REMAIN = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(TheScarletRealmBehindTheDarkVeil.MOD_ID, "flesh_remain"),
            FabricEntityTypeBuilder.<FleshRemainEntity>create(SpawnGroup.MONSTER, FleshRemainEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f,2f)).build());


    public static void registerModEntities() {
        TheScarletRealmBehindTheDarkVeil.LOGGER.info("Registering Mod Entities for " + TheScarletRealmBehindTheDarkVeil.MOD_ID);
    }
}
