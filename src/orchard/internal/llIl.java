/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - orchard_streamer_overlay
 *   - vulkanmod
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.loader.api.FabricLoader
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gl.Framebuffer
 *  net.minecraft.client.gl.SimpleFramebuffer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.render.GuiRenderer
 *  net.minecraft.client.gui.render.state.GuiRenderState
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.texture.GlTexture
 */
package orchard.internal;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.texture.GlTexture;
import orchard.core.ClientEntrypoint;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIIIllI;
import orchard.internal.IIIIIlII;
import orchard.internal.IIIIlIIII;
import orchard.internal.IIlllIIIl;
import orchard.internal.IlIIlllll;
import orchard.internal.lIlllIll;
import orchard.internal.lllIIlI;
import orchard.internal.llllll;
import orchard.mixin.GuiRendererMixin;
import orchard.mixin.MinecraftClientMixin3;
import orchard.module.render.StreamerMode;

@Environment(value=EnvType.CLIENT)
public final class llIl {
    private static boolean I;
    private static final llllll l;
    private static final IIIIIlII II;
    private static boolean Il;
    private static boolean lI;
    private static final boolean ll;
    private static SimpleFramebuffer III;
    private static boolean IIl;
    private static boolean IlI;
    private static final lIlllIll Ill;
    private static boolean lII;
    private static final IIIIIIllI lIl;
    private static boolean llI;
    private static IIIIIlII lll;
    private static int IIII;
    private static final String[] IIIl;
    private static final Object[] IIlI;

    private static void I(MinecraftClient minecraftClient, Framebuffer framebuffer) {
        ((MinecraftClientMixin3)minecraftClient).ilovcats$setFramebuffer(framebuffer);
    }

