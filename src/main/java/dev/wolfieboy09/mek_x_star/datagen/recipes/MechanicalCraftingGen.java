package dev.wolfieboy09.mek_x_star.datagen.recipes;

import com.lightning.northstar.content.NorthstarTags;
import com.simibubi.create.api.data.recipe.MechanicalCraftingRecipeGen;
import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.registries.MNItems;
import dev.wolfieboy09.mek_x_star.tags.MNItemTags;
import mekanism.common.registries.MekanismItems;
import mekanism.common.tags.MekanismTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class MechanicalCraftingGen extends MechanicalCraftingRecipeGen {
    public MechanicalCraftingGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, MekanismNorthStar.MOD_ID);
    }

    GeneratedRecipe SPACE_SUIT_MODULE = create(MNItems.MODULE_SPACE_SUIT::get)
            .returns(1)
            .recipe(b -> b.key('I', MNItemTags.INSULATING)
                    .key('A', MekanismTags.Items.ALLOYS_ATOMIC)
                    .key('M', MekanismItems.MODULE_BASE)
                    .key('S', MekanismItems.HDPE_SHEET)
                    .key('P', MNItemTags.IRON_PLATES)
                    .key('C', MekanismTags.Items.CIRCUITS_ULTIMATE)
                    .key('L', NorthstarTags.NorthstarItemTags.C_GEMS_SAPPHIRE.tag())
                    .patternLine("AIIIA")
                    .patternLine("CSMSC")
                    .patternLine("PLILP")
                    .patternLine("SSSSS")
                    .disallowMirrored());
}
