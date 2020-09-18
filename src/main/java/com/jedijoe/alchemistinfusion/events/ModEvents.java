package com.jedijoe.alchemistinfusion.events;

import com.jedijoe.alchemistinfusion.Registries.ItemRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.jedijoe.alchemistinfusion.AlchemistInfusion;


@Mod.EventBusSubscriber(modid = AlchemistInfusion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {

    @SubscribeEvent
    public static void playerEffects(TickEvent.PlayerTickEvent event){
        PlayerEntity jumper = event.player;
        if(jumper.isCrouching() && jumper.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(ItemRegistry.LEAP_BOOTS.get().getItem()) && AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()) {
            jumper.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 5, AlchemistInfusion.config.LEAPBOOTPOWER.get()-1, true, false));
        } else if(jumper.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(ItemRegistry.LUCK_BOOTS.get().getItem()) && AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()){
            jumper.addPotionEffect(new EffectInstance(Effects.LUCK, 5, AlchemistInfusion.config.LUCKSTRENGTH.get()-1, true, false));
        }else if(jumper.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(ItemRegistry.UNLUCK_BOOTS.get().getItem()) && AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()){
            jumper.addPotionEffect(new EffectInstance(Effects.UNLUCK, 5, AlchemistInfusion.config.UNLUCKSTRENGTH.get()-1, true, false));
        }else if(jumper.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(ItemRegistry.ICE_BOOTS.get().getItem()) && AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()){
            if(jumper.isOnGround()){
                if(jumper.isSprinting()){
                    jumper.moveRelative(1f, new Vector3d(0, 0, AlchemistInfusion.config.ICEBOOTSTRENGTHSPRINT.get()));
                }else if (jumper.isCrouching()){
                    jumper.moveRelative(1f, new Vector3d(0, 0, AlchemistInfusion.config.ICEBOOTSTRENGTHSNEAK.get()));
                }else{
                    jumper.moveRelative(1f, new Vector3d(0, 0, AlchemistInfusion.config.ICEBOOTSTRENGTHDEFAULT.get()));}}
        }

    }

    @SubscribeEvent
    public static void executePreparedJump(LivingEvent.LivingJumpEvent event){
        LivingEntity jumper = event.getEntityLiving();
        if(jumper.getType() == EntityType.PLAYER && jumper.isCrouching() && jumper.isPotionActive(Effects.JUMP_BOOST)){
            PlayerEntity player = (PlayerEntity)jumper;
            player.addExhaustion(0.5F * (AlchemistInfusion.config.LEAPBOOTEXHAUSTION.get() - 1));
        }
    }
}


