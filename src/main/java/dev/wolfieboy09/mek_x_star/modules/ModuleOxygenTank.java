package dev.wolfieboy09.mek_x_star.modules;

import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;
import mekanism.api.gear.config.ModuleConfigItemCreator;
import net.minecraft.nbt.CompoundTag;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModuleOxygenTank implements ICustomModule<ModuleOxygenTank> {
    private final String IS_INSTALLED_TAG_NAME = "isOxygenTankInstalled";
    @Override
    public void init(IModule<ModuleOxygenTank> module, ModuleConfigItemCreator configItemCreator) {
        ICustomModule.super.init(module, configItemCreator);
    }

    @Override
    public void onAdded(IModule<ModuleOxygenTank> module, boolean first) {
        ICustomModule.super.onAdded(module, first);
        CompoundTag tag = new CompoundTag();
        tag.putBoolean(IS_INSTALLED_TAG_NAME, true);
        module.getContainer().addTagElement(IS_INSTALLED_TAG_NAME, tag);
    }

    @Override
    public void onRemoved(IModule<ModuleOxygenTank> module, boolean last) {
        ICustomModule.super.onRemoved(module, last);
        CompoundTag tag = new CompoundTag();
        tag.putBoolean(IS_INSTALLED_TAG_NAME, false);
        module.getContainer().setTag(tag);
    }
}