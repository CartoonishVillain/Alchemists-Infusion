package com.jedijoe.alchemistinfusion.Blocks.Momentum;


import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.BlockWithLoreBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import static java.lang.Math.abs;

public class MomentumConverter extends BlockWithLoreBase {

    public MomentumConverter() {
        super(Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(3.2F).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool());
        if(AlchemistInfusion.config.ENABLEMOMENTUMCONVERTER.get()){
            setLore(TextFormatting.BLUE + "Converts horizontal momentum to vertical momentum.");
        setLore2(TextFormatting.BLUE + "You may want a method to prevent fall damage");}
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockPos, Entity entity) {
        if(entity instanceof LivingEntity && AlchemistInfusion.config.ENABLEMOMENTUMCONVERTER.get()){
            ((LivingEntity) entity).setMotion(entity.getMotion().x * AlchemistInfusion.config.MOMENTUMCONVERTERPASSTHROUGH.get(), (abs(entity.getMotion().x) + abs(entity.getMotion().z)), entity.getMotion().z * AlchemistInfusion.config.MOMENTUMCONVERTERPASSTHROUGH.get());
        }
    }
}
