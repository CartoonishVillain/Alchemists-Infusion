package com.jedijoe.alchemistinfusion.Blocks.SingleEffect;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.SingleInfusedBlockBase;
import com.jedijoe.alchemistinfusion.Configuration;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;

public class DolphinStone extends SingleInfusedBlockBase {

    public DolphinStone() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
        if(AlchemistInfusion.config.ENABLET4STONES.get()){
        SetEffect(TextFormatting.BLUE + "Dolphins Grace");
        SetAmplifier(TextFormatting.BLUE + "I");
        SetDuration(TextFormatting.BLUE + "(0:10)");
    }else {SetEffect(TextFormatting.GRAY + "No Effect- Disabled in configuration");}}

    @Override
    public void onEntityWalk(World world, BlockPos blockpos, Entity entity) {
        if(AlchemistInfusion.config.ENABLET4STONES.get()){
        ApplyEffect(Effects.DOLPHINS_GRACE, 10, 1, entity);
    }}
}
