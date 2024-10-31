package dev.wolfieboy09.mek_x_star.registries;
import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.modules.ModuleHeatResistive;
import dev.wolfieboy09.mek_x_star.modules.ModuleOxygenTank;
import dev.wolfieboy09.mek_x_star.modules.ModuleSpaceSuit;
import dev.wolfieboy09.mek_x_star.modules.ModuleSpaceSuitInsulation;
import mekanism.api.gear.ModuleData;
import mekanism.common.registration.impl.ModuleDeferredRegister;
import mekanism.common.registration.impl.ModuleRegistryObject;
import mekanism.common.registries.MekanismItems;
import net.minecraftforge.registries.RegistryObject;

public class MNModules {
    public static final ModuleDeferredRegister MODULES = new ModuleDeferredRegister(MekanismNorthStar.MOD_ID);

    public static final ModuleRegistryObject<ModuleSpaceSuit> MODULE_SPACE_SUIT = MODULES.register("module_space_suit", ModuleSpaceSuit::new, MNItems.MODULE_SPACE_SUIT, builder -> builder.maxStackSize(1));
    public static final ModuleRegistryObject<ModuleOxygenTank> MODULE_OXYGEN_TANK = MODULES.register("module_oxygen_tank", ModuleOxygenTank::new, MNItems.MODULE_SPACE_SUIT, builder -> builder.maxStackSize(1));
    public static final ModuleRegistryObject<ModuleSpaceSuitInsulation> MODULE_SPACE_SUIT_INSULATION = MODULES.register("module_space_suit_insulation", ModuleSpaceSuitInsulation::new, MNItems.MODULE_SPACE_SUIT_INSULATION, builder -> builder.maxStackSize(1));
    public static final ModuleRegistryObject<ModuleHeatResistive> MODULE_HEAT_RESISTIVE = MODULES.register("module_heat_resistive", ModuleHeatResistive::new, MNItems.MODULE_HEAT_RESISTANT, builder -> builder.maxStackSize(1));
}
