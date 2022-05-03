package com.luxtechllc.wandcraft.guis;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;

public class SpellSelect extends GuiScreen{
	private GuiButton back = new GuiButton(0, this.width/2, this.height/2+20,"Back");
	private GuiButton next = new GuiButton(1, this.width/2, this.height/2+40,"Next" );
	private GuiButton close = new GuiButton(2, this.width/2, this.height/2+60,"Close");
	
	private FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
	
	private GuiTextField SpellName = new GuiTextField(0, fontRenderer, this.width, this.height, 300, 20);
	
	public static String[] SpellList = {"Fire","Water"};
	
	public static int currentSpell = 0; 
	
	@Override
	public void initGui() {
		super.initGui();
		this.buttonList.add(back);
		this.buttonList.add(next);
		this.buttonList.add(close);
		
		SpellName.setText(SpellList[currentSpell]);
		SpellName.setTextColor(0xFFFFFF);
		SpellName.setEnableBackgroundDrawing(true);
		//SpellName.setVisible(true);
		SpellName.setEnabled(false);
	}
		
	@Override
		protected void actionPerformed(GuiButton button) {
			if(button == close ) {
				System.out.println("Closing");
				mc.player.closeScreen();				
			}
			else if(button == next) {
				System.out.println("Next");
				if(currentSpell+1 < SpellList.length) {
					currentSpell += 1;
					SpellName.setText(SpellList[currentSpell]);
				}
				else if (currentSpell == SpellList.length -1) {
					currentSpell = 0;
					SpellName.setText(SpellList[currentSpell]);
				}
				
			}
			else if (button == back) {
				System.out.println("Back");
				if(currentSpell-1 >= 0) {
					currentSpell -= 1;
					SpellName.setText(SpellList[currentSpell]);
				}
				else if (currentSpell == 0) {
					currentSpell = SpellList.length -1;
					SpellName.setText(SpellList[currentSpell]);
				}
			}
		}
		
		@Override
		public void drawScreen(int mouseX, int mouseY, float particalTicks) {
			this.drawDefaultBackground();
			super.drawScreen(mouseX, mouseY, particalTicks);
			this.SpellName.drawTextBox();
		}
		
		@Override
		public boolean doesGuiPauseGame() {
			return false;			
		}
}

