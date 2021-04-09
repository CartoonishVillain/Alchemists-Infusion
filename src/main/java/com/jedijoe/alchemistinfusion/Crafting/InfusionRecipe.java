package com.jedijoe.alchemistinfusion.Crafting;

import com.jedijoe.alchemistinfusion.Items.KeyItem;
import com.jedijoe.alchemistinfusion.Registries.BlockItemRegistry;
import com.jedijoe.alchemistinfusion.Registries.ItemRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.lwjgl.system.CallbackI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InfusionRecipe {

    public static ArrayList<ArrayList<ItemStack>> ParseTierFRecipe(Item item){
        String parser = item.getItem().getRegistryName().toString();
        ArrayList<ArrayList<ItemStack>> stacks = new ArrayList<>();
        if ("alchemistinfusion:alchemical_culinary_key".equals(parser)) {
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.RABBIT_FOOT, 4), new ItemStack(Items.COOKED_RABBIT), new ItemStack(ItemRegistry.HOPPINGRABBIT.get()))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.IRON_INGOT, 6), new ItemStack(Items.COOKED_BEEF), new ItemStack(ItemRegistry.IRONSTEAK.get()))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.FIRE_CHARGE, 6), new ItemStack(Items.BEETROOT), new ItemStack(ItemRegistry.SPICYBEETROOT.get()))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.COAL, 4), new ItemStack(Items.IRON_INGOT, 2), new ItemStack(Items.BAKED_POTATO), new ItemStack(ItemRegistry.PRODUCTIVEPOTATO.get()))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.TORCH, 4), new ItemStack(Items.GLOWSTONE_DUST, 2), new ItemStack(Items.GOLDEN_CARROT), new ItemStack(ItemRegistry.VISIONCARROT.get()))));
        }
        return stacks;
    }

    public static ArrayList<ArrayList<ItemStack>> ParseTier1Recipe(Item item){
        String parser = item.getItem().getRegistryName().toString();
        ArrayList<ArrayList<ItemStack>> stacks = new ArrayList<>();
        if ("alchemistinfusion:alchemical_bowl".equals(parser)) {
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BALL, 4), new ItemStack(Items.STRING, 4), new ItemStack(ItemRegistry.SLOWSTEPDUST.get(), 2))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BALL, 2), new ItemStack(Items.STRING, 2), new ItemStack(Items.IRON_PICKAXE), new ItemStack(Items.PISTON), new ItemStack(Items.REDSTONE_TORCH, 2), new ItemStack(ItemRegistry.SLOWDIGDUST.get(), 2))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SUGAR, 3), new ItemStack(Items.REDSTONE, 3), new ItemStack(Items.SUGAR_CANE, 2), new ItemStack(ItemRegistry.QUICKSTEPDUST.get(), 2))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.TORCH, 4), new ItemStack(Items.LANTERN, 2), new ItemStack(Items.JACK_O_LANTERN, 2), new ItemStack(ItemRegistry.LIGHTDUST.get(), 2))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.RABBIT_FOOT), new ItemStack(Items.RABBIT_HIDE, 3), new ItemStack(Items.SUGAR, 3), new ItemStack(Items.PISTON), new ItemStack(ItemRegistry.HOPDUST.get(), 2))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE, 4), new ItemStack(Items.REDSTONE_TORCH, 2), new ItemStack(Items.PISTON), new ItemStack(Items.IRON_PICKAXE), new ItemStack(ItemRegistry.DIGDUST.get(), 2))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.BASEFRAGMENT.get()), new ItemStack(Items.CLAY_BALL, 4), new ItemStack(Items.SAND, 4), new ItemStack(ItemRegistry.ALCHEMICAL_FRAGMENT_CAST.get()))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(BlockItemRegistry.PAVEMENTSTONE_ITEM.get()), new ItemStack(Items.FLINT_AND_STEEL), new ItemStack(Items.GOLD_INGOT, 4), new ItemStack(Items.LAPIS_LAZULI, 4), new ItemStack(Items.DIAMOND), new ItemStack(BlockItemRegistry.ACTIVATEDPAVEMENT_ITEM.get()))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.GOLD_INGOT, 2), new ItemStack(Items.LAPIS_LAZULI, 2), new ItemStack(Items.ENDER_PEARL), new ItemStack(Items.BLAZE_ROD), new ItemStack(ItemRegistry.INFUSIONROD.get()))));
            stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.NETHER_WART, 2), new ItemStack(Items.COAL), new ItemStack(ItemRegistry.PAVEMENTCARVER.get()), new ItemStack(Items.IRON_BOOTS), new ItemStack(Items.NETHER_WART_BLOCK, 2), new ItemStack(Items.IRON_BLOCK), new ItemStack(ItemRegistry.UNLUCK_BOOTS.get()))));
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
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(BlockItemRegistry.PAVEMENTSTONE_ITEM.get()), new ItemStack(Items.FLINT_AND_STEEL), new ItemStack(Items.GOLD_INGOT, 4), new ItemStack(Items.LAPIS_LAZULI, 4), new ItemStack(Items.DIAMOND), new ItemStack(BlockItemRegistry.ACTIVATEDPAVEMENT_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.GOLD_INGOT, 2), new ItemStack(Items.LAPIS_LAZULI, 2), new ItemStack(Items.ENDER_PEARL), new ItemStack(Items.BLAZE_ROD), new ItemStack(ItemRegistry.INFUSIONROD.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.DIAMOND, 4), new ItemStack(Items.NETHER_WART, 12), new ItemStack(Items.LAPIS_LAZULI, 8), new ItemStack(Items.ENDER_PEARL, 6), new ItemStack(ItemRegistry.ATTUNEDINFUSIONROD.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(BlockItemRegistry.HUNGERSTONE_ITEM.get()), new ItemStack(Items.GOLDEN_APPLE.getItem(), 2), new ItemStack(Items.GOLDEN_CARROT, 6), new ItemStack(BlockItemRegistry.CULINARY_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.LAPIS_LAZULI), new ItemStack(Items.GOLDEN_CARROT), new ItemStack(ItemRegistry.CULINARYKEY.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.DIAMOND), new ItemStack(Items.BLUE_ICE, 4), new ItemStack(BlockItemRegistry.PARTICLEICE_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.NETHER_WART, 2), new ItemStack(Items.COAL), new ItemStack(ItemRegistry.PAVEMENTCARVER.get()), new ItemStack(Items.IRON_BOOTS), new ItemStack(Items.NETHER_WART_BLOCK, 2), new ItemStack(Items.IRON_BLOCK), new ItemStack(ItemRegistry.UNLUCK_BOOTS.get()))));
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
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(BlockItemRegistry.ACTIVATEDPAVEMENT_ITEM.get()), new ItemStack(Items.EMERALD, 4), new ItemStack(Items.ENDER_EYE, 2), new ItemStack(Items.BLAZE_ROD, 2), new ItemStack(Items.ENCHANTING_TABLE, 2), new ItemStack(BlockItemRegistry.ATTUNEDPAVEMENT_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.UNLUCK_BOOTS.get()), new ItemStack(Items.NETHER_WART_BLOCK, 2), new ItemStack(Items.NETHER_WART, 2), new ItemStack(Items.LAPIS_BLOCK), new ItemStack(Items.GOLD_BLOCK), new ItemStack(Items.EMERALD_BLOCK), new ItemStack(ItemRegistry.LUCK_BOOTS.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.NETHER_WART, 2), new ItemStack(Items.PACKED_ICE, 2), new ItemStack(Items.IRON_BOOTS), new ItemStack(Items.LAPIS_LAZULI, 6), new ItemStack(Items.DIAMOND), new ItemStack(ItemRegistry.ICE_BOOTS.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.NETHER_WART, 2), new ItemStack(ItemRegistry.JUMPFRAGMENT.get()), new ItemStack(ItemRegistry.PAVEMENTCARVER.get()), new ItemStack(Items.NETHER_WART_BLOCK, 2), new ItemStack(Items.EMERALD), new ItemStack(ItemRegistry.LEAP_BOOTS.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE_BLOCK, 2), new ItemStack(BlockItemRegistry.PRIMEDPAVEMENT_ITEM.get(), 4), new ItemStack(Items.CRAFTING_TABLE), new ItemStack(Items.OBSERVER), new ItemStack(BlockItemRegistry.CRAFTINGBLOCKER_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE_BLOCK, 2), new ItemStack(BlockItemRegistry.PRIMEDPAVEMENT_ITEM.get(), 4), new ItemStack(Items.CHEST), new ItemStack(Items.OBSERVER), new ItemStack(BlockItemRegistry.CONTAINERBLOCKER_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE_BLOCK, 2), new ItemStack(BlockItemRegistry.PRIMEDPAVEMENT_ITEM.get(), 4), new ItemStack(Items.EMERALD), new ItemStack(Items.OBSERVER), new ItemStack(BlockItemRegistry.TRADEBLOCKER_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE_BLOCK, 2), new ItemStack(BlockItemRegistry.PRIMEDPAVEMENT_ITEM.get(), 4), new ItemStack(Items.CAMPFIRE), new ItemStack(Items.OBSERVER), new ItemStack(BlockItemRegistry.INVENTORYBLOCKER_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE_BLOCK, 2), new ItemStack(BlockItemRegistry.TRADEBLOCKER_ITEM.get()), new ItemStack(BlockItemRegistry.CONTAINERBLOCKER_ITEM.get()), new ItemStack(BlockItemRegistry.CRAFTINGBLOCKER_ITEM.get()), new ItemStack(BlockItemRegistry.INVENTORYBLOCKER_ITEM.get()), new ItemStack(Items.OBSERVER), new ItemStack(BlockItemRegistry.FULLBLOCKER_ITEM.get(), 4))));
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
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(BlockItemRegistry.PAVEMENTSTONE_ITEM.get()), new ItemStack(Items.FLINT_AND_STEEL), new ItemStack(Items.GOLD_INGOT, 4), new ItemStack(Items.LAPIS_LAZULI, 4), new ItemStack(Items.DIAMOND), new ItemStack(BlockItemRegistry.ACTIVATEDPAVEMENT_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.GOLD_INGOT, 2), new ItemStack(Items.LAPIS_LAZULI, 2), new ItemStack(Items.ENDER_PEARL), new ItemStack(Items.BLAZE_ROD), new ItemStack(ItemRegistry.INFUSIONROD.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.DIAMOND, 4), new ItemStack(Items.NETHER_WART, 12), new ItemStack(Items.LAPIS_LAZULI, 8), new ItemStack(Items.ENDER_PEARL, 6), new ItemStack(ItemRegistry.ATTUNEDINFUSIONROD.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(BlockItemRegistry.HUNGERSTONE_ITEM.get()), new ItemStack(Items.GOLDEN_APPLE.getItem(), 2), new ItemStack(Items.GOLDEN_CARROT, 6), new ItemStack(BlockItemRegistry.CULINARY_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.LAPIS_LAZULI), new ItemStack(Items.GOLDEN_CARROT), new ItemStack(ItemRegistry.CULINARYKEY.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.DIAMOND), new ItemStack(Items.BLUE_ICE, 4), new ItemStack(BlockItemRegistry.PARTICLEICE_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.NETHER_WART, 2), new ItemStack(Items.COAL), new ItemStack(ItemRegistry.PAVEMENTCARVER.get()), new ItemStack(Items.IRON_BOOTS), new ItemStack(Items.NETHER_WART_BLOCK, 2), new ItemStack(Items.IRON_BLOCK), new ItemStack(ItemRegistry.UNLUCK_BOOTS.get()))));

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
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(BlockItemRegistry.ACTIVATEDPAVEMENT_ITEM.get()), new ItemStack(Items.EMERALD, 4), new ItemStack(Items.ENDER_EYE, 2), new ItemStack(Items.BLAZE_ROD, 2), new ItemStack(Items.ENCHANTING_TABLE, 2), new ItemStack(BlockItemRegistry.ATTUNEDPAVEMENT_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.PISTON, 3), new ItemStack(BlockItemRegistry.FALLBREAKER_ITEM.get()), new ItemStack(Items.COMPARATOR, 1), new ItemStack(Items.OBSIDIAN, 2), new ItemStack(Items.DIAMOND), new ItemStack(BlockItemRegistry.MOMENTUMCONVERTER_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.UNLUCK_BOOTS.get()), new ItemStack(Items.NETHER_WART_BLOCK, 2), new ItemStack(Items.NETHER_WART, 2), new ItemStack(Items.LAPIS_BLOCK), new ItemStack(Items.GOLD_BLOCK), new ItemStack(Items.EMERALD_BLOCK), new ItemStack(ItemRegistry.LUCK_BOOTS.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.NETHER_WART, 2), new ItemStack(ItemRegistry.JUMPFRAGMENT.get()), new ItemStack(ItemRegistry.PAVEMENTCARVER.get()), new ItemStack(Items.NETHER_WART_BLOCK, 2), new ItemStack(Items.EMERALD), new ItemStack(ItemRegistry.LEAP_BOOTS.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.NETHER_WART, 2), new ItemStack(Items.PACKED_ICE, 2), new ItemStack(Items.IRON_BOOTS), new ItemStack(Items.LAPIS_LAZULI, 6), new ItemStack(Items.DIAMOND), new ItemStack(ItemRegistry.ICE_BOOTS.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE_BLOCK, 2), new ItemStack(BlockItemRegistry.PRIMEDPAVEMENT_ITEM.get(), 4), new ItemStack(Items.CRAFTING_TABLE), new ItemStack(Items.OBSERVER), new ItemStack(BlockItemRegistry.CRAFTINGBLOCKER_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE_BLOCK, 2), new ItemStack(BlockItemRegistry.PRIMEDPAVEMENT_ITEM.get(), 4), new ItemStack(Items.CHEST), new ItemStack(Items.OBSERVER), new ItemStack(BlockItemRegistry.CONTAINERBLOCKER_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE_BLOCK, 2), new ItemStack(BlockItemRegistry.PRIMEDPAVEMENT_ITEM.get(), 4), new ItemStack(Items.EMERALD), new ItemStack(Items.OBSERVER), new ItemStack(BlockItemRegistry.TRADEBLOCKER_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE_BLOCK, 2), new ItemStack(BlockItemRegistry.PRIMEDPAVEMENT_ITEM.get(), 4), new ItemStack(Items.CAMPFIRE), new ItemStack(Items.OBSERVER), new ItemStack(BlockItemRegistry.INVENTORYBLOCKER_ITEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.REDSTONE_BLOCK, 2), new ItemStack(BlockItemRegistry.TRADEBLOCKER_ITEM.get()), new ItemStack(BlockItemRegistry.CONTAINERBLOCKER_ITEM.get()), new ItemStack(BlockItemRegistry.CRAFTINGBLOCKER_ITEM.get()), new ItemStack(BlockItemRegistry.INVENTORYBLOCKER_ITEM.get()), new ItemStack(Items.OBSERVER), new ItemStack(BlockItemRegistry.FULLBLOCKER_ITEM.get(), 4))));
            case "alchemistinfusion:alchemical_gem_cast":
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.INK_SAC, 6), new ItemStack(ItemRegistry.BASE_GEM.get()), new ItemStack(ItemRegistry.REDUCEDVISIBILITYFRAGMENT.get()), new ItemStack(ItemRegistry.BLINDNESSSSTONE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.BASE_GEM.get()), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.MAGMA_BLOCK,3), new ItemStack(Items.BLAZE_ROD, 3), new ItemStack(ItemRegistry.BRAVESTONE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.PILEOFFEATHERS.get(), 6), new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(ItemRegistry.BASE_GEM.get()), new ItemStack(ItemRegistry.CHICKENSTONE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.FERMENTED_SPIDER_EYE, 4), new ItemStack(Items.GOLDEN_CARROT, 3), new ItemStack(ItemRegistry.BASE_GEM.get()), new ItemStack(ItemRegistry.CLOAKSTONE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.MAGMA_BLOCK, 2), new ItemStack(Items.MAGMA_CREAM, 4), new ItemStack(ItemRegistry.RESISTANCESTONE_GEM.get()), new ItemStack(ItemRegistry.FIREPROOFSTONE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.WATER_BUCKET, 2), new ItemStack(Items.PUFFERFISH, 4), new ItemStack(ItemRegistry.RESISTANCESTONE_GEM.get()), new ItemStack(ItemRegistry.FISHSTONE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.END_ROD, 2), new ItemStack(Items.SEA_LANTERN, 4), new ItemStack(ItemRegistry.ILLUMINATIONFRAGMENT.get()), new ItemStack(ItemRegistry.BASE_GEM.get()), new ItemStack(ItemRegistry.GLOWINGSTONE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.PISTON), new ItemStack(Items.REDSTONE_BLOCK, 4), new ItemStack(Items.DIAMOND_PICKAXE), new ItemStack(ItemRegistry.DIGDUST.get()), new ItemStack(ItemRegistry.BASE_GEM.get()), new ItemStack(ItemRegistry.HASTESTONE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BLOCK, 6), new ItemStack(ItemRegistry.JUMPFRAGMENT.get()), new ItemStack(ItemRegistry.BASE_GEM.get()), new ItemStack(ItemRegistry.LEAPSTONE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.FERMENTED_SPIDER_EYE), new ItemStack(Items.PUFFERFISH, 4), new ItemStack(Items.GOLDEN_APPLE), new ItemStack(ItemRegistry.DAZEDFRAGMENT.get()), new ItemStack(ItemRegistry.BASE_GEM.get()), new ItemStack(ItemRegistry.POISONSTONE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.OBSIDIAN, 3), new ItemStack(Items.ARMOR_STAND, 3), new ItemStack(ItemRegistry.SHIELDFRAGMENT.get()), new ItemStack(ItemRegistry.BASE_GEM.get()), new ItemStack(ItemRegistry.RESISTANCESTONE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(ItemRegistry.BAGOFSUGAR.get(), 6), new ItemStack(ItemRegistry.FASTSTEPFRAGMENT.get()), new ItemStack(ItemRegistry.BASE_GEM.get()))));
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.GOLDEN_CARROT, 6), new ItemStack(ItemRegistry.GLOWINGSTONE_GEM.get()), new ItemStack(ItemRegistry.VISIBILITYSTONE_GEM.get()))));
            case "alchemistinfusion:fish_stone":
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.DIAMOND_BLOCK), new ItemStack(Items.EMERALD_BLOCK, 2), new ItemStack(Items.HEART_OF_THE_SEA), new ItemStack(BlockItemRegistry.SPEEDSTEPSTONE_ITEM.get()), new ItemStack(ItemRegistry.BAGOFSUGAR.get(), 3), new ItemStack(BlockItemRegistry.DOLPHINSTONE.get()))));
            case "alchemistinfusion:snailstep_stone":
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SOUL_CAMPFIRE), new ItemStack(Items.DIAMOND_BLOCK), new ItemStack(Items.EMERALD_BLOCK), new ItemStack(BlockItemRegistry.RESTRICTIVESTONE_ITEM.get()), new ItemStack(Items.STICKY_PISTON), new ItemStack(BlockItemRegistry.SLOTHSTONE.get()))));
            case "alchemistinfusion:speed_step_stone":
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.SLIME_BLOCK), new ItemStack(Items.DIAMOND_BLOCK), new ItemStack(Items.EMERALD_BLOCK), new ItemStack(BlockItemRegistry.LEAPSTONE_ITEM.get()), new ItemStack(ItemRegistry.BAGOFSUGAR.get(), 3), new ItemStack(BlockItemRegistry.MOBILITYSTONE_ITEM.get()))));
            default:
                break;
        }

        return stacks;
    }


}
