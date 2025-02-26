package net.mcreator.srpr_kravataf.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.srpr_kravataf.item.ItemDynamite;
import net.mcreator.srpr_kravataf.ElementsScapeandRunReinforced;

@ElementsScapeandRunReinforced.ModElement.Tag
public class ProcedureDynamiteUsed extends ElementsScapeandRunReinforced.ModElement {
	public ProcedureDynamiteUsed(ElementsScapeandRunReinforced instance) {
		super(instance, 27);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DynamiteUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemDynamite.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
