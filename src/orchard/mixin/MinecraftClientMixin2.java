/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIlllllll
 * Mixin target   : MinecraftClient
 *
 * Recovered strings in this class:
 *   - itemUseCooldown
 *   - attackCooldown
 *   - doItemUse
 *   - doAttack
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(value=EnvType.CLIENT)
@Mixin(value={MinecraftClient.class})
public interface MinecraftClientMixin2 {
    @Accessor(value="attackCooldown")
    public int q96_getAttackCooldown();

    @Invoker(value="doItemUse")
    public void q96_doItemUse();

    @Accessor(value="attackCooldown")
    public void q96_setAttackCooldown(int var1);

    @Accessor(value="attackCooldown")
    public void ilovcats$setAtkCd(int var1);

    @Accessor(value="attackCooldown")
    public int ilovcats$getAtkCd();

    @Accessor(value="attackCooldown")
    public void q96_setAtkCd(int var1);

    @Accessor(value="itemUseCooldown")
    public void q96_setItemUseCooldown(int var1);

    @Accessor(value="itemUseCooldown")
    public int ilovcats$getUseCd();

    @Accessor(value="attackCooldown")
    public int q96_getAtkCd();

    @Accessor(value="itemUseCooldown")
    public int q96_getItemUseCooldown();

    @Accessor(value="attackCooldown")
    public void ilovcats$setAttackCooldown(int var1);

    @Accessor(value="attackCooldown")
    public int ilovcats$getAttackCooldown();

    @Invoker(value="doAttack")
    public boolean q96_doAttack();

    @Accessor(value="itemUseCooldown")
    public int q96_getUseCd();

    @Accessor(value="itemUseCooldown")
    public void q96_setUseCd(int var1);

    @Accessor(value="itemUseCooldown")
    public void ilovcats$setUseCd(int var1);
}

