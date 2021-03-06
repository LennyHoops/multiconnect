package net.earthcomputer.multiconnect.protocols.v1_11_2.mixin;

import net.earthcomputer.multiconnect.impl.MixinHelper;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(PlayerEntity.class)
public interface PlayerEntityAccessor {
    @Accessor("LEFT_SHOULDER_ENTITY")
    static TrackedData<CompoundTag> getLeftShoulderEntity() {
        return MixinHelper.fakeInstance();
    }

    @Accessor("RIGHT_SHOULDER_ENTITY")
    static TrackedData<CompoundTag> getRightShoulderEntity() {
        return MixinHelper.fakeInstance();
    }
}
