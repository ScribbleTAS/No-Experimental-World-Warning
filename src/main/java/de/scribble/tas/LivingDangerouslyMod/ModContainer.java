package de.scribble.tas.LivingDangerouslyMod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModContainer implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("No-Experimental-World-Warning");

	@Override
	public void onInitialize() {
		LOGGER.info("Initilized Mod!");
	}
}
