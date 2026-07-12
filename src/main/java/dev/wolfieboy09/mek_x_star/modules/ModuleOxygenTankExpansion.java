package dev.wolfieboy09.mek_x_star.modules;

import com.lightning.northstar.content.NorthstarTags;
import com.lightning.northstar.world.oxygen.NorthstarOxygen;
import mekanism.api.gear.ICustomModule;
import mekanism.api.gear.IModule;
import net.minecraft.nbt.CompoundTag;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModuleOxygenTankExpansion implements ICustomModule<ModuleOxygenTankExpansion> {
    public static final String TAG = "oxygenTankExpansions";

    @Override
    public void onAdded(IModule<ModuleOxygenTankExpansion> module, boolean first) {
        module.getContainer().getOrCreateTag().putInt(TAG, module.getInstalledCount());
    }

    @Override
    public void onRemoved(IModule<ModuleOxygenTankExpansion> module, boolean last) {
        CompoundTag tag = module.getContainer().getOrCreateTag();
        tag.putInt(TAG, module.getInstalledCount());

//        if (tag.contains(NorthstarTags.NorthstarItemTags.OXYGEN_SEALING.tag.location().toString())) {
//
//        }

    }
}
