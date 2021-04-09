package com.cartoonishvillain.alchemistinfusion.events;

import com.cartoonishvillain.alchemistinfusion.Registries.BlockRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;


@Mod.EventBusSubscriber(modid = AlchemistInfusion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void blockerEvent(GuiOpenEvent event){
        if(event.isCancelable()) {
            if (Minecraft.getInstance().world != null) {
                    PlayerEntity player = Minecraft.getInstance().player;
                    BlockPos pos = player.getPosition().down();
                    int onBlocker = 0;
                    if(player.world.getBlockState(pos).getBlock().equals(BlockRegistry.INVENTORYBLOCKER.get().getBlock())){onBlocker = 1;}
                    else if(player.world.getBlockState(pos).getBlock().equals(BlockRegistry.TRADEBLOCKER.get().getBlock())){onBlocker = 2;}
                    else if(player.world.getBlockState(pos).getBlock().equals(BlockRegistry.CONTAINERBLOCKER.get().getBlock())){onBlocker = 3;}
                    else if(player.world.getBlockState(pos).getBlock().equals(BlockRegistry.CRAFTINGBLOCKER.get().getBlock())){onBlocker = 4;}
                    else if(player.world.getBlockState(pos).getBlock().equals(BlockRegistry.FULLBLOCKER.get().getBlock())){onBlocker = 5;}

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
                            if(event.getGui() instanceof ContainerScreen){event.setCanceled(true);}
                        case 4:
                            if(event.getGui() instanceof AbstractFurnaceScreen || event.getGui() instanceof InventoryScreen || event.getGui() instanceof  AbstractRepairScreen || event.getGui() instanceof  BrewingStandScreen || event.getGui() instanceof CartographyTableScreen || event.getGui() instanceof CraftingScreen || event.getGui() instanceof SmithingTableScreen || event.getGui() instanceof  StonecutterScreen){
                                event.setCanceled(true);}
                            break;
                        case 5:
                            if(event.getGui() instanceof ContainerScreen || event.getGui() instanceof InventoryScreen || event.getGui() instanceof  MerchantScreen || event.getGui() instanceof CraftingScreen){ event.setCanceled(true); }
                            break;
                    }



            }
        }
    }


}

