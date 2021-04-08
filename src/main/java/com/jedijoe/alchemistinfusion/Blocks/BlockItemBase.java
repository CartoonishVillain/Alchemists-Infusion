package com.jedijoe.alchemistinfusion.Blocks;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class BlockItemBase extends BlockItem {
    Block blocktype;

    ArrayList<String> Lores;
    public BlockItemBase(Block block, @Nullable ArrayList<String> lores) {
        super(block, new Item.Properties().group(AlchemistInfusion.TAB));
        blocktype = block;
        Lores = lores;
    }

    @Override
    public void addInformation(ItemStack itemStack, @Nullable World world, List<ITextComponent> textComponents, ITooltipFlag tooltipFlag) {
            if(Lores != null){
            for(String string : Lores){textComponents.add(new StringTextComponent(string));}}
        super.addInformation(itemStack, world, textComponents, tooltipFlag);
    }
}
