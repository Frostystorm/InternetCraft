package com.internetcraft.Item;

import com.internetcraft.Reference.Reference;

import com.internetcraft.Util.InternetCraftCreativeTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodInternetCraft extends ItemFood{
	public FoodInternetCraft(int amount, int saturation, boolean isWolfFood){
		super(amount, saturation, isWolfFood);
		setCreativeTab(InternetCraftCreativeTabs.INTERNETCRAFT);
	}
	@Override
	public FoodInternetCraft setUnlocalizedName(String unlocalizedName)
	{
		super.setUnlocalizedName(Reference.PREFIX + unlocalizedName);

		return this;
	}
}
