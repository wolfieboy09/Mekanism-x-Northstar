package dev.wolfieboy09.mek_x_star.registries;

import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MNCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MekanismNorthStar.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ITEMS = REGISTER.register("item_group", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(MNItems.MODULE_SPACE_SUIT.get()))
            .displayItems((params, output) -> {
                output.accept(MNItems.MODULE_SPACE_SUIT);
                output.accept(MNItems.MODULE_SPACE_SUIT_INSULATION);
                output.accept(MNItems.MODULE_OXYGEN_TANK);
                output.accept(MNItems.MODULE_HEAT_RESISTIVE);
                output.accept(MNItems.CRUSHED_WOOL);
                output.accept(MNItems.INSULATION);
                output.accept(MNItems.HEAT_INSULATION);
            })
            .build());

}
