package dev.wolfieboy09.mek_x_star.modules;

import mekanism.api.annotations.NothingNullByDefault;
import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;

import java.util.Objects;

@NothingNullByDefault
public class ModuleSpaceSuit implements ICustomModule<ModuleSpaceSuit> {
    @Override
    public void onAdded(IModule<ModuleSpaceSuit> module, boolean first) {
        ICustomModule.super.onAdded(module, first);
        Objects.requireNonNull(module.getContainer().getOrCreateTag()).putBoolean("isSpaceModuleInstalled", true);
    }

    @Override
    public void onRemoved(IModule<ModuleSpaceSuit> module, boolean last) {
        ICustomModule.super.onRemoved(module, last);
        Objects.requireNonNull(module.getContainer().getOrCreateTag()).putBoolean("isSpaceModuleInstalled", false);
    }
}