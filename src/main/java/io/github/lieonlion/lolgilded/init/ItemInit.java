package io.github.lieonlion.lolgilded.init;

import io.github.lieonlion.lolgilded.GildedArmor;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
	public static final Item GILDED_NETHERITE_HELMET = registerItem("gilded_netherite_helmet",
			new ArmorItem(ArmorMaterialInit.GILDED_NETHERITE, ArmorItem.Type.HELMET,
					new FabricItemSettings().fireproof()));
	public static final Item GILDED_NETHERITE_CHESTPLATE = registerItem("gilded_netherite_chestplate",
			new ArmorItem(ArmorMaterialInit.GILDED_NETHERITE, ArmorItem.Type.CHESTPLATE,
					new FabricItemSettings().fireproof()));
	public static final Item GILDED_NETHERITE_LEGGINGS = registerItem("gilded_netherite_leggings",
			new ArmorItem(ArmorMaterialInit.GILDED_NETHERITE, ArmorItem.Type.LEGGINGS,
					new FabricItemSettings().fireproof()));
	public static final Item GILDED_NETHERITE_BOOTS = registerItem("gilded_netherite_boots",
			new ArmorItem(ArmorMaterialInit.GILDED_NETHERITE, ArmorItem.Type.BOOTS,
					new FabricItemSettings().fireproof()));

	public static final Item GILDED_ENDERITE_HELMET = registerItem("gilded_enderite_helmet",
			new ArmorItem(ArmorMaterialInit.GILDED_ENDERITE, ArmorItem.Type.HELMET,
					new FabricItemSettings().fireproof()));
	public static final Item GILDED_ENDERITE_CHESTPLATE = registerItem("gilded_enderite_chestplate",
			new ArmorItem(ArmorMaterialInit.GILDED_ENDERITE, ArmorItem.Type.CHESTPLATE,
					new FabricItemSettings().fireproof()));
	public static final Item GILDED_ENDERITE_LEGGINGS = registerItem("gilded_enderite_leggings",
			new ArmorItem(ArmorMaterialInit.GILDED_ENDERITE, ArmorItem.Type.LEGGINGS,
					new FabricItemSettings().fireproof()));
	public static final Item GILDED_ENDERITE_BOOTS = registerItem("gilded_enderite_boots",
			new ArmorItem(ArmorMaterialInit.GILDED_ENDERITE, ArmorItem.Type.BOOTS,
					new FabricItemSettings().fireproof()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(GildedArmor.MODID, name), item);
	}

	public static void addItemsToItemGroup() {
		addToItemGroup(ItemGroups.COMBAT, GILDED_NETHERITE_HELMET);
		addToItemGroup(ItemGroups.COMBAT, GILDED_NETHERITE_CHESTPLATE);
		addToItemGroup(ItemGroups.COMBAT, GILDED_NETHERITE_LEGGINGS);
		addToItemGroup(ItemGroups.COMBAT, GILDED_NETHERITE_BOOTS);
		addToItemGroup(ItemGroups.COMBAT, GILDED_ENDERITE_HELMET);
		addToItemGroup(ItemGroups.COMBAT, GILDED_ENDERITE_CHESTPLATE);
		addToItemGroup(ItemGroups.COMBAT, GILDED_ENDERITE_LEGGINGS);
		addToItemGroup(ItemGroups.COMBAT, GILDED_ENDERITE_BOOTS);
	} private static void addToItemGroup(ItemGroup group, Item item) {
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
	}

	public static void registerItems() {
		GildedArmor.LOGGER.info("Loading Items for " + GildedArmor.MODID);
		addItemsToItemGroup();
	}
}