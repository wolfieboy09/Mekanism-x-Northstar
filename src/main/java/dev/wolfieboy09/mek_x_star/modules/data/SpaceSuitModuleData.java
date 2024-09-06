package dev.wolfieboy09.mek_x_star.modules.data;

import dev.wolfieboy09.mek_x_star.modules.registry.ModuleSpaceSuit;
import mekanism.api.gear.ModuleData;

public class SpaceSuitModuleData extends ModuleData<ModuleSpaceSuit> {
    public SpaceSuitModuleData(ModuleDataBuilder<ModuleSpaceSuit> builder) {
        super(builder);
        builder.maxStackSize(1);
    }
}
