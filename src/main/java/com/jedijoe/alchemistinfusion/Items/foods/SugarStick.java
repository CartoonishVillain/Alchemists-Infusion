package com.jedijoe.alchemistinfusion.Items.foods;
import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Configuration;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class SugarStick extends Item {
    public SugarStick() {
        super(new Properties().group(AlchemistInfusion.TAB).food(new Food.Builder()
                .hunger(1)
                .saturation(1)
                .fastToEat()
                .effect(() -> new EffectInstance(Effects.SPEED, 20*Configuration.SUGARSTICKDURATION.get(), 0), 1.0f)
                .effect(()-> new EffectInstance(Effects.NAUSEA, 20*Configuration.SUGARSTICKDURATION2.get(), 1), 0.15f)
                .build()));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        String msg = TextFormatting.BLUE + "Speed I (" + TimeBuilder();
        tooltip.add(new StringTextComponent(msg));
        String msg2 = TextFormatting.RED + "May make you sick";
        tooltip.add(new StringTextComponent(msg2));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    private String TimeBuilder(){
        String timer = "";
        int timermath = Configuration.SUGARSTICKDURATION.get();
        if (timermath > 60){
            timer += Integer.toString(timermath/60);
            while(timermath > 60){timermath -= 60;}
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
}
