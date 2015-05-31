package com.internetcraft.Util;

import com.internetcraft.Block.Blocks;
import com.internetcraft.Item.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void register()
	{
		GameRegistry.addRecipe(new ItemStack(Blocks.bacon_block), "CCC", "CCC", "CCC", 'C', Items.bacon);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.bacon, 9), Blocks.bacon_block);
	}
}
