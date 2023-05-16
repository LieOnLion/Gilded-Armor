package io.github.lieonlion.lolgilded;

import io.github.lieonlion.lolgilded.init.ItemInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GildedArmor implements ModInitializer {
	public static final String MODID = "lolgilded";
	public static final Logger LOGGER = LoggerFactory.getLogger("lolgilded");

	public static final TagKey<Item> GILDED_ARMOR = TagKey.of(RegistryKeys.ITEM, new Identifier("lolgilded", "gilded_armor"));

	@Override
	public void onInitialize() {
		ItemInit.registerItems();
		LOGGER.info(MODID + " has loaded");
	}
}