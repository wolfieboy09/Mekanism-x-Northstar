package dev.wolfieboy09.mek_x_star.modules;

import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModuleSpaceSuitInsulation implements ICustomModule<ModuleSpaceSuitInsulation> {
    @Override
    public void onAdded(IModule<ModuleSpaceSuitInsulation> module, boolean first) {
        ICustomModule.super.onAdded(module, first);
        module.getContainer().getOrCreateTag().putBoolean("isInsulationModuleActive", true);
    }

    @Override
    public void onRemoved(IModule<ModuleSpaceSuitInsulation> module, boolean last) {
        ICustomModule.super.onRemoved(module, last);
        module.getContainer().getOrCreateTag().putBoolean("isInsulationModuleActive", false);
    }
}
