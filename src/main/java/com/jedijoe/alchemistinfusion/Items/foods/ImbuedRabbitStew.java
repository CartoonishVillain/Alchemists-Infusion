package com.jedijoe.alchemistinfusion.Items.foods;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ImbuedRabbitStew extends SoupItem {
        public ImbuedRabbitStew() {
            super(new Properties().group(AlchemistInfusion.TAB).food(new Food.Builder()
                    .hunger(10)
                    .saturation(12f)
                    .effect(() -> new EffectInstance(Effects.JUMP_BOOST, 20*AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION.get(), 2), 1.0f)
                    .effect(() -> new EffectInstance(Effects.HASTE, 20*AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION2.get(), 0), 1.0f)
                    .effect(() -> new EffectInstance(Effects.STRENGTH, 20*AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION3.get(), 0), 0.45f)
                    .meat()
                    .setAlwaysEdible()
                    .build()));
        }

        @Override
        public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
            String msg = TextFormatting.BLUE + "Jump Boost III (" + TimeBuilder(AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION.get());
            String msg1 = TextFormatting.RED + "Haste I (" + TimeBuilder(AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION2.get());
            String msg2 = TextFormatting.BLUE + "A great meal for those trying to get by in the mines";
            tooltip.add(new StringTextComponent(msg));
            tooltip.add(new StringTextComponent(msg1));
            tooltip.add(new StringTextComponent(msg2));
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

