package net.minecraft.src;

public class RenderChicken extends RenderLiving {
	public RenderChicken(ModelBase var1, float var2) {
		super(var1, var2);
	}

	public void a(EntityChicken var1, double var2, double var4, double var6, float var8, float var9) {
		super.a(var1, var2, var4, var6, var8, var9);
	}

	protected float a(EntityChicken var1, float var2) {
		float var3 = var1.field_756_e + (var1.field_752_b - var1.field_756_e) * var2;
		float var4 = var1.field_757_d + (var1.field_758_c - var1.field_757_d) * var2;
		return (MathHelper.sin(var3) + 1.0F) * var4;
	}

	protected float func_170_d(EntityLiving var1, float var2) {
		return this.a((EntityChicken)var1, var2);
	}

	public void a(EntityLiving var1, double var2, double var4, double var6, float var8, float var9) {
		this.a((EntityChicken)var1, var2, var4, var6, var8, var9);
	}

	public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9) {
		this.a((EntityChicken)var1, var2, var4, var6, var8, var9);
	}
}
