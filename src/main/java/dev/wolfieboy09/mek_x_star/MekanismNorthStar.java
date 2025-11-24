package dev.wolfieboy09.mek_x_star;

import dev.wolfieboy09.mek_x_star.registries.MNCreativeModeTab;
import dev.wolfieboy09.mek_x_star.registries.MNDataComponents;
import dev.wolfieboy09.mek_x_star.registries.MNItems;
import dev.wolfieboy09.mek_x_star.registries.MNModules;
import mekanism.api.MekanismIMC;
import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(MekanismNorthStar.MOD_ID)
public class MekanismNorthStar {
    public static final String MOD_ID = "mek_x_star";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MekanismNorthStar(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Mekanism? In space? HILARIOUS");
        MNDataComponents.REGISTAR.register(modEventBus);
        MNItems.ITEMS.register(modEventBus);
        MNModules.MODULES.register(modEventBus);
        MNCreativeModeTab.REGISTER.register(modEventBus);

        modEventBus.addListener(MekanismNorthStar::registerMekanismModules);
    }

    public static void registerMekanismModules(InterModEnqueueEvent event) {
        MekanismIMC.addMekaSuitModules(
                MNModules.MODULE_HEAT_RESISTIVE,
                MNModules.MODULE_SPACE_SUIT,
                MNModules.MODULE_SPACE_SUIT_INSULATION);

        MekanismIMC.addMekaSuitBodyarmorModules(MNModules.MODULE_OXYGEN_TANK);
    }
}
