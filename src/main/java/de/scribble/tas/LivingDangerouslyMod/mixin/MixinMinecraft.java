package de.scribble.tas.LivingDangerouslyMod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import de.scribble.tas.LivingDangerouslyMod.ModContainer;
import net.minecraft.client.Minecraft;

@Mixin(Minecraft.class)
public class MixinMinecraft {
	
	@ModifyVariable(method = "doLoadLevel", at = @At(value = "STORE"), index = 10, ordinal = 2)
	public boolean inject_doLoadLevel(boolean old) {
		if(old) {
			ModContainer.LOGGER.warn("Skipping confirmation dialogue");
			old = false;
		}
		return old;
	}
}
