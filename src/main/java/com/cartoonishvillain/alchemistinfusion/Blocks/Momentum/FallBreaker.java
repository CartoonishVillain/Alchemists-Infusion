package com.cartoonishvillain.alchemistinfusion.Blocks.Momentum;


import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FallBreaker extends Block {

    public FallBreaker(Properties properties) {
        super(properties);
    }


    @Override
    public void onFallenUpon(World world, BlockPos blockPos, Entity entity, float distanceFallen) {
        if (entity instanceof LivingEntity && AlchemistInfusion.config.ENABLEFALLBREAKER.get()){
            entity.onLivingFall(distanceFallen, 0.075f);
            ((LivingEntity) entity).setMotion(entity.getMotion().x, (-entity.getMotion().y  * 2D), entity.getMotion().z);
        }else entity.onLivingFall(distanceFallen, 1);
    }
}
