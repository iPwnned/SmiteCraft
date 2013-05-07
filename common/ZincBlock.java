package mods.smitecraft.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ZincBlock extends Block{

	public ZincBlock(int par1) {
		super(par1, Material.iron);
		this.setCreativeTab(smitecraft.tabSmiteCraft);
	}

}
