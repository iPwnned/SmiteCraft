package mods.smitecraft.common;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class CopperSword extends ItemSword {

	
	public CopperSword(int i, EnumToolMaterial enumToolMaterial){
		super(i, enumToolMaterial);
		this.setCreativeTab(smitecraft.tabSmiteCraft);
	}
	
}
