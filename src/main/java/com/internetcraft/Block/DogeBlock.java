package com.internetcraft.Block;

import com.internetcraft.Block.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class DogeBlock extends BlockInternetCraft {

	public DogeBlock(Material material) {
		super(material);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ){
		worldIn.setBlockToAir(pos);
		playerIn.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 2400));
		playerIn.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 2400));
		return false;
	}

}
