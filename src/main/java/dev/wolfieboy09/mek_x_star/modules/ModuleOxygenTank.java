package dev.wolfieboy09.mek_x_star.modules;

import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

@ParametersAreNonnullByDefault
public class ModuleOxygenTank implements ICustomModule<ModuleOxygenTank> {
    public static final String TAG = "isOxygenTankModuleActive";

    @Override
    public void onAdded(IModule<ModuleOxygenTank> module, boolean first) {
        Objects.requireNonNull(module.getContainer().getOrCreateTag()).putBoolean(TAG, true);
    }

    @Override
    public void onRemoved(IModule<ModuleOxygenTank> module, boolean last) {
        Objects.requireNonNull(module.getContainer().getOrCreateTag()).putBoolean(TAG, false);
    }
}