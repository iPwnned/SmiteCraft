package mods.smitecraft.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperOre extends Block{

	public CopperOre(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(smitecraft.tabSmiteCraft);
	}

}
