/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.entity.player.PlayerEntity
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerEntity;
import orchard.internal.lIlIIIII;

@Environment(value=EnvType.CLIENT)
final class IIlIlllIl {
    private long I;
    private final PlayerEntity l;
    private final lIlIIIII II = new lIlIIIII();
    private long Il = Long.MIN_VALUE;
    private final long lI;

    private IIlIlllIl(PlayerEntity playerEntity, long l2) {
        this.l = playerEntity;
        this.lI = l2;
        this.I = l2;
    }
}

