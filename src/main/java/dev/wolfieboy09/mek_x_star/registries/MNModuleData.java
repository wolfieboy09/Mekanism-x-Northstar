package dev.wolfieboy09.mek_x_star.registries;

import dev.wolfieboy09.mek_x_star.modules.ModuleHeatResistant;
import dev.wolfieboy09.mek_x_star.modules.ModuleOxygenTank;
import dev.wolfieboy09.mek_x_star.modules.ModuleSpaceSuit;
import dev.wolfieboy09.mek_x_star.modules.ModuleSpaceSuitInsulation;
import mekanism.api.gear.ModuleData;
import mekanism.api.providers.IItemProvider;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class MNModuleData {
    public static final ModuleData<ModuleSpaceSuit> SPACE_SUIT_MODULE_DATA = new ModuleData<>(
            ModuleData.ModuleDataBuilder.custom(ModuleSpaceSuit::new, new IItemProvider() {
                @Override
                public @NotNull Item asItem() {
                    return MNItems.MODULE_SPACE_SUIT.get();
                }
            }));

    public static final ModuleData<ModuleOxygenTank> OXYGEN_TANK_MODULE_DATA = new ModuleData<>(
            ModuleData.ModuleDataBuilder.custom(ModuleOxygenTank::new, new IItemProvider() {
                @Override
                public @NotNull Item asItem() {
                    return MNItems.MODULE_OXYGEN_TANK.get();
                }
            }));

    public static final ModuleData<ModuleSpaceSuitInsulation> SPACE_SUIT_INSULATION_MODULE_DATA = new ModuleData<>(
            ModuleData.ModuleDataBuilder.custom(ModuleSpaceSuitInsulation::new, new IItemProvider() {
                @Override
                public @NotNull Item asItem() {
                    return MNItems.MODULE_SPACE_SUIT_INSULATION.get();
                }
            }));

    public static final ModuleData<ModuleHeatResistant> HEAT_RESISTANT_MODULE_DATA = new ModuleData<>(
            ModuleData.ModuleDataBuilder.custom(ModuleHeatResistant::new, new IItemProvider() {
                @Override
                public @NotNull Item asItem() {
                    return MNItems.MODULE_HEAT_RESISTANT.get();
                }
            }));
}

