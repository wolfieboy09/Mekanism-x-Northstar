package dev.wolfieboy09.mek_x_star.modules;

import dev.wolfieboy09.mek_x_star.registries.MNDataComponents;
import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;
import mekanism.api.gear.IModuleContainer;
import net.minecraft.util.Unit;
import net.minecraft.world.item.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModuleHeatResistive implements ICustomModule<ModuleHeatResistive> {
    @Override
    public void onAdded(IModule<ModuleHeatResistive> module, IModuleContainer moduleContainer, ItemStack stack, boolean first) {
        stack.set(MNDataComponents.HEAT_RESISTANT, Unit.INSTANCE);
    }

    @Override
    public void onRemoved(IModule<ModuleHeatResistive> module, IModuleContainer moduleContainer, ItemStack stack, boolean wasLast) {
        stack.remove(MNDataComponents.HEAT_RESISTANT);
    }
}
