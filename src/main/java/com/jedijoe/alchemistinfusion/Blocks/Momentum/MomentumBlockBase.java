package com.jedijoe.alchemistinfusion.Blocks.Momentum;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class MomentumBlockBase extends Block {
    private String Lore = "";
    private String Lore2 = "";
    public MomentumBlockBase(Properties properties) {
            super(properties);
        }

    public void setLore(String lore) { Lore = lore; }
    public String getLore() { return Lore; }
    public void setLore2(String lore2) { Lore2 = lore2; }
    public String getLore2() { return Lore2; }
}
