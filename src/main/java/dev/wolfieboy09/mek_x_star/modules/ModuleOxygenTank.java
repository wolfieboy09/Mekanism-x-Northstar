package dev.wolfieboy09.mek_x_star.modules;

import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

@ParametersAreNonnullByDefault
public class ModuleOxygenTank implements ICustomModule<ModuleOxygenTank> {
    @Override
    public void onAdded(IModule<ModuleOxygenTank> module, boolean first) {
        ICustomModule.super.onAdded(module, first);
        Objects.requireNonNull(module.getContainer().getOrCreateTag()).putBoolean("isOxygenTankInstalled", true);
    }

    @Override
    public void onRemoved(IModule<ModuleOxygenTank> module, boolean last) {
        ICustomModule.super.onRemoved(module, last);
        Objects.requireNonNull(module.getContainer().getOrCreateTag()).putBoolean("isOxygenTankInstalled", false);
    }
}