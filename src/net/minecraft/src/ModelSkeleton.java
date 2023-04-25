package net.minecraft.src;

public class ModelSkeleton extends ModelZombie {
	public ModelSkeleton() {
		float var1 = 0.0F;
		this.bipedRightArm = new ModelRenderer(40, 16);
		this.bipedRightArm.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
		this.bipedRightArm.setPosition(-5.0F, 2.0F, 0.0F);
		this.bipedLeftArm = new ModelRenderer(40, 16);
		this.bipedLeftArm.mirror = true;
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
		this.bipedLeftArm.setPosition(5.0F, 2.0F, 0.0F);
		this.bipedRightLeg = new ModelRenderer(0, 16);
		this.bipedRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
		this.bipedRightLeg.setPosition(-2.0F, 12.0F, 0.0F);
		this.bipedLeftLeg = new ModelRenderer(0, 16);
		this.bipedLeftLeg.mirror = true;
		this.bipedLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
		this.bipedLeftLeg.setPosition(2.0F, 12.0F, 0.0F);
	}
}