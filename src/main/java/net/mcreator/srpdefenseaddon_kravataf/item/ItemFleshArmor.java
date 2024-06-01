
package net.mcreator.srpdefenseaddon_kravataf.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.srpdefenseaddon_kravataf.procedure.ProcedureFleshArmorPassiveEffect;
import net.mcreator.srpdefenseaddon_kravataf.creativetab.TabSrpDAcreativetab;
import net.mcreator.srpdefenseaddon_kravataf.ElementsScapeandRunParasitesDefenseAddon;

@ElementsScapeandRunParasitesDefenseAddon.ModElement.Tag
public class ItemFleshArmor extends ElementsScapeandRunParasitesDefenseAddon.ModElement {
	@GameRegistry.ObjectHolder("srpdefenseaddon_kravataf:flesharmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("srpdefenseaddon_kravataf:flesharmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("srpdefenseaddon_kravataf:flesharmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("srpdefenseaddon_kravataf:flesharmorboots")
	public static final Item boots = null;
	public ItemFleshArmor(ElementsScapeandRunParasitesDefenseAddon instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("FLESHARMOR", "srpdefenseaddon_kravataf:emplatermorexture", 50,
				new int[]{4, 10, 12, 4}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureFleshArmorPassiveEffect.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("flesharmorhelmet").setRegistryName("flesharmorhelmet").setCreativeTab(TabSrpDAcreativetab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureFleshArmorPassiveEffect.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("flesharmorbody").setRegistryName("flesharmorbody").setCreativeTab(TabSrpDAcreativetab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureFleshArmorPassiveEffect.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("flesharmorlegs").setRegistryName("flesharmorlegs").setCreativeTab(TabSrpDAcreativetab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureFleshArmorPassiveEffect.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("flesharmorboots").setRegistryName("flesharmorboots").setCreativeTab(TabSrpDAcreativetab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("srpdefenseaddon_kravataf:flesharmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("srpdefenseaddon_kravataf:flesharmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("srpdefenseaddon_kravataf:flesharmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("srpdefenseaddon_kravataf:flesharmorboots", "inventory"));
	}
}
