package dev.wolfieboy09.mek_x_star.registries;
import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.item.ModuleSpaceSuitItem;
import dev.wolfieboy09.mek_x_star.modules.registry.ModuleSpaceSuit;
import mekanism.api.MekanismAPI;
import mekanism.api.gear.ModuleData;
import mekanism.api.providers.IItemProvider;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class MNModules {
    public static final DeferredRegister<ModuleData<?>> MODULES = DeferredRegister.create(MekanismAPI.MODULE_REGISTRY_NAME, MekanismNorthStar.MOD_ID);

    public static final RegistryObject<ModuleData<ModuleSpaceSuit>> MODULE_SPACE_SUIT = MODULES.register("module_space_suit", () -> new ModuleData<>(
            ModuleData.ModuleDataBuilder.custom(ModuleSpaceSuit::new, new IItemProvider() {
                @Override
                public @NotNull Item asItem() {
                    return new ModuleSpaceSuitItem();
                }
            })
    ));
}
