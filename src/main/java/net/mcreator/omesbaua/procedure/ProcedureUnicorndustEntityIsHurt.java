package net.mcreator.omesbaua.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.omesbaua.ElementsOmesbaua;

@ElementsOmesbaua.ModElement.Tag
public class ProcedureUnicorndustEntityIsHurt extends ElementsOmesbaua.ModElement {
	public ProcedureUnicorndustEntityIsHurt(ElementsOmesbaua instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure UnicorndustEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 40, (int) 2));
	}
}
