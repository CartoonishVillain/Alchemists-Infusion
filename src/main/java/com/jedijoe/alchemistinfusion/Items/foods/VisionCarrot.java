package com.jedijoe.alchemistinfusion.Items.foods;
import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
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
                .effect(() -> new EffectInstance(Effects.NIGHT_VISION, 20*20, 0), 1.0f)
                .effect(() -> new EffectInstance(Effects.INVISIBILITY, 20*15, 0), 0.2f)
                .effect(() -> new EffectInstance(Effects.GLOWING, 20*20, 0), 0.1f)
                .build()));
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        String msg = TextFormatting.BLUE + "Night Vision (0:20)";
        String msg2 = TextFormatting.DARK_GRAY + "??? (0:15)";
        String msg3 = TextFormatting.DARK_GRAY + "??? (0:20)";
        tooltip.add(new StringTextComponent(msg)); tooltip.add(new StringTextComponent(msg2)); tooltip.add(new StringTextComponent(msg3));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
