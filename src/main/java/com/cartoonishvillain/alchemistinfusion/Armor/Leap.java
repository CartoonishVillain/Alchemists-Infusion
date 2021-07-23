package com.cartoonishvillain.alchemistinfusion.Armor;

import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.ChatFormatting;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

import net.minecraft.world.item.Item.Properties;

public class Leap extends ArmorItem {
    public Leap(ArmorMaterial materialIn, EquipmentSlot slot, Properties builderIn) {
        super(materialIn, slot, builderIn);

    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        if(AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()){
        String msg = ChatFormatting.BLUE + "When worn, gives jump boost II while crouching.";
        tooltip.add(new TextComponent(msg));
        String msg2 = ChatFormatting.RED + "Using this effect incurs a 4x exhaustion penalty";
        tooltip.add(new TextComponent(msg2));
        String msg3 = ChatFormatting.RED + "compared to a normal jump.";
        tooltip.add(new TextComponent(msg3));} else {String msg = (ChatFormatting.GRAY + "No Effect- Disabled in configuration"); tooltip.add(new TextComponent(msg));}
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
