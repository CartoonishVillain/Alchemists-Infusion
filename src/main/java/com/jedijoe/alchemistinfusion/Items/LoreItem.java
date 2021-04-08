package com.jedijoe.alchemistinfusion.Items;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class LoreItem extends Item {
    private String lore;
    public LoreItem(String Lore) {
        super(new Item.Properties().group(AlchemistInfusion.TAB));
        lore = Lore;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(lore != "") tooltip.add(new StringTextComponent(lore));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
