package com.dagrion.the_scarlet_realm_behind_the_dark_veil;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.ModEntities;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.client.FleshRemainModel;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.client.FleshRemainRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class TheScarletRealmBehindTheDarkVeilClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityModelLayerRegistry.registerModelLayer(FleshRemainModel.FLESH_REMAIN, FleshRemainModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.FLESH_REMAIN, FleshRemainRenderer::new);

    }
}
