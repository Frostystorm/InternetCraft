package com.internetcraft.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDoge extends RenderLiving
{
	private static final ResourceLocation dogeTextures = new ResourceLocation("textures/entity/doge/doge.png");

	public RenderDoge(RenderManager rendermanager, ModelBase model, float shadowsize)
	{
		super(rendermanager, model, shadowsize);
	}

	protected ResourceLocation func_180572_a(EntityDoge entity)
	{
		return dogeTextures;
	}

	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return this.func_180572_a((EntityDoge)entity);
	}

}
