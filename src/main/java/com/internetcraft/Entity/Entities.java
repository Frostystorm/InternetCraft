package com.internetcraft.Entity;

import com.internetcraft.InternetCraft;
import com.internetcraft.Reference.Reference;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class Entities
{
	public static void init()
	{
		registerEntity(EntityDoge.class, "entityDoge");
		EntityRegistry.addSpawn(EntityDoge.class, 1, 1, 1, EnumCreatureType.AMBIENT, BiomeGenBase.forest);
	}
	public static void registerEntity(Class entityClass, String name)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		int primaryColor = 0xFFFFCC;
		int secondaryColor = 0xB89470;
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, InternetCraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
		
	}
}
