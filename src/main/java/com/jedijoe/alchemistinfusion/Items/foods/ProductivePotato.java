package com.jedijoe.alchemistinfusion.Items.foods;
import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ProductivePotato extends Item {
    public ProductivePotato() {
        super(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder()
                .hunger(5)
                .saturation(6)
                .effect(() -> new EffectInstance(Effects.HASTE, 20*AlchemistInfusion.config.PRODUCTIVEPOTATODURATION.get(), 0), 1.0f)
                .setAlwaysEdible()
                .build()));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        String msg = TextFormatting.BLUE + "Haste I (" + TimeBuilder();
        tooltip.add(new StringTextComponent(msg));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    private String TimeBuilder(){
        String timer = "";
        int timermath = AlchemistInfusion.config.PRODUCTIVEPOTATODURATION.get();
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
}
