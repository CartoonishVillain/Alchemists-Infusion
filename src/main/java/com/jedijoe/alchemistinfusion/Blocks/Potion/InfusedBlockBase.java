package com.jedijoe.alchemistinfusion.Blocks.Potion;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.ArrayList;

public class InfusedBlockBase extends Block {
    public InfusedBlockBase(Properties properties, ArrayList<EffectInstance> effectInstance, TextFormatting textFormatting, int Tier) {
        super(properties);
        this.textFormatting = textFormatting;
        this.tier = Tier;
        this.effectInstance = effectInstance;
        timer = new ArrayList<Integer>();
        amplitude = new ArrayList<Integer>();
        effect = new ArrayList<Effect>();
        for(EffectInstance instance : effectInstance){
        timer.add(instance.getDuration());
        amplitude.add(instance.getAmplifier());
        effect.add(instance.getPotion());}

    }



    private ArrayList<Effect> effect;
    private ArrayList<Integer> timer, amplitude;
    private int tier;
    private ArrayList<EffectInstance> effectInstance;
    TextFormatting textFormatting;


    public String GetEffect(EffectInstance instance){
        String name = instance.getEffectName();
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
    public String GetAmplifier(EffectInstance instance){return PotentBuilder(instance.getAmplifier());}
    public String GetDuration(EffectInstance instance){return TimeBuilder(instance.getDuration());}
    public TextFormatting getTextFormatting() {return textFormatting;}

    public int getTier() {return tier;}

    public ArrayList<EffectInstance> getEffectInstance() {return effectInstance;}

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
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityWalk(worldIn, pos, entityIn);
        if (!worldIn.isRemote()) {
            if (entityIn instanceof LivingEntity) {
                int counter = 0;
                for(EffectInstance effects : effectInstance){
                    if(effects.getDuration() != timer.get(counter)) effectInstance.set(counter, new EffectInstance(effects.getPotion(), timer.get(counter), effects.getAmplifier()));
                    ((LivingEntity) entityIn).addPotionEffect(effects);
                    counter++;
                }
            }
        }
    }
}
