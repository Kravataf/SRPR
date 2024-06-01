package net.mcreator.srpdefenseaddon_kravataf.procedure;

import net.minecraft.world.World;

import net.mcreator.srpdefenseaddon_kravataf.ElementsScapeandRunParasitesDefenseAddon;

@ElementsScapeandRunParasitesDefenseAddon.ModElement.Tag
public class ProcedureDynamiteExplode extends ElementsScapeandRunParasitesDefenseAddon.ModElement {
	public ProcedureDynamiteExplode(ElementsScapeandRunParasitesDefenseAddon instance) {
		super(instance, 28);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DynamiteExplode!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DynamiteExplode!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DynamiteExplode!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DynamiteExplode!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 4, true);
		}
	}
}
