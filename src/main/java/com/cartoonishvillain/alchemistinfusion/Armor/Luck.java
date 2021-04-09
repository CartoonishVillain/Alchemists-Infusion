package com.cartoonishvillain.alchemistinfusion.Armor;

import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Luck extends ArmorItem {
    public Luck(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);

    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()){
        String msg = TextFormatting.BLUE + "Luck for the duration of wearing";
        tooltip.add(new StringTextComponent(msg));} else {String msg = (TextFormatting.GRAY + "No Effect- Disabled in configuration"); tooltip.add(new StringTextComponent(msg));}
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
