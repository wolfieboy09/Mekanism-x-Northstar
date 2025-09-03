package dev.wolfieboy09.mek_x_star.compact;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class NorthstarTags {
    public static final TagKey<Item> OXYGEN_SEALING = TagKey.create(Registries.ITEM, new ResourceLocation("northstar:oxygen_sealing"));
    public static final TagKey<Item> OXYGEN_SOURCES = TagKey.create(Registries.ITEM, new ResourceLocation("northstar:oxygen_sources"));
    public static final TagKey<Item> INSULATING = TagKey.create(Registries.ITEM, new ResourceLocation("northstar:insulating"));
    public static final TagKey<Item> HEAT_RESISTANT = TagKey.create(Registries.ITEM, new ResourceLocation("northstar:heat_resistant"));
}
