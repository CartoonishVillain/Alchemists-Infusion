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

public class Ice extends ArmorItem {
    public Ice(ArmorMaterial materialIn, EquipmentSlot slot, Properties builderIn) {
        super(materialIn, slot, builderIn);

    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        if(AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()){
        String msg = ChatFormatting.BLUE + "Increased forward movement speed while wearing";
        tooltip.add(new TextComponent(msg));
        String msg2 = ChatFormatting.RED + "You will be constantly be pushed forward while wearing";
        tooltip.add(new TextComponent(msg2));} else {String msg = (ChatFormatting.GRAY + "No Effect- Disabled in configuration"); tooltip.add(new TextComponent(msg));}
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
