package dev.wolfieboy09.mek_x_star.modules;

import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModuleHeatResistive implements ICustomModule<ModuleHeatResistive> {
    public static final String TAG = "isHeatResistiveActive";
    @Override
    public void onAdded(IModule<ModuleHeatResistive> module, boolean first) {
        module.getContainer().getOrCreateTag().putBoolean(TAG, true);
    }

    @Override
    public void onRemoved(IModule<ModuleHeatResistive> module, boolean last) {
        module.getContainer().getOrCreateTag().putBoolean(TAG, false);
    }
}
