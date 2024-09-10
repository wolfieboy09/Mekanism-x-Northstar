package dev.wolfieboy09.mek_x_star.registries;

import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import mekanism.api.gear.IModuleHelper;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MNItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MekanismNorthStar.MOD_ID);

    public static final RegistryObject<Item> MODULE_SPACE_SUIT = ITEMS.register("module_space_suit",() -> IModuleHelper.INSTANCE.createModuleItem(MNModuleData.SPACE_SUIT_MODULE_DATA, new Item.Properties().stacksTo(4)));
    public static final RegistryObject<Item> MODULE_OXYGEN_TANK = ITEMS.register("module_oxygen_tank",() -> IModuleHelper.INSTANCE.createModuleItem(MNModuleData.OXYGEN_TANK_MODULE_DATA, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MODULE_SPACE_SUIT_INSULATION = ITEMS.register("module_space_suit_insulation",() -> IModuleHelper.INSTANCE.createModuleItem(MNModuleData.SPACE_SUIT_INSULATION_MODULE_DATA, new Item.Properties().stacksTo(4)));
    public static final RegistryObject<Item> MODULE_HEAT_RESISTANT = ITEMS.register("module_heat_resistant",() -> IModuleHelper.INSTANCE.createModuleItem(MNModuleData.HEAT_RESISTANT_MODULE_DATA, new Item.Properties().stacksTo(4)));
}
