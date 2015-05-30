package com.internetcraft.Item;

import com.internetcraft.Reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemInternetCraft extends Item
{
	public ItemInternetCraft(CreativeTabs tab)
	{
		setCreativeTab(tab);
	}

	@Override
	public ItemInternetCraft setUnlocalizedName(String unlocalizedName)
	{
		super.setUnlocalizedName(Reference.PREFIX + unlocalizedName);

		return this;
	}
	
}