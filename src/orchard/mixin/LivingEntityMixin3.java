/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.lIIlII
 * Mixin target   : LivingEntity
 *
 * Recovered strings in this class:
 *   - jumpingCooldown
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.entity.LivingEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(value=EnvType.CLIENT)
@Mixin(value={LivingEntity.class})
public interface LivingEntityMixin3 {
    @Accessor(value="jumpingCooldown")
    public void virel$setJumpingCooldown(int var1);

    @Accessor(value="jumpingCooldown")
    public void ilovcats$setJumpingCooldown(int var1);
}

