package io.github.lieonlion.gildedarmor.init;

import io.github.lieonlion.gildedarmor.GildedArmor;
import io.github.lieonlion.gildedarmor.items.GildedArmorItem;
import io.github.lieonlion.gildedarmor.items.GildedEnderiteHelmetItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GildedArmor.MODID);
	
	public static final RegistryObject<ArmorItem> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet", () -> new GildedArmorItem(ArmorMaterialInit.GILDED_NETHERITE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
	public static final RegistryObject<ArmorItem> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate", () -> new GildedArmorItem(ArmorMaterialInit.GILDED_NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
	public static final RegistryObject<ArmorItem> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings", () -> new GildedArmorItem(ArmorMaterialInit.GILDED_NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
	public static final RegistryObject<ArmorItem> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots", () -> new GildedArmorItem(ArmorMaterialInit.GILDED_NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

	public static final RegistryObject<ArmorItem> GILDED_ENDERITE_HELMET = ITEMS.register("gilded_enderite_helmet", () -> new GildedEnderiteHelmetItem(ArmorMaterialInit.GILDED_ENDERITE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
	public static final RegistryObject<ArmorItem> GILDED_ENDERITE_CHESTPLATE = ITEMS.register("gilded_enderite_chestplate", () -> new GildedArmorItem(ArmorMaterialInit.GILDED_ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
	public static final RegistryObject<ArmorItem> GILDED_ENDERITE_LEGGINGS = ITEMS.register("gilded_enderite_leggings", () -> new GildedArmorItem(ArmorMaterialInit.GILDED_ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
	public static final RegistryObject<ArmorItem> GILDED_ENDERITE_BOOTS = ITEMS.register("gilded_enderite_boots", () -> new GildedArmorItem(ArmorMaterialInit.GILDED_ENDERITE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}