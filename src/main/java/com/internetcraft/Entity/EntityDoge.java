package com.internetcraft.Entity;

import com.internetcraft.Item.Items;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityDoge extends EntityWolf
{

	public EntityDoge(World worldIn)
	{
		super(worldIn);
		this.setSize(1.0F, 1.0F);
		((PathNavigateGround) this.getNavigator()).func_179690_a(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 0.5D, false));
		// No mating for now
		// this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.dorito, false));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2D);
	}

	@Override
	public boolean canBreatheUnderwater()
	{
		return false;
	}

	@Override
	public boolean isPushedByWater()
	{
		return false;
	}

	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();
	}

	@Override
	protected String getLivingSound()
	{
		return "mob.rabbit.idle";
	}

	@Override
	protected String getHurtSound()
	{
		return "mob.wolf.hurt";
	}

	@Override
	protected String getDeathSound()
	{
		return "mob.wolf.hurt";
	}

	@Override
	protected void playStepSound(BlockPos p_180429_1_, Block p_180429_2_)
	{
		this.playSound("mob.cow.step", 0.15F, 1.0F);
	}

	@Override
	protected float getSoundVolume()
	{
		return 0.4F;
	}

	@Override
	protected Item getDropItem()
	{
		return com.internetcraft.Item.Items.bacon;
	}

	@Override
	protected void dropFewItems(boolean recentlyhit, int modifier)
	{
		if(Math.random()>0.8){
			this.dropItem(com.internetcraft.Item.Items.bacon, 1);
			this.dropItem(com.internetcraft.Item.Items.dorito, 1);
		}
		else{
			this.dropItem(com.internetcraft.Item.Items.bacon, 1);
		}
	}

	@Override
	public boolean interact(EntityPlayer player)
	{
		return super.interact(player);
	}

	@Override
	public EntityDoge createChild(EntityAgeable ageable)
	{
		return new EntityDoge(this.worldObj);
	}

	@Override
	public float getEyeHeight()
	{
		return this.height;
	}

	@Override
	public boolean getCanSpawnHere()
	{
		return super.getCanSpawnHere();
	}
}