package com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.client;

import com.dagrion.the_scarlet_realm_behind_the_dark_veil.TheScarletRealmBehindTheDarkVeil;
import com.dagrion.the_scarlet_realm_behind_the_dark_veil.entity.custom.FleshRemainEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class FleshRemainModel<T extends FleshRemainEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer FLESH_REMAIN = new EntityModelLayer(Identifier.of(TheScarletRealmBehindTheDarkVeil.MOD_ID,"flesh_remain"),"main");

    private final ModelPart FleshRemain;
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart jaw;
    private final ModelPart eyes;
    private final ModelPart trunk;
    private final ModelPart torso;
    private final ModelPart Larm;
    private final ModelPart A1;
    private final ModelPart Rarm;
    private final ModelPart A2;
    private final ModelPart Lleg;
    private final ModelPart L1;
    private final ModelPart Rfeet;
    private final ModelPart Rleg;
    private final ModelPart L2;
    private final ModelPart Lfeet;
    private final ModelPart BrokenBloodySword;

    public FleshRemainModel(ModelPart root) {
        this.FleshRemain = root.getChild("FleshRemain");
        this.body = this.FleshRemain.getChild("body");
        this.head = this.body.getChild("head");
        this.jaw = this.head.getChild("jaw");
        this.eyes = this.head.getChild("eyes");
        this.trunk = this.body.getChild("trunk");
        this.torso = this.trunk.getChild("torso");
        this.Larm = this.trunk.getChild("Larm");
        this.A1 = this.Larm.getChild("A1");
        this.Rarm = this.trunk.getChild("Rarm");
        this.A2 = this.Rarm.getChild("A2");
        this.Lleg = this.FleshRemain.getChild("Lleg");
        this.L1 = this.Lleg.getChild("L1");
        this.Rfeet = this.L1.getChild("Rfeet");
        this.Rleg = this.FleshRemain.getChild("Rleg");
        this.L2 = this.Rleg.getChild("L2");
        this.Lfeet = this.L2.getChild("Lfeet");
        this.BrokenBloodySword = root.getChild("BrokenBloodySword");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData FleshRemain = modelPartData.addChild("FleshRemain", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.5F, -5.0F));

        ModelPartData body = FleshRemain.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 13.5F, 7.0F));

        ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 10).cuboid(-4.0F, -6.0F, -2.0F, 8.0F, 6.0F, 6.0F, new Dilation(0.0F))
                .uv(22, 42).cuboid(-4.0F, -2.0F, -4.0F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(24, 46).cuboid(-4.0F, -6.0F, -3.0F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 44).cuboid(1.0F, -4.0F, -3.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -13.5F, -7.0F));

        ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(54, 41).cuboid(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, -4.0F, -0.5236F, 0.0F, 0.0F));

        ModelPartData jaw = head.addChild("jaw", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, 3.5F));

        ModelPartData cube_r2 = jaw.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, 0.0F, -4.0F, 8.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -3.5F, 0.3054F, 0.0F, 0.0F));

        ModelPartData eyes = head.addChild("eyes", ModelPartBuilder.create().uv(56, 27).cuboid(-5.0F, -1.5F, -1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(44, 31).cuboid(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -2.5F, -1.5F));

        ModelPartData trunk = body.addChild("trunk", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -14.0F, 0.0F));

        ModelPartData torso = trunk.addChild("torso", ModelPartBuilder.create().uv(32, 0).cuboid(-3.5F, 2.0F, -3.0F, 7.0F, 6.0F, 3.0F, new Dilation(0.0F))
                .uv(22, 33).cuboid(-3.5F, 8.0F, -3.0F, 7.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r3 = torso.addChild("cube_r3", ModelPartBuilder.create().uv(42, 33).cuboid(-2.0F, -2.5F, 0.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 4.0F, -4.0F, 0.7854F, 0.0F, 0.0F));

        ModelPartData Larm = trunk.addChild("Larm", ModelPartBuilder.create(), ModelTransform.of(5.5F, 2.0F, -2.0F, 0.2618F, 0.0F, 0.0F));

        ModelPartData cube_r4 = Larm.addChild("cube_r4", ModelPartBuilder.create().uv(0, 22).cuboid(-1.9435F, 1.3254F, -6.6236F, 3.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, -1.0F, 0.3491F, 0.0F, 0.0F));

        ModelPartData A1 = Larm.addChild("A1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, -1.0F));

        ModelPartData cube_r5 = A1.addChild("cube_r5", ModelPartBuilder.create().uv(28, 10).cuboid(-1.9435F, 2.4F, -6.0F, 3.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -7.0F, 0.0436F, 0.0F, 0.0F));

        ModelPartData Rarm = trunk.addChild("Rarm", ModelPartBuilder.create(), ModelTransform.of(-5.5F, 2.0F, -2.0F, 0.2618F, 0.0F, 0.0F));

        ModelPartData cube_r6 = Rarm.addChild("cube_r6", ModelPartBuilder.create().uv(22, 22).cuboid(-1.9435F, 1.3254F, -6.6236F, 3.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -0.5F, -1.0F, 0.3491F, 0.0F, 0.0F));

        ModelPartData A2 = Rarm.addChild("A2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r7 = A2.addChild("cube_r7", ModelPartBuilder.create().uv(0, 33).cuboid(-1.9435F, 2.4F, -6.0F, 3.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 0.5F, -8.0F, 0.0436F, 0.0F, 0.0F));

        ModelPartData Lleg = FleshRemain.addChild("Lleg", ModelPartBuilder.create(), ModelTransform.pivot(2.5F, 13.5F, 6.5F));

        ModelPartData cube_r8 = Lleg.addChild("cube_r8", ModelPartBuilder.create().uv(12, 46).cuboid(-1.5F, 0.0F, -3.1F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.5F, -0.2182F, 0.0F, 0.0F));

        ModelPartData L1 = Lleg.addChild("L1", ModelPartBuilder.create(), ModelTransform.pivot(4.0F, 6.0F, -4.0F));

        ModelPartData cube_r9 = L1.addChild("cube_r9", ModelPartBuilder.create().uv(44, 21).cuboid(-2.0F, 0.0F, 0.0F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData Rfeet = L1.addChild("Rfeet", ModelPartBuilder.create().uv(50, 9).cuboid(-1.5F, 0.0F, -2.85F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.5F, 6.0F, 4.0F));

        ModelPartData Rleg = FleshRemain.addChild("Rleg", ModelPartBuilder.create(), ModelTransform.pivot(-1.5F, 13.5F, 7.0F));

        ModelPartData cube_r10 = Rleg.addChild("cube_r10", ModelPartBuilder.create().uv(42, 41).cuboid(-2.0F, 0.0F, -3.1F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        ModelPartData L2 = Rleg.addChild("L2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 6.0F, -4.5F));

        ModelPartData cube_r11 = L2.addChild("cube_r11", ModelPartBuilder.create().uv(0, 44).cuboid(-2.0F, 0.0F, 0.0F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData Lfeet = L2.addChild("Lfeet", ModelPartBuilder.create().uv(24, 49).cuboid(-2.0F, 0.0F, -2.85F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 4.0F));

        ModelPartData BrokenBloodySword = modelPartData.addChild("BrokenBloodySword", ModelPartBuilder.create().uv(0, 54).cuboid(-0.5F, 7.0F, -9.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(56, 30).cuboid(-0.5F, 6.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(52, 56).cuboid(-0.5F, 7.0F, -6.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(36, 49).cuboid(-0.5F, 7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(54, 46).cuboid(-0.5F, 5.0F, -6.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F))
                .uv(50, 19).cuboid(-0.5F, 5.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(36, 51).cuboid(-0.5F, 4.0F, -5.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(8, 56).cuboid(-0.5F, 2.0F, -4.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F))
                .uv(50, 31).cuboid(-0.5F, 2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(52, 5).cuboid(-0.5F, 1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(34, 56).cuboid(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(40, 56).cuboid(-0.5F, -4.0F, -3.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(24, 53).cuboid(-0.5F, -3.0F, -3.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(52, 0).cuboid(-0.5F, -2.0F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(46, 51).cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(50, 13).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
                .uv(56, 51).cuboid(-0.5F, -6.0F, 5.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(56, 23).cuboid(-0.5F, -5.0F, 4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(56, 19).cuboid(-0.5F, -4.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(16, 56).cuboid(-0.5F, -3.0F, 2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(46, 56).cuboid(-0.5F, -2.0F, 2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 3.0F, 3.5F, -0.6545F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(FleshRemainEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(FleshRemainAnimations.FLESH_REMAIN_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, FleshRemainAnimations.FLESH_REMAIN_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        FleshRemain.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        BrokenBloodySword.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return FleshRemain;
    }
}
