package net.mcreator.srpdefenseaddon_kravataf.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.srpdefenseaddon_kravataf.ElementsScapeandRunParasitesDefenseAddon;

@ElementsScapeandRunParasitesDefenseAddon.ModElement.Tag
public class ProcedureFleshArmorPassiveEffect extends ElementsScapeandRunParasitesDefenseAddon.ModElement {
	public ProcedureFleshArmorPassiveEffect(ElementsScapeandRunParasitesDefenseAddon instance) {
		super(instance, 23);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FleshArmorPassiveEffect!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 1, (int) 2));
	}
}
