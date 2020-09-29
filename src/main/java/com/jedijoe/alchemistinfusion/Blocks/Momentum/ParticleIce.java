package com.jedijoe.alchemistinfusion.Blocks.Momentum;


import com.jedijoe.alchemistinfusion.Blocks.BlockWithLoreBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.ToolType;

public class ParticleIce extends BlockWithLoreBase {

    public ParticleIce() {
        super(Properties.create(Material.PACKED_ICE).slipperiness(1.15f).sound(SoundType.GLASS).hardnessAndResistance(3.2F).harvestTool(ToolType.PICKAXE).setRequiresTool());
            setLore(TextFormatting.BLUE + "This block of condensed blue ice can cause rapid");
        setLore2(TextFormatting.BLUE + "acceleration while walking on it.");
    }
}
