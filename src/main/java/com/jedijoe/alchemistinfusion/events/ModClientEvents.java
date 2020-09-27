package com.jedijoe.alchemistinfusion.events;

import com.jedijoe.alchemistinfusion.Registries.BlockRegistry;
import com.sun.scenario.effect.Effect;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraft.client.gui.screen.inventory.InventoryScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifierManager;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.jedijoe.alchemistinfusion.AlchemistInfusion;


@Mod.EventBusSubscriber(modid = AlchemistInfusion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void blockerEvent(GuiOpenEvent event){
        if(event.isCancelable()){
            if(event.getGui() instanceof InventoryScreen){
                PlayerEntity player = Minecraft.getInstance().player;
                BlockPos pos = player.getPosition().down();
                boolean onBlocker = (player.world.getBlockState(pos).getBlock().equals(BlockRegistry.BLOCKER.get().getBlock()));
                if(onBlocker){
                    event.setCanceled(true);
                }
            }
        }
    }


}

