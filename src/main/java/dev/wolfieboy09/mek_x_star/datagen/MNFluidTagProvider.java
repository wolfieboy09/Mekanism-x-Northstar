package dev.wolfieboy09.mek_x_star.datagen;

import dev.wolfieboy09.mek_x_star.MekanismNorthStar;
import dev.wolfieboy09.mek_x_star.tags.MNFluidTags;
import mekanism.common.registries.MekanismFluids;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

@ParametersAreNonnullByDefault
public class MNFluidTagProvider extends FluidTagsProvider {
    public MNFluidTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pProvider, MekanismNorthStar.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(MNFluidTags.N_IS_OXY)
                .add(MekanismFluids.OXYGEN.getFluid())
                .add(MekanismFluids.OXYGEN.getFlowingFluid());

        tag(MNFluidTags.TIER_3_ROCKET_FUEL)
                .add(MekanismFluids.HYDROGEN.getFluid())
                .add(MekanismFluids.HYDROGEN.getFlowingFluid());
    }
}
