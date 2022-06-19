package net.mcreator.omesbaua.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.omesbaua.ElementsOmesbaua;

@ElementsOmesbaua.ModElement.Tag
public class ProcedureUnicorndustRightClickedOnEntity extends ElementsOmesbaua.ModElement {
	public ProcedureUnicorndustRightClickedOnEntity(ElementsOmesbaua instance) {
		super(instance, 3);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure UnicorndustRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.LUCK, (int) 1200, (int) 1));
	}
}
