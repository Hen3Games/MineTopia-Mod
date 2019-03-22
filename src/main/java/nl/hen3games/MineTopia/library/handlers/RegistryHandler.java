package nl.hen3games.MineTopia.library.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nl.hen3games.MineTopia.block.ModBlock;
import nl.hen3games.MineTopia.item.ModItems;
import nl.hen3games.MineTopia.library.IHasModel;

/**
 * Created with IntelliJ IDEA.
 * User: gebruiker
 * Date: 22-10-18
 * Time: 3:05
 * To change this template use File | Settings | File Templates.
 */
@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {

        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {

        event.getRegistry().registerAll(ModBlock.BLOCKS.toArray(new Block[0]));

    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {

        for(Item item : ModItems.ITEMS) {
            if(item instanceof IHasModel) {
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : ModBlock.BLOCKS) {

            if(block instanceof IHasModel) {

                ((IHasModel)block).registerModels();

            }

        }

    }

    public static void preInitRegistries() {

    }

}

