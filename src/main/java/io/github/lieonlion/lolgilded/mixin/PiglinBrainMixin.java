package io.github.lieonlion.lolgilded.mixin;

import io.github.lieonlion.lolgilded.init.ArmorMaterialInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;


@Mixin(PiglinBrain.class)
public abstract class PiglinBrainMixin {
    @Inject(method={"wearsGoldArmor"}, at={@At(value="HEAD") }, cancellable=true, locals = LocalCapture.CAPTURE_FAILHARD)
    private static void wearsGoldArmor(final LivingEntity entity, final CallbackInfoReturnable<Boolean> cir) {
        for (final ItemStack stack : entity.getArmorItems()) {
            final Item item = stack.getItem();
            if (item instanceof ArmorItem && ((ArmorItem) item).getMaterial() == ArmorMaterialInit.GILDED_NETHERITE ||
                    item instanceof ArmorItem && ((ArmorItem) item).getMaterial()  == ArmorMaterialInit.GILDED_ENDERITE) {
                cir.setReturnValue(true);
            }
        }
    }
}