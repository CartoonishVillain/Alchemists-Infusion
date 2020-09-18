package com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_Three;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.SingleInfusedBlockBase;
import com.jedijoe.alchemistinfusion.Configuration;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class BlindnessStone extends SingleInfusedBlockBase {
    protected static Effect EFFECTTYPE = Effects.BLINDNESS;
    protected static int DURATION = 12;
    protected static int AMPLIFIER = 2;

    public BlindnessStone() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
        if(AlchemistInfusion.config.ENABLET3STONES.get()){
        SetEffect(TextFormatting.RED + "Blindness");
        SetAmplifier(TextFormatting.RED + "II");
        SetDuration(TextFormatting.RED + "(0:12)");
    }else {SetEffect(TextFormatting.GRAY + "No Effect- Disabled in configuration");}}

    @Override
    protected void ApplyEffect(Effect effectIn, int durationIn, int amplifierIn, Entity entityIn) {
        super.ApplyEffect(effectIn, durationIn, amplifierIn, entityIn);
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockpos, Entity entity) {
        if(AlchemistInfusion.config.ENABLET3STONES.get()){
        ApplyEffect(EFFECTTYPE, DURATION, AMPLIFIER, entity);
    }}
}
