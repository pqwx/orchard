/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIllIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
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

import java.awt.image.BufferedImage;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class IlIllIIIl
extends Record {
    private final int I;
    private final int l;
    private final BufferedImage II;
    private final long Il;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIllIIIl.class, "image;scaledWidth;scaledHeight;capturedAtMs", "II", "l", "I", "Il"}, this, object);
    }

    public int I() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIllIIIl.class, "image;scaledWidth;scaledHeight;capturedAtMs", "II", "l", "I", "Il"}, this);
    }

    public BufferedImage l() {
        return this.II;
    }

    public int II() {
        return this.l;
    }

    public IlIllIIIl(BufferedImage bufferedImage, int n, int n2, long l2) {
        this.II = bufferedImage;
        this.l = n;
        this.I = n2;
        this.Il = l2;
    }

    public long Il() {
        return this.Il;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIllIIIl.class, "image;scaledWidth;scaledHeight;capturedAtMs", "II", "l", "I", "Il"}, this);
    }
}

