package com.internetcraft.Block;

import com.internetcraft.Item.Items;
import com.internetcraft.Reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Blocks
{
	public final static Block doge_block = new DogeBlock();
	public final static Block bacon_block = new BlockInternetCraft();
	public final static Block snoop_block = new BlockInternetCraft();

	public static void init()
	{
		GameRegistry.registerBlock(doge_block, "doge_block");
		GameRegistry.registerBlock(bacon_block, "bacon_block");
		GameRegistry.registerBlock(snoop_block, "snoop_block");
	}

	public static void registerModels()
	{
		Items.registerRenderer(GameRegistry.findItem(Reference.MODID, "doge_block"), "doge_block");
		Items.registerRenderer(GameRegistry.findItem(Reference.MODID, "bacon_block"), "bacon_block");
		Items.registerRenderer(GameRegistry.findItem(Reference.MODID, "snoop_block"), "snoop_block");
	}
}
