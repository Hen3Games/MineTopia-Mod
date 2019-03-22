package nl.hen3games.MineTopia.Proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created with IntelliJ IDEA.
 * User: gebruiker
 * Date: 21-10-18
 * Time: 23:23
 * To change this template use File | Settings | File Templates.
 */
public class ClientProxy extends CommonProxy{

    @Override
    public void registerModel(Item item, int metadata) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}