package com.krad.EssenceMod.item;

import com.krad.EssenceMod.EssenceMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeDeferredRegistriesSetup;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EssenceMod.MODID);

    public static final RegistryObject<Item> PLANT_ESSENCE_BLUE = ITEMS.register("blue_essence",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLANT_ESSENCE_RED = ITEMS.register("red_essence",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}


















