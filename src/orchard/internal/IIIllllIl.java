/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - IlI
 *   - IIl
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
final class IIIllllIl
extends Record
implements SimpleGuiElementRenderState {
    private final @Nullable ScreenRect I;
    private final float l;
    private final Matrix3x2fc II;
    private final float Il;
    private final boolean lI;
    private final int ll;
    private final @Nullable ScreenRect III;
    private final float IIl;
    private final float IlI;

    public Matrix3x2fc I() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIllllIl.class, "pose;centerX;centerY;radius;stroke;color;outline;scissorArea;bounds", "II", "IlI", "Il", "IIl", "l", "ll", "lI", "I", "III"}, this);
    }

    public @Nullable ScreenRect scissorArea() {
        return this.I;
    }

    public int l() {
        return this.ll;
    }

    public float II() {
        return this.l;
    }

    public float Il() {
        return this.IlI;
    }

    public float lI() {
        return this.Il;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIllllIl.class, "pose;centerX;centerY;radius;stroke;color;outline;scissorArea;bounds", "II", "IlI", "Il", "IIl", "l", "ll", "lI", "I", "III"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIllllIl.class, "pose;centerX;centerY;radius;stroke;color;outline;scissorArea;bounds", "II", "IlI", "Il", "IIl", "l", "ll", "lI", "I", "III"}, this);
    }

    public boolean ll() {
        return this.lI;
    }

    public @Nullable ScreenRect bounds() {
        return this.III;
    }

    private IIIllllIl(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, int n, boolean bl, @Nullable ScreenRect screenRect, @Nullable ScreenRect screenRect2) {
        this.II = matrix3x2fc;
        this.IlI = f;
        this.Il = f2;
        this.IIl = f3;
        this.l = f4;
        this.ll = n;
        this.lI = bl;
        this.I = screenRect;
        this.III = screenRect2;
    }

    public float III() {
        return this.IIl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private IIIllllIl(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, int n, boolean bl, @Nullable ScreenRect screenRect, float f5) {
        this(matrix3x2fc, f, f2, f3, f4, n, bl, screenRect, IIIlIIllI.lIlll(f - f5, f2 - f5, f5 * 2.0f, f5 * 2.0f, matrix3x2fc, screenRect));
    }

    public RenderPipeline pipeline() {
        return IIIlIIllI.llII;
    }

    public TextureSetup textureSetup() {
        return IIIlIIllI.II;
    }

    public void setupVertices(VertexConsumer vertexConsumer) {
        if (this.lI) {
            IIIlIIllI.IllI(vertexConsumer, this.II, this.IlI, this.Il, this.IIl, this.l, this.ll);
            return;
        }
        IIIlIIllI.llll(vertexConsumer, this.II, this.IlI, this.Il, this.IIl, this.ll);
    }
}

