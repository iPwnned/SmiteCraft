package mods.smitecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class CopperArmor extends ItemArmor implements IArmorTextureProvider {

	public CopperArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(smitecraft.tabSmiteCraft);
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == smitecraft.CopperHelmet.itemID || itemstack.itemID == smitecraft.CopperPlate.itemID || itemstack.itemID == smitecraft.CopperBoots.itemID){
			return "/mods/smitecraft/textures/armor/copper_1.png";
		}
		if(itemstack.itemID == smitecraft.CopperLegs.itemID){
			return "/mods/smitecraft/textures/armor/copper_2.png";
		}
		else return "/mods/smitecraft/textures/armor/copper_2.png";
	}
	public String getTextureFile(){
		return "/aussiecraft/aussiecraft_items.png";
	}
}
