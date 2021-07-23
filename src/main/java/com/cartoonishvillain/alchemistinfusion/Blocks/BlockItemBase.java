package com.cartoonishvillain.alchemistinfusion.Blocks;

import com.cartoonishvillain.alchemistinfusion.AlchemistInfusion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class BlockItemBase extends BlockItem {
    Block blocktype;

    ArrayList<String> Lores;
    public BlockItemBase(Block block, @Nullable ArrayList<String> lores) {
        super(block, new Item.Properties().tab(AlchemistInfusion.TAB));
        blocktype = block;
        Lores = lores;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level world, List<Component> textComponents, TooltipFlag tooltipFlag) {
            if(Lores != null){
            for(String string : Lores){textComponents.add(new TextComponent(string));}}
        super.appendHoverText(itemStack, world, textComponents, tooltipFlag);
    }
}
