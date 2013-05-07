package mods.smitecraft.client;

import mods.smitecraft.common.EntitySilverArrow;
import mods.smitecraft.common.EntityTest;
import mods.smitecraft.common.ServerProxy;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	@Override
	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityTest.class, new RenderZeusMob(new ModelZeusMob(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySilverArrow.class, new RenderSilverArrow());
		
	}
	public int addArmor(String Armor){
		return RenderingRegistry.addNewArmourRendererPrefix(Armor);
	}
}

