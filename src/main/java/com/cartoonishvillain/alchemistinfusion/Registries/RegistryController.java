package com.cartoonishvillain.alchemistinfusion.Registries;

public class RegistryController {

    public static void LaunchItems(){
        //list all registries here with their .init functions
        BlockRegistry.init();
        BlockItemRegistry.init();
        ItemRegistry.init();
    }
}
