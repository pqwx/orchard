/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - pipeline/ilovcats_xray_lines
 *   - pipeline/ilovcats_xray_quads
 *   - ilovcats_circle_overlay
 *   - ilovcats_circle_depth
 *   - drawWithGlobalProgram
 *   - ilovcats_xray_lines
 *   - ilovcats_xray_quads
 *   - disableDepthTest
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.font.TextRenderer$TextLayerType
 *  net.minecraft.client.gl.RenderPipelines
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.LayeringTransform
 *  net.minecraft.client.render.OutputTarget
 *  net.minecraft.client.render.OverlayTexture
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.RenderLayers
 *  net.minecraft.client.render.RenderSetup
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.joml.Vector4f
 */
package orchard.internal;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.LayeringTransform;
import net.minecraft.client.render.OutputTarget;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.client.render.RenderSetup;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import orchard.internal.II;
import orchard.internal.IIIlI;
import orchard.internal.IIllllllI;
import orchard.internal.lIIllIl;
import orchard.internal.lIlll;
import orchard.module.iface.Interface;
import orchard.module.render.PlayerHider;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector4f;

@Environment(value=EnvType.CLIENT)
public final class IllIlI {
    private static final Method I;
    private static final Method l;
    private static final Method II;
    private static final Method Il;
    private static final Method lI;
    private static final Object ll;
    private static final Method III;
    private static float IIl;
    private static final Vector4f IlI;
    private static final Method Ill;
    private static final RenderLayer lII;
    private static final Method lIl;
    private static final int llI = 0xF000F0;
    private static final Method lll;
    private static final RenderLayer IIII;
    private static String[] IIIl;
    private static final Method IIlI;
    private static final RenderLayer IIll;
    private static final Method IlII;
    private static final Object IlIl;
    private static final Matrix4f IllI;
    private static final Method Illl;
    private static final Object lIII;
    private static final RenderLayer lIIl;
    private static final Method lIlI;
    private static final Object lIll;
    private static final Method llII;
    private static final int[] llIl;
    private static final String[] lllI;
    private static final Object[] llll;

