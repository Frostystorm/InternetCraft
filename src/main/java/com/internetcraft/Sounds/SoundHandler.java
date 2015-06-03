package com.internetcraft.Sounds;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class SoundHandler {

	public SoundHandler() {
		// TODO Auto-generated constructor stub
	}

	public static void onEntityPlay(String name,World world,Entity entityName,float volume ,float pitch){
		world.playSoundAtEntity(entityName,("internetcraft:" + name), (float)volume,(float) pitch);
	}

}
