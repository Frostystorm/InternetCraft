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
		EntityRegistry.addSpawn(EntityDoge.class, 4, 1, 3, EnumCreatureType.AMBIENT, BiomeGenBase.forest);
		EntityRegistry.addSpawn(EntityDoge.class, 4, 1, 3, EnumCreatureType.AMBIENT, BiomeGenBase.forestHills);
	}
	public static void registerEntity(Class entityClass, String name)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long seed = name.hashCode();
		Random rand = new Random(seed);
		int primaryColor = rand.nextInt() * 16777215;
		int secondaryColor = rand.nextInt() * 16777215;

		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, InternetCraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
	}
}
