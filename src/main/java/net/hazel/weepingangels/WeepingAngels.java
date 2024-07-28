package net.hazel.weepingangels;

import net.fabricmc.api.ModInitializer;

import net.hazel.weepingangels.block.ModBlocks;
import net.hazel.weepingangels.item.ModItemGroups;
import net.hazel.weepingangels.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeepingAngels implements ModInitializer {
    public static final String MOD_ID = "weeping-angels";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + MOD_ID);
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}