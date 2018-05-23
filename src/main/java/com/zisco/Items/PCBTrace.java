package com.zisco.Items;

import com.zisco.Zisco;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PCBTrace extends Item {

    public PCBTrace(){

        setRegistryName("pcbtrace");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(Zisco.MODID + ".pcbtrace");     // Used for localization (en_US.lang)

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
