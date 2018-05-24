package com.zisco.Blocks;

import com.zisco.Blocks.TileEntitys.PCBFactoryTileEntity;
import com.zisco.Zisco;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class PCBFactory extends Block implements ITileEntityProvider {

    public PCBFactory() {
        super(Material.ROCK);

        setUnlocalizedName(Zisco.MODID + ".pcbfactory");     // Used for localization (en_US.lang)
        setRegistryName("pcbfactory");
        setCreativeTab(Zisco.CREATIVE_TABS);

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new PCBFactoryTileEntity();
    }
}
