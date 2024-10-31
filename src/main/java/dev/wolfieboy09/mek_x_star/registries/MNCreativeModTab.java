package dev.wolfieboy09.mek_x_star.registries;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

import static dev.wolfieboy09.mek_x_star.MekanismNorthStar.MOD_ID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = MOD_ID)
public class MNCreativeModTab {
    public static CreativeModeTab TAB = new CreativeModeTab("items") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(MNItems.MODULE_SPACE_SUIT.get());
        }
    };
}
