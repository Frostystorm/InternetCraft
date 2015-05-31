package com.internetcraft.Util;

import com.internetcraft.Item.Items;
import com.internetcraft.Reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class InternetCraftCreativeTabs
{
	public static final CreativeTabs INTERNETCRAFT = new CreativeTabs(Reference.PREFIX + "internetCraftTab")
	{
		@Override
		public Item getTabIconItem()
		{
			return Items.bacon;
		}
	};
}
