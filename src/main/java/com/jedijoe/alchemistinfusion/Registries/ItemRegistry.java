package com.jedijoe.alchemistinfusion.Registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Armor.*;
import com.jedijoe.alchemistinfusion.Items.AlchemistFoodItems;
import com.jedijoe.alchemistinfusion.Items.KeyItem;
import com.jedijoe.alchemistinfusion.Items.LoreItem;
import com.jedijoe.alchemistinfusion.Items.PersistentItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlchemistInfusion.MOD_ID);

    public static void init(){ ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); }

    public static final RegistryObject<Item> ALCHEMICAL_BOWL  = ITEMS.register("alchemical_bowl", KeyItem::new);
    public static final RegistryObject<Item> ALCHEMICAL_FRAGMENT_CAST  = ITEMS.register("alchemical_fragment_cast", KeyItem::new);
    public static final RegistryObject<Item> ALCHEMICAL_GEM_CAST  = ITEMS.register("alchemical_gem_cast", KeyItem::new);

    //public static final RegistryObject<Item> ALCHEMICAL_INQUIRER = ITEMS.register("alchemical_inquirer", () -> new LoreItem(TextFormatting.YELLOW + "Informs you what tier an infusion station can let you craft to, and how to unlock each one's full potential"));



    public static final RegistryObject<Item> PAVEMENTCARVER = ITEMS.register("pavement_carver", PersistentItem::new);
    public static final RegistryObject<Item> CULINARYKEY = ITEMS.register("alchemical_culinary_key", KeyItem::new);
    public static final RegistryObject<Item> INFUSIONROD = ITEMS.register("infusion_rod", PersistentItem::new);
    public static final RegistryObject<Item> ATTUNEDINFUSIONROD = ITEMS.register("attuned_infusion_rod", PersistentItem::new);
    public static final RegistryObject<Item> BASEFRAGMENT = ITEMS.register("base_shard", () -> new LoreItem(TextFormatting.BLUE + "Tier 2 Base crafting material"));
    public static final RegistryObject<Item> BAGOFSUGAR = ITEMS.register("bag_of_sugar", () -> new Item(new Item.Properties().group(AlchemistInfusion.TAB)));
    public static final RegistryObject<Item> BASE_GEM  = ITEMS.register("base_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3 Base crafting material"));
    public static final RegistryObject<Item> PILEOFFEATHERS = ITEMS.register("pile_of_feathers", () -> new Item(new Item.Properties().group(AlchemistInfusion.TAB)));

    //Potion Dust
    public static final RegistryObject<Item> SLOWSTEPDUST = ITEMS.register("slowstep_dust", () -> new LoreItem(TextFormatting.RED + "Tier 1: Slowing effect when placed in primed pavement"));
    public static final RegistryObject<Item> SLOWDIGDUST = ITEMS.register("slowdigging_dust", () -> new LoreItem(TextFormatting.RED + "Tier 1: Mining Fatigue effect when placed in primed pavement"));
    public static final RegistryObject<Item> DIGDUST = ITEMS.register("digging_dust", () -> new LoreItem(TextFormatting.RED + "Tier 1: Haste effect when placed in primed pavement"));
    public static final RegistryObject<Item> LIGHTDUST = ITEMS.register("light_dust", () -> new LoreItem(TextFormatting.RED + "Tier 1: Glowing effect when placed in primed pavement"));
    public static final RegistryObject<Item> HOPDUST = ITEMS.register("hop_dust", () -> new LoreItem(TextFormatting.RED + "Tier 1: Jump Boost effect when placed in primed pavement"));
    public static final RegistryObject<Item> QUICKSTEPDUST = ITEMS.register("quickstep_dust", () -> new LoreItem(TextFormatting.RED + "Tier 1: Speed effect when placed in primed pavement"));

    //Potion Fragments
    public static final RegistryObject<Item> COWARDLYFRAGMENT = ITEMS.register("cowardly_fragment", () -> new LoreItem(TextFormatting.BLUE + "Tier 2: Weakness effect when placed in primed pavement"));
    public static final RegistryObject<Item> DAZEDFRAGMENT = ITEMS.register("dazed_fragment", () -> new LoreItem(TextFormatting.BLUE + "Tier 2: Nausea effect when placed in primed pavement"));
    public static final RegistryObject<Item> FASTSTEPFRAGMENT = ITEMS.register("faststep_fragment", () -> new LoreItem(TextFormatting.BLUE + "Tier 2: Speed effect when placed in primed pavement"));
    public static final RegistryObject<Item> HUNGERFRAGMENT = ITEMS.register("hunger_fragment", () -> new LoreItem(TextFormatting.BLUE + "Tier 2: Hunger effect when placed in primed pavement"));
    public static final RegistryObject<Item> ILLUMINATIONFRAGMENT = ITEMS.register("illumination_fragment", () -> new LoreItem(TextFormatting.BLUE + "Tier 2: Glowing effect when placed in primed pavement"));
    public static final RegistryObject<Item> JUMPFRAGMENT = ITEMS.register("jump_fragment", () -> new LoreItem(TextFormatting.BLUE + "Tier 2: Jump Boost effect when placed in primed pavement"));
    public static final RegistryObject<Item> REDUCEDVISIBILITYFRAGMENT = ITEMS.register("reducedvisibility_fragment", () -> new LoreItem(TextFormatting.BLUE + "Tier 2: Blindness effect when placed in primed pavement"));
    public static final RegistryObject<Item> RESTRICTIVEFRAGMENT = ITEMS.register("restrictive_fragment", () -> new LoreItem(TextFormatting.BLUE + "Tier 2: Mining Fatigue effect when placed in primed pavement"));
    public static final RegistryObject<Item> SHIELDFRAGMENT = ITEMS.register("shield_fragment", () -> new LoreItem(TextFormatting.BLUE + "Tier 2: Resistance effect when placed in primed pavement"));
    public static final RegistryObject<Item> SNAILSTEPFRAGMENT = ITEMS.register("snailstep_fragment", () -> new LoreItem(TextFormatting.BLUE + "Tier 2: Slowness effect when placed in primed pavement"));

    //Potion Gems
    public static final RegistryObject<Item> BLINDNESSSSTONE_GEM  = ITEMS.register("blindness_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Blindness effect when placed in primed pavement"));
    public static final RegistryObject<Item> BRAVESTONE_GEM = ITEMS.register("brave_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Strength effect when placed in primed pavement"));
    public static final RegistryObject<Item> CHICKENSTONE_GEM  = ITEMS.register("chicken_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Slow Falling effect when placed in primed pavement"));
    public static final RegistryObject<Item> CLOAKSTONE_GEM = ITEMS.register("cloak_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Invisibility effect when placed in primed pavement"));
    public static final RegistryObject<Item> GLOWINGSTONE_GEM  = ITEMS.register("glowing_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Glowing effect when placed in primed pavement"));
    public static final RegistryObject<Item> HASTESTONE_GEM  = ITEMS.register("haste_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Haste effect when placed in primed pavement"));
    public static final RegistryObject<Item> LEAPSTONE_GEM  = ITEMS.register("leap_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Jump Boost effect when placed in primed pavement"));
    public static final RegistryObject<Item> POISONSTONE_GEM = ITEMS.register("poison_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Poison effect when placed in primed pavement"));
    public static final RegistryObject<Item> RESISTANCESTONE_GEM  = ITEMS.register("resistance_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Resistance effect when placed in primed pavement"));
    public static final RegistryObject<Item> SPEEDSTEPSTONE_GEM  = ITEMS.register("speed_step_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Speed effect when placed in primed pavement"));
    public static final RegistryObject<Item> VISIBILITYSTONE_GEM  = ITEMS.register("visibility_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Night Vision effect when placed in primed pavement"));

    //Potion gems used for testing
    public static final RegistryObject<Item> FIREPROOFSTONE_GEM = ITEMS.register("fire_proof_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Fire Resistance effect when placed in primed pavement"));
    public static final RegistryObject<Item> FISHSTONE_GEM  = ITEMS.register("fish_gem", () -> new LoreItem(TextFormatting.GREEN + "Tier 3: Water Breathing effect when placed in primed pavement"));


    //Infused Food
    public static final RegistryObject<AlchemistFoodItems> VISIONCARROT  = ITEMS.register("vision_carrot", () -> new AlchemistFoodItems(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder().hunger(6).saturation(14.4f).effect(() -> new EffectInstance(Effects.NIGHT_VISION, 20*AlchemistInfusion.config.VISIONCARROTDURATION.get(), 0), 1.0f).effect(() -> new EffectInstance(Effects.INVISIBILITY, 20*AlchemistInfusion.config.VISIONCARROTDURATION2.get(), 0), 0.2f).effect(() -> new EffectInstance(Effects.GLOWING, 20*AlchemistInfusion.config.VISIONCARROTDURATION3.get(), 0), 0.1f).setAlwaysEdible().build()), new ArrayList<>(Arrays.asList(new EffectInstance(Effects.NIGHT_VISION, 20*AlchemistInfusion.config.VISIONCARROTDURATION.get(), 0))), new ArrayList<>(Arrays.asList(TextFormatting.BLUE, TextFormatting.GRAY)), new ArrayList<>(Arrays.asList("May produce visual anomalies"))));
    public static final RegistryObject<AlchemistFoodItems> PRODUCTIVEPOTATO  = ITEMS.register("productive_potato", () -> new AlchemistFoodItems(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder().hunger(5).saturation(6).effect(() -> new EffectInstance(Effects.HASTE, 20*AlchemistInfusion.config.PRODUCTIVEPOTATODURATION.get(), 0), 1.0f).setAlwaysEdible().build()), new ArrayList<>(Arrays.asList(new EffectInstance(Effects.HASTE, 20*AlchemistInfusion.config.PRODUCTIVEPOTATODURATION.get(), 0))), new ArrayList<>(Arrays.asList(TextFormatting.BLUE)), null));
    public static final RegistryObject<AlchemistFoodItems> SUGARSTICK  = ITEMS.register("sugar_stick", () -> new AlchemistFoodItems(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder().hunger(1).saturation(1).fastToEat().effect(() -> new EffectInstance(Effects.SPEED, 20*AlchemistInfusion.config.SUGARSTICKDURATION.get(), 0), 1.0f).effect(()-> new EffectInstance(Effects.NAUSEA, 20*AlchemistInfusion.config.SUGARSTICKDURATION2.get(), 1), 0.15f).setAlwaysEdible().build()), new ArrayList<>(Arrays.asList(new EffectInstance(Effects.SPEED, 20*AlchemistInfusion.config.SUGARSTICKDURATION.get(), 0))), new ArrayList<>(Arrays.asList(TextFormatting.BLUE, TextFormatting.RED)), new ArrayList<>(Arrays.asList("May make you sick"))));
    public static final RegistryObject<AlchemistFoodItems> SPICYBEETROOT  = ITEMS.register("spicy_beetroot", () -> new AlchemistFoodItems(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder().hunger(1).saturation(1.2f).effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 20*AlchemistInfusion.config.SPICYBEETROOTDURATION.get(), 0), 1.0f).setAlwaysEdible().build()), new ArrayList<>(Arrays.asList(new EffectInstance(Effects.FIRE_RESISTANCE, 20*AlchemistInfusion.config.SPICYBEETROOTDURATION.get(), 0))), new ArrayList<>(Arrays.asList(TextFormatting.BLUE)), null));
    public static final RegistryObject<AlchemistFoodItems> IRONSTEAK = ITEMS.register("iron_steak", () -> new AlchemistFoodItems(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder().hunger(8).saturation(12.8f).effect(() -> new EffectInstance(Effects.RESISTANCE, 20*AlchemistInfusion.config.IRONSTEAKDURATION.get(), 1), 1.0f).effect(() -> new EffectInstance(Effects.SLOWNESS, 20*AlchemistInfusion.config.IRONSTEAKDURATION2.get(), 0), 1.0f).meat().setAlwaysEdible().build()), new ArrayList<>(Arrays.asList(new EffectInstance(Effects.RESISTANCE, 20*AlchemistInfusion.config.IRONSTEAKDURATION.get(), 1), new EffectInstance(Effects.SLOWNESS, 20*AlchemistInfusion.config.IRONSTEAKDURATION2.get(), 0))), new ArrayList<>(Arrays.asList(TextFormatting.BLUE, TextFormatting.RED)), null));
    public static final RegistryObject<AlchemistFoodItems> HOPPINGRABBIT  = ITEMS.register("hopping_rabbit", () -> new AlchemistFoodItems(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder().hunger(5).saturation(6).effect(() -> new EffectInstance(Effects.JUMP_BOOST, 20*AlchemistInfusion.config.PRODUCTIVEPOTATODURATION.get(), 2), 1.0f).meat().setAlwaysEdible().build()), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.JUMP_BOOST, 20*AlchemistInfusion.config.PRODUCTIVEPOTATODURATION.get(), 2))), new ArrayList<>(Arrays.asList(TextFormatting.BLUE)), null));
    public static final RegistryObject<AlchemistFoodItems> IMBUEDRABBITSTEW = ITEMS.register("imbued_rabbit_stew", () -> new AlchemistFoodItems(new Item.Properties().group(AlchemistInfusion.TAB).food(new Food.Builder().hunger(10).saturation(12f).effect(() -> new EffectInstance(Effects.JUMP_BOOST, 20*AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION.get(), 2), 1.0f).effect(() -> new EffectInstance(Effects.HASTE, 20*AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION2.get(), 0), 1.0f).effect(() -> new EffectInstance(Effects.NIGHT_VISION, 20*AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION2.get(), 0), 1.0f).effect(() -> new EffectInstance(Effects.STRENGTH, 20*AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION3.get(), 0), 0.45f).meat().setAlwaysEdible().build()), new ArrayList<>(Arrays.asList(new EffectInstance(Effects.JUMP_BOOST, 20*AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION.get(), 2), new EffectInstance(Effects.HASTE, 20*AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION2.get(), 0), new EffectInstance(Effects.NIGHT_VISION, 20*AlchemistInfusion.config.IMBUEDRABBITSTEWDURATION2.get()))),  new ArrayList<>(Arrays.asList(TextFormatting.BLUE, TextFormatting.BLUE, TextFormatting.BLUE, TextFormatting.BLUE)), new ArrayList<>(Arrays.asList("A great meal for those trying to get by in the mines"))));

    //Infused Armor
    public static final RegistryObject<ArmorItem> LEAP_BOOTS = ITEMS.register("leap_boots", () -> new Leap(ModArmor.LEAP, EquipmentSlotType.FEET, new Item.Properties().group(AlchemistInfusion.TAB)));
    public static final RegistryObject<ArmorItem> LUCK_BOOTS = ITEMS.register("luck_boots", () -> new Luck(ModArmor.LUCK, EquipmentSlotType.FEET, new Item.Properties().group(AlchemistInfusion.TAB)));
    public static final RegistryObject<ArmorItem> UNLUCK_BOOTS = ITEMS.register("unluck_boots", () -> new Unluck(ModArmor.UNLUCK, EquipmentSlotType.FEET, new Item.Properties().group(AlchemistInfusion.TAB)));
    public static final RegistryObject<ArmorItem> ICE_BOOTS = ITEMS.register("ice_boots", () -> new Ice(ModArmor.ICE, EquipmentSlotType.FEET, new Item.Properties().group(AlchemistInfusion.TAB)));




}
