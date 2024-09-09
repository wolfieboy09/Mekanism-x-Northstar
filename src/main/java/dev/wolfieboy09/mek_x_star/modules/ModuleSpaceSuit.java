package dev.wolfieboy09.mek_x_star.modules;

import mekanism.api.annotations.NothingNullByDefault;
import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;
import mekanism.api.gear.config.ModuleConfigItemCreator;
import net.minecraft.nbt.CompoundTag;

@NothingNullByDefault
public class ModuleSpaceSuit implements ICustomModule<ModuleSpaceSuit> {
    private static final String IS_INSTALLED_TAG_NAME = "isSpaceModuleInstalled";

    @Override
    public void init(IModule<ModuleSpaceSuit> module, ModuleConfigItemCreator configItemCreator) {
        ICustomModule.super.init(module, configItemCreator);
    }

    @Override
    public void onAdded(IModule<ModuleSpaceSuit> module, boolean first) {
        ICustomModule.super.onAdded(module, first);
        CompoundTag tag = new CompoundTag();
        tag.putBoolean(IS_INSTALLED_TAG_NAME, true);
        module.getContainer().setTag(tag);
    }

    @Override
    public void onRemoved(IModule<ModuleSpaceSuit> module, boolean last) {
        ICustomModule.super.onRemoved(module, last);
        CompoundTag tag = new CompoundTag();
        tag.putBoolean(IS_INSTALLED_TAG_NAME, false);
        module.getContainer().setTag(tag);
    }
}