package com.internetcraft.Entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityDoge extends EntityAnimal
{

	public EntityDoge(World worldIn)
	{
		super(worldIn);
		this.setSize(1.0F, 1.0F);
		((PathNavigateGround) this.getNavigator()).func_179690_a(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
		this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(3, new EntityAITempt(this, 1.25D, com.internetcraft.Item.Items.bacon, false));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
	}

	public boolean isBreedingItem(ItemStack itemstack)
	{
		return itemstack == null ? false :itemstack.getItem() == com.internetcraft.Item.Items.bacon;
	}

	public boolean canBreatheUnderwater()
	{
		return false;
	}

	public boolean isPushedByWater()
	{
		return false;
	}

	public void onLivingUpdate()
	{
		super.onLivingUpdate();
	}
	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound()
	{
		return "mob.wolf.idle";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "mob.wolf.hurt";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "mob.wolf.hurt";
	}

	protected void playStepSound(BlockPos p_180429_1_, Block p_180429_2_)
	{
		this.playSound("mob.cow.step", 0.15F, 1.0F);
	}

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	protected float getSoundVolume()
	{
		return 0.4F;
	}

	protected Item getDropItem()
	{
		return com.internetcraft.Item.Items.bacon;
	}

	/**
	 * Drop 0-2 items of this living's type
	 */
	protected void dropFewItems(boolean recentlyhit, int modifier)
	{
		this.dropItem(com.internetcraft.Item.Items.bacon, 1);
	}

	/**
	 * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
	 */
	public boolean interact(EntityPlayer player)
	{
		return super.interact(player);
	}

	public EntityDoge createChild(EntityAgeable ageable)
	{
		return new EntityDoge(this.worldObj);
	}

	public float getEyeHeight()
	{
		return this.height;
	}

	public boolean getCanSpawnHere()
	{
		return super.getCanSpawnHere();
	}
}