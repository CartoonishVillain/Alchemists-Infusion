package com.jedijoe.alchemistinfusion.Blocks.Potioned.SingleEffect.Tier_Two;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.Potioned.SingleEffect.TierTwoBlocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class JumpStone extends TierTwoBlocks {
    protected static Effect EFFECTTYPE = Effects.JUMP_BOOST;
    protected static int DURATION = 2;
    protected static int AMPLIFIER = 3;

    public JumpStone() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
        if(AlchemistInfusion.config.ENABLET2STONES.get()){
        SetEffect(TextFormatting.BLUE + "Jump Boost");
        SetAmplifier(TextFormatting.BLUE + "III");
        SetDuration(TextFormatting.BLUE + "(0:02)");
    }else {SetEffect(TextFormatting.GRAY + "No Effect- Disabled in configuration");}}

    @Override
    protected void ApplyEffect(Effect effectIn, int durationIn, int amplifierIn, Entity entityIn) {
        super.ApplyEffect(effectIn, durationIn, amplifierIn, entityIn);
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockpos, Entity entity) {
        if(AlchemistInfusion.config.ENABLET2STONES.get()){
        ApplyEffect(EFFECTTYPE, DURATION, AMPLIFIER, entity);
    }}
}
