package com.luxtechllc.wandcraft.events;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class SpawnWater extends Event{
	 
	 @SubscribeEvent
	 public void onClientTick(TickEvent.ClientTickEvent event) {
		 try {
			 BlockPos player = Minecraft.getMinecraft().player.getPosition();
			 Minecraft.getMinecraft().world.setBlockState(player, Blocks.WATER.getDefaultState());
			 System.out.println(player);
			 if(Minecraft.getMinecraft().player.isSwingInProgress) {
				 RayTraceResult lookingAtobj = Minecraft.getMinecraft().objectMouseOver;
				 BlockPos lookingatPos = lookingAtobj.getBlockPos();
				 BlockPos player1 = new BlockPos(lookingatPos);
				 Minecraft.getMinecraft().world.setBlockState(player1, Blocks.LAVA.getDefaultState());
				 Minecraft.getMinecraft().world.spawnParticle(EnumParticleTypes.LAVA, Double.valueOf(lookingatPos.getX()), Double.valueOf(lookingatPos.getY()), Double.valueOf(lookingatPos.getZ()), .5, .5, .5);
			 }
			 BlockPos player1 = Minecraft.getMinecraft().player.getPosition();
			 if(Minecraft.getMinecraft().player.isSwingInProgress) {
			RayTraceResult lookingAtobj = Minecraft.getMinecraft().objectMouseOver;
			BlockPos lookingatPos = lookingAtobj.getBlockPos();
			BlockPos Player1 = new BlockPos(lookingatPos);
			Minecraft.getMinecraft().world.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, Double.valueOf(lookingatPos.getX()), Double.valueOf(lookingatPos.getY()), Double.valueOf(lookingatPos.getZ()), .5, .5, .5);
					 
				 
			 }
			 //System.out.println(player);
		 }
		 catch(NullPointerException e){
			 System.out.println("No player position");
			 //System.out.println("No player position");
		 }
	}
}

