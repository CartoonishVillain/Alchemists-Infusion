package com.jedijoe.alchemistinfusion.Registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.BlockItemBase;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_Three.*;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_Two.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockItemRegistry {
    public static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlchemistInfusion.MOD_ID);

    public static void init(){ BLOCKITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); }

    public static final RegistryObject<Item> PRIMEDPAVEMENT_ITEM = BLOCKITEMS.register("primed_pavement", () -> new BlockItemBase(BlockRegistry.PRIMEDPAVEMENT.get()));
    public static final RegistryObject<Item> PAVEMENTSTONE_ITEM = BLOCKITEMS.register("pavement_stone", () -> new BlockItemBase(BlockRegistry.PAVEMENTSTONE.get()));
    public static final RegistryObject<Item> QUICKSTEPSTONE_ITEM = BLOCKITEMS.register("quickstep_stone", () -> new BlockItemBase(BlockRegistry.QUICKSTEPSTONE.get()));
    public static final RegistryObject<Item> LIGHTSTONE_ITEM = BLOCKITEMS.register("light_stone", ()-> new BlockItemBase(BlockRegistry.LIGHTSTONE.get()));
    public static final RegistryObject<Item> HOPSTONE_ITEM = BLOCKITEMS.register("hop_stone", ()-> new BlockItemBase(BlockRegistry.HOPSTONE.get()));
    public static final RegistryObject<Item> DIGGINGSTONE_ITEM = BLOCKITEMS.register("digging_stone", ()-> new BlockItemBase(BlockRegistry.DIGGINGSTONE.get()));
    public static final RegistryObject<Item> SLOWDIGGINGSTONE_ITEM = BLOCKITEMS.register("slowdigging_stone", ()-> new BlockItemBase(BlockRegistry.SLOWDIGGINGSTONE.get()));
    public static final RegistryObject<Item> SLOWSTEPSTONE_ITEM = BLOCKITEMS.register("slowstep_stone", () -> new BlockItemBase(BlockRegistry.SLOWSTEPSTONE.get()));

    public static final RegistryObject<Item> COWARDLYSTONE_ITEM = BLOCKITEMS.register("cowardly_stone",  ()-> new BlockItemBase(BlockRegistry.COWARDLYSTONE.get()));
    public static final RegistryObject<Item> DAZEDSTONE_ITEM = BLOCKITEMS.register("dazed_stone",  ()-> new BlockItemBase(BlockRegistry.DAZEDSTONE.get()));
    public static final RegistryObject<Item> FASTSTEPSTONE_ITEM = BLOCKITEMS.register("faststep_stone",  ()-> new BlockItemBase(BlockRegistry.FASTSTEPSTONE.get()));
    public static final RegistryObject<Item> HUNGERSTONE_ITEM = BLOCKITEMS.register("hunger_stone",  ()-> new BlockItemBase(BlockRegistry.HUNGERSTONE.get()));
    public static final RegistryObject<Item> ILLUMINATIONSTONE_ITEM = BLOCKITEMS.register("illumination_stone",  ()-> new BlockItemBase(BlockRegistry.ILLUMINATIONSTONE.get()));
    public static final RegistryObject<Item> JUMPSTONE_ITEM = BLOCKITEMS.register("jump_stone",  ()-> new BlockItemBase(BlockRegistry.JUMPSTONE.get()));
    public static final RegistryObject<Item> REDUCEDVISIBILITYSTONE_ITEM = BLOCKITEMS.register("reducedvisibility_stone",  ()-> new BlockItemBase(BlockRegistry.REDUCEDVISIBILITYSTONE.get()));
    public static final RegistryObject<Item> RESTRICTIVESTONE_ITEM = BLOCKITEMS.register("restrictive_stone",  ()-> new BlockItemBase(BlockRegistry.RESTRICTIVESTONE.get()));
    public static final RegistryObject<Item> SHIELDSTONE_ITEM = BLOCKITEMS.register("shield_stone",  ()-> new BlockItemBase(BlockRegistry.SHIELDSTONE.get()));
    public static final RegistryObject<Item> SNAILSTEPSTONE_ITEM = BLOCKITEMS.register("snailstep_stone", ()-> new BlockItemBase(BlockRegistry.SNAILSTEPSTONE.get()));

    public static final RegistryObject<Item> BLINDNESSSSTONE_ITEM  = BLOCKITEMS.register("blindness_stone", ()-> new BlockItemBase(BlockRegistry.BLINDNESSSSTONE.get()));
    public static final RegistryObject<Item> BRAVESTONE_ITEM  = BLOCKITEMS.register("brave_stone", ()-> new BlockItemBase(BlockRegistry.BRAVESTONE.get()));
    public static final RegistryObject<Item> CHICKENSTONE_ITEM  = BLOCKITEMS.register("chicken_stone", ()-> new BlockItemBase(BlockRegistry.CHICKENSTONE.get()));
    public static final RegistryObject<Item> CLOAKSTONE_ITEM  = BLOCKITEMS.register("cloak_stone", ()-> new BlockItemBase(BlockRegistry.CLOAKSTONE.get()));
    public static final RegistryObject<Item> FIREPROOFSTONE_ITEM = BLOCKITEMS.register("fire_proof_stone", ()-> new BlockItemBase(BlockRegistry.FIREPROOFSTONE.get()));
    public static final RegistryObject<Item> FISHSTONE_ITEM  = BLOCKITEMS.register("fish_stone", ()-> new BlockItemBase(BlockRegistry.FISHSTONE.get()));
    public static final RegistryObject<Item> GLOWINGSTONE_ITEM  = BLOCKITEMS.register("glowing_stone", ()-> new BlockItemBase(BlockRegistry.GLOWINGSTONE.get()));
    public static final RegistryObject<Item> HASTESTONE_ITEM  = BLOCKITEMS.register("haste_stone", ()-> new BlockItemBase(BlockRegistry.HASTESTONE.get()));
    public static final RegistryObject<Item> LEAPSTONE_ITEM  = BLOCKITEMS.register("leap_stone", ()-> new BlockItemBase(BlockRegistry.LEAPSTONE.get()));
    public static final RegistryObject<Item> POISONSTONE_ITEM  = BLOCKITEMS.register("poison_stone", ()-> new BlockItemBase(BlockRegistry.POISONSTONE.get()));
    public static final RegistryObject<Item> RESISTANCESTONE_ITEM  = BLOCKITEMS.register("resistance_stone", ()-> new BlockItemBase(BlockRegistry.RESISTANCESTONE.get()));
    public static final RegistryObject<Item> SPEEDSTEPSTONE_ITEM  = BLOCKITEMS.register("speed_step_stone", ()-> new BlockItemBase(BlockRegistry.SPEEDSTEPSTONE.get()));
    public static final RegistryObject<Item> VISIBILITYSTONE_ITEM  = BLOCKITEMS.register("visibility_stone", ()-> new BlockItemBase(BlockRegistry.VISIBILITYSTONE.get()));


}
