package nl.hen3games.MineTopia.Common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nl.hen3games.MineTopia.Proxy.CommonProxy;
import nl.hen3games.MineTopia.library.Refenerce;
import nl.hen3games.MineTopia.tabs.*;

/**
 * Created with IntelliJ IDEA.
 * User: gebruiker
 * Date: 21-10-18
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
@Mod(modid = Refenerce.modId, name = Refenerce.name, version = Refenerce.version, acceptedMinecraftVersions = Refenerce.mc_version)
public class Main {

    @SidedProxy(serverSide = Refenerce.CommonProxy, clientSide = Refenerce.ClientProxy)
    public static CommonProxy proxy;

    @Mod.Instance(Refenerce.modId)
    public static Main instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event){}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){}

    //Tabs
    public static final CreativeTabs mtblocktab = new mtblocktab("mtblocktab");
    public static final CreativeTabs mtitemstab = new mtitemstab("mtitemstab");
    public static final CreativeTabs mthelmettab = new mthelmettab("mthelmettab");
    public static final CreativeTabs mtchestplatetab = new mtchestplatetab("mtchestplatetab");
    public static final CreativeTabs mtleggingstab = new nl.hen3games.MineTopia.tabs.mtleggingstab("mtleggingstab");
    public static final CreativeTabs mtbootstab = new nl.hen3games.MineTopia.tabs.mtbootstab("mtbootstab");
}
