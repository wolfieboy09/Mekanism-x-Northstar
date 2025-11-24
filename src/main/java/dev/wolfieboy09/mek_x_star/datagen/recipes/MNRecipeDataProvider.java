package dev.wolfieboy09.mek_x_star.datagen.recipes;

import com.lightning.northstar.content.NorthstarItems;
import com.simibubi.create.AllItems;
import dev.wolfieboy09.mek_x_star.registries.MNItems;
import dev.wolfieboy09.mek_x_star.tags.MNItemTags;
import mekanism.common.registries.MekanismItems;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

@ParametersAreNonnullByDefault
public class MNRecipeDataProvider extends RecipeProvider {
    public MNRecipeDataProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MNItems.HEAT_INSULATION)
                .define('I', MNItemTags.INSULATING)
                .define('C', NorthstarItems.MARTIAN_STEEL)
                .define('W', Items.BLAZE_POWDER)
                .pattern("CIW")
                .unlockedBy("has_martian_steel", has(NorthstarItems.MARTIAN_STEEL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MNItems.MODULE_HEAT_RESISTIVE)
                .define('I', MNItems.HEAT_INSULATION)
                .define('M', MekanismItems.MODULE_BASE)
                .define('S', MekanismItems.HDPE_SHEET)
                .define('P', MNItemTags.IRON_PLATES)
                .pattern("III")
                .pattern("IMI")
                .pattern("PSP")
                .unlockedBy("has_heat_insulation", has(MNItems.HEAT_INSULATION))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MNItems.MODULE_OXYGEN_TANK)
                .define('I', MNItemTags.IRON_PLATES)
                .define('M', MekanismItems.MODULE_BASE)
                .define('B', AllItems.NETHERITE_BACKTANK)
                .define('A', MNItemTags.INSULATING)
                .pattern("IBI")
                .pattern("IMI")
                .pattern("AIA")
                .unlockedBy("has_netherite_backtank", has(AllItems.NETHERITE_BACKTANK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MNItems.MODULE_SPACE_SUIT_INSULATION)
                .define('I', MNItemTags.INSULATING)
                .define('M', MekanismItems.MODULE_BASE)
                .define('S', MekanismItems.HDPE_SHEET)
                .define('P', MNItemTags.IRON_PLATES)
                .pattern("III")
                .pattern("IMI")
                .pattern("PSP")
                .unlockedBy("has_insulation", has(MNItemTags.INSULATING))
                .save(recipeOutput);
    }
}
