package dev.wolfieboy09.mek_x_star.modules;

import com.lightning.northstar.content.NorthstarTags;
import com.lightning.northstar.util.NorthstarLang;
import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;
import net.createmod.catnip.lang.LangNumberFormat;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.player.Player;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;
import java.util.function.Consumer;

@ParametersAreNonnullByDefault
public class ModuleOxygenTank implements ICustomModule<ModuleOxygenTank> {
    public static final String TAG = "isOxygenTankModuleActive";

    @Override
    public void onAdded(IModule<ModuleOxygenTank> module, boolean first) {
        Objects.requireNonNull(module.getContainer().getOrCreateTag()).putBoolean(TAG, true);
    }

    @Override
    public void onRemoved(IModule<ModuleOxygenTank> module, boolean last) {
        Objects.requireNonNull(module.getContainer().getOrCreateTag()).putBoolean(TAG, false);
    }

    @Override
    public void addHUDStrings(IModule<ModuleOxygenTank> module, Player player, Consumer<Component> hudStringAdder) {
        CompoundTag tag = module.getContainer().getTag();

        if (tag == null || !NorthstarTags.NorthstarItemTags.OXYGEN_SOURCES.matches(module.getContainer())) {
            return;
        }

        MutableComponent tooltip = Component.translatable("northstar.gui.tooltip.oxygen")
                .append(LangNumberFormat.format(tag.getInt("Oxygen")))
                .append(NorthstarLang.MB.component());

        hudStringAdder.accept(tooltip);
    }
}