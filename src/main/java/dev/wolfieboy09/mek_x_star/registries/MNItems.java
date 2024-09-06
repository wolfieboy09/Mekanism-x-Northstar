package dev.wolfieboy09.mek_x_star.registries;

import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.item.ModuleSpaceSuitItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MNItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MekanismNorthStar.MOD_ID);

    public static final RegistryObject<Item> MODULE_SPACE_SUIT = ITEMS.register("module_space_suit",() -> new Item(new Item.Properties()));

}
