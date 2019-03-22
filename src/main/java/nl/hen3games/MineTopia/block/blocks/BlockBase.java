package nl.hen3games.MineTopia.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import nl.hen3games.MineTopia.Common.Main;
import nl.hen3games.MineTopia.block.ModBlock;
import nl.hen3games.MineTopia.item.ModItems;
import nl.hen3games.MineTopia.library.IHasModel;

/**
 * Created with IntelliJ IDEA.
 * User: gebruiker
 * Date: 2-1-19
 * Time: 18:47
 * To change this template use File | Settings | File Templates.
 */
public class BlockBase extends Block implements IHasModel{
    public BlockBase(String name, Material material, CreativeTabs tab)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ModBlock.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerModel(Item.getItemFromBlock(this), 0);
    }
}
