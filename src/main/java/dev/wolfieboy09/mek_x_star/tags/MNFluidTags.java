package dev.wolfieboy09.mek_x_star.tags;

import com.lightning.northstar.Northstar;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public class MNFluidTags {
    public static final TagKey<Fluid> N_IS_OXY = northstarTag("is_oxy");
    public static final TagKey<Fluid> TIER_3_ROCKET_FUEL = northstarTag("tier_3_rocket_fuel");


    public static TagKey<Fluid> northstarTag(String path) {
        return TagKey.create(Registries.FLUID, ResourceLocation.fromNamespaceAndPath(Northstar.MOD_ID, path));
    }
}
