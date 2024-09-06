package dev.wolfieboy09.mek_x_star.registries;
import dev.wolfieboy09.mek_x_star.item.ModuleSpaceSuitItem;
import dev.wolfieboy09.mek_x_star.modules.registry.ModuleSpaceSuit;
import mekanism.api.gear.ModuleData;
import mekanism.api.providers.IItemProvider;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class MNModules {

    public static final ModuleData<ModuleSpaceSuit> SPACE_SUIT_MODULE_DATA = new ModuleData<>(
        ModuleData.ModuleDataBuilder.custom(ModuleSpaceSuit::new, new IItemProvider() {
            @Override
            public @NotNull Item asItem() {
                return new ModuleSpaceSuitItem();
            }
        })
    );
}
