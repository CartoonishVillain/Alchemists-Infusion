package com.jedijoe.alchemistinfusion.Items.foods;
import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ProductivePotato extends Item {
    public ProductivePotato() {
        super(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder()
                .hunger(5)
                .saturation(6)
                .effect(() -> new EffectInstance(Effects.HASTE, 20*30, 0), 1.0f)
                .build()));
    }
}
