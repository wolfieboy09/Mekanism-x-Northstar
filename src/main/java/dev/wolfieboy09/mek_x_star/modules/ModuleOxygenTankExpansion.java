package dev.wolfieboy09.mek_x_star.modules;


import com.lightning.northstar.config.NorthstarConfigs;
import com.lightning.northstar.content.NorthstarDataComponents;
import dev.wolfieboy09.mek_x_star.registries.MNDataComponents;
import dev.wolfieboy09.mek_x_star.registries.MNModules;
import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;
import mekanism.api.gear.IModuleContainer;
import net.minecraft.world.item.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModuleOxygenTankExpansion implements ICustomModule<ModuleOxygenTankExpansion> {
    @Override
    public void onAdded(IModule<ModuleOxygenTankExpansion> module, IModuleContainer moduleContainer, ItemStack stack, boolean first) {
        stack.set(MNDataComponents.OXYGEN_EXPANSIONS, moduleContainer.installedCount(MNModules.MODULE_OXYGEN_TANK_EXPANSION));
    }

    @Override
    public void onRemoved(IModule<ModuleOxygenTankExpansion> module, IModuleContainer moduleContainer, ItemStack stack, boolean wasLast) {
        stack.set(MNDataComponents.OXYGEN_EXPANSIONS, moduleContainer.installedCount(MNModules.MODULE_OXYGEN_TANK_EXPANSION));
        if (!stack.has(NorthstarDataComponents.OXYGEN)) return;

        // Needed to prevent having an expanded tank without the modules.
        stack.set(NorthstarDataComponents.OXYGEN, Math.min(stack.get(NorthstarDataComponents.OXYGEN),
                NorthstarConfigs.server().spacesuitBaseOxygen.get()
                        + NorthstarConfigs.server().spacesuitAdditionalOxygen.get()
                        * moduleContainer.installedCount(MNModules.MODULE_OXYGEN_TANK_EXPANSION)));

    }
}
