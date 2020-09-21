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

public class VisionCarrot extends Item {
    public VisionCarrot() {
        super(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder()
                .hunger(6)
                .saturation(14.4f)
                .effect(() -> new EffectInstance(Effects.NIGHT_VISION, 20*AlchemistInfusion.config.VISIONCARROTDURATION.get(), 0), 1.0f)
                .effect(() -> new EffectInstance(Effects.INVISIBILITY, 20*AlchemistInfusion.config.VISIONCARROTDURATION2.get(), 0), 0.2f)
                .effect(() -> new EffectInstance(Effects.GLOWING, 20*AlchemistInfusion.config.VISIONCARROTDURATION3.get(), 0), 0.1f)
                .setAlwaysEdible()
                .build()));
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        String msg = TextFormatting.BLUE + "Night Vision (" + TimeBuilder();
        tooltip.add(new StringTextComponent(msg));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    private String TimeBuilder(){
        String timer = "";
        int timermath = AlchemistInfusion.config.VISIONCARROTDURATION.get();
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
