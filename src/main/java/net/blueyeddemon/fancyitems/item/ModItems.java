package net.blueyeddemon.fancyitems.item;

import net.blueyeddemon.fancyitems.FancyItems;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FancyItems.MOD_ID);

    public static final DeferredItem<Item> GLOWEM = ITEMS.register("glowem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_GLOWEM = ITEMS.register("raw_glowem",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
