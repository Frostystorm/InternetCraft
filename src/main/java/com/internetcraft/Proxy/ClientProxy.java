package com.internetcraft.Proxy;

import com.internetcraft.Block.Blocks;
import com.internetcraft.Item.Items;

public class ClientProxy extends CommonProxy
{
	public void preInit()
	{
		super.preInit();
	}

	public void Init()
	{
		super.Init();
		Items.registerModels();
		Blocks.registerModels();
	}

	public void postInit()
	{
		super.postInit();
	}
}
