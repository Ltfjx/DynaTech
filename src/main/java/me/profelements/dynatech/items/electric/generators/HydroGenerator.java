package me.profelements.dynatech.items.electric.generators;

import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.profelements.dynatech.DynaTech;

import org.bukkit.Location;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Waterlogged;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.settings.IntRangeSetting;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.libraries.paperlib.PaperLib;

import javax.annotation.Nonnull;

public class HydroGenerator extends SlimefunItem implements EnergyNetProvider {
    
    private final ItemSetting<Integer> checkingInterval = new IntRangeSetting(this, "check-for-water-interal", 0, 10, 100);

    private final int energy;
    private final int capacity;

    public HydroGenerator(Category category, int energy, int capacity, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

        this.energy = energy;
        this.capacity = capacity;
        
        addItemSetting(checkingInterval);
    }

    @Override
    public int getGeneratedOutput(@Nonnull Location location, @Nonnull Config config) {
        if (DynaTech.getInstance().getTickInterval()  % checkingInterval.getValue() == 0) {
            BlockData blockData = PaperLib.getBlockState(location.getBlock(), false).getState().getBlockData();
            if (blockData instanceof Waterlogged) {
                Waterlogged data = (Waterlogged) blockData;
                if (data.isWaterlogged()) {
                    BlockStorage.addBlockInfo(location, "waterlogged", String.valueOf(true));
                    return getEnergyProduction();
                } else {
                    BlockStorage.addBlockInfo(location, "waterlogged", String.valueOf(false));
                }
            }
            return 0;
        } else if (BlockStorage.getLocationInfo(location, "waterlogged") != null && BlockStorage.getLocationInfo(location, "waterlogged").equals(String.valueOf(true))){
            return getEnergyProduction();
        }
        return 0;        
    }

    @Override
    public boolean isChargeable() {
        return false;
    }

   public int getEnergyProduction() {
    return energy;
   }

@Override
public int getCapacity() {
    return capacity;
}
}
