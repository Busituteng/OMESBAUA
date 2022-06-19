
package net.mcreator.omesbaua.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.omesbaua.item.ItemUnicorndust;
import net.mcreator.omesbaua.ElementsOmesbaua;

@ElementsOmesbaua.ModElement.Tag
public class TabOmesbaua extends ElementsOmesbaua.ModElement {
	public TabOmesbaua(ElementsOmesbaua instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabomesbaua") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemUnicorndust.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
