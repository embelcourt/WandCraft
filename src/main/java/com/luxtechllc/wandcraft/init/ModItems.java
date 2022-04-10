package com.luxtechllc.wandcraft.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.luxtechllc.wandcraft.WandCraft;
import com.luxtechllc.wandcraft.items.BasicItem;

@Mod.EventBusSubscriber(modid=WandCraft.MODID)
public class ModItems {
	
	static Item testwand_item;
	
	public static void init() {
		testwand_item = new BasicItem("testwand_item");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(testwand_item);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(testwand_item);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "normal"));
	}
}