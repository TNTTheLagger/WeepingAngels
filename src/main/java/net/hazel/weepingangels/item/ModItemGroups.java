package net.hazel.weepingangels.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hazel.weepingangels.WeepingAngels;
import net.hazel.weepingangels.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup WEEPING_ANGELS_MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WeepingAngels.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.moditemspanel"))
                    .icon(()-> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        // PUT ALL BLOCKS AND ITEMS THAT NEED TO SHOW UP IN CREATIVE HERE

                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
    }).build());
    public static void registerItemGroups(){
        WeepingAngels.LOGGER.info("Registering item groups for" + WeepingAngels.MOD_ID);
    }
}
