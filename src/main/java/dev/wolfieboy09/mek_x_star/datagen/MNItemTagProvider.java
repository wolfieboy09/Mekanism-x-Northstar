package dev.wolfieboy09.mek_x_star.datagen;

import dev.wolfieboy09.mek_x_star.registries.MNItems;
import dev.wolfieboy09.mek_x_star.tags.MNItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class MNItemTagProvider extends ItemTagsProvider {
    public MNItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(MNItemTags.HEAT_RESISTIVE)
                .add(MNItems.HEAT_INSULATION.get());

        tag(MNItemTags.INSULATING)
                .add(MNItems.INSULATION.get());

        tag(MNItemTags.CRUSHED_WOOL)
                .add(MNItems.CRUSHED_WOOL.get());

    }
}
