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

public class PinkCosmicGlitterOre extends Block implements IHasModel {
    public PinkCosmicGlitterOre(String name, Material material, CreativeTabs tab)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setHardness(1.5f);
        setLightLevel(1.0f);
        setHarvestLevel("pickaxe", 2);

        ModBlock.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerModel(Item.getItemFromBlock(this), 0);
    }
}
