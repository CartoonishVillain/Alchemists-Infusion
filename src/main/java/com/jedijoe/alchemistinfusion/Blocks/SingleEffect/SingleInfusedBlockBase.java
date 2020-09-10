package com.jedijoe.alchemistinfusion.Blocks.SingleEffect;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.common.ToolType;

public class SingleInfusedBlockBase extends Block {
    public SingleInfusedBlockBase(Properties properties) {
        super(properties);
    }



    protected void ApplyEffect(Effect effectIn, int durationIn, int amplifierIn, Entity entityIn){
        if (entityIn instanceof LivingEntity){
            ((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effectIn, durationIn*20, amplifierIn-1));
        }
    }

}
