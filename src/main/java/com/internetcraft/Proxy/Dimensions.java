package com.internetcraft.Proxy;

import net.minecraft.world.WorldProviderSurface;
import net.minecraftforge.common.DimensionManager;

public class Dimensions
{
	public static int baconID;
	public static void init()
	{
		getID();
		DimensionManager.registerProviderType(baconID, WorldProviderSurface.class, true);
		DimensionManager.registerDimension(baconID, baconID);
	}
	public static void getID()
	{
		System.out.println("ID: " + baconID);
		baconID = DimensionManager.getNextFreeDimId();
		System.out.println("ID: " + baconID);
	}
}
