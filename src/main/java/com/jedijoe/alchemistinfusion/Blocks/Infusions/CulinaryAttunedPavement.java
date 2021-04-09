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

public class CulinaryAttunedPavement extends Block {
    public CulinaryAttunedPavement() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){

        if(!worldIn.isRemote() && handIn == Hand.MAIN_HAND) {
            ArrayList<ArrayList<ItemStack>> recipe = null;
            ArrayList<ItemEntity> itemEntities = RecipeProcessor.Scan(pos, worldIn);
            Item keyItem = null;

            for (ItemEntity itemEntity : itemEntities) {
                if (itemEntity.getItem().getItem() instanceof KeyItem || itemEntity.getItem().getItem() instanceof PotionBlockItemBase)
                    keyItem = itemEntity.getItem().getItem();
                if (keyItem != null) break;
            }

            if (keyItem != null) {
                recipe = InfusionRecipe.ParseTierFRecipe(keyItem);
                if(recipe.size() > 0)
                    RecipeProcessor.AttemptRecipe(recipe, itemEntities, pos, worldIn, null, player);
                else{player.sendStatusMessage(new StringTextComponent("No recipes found. Culinary Pavement only prepares alchemical food and requires an alchemical culinary key!"), false);}
            }else{player.sendStatusMessage(new StringTextComponent("No recipes found. Culinary Pavement only prepares alchemical food and requires an alchemical culinary key!"), false);}

        }



        return ActionResultType.SUCCESS;
    }
}
