package com.jedijoe.alchemistinfusion.Registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.PrimedPavement;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_One.*;
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





}
