package com.jedijoe.alchemistinfusion.Armor;

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

public class Ice extends ArmorItem {
    public Ice(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);

    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        String msg = TextFormatting.BLUE + "Increased forward movement speed while wearing";
        tooltip.add(new StringTextComponent(msg));
        String msg2 = TextFormatting.RED + "You will be constantly be pushed forward while wearing";
        tooltip.add(new StringTextComponent(msg2));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
