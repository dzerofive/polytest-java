package nl.polysadnik.polytest;

import nl.polysadnik.polytest.item.ModItems;
import nl.polysadnik.polytest.block.ModBlocks;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PolyTest implements ModInitializer {
	public static final String MOD_ID = "polytest";
	public static final Logger LOGGER = LogManager.getLogger();
	

	@Override
	public void onInitialize() {
		LOGGER.info("Polytest Fabric initialized successfully!"); 

                ModItems.registerModItems();
                ModBlocks.registerModBlocks();
	}
}


