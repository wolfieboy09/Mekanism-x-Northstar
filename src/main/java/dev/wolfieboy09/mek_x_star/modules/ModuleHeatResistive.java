package dev.wolfieboy09.mek_x_star.modules;

import dev.wolfieboy09.mek_x_star.registries.MNDataComponents;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.util.Unit;
import net.neoforged.neoforge.registries.DeferredHolder;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModuleHeatResistive extends MNCommonModule<ModuleHeatResistive> {
    @Override
    protected DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> getComponentType() {
        return MNDataComponents.HEAT_RESISTANT;
    }
}
