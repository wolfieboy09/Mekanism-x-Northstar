package dev.wolfieboy09.mek_x_star;

import com.mojang.logging.LogUtils;
import com.simibubi.create.AllEnchantments;
import dev.wolfieboy09.mek_x_star.registries.MNCreativeModeTab;
import dev.wolfieboy09.mek_x_star.registries.MNDataComponents;
import dev.wolfieboy09.mek_x_star.registries.MNItems;
import dev.wolfieboy09.mek_x_star.registries.MNModules;
import mekanism.api.MekanismIMC;
import mekanism.common.registries.MekanismItems;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.enchanting.GetEnchantmentLevelEvent;
import org.slf4j.Logger;

@Mod(MekanismNorthStar.MOD_ID)
public class MekanismNorthStar {
    public static final String MOD_ID = "mek_x_star";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MekanismNorthStar(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("So much space here... forever or not... the universe.... anyways time to colonize");
        MNDataComponents.REGISTAR.register(modEventBus);
        MNItems.ITEMS.register(modEventBus);
        MNModules.MODULES.register(modEventBus);
        MNCreativeModeTab.REGISTER.register(modEventBus);

        modEventBus.addListener(MekanismNorthStar::registerMekanismModules);
        NeoForge.EVENT_BUS.addListener(MekanismNorthStar::bodyarmorExpansions);
    }

    public static void bodyarmorExpansions(GetEnchantmentLevelEvent event) {
        ItemStack stack = event.getStack();
        Holder<Enchantment> target = event.getTargetEnchant();
        if (!stack.is(MekanismItems.MEKASUIT_BODYARMOR)
                || (target == null || !target.is(AllEnchantments.CAPACITY))
                || !stack.has(MNDataComponents.OXYGEN_EXPANSIONS)) return;

        event.getEnchantments().set(target, stack.get(MNDataComponents.OXYGEN_EXPANSIONS));
    }

    public static void registerMekanismModules(InterModEnqueueEvent event) {
        MekanismIMC.addMekaSuitModules(
                MNModules.MODULE_HEAT_RESISTIVE,
                MNModules.MODULE_SPACE_SUIT,
                MNModules.MODULE_SPACE_SUIT_INSULATION);

        MekanismIMC.addMekaSuitBodyarmorModules(MNModules.MODULE_OXYGEN_TANK, MNModules.MODULE_OXYGEN_TANK_EXPANSION);
    }
}
