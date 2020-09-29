package com.jedijoe.alchemistinfusion.Blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Blocker extends BlockWithLoreBase {
    public Blocker(String Lore, String Lore2) {
        super(Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5.0f).harvestTool(ToolType.PICKAXE).setRequiresTool());
        if(Lore != ""){
            setLore(Lore);
            if(Lore2 != ""){
                setLore2(Lore2);
            }
        }
    }
}
