package com.internetcraft.Item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items
{
	public static final FoodInternetCraft bacon = new FoodInternetCraft(6, 2, false).setUnlocalizedName("bacon");
	public static final FoodInternetCraft dorito = new FoodInternetCraft(12, 4, false).setUnlocalizedName("dorito");


	public static void registerRenderer(Item item, String name)
	{
		ModelBakery.addVariantName(item, "internetcraft:" + name);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("internetcraft:" + name, "inventory"));
	}

	public static void init()
	{
		GameRegistry.registerItem(bacon, "bacon");
		GameRegistry.registerItem(dorito, "dorito");

	}

	public static void registerModels()
	{
		registerRenderer(bacon, "bacon");
		registerRenderer(dorito, "dorito");

	}
	
}
