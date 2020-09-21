package com.jedijoe.alchemistinfusion.Blocks.Potioned;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.Potioned.SingleEffect.*;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class PotionBlockItemBase extends BlockItem {
    Block blocktype = null;
    String msg = "";

    public PotionBlockItemBase(Block block) {
        super(block, new Item.Properties().group(AlchemistInfusion.TAB));
        blocktype = block;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(blocktype instanceof TierOneBlocks && AlchemistInfusion.config.ENABLET1STONES.get()){
            String effect = ((SingleInfusedBlockBase) blocktype).GetEffect();
            String amplifier = ((SingleInfusedBlockBase) blocktype).GetAmplifier();
            String duration = ((SingleInfusedBlockBase) blocktype).GetDuration();
            msg = effect + " " + amplifier + " " + duration; }

        else if (blocktype instanceof TierOneBlocks && !AlchemistInfusion.config.ENABLET1STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }
        else if(blocktype instanceof TierTwoBlocks && AlchemistInfusion.config.ENABLET2STONES.get()){
            String effect = ((SingleInfusedBlockBase) blocktype).GetEffect();
            String amplifier = ((SingleInfusedBlockBase) blocktype).GetAmplifier();
            String duration = ((SingleInfusedBlockBase) blocktype).GetDuration();
            msg = effect + " " + amplifier + " " + duration; }

        else if (blocktype instanceof TierTwoBlocks && !AlchemistInfusion.config.ENABLET2STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }

        else if(blocktype instanceof TierThreeBlocks && AlchemistInfusion.config.ENABLET3STONES.get()){
            String effect = ((SingleInfusedBlockBase) blocktype).GetEffect();
            String amplifier = ((SingleInfusedBlockBase) blocktype).GetAmplifier();
            String duration = ((SingleInfusedBlockBase) blocktype).GetDuration();
            msg = effect + " " + amplifier + " " + duration; }

        else if (blocktype instanceof TierThreeBlocks && !AlchemistInfusion.config.ENABLET3STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }

        else if(blocktype instanceof TierFourBlocks && AlchemistInfusion.config.ENABLET4STONES.get()){
            String effect = ((SingleInfusedBlockBase) blocktype).GetEffect();
            String amplifier = ((SingleInfusedBlockBase) blocktype).GetAmplifier();
            String duration = ((SingleInfusedBlockBase) blocktype).GetDuration();
            msg = effect + " " + amplifier + " " + duration; }

        else if (blocktype instanceof TierFourBlocks && !AlchemistInfusion.config.ENABLET4STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }
        else{msg = TextFormatting.GRAY + "No Effect";}
        tooltip.add(new StringTextComponent(msg));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

}
