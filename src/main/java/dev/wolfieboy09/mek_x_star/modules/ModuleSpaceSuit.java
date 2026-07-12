package dev.wolfieboy09.mek_x_star.modules;

import dev.wolfieboy09.mek_x_star.registries.MNDataComponents;
import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;
import mekanism.api.gear.IModuleContainer;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.util.Unit;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModuleSpaceSuit extends MNCommonModule<ModuleSpaceSuit> {
    @Override
    protected @Nullable DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> getComponentType() {
        return MNDataComponents.OXYGEN_SEALING;
    }
}
