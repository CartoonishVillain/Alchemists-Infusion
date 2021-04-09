package com.cartoonishvillain.alchemistinfusion.Items;

import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class PersistentItem extends Item {
    public PersistentItem() {
            super(new Item.Properties().group(AlchemistInfusion.TAB).maxStackSize(1));
        }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return itemStack.copy();

    }

    @Override
    public boolean hasContainerItem(@Nonnull ItemStack stack)
    {
        return true;
    }
}
