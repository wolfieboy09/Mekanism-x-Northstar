package dev.wolfieboy09.mek_x_star.datagen.recipes;

import com.lightning.northstar.block.tech.circuit_engraver.EngravingRecipe;
import com.simibubi.create.api.data.recipe.SequencedAssemblyRecipeGen;
import com.simibubi.create.content.kinetics.deployer.DeployerApplicationRecipe;
import com.simibubi.create.content.kinetics.press.PressingRecipe;
import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.registries.MNItems;
import mekanism.common.registries.MekanismItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class MNSequencedCraftingGen extends SequencedAssemblyRecipeGen {
    public MNSequencedCraftingGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, MekanismNorthStar.MOD_ID);
    }

    GeneratedRecipe OXYGEN_TANK_EXPANSION = create("oxygen_tank_expansion_module", r ->
            r.transitionTo(MNItems.INCOMPLETE_OXYGEN_TANK_EXPANSION_MODULE)
                    .loops(2)
                    .require(MNItems.MODULE_OXYGEN_TANK)
                    .addStep(DeployerApplicationRecipe::new, b -> b.require(MNItems.PRESSURIZED_DURASTEEL))
                    .addStep(DeployerApplicationRecipe::new, b -> b.require(MekanismItems.ATOMIC_ALLOY))
                    .addStep(EngravingRecipe::new,  b -> b.duration(500))
                    .addStep(DeployerApplicationRecipe::new, b -> b.require(MekanismItems.HDPE_SHEET))
                    .addStep(PressingRecipe::new, b -> b)
                    .addOutput(MNItems.MODULE_OXYGEN_TANK_EXPANSION, 1)
    );
}
