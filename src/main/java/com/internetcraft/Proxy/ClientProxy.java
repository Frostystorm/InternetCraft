package com.internetcraft.Proxy;

import com.internetcraft.Block.Blocks;
import com.internetcraft.Entity.EntityDoge;
import com.internetcraft.Entity.ModelDoge;
import com.internetcraft.Entity.RenderDoge;
import com.internetcraft.Item.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	public void preInit()
	{
		super.preInit();
	}

	@Override
	public void registerRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityDoge.class, new RenderDoge(Minecraft.getMinecraft().getRenderManager(), new ModelDoge(), 0.5F));
	}

	public void Init()
	{
		super.Init();
		Items.registerModels();
		Blocks.registerModels();
	}

	public void postInit()
	{
		super.postInit();
	}
}
