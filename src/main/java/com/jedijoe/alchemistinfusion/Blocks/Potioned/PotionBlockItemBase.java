package com.jedijoe.alchemistinfusion.Blocks.Potioned;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.Potioned.SingleEffect.*;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
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
            ArrayList<EffectInstance> instance = blockBase.getEffectInstance();
            String effect = ((InfusedBlockBase) blockBase).GetEffect(instance.get(0));
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier(instance.get(0));
            String duration = ((InfusedBlockBase) blockBase).GetDuration(instance.get(0));
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration; }

        else if (blockBase.getTier() == 1 && !AlchemistInfusion.config.ENABLET1STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }
        else if(blockBase.getTier() == 2 && AlchemistInfusion.config.ENABLET2STONES.get()){
            ArrayList<EffectInstance> instance = blockBase.getEffectInstance();
            String effect = ((InfusedBlockBase) blockBase).GetEffect(instance.get(0));
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier(instance.get(0));
            String duration = ((InfusedBlockBase) blockBase).GetDuration(instance.get(0));
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration; }

        else if (blockBase.getTier() == 2 && !AlchemistInfusion.config.ENABLET2STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }

        else if(blockBase.getTier() == 3 && AlchemistInfusion.config.ENABLET3STONES.get()){
            ArrayList<EffectInstance> instance = blockBase.getEffectInstance();
            String effect = ((InfusedBlockBase) blockBase).GetEffect(instance.get(0));
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier(instance.get(0));
            String duration = ((InfusedBlockBase) blockBase).GetDuration(instance.get(0));
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration; }

        else if (blockBase.getTier() == 3 && !AlchemistInfusion.config.ENABLET3STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }

        else if(blockBase.getTier() == 4 && AlchemistInfusion.config.ENABLET4STONES.get()){
            ArrayList<EffectInstance> instances = blockBase.getEffectInstance();
            for(EffectInstance instance : instances){
            String effect = ((InfusedBlockBase) blockBase).GetEffect(instance);
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier(instance);
            String duration = ((InfusedBlockBase) blockBase).GetDuration(instance);
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration;
            tooltip.add(new StringTextComponent(msg));}
        }

        else if (blockBase.getTier() == 4 && !AlchemistInfusion.config.ENABLET4STONES.get()){
            msg = TextFormatting.GRAY + "No Effect - Block disabled by server config";
        }}
        else{msg = TextFormatting.GRAY + "No Effect";}
        if(blockBase != null && !(blockBase.getTier() == 4 && AlchemistInfusion.config.ENABLET4STONES.get()))
        tooltip.add(new StringTextComponent(msg));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

}
