/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIllll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
 *   - III
 *   - IlI
 *   - Ill
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
final class IIIlIllll
extends Record
implements SimpleGuiElementRenderState {
    private final float I;
    private final int l;
    private final float II;
    private final Matrix3x2fc Il;
    private final float lI;
    private final TextureSetup ll;
    private final float III;
    private final @Nullable ScreenRect IIl;
    private final float IlI;
    private final @Nullable ScreenRect Ill;

    public float I() {
        return this.lI;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIlIllll.class, "setup;pose;x;y;width;height;radius;color;scissorArea;bounds", "ll", "Il", "II", "III", "I", "lI", "IlI", "l", "Ill", "IIl"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIlIllll.class, "setup;pose;x;y;width;height;radius;color;scissorArea;bounds", "ll", "Il", "II", "III", "I", "lI", "IlI", "l", "Ill", "IIl"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIlIllll.class, "setup;pose;x;y;width;height;radius;color;scissorArea;bounds", "ll", "Il", "II", "III", "I", "lI", "IlI", "l", "Ill", "IIl"}, this);
    }

    public float l() {
        return this.III;
    }

    private IIIlIllll(TextureSetup textureSetup, Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, int n, @Nullable ScreenRect screenRect, @Nullable ScreenRect screenRect2) {
        this.ll = textureSetup;
        this.Il = matrix3x2fc;
        this.II = f;
        this.III = f2;
        this.I = f3;
        this.lI = f4;
        this.IlI = f5;
        this.l = n;
        this.Ill = screenRect;
        this.IIl = screenRect2;
    }

    public void setupVertices(VertexConsumer vertexConsumer) {
        IIIlIIllI.llIl(vertexConsumer, this.Il, this.II, this.III, this.I, this.lI, this.IlI, this.l);
    }

    public Matrix3x2fc II() {
        return this.Il;
    }

    public TextureSetup Il() {
        return this.ll;
    }

    public @Nullable ScreenRect bounds() {
        return this.IIl;
    }

    private IIIlIllll(TextureSetup textureSetup, Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, int n, @Nullable ScreenRect screenRect) {
        this(textureSetup, matrix3x2fc, f, f2, f3, f4, f5, n, screenRect, IIIlIIllI.lIlll(f, f2, f3, f4, matrix3x2fc, screenRect));
    }

    public @Nullable ScreenRect scissorArea() {
        return this.Ill;
    }

    public float lI() {
        return this.II;
    }

    public float ll() {
        return this.I;
    }

    public TextureSetup textureSetup() {
        return this.ll;
    }

    public int III() {
        return this.l;
    }

    public RenderPipeline pipeline() {
        return IIIlIIllI.lII;
    }

    public float IIl() {
        return this.IlI;
    }
}

