package mods.smitecraft.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ZincOre extends Block{

	public ZincOre(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(smitecraft.tabSmiteCraft);
	}

}
