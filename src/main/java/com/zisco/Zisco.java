package com.zisco;

import com.zisco.proxys.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Zisco.MODID, name = Zisco.NAME, version = Zisco.VERSION)
public class Zisco
{
    public static final String MODID = "zisco";
    public static final String NAME = "Zisco";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.zisco.proxys.ClientProxy", serverSide = "com.zisco.proxys.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Zisco instance;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        proxy.init(event);
    }

    @EventHandler
    public void  postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
