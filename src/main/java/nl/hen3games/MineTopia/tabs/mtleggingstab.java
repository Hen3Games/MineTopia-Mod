package nl.hen3games.MineTopia.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import nl.hen3games.MineTopia.item.ModItems;

/**
 * Created with IntelliJ IDEA.
 * User: gebruiker
 * Date: 22-10-18
 * Time: 3:50
 * To change this template use File | Settings | File Templates.
 */
public class mtleggingstab extends CreativeTabs {

    public mtleggingstab(String label){
        super("mtleggingstab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.LOGOAK_LEGGINGS);
    }
}
