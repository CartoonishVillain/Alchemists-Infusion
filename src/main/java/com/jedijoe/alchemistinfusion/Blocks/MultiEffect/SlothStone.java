package com.jedijoe.alchemistinfusion.Blocks.MultiEffect;

import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.SingleInfusedBlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class SlothStone extends SingleInfusedBlockBase {

    public SlothStone() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
        SetEffect(TextFormatting.RED + "Mining Fatigue/Slowness");
        SetAmplifier(TextFormatting.RED + "III");
        SetDuration(TextFormatting.RED + "(0:15)");
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockpos, Entity entity) {
        ApplyEffect(Effects.SLOWNESS, 15, 3, entity);
        ApplyEffect(Effects.MINING_FATIGUE, 15, 3, entity);
    }

}
