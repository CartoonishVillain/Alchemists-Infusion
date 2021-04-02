package com.jedijoe.alchemistinfusion.Crafting;

import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class InfusionRecipe {
    ArrayList<ItemStack> itemStacks;

    InfusionRecipe(ArrayList<ItemStack> itemStacks){
        this.itemStacks = itemStacks;
    }

    public ArrayList<ItemStack> getItemStacks() {return itemStacks;}

    public void setItemStacks(ArrayList<ItemStack> itemStacks) {this.itemStacks = itemStacks;}

    public void useItems(ArrayList<ItemStack> opposingStack){

    }
}
