package dev.wolfieboy09.mek_x_star.registries;
import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.modules.registry.ModuleOxygenTank;
import dev.wolfieboy09.mek_x_star.modules.registry.ModuleSpaceSuit;
import mekanism.api.MekanismAPI;
import mekanism.api.gear.ModuleData;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MNModules {
    public static final DeferredRegister<ModuleData<?>> MODULES = DeferredRegister.create(MekanismAPI.MODULE_REGISTRY_NAME, MekanismNorthStar.MOD_ID);

    public static final RegistryObject<ModuleData<ModuleSpaceSuit>> MODULE_SPACE_SUIT = MODULES.register("module_space_suit", () -> MNModuleData.SPACE_SUIT_MODULE_DATA);
    public static final RegistryObject<ModuleData<ModuleOxygenTank>> MODULE_OXYGEN_TANK = MODULES.register("module_oxygen_tank", () -> MNModuleData.OXYGEN_TANK_MODULE_DATA);
}
