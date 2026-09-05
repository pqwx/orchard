/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - IIl
 *   - Ill
 *   - IlI
 *   - lIl
 *   - III
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
final class IIIlllII
extends Record
implements SimpleGuiElementRenderState {
    private final int I;
    private final float l;
    private final float II;
    private final float Il;
    private final float lI;
    private final float ll;
    private final TextureSetup III;
    private final float IIl;
    private final float IlI;
    private final float Ill;
    private final @Nullable ScreenRect lII;
    private final float lIl;
    private final @Nullable ScreenRect llI;
    private final Matrix3x2fc lll;

    public float I() {
        return this.lI;
    }

    public RenderPipeline pipeline() {
        return IIIlIIllI.IIl;
    }

    private IIIlllII(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n, float f9, TextureSetup textureSetup, @Nullable ScreenRect screenRect) {
        this(matrix3x2fc, f, f2, f3, f4, f5, f6, f7, f8, n, f9, textureSetup, screenRect, IIIlIIllI.lIlll(f, f2, f3, f4, matrix3x2fc, screenRect));
    }

    public int l() {
        return this.I;
    }

    public float II() {
        return this.l;
    }

    public float Il() {
        return this.IIl;
    }

    public TextureSetup textureSetup() {
        return this.III;
    }

    public float lI() {
        return this.lIl;
    }

    public float ll() {
        return this.II;
    }

    public void setupVertices(VertexConsumer vertexConsumer) {
        IIIlIIllI.IIlII(vertexConsumer, this.lll, this.IIl, this.Ill, this.IlI, this.ll, this.II, this.lIl, this.lI, this.Il, this.I, this.l);
    }

    public @Nullable ScreenRect scissorArea() {
        return this.llI;
    }

    public TextureSetup III() {
        return this.III;
    }

    public @Nullable ScreenRect bounds() {
        return this.lII;
    }

    public float IIl() {
        return this.ll;
    }

    public Matrix3x2fc IlI() {
        return this.lll;
    }

    public float Ill() {
        return this.IlI;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIlllII.class, "pose;x;y;width;height;u1;v1;u2;v2;color;distanceRange;setup;scissorArea;bounds", "lll", "IIl", "Ill", "IlI", "ll", "II", "lIl", "lI", "Il", "I", "l", "III", "llI", "lII"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIlllII.class, "pose;x;y;width;height;u1;v1;u2;v2;color;distanceRange;setup;scissorArea;bounds", "lll", "IIl", "Ill", "IlI", "ll", "II", "lIl", "lI", "Il", "I", "l", "III", "llI", "lII"}, this);
    }

    public float lII() {
        return this.Ill;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIlllII.class, "pose;x;y;width;height;u1;v1;u2;v2;color;distanceRange;setup;scissorArea;bounds", "lll", "IIl", "Ill", "IlI", "ll", "II", "lIl", "lI", "Il", "I", "l", "III", "llI", "lII"}, this);
    }

    private IIIlllII(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n, float f9, TextureSetup textureSetup, @Nullable ScreenRect screenRect, @Nullable ScreenRect screenRect2) {
        this.lll = matrix3x2fc;
        this.IIl = f;
        this.Ill = f2;
        this.IlI = f3;
        this.ll = f4;
        this.II = f5;
        this.lIl = f6;
        this.lI = f7;
        this.Il = f8;
        this.I = n;
        this.l = f9;
        this.III = textureSetup;
        this.llI = screenRect;
        this.lII = screenRect2;
    }

    public float lIl() {
        return this.Il;
    }
}

