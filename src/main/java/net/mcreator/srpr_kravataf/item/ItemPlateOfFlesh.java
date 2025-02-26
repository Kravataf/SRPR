
package net.mcreator.srpr_kravataf.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.srpr_kravataf.creativetab.TabSrpDAcreativetab;
import net.mcreator.srpr_kravataf.ElementsScapeandRunReinforced;

@ElementsScapeandRunReinforced.ModElement.Tag
public class ItemPlateOfFlesh extends ElementsScapeandRunReinforced.ModElement {
	@GameRegistry.ObjectHolder("srpr_kravataf:plateofflesh")
	public static final Item block = null;
	public ItemPlateOfFlesh(ElementsScapeandRunReinforced instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("srpr_kravataf:plateofflesh", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 32;
			setUnlocalizedName("plateofflesh");
			setRegistryName("plateofflesh");
			setCreativeTab(TabSrpDAcreativetab.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
