package dev.wolfieboy09.mek_x_star.datagen.recipes;

import com.lightning.northstar.content.NorthstarItems;
import com.lightning.northstar.content.NorthstarTags;
import com.simibubi.create.AllItems;
import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.registries.MNItems;
import dev.wolfieboy09.mek_x_star.tags.MNItemTags;
import mekanism.api.datagen.recipe.builder.ItemStackChemicalToItemStackRecipeBuilder;
import mekanism.api.datagen.recipe.builder.PressurizedReactionRecipeBuilder;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import mekanism.common.registries.MekanismGases;
import mekanism.common.registries.MekanismInfuseTypes;
import mekanism.common.registries.MekanismItems;
import mekanism.common.tags.MekanismTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

@ParametersAreNonnullByDefault
public class MNRecipeDataProvider extends RecipeProvider {
    public MNRecipeDataProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MNItems.HEAT_INSULATION.get())
                .define('I', MNItemTags.INSULATING)
                .define('C', NorthstarItems.MARTIAN_STEEL_SHEET)
                .define('W', Items.BLAZE_POWDER)
                .pattern("CIW")
                .unlockedBy("has_martian_steel", has(NorthstarItems.MARTIAN_STEEL_SHEET))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MNItems.MODULE_HEAT_RESISTANT.get())
                .define('I', MNItems.HEAT_INSULATION.get())
                .define('M', MekanismItems.MODULE_BASE)
                .define('S', MekanismItems.HDPE_SHEET)
                .define('P', MNItemTags.IRON_PLATES)
                .pattern("III")
                .pattern("IMI")
                .pattern("PSP")
                .unlockedBy("has_heat_insulation", has(MNItems.HEAT_INSULATION.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MNItems.MODULE_OXYGEN_TANK.get())
                .define('I', MNItemTags.IRON_PLATES)
                .define('M', MekanismItems.MODULE_BASE)
                .define('B', AllItems.NETHERITE_BACKTANK)
                .define('A', MNItemTags.INSULATING)
                .pattern("IBI")
                .pattern("IMI")
                .pattern("AIA")
                .unlockedBy("has_netherite_backtank", has(AllItems.NETHERITE_BACKTANK))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MNItems.MODULE_SPACE_SUIT_INSULATION.get())
                .define('I', MNItemTags.INSULATING)
                .define('M', MekanismItems.MODULE_BASE)
                .define('S', MekanismItems.HDPE_SHEET)
                .define('P', MNItemTags.IRON_PLATES)
                .pattern("III")
                .pattern("IMI")
                .pattern("PSP")
                .unlockedBy("has_insulation", has(MNItemTags.INSULATING))
                .save(writer);

        ItemStackChemicalToItemStackRecipeBuilder.metallurgicInfusing(
                IngredientCreatorAccess.item().from(MekanismTags.Items.INGOTS_STEEL),
                IngredientCreatorAccess.infusion().from(MekanismTags.InfuseTypes.CARBON, 40),
                new ItemStack(MNItems.DURASTEEL.get())
        ).build(writer);

        PressurizedReactionRecipeBuilder.reaction(
                IngredientCreatorAccess.item().from(MNItemTags.DURASTEEL_INGOT),
                IngredientCreatorAccess.fluid().from(NorthstarTags.NorthstarFluidTags.C_TITANIUM_TETRACHLORIDE.tag, 50),
                IngredientCreatorAccess.gas().from(MekanismGases.LITHIUM.get(), 100),
                100,
                new ItemStack(MNItems.PRESSURIZED_DURASTEEL.get())
        ).build(writer, ResourceLocation.fromNamespaceAndPath(MekanismNorthStar.MOD_ID, "pressurized_durasteel"));
    }
}