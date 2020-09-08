package com.jedijoe.alchemistinfusion.Blocks.SingleEffect;

import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.SingleInfusedBlockBase;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class QuickStepStone extends SingleInfusedBlockBase {
    protected static Effect EFFECTTYPE = Effects.SPEED;
    protected static int DURATION = 20;
    protected static int AMPLIFIER = 10;

    public QuickStepStone() {
        super();
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockpos, Entity entity) {
        ApplyEffect(EFFECTTYPE, DURATION, AMPLIFIER, entity);
    }

}
