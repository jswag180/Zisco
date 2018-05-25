package com.zisco.proxys;

import com.zisco.Blocks.CoalEngine.CoalEngine;
import com.zisco.Blocks.CoalEngine.CoalEngineGui;
import com.zisco.Blocks.CoalEngine.CoalEngineTileEntitiy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiProxy implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof CoalEngineTileEntitiy) {
            return new CoalEngine(player.inventory, (CoalEngineTileEntitiy) te);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof CoalEngineTileEntitiy) {
            CoalEngineTileEntitiy containerTileEntity = (CoalEngineTileEntitiy) te;
            return new CoalEngineGui(containerTileEntity, new CoalEngine(player.inventory, containerTileEntity));
        }
        return null;
    }

}
