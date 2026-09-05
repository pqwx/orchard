/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllllll
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
class llllllll
implements Runnable {
    final /* synthetic */ long I;
    final /* synthetic */ FastXP l;

    @Override
    public void run() {
        this.l.Illl = System.currentTimeMillis() + this.I;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    llllllll(FastXP fastXP, long l2) {
        this.I = l2;
        this.l = fastXP;
    }
}

