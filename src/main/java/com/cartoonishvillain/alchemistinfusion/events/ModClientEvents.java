package com.cartoonishvillain.alchemistinfusion.events;

import com.cartoonishvillain.alchemistinfusion.Registries.BlockRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;


import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.inventory.BrewingStandScreen;
import net.minecraft.client.gui.screens.inventory.CartographyTableScreen;
import net.minecraft.client.gui.screens.inventory.CraftingScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.ItemCombinerScreen;
import net.minecraft.client.gui.screens.inventory.MerchantScreen;
import net.minecraft.client.gui.screens.inventory.SmithingScreen;
import net.minecraft.client.gui.screens.inventory.StonecutterScreen;

@Mod.EventBusSubscriber(modid = AlchemistInfusion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void blockerEvent(GuiOpenEvent event){
        if(event.isCancelable()) {
            if (Minecraft.getInstance().level != null) {
                    Player player = Minecraft.getInstance().player;
                    BlockPos pos = player.blockPosition().below();
                    int onBlocker = 0;
                    if(player.level.getBlockState(pos).getBlock().equals(BlockRegistry.INVENTORYBLOCKER.get())){onBlocker = 1;}
                    else if(player.level.getBlockState(pos).getBlock().equals(BlockRegistry.TRADEBLOCKER.get())){onBlocker = 2;}
                    else if(player.level.getBlockState(pos).getBlock().equals(BlockRegistry.CONTAINERBLOCKER.get())){onBlocker = 3;}
                    else if(player.level.getBlockState(pos).getBlock().equals(BlockRegistry.CRAFTINGBLOCKER.get())){onBlocker = 4;}
                    else if(player.level.getBlockState(pos).getBlock().equals(BlockRegistry.FULLBLOCKER.get())){onBlocker = 5;}

                    if(AlchemistInfusion.config.ENABLEBLOCKERS.get() == false){onBlocker = 0;}

                    switch (onBlocker){
                        case 0:
                            break;
                        default:
                            break;
                        case 1:
                            if(event.getGui() instanceof InventoryScreen){ event.setCanceled(true);}
                            break;
                        case 2:
                            if(event.getGui() instanceof MerchantScreen){event.setCanceled(true);}
                            break;
                        case 3:
                            if(event.getGui() instanceof AbstractContainerScreen){event.setCanceled(true);}
                        case 4:
                            if(event.getGui() instanceof AbstractFurnaceScreen || event.getGui() instanceof InventoryScreen || event.getGui() instanceof  ItemCombinerScreen || event.getGui() instanceof  BrewingStandScreen || event.getGui() instanceof CartographyTableScreen || event.getGui() instanceof CraftingScreen || event.getGui() instanceof SmithingScreen || event.getGui() instanceof  StonecutterScreen){
                                event.setCanceled(true);}
                            break;
                        case 5:
                            if(event.getGui() instanceof AbstractContainerScreen || event.getGui() instanceof InventoryScreen || event.getGui() instanceof  MerchantScreen || event.getGui() instanceof CraftingScreen){ event.setCanceled(true); }
                            break;
                    }



            }
        }
    }


}

