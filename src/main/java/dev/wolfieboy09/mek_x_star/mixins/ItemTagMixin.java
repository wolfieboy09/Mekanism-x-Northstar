package dev.wolfieboy09.mek_x_star.mixins;

import com.lightning.northstar.NorthstarTags.NorthstarItemTags;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class ItemTagMixin {
    @Unique
    private ItemStack mekanismXNorthstar$self() {
        return (ItemStack) (Object) this;
    }

    @Inject(method = "is(Lnet/minecraft/tags/TagKey;)Z", at=@At("HEAD"), cancellable = true)
    private void gaslightMinecraft(TagKey<Item> pTag, CallbackInfoReturnable<Boolean> cir) {
        CompoundTag tag = mekanismXNorthstar$self().getTag();
        if (tag != null) {
            if (pTag == NorthstarItemTags.INSULATING.tag && tag.getBoolean("isInsulationModuleActive")) {
                cir.setReturnValue(true);
            }
            if (pTag == NorthstarItemTags.OXYGEN_SEALING.tag && tag.getBoolean("isSpaceModuleActive")) {
                cir.setReturnValue(true);
            }
            if (pTag == NorthstarItemTags.HEAT_RESISTANT.tag && tag.getBoolean("isInsulationModuleActive")) {
                cir.setReturnValue(true);
            }
            if (pTag == NorthstarItemTags.OXYGEN_SOURCES.tag && tag.getBoolean("isOxygenTankActive")) {
                cir.setReturnValue(true);
            }
        }
    }
}
