package com.jedijoe.alchemistinfusion.Registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Armor.Leap;
import com.jedijoe.alchemistinfusion.Armor.Luck;
import com.jedijoe.alchemistinfusion.Armor.ModArmor;
import com.jedijoe.alchemistinfusion.Armor.Unluck;
import com.jedijoe.alchemistinfusion.Items.ItemBase;
import com.jedijoe.alchemistinfusion.Items.PersistentItem;
import com.jedijoe.alchemistinfusion.Items.foods.ProductivePotato;
import com.jedijoe.alchemistinfusion.Items.foods.VisionCarrot;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlchemistInfusion.MOD_ID);

    public static void init(){ ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); }

    public static final RegistryObject<Item> PAVEMENTCARVER = ITEMS.register("pavement_carver", PersistentItem::new);
    public static final RegistryObject<Item> INFUSIONROD = ITEMS.register("infusion_rod", PersistentItem::new);
    public static final RegistryObject<Item> BASEFRAGMENT = ITEMS.register("base_shard", ItemBase::new);
    public static final RegistryObject<Item> BAGOFSUGAR = ITEMS.register("bag_of_sugar", ItemBase::new);
    public static final RegistryObject<Item> BASE_GEM  = ITEMS.register("base_gem", ItemBase::new);
    public static final RegistryObject<Item> PILEOFFEATHERS = ITEMS.register("pile_of_feathers", ItemBase::new);

    //Potion Dust
    public static final RegistryObject<Item> SLOWSTEPDUST = ITEMS.register("slowstep_dust", ItemBase::new);
    public static final RegistryObject<Item> SLOWDIGDUST = ITEMS.register("slowdigging_dust", ItemBase::new);
    public static final RegistryObject<Item> DIGDUST = ITEMS.register("digging_dust", ItemBase::new);
    public static final RegistryObject<Item> LIGHTDUST = ITEMS.register("light_dust", ItemBase::new);
    public static final RegistryObject<Item> HOPDUST = ITEMS.register("hop_dust", ItemBase::new);
    public static final RegistryObject<Item> QUICKSTEPDUST = ITEMS.register("quickstep_dust", ItemBase::new);

    //Potion Fragments
    public static final RegistryObject<Item> COWARDLYFRAGMENT = ITEMS.register("cowardly_fragment", ItemBase::new);
    public static final RegistryObject<Item> DAZEDFRAGMENT = ITEMS.register("dazed_fragment", ItemBase::new);
    public static final RegistryObject<Item> FASTSTEPFRAGMENT = ITEMS.register("faststep_fragment", ItemBase::new);
    public static final RegistryObject<Item> HUNGERFRAGMENT = ITEMS.register("hunger_fragment", ItemBase::new);
    public static final RegistryObject<Item> ILLUMINATIONFRAGMENT = ITEMS.register("illumination_fragment", ItemBase::new);
    public static final RegistryObject<Item> JUMPFRAGMENT = ITEMS.register("jump_fragment", ItemBase::new);
    public static final RegistryObject<Item> REDUCEDVISIBILITYFRAGMENT = ITEMS.register("reducedvisibility_fragment", ItemBase::new);
    public static final RegistryObject<Item> RESTRICTIVEFRAGMENT = ITEMS.register("restrictive_fragment", ItemBase::new);
    public static final RegistryObject<Item> SHIELDFRAGMENT = ITEMS.register("shield_fragment", ItemBase::new);
    public static final RegistryObject<Item> SNAILSTEPFRAGMENT = ITEMS.register("snailstep_fragment", ItemBase::new);

    //Potion Gems
    public static final RegistryObject<Item> BLINDNESSSSTONE_GEM  = ITEMS.register("blindness_gem", ItemBase::new);
    public static final RegistryObject<Item> BRAVESTONE_GEM = ITEMS.register("brave_gem", ItemBase::new);
    public static final RegistryObject<Item> CHICKENSTONE_GEM  = ITEMS.register("chicken_gem", ItemBase::new);
    public static final RegistryObject<Item> CLOAKSTONE_GEM = ITEMS.register("cloak_gem", ItemBase::new);
    public static final RegistryObject<Item> FIREPROOFSTONE_GEM = ITEMS.register("fire_proof_gem", ItemBase::new);
    public static final RegistryObject<Item> FISHSTONE_GEM  = ITEMS.register("fish_gem", ItemBase::new);
    public static final RegistryObject<Item> GLOWINGSTONE_GEM  = ITEMS.register("glowing_gem", ItemBase::new);
    public static final RegistryObject<Item> HASTESTONE_GEM  = ITEMS.register("haste_gem", ItemBase::new);
    public static final RegistryObject<Item> LEAPSTONE_GEM  = ITEMS.register("leap_gem", ItemBase::new);
    public static final RegistryObject<Item> POISONSTONE_GEM = ITEMS.register("poison_gem", ItemBase::new);
    public static final RegistryObject<Item> RESISTANCESTONE_GEM  = ITEMS.register("resistance_gem", ItemBase::new);
    public static final RegistryObject<Item> SPEEDSTEPSTONE_GEM  = ITEMS.register("speed_step_gem", ItemBase::new);
    public static final RegistryObject<Item> VISIBILITYSTONE_GEM  = ITEMS.register("visibility_gem", ItemBase::new);

    //Infused Food
    public static final RegistryObject<VisionCarrot> VISIONCARROT  = ITEMS.register("vision_carrot", VisionCarrot::new);
    public static final RegistryObject<ProductivePotato> PRODUCTIVEPOTATO  = ITEMS.register("productive_potato", ProductivePotato::new);

    //Infused Armor
    public static final RegistryObject<ArmorItem> LEAP_BOOTS = ITEMS.register("leap_boots", () -> new Leap(ModArmor.LEAP, EquipmentSlotType.FEET, new Item.Properties().group(AlchemistInfusion.TAB)));
    public static final RegistryObject<ArmorItem> LUCK_BOOTS = ITEMS.register("luck_boots", () -> new Luck(ModArmor.LUCK, EquipmentSlotType.FEET, new Item.Properties().group(AlchemistInfusion.TAB)));
    public static final RegistryObject<ArmorItem> UNLUCK_BOOTS = ITEMS.register("unluck_boots", () -> new Unluck(ModArmor.UNLUCK, EquipmentSlotType.FEET, new Item.Properties().group(AlchemistInfusion.TAB)));




}
