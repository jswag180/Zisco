package com.zisco.Blocks;

import com.zisco.Blocks.CoalEngine.CoalEngine;
import com.zisco.Blocks.CoalEngine.CoalEngineBlock;
import com.zisco.Blocks.PCBFactory.PCBFactory;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {


        @GameRegistry.ObjectHolder("zisco:pcbfactory")
        public static PCBFactory pcbfactory;
        @GameRegistry.ObjectHolder("zisco:coalengine")
        public static CoalEngineBlock coalengineblock;

        @SideOnly(Side.CLIENT)
        public static void initModels() {
                pcbfactory.initModel();
                coalengineblock.initModel();
        }

}
