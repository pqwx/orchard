/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
 *   - IIl
 *   - III
 *   - IlI
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.util.math.MathHelper
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.MathHelper;
import orchard.internal.IIIlIllII;
import orchard.internal.IIlIIllII;
import orchard.internal.IlllIl;
import orchard.internal.lllIIIII;

@Environment(value=EnvType.CLIENT)
public final class IlIlIlIl
extends Record {
    private final IIlIIllII I;
    private final float l;
    private final boolean II;
    private final lllIIIII Il;
    private final IlllIl lI;
    private final IIIlIllII ll;
    private final float III;
    private final boolean IIl;
    private final boolean IlI;

    public boolean I() {
        return this.II;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIlIlIl.class, "strength;strengthCurve;rotationProfile;allowOverride;advanced;assist;silent;speedMultiplier;stabilizeAmazingPitch", "l", "Il", "I", "IIl", "ll", "lI", "II", "III", "IlI"}, this, object);
    }

    /*
     * Enabled aggressive block sorting
     */
    static IlIlIlIl l(float f) {
        IlIlIlIl ilIlIlIl;
        float f2 = Float.isFinite(f) ? f : 0.0f;
        float f3 = MathHelper.clamp((float)(f2 / 100.0f), (float)0.01f, (float)1.0f);
        float f4 = MathHelper.clamp((float)(f2 * 4.5f), (float)120.0f, (float)420.0f);
        float f5 = MathHelper.clamp((float)(f2 / 23.0f), (float)1.0f, (float)6.0f);
        float f6 = MathHelper.clamp((float)(1.0512f - f3 * 0.36f), (float)0.4f, (float)0.85f);
        ilIlIlIl(f4, lllIIIII.II, IIlIIllII.l, true, IIIlIllII.III(f4, IIlIIllII.l), new IlllIl(f6, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, f3, f3), false, f5);
        return ilIlIlIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static IlIlIlIl II(float f) {
        float f2 = Float.isFinite(f) ? Math.max(1.0f, f) : 50.0f;
        float f3 = MathHelper.clamp((float)(f2 / 100.0f), (float)0.01f, (float)1.0f);
        float f4 = MathHelper.clamp((float)(f2 * 3.2f), (float)107.0f, (float)320.0f);
        float f5 = MathHelper.clamp((float)(0.78f - f3 * 0.32f), (float)0.42f, (float)0.78f);
        float f6 = MathHelper.clamp((float)(f2 / 38.0f), (float)0.65f, (float)2.85f);
        return new IlIlIlIl(f4, lllIIIII.II, IIlIIllII.l, true, IIIlIllII.III(f4, IIlIIllII.l), new IlllIl(f5, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, f3, f3), false, f6);
    }

    IlIlIlIl(float f, lllIIIII lllIIIII2, IIlIIllII iIlIIllII, boolean bl, IIIlIllII iIIlIllII, IlllIl illlIl) {
        this(f, lllIIIII2, iIlIIllII, bl, iIIlIllII, illlIl, false, 1.0f);
    }

    public lllIIIII Il() {
        return this.Il;
    }

    public boolean lI() {
        return this.IIl;
    }

    public IIlIIllII ll() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIlIlIl.class, "strength;strengthCurve;rotationProfile;allowOverride;advanced;assist;silent;speedMultiplier;stabilizeAmazingPitch", "l", "Il", "I", "IIl", "ll", "lI", "II", "III", "IlI"}, this);
    }

    public float III() {
        return this.III;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIlIlIl.class, "strength;strengthCurve;rotationProfile;allowOverride;advanced;assist;silent;speedMultiplier;stabilizeAmazingPitch", "l", "Il", "I", "IIl", "ll", "lI", "II", "III", "IlI"}, this);
    }

    public IlllIl IIl() {
        return this.lI;
    }

    public float IlI() {
        return this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    public IlIlIlIl(float f, lllIIIII lllIIIII2, IIlIIllII iIlIIllII, boolean bl, IIIlIllII iIIlIllII, IlllIl illlIl, boolean bl2, float f2, boolean bl3) {
        if (iIIlIllII == null) {
            iIIlIllII = IIIlIllII.III(f, iIlIIllII);
        }
        if (illlIl == null) {
            illlIl = IlllIl.II();
        }
        if (!Float.isFinite(f2) || f2 <= 0.0f) {
            f2 = 1.0f;
        }
        this.l = f;
        this.Il = lllIIIII2;
        this.I = iIlIIllII;
        this.IIl = bl;
        this.ll = iIIlIllII;
        this.lI = illlIl;
        this.II = bl2;
        this.III = f2;
        this.IlI = bl3;
    }

    IlIlIlIl(float f, lllIIIII lllIIIII2, IIlIIllII iIlIIllII, boolean bl, IIIlIllII iIIlIllII) {
        this(f, lllIIIII2, iIlIIllII, bl, iIIlIllII, IlllIl.II(), false, 1.0f);
    }

    IlIlIlIl(float f, lllIIIII lllIIIII2, IIlIIllII iIlIIllII, boolean bl, IIIlIllII iIIlIllII, boolean bl2) {
        this(f, lllIIIII2, iIlIIllII, bl, iIIlIllII, IlllIl.II(), bl2, 1.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    IlIlIlIl(float f, lllIIIII lllIIIII2, IIlIIllII iIlIIllII, boolean bl) {
        this(f, lllIIIII2, iIlIIllII, bl, IIIlIllII.III(f, iIlIIllII), IlllIl.II(), false, 1.0f);
    }

    public IlIlIlIl(float f, lllIIIII lllIIIII2, IIlIIllII iIlIIllII, boolean bl, IIIlIllII iIIlIllII, IlllIl illlIl, boolean bl2, float f2) {
        this(f, lllIIIII2, iIlIIllII, bl, iIIlIllII, illlIl, bl2, f2, false);
    }

    public IIIlIllII Ill() {
        return this.ll;
    }

    public boolean lII() {
        return this.IlI;
    }
}

