package com.cartoonishvillain.alchemistinfusion.Blocks.Potion;

import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.ChatFormatting;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class PotionBlockItemBase extends BlockItem {
    InfusedBlockBase blockBase = null;
    String msg = "";

    public PotionBlockItemBase(Block block) {
        super(block, new Item.Properties().tab(AlchemistInfusion.TAB));
        if(block instanceof InfusedBlockBase) blockBase = (InfusedBlockBase) block;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        if(blockBase != null){
        if(blockBase.getTier() == 1 && AlchemistInfusion.config.ENABLET1STONES.get()){
            ArrayList<MobEffectInstance> instance = blockBase.getEffectInstance();
            String effect = ((InfusedBlockBase) blockBase).GetEffect(instance.get(0));
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier(instance.get(0));
            String duration = ((InfusedBlockBase) blockBase).GetDuration(instance.get(0));
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration; }

        else if (blockBase.getTier() == 1 && !AlchemistInfusion.config.ENABLET1STONES.get()){
            msg = ChatFormatting.GRAY + "No Effect - Block disabled by server config";
        }
        else if(blockBase.getTier() == 2 && AlchemistInfusion.config.ENABLET2STONES.get()){
            ArrayList<MobEffectInstance> instance = blockBase.getEffectInstance();
            String effect = ((InfusedBlockBase) blockBase).GetEffect(instance.get(0));
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier(instance.get(0));
            String duration = ((InfusedBlockBase) blockBase).GetDuration(instance.get(0));
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration; }

        else if (blockBase.getTier() == 2 && !AlchemistInfusion.config.ENABLET2STONES.get()){
            msg = ChatFormatting.GRAY + "No Effect - Block disabled by server config";
        }

        else if(blockBase.getTier() == 3 && AlchemistInfusion.config.ENABLET3STONES.get()){
            ArrayList<MobEffectInstance> instance = blockBase.getEffectInstance();
            String effect = ((InfusedBlockBase) blockBase).GetEffect(instance.get(0));
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier(instance.get(0));
            String duration = ((InfusedBlockBase) blockBase).GetDuration(instance.get(0));
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration; }

        else if (blockBase.getTier() == 3 && !AlchemistInfusion.config.ENABLET3STONES.get()){
            msg = ChatFormatting.GRAY + "No Effect - Block disabled by server config";
        }

        else if(blockBase.getTier() == 4 && AlchemistInfusion.config.ENABLET4STONES.get()){
            ArrayList<MobEffectInstance> instances = blockBase.getEffectInstance();
            for(MobEffectInstance instance : instances){
            String effect = ((InfusedBlockBase) blockBase).GetEffect(instance);
            String amplifier = ((InfusedBlockBase) blockBase).GetAmplifier(instance);
            String duration = ((InfusedBlockBase) blockBase).GetDuration(instance);
            msg = ((InfusedBlockBase) blockBase).getTextFormatting() + effect + " " + amplifier + " " + duration;
            tooltip.add(new TextComponent(msg));}
        }

        else if (blockBase.getTier() == 4 && !AlchemistInfusion.config.ENABLET4STONES.get()){
            msg = ChatFormatting.GRAY + "No Effect - Block disabled by server config";
        }}
        else{msg = ChatFormatting.GRAY + "No Effect";}
        if(blockBase != null && !(blockBase.getTier() == 4 && AlchemistInfusion.config.ENABLET4STONES.get()))
        tooltip.add(new TextComponent(msg));
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }

}
