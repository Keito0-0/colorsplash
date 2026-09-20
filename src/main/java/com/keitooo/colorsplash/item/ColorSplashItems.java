package com.keitooo.colorsplash.item;

import com.keitooo.colorsplash.ColorSplash;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ColorSplashItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ColorSplash.MOD_ID);

    public static final DeferredItem<Item> ROSE_GOLD = ITEMS.register("rose_gold",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
