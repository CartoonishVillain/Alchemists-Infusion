package com.jedijoe.alchemistinfusion.Blocks;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.InventoryScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//@Mod.EventBusSubscriber(modid = AlchemistInfusion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class Blocker extends Block {

    public Blocker() {
        super(Properties.create(Material.WOOL).speedFactor(0.9f).sound(SoundType.CLOTH).hardnessAndResistance(1.0f));
    }

//    @Override
//    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
//        if(entityIn instanceof PlayerEntity){
////            PlayerEntity entity = (PlayerEntity) entityIn;
////            entity.closeScreen();
//        }
//    }

}
