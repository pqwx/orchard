/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIIl
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
import orchard.core.ModuleBase;
import orchard.internal.lIIlIlIl;

@Environment(value=EnvType.CLIENT)
final class IllIIl {
    boolean I;
    final int l;
    lIIlIlIl II;
    int Il;
    Runnable lI;
    final ModuleBase ll;
    final boolean III;
    boolean IIl;
    long IlI;

    IllIIl(ModuleBase moduleBase, int n, boolean bl, int n2, boolean bl2, boolean bl3, long l2, lIIlIlIl lIIlIlIl2, Runnable runnable) {
        this.ll = moduleBase;
        this.l = n;
        this.III = bl;
        this.Il = n2;
        this.I = bl2;
        this.IIl = bl3;
        this.IlI = l2;
        this.II = lIIlIlIl2;
        this.lI = runnable;
    }
}

