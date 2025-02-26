
package net.mcreator.srpr_kravataf.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.srpr_kravataf.item.ItemFleshArmor;
import net.mcreator.srpr_kravataf.ElementsScapeandRunReinforced;

@ElementsScapeandRunReinforced.ModElement.Tag
public class TabSrpDAcreativetab extends ElementsScapeandRunReinforced.ModElement {
	public TabSrpDAcreativetab(ElementsScapeandRunReinforced instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabsrpdacreativetab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemFleshArmor.helmet, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
