package nl.polysadnik.polytest.item;

import nl.polysadnik.polytest.PolyTest;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;


public class ModItems {
	public static final Item LEATHER_STRAP = registerItem("leather_strap", new Item(new FabricItemSettings()));
	public static final Item POLYTEM = registerItem("polytem", new Item(new FabricItemSettings()));


	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(PolyTest.MOD_ID, name), item);
	}

        public static void addToItemGroup(ItemGroup group, Item item) {
                ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        }


        public static void addItemsToItemGroup() {
                addToItemGroup(ItemGroups.INGREDIENTS, LEATHER_STRAP);
                addToItemGroup(ItemGroups.INGREDIENTS, POLYTEM);
        }
	public static void registerModItems() {
		PolyTest.LOGGER.info("Registering Items for " + PolyTest.MOD_ID);
                addItemsToItemGroup();
	}
}
