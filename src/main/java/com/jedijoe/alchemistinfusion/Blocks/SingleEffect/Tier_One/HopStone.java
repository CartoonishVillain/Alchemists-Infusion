package com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_One;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.SingleInfusedBlockBase;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.TierOneBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class HopStone extends TierOneBlocks {
    protected static Effect EFFECTTYPE = Effects.JUMP_BOOST;
    protected static int DURATION = 1;
    protected static int AMPLIFIER = 2;

    public HopStone() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
        if(AlchemistInfusion.config.ENABLET1STONES.get()){
            SetEffect(TextFormatting.BLUE + "Jump Boost");
        SetAmplifier(TextFormatting.BLUE + "II");
        SetDuration(TextFormatting.BLUE + "(0:01)");
    }else {SetEffect(TextFormatting.GRAY + "No Effect- Disabled in configuration");}}

    @Override
    protected void ApplyEffect(Effect effectIn, int durationIn, int amplifierIn, Entity entityIn) {
        super.ApplyEffect(effectIn, durationIn, amplifierIn, entityIn);
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockpos, Entity entity) {
        if(AlchemistInfusion.config.ENABLET1STONES.get()){
        ApplyEffect(EFFECTTYPE, DURATION, AMPLIFIER, entity);
    }}
}
