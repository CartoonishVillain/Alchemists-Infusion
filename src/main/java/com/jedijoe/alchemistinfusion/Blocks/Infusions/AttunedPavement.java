package com.jedijoe.alchemistinfusion.Blocks.Infusions;

import com.jedijoe.alchemistinfusion.Blocks.Potion.PotionBlockItemBase;
import com.jedijoe.alchemistinfusion.Crafting.InfusionRecipe;
import com.jedijoe.alchemistinfusion.Crafting.RecipeProcessor;
import com.jedijoe.alchemistinfusion.Items.KeyItem;
import com.jedijoe.alchemistinfusion.Registries.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.ArrayList;

public class AttunedPavement extends Block {
    public AttunedPavement() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){

        if(!worldIn.isRemote() && handIn == Hand.MAIN_HAND) {
            ArrayList<ArrayList<ItemStack>> recipe = null;
            ArrayList<ItemEntity> itemEntities = RecipeProcessor.Scan(pos, worldIn);
            Item keyItem = null;
            if (player.getHeldItemMainhand().getItem().equals(ItemRegistry.ATTUNEDINFUSIONROD.get()) || player.getHeldItemOffhand().getItem().equals(ItemRegistry.ATTUNEDINFUSIONROD.get())){
                for (ItemEntity itemEntity : itemEntities) {
                    if (itemEntity.getItem().getItem() instanceof KeyItem || (itemEntity.getItem().getItem() instanceof PotionBlockItemBase && (itemEntity.getItem().getItem().getRegistryName().toString().equals("alchemistinfusion:fish_stone") || itemEntity.getItem().getItem().getRegistryName().toString().equals("alchemistinfusion:snailstep_stone") || itemEntity.getItem().getItem().getRegistryName().toString().equals("alchemistinfusion:speed_step_stone"))))
                        keyItem = itemEntity.getItem().getItem();
                    if (keyItem != null) break;
                }

                if (keyItem != null) {
                    recipe = InfusionRecipe.ParseTier3Recipe(keyItem);
                    if (recipe.size() > 0)
                        RecipeProcessor.AttemptRecipe(recipe, itemEntities, pos, worldIn, null, player);
                    else {
                        player.sendStatusMessage(new StringTextComponent("No recipes found. Are you using the right tier? Do you have the ingredients? (Currently: Tier 3)"), false);
                    }
                }else player.sendStatusMessage(new StringTextComponent("No recipes found. Are you using the right tier? Do you have the ingredients? (Currently: Tier 3)"), false);
            }
            else{
                for (ItemEntity itemEntity : itemEntities) {
                    if (itemEntity.getItem().getItem() instanceof KeyItem)
                        keyItem = itemEntity.getItem().getItem();
                    if (keyItem != null) break;
                }

                if (keyItem != null) {
                    recipe = InfusionRecipe.ParseTier2Recipe(keyItem);
                    if (recipe.size() > 0)
                        RecipeProcessor.AttemptRecipe(recipe, itemEntities, pos, worldIn, null, player);
                    else {
                        player.sendStatusMessage(new StringTextComponent("No recipes found. You are not using an attuned infusion rod, reducing the capabilities of this block! (Currently: Tier 2)"), false);
                    }
                }else player.sendStatusMessage(new StringTextComponent("No recipes found. You are not using an attuned infusion rod, reducing the capabilities of this block! (Currently: Tier 2)"), false);

            }
        }
        return ActionResultType.SUCCESS;
    }
}
