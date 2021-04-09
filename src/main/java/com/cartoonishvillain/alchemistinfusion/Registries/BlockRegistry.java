package com.cartoonishvillain.alchemistinfusion.Registries;

import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import com.cartoonishvillain.alchemistinfusion.Blocks.Infusions.ActivatedPavement;
import com.cartoonishvillain.alchemistinfusion.Blocks.Infusions.AttunedPavement;
import com.cartoonishvillain.alchemistinfusion.Blocks.Infusions.CulinaryAttunedPavement;
import com.cartoonishvillain.alchemistinfusion.Blocks.Momentum.FallBreaker;
import com.cartoonishvillain.alchemistinfusion.Blocks.Momentum.MomentumConverter;
import com.cartoonishvillain.alchemistinfusion.Blocks.Infusions.PrimedPavement;
import com.cartoonishvillain.alchemistinfusion.Blocks.Potion.InfusedBlockBase;
import net.minecraft.block.AbstractBlock;
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

import java.util.ArrayList;
import java.util.Arrays;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AlchemistInfusion.MOD_ID);

    public static void init(){
    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Non-Potion Blocks
    public static final RegistryObject<Block> FALLBREAKER = BLOCKS.register("fall_breaker", () -> new FallBreaker(AbstractBlock.Properties.create(Material.WOOL).speedFactor(0.9f).sound(SoundType.CLOTH).hardnessAndResistance(1.0f)));
    public static final RegistryObject<Block> PARTICLEICE = BLOCKS.register("particle_ice", () -> new Block(AbstractBlock.Properties.create(Material.PACKED_ICE).slipperiness(1.15f).sound(SoundType.GLASS).hardnessAndResistance(3.2F).harvestTool(ToolType.PICKAXE).setRequiresTool()));
    public static final RegistryObject<Block> MOMENTUMCONVERTER = BLOCKS.register("momentum_converter", ()-> new MomentumConverter(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(3.2F).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool()));

    //Blockers
    public static final RegistryObject<Block> INVENTORYBLOCKER = BLOCKS.register("inventory_blocker", () -> new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5.0f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
    public static final RegistryObject<Block> TRADEBLOCKER = BLOCKS.register("trade_blocker", () -> new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5.0f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
    public static final RegistryObject<Block> CONTAINERBLOCKER = BLOCKS.register("container_blocker", () -> new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5.0f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
    public static final RegistryObject<Block> CRAFTINGBLOCKER = BLOCKS.register("crafting_blocker", () -> new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5.0f).harvestTool(ToolType.PICKAXE).setRequiresTool()));
    public static final RegistryObject<Block> FULLBLOCKER = BLOCKS.register("full_blocker", () -> new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5.0f).harvestTool(ToolType.PICKAXE).setRequiresTool()));


    //No tier stones
    public static final RegistryObject<Block> PRIMEDPAVEMENT = BLOCKS.register("primed_pavement", PrimedPavement::new);
    public static final RegistryObject<Block> ACTIVATEDPAVEMENT = BLOCKS.register("activated_pavement", ActivatedPavement::new);
    public static final RegistryObject<Block> CULINARYACTIVATEDPAVEMENT = BLOCKS.register("culinary_pavement", CulinaryAttunedPavement::new);
    public static final RegistryObject<Block> ATTUNEDPAVEMENT = BLOCKS.register("attuned_pavement", AttunedPavement::new);
    public static final RegistryObject<Block> PAVEMENTSTONE = BLOCKS.register("pavement_stone", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool()));

    //tier 1 stones
    public static final RegistryObject<Block> QUICKSTEPSTONE = BLOCKS.register("quickstep_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.SPEED, 1*20, 0))), TextFormatting.BLUE, 1));
    public static final RegistryObject<Block> LIGHTSTONE = BLOCKS.register("light_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool().setLightLevel(value -> 9), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.GLOWING, 7*20, 0))), TextFormatting.YELLOW, 1));
    public static final RegistryObject<Block> HOPSTONE = BLOCKS.register("hop_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.JUMP_BOOST, 1*20, 1))), TextFormatting.BLUE, 1));
    public static final RegistryObject<Block> DIGGINGSTONE = BLOCKS.register("digging_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.HASTE, 1*20, 0))), TextFormatting.BLUE, 1));
    public static final RegistryObject<Block> SLOWSTEPSTONE = BLOCKS.register("slowstep_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.SLOWNESS, 5*20, 0))), TextFormatting.RED, 1));
    public static final RegistryObject<Block> SLOWDIGGINGSTONE = BLOCKS.register("slowdigging_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.MINING_FATIGUE, 5*20, 0))), TextFormatting.RED, 1));

    //tier 2 stones
    public static final RegistryObject<Block> COWARDLYSTONE = BLOCKS.register("cowardly_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.WEAKNESS, 7*20, 0))), TextFormatting.RED, 2));
    public static final RegistryObject<Block> DAZEDSTONE = BLOCKS.register("dazed_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.NAUSEA, 7*20, 0))), TextFormatting.RED, 2));
    public static final RegistryObject<Block> FASTSTEPSTONE = BLOCKS.register("faststep_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.SPEED, 2*20, 1))), TextFormatting.BLUE, 2));
    public static final RegistryObject<Block> HUNGERSTONE = BLOCKS.register("hunger_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.HUNGER, 7*20, 0))), TextFormatting.RED, 2));
    public static final RegistryObject<Block> ILLUMINATIONSTONE = BLOCKS.register("illumination_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool().setLightLevel(value -> 11), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.GLOWING, 11*20, 0))), TextFormatting.YELLOW, 2));
    public static final RegistryObject<Block> JUMPSTONE = BLOCKS.register("jump_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.JUMP_BOOST, 2*20, 2))), TextFormatting.BLUE, 2));
    public static final RegistryObject<Block> REDUCEDVISIBILITYSTONE = BLOCKS.register("reducedvisibility_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.BLINDNESS, 7*20, 0))), TextFormatting.RED, 2));
    public static final RegistryObject<Block> RESTRICTIVESTONE = BLOCKS.register("restrictive_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.MINING_FATIGUE, 7*20, 1))), TextFormatting.RED, 2));
    public static final RegistryObject<Block> SHIELDSTONE = BLOCKS.register("shield_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.RESISTANCE, 2*20, 0))), TextFormatting.BLUE, 2));
    public static final RegistryObject<Block> SNAILSTEPSTONE = BLOCKS.register("snailstep_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.SLOWNESS, 7*20, 1))), TextFormatting.RED, 2));

    //tier 3 stones
    public static final RegistryObject<Block> BLINDNESSSSTONE = BLOCKS.register("blindness_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.BLINDNESS, 12*20, 2))), TextFormatting.RED, 3));
    public static final RegistryObject<Block> BRAVESTONE = BLOCKS.register("brave_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.STRENGTH, 2*20, 0))), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> CHICKENSTONE = BLOCKS.register("chicken_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.SLOW_FALLING, 12*20, 0))), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> CLOAKSTONE = BLOCKS.register("cloak_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.INVISIBILITY, 6*20, 0))), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> FIREPROOFSTONE = BLOCKS.register("fire_proof_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.FIRE_RESISTANCE, 5*20, 0))), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> FISHSTONE = BLOCKS.register("fish_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.WATER_BREATHING, 5*20, 0))), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> GLOWINGSTONE = BLOCKS.register("glowing_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool().setLightLevel(value -> 13), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.GLOWING, 15*20, 0))), TextFormatting.YELLOW, 3));
    public static final RegistryObject<Block> HASTESTONE = BLOCKS.register("haste_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.HASTE, 2*20, 1))), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> LEAPSTONE = BLOCKS.register("leap_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.JUMP_BOOST, 2*20, 3))), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> POISONSTONE = BLOCKS.register("poison_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.POISON, 1*20, 0))), TextFormatting.RED, 3));
    public static final RegistryObject<Block> RESISTANCESTONE = BLOCKS.register("resistance_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.RESISTANCE, 2*20, 1))), TextFormatting.BLUE,3));
    public static final RegistryObject<Block> SPEEDSTEPSTONE = BLOCKS.register("speed_step_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.SPEED, 2*20, 2))), TextFormatting.BLUE, 3));
    public static final RegistryObject<Block> VISIBILITYSTONE = BLOCKS.register("visibility_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.NIGHT_VISION, 11*20, 0))), TextFormatting.BLUE, 3));

    //tier 4 stones
    public static final RegistryObject<Block> MOBILITYSTONE = BLOCKS.register("mobility_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.SPEED, 2*20, 2), new EffectInstance(Effects.JUMP_BOOST, 2*20, 3))), TextFormatting.BLUE, 4));
    public static final RegistryObject<Block> DOLPHINSTONE = BLOCKS.register("dolphin_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.DOLPHINS_GRACE, 10*20, 0))), TextFormatting.BLUE, 4));
    public static final RegistryObject<Block> SLOTHSTONE = BLOCKS.register("sloth_stone", () -> new InfusedBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).setRequiresTool(), new ArrayList<EffectInstance>(Arrays.asList(new EffectInstance(Effects.SLOWNESS, 15*20, 2), new EffectInstance(Effects.MINING_FATIGUE, 15*20, 2))), TextFormatting.RED, 4));







}
