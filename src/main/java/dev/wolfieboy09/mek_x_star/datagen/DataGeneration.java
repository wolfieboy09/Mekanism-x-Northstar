package dev.wolfieboy09.mek_x_star.datagen;

import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.datagen.recipes.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = MekanismNorthStar.MOD_ID)
public class DataGeneration {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        MNBlockTagProvider blockTagsProvider = new MNBlockTagProvider(output, lookupProvider, existingFileHelper);

       generator.addProvider(event.includeServer(), blockTagsProvider);
       generator.addProvider(event.includeServer(), new MNRecipeDataProvider(output));
       generator.addProvider(event.includeServer(), new MNMechanicalCraftingRecipeGen(output));
       generator.addProvider(event.includeServer(), new MNCrushingGen(output));
       generator.addProvider(event.includeServer(), new MNMixingGen(output));
       generator.addProvider(event.includeServer(), new MNItemTagProvider(output, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
       generator.addProvider(event.includeServer(), new MNSequencedCraftingGen(output));

    }
}
