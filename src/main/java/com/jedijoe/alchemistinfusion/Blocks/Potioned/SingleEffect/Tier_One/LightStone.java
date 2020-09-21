package com.jedijoe.alchemistinfusion.Blocks.Potioned.SingleEffect.Tier_One;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.Potioned.SingleEffect.TierOneBlocks;
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

public class LightStone extends TierOneBlocks {

    protected static Effect EFFECTTYPE = Effects.GLOWING;
    protected static int DURATION = 3;
    protected static int AMPLIFIER = 1;

    public LightStone() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).setLightLevel(value -> 9).harvestLevel(0).setRequiresTool());
        if(AlchemistInfusion.config.ENABLET1STONES.get()){ SetEffect(TextFormatting.WHITE + "Glowing");
        SetAmplifier(TextFormatting.WHITE + "I");
        SetDuration(TextFormatting.WHITE + "(0:03)");
    }else {SetEffect(TextFormatting.GRAY + "No Effect- Disabled in configuration");}}

    @Override
    public void onEntityWalk(World world, BlockPos blockpos, Entity entity) {
        if(AlchemistInfusion.config.ENABLET1STONES.get()){
        ApplyEffect(EFFECTTYPE, DURATION, AMPLIFIER, entity);
    }}
}
