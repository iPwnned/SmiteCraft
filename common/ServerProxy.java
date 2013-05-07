package mods.smitecraft.common;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ServerProxy {

	public void registerRenderThings(){
		
	}
	public int addArmor(String armor){
		return 0;
	}
	{
	TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
	}
	public void registerServerTickHandler() {
		// TODO Auto-generated method stub
		
	}
}
