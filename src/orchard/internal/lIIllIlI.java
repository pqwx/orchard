/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIllIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - III
 *   - IIl
 *   - Ill
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
final class lIIllIlI
extends Record
implements SimpleGuiElementRenderState {
    private final float I;
    private final Matrix3x2fc l;
    private final int II;
    private final float Il;
    private final @Nullable ScreenRect lI;
    private final float ll;
    private final float III;
    private final float IIl;
    private final @Nullable ScreenRect IlI;
    private final int Ill;

    public float I() {
        return this.ll;
    }

    public float l() {
        return this.III;
    }

    public RenderPipeline pipeline() {
        return IIIlIIllI.IlI;
    }

    public int II() {
        return this.II;
    }

    public float Il() {
        return this.IIl;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIIllIlI.class, "pose;centerX;centerY;quadRadius;circleRadius;stroke;mode;color;scissorArea;bounds", "l", "ll", "III", "IIl", "I", "Il", "Ill", "II", "lI", "IlI"}, this, object);
    }

    public float lI() {
        return this.Il;
    }

    private lIIllIlI(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, int n, int n2, @Nullable ScreenRect screenRect) {
        this(matrix3x2fc, f, f2, f3, f4, f5, n, n2, screenRect, IIIlIIllI.lIlll(f - f3, f2 - f3, f3 * 2.0f, f3 * 2.0f, matrix3x2fc, screenRect));
    }

    public void setupVertices(VertexConsumer vertexConsumer) {
        float f = this.IIl * 2.0f;
        IIIlIIllI.lIIll(vertexConsumer, this.l, this.ll - this.IIl, this.III - this.IIl, f, f, this.I, this.Il, this.Ill, this.II, this.II, this.II, this.II);
    }

    public float ll() {
        return this.I;
    }

    private lIIllIlI(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, int n, int n2, @Nullable ScreenRect screenRect, @Nullable ScreenRect screenRect2) {
        this.l = matrix3x2fc;
        this.ll = f;
        this.III = f2;
        this.IIl = f3;
        this.I = f4;
        this.Il = f5;
        this.Ill = n;
        this.II = n2;
        this.lI = screenRect;
        this.IlI = screenRect2;
    }

    public int III() {
        return this.Ill;
    }

    public @Nullable ScreenRect scissorArea() {
        return this.lI;
    }

    public Matrix3x2fc IIl() {
        return this.l;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIIllIlI.class, "pose;centerX;centerY;quadRadius;circleRadius;stroke;mode;color;scissorArea;bounds", "l", "ll", "III", "IIl", "I", "Il", "Ill", "II", "lI", "IlI"}, this);
    }

    public TextureSetup textureSetup() {
        return IIIlIIllI.II;
    }

    public @Nullable ScreenRect bounds() {
        return this.IlI;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIIllIlI.class, "pose;centerX;centerY;quadRadius;circleRadius;stroke;mode;color;scissorArea;bounds", "l", "ll", "III", "IIl", "I", "Il", "Ill", "II", "lI", "IlI"}, this);
    }
}

