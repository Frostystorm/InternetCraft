package com.internetcraft.Block;

import com.internetcraft.Block.Blocks;
import com.internetcraft.Reference.Reference;

import com.internetcraft.Util.InternetCraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class DogeBlock extends Block {

	public DogeBlock() {
		super(Material.ground);
		setHardness(0.5F);
		setStepSound(Block.soundTypeMetal);
		setUnlocalizedName("doge_block");
		setCreativeTab(InternetCraftCreativeTabs.INTERNETCRAFT);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ){
		worldIn.setBlockToAir(pos);
		playerIn.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 2400));
		playerIn.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 2400));
		return false;
	}

	@Override
	public DogeBlock setUnlocalizedName(String unlocalizedName)
	{
		super.setUnlocalizedName(Reference.PREFIX + unlocalizedName);

		return this;
	}
}
