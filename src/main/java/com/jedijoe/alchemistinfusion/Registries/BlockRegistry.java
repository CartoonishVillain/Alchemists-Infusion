package com.jedijoe.alchemistinfusion.Registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.MultiEffect.MobilityStone;
import com.jedijoe.alchemistinfusion.Blocks.MultiEffect.SlothStone;
import com.jedijoe.alchemistinfusion.Blocks.PrimedPavement;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.DolphinStone;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_One.*;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_Three.*;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_Two.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
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

    //tier 3 stones
    public static final RegistryObject<Block> BLINDNESSSSTONE = BLOCKS.register("blindness_stone", BlindnessStone::new);
    public static final RegistryObject<Block> BRAVESTONE = BLOCKS.register("brave_stone", BraveStone::new);
    public static final RegistryObject<Block> CHICKENSTONE = BLOCKS.register("chicken_stone", ChickenStone::new);
    public static final RegistryObject<Block> CLOAKSTONE = BLOCKS.register("cloak_stone", CloakStone::new);
    public static final RegistryObject<Block> FIREPROOFSTONE = BLOCKS.register("fire_proof_stone", FireProofStone::new);
    public static final RegistryObject<Block> FISHSTONE = BLOCKS.register("fish_stone", FishStone::new);
    public static final RegistryObject<Block> GLOWINGSTONE = BLOCKS.register("glowing_stone", GlowingStone::new);
    public static final RegistryObject<Block> HASTESTONE = BLOCKS.register("haste_stone", HasteStone::new);
    public static final RegistryObject<Block> LEAPSTONE = BLOCKS.register("leap_stone", LeapStone::new);
    public static final RegistryObject<Block> POISONSTONE = BLOCKS.register("poison_stone", PoisonStone::new);
    public static final RegistryObject<Block> RESISTANCESTONE = BLOCKS.register("resistance_stone", ResistanceStone::new);
    public static final RegistryObject<Block> SPEEDSTEPSTONE = BLOCKS.register("speed_step_stone", SpeedStepStone::new);
    public static final RegistryObject<Block> VISIBILITYSTONE = BLOCKS.register("visibility_stone", VisibilityStone::new);

    //tier 4 stones
    public static final RegistryObject<Block> MOBILITYSTONE = BLOCKS.register("mobility_stone", MobilityStone::new);
    public static final RegistryObject<Block> DOLPHINSTONE = BLOCKS.register("dolphin_stone", DolphinStone::new);
    public static final RegistryObject<Block> SLOTHSTONE = BLOCKS.register("sloth_stone", SlothStone::new);







}
