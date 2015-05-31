package com.internetcraft.Item;

import com.internetcraft.Block.BlockInternetCraft;
import com.internetcraft.Food.FoodInternetCraft;

import com.internetcraft.Reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items
{
	public static final FoodInternetCraft bacon = new FoodInternetCraft(CreativeTabs.tabFood, 6, 2, false).setUnlocalizedName("bacon");

	public static void registerRenderer(Item item, String name)
	{
		ModelBakery.addVariantName(item, "internetcraft:" + name);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("internetcraft:" + name, "inventory"));
	}

	public static void init()
	{
		GameRegistry.registerItem(bacon, "bacon");

	}

	public static void registerModels()
	{
		registerRenderer(bacon, "bacon");
	}
	
}
