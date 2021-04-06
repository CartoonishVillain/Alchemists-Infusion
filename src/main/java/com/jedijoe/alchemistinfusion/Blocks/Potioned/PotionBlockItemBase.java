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
    InfusedBlockBase blockBase = null;
    String msg = "";

    public PotionBlockItemBase(Block block) {
        super(block, new Item.Properties().group(AlchemistInfusion.TAB));
        if(block instanceof InfusedBlockBase) blockBase = (InfusedBlockBase) block;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(blockBase != null){
        if(blockBase.getTier() == 1 && AlchemistInfusion.config.ENABLET1STONES.get()){
            String effect = ((InfusedBlockBase) blockBase).GetEffect();
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier();
            String duration = ((InfusedBlockBase) blockBase).GetDuration();
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration; }

        else if (blockBase.getTier() == 1 && !AlchemistInfusion.config.ENABLET1STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }
        else if(blockBase.getTier() == 2 && AlchemistInfusion.config.ENABLET2STONES.get()){
            String effect = ((InfusedBlockBase) blockBase).GetEffect();
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier();
            String duration = ((InfusedBlockBase) blockBase).GetDuration();
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration; }

        else if (blockBase.getTier() == 2 && !AlchemistInfusion.config.ENABLET2STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }

        else if(blockBase.getTier() == 3 && AlchemistInfusion.config.ENABLET3STONES.get()){
            String effect = ((InfusedBlockBase) blockBase).GetEffect();
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier();
            String duration = ((InfusedBlockBase) blockBase).GetDuration();
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration; }

        else if (blockBase.getTier() == 3 && !AlchemistInfusion.config.ENABLET3STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }

        else if(blockBase.getTier() == 4 && AlchemistInfusion.config.ENABLET4STONES.get()){
            String effect = ((InfusedBlockBase) blockBase).GetEffect();
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier();
            String duration = ((InfusedBlockBase) blockBase).GetDuration();
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration; }

        else if (blockBase.getTier() == 4 && !AlchemistInfusion.config.ENABLET4STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }}
        else{msg = TextFormatting.GRAY + "No Effect";}
        tooltip.add(new StringTextComponent(msg));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

}
