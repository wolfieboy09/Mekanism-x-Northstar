package dev.wolfieboy09.mek_x_star.mixins;

import com.lightning.northstar.content.NorthstarTags;
import dev.wolfieboy09.mek_x_star.registries.MNDataComponents;
import net.minecraft.core.component.DataComponentHolder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.neoforge.common.extensions.IItemStackExtension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin implements DataComponentHolder, MutableDataComponentHolder, IItemStackExtension {
    @Unique
    private ItemStack mekanismXNorthstar$self() {
        return (ItemStack) (Object) this;
    }

    @Inject(method = "is(Lnet/minecraft/tags/TagKey;)Z", at = @At("HEAD"), cancellable = true)
    private void gaslightMinecraft(TagKey<Item> tag, CallbackInfoReturnable<Boolean> cir) {
        ItemStack self = mekanismXNorthstar$self();

        if (tag == NorthstarTags.NorthstarItemTags.INSULATING.tag() && self.has(MNDataComponents.INSULATING)) {
            cir.setReturnValue(true);
        }

        if (tag == NorthstarTags.NorthstarItemTags.OXYGEN_SEALING.tag() && self.has(MNDataComponents.OXYGEN_SEALING)) {
            cir.setReturnValue(true);
        }

        if (tag == NorthstarTags.NorthstarItemTags.HEAT_RESISTANT.tag() && self.has(MNDataComponents.HEAT_RESISTANT)) {
            cir.setReturnValue(true);
        }

        if (tag == NorthstarTags.NorthstarItemTags.OXYGEN_SOURCES.tag() && self.has(MNDataComponents.OXYGEN_SOURCE)) {
            cir.setReturnValue(true);
        }
    }
}
