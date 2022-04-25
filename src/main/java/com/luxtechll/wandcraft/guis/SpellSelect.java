package com.luxtechll.wandcraft.guis;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLabel;
import net.minecraft.client.gui.GuiScreen;

public class SpellSelect extends GuiScreen{
	private GuiButton back = new GuiButton(0, this.width/2, this.height/2,"Back");
	private GuiButton next = new GuiButton(1, this.width/2 +100, this.height/2,"Next" );
	private GuiButton close = new GuiButton(2, this.width/2 +200, this.height/2,"Close");
	
	private GuiLabel SpellName;
	
	@Override
	public void initGui() {
		super.initGui();
		this.buttonList.add(back);
		this.buttonList.add(next);
		this.buttonList.add(close);
		
		
		
		
			
		}
		@Override
		protected void actionPerformed(GuiButton button) {
			if(button == close ) {
				mc.player.closeScreen();
				
			}
			
		
		}
		protected void actionPerformed1(GuiButton button1) {
			if(button1 == back) {
				
			}
			
		}
		private void PlayerSwing(){
			if(Minecraft.getMinecraft().player.isSwingInProgress) {
				mc.player.openGui(SpellName, height, null, height, width, height);
			}
		}
		public void drawnScreen(int mouseX, int mouseY, float particalTicks) {
			this.drawDefaultBackground();
			
		super.drawScreen(mouseX, mouseY, particalTicks);
		
}
{
}
}

