package dev.wolfieboy09.mek_x_star.datagen.recipes;

import com.simibubi.create.AllItems;
import com.simibubi.create.AllTags;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.registries.MNItems;
import dev.wolfieboy09.mek_x_star.tags.MNItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class MixingGen extends MixingRecipeGen {
    public MixingGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, MekanismNorthStar.MOD_ID);
    }

    GeneratedRecipe INSULATION = create("insulation", builder -> builder
            .require(MNItemTags.CRUSHED_WOOL)
            .require(MNItemTags.CRUSHED_WOOL)
            .require(AllItems.CRUSHED_COPPER)
            .require(AllItems.CRUSHED_COPPER)
            .require(AllItems.CRUSHED_IRON)
            .output(MNItems.INSULATION)
    );
}
