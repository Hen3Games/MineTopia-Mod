package nl.hen3games.MineTopia.block.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created with IntelliJ IDEA.
 * User: brugg
 * Date: 19-2-19
 * Time: 15:17
 * To change this template use File | Settings | File Templates.
 */
public class CosmicGlitterOre extends BlockBase {
    public CosmicGlitterOre(String name, Material material, CreativeTabs tab) {
        super(name, material, tab);

        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setHarvestLevel("pickaxe", 2);
        setResistance(15);
    }
}
