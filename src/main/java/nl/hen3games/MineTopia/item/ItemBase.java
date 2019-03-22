package nl.hen3games.MineTopia.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nl.hen3games.MineTopia.Common.Main;
import nl.hen3games.MineTopia.library.IHasModel;

/**
 * Created with IntelliJ IDEA.
 * User: gebruiker
 * Date: 22-10-18
 * Time: 1:59
 * To change this template use File | Settings | File Templates.
 */
public class ItemBase extends Item implements IHasModel{

    public ItemBase(String name, CreativeTabs tabs){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);

        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        Main.proxy.registerModel(this, 0);
    }
}
