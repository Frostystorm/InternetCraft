package com.internetcraft.Block;

import com.internetcraft.Item.Items;
import com.internetcraft.Reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Blocks
{
	public final static Block doge = new BlockInternetCraft(Material.ground)
			.setHardness(0.5F).setStepSound(Block.soundTypeMetal)
			.setUnlocalizedName("doge_block");

	public static void init()
	{
		GameRegistry.registerBlock(doge, "doge_block");

	}

	public static void registerModels()
	{
		Items.registerRenderer(GameRegistry.findItem(Reference.MODID, "doge_block"), "doge_block");
	}
}
