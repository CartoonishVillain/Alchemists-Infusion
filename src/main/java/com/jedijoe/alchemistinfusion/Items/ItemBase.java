package com.jedijoe.alchemistinfusion.Items;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.item.Item;

public class ItemBase extends Item{
    public ItemBase() {
        super(new Item.Properties().group(AlchemistInfusion.TAB));
    }
}
