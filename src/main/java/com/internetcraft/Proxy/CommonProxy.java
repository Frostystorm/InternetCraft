package com.internetcraft.Proxy;

import com.internetcraft.Block.Blocks;
import com.internetcraft.Item.Items;
import com.internetcraft.Util.Recipes;

public class CommonProxy
{
	public void preInit()
	{
		Items.init();
		Blocks.init();
		Recipes.register();
	}

	public void Init()
	{

	}

	public void postInit()
	{

	}
}
