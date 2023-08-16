package com.krad.EssenceMod.block.custom;

import com.krad.EssenceMod.block.entity.ModBlockEntities;
import com.krad.EssenceMod.block.entity.custom.MortarEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class MortarBlock extends BaseEntityBlock {

    protected static final VoxelShape SHAPE =
            Block.box(0.0D, 0.0D, 0.0D, 15.0D, 10.0D, 15.0D);

    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    public MortarBlock(Properties pProperties) {

        super(pProperties);
    }

    public static VoxelShape getSHAPE() {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new MortarEntity(ModBlockEntities.MORTAR_ENTITY.get(),pPos, pState);
    }
}
