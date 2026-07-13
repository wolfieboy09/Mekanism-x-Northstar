package dev.wolfieboy09.mek_x_star.modules;

import com.lightning.northstar.config.NorthstarConfigs;
import com.simibubi.create.AllEnchantments;
import mekanism.api.gear.EnchantmentBasedModule;
import mekanism.api.gear.IModule;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.enchantment.Enchantment;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModuleOxygenTankExpansion extends EnchantmentBasedModule<ModuleOxygenTankExpansion> {
    @Override
    public void onRemoved(IModule<ModuleOxygenTankExpansion> module, boolean last) {
        super.onRemoved(module, last);
        CompoundTag tag = module.getContainer().getOrCreateTag();

        if (tag.contains("Oxygen", 3)) {
            tag.putInt("Oxygen", Math.min(tag.getInt("Oxygen"),
                    NorthstarConfigs.server().spacesuitBaseOxygen.get()
                            + NorthstarConfigs.server().spacesuitAdditionalOxygen.get()
                            // module#getInstalledCount never reaches zero, therefor this silly workaround works
                            * module.getContainer().getEnchantmentLevel(AllEnchantments.CAPACITY.get())));
        }
    }

    @Override
    public @NotNull Enchantment getEnchantment() {
        return AllEnchantments.CAPACITY.get();
    }
}
