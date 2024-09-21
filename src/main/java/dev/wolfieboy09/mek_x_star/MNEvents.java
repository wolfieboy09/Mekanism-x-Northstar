package dev.wolfieboy09.mek_x_star;

import dev.wolfieboy09.mek_x_star.registries.MNModules;
import mekanism.api.MekanismIMC;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;

import static dev.wolfieboy09.mek_x_star.MekanismNorthStar.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MNEvents {
    @SubscribeEvent
    public static void interModEnqueueEvent(InterModEnqueueEvent event) {
        MekanismIMC.addMekaSuitModules(MNModules.MODULE_SPACE_SUIT.get());
        MekanismIMC.addMekaSuitModules(MNModules.MODULE_SPACE_SUIT_INSULATION.get());
        MekanismIMC.addMekaSuitModules(MNModules.MODULE_HEAT_RESISTIVE.get());
        MekanismIMC.addMekaSuitBodyarmorModules(MNModules.MODULE_OXYGEN_TANK.get());

    }
}
