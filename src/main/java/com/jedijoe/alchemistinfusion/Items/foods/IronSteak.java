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

public class IronSteak extends Item {
        public IronSteak() {
            super(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder()
                    .hunger(8)
                    .saturation(12.8f)
                    .effect(() -> new EffectInstance(Effects.RESISTANCE, 20*AlchemistInfusion.config.IRONSTEAKDURATION.get(), 1), 1.0f)
                    .effect(() -> new EffectInstance(Effects.SLOWNESS, 20*AlchemistInfusion.config.IRONSTEAKDURATION2.get(), 0), 1.0f)
                    .meat()
                    .setAlwaysEdible()
                    .build()));
        }

        @Override
        public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            String msg = TextFormatting.BLUE + "Resistance II (" + TimeBuilder(AlchemistInfusion.config.IRONSTEAKDURATION.get());
            String msg1 = TextFormatting.RED + "Slowness I (" + TimeBuilder(AlchemistInfusion.config.IRONSTEAKDURATION2.get());
            tooltip.add(new StringTextComponent(msg));
            tooltip.add(new StringTextComponent(msg1));
            super.addInformation(stack, worldIn, tooltip, flagIn);
        }


        private String TimeBuilder(int timermath){
            String timer = "";
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

