package com.zisco.Blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {


        @GameRegistry.ObjectHolder("zisco:pcbfactory")
        public static PCBFactory pcbfactory;

        @SideOnly(Side.CLIENT)
        public static void initModels() {
                pcbfactory.initModel();
        }

}
