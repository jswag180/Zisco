package com.zisco.Blocks.TileEntitys;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.energy.IEnergyStorage;

public class PCBFactoryTileEntity extends TileEntity implements IEnergyStorage {



    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        return 0;
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        return 0;
    }

    @Override
    public int getEnergyStored() {
        return 0;
    }

    @Override
    public int getMaxEnergyStored() {
        return 0;
    }

    @Override
    public boolean canExtract() {
        return false;
    }

    @Override
    public boolean canReceive() {
        return true;
    }
}
