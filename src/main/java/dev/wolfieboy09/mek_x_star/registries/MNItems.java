package dev.wolfieboy09.mek_x_star.registries;

import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import mekanism.common.item.ItemModule;
import mekanism.common.registration.impl.ItemDeferredRegister;
import mekanism.common.registration.impl.ItemRegistryObject;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class MNItems {
    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(MekanismNorthStar.MOD_ID);

    // MODULES
    public static final ItemRegistryObject<ItemModule> MODULE_HEAT_RESISTIVE = ITEMS.registerModule(MNModules.MODULE_HEAT_RESISTIVE, Rarity.UNCOMMON);
    public static final ItemRegistryObject<ItemModule> MODULE_OXYGEN_TANK = ITEMS.registerModule(MNModules.MODULE_OXYGEN_TANK);
    public static final ItemRegistryObject<ItemModule> MODULE_SPACE_SUIT_INSULATION = ITEMS.registerModule(MNModules.MODULE_SPACE_SUIT_INSULATION);
    public static final ItemRegistryObject<ItemModule> MODULE_SPACE_SUIT = ITEMS.registerModule(MNModules.MODULE_SPACE_SUIT, Rarity.UNCOMMON);
    public static final ItemRegistryObject<ItemModule> MODULE_OXYGEN_TANK_EXPANSION = ITEMS.registerModule(MNModules.MODULE_OXYGEN_TANK_EXPANSION, Rarity.UNCOMMON);


    // ITEMS
    public static final ItemRegistryObject<Item> INSULATION = ITEMS.register("insulation");
    public static final ItemRegistryObject<Item> HEAT_INSULATION = ITEMS.register("heat_insulation");
    public static final ItemRegistryObject<Item> CRUSHED_WOOL = ITEMS.register("crushed_wool");
    public static final ItemRegistryObject<Item> DURASTEEL = ITEMS.register("durasteel");
    public static final ItemRegistryObject<Item> PRESSURIZED_DURASTEEL = ITEMS.register("pressurized_durasteel");
    public static final ItemRegistryObject<Item> INCOMPLETE_OXYGEN_TANK_EXPANSION_MODULE = ITEMS.register("incomplete_oxygen_tank_expansion");
}
