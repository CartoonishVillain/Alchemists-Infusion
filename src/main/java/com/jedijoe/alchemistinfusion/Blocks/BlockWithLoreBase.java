package com.jedijoe.alchemistinfusion.Blocks;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class BlockWithLoreBase extends Block {
    private String Lore = "";
    private String Lore2 = "";
    public BlockWithLoreBase(Properties properties) {
            super(properties);
        }

    public void setLore(String lore) { Lore = lore; }
    public String getLore() { return Lore; }
    public void setLore2(String lore2) { Lore2 = lore2; }
    public String getLore2() { return Lore2; }
}
