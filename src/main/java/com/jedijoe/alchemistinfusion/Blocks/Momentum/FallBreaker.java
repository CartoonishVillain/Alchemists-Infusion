package com.jedijoe.alchemistinfusion.Blocks.Momentum;


import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class FallBreaker extends BlockWithLoreBase {

    public FallBreaker() {
        super(Properties.create(Material.WOOL).speedFactor(0.9f).sound(SoundType.CLOTH).hardnessAndResistance(1.0f));
        if(AlchemistInfusion.config.ENABLEFALLBREAKER.get()){
        setLore(TextFormatting.BLUE + "Allows you to fall from high distances and probably survive..");
        setLore2(TextFormatting.BLUE + "assuming you're not already injured!");}
    }

    @Override
    public void onFallenUpon(World world, BlockPos blockPos, Entity entity, float distanceFallen) {
        if (entity instanceof LivingEntity && AlchemistInfusion.config.ENABLEFALLBREAKER.get()){
            entity.onLivingFall(distanceFallen, 0.075f);
            ((LivingEntity) entity).setMotion(entity.getMotion().x, (-entity.getMotion().y  * 2D), entity.getMotion().z);
        }else entity.onLivingFall(distanceFallen, 1);
    }
}
