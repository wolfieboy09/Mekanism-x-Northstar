package dev.wolfieboy09.mek_x_star.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static dev.wolfieboy09.mek_x_star.MekanismNorthStar.MOD_ID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MOD_ID)
public class CreativeModTab {
    public static final DeferredRegister<CreativeModeTab> TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistryObject<CreativeModeTab> BLOCKS = TAB.register("blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MNItems.MODULE_SPACE_SUIT.get()))
                    .title(Component.translatable("creativetab.mek_x_star.name"))
                    .displayItems((pParameters, output) -> {
                        output.accept(MNItems.MODULE_SPACE_SUIT.get());
                        output.accept(MNItems.MODULE_OXYGEN_TANK.get());
                        output.accept(MNItems.MODULE_SPACE_SUIT_INSULATION.get());
                        output.accept(MNItems.MODULE_HEAT_RESISTANT.get());
                        output.accept(MNItems.INSULATION.get());
                        output.accept(MNItems.HEAT_INSULATION.get());
                        output.accept(MNItems.CRUSHED_WOOL.get());
                    })
                    .build());
}
