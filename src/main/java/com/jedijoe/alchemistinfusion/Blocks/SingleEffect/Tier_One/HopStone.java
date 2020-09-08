package com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_One;

import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.SingleInfusedBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class HopStone extends SingleInfusedBlockBase {
    protected static Effect EFFECTTYPE = Effects.JUMP_BOOST;
    protected static int DURATION = 1;
    protected static int AMPLIFIER = 2;

    public HopStone() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
    }

    @Override
    protected void ApplyEffect(Effect effectIn, int durationIn, int amplifierIn, Entity entityIn) {
        super.ApplyEffect(effectIn, durationIn, amplifierIn, entityIn);
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockpos, Entity entity) {
        ApplyEffect(EFFECTTYPE, DURATION, AMPLIFIER, entity);
    }
}
