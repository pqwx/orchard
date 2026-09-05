/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
 *   - III
 *   - Ill
 *   - IIl
 *   - IlI
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
final class llllllII
extends Record
implements SimpleGuiElementRenderState {
    private final float I;
    private final float l;
    private final Matrix3x2fc II;
    private final @Nullable ScreenRect Il;
    private final float lI;
    private final float ll;
    private final float III;
    private final int IIl;
    private final @Nullable ScreenRect IlI;
    private final float Ill;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llllllII.class, "pose;centerX;centerY;quadRadius;circleRadius;stroke;progress;color;scissorArea;bounds", "II", "lI", "l", "ll", "I", "III", "Ill", "IIl", "Il", "IlI"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llllllII.class, "pose;centerX;centerY;quadRadius;circleRadius;stroke;progress;color;scissorArea;bounds", "II", "lI", "l", "ll", "I", "III", "Ill", "IIl", "Il", "IlI"}, this);
    }

    private llllllII(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, int n, @Nullable ScreenRect screenRect) {
        this(matrix3x2fc, f, f2, f3, f4, f5, f6, n, screenRect, IIIlIIllI.lIlll(f - f3, f2 - f3, f3 * 2.0f, f3 * 2.0f, matrix3x2fc, screenRect));
    }

    public float I() {
        return this.Ill;
    }

    public float l() {
        return this.l;
    }

    private llllllII(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, int n, @Nullable ScreenRect screenRect, @Nullable ScreenRect screenRect2) {
        this.II = matrix3x2fc;
        this.lI = f;
        this.l = f2;
        this.ll = f3;
        this.I = f4;
        this.III = f5;
        this.Ill = f6;
        this.IIl = n;
        this.Il = screenRect;
        this.IlI = screenRect2;
    }

    public float II() {
        return this.I;
    }

    public RenderPipeline pipeline() {
        return IIIlIIllI.llI;
    }

    public float Il() {
        return this.lI;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llllllII.class, "pose;centerX;centerY;quadRadius;circleRadius;stroke;progress;color;scissorArea;bounds", "II", "lI", "l", "ll", "I", "III", "Ill", "IIl", "Il", "IlI"}, this);
    }

    public @Nullable ScreenRect bounds() {
        return this.IlI;
    }

    public float lI() {
        return this.ll;
    }

    public void setupVertices(VertexConsumer vertexConsumer) {
        float f = this.ll * 2.0f;
        IIIlIIllI.IllII(vertexConsumer, this.II, this.lI - this.ll, this.l - this.ll, f, f, this.I, this.III, this.Ill, this.IIl);
    }

    public Matrix3x2fc ll() {
        return this.II;
    }

    public int III() {
        return this.IIl;
    }

    public TextureSetup textureSetup() {
        return IIIlIIllI.II;
    }

    public @Nullable ScreenRect scissorArea() {
        return this.Il;
    }

    public float IIl() {
        return this.III;
    }
}

