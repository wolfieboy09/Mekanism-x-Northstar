package dev.wolfieboy09.mek_x_star.modules;

import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;
import mekanism.api.gear.IModuleContainer;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.util.Unit;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
abstract class MNCommonModule<M extends ICustomModule<M>> implements ICustomModule<M> {
    @Override
    public void onAdded(IModule<M> module, IModuleContainer moduleContainer, ItemStack stack, boolean first) {
        var comp = getComponentType();
        if (comp != null) {
            stack.set(getComponentType(), Unit.INSTANCE);
        }
    }

    @Override
    public void onRemoved(IModule<M> module, IModuleContainer moduleContainer, ItemStack stack, boolean wasLast) {
        var comp = getComponentType();
        if (comp != null) {
            stack.remove(getComponentType());
        }
    }

    @Nullable
    protected abstract DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> getComponentType();
}
