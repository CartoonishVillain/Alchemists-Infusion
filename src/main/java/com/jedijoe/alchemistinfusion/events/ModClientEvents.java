package com.jedijoe.alchemistinfusion.events;

import com.jedijoe.alchemistinfusion.Registries.BlockRegistry;
import com.sun.scenario.effect.Effect;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BrewingStandBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraft.client.gui.screen.inventory.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifierManager;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.jedijoe.alchemistinfusion.AlchemistInfusion;


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

