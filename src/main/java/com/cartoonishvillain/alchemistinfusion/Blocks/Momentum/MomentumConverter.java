package com.cartoonishvillain.alchemistinfusion.Blocks.Momentum;


import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import static java.lang.Math.abs;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.BlockState;

public class MomentumConverter extends Block {

    public MomentumConverter(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level world, BlockPos blockPos, BlockState blockState, Entity entity) {
        if(entity instanceof LivingEntity && AlchemistInfusion.config.ENABLEMOMENTUMCONVERTER.get()){
            ((LivingEntity) entity).setDeltaMovement(entity.getDeltaMovement().x * AlchemistInfusion.config.MOMENTUMCONVERTERPASSTHROUGH.get(), (abs(entity.getDeltaMovement().x) + abs(entity.getDeltaMovement().z)), entity.getDeltaMovement().z * AlchemistInfusion.config.MOMENTUMCONVERTERPASSTHROUGH.get());
        }
    }
}
