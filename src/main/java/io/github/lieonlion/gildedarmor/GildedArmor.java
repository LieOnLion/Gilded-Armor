package io.github.lieonlion.gildedarmor;

import com.mojang.logging.LogUtils;
import io.github.lieonlion.gildedarmor.init.ItemInit;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(GildedArmor.MODID)
public class GildedArmor {
	public static final String MODID = "lolgilded";
	private static final Logger LOGGER = LogUtils.getLogger();

	public GildedArmor() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ItemInit.register(modEventBus);

		modEventBus.addListener(this::commonSetup);
		MinecraftForge.EVENT_BUS.register(this);

		modEventBus.addListener(this::addCreative);
	}

	private void commonSetup(final FMLCommonSetupEvent event) {
	}

	private void addCreative(CreativeModeTabEvent.BuildContents event) {
		if(event.getTab() == CreativeModeTabs.COMBAT) {
			event.accept(ItemInit.GILDED_NETHERITE_HELMET);
			event.accept(ItemInit.GILDED_NETHERITE_CHESTPLATE);
			event.accept(ItemInit.GILDED_NETHERITE_LEGGINGS);
			event.accept(ItemInit.GILDED_NETHERITE_BOOTS);
			event.accept(ItemInit.GILDED_ENDERITE_HELMET);
			event.accept(ItemInit.GILDED_ENDERITE_CHESTPLATE);
			event.accept(ItemInit.GILDED_ENDERITE_LEGGINGS);
			event.accept(ItemInit.GILDED_ENDERITE_BOOTS);
		}
	}

	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
		}
	}
}