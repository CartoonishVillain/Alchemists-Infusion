package com.jedijoe.alchemistinfusion.Blocks.SingleEffect;

import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.SingleInfusedBlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class DolphinStone extends SingleInfusedBlockBase {

    public DolphinStone() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockpos, Entity entity) {
        ApplyEffect(Effects.DOLPHINS_GRACE, 10, 1, entity);
    }

}
