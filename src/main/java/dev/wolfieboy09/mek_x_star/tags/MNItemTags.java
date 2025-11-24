package dev.wolfieboy09.mek_x_star.tags;

import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class MNItemTags {

    public static final TagKey<Item> INSULATING = modTag("insulating");
    public static final TagKey<Item> HEAT_RESISTIVE = modTag("heat_resistive");
    public static final TagKey<Item> CRUSHED_WOOL = modTag("crushed_wool");
    public static final TagKey<Item> WOOL = minecraftTag("wool");
    public static final TagKey<Item> WOOL_CARPET = minecraftTag("wool_carpets");

    public static final TagKey<Item> IRON_PLATES = commonTag("plates/iron");

    private static @NotNull TagKey<Item> modTag(String path) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MekanismNorthStar.MOD_ID, path));
    }

    private static @NotNull TagKey<Item> commonTag(String path) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", path));
    }

    private static @NotNull TagKey<Item> minecraftTag(String path) {
        return TagKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace(path));
    }
}
