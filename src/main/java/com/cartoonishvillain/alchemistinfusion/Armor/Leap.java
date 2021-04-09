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

public class Leap extends ArmorItem {
    public Leap(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);

    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()){
        String msg = TextFormatting.BLUE + "When worn, gives jump boost II while crouching.";
        tooltip.add(new StringTextComponent(msg));
        String msg2 = TextFormatting.RED + "Using this effect incurs a 4x exhaustion penalty";
        tooltip.add(new StringTextComponent(msg2));
        String msg3 = TextFormatting.RED + "compared to a normal jump.";
        tooltip.add(new StringTextComponent(msg3));} else {String msg = (TextFormatting.GRAY + "No Effect- Disabled in configuration"); tooltip.add(new StringTextComponent(msg));}
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
