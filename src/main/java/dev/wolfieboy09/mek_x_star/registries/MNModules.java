package dev.wolfieboy09.mek_x_star.registries;
import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.modules.ModuleHeatResistive;
import dev.wolfieboy09.mek_x_star.modules.ModuleOxygenTank;
import dev.wolfieboy09.mek_x_star.modules.ModuleSpaceSuit;
import dev.wolfieboy09.mek_x_star.modules.ModuleSpaceSuitInsulation;
import mekanism.api.MekanismAPI;
import mekanism.api.gear.ModuleData;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MNModules {
    public static final DeferredRegister<ModuleData<?>> MODULES = DeferredRegister.create(MekanismAPI.MODULE_REGISTRY_NAME, MekanismNorthStar.MOD_ID);

    public static final RegistryObject<ModuleData<ModuleSpaceSuit>> MODULE_SPACE_SUIT = MODULES.register("module_space_suit", () -> MNModuleData.SPACE_SUIT_MODULE_DATA);
    public static final RegistryObject<ModuleData<ModuleOxygenTank>> MODULE_OXYGEN_TANK = MODULES.register("module_oxygen_tank", () -> MNModuleData.OXYGEN_TANK_MODULE_DATA);
    public static final RegistryObject<ModuleData<ModuleSpaceSuitInsulation>> MODULE_SPACE_SUIT_INSULATION = MODULES.register("module_space_suit_insulation", () -> MNModuleData.SPACE_SUIT_INSULATION_MODULE_DATA);
    public static final RegistryObject<ModuleData<ModuleHeatResistive>> MODULE_HEAT_RESISTIVE = MODULES.register("module_heat_resistive", () -> MNModuleData.HEAT_RESISTIVE_MODULE_DATA);
}
