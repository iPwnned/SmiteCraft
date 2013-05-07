package mods.smitecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class GoldDagger extends ItemSword {

	
	public GoldDagger(int i, EnumToolMaterial enumToolMaterial){
		super(i, enumToolMaterial);
		this.setCreativeTab(smitecraft.tabSmiteCraft);
	}
	
}
