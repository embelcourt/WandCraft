package com.luxtechllc.wandcraft.spells;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;

public class SpawnFire{
	 
	public static void fireSpell() {
		RayTraceResult lookingAtobj = Minecraft.getMinecraft().objectMouseOver;
		BlockPos lookingatPos = lookingAtobj.getBlockPos();
		Minecraft.getMinecraft().world.setBlockState(lookingatPos, Blocks.FIRE.getDefaultState());
		Minecraft.getMinecraft().world.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, Double.valueOf(lookingatPos.getX()), Double.valueOf(lookingatPos.getY()), Double.valueOf(lookingatPos.getZ()), .5, .5, .5);
	}
}
