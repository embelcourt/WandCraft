package com.luxtechllc.wandcraft.spells;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;



public class KillSpell {

	public static void killSpell() {
		RayTraceResult lookingAtobj = Minecraft.getMinecraft().objectMouseOver;
		BlockPos lookingAtPos = lookingAtobj.getBlockPos();
		EntityLivingBase entity = (EntityLivingBase) lookingAtobj.entityHit;
		entity.setFire(10);
		entity.setHealth(0);		
	}
}
