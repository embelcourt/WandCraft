package com.luxtechllc.wandcraft.init;

import org.lwjgl.input.Keyboard;

import com.luxtechllc.wandcraft.guis.SpellSelect;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import com.luxtechllc.wandcraft.spells.doSpell;

public class Events {
	 @SubscribeEvent
	 public void onClientTick(TickEvent.ClientTickEvent event) {
		 try {			 
			 if(Keyboard.isKeyDown(Keyboard.KEY_R)) {
				 Minecraft.getMinecraft().displayGuiScreen(new SpellSelect());
			 }
			 if(Minecraft.getMinecraft().player.isSwingInProgress) {
				 doSpell.run();
			 }
		 }
		 catch (NullPointerException e) {
			 System.out.println(e);
		 }
	 }
}
