package com.internetcraft;

import com.internetcraft.Item.Items;
import com.internetcraft.Reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class InternetCraft
{
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Items.init();
	}

	@Mod.EventHandler
	@SideOnly(Side.CLIENT)
	public void preInit(FMLInitializationEvent event)
	{
		Items.registerModels();
	}
}
