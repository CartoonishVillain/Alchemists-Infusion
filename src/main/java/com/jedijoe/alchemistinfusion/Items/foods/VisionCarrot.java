package com.jedijoe.alchemistinfusion.Items.foods;
import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class VisionCarrot extends Item {
    public VisionCarrot() {
        super(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder()
                .hunger(6)
                .saturation(14.4f)
                .effect(() -> new EffectInstance(Effects.NIGHT_VISION, 20*20, 0), 1.0f)
                .effect(() -> new EffectInstance(Effects.INVISIBILITY, 20*15, 0), 0.2f)
                .effect(() -> new EffectInstance(Effects.GLOWING, 20*20, 0), 0.1f)
                .build()));
    }
}
