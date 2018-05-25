package com.zisco.proxys;

import com.zisco.Blocks.CoalEngine.CoalEngineBlock;
import com.zisco.Blocks.ModBlocks;
import com.zisco.Blocks.PCBFactory.PCBFactory;
import com.zisco.Blocks.CoalEngine.CoalEngineTileEntitiy;
import com.zisco.Blocks.PCBFactory.PCBFactoryTileEntity;
import com.zisco.Items.PCBTrace;
import com.zisco.Zisco;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        event.getRegistry().register(new PCBFactory());
        GameRegistry.registerTileEntity(PCBFactoryTileEntity.class, Zisco.MODID + "_pcbfactory");

        event.getRegistry().register(new CoalEngineBlock());
        GameRegistry.registerTileEntity(CoalEngineTileEntitiy.class, Zisco.MODID + "_coalengine");

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        event.getRegistry().register(new ItemBlock(ModBlocks.pcbfactory).setRegistryName(ModBlocks.pcbfactory.getRegistryName()));

        event.getRegistry().register(new ItemBlock(ModBlocks.coalengine).setRegistryName(ModBlocks.coalengine.getRegistryName()));

        event.getRegistry().register(new PCBTrace());

    }

}
