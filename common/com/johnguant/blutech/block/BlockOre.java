/*
 *   This file is part of BluTech.
 *
 *  BluTech is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  BluTech is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with BluTech.  If not, see <http://www.gnu.org/licenses/>.
 *  
 */

package com.johnguant.blutech.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOre extends Block {

	// Defines BlockOre
	public BlockOre(int par1, Material material) {
		super(par1, material);
		setHardness(3.0F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("bluOre");
		setCreativeTab(CreativeTabs.tabBlock);
		textureName="bluOre";
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
	         this.blockIcon = iconRegister.registerIcon("blutech:" + (this.getUnlocalizedName().substring(5)));
	}
	/**
	 * Returns the ID of the items to drop on destruction.
	 */

}
