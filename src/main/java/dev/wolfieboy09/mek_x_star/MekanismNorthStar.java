package dev.wolfieboy09.mek_x_star;

import com.mojang.logging.LogUtils;
import dev.wolfieboy09.mek_x_star.registries.MNCreativeModTab;
import dev.wolfieboy09.mek_x_star.registries.MNItems;
import dev.wolfieboy09.mek_x_star.registries.MNModules;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(MekanismNorthStar.MOD_ID)
public class MekanismNorthStar {
    public static final String MOD_ID = "mek_x_star";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MekanismNorthStar(@NotNull FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        MNItems.ITEMS.register(modEventBus);
        MNItems.MODULES.register(modEventBus);
        MNModules.MODULES.register(modEventBus);
        LOGGER.info("Hello everybody my name is Markiplier and welcome to five nights at freddy's");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}
}
