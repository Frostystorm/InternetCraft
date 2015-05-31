package com.internetcraft.Block;

import com.internetcraft.Reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockInternetCraft extends Block{

	public BlockInternetCraft() {
		super(Material.ground);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(0.5F);
		setStepSound(Block.soundTypeMetal);
		setUnlocalizedName("snoop_block");
	}

	@Override
	public BlockInternetCraft setUnlocalizedName(String unlocalizedName)
	{
		super.setUnlocalizedName(Reference.PREFIX + unlocalizedName);

		return this;
	}
}
