package dev.wolfieboy09.mek_x_star.modules;

import com.lightning.northstar.content.NorthstarDataComponents;
import com.lightning.northstar.content.NorthstarTags;
import com.lightning.northstar.util.NorthstarLang;
import dev.wolfieboy09.mek_x_star.registries.MNDataComponents;
import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;
import mekanism.api.gear.IModuleContainer;
import net.createmod.catnip.lang.LangNumberFormat;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.util.Unit;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

@ParametersAreNonnullByDefault
public class ModuleOxygenTank extends MNCommonModule<ModuleOxygenTank> {
    @Override
    protected @Nullable DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> getComponentType() {
        return MNDataComponents.OXYGEN_SOURCE;
    }

    @Override
    public void addHUDStrings(IModule<ModuleOxygenTank> module, IModuleContainer moduleContainer, ItemStack stack, Player player, Consumer<Component> hudStringAdder) {
        var oxygen = stack.get(NorthstarDataComponents.OXYGEN);
        if (oxygen == null || !NorthstarTags.NorthstarItemTags.OXYGEN_SOURCES.matches(stack)) return;

        MutableComponent tooltip = Component.translatable("northstar.gui.tooltip.oxygen")
                .append(LangNumberFormat.format(oxygen))
                .append(NorthstarLang.MB.component());

        hudStringAdder.accept(tooltip);
    }
}
