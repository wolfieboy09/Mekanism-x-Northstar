package dev.wolfieboy09.mek_x_star.modules;

import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;
import mekanism.api.gear.config.ModuleConfigItemCreator;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModuleHeatResistant implements ICustomModule<ModuleHeatResistant> {
    @Override
    public void onAdded(IModule<ModuleHeatResistant> module, boolean first) {
        ICustomModule.super.onAdded(module, first);
        module.getContainer().getOrCreateTag().putBoolean("isHeatResistant", true);
    }

    @Override
    public void onRemoved(IModule<ModuleHeatResistant> module, boolean last) {
        ICustomModule.super.onRemoved(module, last);
        module.getContainer().getOrCreateTag().putBoolean("isHeatResistant", false);
    }
}
