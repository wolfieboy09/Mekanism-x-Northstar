package dev.wolfieboy09.mek_x_star.datagen.recipes;

import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import com.simibubi.create.content.processing.recipe.ProcessingOutput;
import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.registries.MNItems;
import dev.wolfieboy09.mek_x_star.tags.MNItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.ItemStack;

import java.util.concurrent.CompletableFuture;

public class CrushingGen extends CrushingRecipeGen {
    public CrushingGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, MekanismNorthStar.MOD_ID);
    }

    GeneratedRecipe CRUSHED_WOOL = create("crushed_wool", builder ->
            builder.require(MNItemTags.WOOL)
                    .output(new ProcessingOutput(new ItemStack(MNItems.CRUSHED_WOOL.get(), 2), 1f))
                    .output(new ProcessingOutput(new ItemStack(MNItems.CRUSHED_WOOL.get(), 1), 0.15f)));

    GeneratedRecipe CRUSHED_WOOL_FROM_CARPET = create("crushed_wool_from_carpet", builder ->
            builder.require(MNItemTags.WOOL_CARPET)
                    .output(0.75f, MNItems.CRUSHED_WOOL.get()));

}
