package nl.hen3games.MineTopia.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nl.hen3games.MineTopia.Common.Main;
import nl.hen3games.MineTopia.block.blocks.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gebruiker
 * Date: 22-10-18
 * Time: 5:26
 * To change this template use File | Settings | File Templates.
 */
public class ModBlock
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block COSMIC_GLITTER_BLOCK = new CosmicGlitterBlock("cosmic_glitter_block", Material.ROCK, Main.mtblocktab);
    public static final Block COSMIC_GLITTER_ORE = new CosmicGlitterOre("cosmic_glitter_ore", Material.ROCK, Main.mtblocktab);
    public static final Block COSMIC_PINK_BLOCK = new CosmicPinkBlock("cosmic_pink_block", Material.ROCK, Main.mtblocktab);
    public static final Block PINK_COSMIC_BLOCK = new PinkCosmicBlock("pink_cosmic_block", Material.ROCK, Main.mtblocktab);
    public static final Block PINK_COSMIC_GLITTER_BLOCK = new PinkCosmicGlitterBlock("pink_cosmic_glitter_block", Material.ROCK, Main.mtblocktab);
    public static final Block PINK_COSMIC_GLITTER_ORE = new PinkCosmicGlitterOre("pink_cosmic_glitter_ore", Material.ROCK, Main.mtblocktab);
}
