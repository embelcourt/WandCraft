package com.luxtechllc.wandcraft.events;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class SpawnWater extends Event{
	 
	 @SubscribeEvent
	 public void onClientTick(TickEvent.ClientTickEvent event) {
		 try {
			 RayTraceResult lookingAtobj = Minecraft.getMinecraft().objectMouseOver;
			 BlockPos lookingatPos = lookingAtobj.getBlockPos();
			 BlockPos player = new BlockPos(lookingatPos);
			 
			 Minecraft.getMinecraft().world.setBlockState(player, Blocks.WATER.getDefaultState());
			 //System.out.println(player);
		 }
		 catch(NullPointerException e){
			 //System.out.println("No player position");
		 }
	}
}
