package com.luxtechllc.wandcraft.events;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
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
		 }
		 catch(NullPointerException e){
			 System.out.println("No player position");
		 }
	}
}
