/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
 *   - IIl
 *   - Ill
 *   - III
 *   - lII
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
final class IIIIlIll
extends Record
implements SimpleGuiElementRenderState {
    private final int I;
    private final float l;
    private final float II;
    private final float Il;
    private final Matrix3x2fc lI;
    private final float ll;
    private final boolean III;
    private final float IIl;
    private final @Nullable ScreenRect IlI;
    private final float Ill;
    private final @Nullable ScreenRect lII;

    public Matrix3x2fc I() {
        return this.lI;
    }

    public boolean l() {
        return this.III;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIIlIll.class, "pose;x;y;width;height;radius;stroke;color;outline;scissorArea;bounds", "lI", "l", "IIl", "Ill", "ll", "II", "Il", "I", "III", "lII", "IlI"}, this);
    }

    public float II() {
        return this.Il;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIIlIll.class, "pose;x;y;width;height;radius;stroke;color;outline;scissorArea;bounds", "lI", "l", "IIl", "Ill", "ll", "II", "Il", "I", "III", "lII", "IlI"}, this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setupVertices(VertexConsumer vertexConsumer) {
        if (this.III) {
            IIIlIIllI.IlllI(vertexConsumer, this.lI, this.l, this.IIl, this.Ill, this.ll, this.II, this.Il, this.I);
            return;
        }
        IIIlIIllI.IIII(vertexConsumer, this.lI, this.l, this.IIl, this.Ill, this.ll, this.II, this.I);
    }

    public float Il() {
        return this.Ill;
    }

    public float lI() {
        return this.II;
    }

    private IIIIlIll(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, int n, boolean bl, @Nullable ScreenRect screenRect, @Nullable ScreenRect screenRect2) {
        this.lI = matrix3x2fc;
        this.l = f;
        this.IIl = f2;
        this.Ill = f3;
        this.ll = f4;
        this.II = f5;
        this.Il = f6;
        this.I = n;
        this.III = bl;
        this.lII = screenRect;
        this.IlI = screenRect2;
    }

    public @Nullable ScreenRect bounds() {
        return this.IlI;
    }

    public int ll() {
        return this.I;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIIlIll.class, "pose;x;y;width;height;radius;stroke;color;outline;scissorArea;bounds", "lI", "l", "IIl", "Ill", "ll", "II", "Il", "I", "III", "lII", "IlI"}, this, object);
    }

    public float III() {
        return this.l;
    }

    private IIIIlIll(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, int n, boolean bl, @Nullable ScreenRect screenRect) {
        this(matrix3x2fc, f, f2, f3, f4, f5, f6, n, bl, screenRect, IIIlIIllI.lIlll(f, f2, f3, f4, matrix3x2fc, screenRect));
    }

    public @Nullable ScreenRect scissorArea() {
        return this.lII;
    }

    public float IIl() {
        return this.IIl;
    }

    public RenderPipeline pipeline() {
        return IIIlIIllI.llII;
    }

    public float IlI() {
        return this.ll;
    }

    public TextureSetup textureSetup() {
        return IIIlIIllI.II;
    }
}

