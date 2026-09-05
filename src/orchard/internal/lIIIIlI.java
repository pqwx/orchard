/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIIlI
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
import orchard.internal.IIlIIIIIl;
import orchard.internal.IIllllll;
import orchard.internal.IllIllI;

@Environment(value=EnvType.CLIENT)
final class lIIIIlI {
    private boolean I;
    private IIllllll l;
    private Runnable II;
    private boolean Il;
    private long lI;
    private IllIllI ll;
    private final int III;
    private final IllIllI IIl;
    private final int IlI;
    private final IIlIIIIIl Ill;
    private int lII;
    private final IllIllI lIl;

    private lIIIIlI(IIlIIIIIl iIlIIIIIl, int n, IllIllI illIllI, int n2, IllIllI illIllI2, int n3, IllIllI illIllI3, boolean bl, Runnable runnable) {
        this.Ill = iIlIIIIIl;
        this.III = n;
        this.lIl = illIllI;
        this.IlI = n2;
        this.IIl = illIllI2;
        this.lII = n3;
        this.ll = illIllI3;
        this.Il = bl;
        this.II = runnable;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean I(int n, IIllllll iIllllll) {
        if (this.lI == Long.MAX_VALUE) return false;
        if ((long)n < this.lI) return false;
        if (this.ll == IllIllI.II) {
            if (iIllllll != IIllllll.Il) return false;
        }
        if (iIllllll.ordinal() < this.l.ordinal()) return false;
        return true;
    }
}

