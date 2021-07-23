package com.cartoonishvillain.alchemistinfusion.Registries;

import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import com.cartoonishvillain.alchemistinfusion.Blocks.Potion.PotionBlockItemBase;
import com.cartoonishvillain.alchemistinfusion.Blocks.BlockItemBase;
import net.minecraft.world.item.Item;
import net.minecraft.ChatFormatting;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockItemRegistry {
    public static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlchemistInfusion.MOD_ID);

    public static void init(){ BLOCKITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); }

    public static final RegistryObject<Item> PRIMEDPAVEMENT_ITEM = BLOCKITEMS.register("primed_pavement", () -> new BlockItemBase(BlockRegistry.PRIMEDPAVEMENT.get(), new ArrayList<>(Arrays.asList(ChatFormatting.RED + "Tier 1 Alchemical Infusion station", ChatFormatting.GRAY + "Also the base for a majority of blocks!"))));
    public static final RegistryObject<Item> ACTIVATEDPAVEMENT_ITEM = BLOCKITEMS.register("activated_pavement", () -> new BlockItemBase(BlockRegistry.ACTIVATEDPAVEMENT.get(), new ArrayList<>(Arrays.asList(ChatFormatting.BLUE + "Tier 2 Alchemical Infusion station! Use with an Infusion Rod for it's full potential"))));
    public static final RegistryObject<Item> ATTUNEDPAVEMENT_ITEM = BLOCKITEMS.register("attuned_pavement", () -> new BlockItemBase(BlockRegistry.ATTUNEDPAVEMENT.get(), new ArrayList<>(Arrays.asList(ChatFormatting.GREEN + "Tier 3 Alchemical Infusion station! Use with an Attuned Infusion Rod for it's full potential"))));
    public static final RegistryObject<Item> PAVEMENTSTONE_ITEM = BLOCKITEMS.register("pavement_stone", () -> new BlockItemBase(BlockRegistry.PAVEMENTSTONE.get(), null));
    public static final RegistryObject<Item> CULINARY_ITEM = BLOCKITEMS.register("culinary_pavement", () -> new BlockItemBase(BlockRegistry.CULINARYACTIVATEDPAVEMENT.get(), new ArrayList<>(Arrays.asList(ChatFormatting.GOLD + "Tier F Alchemical Infusion station! Used to make imbued food items! Use with the Alchemical Culinary Key!"))));

    public static final RegistryObject<Item> FALLBREAKER_ITEM = BLOCKITEMS.register("fall_breaker", () -> new BlockItemBase(BlockRegistry.FALLBREAKER.get(), new ArrayList<>(AlchemistInfusion.config.ENABLEFALLBREAKER.get() ? Arrays.asList(ChatFormatting.BLUE + "Allows you to fall from high distances and probably survive.. assuming you're not already injured!") : Arrays.asList(ChatFormatting.GRAY + "No effect: Disabled in config"))));
    public static final RegistryObject<Item> PARTICLEICE_ITEM = BLOCKITEMS.register("particle_ice", () -> new BlockItemBase(BlockRegistry.PARTICLEICE.get(), new ArrayList<>(Arrays.asList(ChatFormatting.BLUE + "Tier 2 Momentum Block", ChatFormatting.BLUE + "This block of condensed blue ice can cause rapid acceleration while walking on it."))));
    public static final RegistryObject<Item> MOMENTUMCONVERTER_ITEM = BLOCKITEMS.register("momentum_converter", () -> new BlockItemBase(BlockRegistry.MOMENTUMCONVERTER.get(), new ArrayList<>(AlchemistInfusion.config.ENABLEMOMENTUMCONVERTER.get() ? Arrays.asList(ChatFormatting.GREEN + "Tier 3 Momentum Block", ChatFormatting.BLUE + "Converts horizontal momentum to vertical momentum. You may want a method to prevent fall damage..") : Arrays.asList(ChatFormatting.GRAY + "No effect: Disabled in config"))));

    public static final RegistryObject<Item> INVENTORYBLOCKER_ITEM = BLOCKITEMS.register("inventory_blocker", () -> new BlockItemBase(BlockRegistry.INVENTORYBLOCKER.get(), new ArrayList<>(AlchemistInfusion.config.ENABLEBLOCKERS.get() ? Arrays.asList(ChatFormatting.RED + "When stepped on, prevents opening of inventory") : Arrays.asList(ChatFormatting.GRAY + "No effect: Disabled in config"))));
    public static final RegistryObject<Item> TRADEBLOCKER_ITEM = BLOCKITEMS.register("trade_blocker", () -> new BlockItemBase(BlockRegistry.TRADEBLOCKER.get(), new ArrayList<>(AlchemistInfusion.config.ENABLEBLOCKERS.get() ? Arrays.asList(ChatFormatting.RED + "When stepped on, prevents trade with villagers") : Arrays.asList(ChatFormatting.GRAY + "No effect: Disabled in config"))));
    public static final RegistryObject<Item> CONTAINERBLOCKER_ITEM = BLOCKITEMS.register("container_blocker", () -> new BlockItemBase(BlockRegistry.CONTAINERBLOCKER.get(), new ArrayList<>(AlchemistInfusion.config.ENABLEBLOCKERS.get() ? Arrays.asList(ChatFormatting.RED + "When stepped on, prevents the opening of containers", ChatFormatting.GRAY + "Modded Container support not guaranteed") : Arrays.asList(ChatFormatting.GRAY + "No effect: Disabled in config"))));
    public static final RegistryObject<Item> CRAFTINGBLOCKER_ITEM = BLOCKITEMS.register("crafting_blocker", () -> new BlockItemBase(BlockRegistry.CRAFTINGBLOCKER.get(), new ArrayList<>(AlchemistInfusion.config.ENABLEBLOCKERS.get() ? Arrays.asList(ChatFormatting.RED + "When stepped on, prevents the opening of crafting interfaces", ChatFormatting.GRAY + "Modded Crafting interface support not guaranteed") : Arrays.asList(ChatFormatting.GRAY + "No effect: Disabled in config"))));
    public static final RegistryObject<Item> FULLBLOCKER_ITEM = BLOCKITEMS.register("full_blocker", () -> new BlockItemBase(BlockRegistry.FULLBLOCKER.get(), new ArrayList<>(AlchemistInfusion.config.ENABLEBLOCKERS.get() ? Arrays.asList(ChatFormatting.RED + "When stepped on, performs the combined effects of the rest of the blockers") : Arrays.asList(ChatFormatting.GRAY + "No effect: Disabled in config"))));


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
