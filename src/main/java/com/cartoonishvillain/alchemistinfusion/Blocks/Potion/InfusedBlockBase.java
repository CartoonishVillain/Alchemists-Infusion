package com.cartoonishvillain.alchemistinfusion.Blocks.Potion;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;
import net.minecraft.ChatFormatting;
import net.minecraft.world.level.Level;

import java.util.ArrayList;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.BlockState;

public class InfusedBlockBase extends Block {
    public InfusedBlockBase(Properties properties, ArrayList<MobEffectInstance> effectInstance, ChatFormatting textFormatting, int Tier) {
        super(properties);
        this.textFormatting = textFormatting;
        this.tier = Tier;
        this.effectInstance = effectInstance;
        timer = new ArrayList<Integer>();
        amplitude = new ArrayList<Integer>();
        effect = new ArrayList<MobEffect>();
        for(MobEffectInstance instance : effectInstance){
        timer.add(instance.getDuration());
        amplitude.add(instance.getAmplifier());
        effect.add(instance.getEffect());}

    }



    private ArrayList<MobEffect> effect;
    private ArrayList<Integer> timer, amplitude;
    private int tier;
    private ArrayList<MobEffectInstance> effectInstance;
    ChatFormatting textFormatting;


    public String GetEffect(MobEffectInstance instance){
        String name = instance.getDescriptionId();
        String[] split = name.split("\\.");
        String[] split2 = split[2].split("_");
        name = split2[0];
        String name2 = null;
        Character character = name.charAt(0);
        character = Character.toUpperCase(character);
        name = name.substring(1);
        name = character + name;

        if(split2.length == 2){name2 = split2[1];}
        if(name2 != null){
            character = name2.charAt(0);
            character = Character.toUpperCase(character);
            name2 = name2.substring(1);
            name2 = character + name2;
        }
        if(name2 != null)
        name = name + " " + name2;
        else name = name;
        return name;}
    public String GetAmplifier(MobEffectInstance instance){return PotentBuilder(instance.getAmplifier());}
    public String GetDuration(MobEffectInstance instance){return TimeBuilder(instance.getDuration());}
    public ChatFormatting getTextFormatting() {return textFormatting;}

    public int getTier() {return tier;}

    public ArrayList<MobEffectInstance> getEffectInstance() {return effectInstance;}

    private String PotentBuilder(int potency){
        switch(potency){
            case 0:
                return "I";
            case 1:
                return "II";
            case 2:
                return "III";
            case 3:
                return "IV";
            case 4:
                return "V";
            default:
                return "?";
    }
    }



    private String TimeBuilder(int duration){
        String timer = "(";
        int timermath = duration/20;
        if (timermath >= 60){
            timer += Integer.toString(timermath/60);
            while(timermath >= 60){timermath -= 60;}
            timer += ":";
        }else{
            timer += "00:";
        }
        if (timermath > 9){
            timer += Integer.toString(timermath);
            timer += ")";
        } else{
            timer += "0";
            timer += Integer.toString(timermath);
            timer += ")";
        }
        return timer;
    }

    @Override
    public void stepOn(Level worldIn, BlockPos pos, BlockState blockState, Entity entityIn) {
        super.stepOn(worldIn, pos, blockState, entityIn);
        if (!worldIn.isClientSide()) {
            if (entityIn instanceof LivingEntity) {
                int counter = 0;
                for(MobEffectInstance effects : effectInstance){
                    if(effects.getDuration() != timer.get(counter)) effectInstance.set(counter, new MobEffectInstance(effects.getEffect(), timer.get(counter), effects.getAmplifier()));
                    ((LivingEntity) entityIn).addEffect(effects);
                    counter++;
                }
            }
        }
    }
}
