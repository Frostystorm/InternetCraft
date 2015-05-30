package com.internetcraft.Food;

import com.internetcraft.Reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodInternetCraft extends ItemFood{
	public FoodInternetCraft(CreativeTabs tab, int amount, int saturation, boolean isWolfFood){
		super(amount, saturation, isWolfFood);
		setCreativeTab(tab); 
	}
	@Override
	public FoodInternetCraft setUnlocalizedName(String unlocalizedName)
	{
		super.setUnlocalizedName(Reference.PREFIX + unlocalizedName);

		return this;
	}
}
