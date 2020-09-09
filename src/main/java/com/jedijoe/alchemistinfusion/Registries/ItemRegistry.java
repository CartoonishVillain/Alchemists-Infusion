package com.jedijoe.alchemistinfusion.Registries;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Items.ItemBase;
import com.jedijoe.alchemistinfusion.Items.PersistentItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlchemistInfusion.MOD_ID);

    public static void init(){ ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); }

    public static final RegistryObject<Item> PAVEMENTCARVER = ITEMS.register("pavement_carver", PersistentItem::new);

    //Potion Dust
    public static final RegistryObject<Item> SLOWSTEPDUST = ITEMS.register("slowstep_dust", ItemBase::new);
    public static final RegistryObject<Item> SLOWDIGDUST = ITEMS.register("slowdigging_dust", ItemBase::new);
    public static final RegistryObject<Item> DIGDUST = ITEMS.register("digging_dust", ItemBase::new);
    public static final RegistryObject<Item> LIGHTDUST = ITEMS.register("light_dust", ItemBase::new);
    public static final RegistryObject<Item> HOPDUST = ITEMS.register("hop_dust", ItemBase::new);
    public static final RegistryObject<Item> QUICKSTEPDUST = ITEMS.register("quickstep_dust", ItemBase::new);


}
