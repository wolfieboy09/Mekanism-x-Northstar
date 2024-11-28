package dev.wolfieboy09.mek_x_star.registries;

import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import mekanism.common.content.gear.ModuleHelper;
import mekanism.common.item.ItemModule;
import mekanism.common.registration.impl.ItemDeferredRegister;
import mekanism.common.registration.impl.ItemRegistryObject;
import mekanism.common.registration.impl.ModuleDeferredRegister;
import mekanism.common.registration.impl.ModuleRegistryObject;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import static mekanism.common.registration.impl.ItemDeferredRegister.getMekBaseProperties;

@SuppressWarnings("Convert2MethodRef")
public class MNItems {
    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(MekanismNorthStar.MOD_ID);
    public static final ModuleDeferredRegister MODULES =  new ModuleDeferredRegister(MekanismNorthStar.MOD_ID);

    // MODULES
    public static final ModuleRegistryObject<?> SPACE_SUIT_MARKER = MODULES.registerMarker("space_suit", () -> MNItems.MODULE_SPACE_SUIT.asItem(), builder -> builder);
    public static final ModuleRegistryObject<?> OXYGEN_TANK_MARKER = MODULES.registerMarker("oxygen_tank", () ->  MNItems.MODULE_OXYGEN_TANK.asItem(), builder -> builder);
    public static final ModuleRegistryObject<?> SPACE_SUIT_INSULATION_MARKER = MODULES.registerMarker("space_suit_insulation", () ->  MNItems.MODULE_SPACE_SUIT_INSULATION.asItem(), builder -> builder);
    public static final ModuleRegistryObject<?> HEAT_RESISTIVE_MARKER = MODULES.registerMarker("heat_resistive", () ->  MNItems.MODULE_HEAT_RESISTANT.asItem(), builder -> builder);

    public static final ItemRegistryObject<ItemModule> MODULE_SPACE_SUIT = registerModule(SPACE_SUIT_MARKER);
    public static final ItemRegistryObject<ItemModule> MODULE_OXYGEN_TANK = registerModule(OXYGEN_TANK_MARKER);
    public static final ItemRegistryObject<ItemModule> MODULE_SPACE_SUIT_INSULATION = registerModule(SPACE_SUIT_INSULATION_MARKER);
    public static final ItemRegistryObject<ItemModule> MODULE_HEAT_RESISTANT = registerModule(HEAT_RESISTIVE_MARKER);

    // ITEMS
    public static final ItemRegistryObject<Item> INSULATION = ITEMS.register("insulation", () -> new Item(new Item.Properties().tab(MNCreativeModTab.TAB)));
    public static final ItemRegistryObject<Item> HEAT_INSULATION = ITEMS.register("heat_insulation", () -> new Item(new Item.Properties().tab(MNCreativeModTab.TAB)));

    public static final ItemRegistryObject<Item> CRUSHED_WOOL = ITEMS.register("crushed_wool", () -> new Item(new Item.Properties().tab(MNCreativeModTab.TAB)));

    // Took this from Mekanism's code, and just added one thing onto it
    private static ItemRegistryObject<ItemModule> registerModule(@NotNull ModuleRegistryObject<?> moduleDataSupplier) {
        return ITEMS.register("module_" + moduleDataSupplier.getInternalRegistryName(),
                () -> ModuleHelper.INSTANCE.createModuleItem(moduleDataSupplier, getMekBaseProperties().tab(MNCreativeModTab.TAB)));
    }

}

