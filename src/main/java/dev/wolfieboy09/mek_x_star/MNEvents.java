package dev.wolfieboy09.mek_x_star;

import dev.wolfieboy09.mek_x_star.registries.MNItems;
import mekanism.api.MekanismIMC;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;

import static dev.wolfieboy09.mek_x_star.MekanismNorthStar.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MNEvents {
    @SubscribeEvent
    public static void interModEnqueueEvent(InterModEnqueueEvent event) {
        MekanismIMC.addMekaSuitModules(MNItems.SPACE_SUIT_MARKER);
        MekanismIMC.addMekaSuitModules(MNItems.SPACE_SUIT_INSULATION_MARKER);
        MekanismIMC.addMekaSuitModules(MNItems.HEAT_RESISTIVE_MARKER);
        MekanismIMC.addMekaSuitBodyarmorModules(MNItems.OXYGEN_TANK_MARKER);
    }
}
