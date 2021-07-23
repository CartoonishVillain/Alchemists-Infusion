package com.cartoonishvillain.alchemistinfusion.Items;

import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class LoreItem extends Item {
    private String lore;
    public LoreItem(String Lore) {
        super(new Item.Properties().tab(AlchemistInfusion.TAB));
        lore = Lore;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        if(lore != "") tooltip.add(new TextComponent(lore));
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
