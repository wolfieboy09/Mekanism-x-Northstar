package dev.wolfieboy09.mek_x_star.datagen;

import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.datagen.recipes.MNRecipeDataProvider;
import dev.wolfieboy09.mek_x_star.datagen.recipes.MechanicalCraftingGen;
import dev.wolfieboy09.mek_x_star.datagen.recipes.CrushingGen;
import dev.wolfieboy09.mek_x_star.datagen.recipes.MixingGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = MekanismNorthStar.MOD_ID)
public class DataGeneration {
    @SubscribeEvent
    public static void gatherData(@NotNull GatherDataEvent event) {
        PackOutput output = event.getGenerator().getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        MNBlockTagProvider blockTagsProvider = new MNBlockTagProvider(output, lookupProvider, existingFileHelper);

        event.addProvider(blockTagsProvider);
        event.addProvider(new MNRecipeDataProvider(output, lookupProvider));
        event.addProvider(new MechanicalCraftingGen(output, lookupProvider));
        event.addProvider(new CrushingGen(output, lookupProvider));
        event.addProvider(new MixingGen(output, lookupProvider));
        event.addProvider(new MNItemTagProvider(output, lookupProvider, blockTagsProvider.contentsGetter()));
    }
}
