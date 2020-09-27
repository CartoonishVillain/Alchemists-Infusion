package com.jedijoe.alchemistinfusion.Registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.Blocker;
import com.jedijoe.alchemistinfusion.Blocks.Potioned.PotionBlockItemBase;
import com.jedijoe.alchemistinfusion.Blocks.Momentum.MomentumBlockItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockItemRegistry {
    public static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlchemistInfusion.MOD_ID);

    public static void init(){ BLOCKITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); }

    public static final RegistryObject<Item> PRIMEDPAVEMENT_ITEM = BLOCKITEMS.register("primed_pavement", () -> new PotionBlockItemBase(BlockRegistry.PRIMEDPAVEMENT.get()));
    public static final RegistryObject<Item> PAVEMENTSTONE_ITEM = BLOCKITEMS.register("pavement_stone", () -> new PotionBlockItemBase(BlockRegistry.PAVEMENTSTONE.get()));

    public static final RegistryObject<Item> FALLBREAKER_ITEM = BLOCKITEMS.register("fall_breaker", () -> new MomentumBlockItemBase(BlockRegistry.FALLBREAKER.get()));
    public static final RegistryObject<Item> PARTICLEICE_ITEM = BLOCKITEMS.register("particle_ice", () -> new MomentumBlockItemBase(BlockRegistry.PARTICLEICE.get()));
    public static final RegistryObject<Item> MOMENTUMCONVERTER_ITEM = BLOCKITEMS.register("momentum_converter", () -> new MomentumBlockItemBase(BlockRegistry.MOMENTUMCONVERTER.get()));

    public static final RegistryObject<Item> BLOCKER = BLOCKITEMS.register("blocker", () -> new MomentumBlockItemBase(BlockRegistry.BLOCKER.get()));


    public static final RegistryObject<Item> QUICKSTEPSTONE_ITEM = BLOCKITEMS.register("quickstep_stone", () -> new PotionBlockItemBase(BlockRegistry.QUICKSTEPSTONE.get()));
    public static final RegistryObject<Item> LIGHTSTONE_ITEM = BLOCKITEMS.register("light_stone", ()-> new PotionBlockItemBase(BlockRegistry.LIGHTSTONE.get()));
    public static final RegistryObject<Item> HOPSTONE_ITEM = BLOCKITEMS.register("hop_stone", ()-> new PotionBlockItemBase(BlockRegistry.HOPSTONE.get()));
    public static final RegistryObject<Item> DIGGINGSTONE_ITEM = BLOCKITEMS.register("digging_stone", ()-> new PotionBlockItemBase(BlockRegistry.DIGGINGSTONE.get()));
    public static final RegistryObject<Item> SLOWDIGGINGSTONE_ITEM = BLOCKITEMS.register("slowdigging_stone", ()-> new PotionBlockItemBase(BlockRegistry.SLOWDIGGINGSTONE.get()));
    public static final RegistryObject<Item> SLOWSTEPSTONE_ITEM = BLOCKITEMS.register("slowstep_stone", () -> new PotionBlockItemBase(BlockRegistry.SLOWSTEPSTONE.get()));

    public static final RegistryObject<Item> COWARDLYSTONE_ITEM = BLOCKITEMS.register("cowardly_stone",  ()-> new PotionBlockItemBase(BlockRegistry.COWARDLYSTONE.get()));
    public static final RegistryObject<Item> DAZEDSTONE_ITEM = BLOCKITEMS.register("dazed_stone",  ()-> new PotionBlockItemBase(BlockRegistry.DAZEDSTONE.get()));
    public static final RegistryObject<Item> FASTSTEPSTONE_ITEM = BLOCKITEMS.register("faststep_stone",  ()-> new PotionBlockItemBase(BlockRegistry.FASTSTEPSTONE.get()));
    public static final RegistryObject<Item> HUNGERSTONE_ITEM = BLOCKITEMS.register("hunger_stone",  ()-> new PotionBlockItemBase(BlockRegistry.HUNGERSTONE.get()));
    public static final RegistryObject<Item> ILLUMINATIONSTONE_ITEM = BLOCKITEMS.register("illumination_stone",  ()-> new PotionBlockItemBase(BlockRegistry.ILLUMINATIONSTONE.get()));
    public static final RegistryObject<Item> JUMPSTONE_ITEM = BLOCKITEMS.register("jump_stone",  ()-> new PotionBlockItemBase(BlockRegistry.JUMPSTONE.get()));
    public static final RegistryObject<Item> REDUCEDVISIBILITYSTONE_ITEM = BLOCKITEMS.register("reducedvisibility_stone",  ()-> new PotionBlockItemBase(BlockRegistry.REDUCEDVISIBILITYSTONE.get()));
    public static final RegistryObject<Item> RESTRICTIVESTONE_ITEM = BLOCKITEMS.register("restrictive_stone",  ()-> new PotionBlockItemBase(BlockRegistry.RESTRICTIVESTONE.get()));
    public static final RegistryObject<Item> SHIELDSTONE_ITEM = BLOCKITEMS.register("shield_stone",  ()-> new PotionBlockItemBase(BlockRegistry.SHIELDSTONE.get()));
    public static final RegistryObject<Item> SNAILSTEPSTONE_ITEM = BLOCKITEMS.register("snailstep_stone", ()-> new PotionBlockItemBase(BlockRegistry.SNAILSTEPSTONE.get()));

    public static final RegistryObject<Item> BLINDNESSSSTONE_ITEM  = BLOCKITEMS.register("blindness_stone", ()-> new PotionBlockItemBase(BlockRegistry.BLINDNESSSSTONE.get()));
    public static final RegistryObject<Item> BRAVESTONE_ITEM  = BLOCKITEMS.register("brave_stone", ()-> new PotionBlockItemBase(BlockRegistry.BRAVESTONE.get()));
    public static final RegistryObject<Item> CHICKENSTONE_ITEM  = BLOCKITEMS.register("chicken_stone", ()-> new PotionBlockItemBase(BlockRegistry.CHICKENSTONE.get()));
    public static final RegistryObject<Item> CLOAKSTONE_ITEM  = BLOCKITEMS.register("cloak_stone", ()-> new PotionBlockItemBase(BlockRegistry.CLOAKSTONE.get()));
    public static final RegistryObject<Item> FIREPROOFSTONE_ITEM = BLOCKITEMS.register("fire_proof_stone", ()-> new PotionBlockItemBase(BlockRegistry.FIREPROOFSTONE.get()));
    public static final RegistryObject<Item> FISHSTONE_ITEM  = BLOCKITEMS.register("fish_stone", ()-> new PotionBlockItemBase(BlockRegistry.FISHSTONE.get()));
    public static final RegistryObject<Item> GLOWINGSTONE_ITEM  = BLOCKITEMS.register("glowing_stone", ()-> new PotionBlockItemBase(BlockRegistry.GLOWINGSTONE.get()));
    public static final RegistryObject<Item> HASTESTONE_ITEM  = BLOCKITEMS.register("haste_stone", ()-> new PotionBlockItemBase(BlockRegistry.HASTESTONE.get()));
    public static final RegistryObject<Item> LEAPSTONE_ITEM  = BLOCKITEMS.register("leap_stone", ()-> new PotionBlockItemBase(BlockRegistry.LEAPSTONE.get()));
    public static final RegistryObject<Item> POISONSTONE_ITEM  = BLOCKITEMS.register("poison_stone", ()-> new PotionBlockItemBase(BlockRegistry.POISONSTONE.get()));
    public static final RegistryObject<Item> RESISTANCESTONE_ITEM  = BLOCKITEMS.register("resistance_stone", ()-> new PotionBlockItemBase(BlockRegistry.RESISTANCESTONE.get()));
    public static final RegistryObject<Item> SPEEDSTEPSTONE_ITEM  = BLOCKITEMS.register("speed_step_stone", ()-> new PotionBlockItemBase(BlockRegistry.SPEEDSTEPSTONE.get()));
    public static final RegistryObject<Item> VISIBILITYSTONE_ITEM  = BLOCKITEMS.register("visibility_stone", ()-> new PotionBlockItemBase(BlockRegistry.VISIBILITYSTONE.get()));

    public static final RegistryObject<Item> MOBILITYSTONE_ITEM = BLOCKITEMS.register("mobility_stone", ()-> new PotionBlockItemBase(BlockRegistry.MOBILITYSTONE.get()));
    public static final RegistryObject<Item> DOLPHINSTONE = BLOCKITEMS.register("dolphin_stone", ()-> new PotionBlockItemBase(BlockRegistry.DOLPHINSTONE.get()));
    public static final RegistryObject<Item> SLOTHSTONE = BLOCKITEMS.register("sloth_stone", ()-> new PotionBlockItemBase(BlockRegistry.SLOTHSTONE.get()));



}
