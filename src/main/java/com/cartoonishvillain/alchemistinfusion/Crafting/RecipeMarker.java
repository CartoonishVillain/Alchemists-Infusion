package com.cartoonishvillain.alchemistinfusion.Crafting;

import com.cartoonishvillain.alchemistinfusion.Registries.BlockItemRegistry;
import com.cartoonishvillain.alchemistinfusion.Registries.ItemRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeMarker {

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
        }
        return stacks;}

    public static ArrayList<ArrayList<ItemStack>> ParseTier2Recipe(Item item){
        String parser = item.getItem().getRegistryName().toString();
        ArrayList<ArrayList<ItemStack>> stacks = new ArrayList<>();
        switch(parser){
            case "alchemistinfusion:alchemical_bowl":
                break;
            case "alchemistinfusion:alchemical_fragment_cast":
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

                break;
            case "alchemistinfusion:alchemical_fragment_cast":
                stacks.add(new ArrayList<>(Arrays.asList(new ItemStack(item), new ItemStack(Items.PISTON, 3), new ItemStack(BlockItemRegistry.FALLBREAKER_ITEM.get()), new ItemStack(Items.COMPARATOR, 1), new ItemStack(Items.OBSIDIAN, 2), new ItemStack(Items.DIAMOND), new ItemStack(BlockItemRegistry.MOMENTUMCONVERTER_ITEM.get()))));
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
