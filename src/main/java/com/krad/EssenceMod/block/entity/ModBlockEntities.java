package com.krad.EssenceMod.block.entity;

import com.krad.EssenceMod.EssenceMod;
import com.krad.EssenceMod.block.ModBlocks;
import com.krad.EssenceMod.block.entity.custom.MortarEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, EssenceMod.MODID);

    public static final RegistryObject<BlockEntityType<MortarEntity>> MORTAR_ENTITY = BLOCK_ENTITIES
            .register("mortar_entity",
                    () -> BlockEntityType.Builder.of(
                            MortarEntity::new, ModBlocks.MORTAR_BLOCK.get()
                    ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
