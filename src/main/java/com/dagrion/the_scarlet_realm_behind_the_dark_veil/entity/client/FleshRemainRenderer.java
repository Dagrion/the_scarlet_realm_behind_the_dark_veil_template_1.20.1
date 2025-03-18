package com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.client;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.TheScarletRealmBehindTheDarkVeil;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.custom.FleshRemainEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class FleshRemainRenderer extends MobEntityRenderer<FleshRemainEntity, FleshRemainModel<FleshRemainEntity>> {
    public FleshRemainRenderer(EntityRendererFactory.Context context) {
        super(context, new FleshRemainModel<>(context.getPart(FleshRemainModel.FLESH_REMAIN)), 0.5f);
    }

    @Override
    public Identifier getTexture(FleshRemainEntity entity) {
        return Identifier.of(TheScarletRealmBehindTheDarkVeil.MOD_ID,"textures/entity/flesh_remain/flesh_remain.png");
    }

    @Override
    public void render(FleshRemainEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
