package nl.hen3games.MineTopia.block.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CosmicPinkBlock extends BlockBase {
    public CosmicPinkBlock(String name, Material material, CreativeTabs tab) {
        super(name, material, tab);

        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setHarvestLevel("pickaxe", 2);
        setResistance(15);
    }
}
