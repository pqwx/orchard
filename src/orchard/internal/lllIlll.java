/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - III
 *   - IlI
 *   - IIl
 *   - lII
 *   - Ill
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.util.Identifier
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;
import orchard.internal.llIllIll;
import orchard.net.SpotifyBridge;

@Environment(value=EnvType.CLIENT)
final class lllIlll
extends Record {
    private final llIllIll I;
    private final String l;
    private final long II;
    private final boolean Il;
    private final String lI;
    private final boolean ll;
    private final String III;
    private final long IIl;
    private final String IlI;
    private final boolean Ill;
    private final long lII;

    public long I() {
        return this.IIl;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lllIlll.class, "available;mediaId;title;artist;album;positionMs;durationMs;playing;observedAtMs;artworkAvailable;lyrics", "Il", "III", "lI", "IlI", "l", "II", "IIl", "ll", "lII", "Ill", "I"}, this);
    }

    double l(long l2) {
        return this.IIl > 0L ? Math.max(0.0, Math.min(1.0, (double)this.IIl(l2) / (double)this.IIl)) : 0.0;
    }

    public String II() {
        return this.lI;
    }

    public String Il() {
        return this.l;
    }

    public boolean lI() {
        return this.Il;
    }

    public boolean ll() {
        return this.ll;
    }

    /*
     * Enabled aggressive block sorting
     */
    lllIlll III(llIllIll llIllIll2) {
        llIllIll llIllIll3;
        if (llIllIll2 != null) {
            llIllIll3 = llIllIll2;
            return new lllIlll(this.Il, this.III, this.lI, this.IlI, this.l, this.II, this.IIl, this.ll, this.lII, this.Ill, llIllIll3);
        }
        llIllIll3 = llIllIll.I;
        return new lllIlll(this.Il, this.III, this.lI, this.IlI, this.l, this.II, this.IIl, this.ll, this.lII, this.Ill, llIllIll3);
    }

    lllIlll(boolean bl, String string, String string2, String string3, String string4, long l2, long l3, boolean bl2, long l4, boolean bl3, llIllIll llIllIll2) {
        this.Il = bl;
        this.III = string;
        this.lI = string2;
        this.IlI = string3;
        this.l = string4;
        this.II = l2;
        this.IIl = l3;
        this.ll = bl2;
        this.lII = l4;
        this.Ill = bl3;
        this.I = llIllIll2;
    }

    long IIl(long l2) {
        long l3 = this.II;
        if (this.ll) {
            l3 += Math.max(0L, l2 - this.lII);
        }
        return Math.max(0L, Math.min(l3, Math.max(0L, this.IIl)));
    }

    public String IlI() {
        return this.III;
    }

    public long Ill() {
        return this.II;
    }

    static lllIlll lII() {
        String string = SpotifyBridge.IIIII();
        return new lllIlll(false, string, string, string, string, 0L, 0L, false, 0L, false, llIllIll.I);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lllIlll.class, "available;mediaId;title;artist;album;positionMs;durationMs;playing;observedAtMs;artworkAvailable;lyrics", "Il", "III", "lI", "IlI", "l", "II", "IIl", "ll", "lII", "Ill", "I"}, this);
    }

    public long lIl() {
        return this.lII;
    }

    public String llI() {
        return this.IlI;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lllIlll.class, "available;mediaId;title;artist;album;positionMs;durationMs;playing;observedAtMs;artworkAvailable;lyrics", "Il", "III", "lI", "IlI", "l", "II", "IIl", "ll", "lII", "Ill", "I"}, this, object);
    }

    Identifier lll() {
        return !this.Ill ? null : SpotifyBridge.IIIIl();
    }

    public boolean IIII() {
        return this.Ill;
    }

    public llIllIll IIIl() {
        return this.I;
    }
}

