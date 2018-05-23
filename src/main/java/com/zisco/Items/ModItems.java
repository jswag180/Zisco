package com.zisco.Items;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {


    @GameRegistry.ObjectHolder("zisco:pcbtrace")
    public static PCBTrace pcbtrace;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        pcbtrace.initModel();
    }

}
