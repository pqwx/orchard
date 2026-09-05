/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.Illlllll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
 *   - IlI
 *   - III
 *   - IIl
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
final class Illlllll
extends Record
implements SimpleGuiElementRenderState {
    private final int I;
    private final float l;
    private final float II;
    private final @Nullable ScreenRect Il;
    private final Matrix3x2fc lI;
    private final @Nullable ScreenRect ll;
    private final float III;
    private final float IIl;
    private final float IlI;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Illlllll.class, "pose;x;y;width;height;radius;color;scissorArea;bounds", "lI", "l", "IlI", "III", "II", "IIl", "I", "Il", "ll"}, this, object);
    }

    public float I() {
        return this.l;
    }

    public @Nullable ScreenRect bounds() {
        return this.ll;
    }

    public TextureSetup textureSetup() {
        return IIIlIIllI.II;
    }

    public float l() {
        return this.IIl;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Illlllll.class, "pose;x;y;width;height;radius;color;scissorArea;bounds", "lI", "l", "IlI", "III", "II", "IIl", "I", "Il", "ll"}, this);
    }

    public float II() {
        return this.III;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setupVertices(VertexConsumer vertexConsumer) {
        vertexConsumer.vertex(this.lI, this.l, this.IlI).texture(0.0f, 0.0f).color(this.I);
        vertexConsumer.vertex(this.lI, this.l, this.IlI + this.II).texture(0.0f, 1.0f).color(this.I);
        vertexConsumer.vertex(this.lI, this.l + this.III, this.IlI + this.II).texture(1.0f, 1.0f).color(this.I);
        vertexConsumer.vertex(this.lI, this.l + this.III, this.IlI).texture(1.0f, 0.0f).color(this.I);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Illlllll.class, "pose;x;y;width;height;radius;color;scissorArea;bounds", "lI", "l", "IlI", "III", "II", "IIl", "I", "Il", "ll"}, this);
    }

    public float Il() {
        return this.IlI;
    }

    public RenderPipeline pipeline() {
        return IIIlIIllI.lIl;
    }

    public @Nullable ScreenRect scissorArea() {
        return this.Il;
    }

    private Illlllll(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, int n, @Nullable ScreenRect screenRect, @Nullable ScreenRect screenRect2) {
        this.lI = matrix3x2fc;
        this.l = f;
        this.IlI = f2;
        this.III = f3;
        this.II = f4;
        this.IIl = f5;
        this.I = n;
        this.Il = screenRect;
        this.ll = screenRect2;
    }

    public float lI() {
        return this.II;
    }

    private Illlllll(Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, int n, @Nullable ScreenRect screenRect) {
        this(matrix3x2fc, f, f2, f3, f4, f5, n, screenRect, IIIlIIllI.lIlll(f, f2, f3, f4, matrix3x2fc, screenRect));
    }

    public Matrix3x2fc ll() {
        return this.lI;
    }

    public int III() {
        return this.I;
    }
}

