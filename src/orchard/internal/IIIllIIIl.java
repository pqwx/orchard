/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - III
 *   - IlI
 *   - IIl
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

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.net.SpotifyBridge;

@Environment(value=EnvType.CLIENT)
final class IIIllIIIl
extends Record {
    private final long I;
    private final long l;
    private final byte[] II;
    private final String Il;
    private final String lI;
    private final boolean ll;
    private final boolean III;
    private final String IIl;
    private final String IlI;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIllIIIl.class, "available;mediaId;title;artist;album;positionMs;durationMs;playing;artworkBytes", "III", "IlI", "Il", "lI", "IIl", "I", "l", "ll", "II"}, this);
    }

    public String I() {
        return this.Il;
    }

    IIIllIIIl(boolean bl, String string, String string2, String string3, String string4, long l2, long l3, boolean bl2, byte[] byArray) {
        this.III = bl;
        this.IlI = string;
        this.Il = string2;
        this.lI = string3;
        this.IIl = string4;
        this.I = l2;
        this.l = l3;
        this.ll = bl2;
        this.II = byArray;
    }

    public String l() {
        return this.IIl;
    }

    public long II() {
        return this.I;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIllIIIl.class, "available;mediaId;title;artist;album;positionMs;durationMs;playing;artworkBytes", "III", "IlI", "Il", "lI", "IIl", "I", "l", "ll", "II"}, this, object);
    }

    public String Il() {
        return this.lI;
    }

    public boolean lI() {
        return this.III;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIllIIIl.class, "available;mediaId;title;artist;album;positionMs;durationMs;playing;artworkBytes", "III", "IlI", "Il", "lI", "IIl", "I", "l", "ll", "II"}, this);
    }

    public byte[] ll() {
        return this.II;
    }

    public String III() {
        return this.IlI;
    }

    static IIIllIIIl IIl() {
        String string = SpotifyBridge.IIIII();
        return new IIIllIIIl(false, string, string, string, string, 0L, 0L, false, null);
    }

    public boolean IlI() {
        return this.ll;
    }

    public long Ill() {
        return this.l;
    }
}

