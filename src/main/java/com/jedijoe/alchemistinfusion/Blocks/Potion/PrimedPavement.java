package com.jedijoe.alchemistinfusion.Blocks.Potion;

import com.jedijoe.alchemistinfusion.Crafting.InfusionRecipe;
import com.jedijoe.alchemistinfusion.Crafting.RecipeProcessor;
import com.jedijoe.alchemistinfusion.Items.KeyItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.ArrayList;

public class PrimedPavement extends Block {
    public PrimedPavement() {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool());
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){

        if(!worldIn.isRemote()) {
            ArrayList<ItemEntity> itemEntities = RecipeProcessor.Scan(pos, worldIn);
            KeyItem keyItem = null;
            for (ItemEntity itemEntity : itemEntities) {
                if (itemEntity.getItem().getItem() instanceof KeyItem)
                    keyItem = (KeyItem) itemEntity.getItem().getItem();
                if (keyItem != null) break;
            }

            if (keyItem != null) {
                ArrayList<ArrayList<ItemStack>> recipe = InfusionRecipe.ParseTier2Recipe(keyItem);
                RecipeProcessor.AttemptRecipe(recipe, itemEntities, pos, worldIn, null);
            }
        }
        return ActionResultType.SUCCESS;
    }
}
