package nl.hen3games.MineTopia.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nl.hen3games.MineTopia.block.ModBlock;

/**
 * Created with IntelliJ IDEA.
 * User: gebruiker
 * Date: 22-10-18
 * Time: 3:51
 * To change this template use File | Settings | File Templates.
 */
public class mtblocktab extends CreativeTabs {

    public mtblocktab(String label){
        super("mtblocktab");
    }

    @Override
    public ItemStack getTabIconItem() {return new ItemStack(Item.getItemFromBlock(ModBlock.COSMIC_GLITTER_ORE)); }
}
