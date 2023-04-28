package nl.polysadnik.polytest.block;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nl.polysadnik.polytest.PolyTest;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;

public class ModBlocks {

        public static final Block TOP_ARCH = registerBlock("top_arch", new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
        public static final Block UNDERROOF = registerBlock("underroof", new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
        public static final Block ROONBLOCK = registerBlock("roon_block", new Block(FabricBlockSettings.of(Material.STONE).strength(99.f)), ItemGroups.BUILDING_BLOCKS);
        
        private static Item registerBlockItem(String name, Block block, ItemGroup group) {
                Item item = Registry.register(Registries.ITEM, new Identifier(PolyTest.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
                ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
                return item;
        }
        private static Block registerBlock(String name, Block block, ItemGroup group) {
                registerBlockItem(name, block, group);
                return Registry.register(Registries.BLOCK, new Identifier(PolyTest.MOD_ID, name), block);
        }

        public static void registerModBlocks() {
                PolyTest.LOGGER.info("Registering blocks for " + PolyTest.MOD_ID);
        }

}
