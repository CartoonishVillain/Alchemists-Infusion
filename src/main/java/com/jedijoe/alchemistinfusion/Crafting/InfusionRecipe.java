package com.jedijoe.alchemistinfusion.Crafting;

import com.jedijoe.alchemistinfusion.Items.KeyItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InfusionRecipe {

    public static ArrayList<ItemStack> ParseRecipe(KeyItem item){
        String parser = item.getItem().getRegistryName().getPath();
        ArrayList<ItemStack> stacks = new ArrayList<>();
        switch(parser){
            case "fish_gem":
                stacks.add(new ItemStack(item));
                stacks.add(new ItemStack(Items.BUCKET));
                stacks.add(new ItemStack(Items.WATER_BUCKET));
                break;
            case "fire_proof_gem":
                stacks.add(new ItemStack(item));
                stacks.add(new ItemStack(Items.BUCKET));
                stacks.add(new ItemStack(Items.LAVA_BUCKET));
                break;
            default:
                break;
        }

        return stacks;
    }


}