    private static void l() {
        try {
            Ill.Ill();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static void II(boolean bl) {
        lI = bl;
        Ill.III(bl);
    }

    public static void Il(Screen screen, DrawContext drawContext, int n, int n2, float f) {
        if (!ClientEntrypoint.lII().IlI().IIIlIIl().IIIlIIl()) {
            screen.render(drawContext, n, n2, f);
        }
    }

    public static void lI(lllIIlI lllIIlI2, DrawContext drawContext, int n, int n2, float f) {
        StreamerMode streamerMode = lllIIlI2.IIIlIIl();
        if (streamerMode.IlI()) {
            return;
        }
        lllIIlI2.IllIIl(streamerMode.lI(drawContext), n, n2, f);
    }

    public static void ll() {
        boolean bl = I && IlI && III != null;
        I = false;
        IlI = false;
        II.I();
        lll = null;
        try {
            GpuTexture gpuTexture;
            boolean bl2 = false;
            if (bl && (gpuTexture = III.getColorAttachment()) instanceof GlTexture) {
                GlTexture glTexture = (GlTexture)gpuTexture;
                Ill.I(glTexture.getGlId(), llIl.III.textureWidth, llIl.III.textureHeight);
                bl2 = true;
            }
            if (!bl2 && Il) {
                Ill.lI();
            }
            Il = bl2;
        }
        catch (Throwable throwable) {
            llIl.llI();
        }
    }

    public static void III(IIIIlIIII iIIIlIIII, int n, int n2) {
        if (!ClientEntrypoint.lII().IlI().IIIlIIl().IIIlIIl()) {
            iIIIlIIII.ll(n, n2);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 9859;
        String string = "\uabb9\uaba6\uabd0\uab37\uab4c\uabd4\uabe3\uab3a\uab25\uab36\uab22\uab8f\u5bb4\u5bf6\u5bc7\u5b3d\u5b47\u5be5\u5be8\u5b2d\u5b20\u5b2c\u5b29\u5b95\u5ba2\u5bff\u5b89\u5bb2\u5b86\u5b5e\u5b97\u5b39\u5bf8\u5b99\u5bd8\u5b52\u5b5b\u5b54\u5bc4\u5b7d\u5bb2\u5b59\u5bb6\u5bff\uf38c\uf3d3\uf3fa\uf307\uf363\uf3d0\uf3cd\uf32f\uf305\uf31b\uf374\uf3ad\uf385\uf3c9\uf3df\uf390\uf3a4\uf368\uf3b8\uf343\u0dad\u0d98\u0de6\u0d27\u0d45\u0df5\u0df7\u0d32\u0d20\u0d3e\u0d21\u0d8b\u0dab\u0d81\u0dd7\u0db1\u0d89\u0d4d\u0d8c\u0d3e\u0df9\u0de8\u0dd7\u0d71\u0d5e\u0d57\u0d9c\u0d62\u0db0\u0d07\u0d9b\u0deb\u0db7\u0da6\u0def\u0d32\u0d70\u0de2\u0dd0\u0d3c\u0d0c\u0d26\u0d00\u0d9f\u0d8e\u0de3\u0dec\u0d83\u0d82\u0d41\u0dc7\u0d1b\u0dd6\u0d8b\u0dd1\u0d79\u0d65\u0d4b\u0dc8\u0d62\u0dd4\u0d1f\u0db4\u0ddf\u0daf\u0d9b\u0daf\u0d07\u0d45\u0df6\u0df3\u0d2e\u0d20\u0d3e\u0d14\u0d97\u0dbb\u0dd2\u0d86\u0def";
        char[] cArray = "\u268f\u26a3\u2697\u26d3".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            if (!bl || (bl = false) || !true) {
                n4 = cArray[n5] ^ n;
                stringArray[n5] = string.substring(n3, n3 + n4);
                n3 += n4;
                if (++n5 < cArray.length) continue;
                n2 = 0;
            }
            n5 = 0;
            n3 = 0;
            n4 = 0;
            if (n2 == 0) break;
        }
        IIIl = stringArray;
        IIlI = new Object[stringArray.length];
        Ill = new lIlllIll();
        II = new IIIIIlII();
        lIl = new IIIIIIllI();
        l = new llllll();
        ll = FabricLoader.getInstance().isModLoaded("vulkanmod");
        lI = true;
        IIII = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIl() {
        llI = false;
        l.II();
        lIl.II();
        llIl.l();
        llIl.IIlI();
    }

    private static boolean IlI(MinecraftClient minecraftClient) {
        if (!I || IlI) {
            return IlI && III != null;
        }
        if (minecraftClient == null || minecraftClient.getWindow() == null || minecraftClient.getFramebuffer() == null) {
            return false;
        }
        try {
            llI = false;
            if (!Ill.Il(minecraftClient.getWindow().getHandle(), lI)) {
                llI = Ill.IIII();
                return false;
            }
            int n = Ill.lIl();
            if (III != null && IIII != n) {
                llIl.IIlI();
            }
            Framebuffer framebuffer = minecraftClient.getFramebuffer();
            int n2 = Math.max(1, framebuffer.textureWidth);
            int n3 = Math.max(1, framebuffer.textureHeight);
            if (III == null) {
                III = new SimpleFramebuffer("orchard_streamer_overlay", n2, n3, true);
                IIII = n;
            } else if (llIl.III.textureWidth != n2 || llIl.III.textureHeight != n3) {
                III.resize(n2, n3);
            }
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(III.getColorAttachment(), 0, III.getDepthAttachment(), 1.0);
            IlI = true;
            IIl = false;
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void Ill(boolean bl) {
        if (ll) {
            lII = false;
            llIl.lII();
            llIl.IIl();
            return;
        }
        lII = true;
        llIl.II(bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void lII() {
        I = false;
        IlI = false;
        Il = false;
        II.I();
        lll = null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void lIl(II iI, Consumer<II> consumer) {
        if (consumer == null) {
            return;
        }
        if (!I) {
            consumer.accept(iI);
            return;
        }
        lIl.I();
        II iI2 = l.ll(iI, lIl);
        boolean bl = false;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        Framebuffer framebuffer = minecraftClient == null ? null : minecraftClient.getFramebuffer();
        try {
            consumer.accept(iI2);
            if (!lIl.l()) {
                return;
            }
            if (!llIl.IlI(minecraftClient)) {
                try {
                    lIl.Il();
                }
                finally {
                    llIl.llI();
                }
                return;
            }
            llIl.I(minecraftClient, (Framebuffer)III);
            bl = true;
            lIl.Il();
        }
        finally {
            if (bl) {
                llIl.I(minecraftClient, framebuffer);
            }
            l.II();
            lIl.ll();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void llI() {
        I = false;
        IlI = false;
        Il = false;
        lll = null;
        if (llI) {
            lII = false;
            llI = false;
        }
        l.II();
        lIl.II();
        llIl.l();
        llIl.IIlI();
        if (IIl) return;
        IIl = true;
        IIlllIIIl.ll().Il(IlIIlllll.I, StringFactory.IIl("q4BGmRhaVQ7XJZBdCg=="), StringFactory.IIl("vYxAmQtZURDXB4lcHd/fh9iBWp0PVlkQlgqTXFSTyJeLgVWQChdCGZoJlldP2tDetZ1amRpFURqDRg=="), 4500L);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lll() {
        lII = false;
        llIl.lII();
        llIl.IIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static DrawContext IIII(DrawContext drawContext, int n, int n2) {
        if (!I) return drawContext;
        if (drawContext == null) return drawContext;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return drawContext;
        if (lll != null) return new DrawContext(minecraftClient, (GuiRenderState)lll, n, n2);
        lll = II;
        return new DrawContext(minecraftClient, (GuiRenderState)lll, n, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIIl() {
        I = false;
        IlI = false;
        II.I();
        lll = null;
        if (!lII) return;
        if (!RenderSystem.isOnRenderThread()) return;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.getWindow() == null) return;
        if (minecraftClient.getFramebuffer() == null) return;
        I = true;
    }

    private static void IIlI() {
        if (III != null) {
            try {
                III.delete();
            }
            catch (Throwable throwable) {
            }
            finally {
                III = null;
            }
        }
        IIII = -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void IIll(GuiRenderer guiRenderer, GpuBufferSlice gpuBufferSlice) {
        if (!I || lll == null || guiRenderer == null) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        IIIIIlII iIIIIlII = lll;
        if (!iIIIIlII.l()) {
            iIIIIlII.I();
            lll = null;
            return;
        }
        if (minecraftClient == null || minecraftClient.getFramebuffer() == null) {
            iIIIIlII.I();
            lll = null;
            return;
        }
        Framebuffer framebuffer = minecraftClient.getFramebuffer();
        GuiRendererMixin guiRendererMixin = (GuiRendererMixin)guiRenderer;
        GuiRenderState guiRenderState = guiRendererMixin.ilovcats$getState();
        boolean bl = false;
        boolean bl2 = llIl.IlI(minecraftClient);
        try {
            if (bl2) {
                llIl.I(minecraftClient, (Framebuffer)III);
                bl = true;
            }
            guiRendererMixin.ilovcats$setState(iIIIIlII);
            guiRenderer.render(gpuBufferSlice);
        }
        finally {
            guiRendererMixin.ilovcats$setState(guiRenderState);
            if (bl) {
                llIl.I(minecraftClient, framebuffer);
            }
            iIIIIlII.I();
            lll = null;
            if (!bl2) {
                llIl.llI();
            }
        }
    }

    private llIl() {
    }

    public static void IlII(lllIIlI lllIIlI2, II iI) {
        StreamerMode streamerMode = lllIIlI2.IIIlIIl();
        if (streamerMode.IlI()) {
            return;
        }
        streamerMode.I(iI, lllIIlI2::IIIllI);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IlIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xB15FCEC0;
        char[] cArray = IIIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIlI[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIl.IIlI[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4C7E3487;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 9: {
                    n6 = 122;
                    continue block33;
                }
                case 29: {
                    n6 = 125;
                    continue block33;
                }
                case 24: {
                    n6 = 31;
                    continue block33;
                }
                case 13: {
                    n6 = 163;
                    continue block33;
                }
                default: {
                    n6 = 205;
                    continue block33;
                }
                case 1: {
                    n6 = 215;
                    continue block33;
                }
                case 12: {
                    n6 = 255;
                    continue block33;
                }
                case 26: {
                    n6 = 186;
                    continue block33;
                }
                case 20: {
                    n6 = 135;
                    continue block33;
                }
                case 27: {
                    n6 = 36;
                    continue block33;
                }
                case 28: {
                    n6 = 240;
                    continue block33;
                }
                case 16: {
                    n6 = 215;
                    continue block33;
                }
                case 4: {
                    n6 = 62;
                    continue block33;
                }
                case 30: {
                    n6 = 230;
                    continue block33;
                }
                case 22: {
                    n6 = 168;
                    continue block33;
                }
                case 5: {
                    n6 = 178;
                    continue block33;
                }
                case 17: {
                    n6 = 63;
                    continue block33;
                }
                case 3: {
                    n6 = 112;
                    continue block33;
                }
                case 14: {
                    n6 = 173;
                    continue block33;
                }
                case 25: {
                    n6 = 49;
                    continue block33;
                }
                case 6: {
                    n6 = 149;
                    continue block33;
                }
                case 18: {
                    n6 = 181;
                    continue block33;
                }
                case 8: {
                    n6 = 99;
                    continue block33;
                }
                case 31: {
                    n6 = 172;
                    continue block33;
                }
                case 23: {
                    n6 = 37;
                    continue block33;
                }
                case 2: {
                    n6 = 136;
                    continue block33;
                }
                case 7: {
                    n6 = 126;
                    continue block33;
                }
                case 10: {
                    n6 = 115;
                    continue block33;
                }
                case 21: {
                    n6 = 199;
                    continue block33;
                }
                case 11: {
                    n6 = 197;
                    continue block33;
                }
                case 15: {
                    n6 = 196;
                    continue block33;
                }
                case 19: 
            }
            n6 = 78;
        }
        return new String(cArray).intern();
    }
}

