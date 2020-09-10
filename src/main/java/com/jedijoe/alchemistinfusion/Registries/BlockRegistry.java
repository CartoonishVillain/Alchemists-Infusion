package com.jedijoe.alchemistinfusion.Registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.PrimedPavement;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_One.*;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_Two.*;
import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AlchemistInfusion.MOD_ID);

    public static void init(){
    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //No tier stones
    public static final RegistryObject<Block> PRIMEDPAVEMENT = BLOCKS.register("primed_pavement", PrimedPavement::new);
    public static final RegistryObject<Block> PAVEMENTSTONE = BLOCKS.register("pavement_stone", PrimedPavement::new);

    //tier 1 stones
    public static final RegistryObject<Block> QUICKSTEPSTONE = BLOCKS.register("quickstep_stone", QuickStepStone::new);
    public static final RegistryObject<Block> LIGHTSTONE = BLOCKS.register("light_stone", LightStone::new);
    public static final RegistryObject<Block> HOPSTONE = BLOCKS.register("hop_stone", HopStone::new);
    public static final RegistryObject<Block> DIGGINGSTONE = BLOCKS.register("digging_stone", DiggingStone::new);
    public static final RegistryObject<Block> SLOWSTEPSTONE = BLOCKS.register("slowstep_stone", SlowStepStone::new);
    public static final RegistryObject<Block> SLOWDIGGINGSTONE = BLOCKS.register("slowdigging_stone", SlowDiggingStone::new);

    //tier 2 stones
    public static final RegistryObject<Block> COWARDLYSTONE = BLOCKS.register("cowardly_stone", CowardlyStone::new);
    public static final RegistryObject<Block> DAZEDSTONE = BLOCKS.register("dazed_stone", DazedStone::new);
    public static final RegistryObject<Block> FASTSTEPSTONE = BLOCKS.register("faststep_stone", FastStepStone::new);
    public static final RegistryObject<Block> HUNGERSTONE = BLOCKS.register("hunger_stone", HungerStone::new);
    public static final RegistryObject<Block> ILLUMINATIONSTONE = BLOCKS.register("illumination_stone", IlluminationStone::new);
    public static final RegistryObject<Block> JUMPSTONE = BLOCKS.register("jump_stone", JumpStone::new);
    public static final RegistryObject<Block> REDUCEDVISIBILITYSTONE = BLOCKS.register("reducedvisibility_stone", ReducedVisibilityStone::new);
    public static final RegistryObject<Block> RESTRICTIVESTONE = BLOCKS.register("restrictive_stone", RestrictiveStone::new);
    public static final RegistryObject<Block> SHIELDSTONE = BLOCKS.register("shield_stone", ShieldStone::new);
    public static final RegistryObject<Block> SNAILSTEPSTONE = BLOCKS.register("snailstep_stone", SnailStepStone::new);





}
