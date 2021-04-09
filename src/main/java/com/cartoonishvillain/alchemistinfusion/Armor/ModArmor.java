package com.cartoonishvillain.alchemistinfusion.Armor;

import com.cartoonishvillain.alchemistinfusion.Registries.ItemRegistry;
import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmor implements IArmorMaterial {
    LEAP(AlchemistInfusion.MOD_ID + ":leap",  23, new int[] {1, 0, 0, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, ()->{return Ingredient.fromItems(ItemRegistry.LEAPSTONE_GEM.get());}, 0.0f),

    LUCK(AlchemistInfusion.MOD_ID + ":luck",  23, new int[] {1, 0, 0, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, ()->{return Ingredient.fromItems(Items.PACKED_ICE.getItem());}, 0.0f),

     ICE(AlchemistInfusion.MOD_ID + ":ice",  15, new int[] {1, 0, 0, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, ()->{return Ingredient.fromItems(Items.NETHER_WART_BLOCK.getItem());}, 0.0f),

    UNLUCK(AlchemistInfusion.MOD_ID + ":unluck",  23, new int[] {1, 0, 0, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, ()->{return Ingredient.fromItems(Items.NETHER_WART_BLOCK.getItem());}, 0.0f),

    LAVASHELL(AlchemistInfusion.MOD_ID + ":lavashell",  23, new int[] {2, 0, 0, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0, ()->{return Ingredient.fromItems(Items.SCUTE.getItem());}, 0.0f);





    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackres;

    ModArmor(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackres){
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackres = knockbackres;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }


    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }


    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }


    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackres;
    }
}
