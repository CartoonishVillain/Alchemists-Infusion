package com.jedijoe.alchemistinfusion.Registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.Blocker;
import com.jedijoe.alchemistinfusion.Blocks.Momentum.FallBreaker;
import com.jedijoe.alchemistinfusion.Blocks.Momentum.MomentumConverter;
import com.jedijoe.alchemistinfusion.Blocks.Momentum.ParticleIce;
import com.jedijoe.alchemistinfusion.Blocks.Potioned.MultiEffect.MobilityStone;
import com.jedijoe.alchemistinfusion.Blocks.Potioned.MultiEffect.SlothStone;
import com.jedijoe.alchemistinfusion.Blocks.Potioned.PrimedPavement;
import com.jedijoe.alchemistinfusion.Blocks.Potioned.SingleEffect.InfusedBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AlchemistInfusion.MOD_ID);

    public static void init(){
    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Non-Potion Blocks
    public static final RegistryObject<Block> FALLBREAKER = BLOCKS.register("fall_breaker", FallBreaker::new);
    public static final RegistryObject<Block> PARTICLEICE = BLOCKS.register("particle_ice", ParticleIce::new);
    public static final RegistryObject<Block> MOMENTUMCONVERTER = BLOCKS.register("momentum_converter", MomentumConverter::new);

    //Blockers
    public static final RegistryObject<Block> INVENTORYBLOCKER = BLOCKS.register("inventory_blocker", () -> new Blocker(TextFormatting.RED + "When stepped on, prevents opening of inventory", ""));
    public static final RegistryObject<Block> TRADEBLOCKER = BLOCKS.register("trade_blocker", () -> new Blocker(TextFormatting.RED + "When stepped on, prevents trade with villagers", ""));
    public static final RegistryObject<Block> CONTAINERBLOCKER = BLOCKS.register("container_blocker", () -> new Blocker(TextFormatting.RED + "When stepped on, prevents the opening of containers", TextFormatting.GRAY + "Modded Container support not guaranteed"));
    public static final RegistryObject<Block> CRAFTINGBLOCKER = BLOCKS.register("crafting_blocker", () -> new Blocker(TextFormatting.RED + "When stepped on, prevents the opening of crafting interfaces", TextFormatting.GRAY + "Modded Crafting interface support not guaranteed"));
    public static final RegistryObject<Block> FULLBLOCKER = BLOCKS.register("full_blocker", () -> new Blocker(TextFormatting.RED + "When stepped on, performs the combined effects of the rest of the blockers", ""));


    //No tier stones
    public static final RegistryObject<Block> PRIMEDPAVEMENT = BLOCKS.register("primed_pavement", PrimedPavement::new);
    public static final RegistryObject<Block> PAVEMENTSTONE = BLOCKS.register("pavement_stone", PrimedPavement::new);

    //tier 1 stones
    public static final RegistryObject<Block> QUICKSTEPSTONE = BLOCKS.register("quickstep_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.SPEED, 1*20, 0), TextFormatting.BLUE, 1));
    public static final RegistryObject<Block> LIGHTSTONE = BLOCKS.register("light_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool().setLightLevel(value -> 9), new EffectInstance(Effects.GLOWING, 7*20, 0), TextFormatting.YELLOW, 1));
    public static final RegistryObject<Block> HOPSTONE = BLOCKS.register("hop_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.JUMP_BOOST, 1*20, 1), TextFormatting.BLUE, 1));
    public static final RegistryObject<Block> DIGGINGSTONE = BLOCKS.register("digging_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.HASTE, 1*20, 0), TextFormatting.BLUE, 1));
    public static final RegistryObject<Block> SLOWSTEPSTONE = BLOCKS.register("slowstep_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.SLOWNESS, 5*20, 0), TextFormatting.RED, 1));
    public static final RegistryObject<Block> SLOWDIGGINGSTONE = BLOCKS.register("slowdigging_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.MINING_FATIGUE, 5*20, 0), TextFormatting.RED, 1));

    //tier 2 stones
    public static final RegistryObject<Block> COWARDLYSTONE = BLOCKS.register("cowardly_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.WEAKNESS, 7*20, 0), TextFormatting.RED, 2));
    public static final RegistryObject<Block> DAZEDSTONE = BLOCKS.register("dazed_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.NAUSEA, 7*20, 0), TextFormatting.RED, 2));
    public static final RegistryObject<Block> FASTSTEPSTONE = BLOCKS.register("faststep_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.SPEED, 2*20, 2), TextFormatting.BLUE, 2));
    public static final RegistryObject<Block> HUNGERSTONE = BLOCKS.register("hunger_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.HUNGER, 7*20, 0), TextFormatting.RED, 2));
    public static final RegistryObject<Block> ILLUMINATIONSTONE = BLOCKS.register("illumination_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool().setLightLevel(value -> 11), new EffectInstance(Effects.GLOWING, 11*20, 0), TextFormatting.YELLOW, 2));
    public static final RegistryObject<Block> JUMPSTONE = BLOCKS.register("jump_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.JUMP_BOOST, 2*20, 2), TextFormatting.BLUE, 2));
    public static final RegistryObject<Block> REDUCEDVISIBILITYSTONE = BLOCKS.register("reducedvisibility_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.BLINDNESS, 7*20, 0), TextFormatting.RED, 2));
    public static final RegistryObject<Block> RESTRICTIVESTONE = BLOCKS.register("restrictive_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.MINING_FATIGUE, 7*20, 1), TextFormatting.RED, 2));
    public static final RegistryObject<Block> SHIELDSTONE = BLOCKS.register("shield_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.RESISTANCE, 2*20, 0), TextFormatting.BLUE, 2));
    public static final RegistryObject<Block> SNAILSTEPSTONE = BLOCKS.register("snailstep_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.SLOWNESS, 7*20, 1), TextFormatting.RED, 2));

    //tier 3 stones
    public static final RegistryObject<Block> BLINDNESSSSTONE = BLOCKS.register("blindness_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.BLINDNESS, 12*20, 2), TextFormatting.RED, 3));
    public static final RegistryObject<Block> BRAVESTONE = BLOCKS.register("brave_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.STRENGTH, 2*20, 0), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> CHICKENSTONE = BLOCKS.register("chicken_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.SLOW_FALLING, 12*20, 0), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> CLOAKSTONE = BLOCKS.register("cloak_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.INVISIBILITY, 6*20, 0), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> FIREPROOFSTONE = BLOCKS.register("fire_proof_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.FIRE_RESISTANCE, 5*20, 0), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> FISHSTONE = BLOCKS.register("fish_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.WATER_BREATHING, 5*20, 0), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> GLOWINGSTONE = BLOCKS.register("glowing_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool().setLightLevel(value -> 13), new EffectInstance(Effects.GLOWING, 15*20, 0), TextFormatting.YELLOW, 3));
    public static final RegistryObject<Block> HASTESTONE = BLOCKS.register("haste_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.HASTE, 2*20, 1), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> LEAPSTONE = BLOCKS.register("leap_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.JUMP_BOOST, 2*20, 3), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> POISONSTONE = BLOCKS.register("poison_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.POISON, 1*20, 0), TextFormatting.RED, 3));
    public static final RegistryObject<Block> RESISTANCESTONE = BLOCKS.register("resistance_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.RESISTANCE, 2*20, 1), TextFormatting.BLUE,3));
    public static final RegistryObject<Block> SPEEDSTEPSTONE = BLOCKS.register("speed_step_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.SPEED, 2*20, 2), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> VISIBILITYSTONE = BLOCKS.register("visibility_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.JUMP_BOOST, 11*20, 0), TextFormatting.BLUE, 3));

    //tier 4 stones
//    public static final RegistryObject<Block> MOBILITYSTONE = BLOCKS.register("mobility_stone", MobilityStone::new);
    public static final RegistryObject<Block> DOLPHINSTONE = BLOCKS.register("dolphin_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new EffectInstance(Effects.DOLPHINS_GRACE, 10*20, 0), TextFormatting.BLUE, 4));
//    public static final RegistryObject<Block> SLOTHSTONE = BLOCKS.register("sloth_stone", SlothStone::new);







}
