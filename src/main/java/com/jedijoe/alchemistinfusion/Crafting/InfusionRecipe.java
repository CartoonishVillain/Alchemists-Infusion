package com.jedijoe.alchemistinfusion.Crafting;

import com.jedijoe.alchemistinfusion.Items.KeyItem;
import com.jedijoe.alchemistinfusion.Registries.ItemRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InfusionRecipe {

    public static ArrayList<ArrayList<ItemStack>> ParseTier1Recipe(Item item){
        String parser = item.getItem().getRegistryName().toString();
        ArrayList<ArrayList<ItemStack>> stacks = new ArrayList<>();
        switch(parser){
            case "alchemistinfusion:alchemical_bowl":
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BALL, 4), new ItemStack(Items.STRING, 4), new ItemStack(ItemRegistry.SLOWSTEPDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BALL, 2), new ItemStack(Items.STRING, 2), new ItemStack(Items.IRON_PICKAXE), new ItemStack(Items.PISTON), new ItemStack(Items.REDSTONE_TORCH, 2), new ItemStack(ItemRegistry.SLOWDIGDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SUGAR, 3), new ItemStack(Items.REDSTONE, 3), new ItemStack(Items.SUGAR_CANE, 2), new ItemStack(ItemRegistry.QUICKSTEPDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.TORCH, 4), new ItemStack(Items.LANTERN, 2), new ItemStack(Items.JACK_O_LANTERN, 2), new ItemStack(ItemRegistry.LIGHTDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.RABBIT_FOOT), new ItemStack(Items.RABBIT_HIDE, 3), new ItemStack(Items.SUGAR, 3), new ItemStack(Items.PISTON), new ItemStack(ItemRegistry.HOPDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE, 4), new ItemStack(Items.REDSTONE_TORCH, 2), new ItemStack(Items.PISTON), new ItemStack(Items.IRON_PICKAXE), new ItemStack(ItemRegistry.DIGDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(Items.CLAY_BALL, 4), new ItemStack(Items.SAND, 4), new ItemStack(ItemRegistry.ALCHEMICAL_FRAGMENT_CAST.get()))));
                break;
            default:
                break;
        }
        return stacks;}

    public static ArrayList<ArrayList<ItemStack>> ParseTier2Recipe(Item item){
        String parser = item.getItem().getRegistryName().toString();
        ArrayList<ArrayList<ItemStack>> stacks = new ArrayList<>();
        switch(parser){
            case "alchemistinfusion:alchemical_bowl":
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BALL, 4), new ItemStack(Items.STRING, 4), new ItemStack(ItemRegistry.SLOWSTEPDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BALL, 2), new ItemStack(Items.STRING, 2), new ItemStack(Items.IRON_PICKAXE), new ItemStack(Items.PISTON), new ItemStack(Items.REDSTONE_TORCH, 2), new ItemStack(ItemRegistry.SLOWDIGDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SUGAR, 3), new ItemStack(Items.REDSTONE, 3), new ItemStack(Items.SUGAR_CANE, 2), new ItemStack(ItemRegistry.QUICKSTEPDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.TORCH, 4), new ItemStack(Items.LANTERN, 2), new ItemStack(Items.JACK_O_LANTERN, 2), new ItemStack(ItemRegistry.LIGHTDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.RABBIT_FOOT), new ItemStack(Items.RABBIT_HIDE, 3), new ItemStack(Items.SUGAR, 3), new ItemStack(Items.PISTON), new ItemStack(ItemRegistry.HOPDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE, 4), new ItemStack(Items.REDSTONE_TORCH, 2), new ItemStack(Items.PISTON), new ItemStack(Items.IRON_PICKAXE), new ItemStack(ItemRegistry.DIGDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(Items.CLAY_BALL, 4), new ItemStack(Items.SAND, 4), new ItemStack(ItemRegistry.ALCHEMICAL_FRAGMENT_CAST.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.BASEFRAGMENT.get(), 3), new ItemStack(Items.CLAY, 4), new ItemStack(Items.SAND, 4), new ItemStack(Items.LAPIS_LAZULI), new ItemStack(Items.NETHER_WART, 3), new ItemStack(Items.NETHER_WART_BLOCK), new ItemStack(ItemRegistry.ALCHEMICAL_GEM_CAST.get()))));
                break;
            case "alchemistinfusion:alchemical_fragment_cast":
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.POISONOUS_POTATO, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(Items.GOLDEN_SWORD), new ItemStack(Items.TARGET, 3), new ItemStack(ItemRegistry.COWARDLYFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.WHEAT, 3), new ItemStack(Items.WATER_BUCKET), new ItemStack(Items.NETHER_WART, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.DAZEDFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.BAGOFSUGAR.get(), 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.QUICKSTEPDUST.get()), new ItemStack(Items.REDSTONE_BLOCK, 3), new ItemStack(ItemRegistry.FASTSTEPFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.ROTTEN_FLESH, 4), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(Items.CHICKEN, 3), new ItemStack(ItemRegistry.HUNGERFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.GLOWSTONE, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.LIGHTDUST.get()), new ItemStack(Items.REDSTONE_LAMP, 3), new ItemStack(ItemRegistry.ILLUMINATIONFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BLOCK, 3), new ItemStack(Items.PISTON, 3), new ItemStack(ItemRegistry.HOPDUST.get()), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.JUMPFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.POISONOUS_POTATO, 3), new ItemStack(Items.CARROT), new ItemStack(Items.INK_SAC, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.REDUCEDVISIBILITYFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.PISTON, 3), new ItemStack(Items.PISTON, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.SLOWDIGDUST.get()), new ItemStack(ItemRegistry.RESTRICTIVEFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.IRON_BLOCK, 3), new ItemStack(Items.SHIELD), new ItemStack(Items.ARMOR_STAND, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.SHIELDFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SOUL_SAND, 3), new ItemStack(Items.SLIME_BLOCK, 3), new ItemStack(ItemRegistry.SLOWSTEPDUST.get()), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.SNAILSTEPFRAGMENT.get()))));
            default:
                break;
        }

        return stacks;
    }


    public static ArrayList<ArrayList<ItemStack>> ParseTier3Recipe(Item item){
        String parser = item.getItem().getRegistryName().toString();
        ArrayList<ArrayList<ItemStack>> stacks = new ArrayList<>();
        switch(parser){
            case "alchemistinfusion:alchemical_bowl":
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BALL, 4), new ItemStack(Items.STRING, 4), new ItemStack(ItemRegistry.SLOWSTEPDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BALL, 2), new ItemStack(Items.STRING, 2), new ItemStack(Items.IRON_PICKAXE), new ItemStack(Items.PISTON), new ItemStack(Items.REDSTONE_TORCH, 2), new ItemStack(ItemRegistry.SLOWDIGDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SUGAR, 3), new ItemStack(Items.REDSTONE, 3), new ItemStack(Items.SUGAR_CANE, 2), new ItemStack(ItemRegistry.QUICKSTEPDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.TORCH, 4), new ItemStack(Items.LANTERN, 2), new ItemStack(Items.JACK_O_LANTERN, 2), new ItemStack(ItemRegistry.LIGHTDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.RABBIT_FOOT), new ItemStack(Items.RABBIT_HIDE, 3), new ItemStack(Items.SUGAR, 3), new ItemStack(Items.PISTON), new ItemStack(ItemRegistry.HOPDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE, 4), new ItemStack(Items.REDSTONE_TORCH, 2), new ItemStack(Items.PISTON), new ItemStack(Items.IRON_PICKAXE), new ItemStack(ItemRegistry.DIGDUST.get(), 2))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(Items.CLAY_BALL, 4), new ItemStack(Items.SAND, 4), new ItemStack(ItemRegistry.ALCHEMICAL_FRAGMENT_CAST.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.BASEFRAGMENT.get(), 3), new ItemStack(Items.CLAY, 4), new ItemStack(Items.SAND, 4), new ItemStack(Items.LAPIS_LAZULI), new ItemStack(Items.NETHER_WART, 3), new ItemStack(Items.NETHER_WART_BLOCK), new ItemStack(ItemRegistry.ALCHEMICAL_GEM_CAST.get()))));
                break;
            case "alchemistinfusion:alchemical_fragment_cast":
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.POISONOUS_POTATO, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(Items.GOLDEN_SWORD), new ItemStack(Items.TARGET, 3), new ItemStack(ItemRegistry.COWARDLYFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.WHEAT, 3), new ItemStack(Items.WATER_BUCKET), new ItemStack(Items.NETHER_WART, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.DAZEDFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.BAGOFSUGAR.get(), 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.QUICKSTEPDUST.get()), new ItemStack(Items.REDSTONE_BLOCK, 3), new ItemStack(ItemRegistry.FASTSTEPFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.ROTTEN_FLESH, 4), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(Items.CHICKEN, 3), new ItemStack(ItemRegistry.HUNGERFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.GLOWSTONE, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.LIGHTDUST.get()), new ItemStack(Items.REDSTONE_LAMP, 3), new ItemStack(ItemRegistry.ILLUMINATIONFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BLOCK, 3), new ItemStack(Items.PISTON, 3), new ItemStack(ItemRegistry.HOPDUST.get()), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.JUMPFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.POISONOUS_POTATO, 3), new ItemStack(Items.CARROT), new ItemStack(Items.INK_SAC, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.REDUCEDVISIBILITYFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.PISTON, 3), new ItemStack(Items.PISTON, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.SLOWDIGDUST.get()), new ItemStack(ItemRegistry.RESTRICTIVEFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.IRON_BLOCK, 3), new ItemStack(Items.SHIELD), new ItemStack(Items.ARMOR_STAND, 3), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.SHIELDFRAGMENT.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SOUL_SAND, 3), new ItemStack(Items.SLIME_BLOCK, 3), new ItemStack(ItemRegistry.SLOWSTEPDUST.get()), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(ItemRegistry.SNAILSTEPFRAGMENT.get()))));
            case "alchemistinfusion:alchemical_gem_cast":
            default:
                break;
        }

        return stacks;
    }


}
