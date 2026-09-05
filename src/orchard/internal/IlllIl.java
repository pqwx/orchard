/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
 *   - III
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
import orchard.internal.IlIlIlI;

@Environment(value=EnvType.CLIENT)
public final class IlllIl
extends Record {
    private final float I;
    private final float l;
    private final float II;
    private final float Il;
    private final float lI;
    private final float ll;
    private final float III;
    private final float IIl;

    public float I() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlllIl.class, "smoothness;reactionTimeSeconds;aimDrift;handTremor;pitchRatio;overshoot;horizontalSpeed;verticalSpeed", "lI", "III", "ll", "Il", "I", "II", "IIl", "l"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlllIl.class, "smoothness;reactionTimeSeconds;aimDrift;handTremor;pitchRatio;overshoot;horizontalSpeed;verticalSpeed", "lI", "III", "ll", "Il", "I", "II", "IIl", "l"}, this, object);
    }

    public float l() {
        return this.lI;
    }

    static IlllIl II() {
        return new IlllIl(0.85f, 0.08f, 0.0f, 0.0f, 0.65f, 0.0f, 1.0f, 1.0f);
    }

    public float Il() {
        return this.IIl;
    }

    public float lI() {
        return this.II;
    }

    public float ll() {
        return this.III;
    }

    public float III() {
        return this.Il;
    }

    IlllIl(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this(f, f2, f3, f4, f5, 0.0f, f6, f7);
    }

    public float IIl() {
        return this.ll;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlllIl.class, "smoothness;reactionTimeSeconds;aimDrift;handTremor;pitchRatio;overshoot;horizontalSpeed;verticalSpeed", "lI", "III", "ll", "Il", "I", "II", "IIl", "l"}, this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public IlllIl(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        f = IlIlIlI.IllIIl(f, 0.0f, 1.0f);
        f2 = IlIlIlI.IllIIl(f2, 0.0f, 0.5f);
        f3 = IlIlIlI.IllIIl(f3, 0.0f, 1.0f);
        f4 = IlIlIlI.IllIIl(f4, 0.0f, 1.0f);
        f5 = IlIlIlI.IllIIl(f5, 0.0f, 1.0f);
        f6 = IlIlIlI.IllIIl(f6, 0.0f, 1.0f);
        f7 = IlIlIlI.IllIIl(f7, 0.0f, 1.0f);
        f8 = IlIlIlI.IllIIl(f8, 0.0f, 1.0f);
        this.lI = f;
        this.III = f2;
        this.ll = f3;
        this.Il = f4;
        this.I = f5;
        this.II = f6;
        this.IIl = f7;
        this.l = f8;
    }

    public float IlI() {
        return this.l;
    }
}

