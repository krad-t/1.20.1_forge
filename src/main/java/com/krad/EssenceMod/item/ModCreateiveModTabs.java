package com.krad.EssenceMod.item;

import com.krad.EssenceMod.EssenceMod;
import com.krad.EssenceMod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreateiveModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EssenceMod.MODID);

    public static final RegistryObject<CreativeModeTab> ESSENCE_TAB = CREATIVE_MODE_TABS.register("essence",
            () -> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.PLANT_ESSENCE_BLUE.get()))
                    .title(Component.translatable("creativeTab.essence_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PLANT_ESSENCE_BLUE.get());
                        pOutput.accept(ModItems.PLANT_ESSENCE_RED.get());

                        pOutput.accept(ModBlocks.VOID_ICE.get());
                        pOutput.accept(ModBlocks.MORTAR_BLOCK.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}