    /*
     * Enabled aggressive block sorting
     */
    public static void I(Object object, Box box, Color color, double d, float f) {
        if (!IllIlI.lllll(object, box)) {
            return;
        }
        if (!(object instanceof II)) {
            if (!(object instanceof WorldRenderContext)) return;
            WorldRenderContext worldRenderContext = (WorldRenderContext)object;
            IllIlI.l(worldRenderContext.matrices(), worldRenderContext.consumers(), box, color, d, f);
            return;
        }
        II iI = (II)object;
        IllIlI.l(iI.Il(), iI.I(), box, color, d, f);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void l(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, Box box, Color color, double d, float f) {
        VertexConsumer vertexConsumer;
        Matrix4f matrix4f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        block6: {
            if (matrixStack == null || box == null || color == null) {
                return;
            }
            Camera camera = MinecraftClient.getInstance().gameRenderer.getCamera();
            Vec3d vec3d = camera.getCameraPos();
            f11 = (float)(box.minX - vec3d.x);
            f10 = (float)(box.minY - vec3d.y);
            f9 = (float)(box.minZ - vec3d.z);
            f8 = (float)(box.maxX - vec3d.x);
            f7 = (float)(box.maxY - vec3d.y);
            f6 = (float)(box.maxZ - vec3d.z);
            f5 = (float)color.getRed() / 255.0f;
            f4 = (float)color.getGreen() / 255.0f;
            f3 = (float)color.getBlue() / 255.0f;
            f2 = (float)IllIlI.IIlllI(d) / 255.0f;
            matrix4f = matrixStack.peek().getPositionMatrix();
            if (vertexConsumerProvider != null) {
                VertexConsumer vertexConsumer2 = vertexConsumerProvider.getBuffer(RenderLayers.lines());
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f10, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), 1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f10, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), 1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f10, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f7, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f7, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), -1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f7, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), -1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f7, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, -1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f10, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, -1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f10, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), 1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f10, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), 1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f10, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f7, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f7, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), -1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f7, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), -1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f7, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, -1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f10, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, -1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f10, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f10, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f10, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f10, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f7, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f8, f7, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f7, f9).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
                vertexConsumer2.vertex((Matrix4fc)matrix4f, f11, f7, f6).color(f5, f4, f3, f2).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
                return;
            }
            IllIlI.IIIIll(IlII);
            IllIlI.IIIIll(II);
            IllIlI.IIIIll(Ill);
            IllIlI.IIllIl();
            IllIlI.IlIlI(lll, lIII);
            IllIlI.IlIlI(Illl, Float.valueOf(IllIlI.lllI(f)));
            try {
                Object object = IllIlI.IIlll(lIl, new Object[0]);
                vertexConsumer = (VertexConsumer)IllIlI.IIlIIl(object, llII, IlIl, lIll);
                if (vertexConsumer != null) break block6;
            }
            catch (Throwable throwable) {
                IllIlI.IlIlI(Illl, Float.valueOf(1.0f));
                IllIlI.Ill();
                IllIlI.IIIIll(lI);
                IllIlI.IIIIll(lIlI);
                throw throwable;
            }
            IllIlI.IlIlI(Illl, Float.valueOf(1.0f));
            IllIlI.Ill();
            IllIlI.IIIIll(lI);
            IllIlI.IIIIll(lIlI);
            return;
        }
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f6).color(f5, f4, f3, f2);
        Object object = IllIlI.IIlIIl(vertexConsumer, I, new Object[0]);
        if (object != null) {
            IllIlI.IlIlI(III, object);
        }
        IllIlI.IlIlI(Illl, Float.valueOf(1.0f));
        IllIlI.Ill();
        IllIlI.IIIIll(lI);
        IllIlI.IIIIll(lIlI);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void II(MatrixStack matrixStack, Box box, Color color, double d) {
        if (matrixStack == null || box == null || color == null) {
            return;
        }
        Camera camera = MinecraftClient.getInstance().gameRenderer.getCamera();
        Vec3d vec3d = camera.getCameraPos();
        float f = (float)(box.minX - vec3d.x);
        float f2 = (float)(box.minY - vec3d.y);
        float f3 = (float)(box.minZ - vec3d.z);
        float f4 = (float)(box.maxX - vec3d.x);
        float f5 = (float)(box.maxY - vec3d.y);
        float f6 = (float)(box.maxZ - vec3d.z);
        float f7 = (float)color.getRed() / 255.0f;
        float f8 = (float)color.getGreen() / 255.0f;
        float f9 = (float)color.getBlue() / 255.0f;
        float f10 = (float)IllIlI.IIlllI(d) / 255.0f;
        Matrix4f matrix4f = matrixStack.peek().getPositionMatrix();
        IllIlI.IIIIll(IlII);
        IllIlI.IIIIll(II);
        IllIlI.IIIIll(Ill);
        IllIlI.IIllIl();
        IllIlI.IlIlI(lll, lIII);
        try {
            Object object = IllIlI.IIlll(lIl, new Object[0]);
            VertexConsumer vertexConsumer = (VertexConsumer)IllIlI.IIlIIl(object, llII, ll, lIll);
            if (vertexConsumer == null) {
                return;
            }
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
            Object object2 = IllIlI.IIlIIl(vertexConsumer, I, new Object[0]);
            if (object2 != null) {
                IllIlI.IlIlI(III, object2);
            }
        }
        finally {
            IllIlI.Ill();
            IllIlI.IIIIll(lI);
            IllIlI.IIIIll(lIlI);
        }
    }

    private static Object Il() {
        Object object = IllIlI.IIII("net.minecraft.client.gl.ShaderProgramKeys", "POSITION_COLOR");
        if (object == null) {
            object = IllIlI.IIII("net.minecraft.client.render.ShaderProgramKeys", "POSITION_COLOR");
        }
        return object;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 194;
        var7_2 = "\u02b6\u7558\u3f7e\uaf22\u9cb8\ub54f\ue167\u96a4\ue843\uc99c\u6fcb\u4ae5\u04dc\ub29b\u8d86\u7a21\u1a0e\u3f94\u0a7b\uff26\u49ef\uf32c\u1361\ua8bb\ue5c2\u645a\uac1d\u0e93\u0be9\ub094\u30d3\u9967\u2a18\u46dc\ub40b\uace5\u57ed\uadcd\u8fd0\u56c8\u4ac8\u0349\ue4db\ue8a9\u3b4b\ucaca\uae34\u39b2\uce6d\u7aca\udef6\uf5ef\u5276\u6163\u753c\u0c85\u5a3b\u8ae4\u6e79\u3547\u4127\u443b\u3429\ucf11\uc28c\u65ca\u6a80\ud06f\u4a75\u1b59\u886f\u97f2\u3840\uc4ea\ue702\u2746\u836b\u2cd7\uf620\ua929\u10cc\ua51d\uae46\uc394\u69c1\uab29\udb71\ua198\u60d8\u897d\ub45c\ucfa0\ua2ab\u1bb5\u380c\uaceb\ue7ca\u4859\u9994\ue3d7\uaac6\udc6a\ucca7\u2f1e\u3f9f\u27f2\ub3f2\u32b0\u76c7\u47d5\uc6e3\u52cf\u6549\u00b7\u8206\uca77\u268f\u868c\u3a7d\u6a8d\ud911\uec6e\ud9b7\udd10\u379c\u681e\u1eab\u1cbd\u9ff7\u544c\u0cbd\u0e96\u5a28\u8f06\u9410\u1813\u4acc\u133a\u05f5\u0ada\u3b81\u6459\u6b60\u3a28\uf35a\uf044\ud563\u63dd\u9ad5\u0645\ufac5\u52ad\u72e8\u8ba2\u4ea0\u08da\u8533\u6ff8\uc2b5\ue2f7\u4e4a\u5b32\u6566\u53ef\udb94\ub54a\u162f\ua93b\ue245\ud0ac\u3843\ude89\ufb51\ucb79\ub220\u41cb\ufb32\u7413\u3e67\uf2e5\ubfb7\ua901\u6893\uf417\u1891\uffe7\u6368\ud978\u5609\u4e9b\uec1a\u941a\u1c79\uc6a1\ubba4\uf7cd\u8607\u9dae\uebc6\ud1a2\uac13\u5378\ud6a5\u39f4\u1aab\ud31d\ud52e\u0f21\u3c01\u4ee1\u03d5\u01ca\ubfff\u606e\u2804\u6e7a\u8d50\uc852\ua14d\uc833\u4db6\u8a1e\ueaa0\u7407\ucdef\ud872\uf6b5\u7984\uae27\u5c60\u137f\u963a\u927c\u7c4d\u16d1\u560a\uc53c\u3b6f\ucbfd\u0d8b\ua422\u42ee\u5712\u3798\ud1f6\udbe4\u6a69\u50c2\ubcb1\u50a3\u6465\ub6c9\u084d\uc58e\u3600\ub2dc\u98b3\u5a4c\uc7f0\u5c70\u535f\u8dcb\ud5e9\u3157\u828d\ud80d\ue83b\ube95\u0610\u1c98\ud887\u78f1\u0eed\ua22b\u1c86\uee01\ud136\u0b06\u9af9\u9857\u2d7c\uabe5\ue51a\u9690\ucbb4\uea8e\u4b1c\u1f53\ue8e3\u939b\uec87\u9f72\u9fff\u4511\u1870\u8700\u729c\ua23a\u63d5\u6ce0\u6007\u995d\uef50\ubc15\u91d5\ua759\u2106\u8a6f\u58ed\u9bf6\ufb6b\u80d3\uf9f4\u3c8b\u6d71\u8289\u9309\u5122\u17c8\ud8f7\ue44a\uea01\u1438\u54ce\u9e85\u7574\u3885\u9c2e\u7154\u23f7\u3720\u4c69\u7054\u5623\ua826\u300c\u2c25\ue067\u3c12\uff3c\u0395\ub085\uafa0\u8a98\u53e8\ucdd5\ub7d8\u0b1e\u7917\uf4b2\ua0bb\u0e08\uaba2\uc582\ud468\ucfa2\u05e7\u13c4\uc613\u2e08\u61c7\u281c\ueb1b\u6343\u9cc9\u2445\u2f39\u0a2f\uc271\ucde7\u4cd0\ud688\ud1f2\ue734\u58f6\u7f36\uebd3\ua936\u55d6\u6911\u0570\udc04\u7b76\u4843\ue594\u94dd\ub986\u5e0e\ucc46\u287d\uafd8\u16cc\u548a\u507b\u70b1\ud236\uc895\u0d94\u2b2e\uc8cb\uc71c\u0005\u5bf4\ua0f2\ubdf9\u528a\u0301\u6e5d\uf83c\u484b\u518f\uad80\uec89\u852a\ueb3d\u36f5\u8659\ubd94\u157e\udc38\u55b0\u0185\u09d6\u038b\u8cdc\udcc9\uea43\u5091\uad44\uc09e\ua18f\u83bd\ufbf4\ub915\uf7ad\uab67\ud02c\ud380\u58a2\u610d\u3652\u343f\u2ca7\u5134\ud66f\u79f7\uc60f\u9c31\ue9eb\u30c0\udca0\uf98e\ud697\uf288\ub876\u96b1\uf11b\u04ad\ubfe5\u6749\uda74\u7d58\u0e88\u9612\u9a3c\uc3c4\u2df7\uac38\u1bd5\ub87f\ua11e\u9b7a\uaed8\ube10\u1f46\ucdbb\u7063\u24a3\u465c\u74db\u1c06\uc790\u6d2e\u4cb4\uf647\ufb3c\uf94c\u73b9\u8e1c\ubf78\u08d4\u22d9\ue240\u74be\ud019A\uf0af\uc07a\u4cb1\uf957\u1485\u6afd\u1abd\ucc39\udd06\ub7d9\u5d74\ub423\ueb74\u1a4b\u8e07\u4441\u891e\u7f7c\u73aa\u7695\u6ed6\uc472\ud8dd\u1b6b\u792d\u1b43\uafdc\u956b\uc0b4\u369e\u14e6\ud37d\u1f37\u87fc\ue678\uce7b\ubc5e\u27ce\u5eb6\ud3d6\uaa0b\u017f\udabd\u4bf8\uf494\u46d7\ub486\ua747\u5b37\u9720\uc0a5\u81a1\ua797\u8595\u1cc0\udbec\u9c20\ud8ee\ud3c9\u7c03\u68a9\u219a\u5e6b\u6259\u10ae\ubb40\u2a89\u31f6\u5894\u53dd\uf527\uead5\u349d\u56bc\u403e\u0e7d\u145c\u95c5\ucfa3\u81d0\u62a9\u3321\ueb87\ub444\ucc1d\u5142\u7adc\uc96f\u20f9\u3be5\uc5e3\u94e6\udb01\ud1de\ufd27\u4716\uc7fe\u47a9\u6319\u057b\u9e53\u2c30\ub156\u511b\u313f\ub385\uf6dd\u5eca\u70d2\udac1\ubea1\u4114\uaddd\ud67c\ube4f\u0ae2\ubc90\u09d2\u6674\uc137\ua20d\u1e8e\u057d\ud0d3\u58d3\ud20d\uf3f6\u13a6\u21a1\u5d5b\udbb4\u5cb6\u6282\ueefe\u77b4\u1b7c\ue071\uf6b6\ufaa3\ub943\ub664\ufc86\ufa98\u12c9\ub2bb\u06a1\u2ea4\u2161\ubbae\u69bf\u5269\u4ce9\u938a\ud80f\u6401\u3a8c\u845c\u4e08\u4391\u809d\u52ed\udf73\ub0e6\uab02\u0106\u1e9f\u0a93\u33af\u3734\u5527\u60f1\u79f7\u3664\u6f94\u0f61\u2293\uad60\u1bf3\ua647\u5fb3\ud07c\ue8e2\ua984\u5042\u6a60\u22c7\uce5d\uc0c5\u6d26\u91c5\u25ed\ud4fa\u9414\ue926\u5c1f\ue58b\u9315\u063e\ue5ce\ub124\u8d06\u3e66\ud651\u976d\ud602\u736c\u703a\u183c\u4052\u2cb9\u648f\u2d4b=\uef18\u3280\u3851\u98c3\u9b5f\ue4cb\uf8da\u059e\uc194\u95ba\u6ef6\u8b7e\u2fdb\ub64b\u1de8\u5361\u7b5e\u2beb\u35c9\uf4de\uc92d\u22a2\uffe5\ub88e\u440a\u25ff\ud64aB\uae30\u18e5\u6527\u5436\u879c\u6f1d\u1c87\u7d7f\u8c10\ud747\ua073\uc72e\u6476\u8673\u10b9\u1ad1\ud7fa\u8ed7\u440b\u76a8\ude5e\ue8b3\u13f9\ub95f\u2c3f\uaeb2\ub351\u3af2\u977c\u0eb4\uc395\ub356\uf79c\ub062\ubfb8\u663dY\u6503\u1f8c\u8d7c\ua55c\u7f32\u308d\uaec6\u8da2\u23ee\u5f38\udfdb\udceb\u420c\u4b90\ue7c8\u3ff2\uc604\u77f7\uaaff\u9bc5\u7704\u710c\uab8d\u7c69\uf533\u618e\u521d\u0126\ue4fc\u3eb7\u4470\u0657\uc316\u9d5a\u9f30\u7e9b\ueb56\ue8a3\u1745\udee4\u2ce0\u3cc3\u621f\uf667\ud9e3\u5eec\u142b\ua3b6\u582b\u1330\uc25c\u1462\u5481\u4645\u5972\u9883\uad35\ua545\u6f23\u7559\ud674\uc691\ub75f\u7128\u21d8\u5dc3\ua96f\u37c7\u0c71\u0392\ubbe6\u7ed6\u2f94\t\uda2d\ud71e\u6169\u1c6f\u47be\u7faa\ud3fc\u1e80\u47d8\u3011\u744e\u427b\ufe92\ub334\uf717\ube6e\u9852\ue49f\uecc5\uc69f\u8c39\ua99b\u3ec2\ud2ce\u6099\uf3b5\ua081\ua59d\u64b6\u1db4\u1448\u19e7\u4d09\u5cd1\ud343\u8c3e\ucaa8\u54b4\u37da\ufade\u937d\u83d3\ufb88\u2641\uc704\u7fb3\uf785\u4304\uecef\u35c3\u9305\ubf40\u9745\u95fb\uaaff\u1d68\ub344\u5671\u08e0\u37ce\u7c84\ub541\udc2c\ub890\uf7ff\ud383\u60f0\u07ee\u18e4\u6275\u409d\u895a\ue7cb\uc0e8\u8416\u57df\u694f\u4ce4\u4c39\u5963\u8639\u90ca\ucf0a\ua3a8\u8abf\u6791\u8009\ubeef\ua5a9\uc6a3\u3105\u2144\u1189\uddc4\u37f7\ucfe2\u6250\uf9a2\ua7bf\u5266\uff89\u0c6d\u1448\ua586\ub280\uae28\u91d6\u8b5b\u54f6\uc6bd\u3444\u2ac9\ue4fa\u5200\u3d50\u2012\ua504\u6b4e\uc02b\u7505\u1637\u1a99\u301c\uef99\u2feb\u5636\u4edf\u8573";
        var8_3 = "\u00fe\u00fa\u00d6\u0086\u00f6\u00ce\u00d2\u00d2\u00ce\u00fa\u00ca\u00d2\u00d2\u00de\u00de\u00f6\u00da\u00ea\u00d6\u00d6\u00ce\u00d2\u00d2\u00c6\u00d2\u00ca\u00da\u00fa\u00de\u00e2\u00ea\u00fa\u00de\u00d6".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl12
lbl7:
        // 1 sources

        while (true) {
            continue;
            break;
        }
lbl9:
        // 1 sources

        while (true) {
            block14: {
                if (++var10_5 < var8_3.length) break block14;
                var13_8 = 0;
lbl12:
                // 2 sources

                var10_5 = 0;
                var11_6 = 0;
                var12_7 = 0;
                if (var13_8 == 0) {
                    IllIlI.lllI = var9_4;
                    IllIlI.llll = new Object[var9_4.length];
                    var2_13 = -1784218691;
                    var0_11 = "\u00de\u00d6\u0088\u00fcL\u008d\u00f1_\u00eaS\u00c5\u00df\u0095\u00e8\u00d2\u0002O\u0089\u007f\u00f1\u00f8\u008d\u00d4d\u00bc\u00dfh;iB\u0089\u00e6\u00d9o~\u00ea\u0082\u00bb\u00db\u00be\u0094\u00e8U\u008e\u00d0\u0093\u00f7!\u00ea\u00d6\u0085\u00e6\u009d\u0019\u00c6\u0010Ms*\u00f1\u001c\u0085l\u0086\u008f\u009fK\u0003n`f\u009d8\u008c%G|\u00cf\u00f0\u00ba\u008d=\u00f0\t?\u008f\u00cb7f\u00f5N\u00ad\u00c8i\u0084D\u0013I\u0003\u00f0\u00c1?\u0098ffv\u00b6B\u00e1C\u0092~2MI\u008e\u00aaF\\\u00acu\u00dc?\u009b\u00ddI6\u0097\u00fe\u00acJ\u00da~b\u00f8Zp:)p\u00d6\u00fd\u0086\u00c6ws\u00cfDz\u009d\u0081\u00d4(-\u00d4\u00fc%\u00d3E\u008e\u00a6\u00b6z\u0084`^\u00f2\u00b9,#\u009dF\u00fa%\u00b4\u0014y\u00ac\u00ae\u00fer,\u008d\u0000U\u00dd\u00e6V\u00ffk\u00b3\u0094\u00af\u00c3\u00eaWt^h*\u00fd\u00eb\u00e9qN\u00c70\u00d5\u008c\u0082\u00a0\u0087?\u00ed\u00c0t\u000b\f\u00137W\u0000\u00cfU\u00db\u0088G\b6T0^\u00de\u0092\u00ca\u0019)G\u00b4$\u00d7\u0007;B8K\u00c7\u00c6U\u0094+\u00a8=\u0098\u0094\u0081xvA N\u00de\u00a4\"<U\u0084\u00a9\bV\u00fd}\u0006p\u00f2d\u00ec\u00a4\u00ad\u0086\u00ff\u00be\u0019\u00bc5\u00e1BU\u009e\u009e\u00dbS\u00cf-\u00ff\u0000\u00ca\u001f\u0007\u00df\u000b{\tB\u001b\u00a4\u00ebU\u00b8_B\u0019\u00f6\u00da_\u009aS\u00e1Y\u009f^B/\u00a9 \u0091m\u0014\u00a6\f\u0003\u000f\u00dc \u00fa\u00c0\u00be\u00df\u00ac7\u008d\u0012\u00a5\u00fa(fp$k\u00fex\u00eb\u00df\u00f8q2s\u00af\u00b5\u00e7i\u0001p\u00acs\u00fa7`xI\u0084\u00ac`\u00e5N\u00c4\u00c9\u00bd\u0018\u00c8\t_\u008dE%\u00d3e\u0003z\u00cc\u0099\u00e4X\u00bbp\u00c3j$\u009b\u0089@\u00dfD!\u00f2:\u0006\u00c4\u00ab\u009f\u0091\u00c7\u00f0S\u00d7\u0013.\u00c41\u0088\u00c3\u0015\u00da@\u00d7\u0017V\u0002FHBO-\u009b\u00e7\u00d7\u00a0\u0016\u00a0R\u001e\u00a8\u00fb\u00d0DC\u00ce\u0005r\t\u00da\u00d9p\u00111WS\u0001\u00ee\u00af\u00b2\u00b4\u00980\u0098R\u00ea\u00c4`\u00a1\u0082\u00a0\u00b5\u00c1\u00ec\u0080z\u0005Zm(`\u00c9\u0002s\u0084\u00ffx/\u00b4\u00f4=\u0094b\u00ab\u0001\u00e2\u00b4\u001f\u0082\u00c3?c$/\u00f0\u00c6\u00a0\u008c\tp\u00c6\u0012\u00de\u00e5.a0\u0087E\u009b\u00f3s\u0004\u00b4\u0081r\u00ffl((o{\u00db\r\u00a1\u0007\u0014\u00de/\u00f2\u00c4Z\u00b1P\u00e1:\u00a2\u0094\u00d0\u00fddU0\u00a3\u00e5=\u00db=\u0007\u00fa\u008f=\u0090\u00c8\u00d9\u0003K\u00eb\u00b3\u00ed\u001b(\u009d\u00ab\\\u00d2u\u00b4\u0007%,\u0015\u008ayL\u00ea\u00c3\u00b2\u00bb\u001f\u0097^s\u0096\u0003h\u00f7\u0010(^_\u0087\u009fE\u00b0\u008c\u00e6 \u00a6\u008b\u00e4\u00d89\u0004~p\u0087\u0019=\u00ba\u00b3H\u00d5\u00fb\u00de\u00b9\u0005\u0018\u0088X\u00fe7}\u0000}\u008f\u00a2\u00c8[\u00bb_\u009bZ\u00d7\u007f\u00e4Z]U\u00be'BF\\;i\u001d\u00adoC\u009fT\u00f8\u00d9\u0093\u0017\u00e3\u0080\u00a6X\u0000~\u0090R\u00df\u00d5\n8D\u00d4\u008f\u00d5\u00b0\u009a\u00e0\u000b\u00e4Q\u00f1\u00df\u00fe".getBytes("ISO-8859-1");
                    var1_12 = var0_11.length / 4;
                    IllIlI.llIl = new int[var1_12];
                    var3_14 = 0;
                    ** continue;
                }
            }
            var12_7 = var8_3[var10_5] ^ var6;
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            if (true) ** GOTO lbl68
            break;
        }
        var4_15 = 0;
        do {
            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
            IllIlI.llIl[var4_15] = var5_16 ^= var2_13;
            var3_14 += 4;
        } while (++var4_15 < var1_12);
        IllIlI.IIIl = new String[34];
        IllIlI.lI();
        IllIlI.IllI = new Matrix4f();
        IllIlI.IlI = new Vector4f();
        IllIlI.Illl = IllIlI.IIIIl("com.mojang.blaze3d.systems.RenderSystem", "lineWidth", 1);
        IllIlI.l = IllIlI.IIIIl("com.mojang.blaze3d.systems.RenderSystem", "disableDepthTest", 0);
        IllIlI.Il = IllIlI.IIIIl("com.mojang.blaze3d.systems.RenderSystem", "enableDepthTest", 0);
        IllIlI.IlII = IllIlI.IIIIl("com.mojang.blaze3d.systems.RenderSystem", "enableBlend", 0);
        IllIlI.lIlI = IllIlI.IIIIl("com.mojang.blaze3d.systems.RenderSystem", "disableBlend", 0);
        IllIlI.II = IllIlI.IIIIl("com.mojang.blaze3d.systems.RenderSystem", "defaultBlendFunc", 0);
        IllIlI.lI = IllIlI.IIIIl("com.mojang.blaze3d.systems.RenderSystem", "enableCull", 0);
        IllIlI.Ill = IllIlI.IIIIl("com.mojang.blaze3d.systems.RenderSystem", "disableCull", 0);
        IllIlI.IIlI = IllIlI.IIIIl("com.mojang.blaze3d.systems.RenderSystem", "depthMask", 1);
        IllIlI.lll = IllIlI.IIIIl("com.mojang.blaze3d.systems.RenderSystem", "setShader", 1);
        IllIlI.lIl = IllIlI.IIIIl("net.minecraft.client.render.Tessellator", "getInstance", 0);
        IllIlI.llII = IllIlI.IIIIII("net.minecraft.client.render.Tessellator", "begin", 2);
        IllIlI.I = IllIlI.IIIIII("net.minecraft.client.render.BufferBuilder", "end", 0);
        IllIlI.III = IllIlI.IIll();
        IllIlI.IlIl = IllIlI.IIII("net.minecraft.client.render.VertexFormat$DrawMode", "DEBUG_LINES");
        IllIlI.ll = IllIlI.IIII("net.minecraft.client.render.VertexFormat$DrawMode", "QUADS");
        IllIlI.lIll = IllIlI.IIII("net.minecraft.client.render.VertexFormats", "POSITION_COLOR");
        IllIlI.lIII = IllIlI.Il();
        IllIlI.IIll = RenderLayer.of((String)"ilovcats_xray_lines", (RenderSetup)RenderSetup.builder((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{RenderPipelines.RENDERTYPE_LINES_SNIPPET}).withLocation("pipeline/ilovcats_xray_lines").withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).build()).layeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING).outputTarget(OutputTarget.ITEM_ENTITY_TARGET).build());
        IllIlI.lII = RenderLayer.of((String)"ilovcats_circle_depth", (RenderSetup)RenderSetup.builder((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{RenderPipelines.RENDERTYPE_LINES_SNIPPET}).withLocation("circle_depth").withDepthWrite(false).build()).layeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING).build());
        IllIlI.lIIl = RenderLayer.of((String)"ilovcats_circle_overlay", (RenderSetup)RenderSetup.builder((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{RenderPipelines.RENDERTYPE_LINES_SNIPPET}).withLocation("circle_overlay").withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).build()).layeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING).build());
        IllIlI.IIII = RenderLayer.of((String)"ilovcats_xray_quads", (RenderSetup)RenderSetup.builder((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET}).withLocation("pipeline/ilovcats_xray_quads").withCull(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).build()).translucent().layeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING).build());
        IllIlI.IIl = 1.0f;
        return;
        block9: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
            if (var15_10 >= var14_9.length) ** GOTO lbl81
