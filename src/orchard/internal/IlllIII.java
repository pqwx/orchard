/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - IlI
 *   - lIl
 *   - III
 *   - lII
 *   - llI
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.gui.ScreenRect
 *  net.minecraft.client.gui.render.state.SimpleGuiElementRenderState
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.texture.TextureSetup
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
package orchard.internal;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.ScreenRect;
import net.minecraft.client.gui.render.state.SimpleGuiElementRenderState;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.texture.TextureSetup;
import orchard.internal.IIIlIIllI;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
final class IlllIII
extends Record
implements SimpleGuiElementRenderState {
    private final int I;
    private final int l;
    private final float II;
    private final @Nullable ScreenRect Il;
    private final float lI;
    private final float ll;
    private final float III;
    private final int IIl;
    private final Matrix3x2fc IlI;
    private final int Ill;
    private final float lII;
    private final float lIl;
    private final int llI;
    private final @Nullable ScreenRect lll;

    public float I() {
        return this.lI;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlllIII.class, "pose;x;y;width;height;radius;stroke;mode;topLeftColor;topRightColor;bottomRightColor;bottomLeftColor;scissorArea;bounds", "IlI", "lIl", "ll", "lI", "III", "lII", "II", "llI", "l", "IIl", "Ill", "I", "Il", "lll"}, this);
    }

    public float l() {
        return this.lIl;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlllIII.class, "pose;x;y;width;height;radius;stroke;mode;topLeftColor;topRightColor;bottomRightColor;bottomLeftColor;scissorArea;bounds", "IlI", "lIl", "ll", "lI", "III", "lII", "II", "llI", "l", "IIl", "Ill", "I", "Il", "lll"}, this);
    }

    public float II() {
        return this.ll;
    }

    public void setupVertices(VertexConsumer vertexConsumer) {
        IIIlIIllI.lIIll(vertexConsumer, this.IlI, this.lIl, this.ll, this.lI, this.III, this.lII, this.II, this.llI, this.l, this.IIl, this.Ill, this.I);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlllIII.class, "pose;x;y;width;height;radius;stroke;mode;topLeftColor;topRightColor;bottomRightColor;bottomLeftColor;scissorArea;bounds", "IlI", "lIl", "ll", "lI", "III", "lII", "II", "llI", "l", "IIl", "Ill", "I", "Il", "lll"}, this, object);
    }

    public @Nullable ScreenRect bounds() {
        return this.lll;
    }

    private IlllIII(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, int n3, int n4, int n5, @Nullable ScreenRect screenRect, @Nullable ScreenRect screenRect2) {
        this.IlI = matrix3x2fc;
        this.lIl = f;
        this.ll = f2;
        this.lI = f3;
        this.III = f4;
        this.lII = f5;
        this.II = f6;
        this.llI = n;
        this.l = n2;
        this.IIl = n3;
        this.Ill = n4;
        this.I = n5;
        this.Il = screenRect;
        this.lll = screenRect2;
    }

    public int Il() {
        return this.I;
    }

    public float lI() {
        return this.II;
    }

    public TextureSetup textureSetup() {
        return IIIlIIllI.II;
    }

    public int ll() {
        return this.Ill;
    }

    public int III() {
        return this.llI;
    }

    public Matrix3x2fc IIl() {
        return this.IlI;
    }

    public @Nullable ScreenRect scissorArea() {
        return this.Il;
    }

    public int IlI() {
        return this.l;
    }

    public RenderPipeline pipeline() {
        return IIIlIIllI.IlI;
    }

    public int Ill() {
        return this.IIl;
    }

    public float lII() {
        return this.lII;
    }

    private IlllIII(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, int n3, int n4, int n5, @Nullable ScreenRect screenRect) {
        this(matrix3x2fc, f - 1.25f, f2 - 1.25f, f3 + 2.5f, f4 + 2.5f, f5, f6, n, n2, n3, n4, n5, screenRect, IIIlIIllI.lIlll(f - 1.25f, f2 - 1.25f, f3 + 2.5f, f4 + 2.5f, matrix3x2fc, screenRect));
    }

    public float lIl() {
        return this.III;
    }
}

