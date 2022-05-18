package com.luxtechllc.wandcraft;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import com.luxtechllc.wandcraft.init.Events;
import com.luxtechllc.wandcraft.init.ModBlocks;
import com.luxtechllc.wandcraft.init.ModItems;

@Mod(modid = WandCraft.MODID, name = WandCraft.NAME, version = WandCraft.VERSION)
public class WandCraft
{
    public static final String MODID = "wandcraft";
    public static final String NAME = "WandCraft";
    public static final String VERSION = "0.1";
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("Starting preInit");
        ModBlocks.init();
        ModItems.init();
        System.out.println("finished preInit");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	System.out.println("init");
    }
    @EventHandler
	public void postInit(FMLPostInitializationEvent event) {
    	System.out.println("postInit");
	}
    
    @EventHandler
    public void serverStarted(FMLServerStartedEvent event) {
    	FMLCommonHandler.instance().bus().register(new Events());
    }
    
}
