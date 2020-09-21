package com.jedijoe.alchemistinfusion.Blocks.Momentum;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class MomentumBlockItemBase extends BlockItem {
    Block blocktype;

    public MomentumBlockItemBase(Block block) {
        super(block, new Item.Properties().group(AlchemistInfusion.TAB));
        blocktype = block;
    }

    @Override
    public void addInformation(ItemStack itemStack, @Nullable World world, List<ITextComponent> textComponents, ITooltipFlag tooltipFlag) {
        if(blocktype instanceof MomentumBlockBase){
            if((blocktype instanceof FallBreaker && AlchemistInfusion.config.ENABLEFALLBREAKER.get()) || blocktype instanceof ParticleIce || (blocktype instanceof  MomentumConverter && AlchemistInfusion.config.ENABLEMOMENTUMCONVERTER.get())){
                if(((MomentumBlockBase) blocktype).getLore() != ""){ textComponents.add(new StringTextComponent(((MomentumBlockBase) blocktype).getLore())); }
                if(((MomentumBlockBase) blocktype).getLore2() != ""){ textComponents.add(new StringTextComponent(((MomentumBlockBase) blocktype).getLore2())); }}
            else{textComponents.add(new StringTextComponent(TextFormatting.GRAY + "No effect - disabled in server config")); super.addInformation(itemStack, world, textComponents, tooltipFlag);}
        super.addInformation(itemStack, world, textComponents, tooltipFlag);}
    }
}
