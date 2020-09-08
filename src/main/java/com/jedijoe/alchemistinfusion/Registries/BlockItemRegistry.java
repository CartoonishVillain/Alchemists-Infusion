package com.jedijoe.alchemistinfusion.Registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.BlockItemBase;
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
    public static final RegistryObject<Item> QUICKSTEPSTONE_ITEM = BLOCKITEMS.register("quickstep_stone", () -> new BlockItemBase(BlockRegistry.QUICKSTEPSTONE.get()));
    public static final RegistryObject<Item> LIGHTSTONE_ITEM = BLOCKITEMS.register("light_stone", ()-> new BlockItemBase(BlockRegistry.LIGHTSTONE.get()));
    public static final RegistryObject<Item> HOPSTONE_ITEM = BLOCKITEMS.register("hop_stone", ()-> new BlockItemBase(BlockRegistry.HOPSTONE.get()));
    public static final RegistryObject<Item> DIGGINGSTONE_ITEM = BLOCKITEMS.register("digging_stone", ()-> new BlockItemBase(BlockRegistry.DIGGINGSTONE.get()));
    public static final RegistryObject<Item> SLOWDIGGINGSTONE_ITEM = BLOCKITEMS.register("slowdigging_stone", ()-> new BlockItemBase(BlockRegistry.SLOWDIGGINGSTONE.get()));
    public static final RegistryObject<Item> SLOWSTEPSTONE_ITEM = BLOCKITEMS.register("slowstep_stone", () -> new BlockItemBase(BlockRegistry.SLOWSTEPSTONE.get()));


}
