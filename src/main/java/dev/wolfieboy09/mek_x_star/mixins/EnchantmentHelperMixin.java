package dev.wolfieboy09.mek_x_star.mixins;

import com.simibubi.create.AllEnchantments;
import dev.wolfieboy09.mek_x_star.modules.ModuleOxygenTankExpansion;
import mekanism.common.registries.MekanismItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentHelper.class)
public abstract class EnchantmentHelperMixin {
    @Inject(method = "getTagEnchantmentLevel", at = @At("HEAD"), cancellable = true)
    private static void reportMekaSuitBodyArmor(Enchantment pEnchantment, ItemStack pStack, CallbackInfoReturnable<Integer> cir) {
        if (!pStack.isEmpty()) {
            CompoundTag compoundTag = pStack.getTag();
            if (pStack.is(MekanismItems.MEKASUIT_BODYARMOR.get())
                    && AllEnchantments.CAPACITY.is(pEnchantment)
                    && compoundTag != null
                    && compoundTag.contains(ModuleOxygenTankExpansion.TAG)) {
                cir.setReturnValue(compoundTag.getInt(ModuleOxygenTankExpansion.TAG));
            }
        }
    }
}
