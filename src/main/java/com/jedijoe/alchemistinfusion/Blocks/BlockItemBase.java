package com.jedijoe.alchemistinfusion.Blocks;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.SingleInfusedBlockBase;
import com.jedijoe.alchemistinfusion.Blocks.SingleEffect.Tier_One.DiggingStone;
import javafx.scene.effect.Effect;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.concurrent.ITaskQueue;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BlockItemBase extends BlockItem {
    Block blocktype = null;
    String msg = "";

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(AlchemistInfusion.TAB)); //basically a constructor for block items
        blocktype = block;
    }
//        if(blocktype instanceof DiggingStone){ msg = TextFormatting.BLUE + "Haste I (0:01)"; }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(blocktype instanceof SingleInfusedBlockBase){
            String effect = ((SingleInfusedBlockBase) blocktype).GetEffect();
            String amplifier = ((SingleInfusedBlockBase) blocktype).GetAmplifier();
            String duration = ((SingleInfusedBlockBase) blocktype).GetDuration();
            msg = effect + " " + amplifier + " " + duration + " when stepped on"; }
        else{msg = TextFormatting.GRAY + "No Effect";}
        tooltip.add(new StringTextComponent(msg));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
