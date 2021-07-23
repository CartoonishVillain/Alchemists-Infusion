package com.cartoonishvillain.alchemistinfusion.events;

import com.cartoonishvillain.alchemistinfusion.Registries.ItemRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;


@Mod.EventBusSubscriber(modid = AlchemistInfusion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {

    @SubscribeEvent
    public static void playerEffects(TickEvent.PlayerTickEvent event){
        Player player = event.player;
        if(player.isCrouching() && player.getItemBySlot(EquipmentSlot.FEET).getItem().equals(ItemRegistry.LEAP_BOOTS.get()) && AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()) {
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 5, AlchemistInfusion.config.LEAPBOOTPOWER.get()-1, true, false));
        } else if(player.getItemBySlot(EquipmentSlot.FEET).getItem().equals(ItemRegistry.LUCK_BOOTS.get()) && AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()){
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 5, AlchemistInfusion.config.LUCKSTRENGTH.get()-1, true, false));
        }else if(player.getItemBySlot(EquipmentSlot.FEET).getItem().equals(ItemRegistry.UNLUCK_BOOTS.get()) && AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()){
            player.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 5, AlchemistInfusion.config.UNLUCKSTRENGTH.get()-1, true, false));
        }else if(player.getItemBySlot(EquipmentSlot.FEET).getItem().equals(ItemRegistry.ICE_BOOTS.get()) && AlchemistInfusion.config.ENABLEINFUSEDBOOTS.get()){
            if(player.isOnGround()){
                if(player.isSprinting()){
                    player.moveRelative(1f, new Vec3(0, 0, AlchemistInfusion.config.ICEBOOTSTRENGTHSPRINT.get()));
                }else if (player.isCrouching()){
                    player.moveRelative(1f, new Vec3(0, 0, AlchemistInfusion.config.ICEBOOTSTRENGTHSNEAK.get()));
                }else{
                    player.moveRelative(1f, new Vec3(0, 0, AlchemistInfusion.config.ICEBOOTSTRENGTHDEFAULT.get()));}}
        }

    }

    @SubscribeEvent
    public static void executePreparedJump(LivingEvent.LivingJumpEvent event){
        LivingEntity jumper = event.getEntityLiving();
        if(jumper.getType() == EntityType.PLAYER && jumper.isCrouching() && jumper.hasEffect(MobEffects.JUMP) && jumper.getItemBySlot(EquipmentSlot.FEET).getItem().equals(ItemRegistry.LEAP_BOOTS.get())){
            Player player = (Player)jumper;
            player.causeFoodExhaustion(0.5F * (AlchemistInfusion.config.LEAPBOOTEXHAUSTION.get() - 1));
        }
    }

}


