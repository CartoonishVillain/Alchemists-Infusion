package com.jedijoe.alchemistinfusion.Blocks.Momentum;


import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import static java.lang.Math.abs;

public class MomentumConverter extends Block {

    public MomentumConverter(Properties properties) {
        super(properties);
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockPos, Entity entity) {
        if(entity instanceof LivingEntity && AlchemistInfusion.config.ENABLEMOMENTUMCONVERTER.get()){
            ((LivingEntity) entity).setMotion(entity.getMotion().x * AlchemistInfusion.config.MOMENTUMCONVERTERPASSTHROUGH.get(), (abs(entity.getMotion().x) + abs(entity.getMotion().z)), entity.getMotion().z * AlchemistInfusion.config.MOMENTUMCONVERTERPASSTHROUGH.get());
        }
    }
}
