package mods.smitecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;

public class SilverHoe extends ItemHoe {

	
	public SilverHoe(int i, EnumToolMaterial enumToolMaterial){
		super(i, enumToolMaterial);
		this.setCreativeTab(smitecraft.tabSmiteCraft);
	}
	
}
