package mods.smitecraft.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class SmiteWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ *16);
			
		}

	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i < 30; i++){
        	int xCoord = chunkX + random.nextInt(16);
        	int yCoord = random.nextInt(100);
        	int zCoord = chunkZ + random.nextInt(16);
        	
        	(new WorldGenMinable(smitecraft.CopperOre.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
		}	
		for(int i = 0; i < 15; i++){
        	int xCoord = chunkX + random.nextInt(16);
        	int yCoord = random.nextInt(37);
        	int zCoord = chunkZ + random.nextInt(16);
        	
        	(new WorldGenMinable(smitecraft.SilverOre.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);		
        	}
		for(int i = 0; i < 28 ; i++){
        	int xCoord = chunkX + random.nextInt(16);
        	int yCoord = random.nextInt(99);
        	int zCoord = chunkZ + random.nextInt(16);
        	
        	(new WorldGenMinable(smitecraft.TinOre.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 20 ; i++){
        	int xCoord = chunkX + random.nextInt(16);
        	int yCoord = random.nextInt(37);
        	int zCoord = chunkZ + random.nextInt(16);
        	
        	(new WorldGenMinable(smitecraft.LeadOre.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
	}
		for(int i = 0; i < 20 ; i++){
        	int xCoord = chunkX + random.nextInt(16);
        	int yCoord = random.nextInt(38);
        	int zCoord = chunkZ + random.nextInt(16);
        	
        	(new WorldGenMinable(smitecraft.ZincOre.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
	}
		for(int i = 0; i < 19 ; i++){
        	int xCoord = chunkX + random.nextInt(16);
        	int yCoord = random.nextInt(29);
        	int zCoord = chunkZ + random.nextInt(16);
        	
        	(new WorldGenMinable(smitecraft.MercuryOre.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 20 ; i++){
        	int xCoord = chunkX + random.nextInt(16);
        	int yCoord = random.nextInt(34);
        	int zCoord = chunkZ + random.nextInt(16);
        	
        	(new WorldGenMinable(smitecraft.ArsenicOre.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 20 ; i++){
        	int xCoord = chunkX + random.nextInt(16);
        	int yCoord = random.nextInt(33);
        	int zCoord = chunkZ + random.nextInt(16);
        	
        	(new WorldGenMinable(smitecraft.AntimonyOre.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	private void generateNether(World world, Random random, int i, int j) {
		
	}

}
