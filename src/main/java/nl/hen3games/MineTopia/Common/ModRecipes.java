package nl.hen3games.MineTopia.Common;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nl.hen3games.MineTopia.block.ModBlock;
import nl.hen3games.MineTopia.gen.oreGen;
import nl.hen3games.MineTopia.item.ModItems;

/**
 * Created with IntelliJ IDEA.
 * User: brugg
 * Date: 19-2-19
 * Time: 15:00
 * To change this template use File | Settings | File Templates.
 */
public class ModRecipes {

    public static void init(){
        GameRegistry.addSmelting(ModBlock.COSMIC_GLITTER_ORE, new ItemStack(ModItems.COSMIC_GLITTER_INGOT, 1), 1.5f);
        GameRegistry.addSmelting(ModBlock.PINK_COSMIC_GLITTER_ORE, new ItemStack(ModItems.PINK_COSMIC_GLITTER_INGOT, 1), 1.5f);

        GameRegistry.registerWorldGenerator(new oreGen(), 0);
    }
}
