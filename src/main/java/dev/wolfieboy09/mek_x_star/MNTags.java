package dev.wolfieboy09.mek_x_star;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class MNTags {
    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MekanismNorthStar.MOD_ID, name));
        }

        public static final TagKey<Item> IS_SPACE_SUIT = tag("is_space_suit");
        public static final TagKey<Item> HEAT_RESISTANT = tag("heat_resistant");
        public static final TagKey<Item> INSULATING = tag("oxygen_sources");
    }
}
