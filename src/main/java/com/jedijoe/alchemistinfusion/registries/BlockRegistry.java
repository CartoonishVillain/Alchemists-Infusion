package com.jedijoe.alchemistinfusion.registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AlchemistInfusion.MOD_ID);

    public static void init(){
    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
