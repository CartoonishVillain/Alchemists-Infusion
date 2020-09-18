package com.jedijoe.alchemistinfusion.Blocks.MultiEffect;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.SingleInfusedBlockBase;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.TierFourBlocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class MobilityStone extends TierFourBlocks {

    public MobilityStone() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
        if(AlchemistInfusion.config.ENABLET4STONES.get()){
        SetEffect(TextFormatting.BLUE + "Speed/Jump Boost");
        SetAmplifier(TextFormatting.BLUE + "III/IV");
        SetDuration(TextFormatting.BLUE + "(0:02)");
    }else {SetEffect(TextFormatting.GRAY + "No Effect- Disabled in configuration");}}

    @Override
    public void onEntityWalk(World world, BlockPos blockpos, Entity entity) {
        if(AlchemistInfusion.config.ENABLET4STONES.get()){
        ApplyEffect(Effects.SPEED, 2, 3, entity);
        ApplyEffect(Effects.JUMP_BOOST, 2, 4, entity);
    }}

}