lbl68:
            // 2 sources

            switch (var15_10 % 5) {
                case 2: {
                    v0 = 63;
                    continue block9;
                }
                case 3: {
                    v0 = 41;
                    continue block9;
                }
                case 1: {
                    v0 = 102;
                    continue block9;
                }
                default: {
                    v0 = 39;
                    continue block9;
                }
lbl81:
                // 1 sources

                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                ** continue;
                case 4: 
            }
            v0 = 98;
        }
    }

    private static void lI() {
        IllIlI.IIIl[0] = IllIlI.III(IllIlI.IlIIll(-2050134808, '\u20de', 62947).toCharArray(), 29858L, -577557936);
        IllIlI.IIIl[1] = IllIlI.III(IllIlI.IlIIll(1547988048, '\u20df', 41503).toCharArray(), 33803L, 489272879);
        IllIlI.IIIl[2] = IllIlI.III(IllIlI.IlIIll(-810853096, '\u20dc', 11863).toCharArray(), 91313L, -517545007);
        IllIlI.IIIl[3] = IllIlI.III(IllIlI.IlIIll(-1633596362, '\u20dd', 59699).toCharArray(), 72211L, -1205449311);
        IllIlI.IIIl[4] = IllIlI.III(IllIlI.IlIIll(1824939086, '\u20da', 3086).toCharArray(), 33798L, -1452592504);
        IllIlI.IIIl[5] = IllIlI.III(IllIlI.IlIIll(-1043523446, '\u20db', 50933).toCharArray(), 92728L, -1884941623);
        IllIlI.IIIl[6] = IllIlI.III(IllIlI.IlIIll(-473534748, '\u20d8', 6988).toCharArray(), 70923L, 739465550);
        IllIlI.IIIl[7] = IllIlI.III(IllIlI.IlIIll(1658287307, '\u20d9', 55805).toCharArray(), 20925L, 1570347067);
        IllIlI.IIIl[8] = IllIlI.III(IllIlI.IlIIll(1650787330, '\u20d6', 24414).toCharArray(), 26643L, 1756286259);
        IllIlI.IIIl[9] = IllIlI.III(IllIlI.IlIIll(-2089265689, '\u20d7', 25707).toCharArray(), 26608L, -279679591);
        IllIlI.IIIl[10] = IllIlI.III(IllIlI.IlIIll(-2114113683, '\u20d4', 2181).toCharArray(), 97487L, 1338109825);
        IllIlI.IIIl[11] = IllIlI.III(IllIlI.IlIIll(732636223, '\u20d5', 24698).toCharArray(), 86690L, -1869975431);
        IllIlI.IIIl[12] = IllIlI.III(IllIlI.IlIIll(-1326564612, '\u20d2', 19367).toCharArray(), 5316L, 657609327);
        IllIlI.IIIl[13] = IllIlI.III(IllIlI.IlIIll(609883985, '\u20d3', 25009).toCharArray(), 94107L, 1193775414);
        IllIlI.IIIl[14] = IllIlI.III(IllIlI.IlIIll(1223820115, '\u20d0', 50558).toCharArray(), 50774L, 547708095);
        IllIlI.IIIl[15] = IllIlI.III(IllIlI.IlIIll(811298568, '\u20d1', 37967).toCharArray(), 22215L, -1623569962);
        IllIlI.IIIl[16] = IllIlI.III(IllIlI.IlIIll(-286194988, '\u20ce', 41249).toCharArray(), 12603L, 1435191870);
        IllIlI.IIIl[17] = IllIlI.III(IllIlI.IlIIll(95640568, '\u20cf', 16094).toCharArray(), 55709L, 1606105727);
        IllIlI.IIIl[18] = IllIlI.III(IllIlI.IlIIll(1461090304, '\u20cc', 24832).toCharArray(), 7292L, -2121414691);
        IllIlI.IIIl[19] = IllIlI.III(IllIlI.IlIIll(1942039717, '\u20cd', 25913).toCharArray(), 11544L, 1019803668);
        IllIlI.IIIl[20] = IllIlI.III(IllIlI.IlIIll(-1997382214, '\u20ca', 1152).toCharArray(), 42791L, 1106946181);
        IllIlI.IIIl[21] = IllIlI.III(IllIlI.IlIIll(-220365569, '\u20cb', 44416).toCharArray(), 94233L, 1802098651);
        IllIlI.IIIl[22] = IllIlI.III(IllIlI.IlIIll(-117948911, '\u20c8', 25027).toCharArray(), 4206L, -309088305);
        IllIlI.IIIl[23] = IllIlI.III(IllIlI.IlIIll(1483216500, '\u20c9', 56889).toCharArray(), 16158L, -1880351561);
        IllIlI.IIIl[24] = IllIlI.III(IllIlI.IlIIll(116409418, '\u20c6', 55752).toCharArray(), 5150L, 670076650);
        IllIlI.IIIl[25] = IllIlI.III(IllIlI.IlIIll(-295758959, '\u20c7', 15712).toCharArray(), 54565L, 1079273214);
        IllIlI.IIIl[26] = IllIlI.III(IllIlI.IlIIll(-677314481, '\u20c4', 50023).toCharArray(), 81574L, -1540786897);
        IllIlI.IIIl[27] = IllIlI.III(IllIlI.IlIIll(1040778365, '\u20c5', 15811).toCharArray(), 50188L, 1842154100);
        IllIlI.IIIl[28] = IllIlI.III(IllIlI.IlIIll(-712435022, '\u20c2', 12818).toCharArray(), 31222L, -6876929);
        IllIlI.IIIl[29] = IllIlI.III(IllIlI.IlIIll(-1005243206, '\u20c3', 35011).toCharArray(), 29307L, 1889421359);
        IllIlI.IIIl[30] = IllIlI.III(IllIlI.IlIIll(-303076927, '\u20c0', 44376).toCharArray(), 69384L, 10470081);
        IllIlI.IIIl[31] = IllIlI.III(IllIlI.IlIIll(154155940, '\u20c1', 33203).toCharArray(), 44973L, 1854679073);
        IllIlI.IIIl[32] = IllIlI.III(IllIlI.IlIIll(1791243141, '\u20fe', 703).toCharArray(), 79675L, -1603737415);
        IllIlI.IIIl[33] = IllIlI.III(IllIlI.IlIIll(2081818673, '\u20ff', 45442).toCharArray(), 98134L, 420253960);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void ll(II iI, Vec3d vec3d, float f, float f2, float f3, Color color, double d, float f4) {
        if (!IllIlI.lIIll(iI)) return;
        if (vec3d == null) return;
        if (f <= 0.0f) return;
        if (f2 <= 0.0f) {
            return;
        }
        Vec3d[] vec3dArray = IllIlI.lIII(vec3d, f, f2, f3);
        IllIlI.IIlIl(f4, () -> IllIlI.IlII(iI, vec3dArray, color, d));
    }

    private static String III(char[] cArray, long l2, int n) {
        int n2 = 0xEB2E8702 ^ n;
        for (int i = 0; i < cArray.length; ++i) {
            n2 = n2 ^ (int)l2 ^ ~i;
            n2 ^= n - i * cArray.length;
            n2 = -n2 * n | i;
            cArray[i] = (char)(cArray[i] ^ n2);
            int n3 = i & 0xFF;
            n = n << n3 | n >>> -n3;
            l2 ^= (long)n3;
        }
        return new String(cArray);
    }

    public static void IIl(II iI, Vec3d vec3d, double d, int n2, Color color, double d2, float f) {
        IllIlI.lIlII(iI, vec3d, d, n2, color, d2, f, true, n -> true);
    }

    private static void Ill() {
        IllIlI.IlIlI(IIlI, true);
        IllIlI.IIIIll(Il);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lII(Object object, Box box, Color color, double d) {
        if (!IllIlI.lllll(object, box)) {
            return;
        }
        if (!(object instanceof II)) {
            if (!(object instanceof WorldRenderContext)) return;
            WorldRenderContext worldRenderContext = (WorldRenderContext)object;
            IllIlI.IIIIlI(worldRenderContext.matrices(), worldRenderContext.consumers(), box, color, d);
            return;
        }
        II iI = (II)object;
        IllIlI.IIIIlI(iI.Il(), iI.I(), box, color, d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float lIl(float f, float f2, float f3, float f4) {
        if (f4 <= 0.0f) {
            return f3;
        }
        if (!(f < f4)) {
            if (!(f > f2 - f4)) return f3;
            float f5 = f - (f2 - f4);
            if (!(f5 > 0.0f)) return f3;
            if (!(f5 < f4)) return f3;
            return (float)((double)(f3 - f4) + Math.sqrt(f4 * f4 - f5 * f5));
        }
        float f6 = f4 - f;
        if (!(f6 > 0.0f)) return f3;
        if (!(f6 < f4)) return f3;
        return (float)((double)(f3 - f4) + Math.sqrt(f4 * f4 - f6 * f6));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void llI(II iI, Identifier identifier, Vec3d vec3d, double d, double d2, Color color) {
        if (!IllIlI.lIIll(iI)) return;
        if (identifier == null) return;
        if (d <= 0.0) return;
        if (!(d2 <= 0.0)) {
            MinecraftClient minecraftClient = MinecraftClient.getInstance();
            VertexConsumerProvider vertexConsumerProvider = IllIlI.IIlIII(iI);
            if (vertexConsumerProvider == null) {
                return;
            }
            Vec3d vec3d2 = IllIlI.IllIl(iI);
            Camera camera = minecraftClient.gameRenderer.getCamera();
            VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(RenderLayers.entityCutout((Identifier)identifier));
            float f = (float)(d / 2.0);
            float f2 = (float)(d2 / 2.0);
            Color color2 = color == null ? Color.WHITE : color;
            int n = color2.getAlpha();
            iI.Il().push();
            iI.Il().translate(vec3d.x - vec3d2.x, vec3d.y - vec3d2.y, vec3d.z - vec3d2.z);
            iI.Il().multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
            iI.Il().multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
            Matrix4f matrix4f = iI.Il().peek().getPositionMatrix();
            vertexConsumer.vertex((Matrix4fc)matrix4f, -f, -f2, 0.0f).color(color2.getRed(), color2.getGreen(), color2.getBlue(), n).texture(0.0f, 1.0f).overlay(OverlayTexture.DEFAULT_UV).light(0xF000F0).normal(0.0f, 0.0f, 1.0f);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, -f2, 0.0f).color(color2.getRed(), color2.getGreen(), color2.getBlue(), n).texture(1.0f, 1.0f).overlay(OverlayTexture.DEFAULT_UV).light(0xF000F0).normal(0.0f, 0.0f, 1.0f);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, 0.0f).color(color2.getRed(), color2.getGreen(), color2.getBlue(), n).texture(1.0f, 0.0f).overlay(OverlayTexture.DEFAULT_UV).light(0xF000F0).normal(0.0f, 0.0f, 1.0f);
            vertexConsumer.vertex((Matrix4fc)matrix4f, -f, f2, 0.0f).color(color2.getRed(), color2.getGreen(), color2.getBlue(), n).texture(0.0f, 0.0f).overlay(OverlayTexture.DEFAULT_UV).light(0xF000F0).normal(0.0f, 0.0f, 1.0f);
            iI.Il().pop();
            return;
        }
    }

    private static Object IIII(String string, String string2) {
        try {
            Class<?> clazz = Class.forName(string);
            Field field = clazz.getDeclaredField(string2);
            field.setAccessible(true);
            return field.get(null);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return null;
        }
    }

    private static void IIIl(II iI, Box box, Color color, double d, float f) {
        IllIlI.IIlIl(f, () -> {
            Vec3d vec3d = new Vec3d(box.minX, box.minY, box.minZ);
            Vec3d vec3d2 = new Vec3d(box.maxX, box.minY, box.minZ);
            Vec3d vec3d3 = new Vec3d(box.maxX, box.maxY, box.minZ);
            Vec3d vec3d4 = new Vec3d(box.minX, box.maxY, box.minZ);
            Vec3d vec3d5 = new Vec3d(box.minX, box.minY, box.maxZ);
            Vec3d vec3d6 = new Vec3d(box.maxX, box.minY, box.maxZ);
            Vec3d vec3d7 = new Vec3d(box.maxX, box.maxY, box.maxZ);
            Vec3d vec3d8 = new Vec3d(box.minX, box.maxY, box.maxZ);
            IllIlI.IlIIl(iI, vec3d, vec3d2, color, d);
            IllIlI.IlIIl(iI, vec3d2, vec3d3, color, d);
            IllIlI.IlIIl(iI, vec3d3, vec3d4, color, d);
            IllIlI.IlIIl(iI, vec3d4, vec3d, color, d);
            IllIlI.IlIIl(iI, vec3d5, vec3d6, color, d);
            IllIlI.IlIIl(iI, vec3d6, vec3d7, color, d);
            IllIlI.IlIIl(iI, vec3d7, vec3d8, color, d);
            IllIlI.IlIIl(iI, vec3d8, vec3d5, color, d);
            IllIlI.IlIIl(iI, vec3d, vec3d5, color, d);
            IllIlI.IlIIl(iI, vec3d2, vec3d6, color, d);
            IllIlI.IlIIl(iI, vec3d3, vec3d7, color, d);
            IllIlI.IlIIl(iI, vec3d4, vec3d8, color, d);
        });
        IllIlI.IIIlII(iI);
    }

    public static Vec3d IIlI() {
        Camera camera = MinecraftClient.getInstance().gameRenderer.getCamera();
        float f = (float)Math.PI;
        float f2 = (float)Math.toRadians(-camera.getYaw());
        float f3 = (float)Math.toRadians(-camera.getPitch());
        float f4 = MathHelper.sin((double)(f2 - f));
        float f5 = MathHelper.cos((double)(f2 - f));
        float f6 = -MathHelper.sin((double)f3);
        float f7 = MathHelper.cos((double)f3);
        return new Vec3d((double)(f5 * f6), (double)f7, (double)(f4 * f6)).add(camera.getCameraPos());
    }

    private static Method IIll() {
        Method method = IllIlI.IIIIl("net.minecraft.client.render.BufferRenderer", "drawWithGlobalProgram", 1);
        if (method == null) {
            method = IllIlI.IIIIl("net.minecraft.client.render.BufferRenderer", "drawWithShader", 1);
        }
        return method;
    }

    private static void IlII(II iI, Vec3d[] vec3dArray, Color color, double d) {
        int[][] nArrayArray;
        int[][] nArrayArray2 = nArrayArray = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}, {4, 5}, {5, 6}, {6, 7}, {7, 4}, {0, 4}, {1, 5}, {2, 6}, {3, 7}};
        int n = nArrayArray2.length;
        int n2 = 0;
        while (n2 < n) {
            int[] nArray = nArrayArray2[n2];
            IllIlI.IlIIl(iI, vec3dArray[nArray[0]], vec3dArray[nArray[1]], color, d);
            ++n2;
        }
    }

    private IllIlI() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlIl(Object object, Box box, Color color, double d, float f) {
        II iI;
        if (box == null) return;
        if (color == null) return;
        if (!IllIlI.lllll(object, box)) {
            return;
        }
        if (!(object instanceof II) || (iI = (II)object).Il() == null) {
            if (!(object instanceof WorldRenderContext)) return;
            WorldRenderContext worldRenderContext = (WorldRenderContext)object;
            if (worldRenderContext.matrices() == null) return;
            IllIlI.IllII(worldRenderContext.matrices(), IllIlI.IIlIII(worldRenderContext), box, color, d, f, IIll);
            return;
        }
        IllIlI.IllII(iI.Il(), IllIlI.IIlIII(iI), box, color, d, f, IIll);
    }

    public static <T> void IllI(Object object, Iterable<? extends Iterable<T>> iterable, Function<T, BlockPos> function, Function<T, Color> function2, ToDoubleFunction<T> toDoubleFunction) {
        if (object instanceof II) {
            II iI = (II)object;
            IllIlI.llIl(iI, iterable, function, function2, toDoubleFunction);
        }
    }

    private static float Illl(float f, float f2, float f3) {
        return Math.min(Math.min(f, f2) / 2.0f, Math.max(0.0f, f3));
    }

    private static Vec3d[] lIII(Vec3d vec3d, float f, float f2, float f3) {
        double d = Math.toRadians(f3);
        double d2 = Math.cos(d);
        double d3 = Math.sin(d);
        double d4 = vec3d.y - (double)f2 / 2.0;
        double d5 = vec3d.y + (double)f2 / 2.0;
        double[][] dArrayArray = new double[][]{{-f, -f}, {f, -f}, {f, f}, {-f, f}};
        Vec3d[] vec3dArray = new Vec3d[8];
        int n = 0;
        while (n < dArrayArray.length) {
            double d6 = dArrayArray[n][0];
            double d7 = dArrayArray[n][1];
            double d8 = d6 * d2 - d7 * d3;
            double d9 = d6 * d3 + d7 * d2;
            vec3dArray[n] = new Vec3d(vec3d.x + d8, d4, vec3d.z + d9);
            vec3dArray[n + 4] = new Vec3d(vec3d.x + d8, d5, vec3d.z + d9);
            ++n;
        }
        return vec3dArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIIl(II iI, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, int n, int n2) {
        int n3 = n >>> 24 & 0xFF;
        int n4 = n2 >>> 24 & 0xFF;
        if (!IllIlI.lIIll(iI)) return;
        if (matrix4f == null) return;
        if (n3 <= 0) {
            if (n4 <= 0) return;
        }
        if (f3 <= 0.0f) return;
        if (!(f4 <= 0.0f)) {
            float f6 = IllIlI.Illl(f3, f4, f5);
            if (f6 <= 0.01f) {
                IllIlI.lIlll(iI, matrix4f, f, f2, f + f3, f2 + f4, n, n2);
                return;
            }
            float f7 = (float)(n >> 16 & 0xFF) / 255.0f;
            float f8 = (float)(n >> 8 & 0xFF) / 255.0f;
            float f9 = (float)(n & 0xFF) / 255.0f;
            float f10 = (float)n3 / 255.0f;
            float f11 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f12 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f13 = (float)(n2 & 0xFF) / 255.0f;
            float f14 = (float)n4 / 255.0f;
            VertexConsumer vertexConsumer = IllIlI.IIlIII(iI).getBuffer(RenderLayers.debugQuads());
            IllIlI.IlIII(vertexConsumer, matrix4f, f, f2, f3, f4, f6, f7, f8, f9, f10, f11, f12, f13, f14);
            return;
        }
    }

    public static void lIlI(II iI, Box box, Color color, double d) {
        IllIlI.Illll(iI, box, color, d, 1.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIll(II iI, Matrix4f matrix4f, float f, float f2, float f3, float f4, int n) {
        int n2 = n >>> 24 & 0xFF;
        if (!IllIlI.lIIll(iI)) return;
        if (matrix4f == null) return;
        if (n2 <= 0) return;
        if (f3 <= f) return;
        if (!(f4 <= f2)) {
            float f5 = (float)(n >> 16 & 0xFF) / 255.0f;
            float f6 = (float)(n >> 8 & 0xFF) / 255.0f;
            float f7 = (float)(n & 0xFF) / 255.0f;
            float f8 = (float)n2 / 255.0f;
            VertexConsumer vertexConsumer = IllIlI.IIlIII(iI).getBuffer(RenderLayers.debugQuads());
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, 0.0f).color(f5, f6, f7, f8);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f4, 0.0f).color(f5, f6, f7, f8);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f3, f4, 0.0f).color(f5, f6, f7, f8);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f3, f2, 0.0f).color(f5, f6, f7, f8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static <T> void llIl(II iI, Iterable<? extends Iterable<T>> iterable, Function<T, BlockPos> function, Function<T, Color> function2, ToDoubleFunction<T> toDoubleFunction) {
        if (!IllIlI.lIIll(iI)) {
            return;
        }
        Vec3d vec3d = IllIlI.IllIl(iI);
        Matrix4f matrix4f = iI.Il().peek().getPositionMatrix();
        VertexConsumer vertexConsumer = IllIlI.IIlIII(iI).getBuffer(RenderLayers.debugQuads());
        Iterator<Iterable<T>> iterator = iterable.iterator();
        block0: while (iterator.hasNext()) {
            Iterable<T> iterable2 = iterator.next();
            Iterator<T> iterator2 = iterable2.iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                T t = iterator2.next();
                BlockPos blockPos = function.apply(t);
                Color color = function2.apply(t);
                float f = 0.06f;
                float f2 = (float)((double)blockPos.getX() - vec3d.x) + f;
                float f3 = (float)((double)blockPos.getY() - vec3d.y) + 0.02f;
                float f4 = (float)((double)blockPos.getZ() - vec3d.z) + f;
                float f5 = (float)((double)blockPos.getX() - vec3d.x + 1.0) - f;
                float f6 = (float)((double)blockPos.getZ() - vec3d.z + 1.0) - f;
                IllIlI.IIIllI(vertexConsumer, matrix4f, f2, f3, f4, f5, f6, color, toDoubleFunction.applyAsDouble(t));
            }
            break;
        }
        return;
    }

    private static float lllI(float f) {
        if (!Float.isFinite(f)) {
            return 1.0f;
        }
        return Math.max(0.5f, f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void llll(II iI, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, int n) {
        int n2 = n >>> 24 & 0xFF;
        if (!IllIlI.lIIll(iI)) return;
        if (matrix4f == null) return;
        if (n2 <= 0) return;
        if (f3 <= 0.0f) return;
        if (f4 <= 0.0f) {
            return;
        }
        float f6 = IllIlI.Illl(f3, f4, f5);
        if (f6 <= 0.01f) {
            IllIlI.lIll(iI, matrix4f, f, f2, f + f3, f2 + f4, n);
            return;
        }
        float f7 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n & 0xFF) / 255.0f;
        float f10 = (float)n2 / 255.0f;
        VertexConsumer vertexConsumer = IllIlI.IIlIII(iI).getBuffer(RenderLayers.debugQuads());
        IllIlI.IlIII(vertexConsumer, matrix4f, f, f2, f3, f4, f6, f7, f8, f9, f10, f7, f8, f9, f10);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIIII(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (playerEntity == null) return false;
        if (playerEntity == minecraftClient.player) {
            return false;
        }
        if (!playerEntity.isAlive()) return false;
        if (playerEntity.isSpectator()) {
            return false;
        }
        if (IIllllllI.l(playerEntity)) {
            return false;
        }
        if (PlayerHider.lI((Entity)playerEntity)) return false;
        return true;
    }

    private static Method IIIIl(String string, String string2, int n) {
        try {
            Class<?> clazz = Class.forName(string);
            for (Method method : clazz.getMethods()) {
                if (!method.getName().equals(string2) || method.getParameterCount() != n) continue;
                method.setAccessible(true);
                return method;
            }
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        return null;
    }

    public static void IIIlI(II iI) {
        IllIlI.IIIlII(iI);
    }

    public static void IIIll(Object object, Box box, Color color, double d) {
        if (object instanceof II) {
            II iI = (II)object;
            IllIlI.lIlI(iI, box, color, d);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIlII(MinecraftClient minecraftClient, II iI, Entity entity, Vec3d vec3d) {
        if (minecraftClient == null) return false;
        if (entity == null) return false;
        if (vec3d == null) {
            return false;
        }
        Vec3d vec3d2 = IllIlI.IllIl(iI);
        if (iI != null && iI.IlI() != null) {
            return minecraftClient.getEntityRenderDispatcher().shouldRender(entity, iI.IlI(), vec3d.x - vec3d2.x, vec3d.y - vec3d2.y, vec3d.z - vec3d2.z);
        }
        if (vec3d.distanceTo(vec3d2) <= 16384.0) return true;
        return false;
    }

    private static void IIlIl(float f, Runnable runnable) {
        float f2 = IIl;
        IllIlI.IIlIll(f);
        try {
            runnable.run();
        }
        finally {
            IIl = f2;
        }
    }

    public static void IIllI(II iI, Identifier identifier, Vec3d vec3d, double d, double d2) {
        IllIlI.llI(iI, identifier, vec3d, d, d2, Color.WHITE);
    }

    private static Object IIlll(Method method, Object ... objectArray) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(null, objectArray);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void IlIII(VertexConsumer var0, Matrix4f var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11, float var12_12, float var13_13, float var14_14) {
        block6: {
            block4: {
                block5: {
                    var15_15 = Math.max(1, MathHelper.ceil((float)var4_4));
                    var16_16 = 0;
                    break block6;
                    while (true) {
                        var19_19 = (var17_17 + var18_18) * 0.5f;
                        var20_20 = IllIlI.lIIII(var19_19, var4_4, var6_6);
                        var21_21 = IllIlI.lIl(var19_19, var4_4, var5_5, var6_6);
                        if (!(var21_21 <= var20_20)) break block4;
                        break block5;
                        break;
                    }
lbl10:
                    // 1 sources

                    return;
                }
lbl13:
                // 3 sources

                while (true) {
                    ++var16_16;
                    break block6;
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    var17_17 = Math.min(var4_4, (float)var16_16);
                    if (!((var18_18 = Math.min(var4_4, (float)var16_16 + 1.0f)) <= var17_17)) ** continue;
                    ** GOTO lbl13
                    break;
                }
            }
            var0.vertex((Matrix4fc)var1_1, var2_2 + var17_17, var3_3 + var20_20, 0.0f).color(var7_7, var8_8, var9_9, var10_10);
            var0.vertex((Matrix4fc)var1_1, var2_2 + var17_17, var3_3 + var21_21, 0.0f).color(var11_11, var12_12, var13_13, var14_14);
            var0.vertex((Matrix4fc)var1_1, var2_2 + var18_18, var3_3 + var21_21, 0.0f).color(var11_11, var12_12, var13_13, var14_14);
            var0.vertex((Matrix4fc)var1_1, var2_2 + var18_18, var3_3 + var20_20, 0.0f).color(var7_7, var8_8, var9_9, var10_10);
            ** while (true)
        }
        ** while (var16_16 >= var15_15)
lbl32:
        // 1 sources

        ** while (true)
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void IlIIl(II iI, Vec3d vec3d, Vec3d vec3d2, Color color, double d) {
        VertexConsumer vertexConsumer;
        Matrix4f matrix4f;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        block5: {
            if (!IllIlI.lIIll(iI) || vec3d == null || vec3d2 == null || color == null) {
                return;
            }
            Vec3d vec3d3 = IllIlI.IllIl(iI);
            f10 = (float)(vec3d.x - vec3d3.x);
            f9 = (float)(vec3d.y - vec3d3.y);
            f8 = (float)(vec3d.z - vec3d3.z);
            f7 = (float)(vec3d2.x - vec3d3.x);
            f6 = (float)(vec3d2.y - vec3d3.y);
            f5 = (float)(vec3d2.z - vec3d3.z);
            f4 = (float)color.getRed() / 255.0f;
            f3 = (float)color.getGreen() / 255.0f;
            f2 = (float)color.getBlue() / 255.0f;
            f = (float)IllIlI.IIlllI(d) / 255.0f;
            matrix4f = iI.Il().peek().getPositionMatrix();
            IllIlI.IIIIll(IlII);
            IllIlI.IIIIll(II);
            IllIlI.IIIIll(Ill);
            IllIlI.IIllIl();
            IllIlI.IlIlI(lll, lIII);
            IllIlI.IlIlI(Illl, Float.valueOf(IllIlI.lllI(IllIlI.lIIIl())));
            try {
                Object object = IllIlI.IIlll(lIl, new Object[0]);
                vertexConsumer = (VertexConsumer)IllIlI.IIlIIl(object, llII, IlIl, lIll);
                if (vertexConsumer != null) break block5;
            }
            catch (Throwable throwable) {
                IllIlI.IlIlI(Illl, Float.valueOf(1.0f));
                IllIlI.Ill();
                IllIlI.IIIIll(lI);
                IllIlI.IIIIll(lIlI);
                throw throwable;
            }
            IllIlI.IlIlI(Illl, Float.valueOf(1.0f));
            IllIlI.Ill();
            IllIlI.IIIIll(lI);
            IllIlI.IIIIll(lIlI);
            return;
        }
        vertexConsumer.vertex((Matrix4fc)matrix4f, f10, f9, f8).color(f4, f3, f2, f);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f7, f6, f5).color(f4, f3, f2, f);
        Object object = IllIlI.IIlIIl(vertexConsumer, I, new Object[0]);
        if (object != null) {
            IllIlI.IlIlI(III, object);
        }
        IllIlI.IlIlI(Illl, Float.valueOf(1.0f));
        IllIlI.Ill();
        IllIlI.IIIIll(lI);
        IllIlI.IIIIll(lIlI);
    }

    private static void IlIlI(Method method, Object ... objectArray) {
        if (method == null) {
            return;
        }
        try {
            method.invoke(null, objectArray);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
    }

    public static void IlIll(II iI, BlockPos blockPos, Color color, double d) {
        if (!IllIlI.lIIll(iI)) {
            return;
        }
        Vec3d vec3d = IllIlI.IllIl(iI);
        float f = 0.06f;
        float f2 = (float)((double)blockPos.getX() - vec3d.x) + f;
        float f3 = (float)((double)blockPos.getY() - vec3d.y) + 0.02f;
        float f4 = (float)((double)blockPos.getZ() - vec3d.z) + f;
        float f5 = (float)((double)blockPos.getX() - vec3d.x + 1.0) - f;
        float f6 = (float)((double)blockPos.getZ() - vec3d.z + 1.0) - f;
        Matrix4f matrix4f = iI.Il().peek().getPositionMatrix();
        VertexConsumer vertexConsumer = IllIlI.IIlIII(iI).getBuffer(RenderLayers.debugQuads());
        IllIlI.IIIllI(vertexConsumer, matrix4f, f2, f3, f4, f5, f6, color, d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IllII(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, Box box, Color color, double d, float f, RenderLayer renderLayer) {
        if (matrixStack == null) return;
        if (vertexConsumerProvider == null) return;
        if (box == null) return;
        if (color == null) return;
        if (renderLayer != null) {
            Camera camera = MinecraftClient.getInstance().gameRenderer.getCamera();
            Vec3d vec3d = camera.getCameraPos();
            float f2 = (float)(box.minX - vec3d.x);
            float f3 = (float)(box.minY - vec3d.y);
            float f4 = (float)(box.minZ - vec3d.z);
            float f5 = (float)(box.maxX - vec3d.x);
            float f6 = (float)(box.maxY - vec3d.y);
            float f7 = (float)(box.maxZ - vec3d.z);
            float f8 = (float)color.getRed() / 255.0f;
            float f9 = (float)color.getGreen() / 255.0f;
            float f10 = (float)color.getBlue() / 255.0f;
            float f11 = (float)IllIlI.IIlllI(d) / 255.0f;
            Matrix4f matrix4f = matrixStack.peek().getPositionMatrix();
            VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(renderLayer);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f3, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), 1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f3, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), 1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f3, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f6, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f6, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), -1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f6, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), -1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f6, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, -1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f3, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, -1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f3, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), 1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f3, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), 1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f3, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f6, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f6, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), -1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f6, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), -1.0f, 0.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f6, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, -1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f3, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, -1.0f, 0.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f3, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f3, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f3, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f3, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f6, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f5, f6, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f6, f4).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
            vertexConsumer.vertex((Matrix4fc)matrix4f, f2, f6, f7).color(f8, f9, f10, f11).normal(matrixStack.peek(), 0.0f, 0.0f, 1.0f).lineWidth(IllIlI.lllI(f));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Vec3d IllIl(Object object) {
        Vec3d vec3d;
        if (!(object instanceof II)) return MinecraftClient.getInstance().gameRenderer.getCamera().getCameraPos();
        II iI = (II)object;
        if (iI.IIl() == null) {
            vec3d = MinecraftClient.getInstance().gameRenderer.getCamera().getCameraPos();
            return vec3d;
        }
        vec3d = iI.IIl().getCameraPos();
        return vec3d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static lIIllIl IlllI(II iI, Iterable<Vec3d> iterable) {
        if (!IllIlI.lIIll(iI)) return null;
        if (iterable == null) {
            return null;
        }
        double d = Double.POSITIVE_INFINITY;
        double d2 = Double.POSITIVE_INFINITY;
        double d3 = Double.NEGATIVE_INFINITY;
        double d4 = Double.NEGATIVE_INFINITY;
        int n = 0;
        Iterator<Vec3d> iterator = iterable.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (n < 2) {
                    return null;
                }
                lIIllIl lIIllIl2 = new lIIllIl(d, d2, d3, d4);
                return lIIllIl2;
            }
            Vec3d vec3d = iterator.next();
            lIlll lIlll2 = IllIlI.llIll(iI, vec3d);
            if (lIlll2 == null) continue;
            ++n;
            d = Math.min(d, lIlll2.l());
            d2 = Math.min(d2, lIlll2.I());
            d3 = Math.max(d3, lIlll2.l());
            d4 = Math.max(d4, lIlll2.I());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void Illll(II iI, Box box, Color color, double d, float f) {
        if (IllIlI.lIIll(iI) && box != null && color != null && IllIlI.lllll(iI, box)) {
            IllIlI.l(iI.Il(), iI.I(), box, color, d, f);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float lIIII(float f, float f2, float f3) {
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        if (f < f3) {
            float f4 = f3 - f;
            if (!(f4 > 0.0f)) return 0.0f;
            if (!(f4 < f3)) return 0.0f;
            return (float)((double)f3 - Math.sqrt(f3 * f3 - f4 * f4));
        }
        if (!(f > f2 - f3)) return 0.0f;
        float f5 = f - (f2 - f3);
        if (!(f5 > 0.0f)) return 0.0f;
        if (!(f5 < f3)) return 0.0f;
        return (float)((double)f3 - Math.sqrt(f3 * f3 - f5 * f5));
    }

    private static float lIIIl() {
        return IllIlI.lllI(IIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIIlI(Object object, Vec3d vec3d, float f, float f2, float f3, Color color, double d) {
        if (object instanceof II) {
            II iI = (II)object;
            IllIlI.lllII(iI, vec3d, f, f2, f3, color, d);
            return;
        }
        if (!(object instanceof WorldRenderContext)) return;
        WorldRenderContext worldRenderContext = (WorldRenderContext)object;
        IllIlI.lIlIl(worldRenderContext.matrices(), IllIlI.IIlIII(worldRenderContext), vec3d, f, f2, f3, color, d);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lIIll(Object object) {
        if (object instanceof II) {
            II iI = (II)object;
            if (iI == null) return false;
            if (iI.Il() != null) return true;
            return false;
        }
        if (!(object instanceof WorldRenderContext)) return false;
        WorldRenderContext worldRenderContext = (WorldRenderContext)object;
        if (worldRenderContext == null) return false;
        if (worldRenderContext.matrices() == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIlII(II iI, Vec3d vec3d, double d, int n, Color color, double d2, float f, boolean bl, IntPredicate intPredicate) {
        Matrix4f matrix4f;
        Vec3d vec3d2;
        if (!IllIlI.lIIll(iI)) return;
        if (vec3d == null) return;
        if (d <= 0.0) return;
        if (n < 3) return;
        if (color != null) {
            vec3d2 = IllIlI.IllIl(iI);
            matrix4f = iI.Il().peek().getPositionMatrix();
        }
        return;
        VertexConsumer vertexConsumer = IllIlI.IIlIII(iI).getBuffer(bl ? lII : lIIl);
        float f2 = (float)color.getRed() / 255.0f;
        float f3 = (float)color.getGreen() / 255.0f;
        float f4 = (float)color.getBlue() / 255.0f;
        float f5 = (float)IllIlI.IIlllI(d2) / 255.0f;
        float f6 = IllIlI.lllI(f);
        int n2 = 0;
        while (n2 < n) {
            if (intPredicate == null || intPredicate.test(n2)) {
                double d3 = Math.PI * 2 * (double)n2 / (double)n;
                double d4 = Math.PI * 2 * (double)(n2 + 1) / (double)n;
                float f7 = (float)(vec3d.x + Math.cos(d3) * d - vec3d2.x);
                float f8 = (float)(vec3d.y - vec3d2.y);
                float f9 = (float)(vec3d.z + Math.sin(d3) * d - vec3d2.z);
                float f10 = (float)(vec3d.x + Math.cos(d4) * d - vec3d2.x);
                float f11 = f8;
                float f12 = (float)(vec3d.z + Math.sin(d4) * d - vec3d2.z);
                float f13 = f10 - f7;
                float f14 = f12 - f9;
                float f15 = Math.max(1.0E-4f, MathHelper.sqrt((float)(f13 * f13 + f14 * f14)));
                vertexConsumer.vertex((Matrix4fc)matrix4f, f7, f8, f9).color(f2, f3, f4, f5).normal(iI.Il().peek(), f13 /= f15, 0.0f, f14 /= f15).lineWidth(f6);
                vertexConsumer.vertex((Matrix4fc)matrix4f, f10, f11, f12).color(f2, f3, f4, f5).normal(iI.Il().peek(), f13, 0.0f, f14).lineWidth(f6);
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void lIlIl(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, Vec3d vec3d, float f, float f2, float f3, Color color, double d) {
        if (matrixStack == null || vertexConsumerProvider == null || vec3d == null) {
            return;
        }
        Vec3d[] vec3dArray = IllIlI.lIII(vec3d, f, f2, f3);
        Matrix4f matrix4f = matrixStack.peek().getPositionMatrix();
        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(RenderLayers.debugQuads());
        Vec3d vec3d2 = MinecraftClient.getInstance().gameRenderer.getCamera().getCameraPos();
        IllIlI.IIIlIl(vertexConsumer, matrix4f, vec3d2, vec3dArray[0], vec3dArray[1], vec3dArray[2], vec3dArray[3], color, d);
        IllIlI.IIIlIl(vertexConsumer, matrix4f, vec3d2, vec3dArray[4], vec3dArray[5], vec3dArray[6], vec3dArray[7], color, d);
        IllIlI.IIIlIl(vertexConsumer, matrix4f, vec3d2, vec3dArray[0], vec3dArray[1], vec3dArray[5], vec3dArray[4], color, d);
        IllIlI.IIIlIl(vertexConsumer, matrix4f, vec3d2, vec3dArray[1], vec3dArray[2], vec3dArray[6], vec3dArray[5], color, d);
        IllIlI.IIIlIl(vertexConsumer, matrix4f, vec3d2, vec3dArray[2], vec3dArray[3], vec3dArray[7], vec3dArray[6], color, d);
        IllIlI.IIIlIl(vertexConsumer, matrix4f, vec3d2, vec3dArray[3], vec3dArray[0], vec3dArray[4], vec3dArray[7], color, d);
        if (vertexConsumerProvider instanceof VertexConsumerProvider.Immediate) {
            VertexConsumerProvider.Immediate immediate = (VertexConsumerProvider.Immediate)vertexConsumerProvider;
            immediate.draw();
        }
    }

    private static int lIllI(Color color, double d) {
        int n = IllIlI.IIlllI(d);
        return (n & 0xFF) << 24 | (color.getRed() & 0xFF) << 16 | (color.getGreen() & 0xFF) << 8 | color.getBlue() & 0xFF;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIlll(II iI, Matrix4f matrix4f, float f, float f2, float f3, float f4, int n, int n2) {
        int n3 = n >>> 24 & 0xFF;
        int n4 = n2 >>> 24 & 0xFF;
        if (!IllIlI.lIIll(iI)) return;
        if (matrix4f == null) return;
        if (n3 <= 0) {
            if (n4 <= 0) return;
        }
        if (f3 <= f) return;
        if (f4 <= f2) {
            return;
        }
        float f5 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f7 = (float)(n & 0xFF) / 255.0f;
        float f8 = (float)n3 / 255.0f;
        float f9 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f10 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f11 = (float)(n2 & 0xFF) / 255.0f;
        float f12 = (float)n4 / 255.0f;
        VertexConsumer vertexConsumer = IllIlI.IIlIII(iI).getBuffer(RenderLayers.debugQuads());
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, 0.0f).color(f5, f6, f7, f8);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f4, 0.0f).color(f9, f10, f11, f12);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f3, f4, 0.0f).color(f9, f10, f11, f12);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f3, f2, 0.0f).color(f5, f6, f7, f8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static <T> void llIII(Object var0, Iterable<? extends Iterable<T>> var1_1, Function<T, BlockPos> var2_2, Function<T, Color> var3_3, ToDoubleFunction<T> var4_4) {
        if (var0 instanceof II == false) return;
        var5_5 = (II)var0;
        if (!IllIlI.lIIll(var5_5)) {
            return;
        }
        var6_6 = var1_1.iterator();
        ** GOTO lbl14
        {
            IllIlI.lII(var5_5, new Box((double)var10_10.getX(), (double)var10_10.getY(), (double)var10_10.getZ(), (double)var10_10.getX() + 1.0, (double)var10_10.getY() + 1.0, (double)var10_10.getZ() + 1.0), var3_3.apply(var9_9), var4_4.applyAsDouble(var9_9));
            while (true) {
                if (var8_8.hasNext()) {
                    var9_9 = var8_8.next();
                    var10_10 = var2_2.apply(var9_9);
                    if (var10_10 != null) continue block0;
                    continue;
                }
lbl14:
                // 3 sources

                if (var6_6.hasNext() == false) return;
                var7_7 = var6_6.next();
                var8_8 = var7_7.iterator();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean llIIl(MinecraftClient minecraftClient, Entity entity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (entity == null) return false;
        if (entity == minecraftClient.player) return false;
        if (entity instanceof PlayerEntity) {
            PlayerEntity playerEntity = (PlayerEntity)entity;
            return IllIlI.IIIII(minecraftClient, playerEntity);
        }
        if (!entity.isAlive()) return false;
        if (!entity.isSpectator()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static lIlll llIll(II iI, Vec3d vec3d) {
        if (!IllIlI.lIIll(iI)) return null;
        if (vec3d == null) {
            return null;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.getWindow() == null) {
            return null;
        }
        int n = minecraftClient.getWindow().getScaledWidth();
        int n2 = minecraftClient.getWindow().getScaledHeight();
        if (n <= 0) return null;
        if (n2 <= 0) {
            return null;
        }
        Matrix4f matrix4f = iI.III();
        Matrix4f matrix4f2 = iI.l();
        Vec3d vec3d2 = IllIlI.IllIl(iI);
        IllI.set((Matrix4fc)matrix4f).mul((Matrix4fc)matrix4f2);
        Vector4f vector4f = IlI.set((float)(vec3d.x - vec3d2.x), (float)(vec3d.y - vec3d2.y), (float)(vec3d.z - vec3d2.z), 1.0f);
        IllI.transform(vector4f);
        if (!Float.isFinite(vector4f.x)) return null;
        if (!Float.isFinite(vector4f.y)) return null;
        if (!Float.isFinite(vector4f.z)) return null;
        if (!Float.isFinite(vector4f.w)) return null;
        if (vector4f.w < 0.05f) {
            return null;
        }
        float f = vector4f.x / vector4f.w;
        float f2 = vector4f.y / vector4f.w;
        float f3 = vector4f.z / vector4f.w;
        if (!Float.isFinite(f)) return null;
        if (!Float.isFinite(f2)) return null;
        if (!Float.isFinite(f3)) return null;
        if (f3 < -1.0f) return null;
        if (f3 > 1.0f) {
            return null;
        }
        double d = (f * 0.5f + 0.5f) * (float)n;
        double d2 = (-f2 * 0.5f + 0.5f) * (float)n2;
        if (!Double.isFinite(d)) return null;
        if (Double.isFinite(d2)) return new lIlll(d, d2, f3);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lllII(II iI, Vec3d vec3d, float f, float f2, float f3, Color color, double d) {
        if (!IllIlI.lIIll(iI)) return;
        if (vec3d == null) return;
        if (f <= 0.0f) return;
        if (f2 <= 0.0f) {
            return;
        }
        IllIlI.lIlIl(iI.Il(), IllIlI.IIlIII(iI), vec3d, f, f2, f3, color, d);
    }

    /*
     * Unable to fully structure code
     */
    public static void lllIl(II var0, String var1_1, Vec3d var2_2, Color var3_3, double var4_4, boolean var6_5) {
        block10: {
            block11: {
                block9: {
                    block7: {
                        block6: {
                            block8: {
                                if (IllIlI.lIIll(var0)) break block8;
                                break block9;
lbl3:
                                // 1 sources

                                while ((var16_15 & 0xFFFFFF) != 0) {
                                    break block6;
                                }
                                break block7;
lbl6:
                                // 1 sources

                                while (true) {
                                    var10_9 = IllIlI.IllIl(var0);
                                    var11_10 = var7_6.gameRenderer.getCamera();
                                    var0.Il().push();
                                    var0.Il().translate(var2_2.x - var10_9.x, var2_2.y - var10_9.y, var2_2.z - var10_9.z);
                                    var0.Il().multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(-var11_10.getYaw()));
                                    var0.Il().multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(var11_10.getPitch()));
                                    var12_11 = (float)(0.025 * var4_4);
                                    var0.Il().scale(-var12_11, -var12_11, var12_11);
                                    var13_12 = var0.Il().peek().getPositionMatrix();
                                    var14_13 = (float)(-var8_7.getWidth(var1_1)) / 2.0f;
                                    Objects.requireNonNull(var8_7);
                                    var15_14 = (float)(-9) / 2.0f;
                                    var16_15 = IllIlI.lIllI(var3_3, var3_3.getAlpha());
                                    if (!Interface.IIIII()) break block7;
                                    ** GOTO lbl3
                                    break;
                                }
                            }
                            var7_6 = MinecraftClient.getInstance();
                            var8_7 = var7_6.textRenderer;
                            var9_8 = IllIlI.IIlIII(var0);
                            if (var8_7 == null) break block10;
                            break block11;
                        }
                        var17_16 = var14_13;
                        var18_17 = 0;
                        var19_18 = 0;
                        ** GOTO lbl52
                    }
                    var8_7.draw(var1_1, var14_13, var15_14, var16_15, var6_5, var13_12, var9_8, TextRenderer.TextLayerType.NORMAL, 0, 0xF000F0);
                    ** GOTO lbl53
                }
                return;
            }
            ** while (var9_8 != null)
lbl41:
            // 1 sources

            break block10;
lbl42:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        return;
        var22_21 = IIIlI.IIIIl(var3_3.getAlpha(), Math.round(var14_13), Math.round(var15_14), var18_17);
        var8_7.draw(var21_20, var17_16, var15_14, var22_21, var6_5, var13_12, var9_8, TextRenderer.TextLayerType.NORMAL, 0, 0xF000F0);
        do {
            block12: {
                var17_16 += (float)var8_7.getWidth(var21_20);
                var19_18 += Character.charCount(var20_19);
                ++var18_17;
lbl52:
                // 2 sources

                if (var19_18 < var1_1.length()) break block12;
lbl53:
                // 2 sources

                var0.Il().pop();
                return;
            }
            var20_19 = var1_1.codePointAt(var19_18);
            var21_20 = new String(Character.toChars(var20_19));
        } while (Character.isWhitespace(var20_19));
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void llllI(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, Box box, Color color, double d, RenderLayer renderLayer) {
        if (matrixStack == null) return;
        if (vertexConsumerProvider == null) return;
        if (box == null) return;
        if (color == null) return;
        if (renderLayer == null) {
            return;
        }
        Camera camera = MinecraftClient.getInstance().gameRenderer.getCamera();
        Vec3d vec3d = camera.getCameraPos();
        float f = (float)(box.minX - vec3d.x);
        float f2 = (float)(box.minY - vec3d.y);
        float f3 = (float)(box.minZ - vec3d.z);
        float f4 = (float)(box.maxX - vec3d.x);
        float f5 = (float)(box.maxY - vec3d.y);
        float f6 = (float)(box.maxZ - vec3d.z);
        float f7 = (float)color.getRed() / 255.0f;
        float f8 = (float)color.getGreen() / 255.0f;
        float f9 = (float)color.getBlue() / 255.0f;
        float f10 = (float)IllIlI.IIlllI(d) / 255.0f;
        Matrix4f matrix4f = matrixStack.peek().getPositionMatrix();
        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(renderLayer);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lllll(Object object, Box box) {
        if (box == null) {
            return false;
        }
        if (!(object instanceof II)) return true;
        II iI = (II)object;
        if (iI.IlI() == null) return true;
        if (iI.IlI().isVisible(box)) return true;
        return false;
    }

    private static Method IIIIII(String string, String string2, int n) {
        try {
            Class<?> clazz = Class.forName(string);
            for (Method method : clazz.getMethods()) {
                if (!method.getName().equals(string2) || method.getParameterCount() != n || Modifier.isStatic(method.getModifiers())) continue;
                return method;
            }
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        return null;
    }

    private static void IIIIIl(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, Color color, double d) {
        float f7 = (float)color.getRed() / 255.0f;
        float f8 = (float)color.getGreen() / 255.0f;
        float f9 = (float)color.getBlue() / 255.0f;
        float f10 = (float)IllIlI.IIlllI(d) / 255.0f;
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void IIIIlI(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, Box box, Color color, double d) {
        if (matrixStack == null || box == null || color == null) {
            return;
        }
        Camera camera = MinecraftClient.getInstance().gameRenderer.getCamera();
        Vec3d vec3d = camera.getCameraPos();
        float f = (float)(box.minX - vec3d.x);
        float f2 = (float)(box.minY - vec3d.y);
        float f3 = (float)(box.minZ - vec3d.z);
        float f4 = (float)(box.maxX - vec3d.x);
        float f5 = (float)(box.maxY - vec3d.y);
        float f6 = (float)(box.maxZ - vec3d.z);
        float f7 = (float)color.getRed() / 255.0f;
        float f8 = (float)color.getGreen() / 255.0f;
        float f9 = (float)color.getBlue() / 255.0f;
        float f10 = (float)IllIlI.IIlllI(d) / 255.0f;
        Matrix4f matrix4f = matrixStack.peek().getPositionMatrix();
        if (vertexConsumerProvider != null) {
            VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(RenderLayers.debugQuads());
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
            return;
        }
        IllIlI.IIIIll(IlII);
        IllIlI.IIIIll(II);
        IllIlI.IIIIll(Ill);
        IllIlI.IIllIl();
        IllIlI.IlIlI(lll, lIII);
        try {
            Object object = IllIlI.IIlll(lIl, new Object[0]);
            VertexConsumer vertexConsumer = (VertexConsumer)IllIlI.IIlIIl(object, llII, ll, lIll);
            if (vertexConsumer == null) {
                return;
            }
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f6).color(f7, f8, f9, f10);
            vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f5, f3).color(f7, f8, f9, f10);
            Object object2 = IllIlI.IIlIIl(vertexConsumer, I, new Object[0]);
            if (object2 != null) {
                IllIlI.IlIlI(III, object2);
            }
        }
        finally {
            IllIlI.Ill();
            IllIlI.IIIIll(lI);
            IllIlI.IIIIll(lIlI);
        }
    }

    private static void IIIIll(Method method) {
        if (method == null) {
            return;
        }
        try {
            method.invoke(null, new Object[0]);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void IIIlII(II iI) {
        if (iI == null || iI.I() != null) return;
        VertexConsumerProvider vertexConsumerProvider = IllIlI.IIlIII(iI);
        if (!(vertexConsumerProvider instanceof VertexConsumerProvider.Immediate)) {
            return;
        }
        VertexConsumerProvider.Immediate immediate = (VertexConsumerProvider.Immediate)vertexConsumerProvider;
        immediate.draw();
    }

    private static void IIIlIl(VertexConsumer vertexConsumer, Matrix4f matrix4f, Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, Vec3d vec3d4, Vec3d vec3d5, Color color, double d) {
        float f = (float)color.getRed() / 255.0f;
        float f2 = (float)color.getGreen() / 255.0f;
        float f3 = (float)color.getBlue() / 255.0f;
        float f4 = (float)IllIlI.IIlllI(d) / 255.0f;
        vertexConsumer.vertex((Matrix4fc)matrix4f, (float)(vec3d2.x - vec3d.x), (float)(vec3d2.y - vec3d.y), (float)(vec3d2.z - vec3d.z)).color(f, f2, f3, f4);
        vertexConsumer.vertex((Matrix4fc)matrix4f, (float)(vec3d3.x - vec3d.x), (float)(vec3d3.y - vec3d.y), (float)(vec3d3.z - vec3d.z)).color(f, f2, f3, f4);
        vertexConsumer.vertex((Matrix4fc)matrix4f, (float)(vec3d4.x - vec3d.x), (float)(vec3d4.y - vec3d.y), (float)(vec3d4.z - vec3d.z)).color(f, f2, f3, f4);
        vertexConsumer.vertex((Matrix4fc)matrix4f, (float)(vec3d5.x - vec3d.x), (float)(vec3d5.y - vec3d.y), (float)(vec3d5.z - vec3d.z)).color(f, f2, f3, f4);
    }

    private static void IIIllI(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, Color color, double d) {
        float f6 = (float)color.getRed() / 255.0f;
        float f7 = (float)color.getGreen() / 255.0f;
        float f8 = (float)color.getBlue() / 255.0f;
        float f9 = (float)IllIlI.IIlllI(d) / 255.0f;
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f3).color(f6, f7, f8, f9);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, f5).color(f6, f7, f8, f9);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f5).color(f6, f7, f8, f9);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f4, f2, f3).color(f6, f7, f8, f9);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIIlll(Object object, Box box, Color color, double d) {
        if (box == null) return;
        if (color == null) return;
        if (IllIlI.lllll(object, box)) {
            II iI;
            if (object instanceof II && (iI = (II)object).Il() != null) {
                IllIlI.llllI(iI.Il(), IllIlI.IIlIII(iI), box, color, d, IIII);
                return;
            }
            if (!(object instanceof WorldRenderContext)) return;
            WorldRenderContext worldRenderContext = (WorldRenderContext)object;
            if (worldRenderContext.matrices() == null) return;
            IllIlI.llllI(worldRenderContext.matrices(), IllIlI.IIlIII(worldRenderContext), box, color, d, IIII);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static VertexConsumerProvider IIlIII(Object object) {
        VertexConsumerProvider vertexConsumerProvider;
        II iI;
        if (object instanceof II) {
            iI = (II)object;
            if (iI.I() == null) {
                vertexConsumerProvider = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
                return vertexConsumerProvider;
            }
        } else {
            VertexConsumerProvider vertexConsumerProvider2;
            if (!(object instanceof WorldRenderContext)) return MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
            WorldRenderContext worldRenderContext = (WorldRenderContext)object;
            if (worldRenderContext.consumers() == null) {
                vertexConsumerProvider2 = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
                return vertexConsumerProvider2;
            }
            vertexConsumerProvider2 = worldRenderContext.consumers();
            return vertexConsumerProvider2;
        }
        vertexConsumerProvider = iI.I();
        return vertexConsumerProvider;
    }

    private static Object IIlIIl(Object object, Method method, Object ... objectArray) {
        if (object == null || method == null) {
            return null;
        }
        try {
            return method.invoke(object, objectArray);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return null;
        }
    }

    public static Vec3d IIlIlI(Entity entity, float f) {
        return entity.getLerpedPos(f);
    }

    private static void IIlIll(float f) {
        IIl = IllIlI.lllI(f);
        if (Illl == null) {
            return;
        }
        try {
            Illl.invoke(null, Float.valueOf(IIl));
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
    }

    public static void IIllII(II iI, Vec3d vec3d, Vec3d vec3d2, Color color, double d, float f) {
        IllIlI.IIlIl(f, () -> IllIlI.IlIIl(iI, vec3d, vec3d2, color, d));
    }

    private static void IIllIl() {
        IllIlI.IlIlI(IIlI, false);
        IllIlI.IIIIll(l);
    }

    private static int IIlllI(double d) {
        return Math.max(0, Math.min(255, (int)Math.round(d)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIllll(II iI, Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, Color color, double d) {
        if (IllIlI.lIIll(iI) && vec3d != null && vec3d2 != null && vec3d3 != null && color != null) {
            Vec3d vec3d4 = IllIlI.IllIl(iI);
            Matrix4f matrix4f = iI.Il().peek().getPositionMatrix();
            VertexConsumer vertexConsumer = IllIlI.IIlIII(iI).getBuffer(RenderLayers.debugQuads());
            float f = (float)color.getRed() / 255.0f;
            float f2 = (float)color.getGreen() / 255.0f;
            float f3 = (float)color.getBlue() / 255.0f;
            float f4 = (float)IllIlI.IIlllI(d) / 255.0f;
            vertexConsumer.vertex((Matrix4fc)matrix4f, (float)(vec3d.x - vec3d4.x), (float)(vec3d.y - vec3d4.y), (float)(vec3d.z - vec3d4.z)).color(f, f2, f3, f4);
            vertexConsumer.vertex((Matrix4fc)matrix4f, (float)(vec3d2.x - vec3d4.x), (float)(vec3d2.y - vec3d4.y), (float)(vec3d2.z - vec3d4.z)).color(f, f2, f3, f4);
            vertexConsumer.vertex((Matrix4fc)matrix4f, (float)(vec3d3.x - vec3d4.x), (float)(vec3d3.y - vec3d4.y), (float)(vec3d3.z - vec3d4.z)).color(f, f2, f3, f4);
            vertexConsumer.vertex((Matrix4fc)matrix4f, (float)(vec3d.x - vec3d4.x), (float)(vec3d.y - vec3d4.y), (float)(vec3d.z - vec3d4.z)).color(f, f2, f3, f4);
            return;
        }
    }

    public static void IlIIII(Object object, Vec3d vec3d, float f, float f2, float f3, Color color, double d, float f4) {
        if (object instanceof II) {
            II iI = (II)object;
            IllIlI.ll(iI, vec3d, f, f2, f3, color, d, f4);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void IlIIIl(MatrixStack matrixStack, Box box, Color color, double d, float f) {
        VertexConsumer vertexConsumer;
        Matrix4f matrix4f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        block5: {
            if (matrixStack == null || box == null || color == null) {
                return;
            }
            Camera camera = MinecraftClient.getInstance().gameRenderer.getCamera();
            Vec3d vec3d = camera.getCameraPos();
            f11 = (float)(box.minX - vec3d.x);
            f10 = (float)(box.minY - vec3d.y);
            f9 = (float)(box.minZ - vec3d.z);
            f8 = (float)(box.maxX - vec3d.x);
            f7 = (float)(box.maxY - vec3d.y);
            f6 = (float)(box.maxZ - vec3d.z);
            f5 = (float)color.getRed() / 255.0f;
            f4 = (float)color.getGreen() / 255.0f;
            f3 = (float)color.getBlue() / 255.0f;
            f2 = (float)IllIlI.IIlllI(d) / 255.0f;
            matrix4f = matrixStack.peek().getPositionMatrix();
            IllIlI.IIIIll(IlII);
            IllIlI.IIIIll(II);
            IllIlI.IIIIll(Ill);
            IllIlI.IIllIl();
            IllIlI.IlIlI(lll, lIII);
            IllIlI.IlIlI(Illl, Float.valueOf(IllIlI.lllI(f)));
            try {
                Object object = IllIlI.IIlll(lIl, new Object[0]);
                vertexConsumer = (VertexConsumer)IllIlI.IIlIIl(object, llII, IlIl, lIll);
                if (vertexConsumer != null) break block5;
            }
            catch (Throwable throwable) {
                IllIlI.IlIlI(Illl, Float.valueOf(1.0f));
                IllIlI.Ill();
                IllIlI.IIIIll(lI);
                IllIlI.IIIIll(lIlI);
                throw throwable;
            }
            IllIlI.IlIlI(Illl, Float.valueOf(1.0f));
            IllIlI.Ill();
            IllIlI.IIIIll(lI);
            IllIlI.IIIIll(lIlI);
            return;
        }
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f10, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f8, f7, f6).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f9).color(f5, f4, f3, f2);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f11, f7, f6).color(f5, f4, f3, f2);
        Object object = IllIlI.IIlIIl(vertexConsumer, I, new Object[0]);
        if (object != null) {
            IllIlI.IlIlI(III, object);
        }
        IllIlI.IlIlI(Illl, Float.valueOf(1.0f));
        IllIlI.Ill();
        IllIlI.IIIIll(lI);
        IllIlI.IIIIll(lIlI);
    }

    private static int IlIIlI(int n, int n2) {
        return llIl[n ^ 0xB9FAD55F] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlIIll(int n, char c, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0x20DE;
        char[] cArray = lllI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IllIlI.llll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1361;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 5610;
            n7 += 51228;
            n7 ^= 0x4C98;
            n7 -= 47447;
            n7 += 51471;
            cArray[n6] = (char)((n7 -= 14613) ^ n4 ^ n2 ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

