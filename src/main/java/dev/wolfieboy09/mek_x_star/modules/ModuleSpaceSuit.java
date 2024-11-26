package dev.wolfieboy09.mek_x_star.modules;

import mekanism.api.annotations.NothingNullByDefault;
import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;

import java.util.Objects;

@NothingNullByDefault
public class ModuleSpaceSuit implements ICustomModule<ModuleSpaceSuit> {
    public static final String TAG = "isSpaceModuleActive";

    @Override
    public void onAdded(IModule<ModuleSpaceSuit> module, boolean first) {
        Objects.requireNonNull(module.getContainer().getOrCreateTag()).putBoolean(TAG, true);
    }

    @Override
    public void onRemoved(IModule<ModuleSpaceSuit> module, boolean last) {
        Objects.requireNonNull(module.getContainer().getOrCreateTag()).putBoolean(TAG, false);
    }
}