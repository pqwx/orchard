/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllIII
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
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.module.player.FastXP;

@Environment(value=EnvType.CLIENT)
class IIlllIII
implements Runnable {
    final /* synthetic */ FastXP I;
    final /* synthetic */ long l;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    IIlllIII(FastXP fastXP, long l2) {
        this.l = l2;
        this.I = fastXP;
    }

    @Override
    public void run() {
        this.I.IllI = System.currentTimeMillis() + this.l;
    }
}

