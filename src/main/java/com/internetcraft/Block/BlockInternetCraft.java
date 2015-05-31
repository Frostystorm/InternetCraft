package com.internetcraft.Block;

import com.internetcraft.Reference.Reference;
import com.internetcraft.Util.InternetCraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInternetCraft extends Block{

	public BlockInternetCraft() {
		super(Material.ground);
		setCreativeTab(InternetCraftCreativeTabs.INTERNETCRAFT);
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
