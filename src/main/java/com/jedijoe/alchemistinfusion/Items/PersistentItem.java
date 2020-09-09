package com.jedijoe.alchemistinfusion.Items;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Registries.ItemRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

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
