package com.cartoonishvillain.alchemistinfusion.Blocks.Momentum;


import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.BlockState;

public class FallBreaker extends Block {

    public FallBreaker(Properties properties) {
        super(properties);
    }


    @Override
    public void fallOn(Level world, BlockState p_152427_, BlockPos blockPos, Entity entity, float distanceFallen) {
        if (entity instanceof LivingEntity && AlchemistInfusion.config.ENABLEFALLBREAKER.get()){
            entity.causeFallDamage(distanceFallen, 0.075f, DamageSource.FALL);
            ((LivingEntity) entity).setDeltaMovement(entity.getDeltaMovement().x, (-entity.getDeltaMovement().y  * 2D), entity.getDeltaMovement().z);
        }else entity.causeFallDamage(distanceFallen, 1, DamageSource.FALL);
    }
}
