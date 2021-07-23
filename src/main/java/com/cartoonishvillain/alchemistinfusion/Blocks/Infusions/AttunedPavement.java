package com.cartoonishvillain.alchemistinfusion.Blocks.Infusions;

import com.cartoonishvillain.alchemistinfusion.Crafting.InfusionRecipe;
import com.cartoonishvillain.alchemistinfusion.Crafting.RecipeProcessor;
import com.cartoonishvillain.alchemistinfusion.Registries.ItemRegistry;
import com.cartoonishvillain.alchemistinfusion.Blocks.Potion.PotionBlockItemBase;
import com.cartoonishvillain.alchemistinfusion.Items.KeyItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.common.ToolType;

import java.util.ArrayList;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;

public class AttunedPavement extends Block {
    public AttunedPavement() {
        super(Properties.of(Material.STONE).strength(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops());
    }

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit){

        if(!worldIn.isClientSide() && handIn == InteractionHand.MAIN_HAND) {
            ArrayList<ArrayList<ItemStack>> recipe = null;
            ArrayList<ItemEntity> itemEntities = RecipeProcessor.Scan(pos, worldIn);
            Item keyItem = null;
            if (player.getMainHandItem().getItem().equals(ItemRegistry.ATTUNEDINFUSIONROD.get()) || player.getOffhandItem().getItem().equals(ItemRegistry.ATTUNEDINFUSIONROD.get())) {
                for (ItemEntity itemEntity : itemEntities) {
                    if (itemEntity.getItem().getItem() instanceof KeyItem || (itemEntity.getItem().getItem() instanceof PotionBlockItemBase && (itemEntity.getItem().getItem().getRegistryName().toString().equals("alchemistinfusion:snailstep_stone") || itemEntity.getItem().getItem().getRegistryName().toString().equals("alchemistinfusion:speed_step_stone"))))
                        keyItem = itemEntity.getItem().getItem();
                    if (keyItem != null) break;
                }

                if (keyItem != null) {
                    recipe = InfusionRecipe.ParseTier3Recipe(keyItem);
                    if (recipe.size() > 0)
                        RecipeProcessor.AttemptRecipe(recipe, itemEntities, pos, worldIn, null, player);
                    else {
                        player.displayClientMessage(new TextComponent("No recipes found. Are you using the right tier? Do you have the ingredients? (Currently: Tier 3)"), false);
                        ServerLevel serverWorld = (ServerLevel) worldIn;
                        serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY() + 1, pos.getZ(), 10, 0.5, 0.5, 0.5, 0);
                        serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY() + 1, pos.getZ(), 10, 0.1, 0.5, 0.1, 0);
                        serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY() + 1, pos.getZ(), 10, 0.1, 0.5, 0.9, 0);
                        serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY() + 1, pos.getZ(), 10, 0.9, 0.5, 0.9, 0);
                        serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY() + 1, pos.getZ(), 10, 0.9, 0.5, 0.1, 0);
                        worldIn.playSound(null, pos, new SoundEvent(SoundEvents.GENERIC_EXTINGUISH_FIRE.getRegistryName()), SoundSource.BLOCKS, 100f, 1.5f);
                    }
                } else {
                    player.displayClientMessage(new TextComponent("No recipes found. Are you using the right tier? Do you have the ingredients? (Currently: Tier 3)"), false);
                    ServerLevel serverWorld = (ServerLevel) worldIn;
                    serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY() + 1, pos.getZ(), 10, 0.5, 0.5, 0.5, 0);
                    serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY() + 1, pos.getZ(), 10, 0.1, 0.5, 0.1, 0);
                    serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY() + 1, pos.getZ(), 10, 0.1, 0.5, 0.9, 0);
                    serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY() + 1, pos.getZ(), 10, 0.9, 0.5, 0.9, 0);
                    serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY() + 1, pos.getZ(), 10, 0.9, 0.5, 0.1, 0);
                    worldIn.playSound(null, pos, new SoundEvent(SoundEvents.GENERIC_EXTINGUISH_FIRE.getRegistryName()), SoundSource.BLOCKS, 100f, 1.5f);
                }
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
                        player.displayClientMessage(new TextComponent("No recipes found. You are not using an attuned infusion rod, reducing the capabilities of this block! (Currently: Tier 2)"), false);
                        ServerLevel serverWorld = (ServerLevel) worldIn;
                        serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY()+1, pos.getZ(), 10, 0.5, 0.5, 0.5, 0);
                        serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY()+1, pos.getZ(), 10, 0.1, 0.5, 0.1, 0);
                        serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY()+1, pos.getZ(), 10, 0.1, 0.5, 0.9, 0);
                        serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY()+1, pos.getZ(), 10, 0.9, 0.5, 0.9, 0);
                        serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY()+1, pos.getZ(), 10, 0.9, 0.5, 0.1, 0);
                        worldIn.playSound(null, pos, new SoundEvent(SoundEvents.GENERIC_EXTINGUISH_FIRE.getRegistryName()), SoundSource.BLOCKS, 100f, 1.5f);
                    }
                }else{ player.displayClientMessage(new TextComponent("No recipes found. You are not using an attuned infusion rod, reducing the capabilities of this block! (Currently: Tier 2)"), false);
                ServerLevel serverWorld = (ServerLevel) worldIn;
                serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY()+1, pos.getZ(), 10, 0.5, 0.5, 0.5, 0);
                serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY()+1, pos.getZ(), 10, 0.1, 0.5, 0.1, 0);
                serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY()+1, pos.getZ(), 10, 0.1, 0.5, 0.9, 0);
                serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY()+1, pos.getZ(), 10, 0.9, 0.5, 0.9, 0);
                serverWorld.sendParticles(ParticleTypes.LARGE_SMOKE, pos.getX(), pos.getY()+1, pos.getZ(), 10, 0.9, 0.5, 0.1, 0);
                worldIn.playSound(null, pos, new SoundEvent(SoundEvents.GENERIC_EXTINGUISH_FIRE.getRegistryName()), SoundSource.BLOCKS, 100f, 1.5f);
            }
            }
        }
        return InteractionResult.SUCCESS;
    }
}
