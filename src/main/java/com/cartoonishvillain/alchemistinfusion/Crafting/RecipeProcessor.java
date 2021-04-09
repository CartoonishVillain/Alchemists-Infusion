package com.cartoonishvillain.alchemistinfusion.Crafting;

import com.cartoonishvillain.alchemistinfusion.Items.PersistentItem;
import com.cartoonishvillain.alchemistinfusion.Items.KeyItem;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RecipeProcessor {
    public static void AttemptRecipe(ArrayList<ArrayList<ItemStack>> recipeStack, ArrayList<ItemEntity> ExistingItems, BlockPos pos, World world, ItemStack reward, PlayerEntity playerEntity){
        //Phase 0 - List out all existing items
        ArrayList<ItemStack> existingStack = new ArrayList<>();
        for(ItemEntity entity : ExistingItems){existingStack.add(entity.getItem());}

        //Phase 1 - Mapping out items that exist
        HashMap<String, Integer> ExistingMap = MapStacks(existingStack);


        //Phase 2 - check if recipe will be valid
        HashMap<String, Integer> trueRecipe = null;
        ItemStack trueReward = null;
        for(ArrayList<ItemStack> recipes : recipeStack){

            ItemStack potentialReward = recipes.get(recipes.size()-1);
            recipes.remove(potentialReward);

            HashMap<String, Integer> Recipe = MapStacks(recipes);

            if(!isRecipeValid(ExistingMap, Recipe)) continue;
            else trueRecipe = Recipe;
            trueReward = potentialReward; break;
        }
        if(trueReward == null){
            playerEntity.sendStatusMessage(new StringTextComponent("No matching recipes! Please recheck your components!"), false);
            world.playSound(null, pos, new SoundEvent(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE.getRegistryName()), SoundCategory.BLOCKS, 100f, 1.5f);
            return;}
        else reward = trueReward;

        //Phase 3 -  Remove items;
        updateItems(existingStack, trueRecipe, ExistingItems);

        //Phase 4 - Payout

        ItemEntity itemEntity = new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(), reward);
        world.addEntity(itemEntity);
        world.playSound(null, pos, new SoundEvent(SoundEvents.ENTITY_PLAYER_LEVELUP.getRegistryName()), SoundCategory.BLOCKS, 100f, 1.5f);
    }

    public static ArrayList<ItemEntity> Scan(BlockPos pos, World world){
        double x = pos.getX() - 1;
        double y = pos.getY() - 2;
        double z = pos.getZ() - 1;
        double x2 = pos.getX() + 1;
        double y2 = pos.getY() + 2;
        double z2 = pos.getZ() + 1;
        AxisAlignedBB scanner = new AxisAlignedBB(x,y,z,x2,y2,z2);
        return (ArrayList<ItemEntity>) world.getEntitiesWithinAABB(ItemEntity.class, scanner);
    }

    private static HashMap<String, Integer> MapStacks(ArrayList<ItemStack> items){ // converts the itemstack arraylist into a map of usable items.
        HashMap<String, Integer> itemMap = new HashMap<>();
        for(ItemStack itemStack : items){
            String name = itemStack.getItem().getName().toString();
            int amount = itemStack.getCount();
            if(itemMap.containsKey(name)){ // if the map already has a stack (multiple stacks of the same item in equation)
                int temp = itemMap.get(name);
                amount += temp;
            }
            itemMap.put(name, amount);
        }
        return itemMap;
    }

    private static boolean isRecipeValid(HashMap<String, Integer> Existing, HashMap<String, Integer> Recipe){ //checks if the proper materials exist for the recipe.
        boolean isValid = true;
        for(Map.Entry<String, Integer> entry : Recipe.entrySet()){
            if(Existing.containsKey(entry.getKey())){ // if item from the recipe exists in the current stack
                if(Existing.get(entry.getKey()) >= entry.getValue()){ // if enough of the queried item exists
                    continue; // no more checks, carry on.
                }
                else isValid = false; break; //if you don't have enough of the required items, the recipe does not continue to the next phase.
            }
            else isValid = false; break; //if you don't have one of the required items, the recipe does not continue to the next phase.
        }
        return isValid;
    }

    private static void updateItems(ArrayList<ItemStack> existingStack, HashMap<String, Integer> recipeMap, ArrayList<ItemEntity> ExistingItems){
        for(ItemStack itemStack : existingStack){
            ItemEntity entity = null;
            for(ItemEntity itemEntity : ExistingItems){
                if(itemEntity.getItem().equals(itemStack)){
                    entity = itemEntity;
                }
                if(entity != null) break;
            } //The proper itemstack should be found at this stage as "entity"

            if(entity != null && recipeMap.containsKey(itemStack.getItem().getName().toString()) && !(itemStack.getItem() instanceof KeyItem || itemStack.getItem() instanceof PersistentItem)){
            int amount = itemStack.getCount();
            amount -= recipeMap.get(itemStack.getItem().getName().toString());//subtract recipe amount;
            itemStack.setCount(amount);
            entity.setItem(itemStack); //theoretically working prototype.
        }
        }
    }
}
