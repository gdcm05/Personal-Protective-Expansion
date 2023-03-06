package com.gdcm.ppe;


import com.gdcm.ppe.proxy.CommonProxy;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;

@Mod(modid = Ppe.MODID, name = Ppe.NAME, version = Ppe.VERSION)
public class Ppe
{
    public static final String MODID = "ppe";
    public static final String NAME = "Personal Protective Expansion";
    public static final String VERSION = "0.0.1";


    @SidedProxy(clientSide = "com.gdcm.ppe.proxy.ClientProxy", serverSide = "com.gdcm.ppe.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Ppe instance;
    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }

}
