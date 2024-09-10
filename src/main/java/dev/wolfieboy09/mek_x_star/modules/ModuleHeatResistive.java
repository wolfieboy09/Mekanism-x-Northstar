package dev.wolfieboy09.mek_x_star.modules;

import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModuleHeatResistive implements ICustomModule<ModuleHeatResistive> {
    @Override
    public void onAdded(IModule<ModuleHeatResistive> module, boolean first) {
        ICustomModule.super.onAdded(module, first);
        module.getContainer().getOrCreateTag().putBoolean("isHeatResistant", true);
    }

    @Override
    public void onRemoved(IModule<ModuleHeatResistive> module, boolean last) {
        ICustomModule.super.onRemoved(module, last);
        module.getContainer().getOrCreateTag().putBoolean("isHeatResistant", false);
    }
}
