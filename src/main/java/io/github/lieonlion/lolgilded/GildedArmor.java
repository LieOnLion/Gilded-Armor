package io.github.lieonlion.lolgilded;

import io.github.lieonlion.lolgilded.init.ItemInit;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GildedArmor implements ModInitializer {
	public static final String MODID = "lolgilded";
	public static final Logger LOGGER = LoggerFactory.getLogger("lolgilded");

	@Override
	public void onInitialize() {
		ItemInit.registerItems();
		LOGGER.info(MODID + " has loaded");
	}
}