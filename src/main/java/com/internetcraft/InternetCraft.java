package com.internetcraft;

import com.internetcraft.Block.Blocks;
import com.internetcraft.Item.Items;
import com.internetcraft.Proxy.CommonProxy;
import com.internetcraft.Reference.Reference;
import com.internetcraft.Util.Recipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class InternetCraft
{
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@Mod.Instance(Reference.MODID)
	public static InternetCraft instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		InternetCraft.instance = this;
		proxy.preInit();
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.Init();
		proxy.registerRenderers();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit();
	}
}
