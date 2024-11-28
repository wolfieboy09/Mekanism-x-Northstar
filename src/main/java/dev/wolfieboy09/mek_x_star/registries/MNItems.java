package dev.wolfieboy09.mek_x_star.registries;

import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import mekanism.common.item.ItemModule;
import mekanism.common.registration.impl.ItemDeferredRegister;
import mekanism.common.registration.impl.ItemRegistryObject;
import mekanism.common.registration.impl.ModuleDeferredRegister;
import mekanism.common.registration.impl.ModuleRegistryObject;
import net.minecraft.world.item.Item;

public class MNItems {
    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(MekanismNorthStar.MOD_ID);
    public static final ModuleDeferredRegister MODULES =  new ModuleDeferredRegister(MekanismNorthStar.MOD_ID);

    // MODULES
    public static final ModuleRegistryObject<?> SPACE_SUIT_MARKER = MODULES.registerMarker("space_suit", () -> MNItems.MODULE_SPACE_SUIT.asItem(), builder -> builder);
    public static final ModuleRegistryObject<?> OXYGEN_TANK_MARKER = MODULES.registerMarker("oxygen_tank", () ->  MNItems.MODULE_OXYGEN_TANK.asItem(), builder -> builder);
    public static final ModuleRegistryObject<?> SPACE_SUIT_INSULATION_MARKER = MODULES.registerMarker("space_suit_insulation", () ->  MNItems.MODULE_SPACE_SUIT_INSULATION.asItem(), builder -> builder);
    public static final ModuleRegistryObject<?> HEAT_RESISTIVE_MARKER = MODULES.registerMarker("heat_resistive", () ->  MNItems.MODULE_HEAT_RESISTANT.asItem(), builder -> builder);

    public static final ItemRegistryObject<ItemModule> MODULE_SPACE_SUIT = ITEMS.registerModule(SPACE_SUIT_MARKER);
    public static final ItemRegistryObject<ItemModule> MODULE_OXYGEN_TANK = ITEMS.registerModule(OXYGEN_TANK_MARKER);
    public static final ItemRegistryObject<ItemModule> MODULE_SPACE_SUIT_INSULATION = ITEMS.registerModule(SPACE_SUIT_INSULATION_MARKER);
    public static final ItemRegistryObject<ItemModule> MODULE_HEAT_RESISTANT = ITEMS.registerModule(HEAT_RESISTIVE_MARKER);

    // ITEMS
    public static final ItemRegistryObject<Item> INSULATION = ITEMS.register("insulation",() -> new Item(new Item.Properties()));
    public static final ItemRegistryObject<Item> HEAT_INSULATION = ITEMS.register("heat_insulation",() -> new Item(new Item.Properties()));

    public static final ItemRegistryObject<Item> CRUSHED_WOOL = ITEMS.register("crushed_wool",() -> new Item(new Item.Properties()));
}

