/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - pipeline/msdf_texture
 *   - liquid_glass_surface
 *   - gui_rounded_texture
 *   - pipeline/sdf_round
 *   - sdf_ring_progress
 *   - .getBytes(
 *   - core/d6r3
 *   - core/a7x1
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat$DrawMode
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gl.GpuSampler
 *  net.minecraft.client.gl.RenderPipelines
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.ScreenRect
 *  net.minecraft.client.gui.render.state.SimpleGuiElementRenderState
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexFormats
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.texture.TextureSetup
 *  net.minecraft.util.Identifier
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
package orchard.internal;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.GpuSampler;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.ScreenRect;
import net.minecraft.client.gui.render.state.SimpleGuiElementRenderState;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.TextureSetup;
import net.minecraft.util.Identifier;
import orchard.core.StringFactory;
import orchard.internal.IIIIlIll;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIllll;
import orchard.internal.IIIlllII;
import orchard.internal.IlllIII;
import orchard.internal.Illlllll;
import orchard.internal.lIIllIlI;
import orchard.internal.llllllII;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
final class IIIlIIllI {
    private static final int I = 6;
    private static final int l = 8;
    private static final TextureSetup II;
    private static final int Il = 3;
    private static final int lI = 2;
    private static final int ll = 1;
    private static final IIIlIIIII III;
    private static final RenderPipeline IIl;
    private static final RenderPipeline IlI;
    private static final int Ill = 7;
    private static final RenderPipeline lII;
    private static final RenderPipeline lIl;
    private static final RenderPipeline llI;
    private static final IIIlIIIII lll;
    private static final IIIlIIIII IIII;
    private static final IIIlIIIII IIIl;
    private static final IIIlIIIII IIlI;
    private static final float IIll = 1.25f;
    private static final int IlII = 4;
    private static final IIIlIIIII IlIl;
    private static final float IllI = 8.0f;
    private static final float Illl = 12.0f;
    private static final IIIlIIIII lIII;
    private static final IIIlIIIII lIIl;
    private static final int lIlI = 18;
    private static final float lIll = 8.0f;
    private static final RenderPipeline llII;
    private static final float llIl = 2.0f;
    private static final IIIlIIIII lllI;
    private static final IIIlIIIII llll;
    private static final int IIIII = 0;
    private static final int IIIIl = 5;
    private static final IIIlIIIII IIIlI;
    private static final int IIIll = 6;
    private static final IIIlIIIII IIlII;
    private static final int[] IIlIl;
    private static final String[] IIllI;
    private static final Object[] IIlll;

    private static int I(float f) {
        return Math.max(1, Math.min(Short.MAX_VALUE, Math.round(f * 8.0f)));
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean l(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, double d6, int n) {
        IlllIII illlIII;
        Matrix3x2f matrix3x2f;
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) return true;
        if ((n >>> 24 & 0xFF) <= 0) {
            return true;
        }
        double d7 = IIIlIIllI.IIIl(d3, d4, d5);
        double d8 = Math.max(0.25, Math.min(d6, Math.min(d3, d4) * 0.5));
        matrix3x2f((Matrix3x2fc)drawContext.getMatrices());
        illlIII((Matrix3x2fc)matrix3x2f, (float)d, (float)d2, (float)d3, (float)d4, (float)d7, (float)d8, 3, n, n, n, n, drawContext.scissorStack.peekLast());
        drawContext.state.addSimpleElement((SimpleGuiElementRenderState)illlIII);
        return true;
    }

    static boolean II(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, float f, float f2, float f3, float f4, int n) {
        return IIIlIIllI.llIlI(drawContext, identifier, d, d2, d3, d4, f, f2, f3, f4, n, 12.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int Il(float[] fArray, float[] fArray2, float f, float f2, float f3, float f4, float f5, int n) {
        float f6 = Math.min(Math.min(f3, f4) * 0.5f, Math.max(0.0f, f5));
        int n2 = 0;
        n2 = IIIlIIllI.IIIll(fArray, fArray2, n2, f + f3 - f6, f2 + f6, f6, -90.0f, 0.0f, n);
        n2 = IIIlIIllI.IIIll(fArray, fArray2, n2, f + f3 - f6, f2 + f4 - f6, f6, 0.0f, 90.0f, n);
        n2 = IIIlIIllI.IIIll(fArray, fArray2, n2, f + f6, f2 + f4 - f6, f6, 90.0f, 180.0f, n);
        return IIIlIIllI.IIIll(fArray, fArray2, n2, f + f6, f2 + f6, f6, 180.0f, 270.0f, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static void lI(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, double d5, int n) {
        if ((n >>> 24 & 0xFF) <= 0) return;
        if (d3 <= 0.0) return;
        if (!(d4 <= 0.0)) {
            double d6 = IIIlIIllI.IIIl(d3, d4, d5);
            if (d6 <= 0.01) {
                IIIlIIllI.lIlII(drawContext, identifier, (int)Math.round(d), (int)Math.round(d2), (int)Math.round(d3), (int)Math.round(d4), n);
                return;
            }
            AbstractTexture abstractTexture = MinecraftClient.getInstance().getTextureManager().getTexture(identifier);
            if (abstractTexture != null) {
                TextureSetup textureSetup = TextureSetup.of((GpuTextureView)abstractTexture.getGlTextureView(), (GpuSampler)abstractTexture.getSampler());
                drawContext.state.addSimpleElement((SimpleGuiElementRenderState)new IIIlIllll(textureSetup, (Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)drawContext.getMatrices()), (float)d, (float)d2, (float)d3, (float)d4, (float)d6, n, drawContext.scissorStack.peekLast()));
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean ll(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) return true;
        if (d5 <= 0.0) return true;
        if ((n >>> 24 & 0xFF) > 0) {
            llllllII llllllII2;
            float f = (float)Math.max(0.0, d3);
            float f2 = (float)Math.max(0.25, d4);
            float f3 = f + f2 * 0.5f + 2.0f;
            llllllII2((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)drawContext.getMatrices()), (float)d, (float)d2, f3, f, f2, IIIlIIllI.llIIl((float)d5), n, drawContext.scissorStack.peekLast());
            drawContext.state.addSimpleElement((SimpleGuiElementRenderState)llllllII2);
            return true;
        }
        return true;
    }

    private static RenderPipeline III() {
        return RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET}).withLocation(IIIlIIllI.IIIlI(IIlI)).withVertexShader(IIIlIIllI.IIIlI(IIIl)).withFragmentShader(IIIlIIllI.IIIlI(IIlII)).withSampler(IlIl.IIII()).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withCull(false).withVertexFormat(VertexFormats.POSITION_COLOR_TEXTURE_LIGHT_NORMAL, VertexFormat.DrawMode.QUADS).build());
    }

    private static RenderPipeline IIl() {
        return RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{RenderPipelines.GUI_SNIPPET}).withLocation(IIIlIIllI.IIIlI(llll)).withCull(false).withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.TRIANGLES).build());
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IlI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2) {
        int n3 = n >>> 24 & 0xFF;
        int n4 = n2 >>> 24 & 0xFF;
        if (n3 <= 0) {
            if (n4 <= 0) return true;
        }
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) {
            return true;
        }
        double d6 = IIIlIIllI.IIIl(d3, d4, d5);
        drawContext.state.addSimpleElement((SimpleGuiElementRenderState)new IlllIII((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)drawContext.getMatrices()), (float)d, (float)d2, (float)d3, (float)d4, (float)d6, 0.0f, 0, n, n2, n2, n, drawContext.scissorStack.peekLast()));
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float Ill(float f, float f2, float f3, float f4, float f5) {
        float f6 = Math.min(f2, f4);
        float f7 = Math.max(f2, f4);
        if (f5 < f6 - 0.001f) return Float.NaN;
        if (!(f5 > f7 + 0.001f)) {
            if (!(Math.abs(f4 - f2) < 1.0E-4f)) {
                float f8 = (f5 - f2) / (f4 - f2);
                return f + f8 * (f3 - f);
            }
            return Float.NaN;
        }
        return Float.NaN;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lII(DrawContext drawContext, double d, double d2, double d3, int n) {
        if (!(d3 <= 0.0) && (n >>> 24 & 0xFF) > 0) {
            lIIllIlI lIIllIlI2;
            float f = (float)Math.max(0.0, d3);
            float f2 = f + 2.0f;
            lIIllIlI2((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)drawContext.getMatrices()), (float)d, (float)d2, f2, f, 0.0f, 5, n, drawContext.scissorStack.peekLast());
            drawContext.state.addSimpleElement((SimpleGuiElementRenderState)lIIllIlI2);
            return true;
        }
        return true;
    }

    static boolean lIl(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        return IIIlIIllI.l(drawContext, d, d2, d3, d4, d5, 1.0, n);
    }

    static void llI(DrawContext drawContext, double d, double d2) {
        drawContext.getMatrices().mul((Matrix3x2fc)new Matrix3x2f(1.0f, (float)d2, (float)d, 1.0f, 0.0f, 0.0f));
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lll(DrawContext drawContext, double d, double d2, double d3, double d4, int n) {
        lIIllIlI lIIllIlI2;
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) return true;
        if ((n >>> 24 & 0xFF) <= 0) {
            return true;
        }
        float f = (float)Math.max(0.0, d3);
        float f2 = (float)Math.max(0.25, d4);
        float f3 = f + f2 * 0.5f + 2.0f;
        lIIllIlI2((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)drawContext.getMatrices()), (float)d, (float)d2, f3, f, f2, 6, n, drawContext.scissorStack.peekLast());
        drawContext.state.addSimpleElement((SimpleGuiElementRenderState)lIIllIlI2);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIII(VertexConsumer vertexConsumer, Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, int n) {
        int n2 = IIIlIIllI.IIlI(f5);
        float[] fArray = new float[76];
        float[] fArray2 = new float[76];
        int n3 = IIIlIIllI.Il(fArray, fArray2, f, f2, f3, f4, f5, n2);
        float f6 = f + f3 * 0.5f;
        float f7 = f2 + f4 * 0.5f;
        int n4 = 0;
        while (n4 < n3) {
            int n5 = (n4 + 1) % n3;
            IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, f6, f7, n);
            IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, fArray[n4], fArray2[n4], n);
            IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, fArray[n5], fArray2[n5], n);
            ++n4;
        }
        return;
    }

    private static double IIIl(double d, double d2, double d3) {
        return Math.min(Math.min(d, d2) * 0.5, Math.max(0.0, d3));
    }

    private static int IIlI(float f) {
        return Math.max(6, Math.min(18, (int)Math.ceil(f)));
    }

    /*
     * Enabled aggressive block sorting
     */
    static void IIll(DrawContext drawContext, Identifier identifier, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if ((n7 >>> 24 & 0xFF) <= 0) return;
        if (n3 <= 0) return;
        if (n4 <= 0) return;
        if (n5 <= 0) return;
        if (n6 <= 0) {
            return;
        }
        drawContext.drawTexture(RenderPipelines.GUI_TEXTURED, identifier, n, n2, 0.0f, 0.0f, n3, n4, n5, n6, n5, n6, n7);
    }

    private static void IlII(VertexConsumer vertexConsumer, Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, int n) {
        vertexConsumer.vertex(matrix3x2fc, f, f2).texture(f3, f4).color(n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IlIl(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3, int n4) {
        IlllIII illlIII;
        Matrix3x2f matrix3x2f;
        int n5 = n >>> 24 & 0xFF;
        int n6 = n2 >>> 24 & 0xFF;
        int n7 = n3 >>> 24 & 0xFF;
        int n8 = n4 >>> 24 & 0xFF;
        if (n5 <= 0 && n6 <= 0 && n7 <= 0) {
            if (n8 <= 0) return true;
        }
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) {
            return true;
        }
        double d6 = IIIlIIllI.IIIl(d3, d4, d5);
        matrix3x2f((Matrix3x2fc)drawContext.getMatrices());
        illlIII((Matrix3x2fc)matrix3x2f, (float)d, (float)d2, (float)d3, (float)d4, (float)d6, 0.0f, 0, n, n2, n3, n4, drawContext.scissorStack.peekLast());
        drawContext.state.addSimpleElement((SimpleGuiElementRenderState)illlIII);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IllI(VertexConsumer vertexConsumer, Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, int n) {
        float f5 = f3 + f4 * 0.5f;
        float f6 = Math.max(0.0f, f3 - f4 * 0.5f);
        if (!(f6 <= 0.0f)) {
            int n2 = IIIlIIllI.IIIII(f5);
            int n3 = 0;
            while (n3 < n2) {
                double d = Math.PI * 2 * (double)n3 / (double)n2;
                double d2 = Math.PI * 2 * (double)(n3 + 1) / (double)n2;
                float f7 = f + (float)Math.cos(d) * f5;
                float f8 = f2 + (float)Math.sin(d) * f5;
                float f9 = f + (float)Math.cos(d2) * f5;
                float f10 = f2 + (float)Math.sin(d2) * f5;
                float f11 = f + (float)Math.cos(d) * f6;
                float f12 = f2 + (float)Math.sin(d) * f6;
                float f13 = f + (float)Math.cos(d2) * f6;
                float f14 = f2 + (float)Math.sin(d2) * f6;
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, f7, f8, n);
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, f9, f10, n);
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, f13, f14, n);
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, f7, f8, n);
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, f13, f14, n);
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, f11, f12, n);
                ++n3;
            }
            return;
        }
        IIIlIIllI.llll(vertexConsumer, matrix3x2fc, f, f2, f5, n);
    }

    static void Illl(DrawContext drawContext, double d, double d2) {
        drawContext.getMatrices().translate((float)d, (float)d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lIII(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, double d6, int n) {
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) return true;
        if (d6 <= 0.0) return true;
        if ((n >>> 24 & 0xFF) <= 0) {
            return true;
        }
        float f = (float)Math.min(Math.max(0.5, d6), Math.min(d3, d4) * 0.5);
        drawContext.state.addSimpleElement((SimpleGuiElementRenderState)new IIIIlIll((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)drawContext.getMatrices()), (float)d, (float)d2, (float)d3, (float)d4, (float)IIIlIIllI.IIIl(d3, d4, d5), f, n, true, drawContext.scissorStack.peekLast()));
        return true;
    }

    private static float lIIl(int n) {
        return Math.max(-1.0f, Math.min(1.0f, -1.0f + (float)n * 0.25f));
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lIlI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, double d6, int n) {
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) return true;
        if (d6 <= 0.0) return true;
        if ((n >>> 24 & 0xFF) > 0) {
            IlllIII illlIII;
            Matrix3x2f matrix3x2f;
            double d7 = IIIlIIllI.IIIl(d3, d4, d5);
            float f = (float)Math.max(0.25, d6);
            float f2 = (float)(d - (double)f);
            float f3 = (float)(d2 - (double)f);
            float f4 = (float)(d3 + (double)(f * 2.0f));
            float f5 = (float)(d4 + (double)(f * 2.0f));
            float f6 = (float)(d7 + (double)f);
            matrix3x2f((Matrix3x2fc)drawContext.getMatrices());
            illlIII((Matrix3x2fc)matrix3x2f, f2, f3, f4, f5, f6, f, 4, n, n, n, n, drawContext.scissorStack.peekLast());
            drawContext.state.addSimpleElement((SimpleGuiElementRenderState)illlIII);
            return true;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lIll(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) return true;
        if ((n >>> 24 & 0xFF) <= 0) {
            return true;
        }
        double d6 = IIIlIIllI.IIIl(d3, d4, d5);
        drawContext.state.addSimpleElement((SimpleGuiElementRenderState)new IlllIII((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)drawContext.getMatrices()), (float)d, (float)d2, (float)d3, (float)d4, (float)d6, 0.0f, 0, n, n, n, n, drawContext.scissorStack.peekLast()));
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean llII(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2, boolean bl, boolean bl2) {
        int n3 = n >>> 24 & 0xFF;
        int n4 = n2 >>> 24 & 0xFF;
        if (n3 <= 0) {
            if (n4 <= 0) return true;
        }
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) {
            return true;
        }
        double d6 = IIIlIIllI.IIIl(d3, d4, d5);
        if (!(d6 <= 0.01) && (bl || bl2)) {
            drawContext.state.addSimpleElement((SimpleGuiElementRenderState)new IlllIII((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)drawContext.getMatrices()), (float)d, (float)d2, (float)d3, (float)d4, (float)d6, 0.0f, bl && bl2 ? 0 : (bl ? 1 : 2), n, n, n2, n2, drawContext.scissorStack.peekLast()));
            return true;
        }
        drawContext.fillGradient((int)Math.floor(d), (int)Math.floor(d2), (int)Math.ceil(d + d3), (int)Math.ceil(d2 + d4), n, n2);
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private static void llIl(VertexConsumer var0, Matrix3x2fc var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7) {
        block33: {
            block48: {
                block49: {
                    block59: {
                        block57: {
                            block50: {
                                block56: {
                                    block45: {
                                        block42: {
                                            block53: {
                                                block58: {
                                                    block36: {
                                                        block35: {
                                                            block41: {
                                                                block38: {
                                                                    block52: {
                                                                        block55: {
                                                                            block46: {
                                                                                block51: {
                                                                                    block47: {
                                                                                        block39: {
                                                                                            block44: {
                                                                                                block43: {
                                                                                                    block40: {
                                                                                                        block54: {
                                                                                                            block34: {
                                                                                                                block37: {
                                                                                                                    break block52;
lbl1:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        continue;
                                                                                                                        break;
                                                                                                                    }
lbl3:
                                                                                                                    // 2 sources

                                                                                                                    while (Math.abs(var10_10[var21_27] - var16_18) < 0.001f) {
                                                                                                                        var19_24 = Math.min(var19_24, var9_9[var21_27]);
                                                                                                                        var20_25 = Math.max(var20_25, var9_9[var21_27]);
                                                                                                                        break block33;
                                                                                                                    }
                                                                                                                    break block33;
lbl8:
                                                                                                                    // 2 sources

                                                                                                                    while (var15_16 < var13_13) {
                                                                                                                        break block34;
                                                                                                                    }
                                                                                                                    break block53;
lbl11:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        var19_24 = Math.min(var19_24, var27_34);
                                                                                                                        var20_25 = Math.max(var20_25, var27_34);
                                                                                                                        break block35;
                                                                                                                        break;
                                                                                                                    }
lbl15:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        continue;
                                                                                                                        break;
                                                                                                                    }
lbl17:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        var28_35 = (var20_25 - var2_2) * var21_26;
                                                                                                                        break block36;
                                                                                                                        break;
                                                                                                                    }
lbl20:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        var21_27 = 0;
                                                                                                                        break block37;
lbl23:
                                                                                                                        // 1 sources

                                                                                                                        while (true) {
                                                                                                                            var17_22 = Math.min(var17_22, var27_34);
                                                                                                                            var18_23 = Math.max(var18_23, var27_34);
                                                                                                                            break block38;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    return;
lbl29:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        var15_16 = 1;
                                                                                                                        break block39;
lbl32:
                                                                                                                        // 2 sources

                                                                                                                        while (true) {
                                                                                                                            if (var14_14 >= var13_13 - 1) ** continue;
                                                                                                                            break block40;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
lbl36:
                                                                                                                // 2 sources

                                                                                                                while (true) {
                                                                                                                    if (var21_27 >= var11_11) break block41;
                                                                                                                    break block42;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            if (!(var12_12[var15_16] < var12_12[var14_14])) break block54;
                                                                                                            break block55;
lbl42:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                ++var16_20;
                                                                                                                break block43;
                                                                                                                break;
                                                                                                            }
lbl45:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                var14_14 = 0;
                                                                                                                break block44;
                                                                                                                break;
                                                                                                            }
lbl48:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                continue;
                                                                                                                break;
                                                                                                            }
lbl50:
                                                                                                            // 1 sources

                                                                                                            while (Math.abs(var10_10[var21_27] - var15_15) < 0.001f) {
                                                                                                                break block45;
                                                                                                            }
                                                                                                            ** GOTO lbl3
lbl53:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                var26_33 = (var19_24 - var2_2) * var21_26;
                                                                                                                var27_34 = (var16_18 - var3_3) * var22_28;
                                                                                                                ** continue;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
lbl58:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            ++var15_16;
                                                                                                            ** GOTO lbl8
                                                                                                            break;
                                                                                                        }
lbl61:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            if (var21_27 >= var11_11) break block46;
                                                                                                            ** GOTO lbl50
                                                                                                            break;
                                                                                                        }
                                                                                                        while (true) {
                                                                                                            var14_14 = 0;
                                                                                                            ** GOTO lbl32
                                                                                                            break;
                                                                                                        }
lbl67:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            if (var14_14 >= var13_13 - 1) ** continue;
                                                                                                            break block47;
                                                                                                            break;
                                                                                                        }
lbl70:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            var25_32 = (var18_23 - var2_2) * var21_26;
                                                                                                            ** continue;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var15_15 = var12_12[var14_14];
                                                                                                    break block56;
                                                                                                }
lbl77:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    if (var16_20 >= var13_13) break block39;
                                                                                                    break block48;
                                                                                                    break;
                                                                                                }
lbl80:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    if (var11_11 >= 3) break block49;
                                                                                                    break block50;
                                                                                                    break;
                                                                                                }
                                                                                                while (true) {
                                                                                                    var14_14 = 0;
                                                                                                    ** GOTO lbl67
                                                                                                    break;
                                                                                                }
                                                                                            }
lbl87:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                if (var14_14 >= var11_11) ** continue;
                                                                                                break block51;
                                                                                                break;
                                                                                            }
lbl90:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                continue;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (var15_16 != 0) break block57;
                                                                                        break block58;
lbl95:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            IIIlIIllI.IlII(var0, var1_1, var20_25, var16_18, var28_35, var27_34, var7_7);
                                                                                            ** continue;
                                                                                            break;
                                                                                        }
lbl98:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var16_20 = 0;
                                                                                            ** continue;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    var15_16 = var14_14 + 1;
                                                                                    ** GOTO lbl8
lbl104:
                                                                                    // 1 sources

                                                                                    while (!Float.isNaN(var27_34)) {
                                                                                        ** continue;
lbl106:
                                                                                        // 1 sources

                                                                                        ** GOTO lbl11
                                                                                    }
                                                                                    break block35;
lbl108:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var23_30 = (var17_22 - var2_2) * var21_26;
                                                                                        var24_31 = (var15_15 - var3_3) * var22_28;
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var15_16 = 0;
                                                                                ** while (true)
                                                                                IIIlIIllI.IlII(var0, var1_1, var19_24, var16_18, var26_33, var27_34, var7_7);
                                                                                ++var14_14;
                                                                                ** while (true)
lbl118:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var25_32 = var9_9[var21_27];
                                                                                    var26_33 = var9_9[var22_29];
                                                                                    ** continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var21_26 = 1.0f / var4_4;
                                                                            var22_28 = 1.0f / var5_5;
                                                                            ** while (true)
                                                                            IIIlIIllI.IlII(var0, var1_1, var17_22, var15_15, var23_30, var24_31, var7_7);
                                                                            IIIlIIllI.IlII(var0, var1_1, var20_25, var16_18, var28_35, var27_34, var7_7);
                                                                            ** while (true)
                                                                        }
                                                                        var16_21 = var12_12[var14_14];
                                                                        var12_12[var14_14] = var12_12[var15_16];
                                                                        var12_12[var15_16] = var16_21;
                                                                        ** while (true)
                                                                    }
                                                                    var8_8 = IIIlIIllI.IIlI(var6_6);
                                                                    var9_9 = new float[76];
                                                                    ** while (true)
                                                                }
lbl139:
                                                                // 2 sources

                                                                while (true) {
                                                                    var27_34 = IIIlIIllI.Ill(var25_32, var23_30, var26_33, var24_31, var16_18);
                                                                    ** GOTO lbl104
                                                                    break;
                                                                }
                                                            }
                                                            var21_27 = 0;
                                                            ** GOTO lbl61
                                                            var10_10 = new float[76];
                                                            var11_11 = IIIlIIllI.Il(var9_9, var10_10, var2_2, var3_3, var4_4, var5_5, var6_6, var8_8);
                                                            ** while (true)
                                                        }
                                                        ++var21_27;
                                                        ** while (true)
                                                    }
                                                    IIIlIIllI.IlII(var0, var1_1, var17_22, var15_15, var23_30, var24_31, var7_7);
                                                    IIIlIIllI.IlII(var0, var1_1, var18_23, var15_15, var25_32, var24_31, var7_7);
                                                    ** while (true)
                                                }
                                                var12_12[var13_13++] = var10_10[var14_14];
                                                break block57;
                                            }
                                            ++var14_14;
                                            ** while (true)
                                        }
                                        var22_29 = (var21_27 + 1) % var11_11;
                                        var23_30 = var10_10[var21_27];
                                        var24_31 = var10_10[var22_29];
                                        ** while (true)
                                    }
                                    var17_22 = Math.min(var17_22, var9_9[var21_27]);
                                    var18_23 = Math.max(var18_23, var9_9[var21_27]);
                                    ** GOTO lbl3
                                }
                                var16_18 = var12_12[var14_14 + 1];
                                break block59;
                            }
                            return;
                        }
                        ++var14_14;
                        ** while (true)
                        var27_34 = IIIlIIllI.Ill(var25_32, var23_30, var26_33, var24_31, var15_15);
                        ** while (Float.isNaN((float)var27_34))
lbl180:
                        // 1 sources

                        ** while (true)
                    }
                    var17_22 = var2_2 + var4_4;
                    var18_23 = var2_2;
                    var19_24 = var2_2 + var4_4;
                    var20_25 = var2_2;
                    ** while (true)
                }
                var12_12 = new float[var11_11];
                var13_13 = 0;
                ** while (true)
            }
            ** while (!(Math.abs((float)(var12_12[var16_20] - var10_10[var14_14])) < 0.001f))
