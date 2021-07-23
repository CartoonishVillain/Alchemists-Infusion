package com.cartoonishvillain.alchemistinfusion.Items;

import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class PersistentItem extends Item {
    public PersistentItem() {
            super(new Item.Properties().tab(AlchemistInfusion.TAB).stacksTo(1));
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
