package com.luxtechllc.wandcraft.spells;

import net.minecraft.client.Minecraft;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;

public class KillSpell {

	public static void killSpell() {
		RayTraceResult lookingAtobj = Minecraft.getMinecraft().objectMouseOver;
		lookingAtobj.entityHit.setDead();
		
		
	}
}
