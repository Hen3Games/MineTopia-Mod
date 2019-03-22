package nl.hen3games.MineTopia.item.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import nl.hen3games.MineTopia.Common.Main;
import nl.hen3games.MineTopia.item.ModItems;
import nl.hen3games.MineTopia.library.IHasModel;

/**
 * Created with IntelliJ IDEA.
 * User: gebruiker
 * Date: 22-10-18
 * Time: 3:20
 * To change this template use File | Settings | File Templates.
 */
public class ArmorBase extends ItemArmor implements IHasModel{

    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs tabs) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
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
