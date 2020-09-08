package com.jedijoe.alchemistinfusion.Registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.PrimedPavement;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.QuickStepStone;
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

    public static final RegistryObject<Block> PRIMEDPAVEMENT = BLOCKS.register("primed_pavement", PrimedPavement::new);

    public static final RegistryObject<Block> QUICKSTEPSTONE = BLOCKS.register("quickstep_stone", QuickStepStone::new);


}
