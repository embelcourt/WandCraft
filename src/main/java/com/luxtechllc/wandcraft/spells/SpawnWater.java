package com.luxtechllc.wandcraft.spells;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.fml.common.eventhandler.Event;

public class SpawnWater extends Event{
	 
	public static void waterSpell() {
		RayTraceResult lookingAtobj = Minecraft.getMinecraft().objectMouseOver;
		BlockPos lookingatPos = lookingAtobj.getBlockPos();
		Minecraft.getMinecraft().world.setBlockState(lookingatPos, Blocks.WATER.getDefaultState());
		Minecraft.getMinecraft().world.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, Double.valueOf(lookingatPos.getX()), Double.valueOf(lookingatPos.getY()), Double.valueOf(lookingatPos.getZ()), .5, .5, .5);
	}
}

