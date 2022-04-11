package com.luxtechllc.wandcraft;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import org.apache.logging.log4j.Logger;

import com.luxtechllc.wandcraft.init.ModBlocks;
import com.luxtechllc.wandcraft.init.ModItems;
import com.luxtechllc.wandcraft.events.SpawnWater;

@Mod(modid = WandCraft.MODID, name = WandCraft.NAME, version = WandCraft.VERSION)
public class WandCraft
{
    public static final String MODID = "wandcraft";
    public static final String NAME = "WandCraft";
    public static final String VERSION = "0.1";

    private static Logger logger;

    
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
    	FMLCommonHandler.instance().bus().register(new SpawnWater());
    }
}
