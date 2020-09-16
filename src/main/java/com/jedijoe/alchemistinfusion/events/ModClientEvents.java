package com.jedijoe.alchemistinfusion.events;

import com.jedijoe.alchemistinfusion.Registries.ItemRegistry;
import com.sun.scenario.effect.Effect;
import net.minecraft.client.gui.screen.inventory.InventoryScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifierManager;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
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


@Mod.EventBusSubscriber(modid = AlchemistInfusion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModClientEvents {

    @SubscribeEvent
    public static void playerEffects(TickEvent.PlayerTickEvent event){
        PlayerEntity jumper = event.player;
        if(jumper.isCrouching() && jumper.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(ItemRegistry.LEAP_BOOTS.get().getItem())) {
            jumper.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 5, 1, true, false));
        } else if(jumper.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(ItemRegistry.LUCK_BOOTS.get().getItem())){
            jumper.addPotionEffect(new EffectInstance(Effects.LUCK, 5, 0, true, false));
        }else if(jumper.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(ItemRegistry.UNLUCK_BOOTS.get().getItem())){
            jumper.addPotionEffect(new EffectInstance(Effects.UNLUCK, 5, 0, true, false));
        }

    }

    @SubscribeEvent
    public static void executePreparedJump(LivingEvent.LivingJumpEvent event){
        LivingEntity jumper = event.getEntityLiving();
        if(jumper.getType() == EntityType.PLAYER && jumper.isCrouching() && jumper.isPotionActive(Effects.JUMP_BOOST)){
            PlayerEntity player = (PlayerEntity)jumper;
            player.addExhaustion(0.15F);
        }
    }
}


