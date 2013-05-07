package mods.smitecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabSmite extends CreativeTabs {

	public CreativeTabSmite(String label) {
    super(label);
}
	public ItemStack getIconItemStack() {
	    return new ItemStack(smitecraft.SmiteBlock);
	}

}
