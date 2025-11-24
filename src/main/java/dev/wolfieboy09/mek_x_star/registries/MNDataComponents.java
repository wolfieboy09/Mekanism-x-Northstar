package dev.wolfieboy09.mek_x_star.registries;

import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.Unit;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

public final class MNDataComponents {
    public static final DeferredRegister.DataComponents REGISTAR = DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, MekanismNorthStar.MOD_ID);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> HEAT_RESISTANT = ofEmpty("heat_resistant");
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> OXYGEN_SOURCE = ofEmpty("oxygen_source");
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> OXYGEN_SEALING = ofEmpty("oxygen_sealing");
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> INSULATING = ofEmpty("insulating");

    private static @NotNull DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> ofEmpty(String id) {
        return REGISTAR.registerComponentType(id, builder -> builder.persistent(Unit.CODEC));
    }
}