lbl193:
            // 1 sources

            ** while (true)
        }
        ++var21_27;
        ** while (true)
    }

    static void lllI(DrawContext drawContext) {
        drawContext.getMatrices().popMatrix();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void llll(VertexConsumer vertexConsumer, Matrix3x2fc matrix3x2fc, float f, float f2, float f3, int n) {
        int n2 = IIIlIIllI.IIIII(f3);
        int n3 = 0;
        while (n3 < n2) {
            double d = Math.PI * 2 * (double)n3 / (double)n2;
            double d2 = Math.PI * 2 * (double)(n3 + 1) / (double)n2;
            IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, f, f2, n);
            IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, f + (float)Math.cos(d) * f3, f2 + (float)Math.sin(d) * f3, n);
            IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, f + (float)Math.cos(d2) * f3, f2 + (float)Math.sin(d2) * f3, n);
            ++n3;
        }
        return;
    }

    private IIIlIIllI() {
    }

    private static int IIIII(float f) {
        return Math.max(24, Math.min(96, (int)Math.ceil(f * 0.75f)));
    }

    private static RenderPipeline IIIIl() {
        return RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET}).withLocation(IIIlIIllI.IIIlI(lll)).withVertexShader(IIIlIIllI.IIIlI(IIIl)).withFragmentShader(IIIlIIllI.IIIlI(IIIl)).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withCull(false).withVertexFormat(VertexFormats.POSITION_COLOR_TEXTURE_LIGHT_NORMAL, VertexFormat.DrawMode.QUADS).build());
    }

    private static Identifier IIIlI(IIIlIIIII iIIlIIIII) {
        return Identifier.of((String)IIII.IIII(), (String)iIIlIIIII.IIII());
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int IIIll(float[] fArray, float[] fArray2, int n, float f, float f2, float f3, float f4, float f5, int n2) {
        int n3 = 0;
        while (n3 <= n2) {
            float f6 = (float)n3 / (float)n2;
            double d = Math.toRadians(f4 + (f5 - f4) * f6);
            fArray[n] = f + (float)Math.cos(d) * f3;
            fArray2[n] = f2 + (float)Math.sin(d) * f3;
            ++n;
            ++n3;
        }
        return n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 88;
        var7_2 = "\u746b\u74bf\u742f\u748b\u7464\u7442\u742f\u7405\ufbfe\ufb51\ufbd9\ufb1e\ufbf2\ufbf6\ufbd5\ufbcc\ufba0\ufb63\ufbc0\ufbbb\ufb77\ufb2f\ufb53\ufb75\ufb60\ufb90\ufbfe\ufb59\ufb2f\ufb58\ufb7e\ufb89\uf722\uf7f6\uf744\uf7c4\uf72a\uf72a\uf701\uf726\uf762\uf7a4\uf722\uf77d\u8da7\u8d77\u8df3\u8d51\u8da9\u8d8a\u8dae\u8d95\u8df9\u8d3a\u8d82\u8dd4\u8d2e\u8d0a\u8d4f\u8d1d\u8d37\u8dc9\u8da7\u8d30\u8d75\u8d6d\u8d35\u8dbc\u47e6\u4732\u4780\u4700\u47ee\u47ee\u47c5\u47e3\u47a5\u4770\u4781\u47b1\u2845\u28ea\u2862\u28a5\u2849\u284d\u286e\u2877\u281b\u28d8\u287b\u2800\u28cf\u2895\u28ec\u28f9\u28db\u282b\u2845\u28e2\u2894\u28e3\u28c5\u2832\u28cf\u2841\u281e\u2893\u285a\u28c0\u280b\u284a\u286d\u28e2\u2866\u28fc\u286b\u2863\u286f\u2807\ud74f\ud799\ud718\ud789\ud746\ud765\ud741\ud746\ud71c\ud7ef\ud753\ud700\ud7c2\ud7f6\ud7e5\ud7c8\ud7dc\ud752\ud762\ud7fa\ud799\ud7b4\ud79b\ud729\ud7c2\ud747\ud749\ud7ce\u9223\u928c\u9204\u92c3\u922f\u922b\u9208\u9211\u927d\u92be\u921d\u9266\u92af\u929e\u9282\u92aa\u92b3\u9265\u9211\u929d\u92f6\u9284\u9281\u9244\u92ad\u9224\u922b\u92fb\ue716\ue7c2\ue770\ue7f0\ue71e\ue71e\ue735\ue710\ue756\ue7a5\ue70a\ue75e\ub210\ub2ba\ub232\ub2f6\ub21d\ub21d\ub22a\ub216\ub271\ub298\ub230\ub26b\ub298\ub2a8\ub2b4\ub2b3\ub28b\ub27b\ub219\ub2ac\ub2c7\ub2cc\ub2c2\ub265\ub29c\ub27e\ub242\ub293\uc6d7\uc603\uc6b1\uc631\uc6df\uc6df\uc6f4\uc6d0\uc697\uc641\uc6b4\uc68a\ud789\ud741\ud7d1\ud76e\ud79a\ud789\ud7ba\ud795\ud7c6\ud70f\ud7b6\ud7b0";
        var8_3 = "\b\u0018\f\u0018\f(\u001c\u001c\f\u001c\f\f".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl42
lbl7:
        // 1 sources

        while (true) {
            IIIlIIllI.III = StringFactory.IIII("core/d6r3");
            IIIlIIllI.IlIl = StringFactory.IIII("Sampler0");
            IIIlIIllI.llII = IIIlIIllI.IIl();
            IIIlIIllI.lII = IIIlIIllI.IlIlI();
            IIIlIIllI.IlI = IIIlIIllI.IIIIl();
            IIIlIIllI.llI = IIIlIIllI.lIIII();
            IIIlIIllI.IIl = IIIlIIllI.III();
            IIIlIIllI.lIl = IIIlIIllI.lIIIl();
            IIIlIIllI.II = TextureSetup.empty();
            return;
        }
lbl18:
        // 1 sources

        while (true) {
            IIIlIIllI.IIII = StringFactory.IIII("cats");
            IIIlIIllI.lll = StringFactory.IIII("pipeline/sdf_round");
            IIIlIIllI.IIIl = StringFactory.IIII("core/a7x1");
            IIIlIIllI.lIIl = StringFactory.IIII("sdf_ring_progress");
            IIIlIIllI.lIII = StringFactory.IIII("core/b2q9");
            IIIlIIllI.llll = StringFactory.IIII("pipeline/gui_rounded_triangles");
            IIIlIIllI.lllI = StringFactory.IIII("gui_rounded_texture");
            IIIlIIllI.IIlI = StringFactory.IIII("pipeline/msdf_texture");
            IIIlIIllI.IIlII = StringFactory.IIII("core/c4m8");
            IIIlIIllI.IIIlI = StringFactory.IIII("liquid_glass_surface");
            ** continue;
            break;
        }
lbl30:
        // 1 sources

        while (true) {
            IIIlIIllI.IIlIl = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                IIIlIIllI.IIlIl[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            ** continue;
            break;
        }
        while (true) {
            var13_8 = 0;
lbl42:
            // 2 sources

            var10_5 = 0;
            var11_6 = 0;
            var12_7 = '\u0000';
            if (var13_8 != 0) ** GOTO lbl56
            IIIlIIllI.IIllI = var9_4;
            IIIlIIllI.IIlll = new Object[var9_4.length];
            var2_13 = -808809213;
            var0_11 = "\u00f6(U\f\u0006\u00b6\u0004&^\u00a5\u0003\u00ff\u001fe\u001cP\u00c6\u0019B\u00f6:*H\u001a:\u00ea\u0003\u00ccTD*A\u00ad \u00be\u0001\u007f\u0006c[p{z\u00c3\u00f4\u00eb\u00e4\u0087\u0082\u00a9\u0085\u0015\u0011\u00ac/\u00e3\u00b9\u00bbF5\u009c\u00d9\u008c\u00fdu4bE\u001d&\u0095\u008a\u000egF\u00026\u001a-3\u00a2Q\u00c3\u00f9\u0013K\u0081\u0019:\u00b0\u00d9\u00d0\u00ecD\u0086\u008f&\u00a1\u00d4\u00b2\u00d70\u00db.\u001d\u00e1(P\u008e\u00dfZ\u00a2v\u00b44<fs\u00ec\u008c\u0013\u0010ze\u009c\u00f3\u00ab\u00f3^\u00bd\u008d\u00af\u0084\u0014?\u00f6>o\u0013;\u001aC\u00db\u0095\u00c6\u00d9\u00bb\u00d7\u00f8\u00fc]$B\u0011PN\u00bf<\u00a4\u009a\u0015\u00dfE1\u0006\u00da\u00d2@\u0006\u0085\u00b8\u0080\n\u00adiQ\u00941\u00ae\\\u00e0Lg`\u00d7(j\u00ff\u00f7\u00aa\u008f\u0084m`\u0088\u009cL\u00ab\u00b4\u00f1\u00ab\u000e\u0016\u008a\u00f6\u00b9\u0095\u00b7G\\\u00ba*\u00b1\u008f\u00f3]\u00a7\u00e4\u00d3\u0095\u008a|\u00d8\u00a6B\u00a6&Z\u00ab\u0018_*-\u00f2\u0091X9\u00cd\u00c9\u0011K\u00b8\u00cd\u00b4\u0095\u00a4\u00db_".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            ** continue;
            break;
        }
        while (true) {
            var9_4[var10_5] = new String(var14_9).intern();
            var11_6 += var12_7;
            if (++var10_5 >= var8_3.length) ** continue;
lbl56:
            // 2 sources

            var12_7 = var8_3[var10_5];
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            if (true) ** GOTO lbl65
            break;
        }
        block12: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) ** continue;
lbl65:
            // 2 sources

            switch (var15_10 % 5) {
                case 2: {
                    v0 = 90;
                    continue block12;
                }
                default: {
                    v0 = 119;
                    continue block12;
                }
                case 3: {
                    v0 = 50;
                    continue block12;
                }
                case 1: {
                    v0 = 23;
                    continue block12;
                }
                case 4: 
            }
            v0 = 14;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIlII(VertexConsumer vertexConsumer, Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n, float f9) {
        if (f3 <= 0.0f) return;
        if (f4 <= 0.0f) {
            return;
        }
        int n2 = IIIlIIllI.I(f3);
        int n3 = IIIlIIllI.I(f4);
        float f10 = IIIlIIllI.lIIl(8);
        IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f, f2, f5, f6, n2, n3, 0.0f, f9, f10, n);
        IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f, f2 + f4, f5, f8, n2, n3, 0.0f, f9, f10, n);
        IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f + f3, f2 + f4, f7, f8, n2, n3, 0.0f, f9, f10, n);
        IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f + f3, f2, f7, f6, n2, n3, 0.0f, f9, f10, n);
    }

    static void IIlIl(DrawContext drawContext, double d, double d2) {
        drawContext.getMatrices().scale((float)d, (float)d2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void IIllI(VertexConsumer vertexConsumer, Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, int n, int n2, float f5, float f6, float f7, int n3) {
        vertexConsumer.vertex(matrix3x2fc, f, f2).color(n3).texture(f3, f4).light(n, n2).normal(f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    static void IIlll(DrawContext drawContext, Identifier identifier, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        if ((n11 >>> 24 & 0xFF) <= 0) return;
        if (n3 <= 0) return;
        if (n4 <= 0) return;
        if (n7 <= 0) return;
        if (n8 <= 0) return;
        if (n9 <= 0) return;
        if (n10 > 0) {
            drawContext.drawTexture(RenderPipelines.GUI_TEXTURED, identifier, n, n2, (float)n5, (float)n6, n3, n4, n7, n8, n9, n10, n11);
            return;
        }
    }

    static boolean IlIII(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, int n) {
        return IIIlIIllI.II(drawContext, identifier, d, d2, d3, d4, 0.0f, 0.0f, 1.0f, 1.0f, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IlIIl(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) return true;
        if ((n >>> 24 & 0xFF) > 0) {
            drawContext.state.addSimpleElement((SimpleGuiElementRenderState)new IIIIlIll((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)drawContext.getMatrices()), (float)d, (float)d2, (float)d3, (float)d4, (float)IIIlIIllI.IIIl(d3, d4, d5), 0.0f, n, false, drawContext.scissorStack.peekLast()));
            return true;
        }
        return true;
    }

    private static RenderPipeline IlIlI() {
        return RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{RenderPipelines.POSITION_TEX_COLOR_SNIPPET}).withLocation(IIIlIIllI.IIIlI(lllI)).withSampler(IlIl.IIII()).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withCull(false).withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, VertexFormat.DrawMode.TRIANGLES).build());
    }

    static void IlIll(DrawContext drawContext) {
        drawContext.getMatrices().pushMatrix();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IllII(VertexConsumer vertexConsumer, Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, float f7, int n) {
        if (f3 <= 0.0f) return;
        if (f4 <= 0.0f) {
            return;
        }
        int n2 = IIIlIIllI.I(f3);
        int n3 = IIIlIIllI.I(f4);
        float f8 = Math.max(1.0E-4f, Math.min(f3, f4));
        float f9 = IIIlIIllI.lIIlI(IIIlIIllI.llIIl(f5 / f8));
        float f10 = IIIlIIllI.lIIlI(IIIlIIllI.llIIl(f6 / f8));
        float f11 = IIIlIIllI.llIIl(f7);
        IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f, f2, 0.0f, 0.0f, n2, n3, f9, f10, f11, n);
        IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f, f2 + f4, 0.0f, 1.0f, n2, n3, f9, f10, f11, n);
        IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f + f3, f2 + f4, 1.0f, 1.0f, n2, n3, f9, f10, f11, n);
        IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f + f3, f2, 1.0f, 0.0f, n2, n3, f9, f10, f11, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IllIl(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, double d6, int n) {
        IlllIII illlIII;
        Matrix3x2f matrix3x2f;
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) return true;
        if (d6 <= 0.0) return true;
        if ((n >>> 24 & 0xFF) <= 0) {
            return true;
        }
        double d7 = IIIlIIllI.IIIl(d3, d4, d5);
        float f = (float)Math.max(0.25, d6);
        float f2 = (float)(d - (double)f);
        float f3 = (float)(d2 - (double)f);
        float f4 = (float)(d3 + (double)(f * 2.0f));
        float f5 = (float)(d4 + (double)(f * 2.0f));
        float f6 = (float)(d7 + (double)f);
        matrix3x2f((Matrix3x2fc)drawContext.getMatrices());
        illlIII((Matrix3x2fc)matrix3x2f, f2, f3, f4, f5, f6, f, 7, n, n, n, n, drawContext.scissorStack.peekLast());
        drawContext.state.addSimpleElement((SimpleGuiElementRenderState)illlIII);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IlllI(VertexConsumer vertexConsumer, Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        float f7 = Math.min(f6, Math.min(f3, f4) * 0.5f);
        float f8 = f3 - f7 * 2.0f;
        float f9 = f4 - f7 * 2.0f;
        if (!(f8 <= 0.0f) && !(f9 <= 0.0f)) {
            int n2 = IIIlIIllI.IIlI(f5);
            float[] fArray = new float[76];
            float[] fArray2 = new float[76];
            float[] fArray3 = new float[76];
            float[] fArray4 = new float[76];
            int n3 = IIIlIIllI.Il(fArray, fArray2, f, f2, f3, f4, f5, n2);
            int n4 = IIIlIIllI.Il(fArray3, fArray4, f + f7, f2 + f7, f8, f9, Math.max(0.0f, f5 - f7), n2);
            int n5 = Math.min(n3, n4);
            int n6 = 0;
            while (n6 < n5) {
                int n7 = (n6 + 1) % n5;
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, fArray[n6], fArray2[n6], n);
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, fArray[n7], fArray2[n7], n);
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, fArray3[n7], fArray4[n7], n);
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, fArray[n6], fArray2[n6], n);
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, fArray3[n7], fArray4[n7], n);
                IIIlIIllI.lIllI(vertexConsumer, matrix3x2fc, fArray3[n6], fArray4[n6], n);
                ++n6;
            }
            return;
        }
        IIIlIIllI.IIII(vertexConsumer, matrix3x2fc, f, f2, f3, f4, f5, n);
    }

    static void Illll(DrawContext drawContext, double d, double d2, double d3) {
        drawContext.getMatrices().translate((float)d, (float)d2);
    }

    private static RenderPipeline lIIII() {
        return RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET}).withLocation(IIIlIIllI.IIIlI(lIIl)).withVertexShader(IIIlIIllI.IIIlI(IIIl)).withFragmentShader(IIIlIIllI.IIIlI(lIII)).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withCull(false).withVertexFormat(VertexFormats.POSITION_COLOR_TEXTURE_LIGHT_NORMAL, VertexFormat.DrawMode.QUADS).build());
    }

    private static RenderPipeline lIIIl() {
        return RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET}).withLocation(IIIlIIllI.IIIlI(IIIlI)).withVertexShader(IIIlIIllI.IIIlI(III)).withFragmentShader(IIIlIIllI.IIIlI(III)).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withCull(false).withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, VertexFormat.DrawMode.QUADS).build());
    }

    private static float lIIlI(float f) {
        return IIIlIIllI.llIIl(f) * 2.0f - 1.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void lIIll(VertexConsumer vertexConsumer, Matrix3x2fc matrix3x2fc, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, int n3, int n4, int n5) {
        if (f3 <= 0.0f) return;
        if (!(f4 <= 0.0f)) {
            int n6 = IIIlIIllI.I(f3);
            int n7 = IIIlIIllI.I(f4);
            float f7 = Math.max(1.0E-4f, Math.min(f3, f4));
            float f8 = IIIlIIllI.llIIl(f5 / f7);
            float f9 = IIIlIIllI.llIIl(f6 / f7);
            float f10 = IIIlIIllI.lIIlI(f8);
            float f11 = IIIlIIllI.lIIlI(f9);
            float f12 = IIIlIIllI.lIIl(n);
            IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f, f2, 0.0f, 0.0f, n6, n7, f10, f11, f12, n2);
            IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f, f2 + f4, 0.0f, 1.0f, n6, n7, f10, f11, f12, n5);
            IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f + f3, f2 + f4, 1.0f, 1.0f, n6, n7, f10, f11, f12, n4);
            IIIlIIllI.IIllI(vertexConsumer, matrix3x2fc, f + f3, f2, 1.0f, 0.0f, n6, n7, f10, f11, f12, n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static void lIlII(DrawContext drawContext, Identifier identifier, int n, int n2, int n3, int n4, int n5) {
        if ((n5 >>> 24 & 0xFF) <= 0) return;
        if (n3 <= 0) return;
        if (n4 <= 0) {
            return;
        }
        drawContext.drawTexture(RenderPipelines.GUI_TEXTURED, identifier, n, n2, 0.0f, 0.0f, n3, n4, n3, n4, n5);
    }

    static void lIlIl(DrawContext drawContext, double d) {
        drawContext.getMatrices().rotate((float)Math.toRadians(d));
    }

    private static void lIllI(VertexConsumer vertexConsumer, Matrix3x2fc matrix3x2fc, float f, float f2, int n) {
        vertexConsumer.vertex(matrix3x2fc, f, f2).color(n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static @Nullable ScreenRect lIlll(float f, float f2, float f3, float f4, Matrix3x2fc matrix3x2fc, @Nullable ScreenRect screenRect) {
        ScreenRect screenRect2;
        int n = (int)Math.floor(f);
        int n2 = (int)Math.floor(f2);
        int n3 = (int)Math.ceil(f + f3);
        int n4 = (int)Math.ceil(f2 + f4);
        ScreenRect screenRect3 = new ScreenRect(n, n2, Math.max(1, n3 - n), Math.max(1, n4 - n2)).transform(matrix3x2fc);
        if (screenRect == null) {
            screenRect2 = screenRect3;
            return screenRect2;
        }
        screenRect2 = screenRect.intersection(screenRect3);
        return screenRect2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean llIII(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        Illlllll illlllll;
        Matrix3x2f matrix3x2f;
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) return true;
        if ((n >>> 24 & 0xFF) <= 0) {
            return true;
        }
        float f = (float)Math.max(0.0, d5);
        matrix3x2f((Matrix3x2fc)drawContext.getMatrices());
        illlllll((Matrix3x2fc)matrix3x2f, (float)d, (float)d2, (float)d3, (float)d4, f, n, drawContext.scissorStack.peekLast());
        drawContext.state.addSimpleElement((SimpleGuiElementRenderState)illlllll);
        return true;
    }

    private static float llIIl(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean llIlI(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, float f, float f2, float f3, float f4, int n, float f5) {
        if (drawContext == null) return true;
        if (identifier == null) return true;
        if (d3 <= 0.0) return true;
        if (d4 <= 0.0) return true;
        if ((n >>> 24 & 0xFF) > 0) {
            AbstractTexture abstractTexture = MinecraftClient.getInstance().getTextureManager().getTexture(identifier);
            drawContext.state.addSimpleElement((SimpleGuiElementRenderState)new IIIlllII((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)drawContext.getMatrices()), (float)d, (float)d2, (float)d3, (float)d4, f, f2, f3, f4, n, f5, TextureSetup.of((GpuTextureView)abstractTexture.getGlTextureView(), (GpuSampler)abstractTexture.getSampler()), drawContext.scissorStack.peekLast()));
            return true;
        }
        return true;
    }

    private static int llIll(int n, int n2) {
        return IIlIl[n ^ 0x7169F640] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lllII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x94BBBDEA;
        char[] cArray = IIllI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIlll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIlIIllI.IIlll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3D1A3D7C;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 28 -> 42;
                case 16 -> 146;
                case 22 -> 237;
                case 3 -> 193;
                case 25 -> 127;
                case 15 -> 204;
                case 6 -> 60;
                case 9 -> 173;
                case 19 -> 173;
                case 2 -> 26;
                case 10 -> 113;
                case 17 -> 47;
                case 23 -> 66;
                case 21 -> 210;
                case 1 -> 164;
                case 8 -> 98;
                case 24 -> 135;
                case 18 -> 44;
                default -> 72;
                case 12 -> 194;
                case 27 -> 183;
                case 14 -> 129;
                case 4 -> 57;
                case 29 -> 237;
                case 30 -> 38;
                case 20 -> 153;
                case 31 -> 24;
                case 26 -> 125;
                case 11 -> 93;
                case 13 -> 128;
                case 7 -> 91;
                case 5 -> 123;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

