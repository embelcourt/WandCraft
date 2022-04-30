package com.luxtechllc.wandcraft.spells;

import com.luxtechllc.wandcraft.guis.SpellSelect;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class doSpell{
	
	 public static void run() {
		 try {
			 
			 switch (SpellSelect.currentSpell) {
			 	case 0:
			 		//do firestuff here
			 		SpawnFire.fireSpell();
			 		break;
			 	case 1:
			 		SpawnWater.waterSpell();
			 		break;
			 }
				 
		 }
		 catch(NullPointerException e){
			 System.out.println("ERRROR:" + e);
		 }
	}
}
