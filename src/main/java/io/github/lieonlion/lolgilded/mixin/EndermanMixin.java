package io.github.lieonlion.lolgilded.mixin;

import io.github.lieonlion.lolgilded.init.ItemInit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public abstract class EndermanMixin extends Entity {

    protected EndermanMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "isPlayerStaring", at = @At(value = "HEAD"), cancellable = true)
    void isPlayerWearingEnderMask(PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
        ItemStack itemStack = player.getInventory().armor.get(3);
        if (itemStack.getItem() == ItemInit.GILDED_ENDERITE_HELMET) {
            cir.setReturnValue(false);
        }
    }
}