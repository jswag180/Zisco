package com.zisco;

import com.zisco.Items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ZiscoTab extends CreativeTabs {
    public ZiscoTab(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return ModItems.pcbtrace.getDefaultInstance();
    }
}
