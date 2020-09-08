package com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_One;

import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.SingleInfusedBlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class QuickStepStone extends SingleInfusedBlockBase {
    protected static Effect EFFECTTYPE = Effects.SPEED;
    protected static int DURATION = 1;
    protected static int AMPLIFIER = 1;

    public QuickStepStone() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockpos, Entity entity) {
        ApplyEffect(EFFECTTYPE, DURATION, AMPLIFIER, entity);
    }

}
