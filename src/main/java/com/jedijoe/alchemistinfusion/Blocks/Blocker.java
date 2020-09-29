package com.jedijoe.alchemistinfusion.Blocks;

import com.jedijoe.alchemistinfusion.AlchemistInfusion;
import com.jedijoe.alchemistinfusion.Blocks.Momentum.BlockWithLoreBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Blocker extends BlockWithLoreBase {
    public Blocker(String Lore, String Lore2) {
        super(Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5.0f).harvestTool(ToolType.PICKAXE).setRequiresTool());
        if(Lore != ""){ //TODO: ADD CODE FOR DISABLING IN CONFIG
            setLore(Lore);
            if(Lore2 != ""){
                setLore2(Lore2);
            }
        }
    }
}
