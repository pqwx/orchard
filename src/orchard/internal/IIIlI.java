/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - UPPER
 *   - LOWER
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.item.ItemStack
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.StringVisitable
 *  net.minecraft.text.Text
 *  net.minecraft.util.Identifier
 */
package orchard.internal;

import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.lang.reflect.Method;
import java.util.Deque;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import orchard.core.ClientEntrypoint;
import orchard.internal.IIIlIIllI;
import orchard.internal.IIlIlII;
import orchard.internal.IIllIIlII;
import orchard.internal.IlIllllI;
import orchard.internal.IllIlIl;
import orchard.internal.lIIIlIII;
import orchard.internal.llIlIIll;
import orchard.internal.llIlllIl;
import orchard.internal.llllIII;
import orchard.internal.lllllIIl;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
public class IIIlI {
    private static final ThreadLocal<Boolean> I;
    private static final long l = 4200L;
    private static final llIlIIll II;
    private static final double Il = 2.0;
    private static final float lI = 0.0025f;
    private static final Method ll;
    private static double III;
    private static final ThreadLocal<Deque<IlIllllI>> IIl;
    private static final float IlI = 0.075f;
    private static final Map<Long, lllllIIl> Ill;
    private static final int[] lII;
    private static final String[] lIl;
    private static final Object[] llI;

    /*
     * Enabled aggressive block sorting
     */
    private static int I(float f) {
        float f2;
        Color color;
        Color color2;
        Color color3;
        Interface interface_ = null;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null && clientEntrypoint.IlI() != null) {
            interface_ = clientEntrypoint.IlI().lIIIII();
        }
        Color color4 = interface_ == null ? new Color(10, 132, 255) : interface_.lIlI();
        Color color5 = color3 = interface_ == null ? new Color(92, 210, 255) : interface_.IIlII();
        if (f < 0.5f) {
            color2 = color4;
            color = color3;
            f2 = f * 2.0f;
        } else {
            color2 = color3;
            color = color4;
            f2 = (f - 0.5f) * 2.0f;
        }
        double d = 0.5 - Math.cos((double)f2 * Math.PI) * 0.5;
        return IIIlI.llIIlI(color2, color, d);
    }

    public static void l(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, double d3, double d4, int n) {
        IIIlI.lIIIll(drawContext, textRenderer, string, d + d3 / 2.0, d2 + d4 / 2.0, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void II(DrawContext drawContext, TextRenderer textRenderer, ItemStack itemStack, int n, int n2) {
        if (drawContext == null) return;
        if (itemStack == null) return;
        if (!itemStack.isEmpty()) {
            drawContext.drawItem(itemStack, n, n2);
            if (textRenderer == null) return;
            drawContext.drawStackOverlay(textRenderer, itemStack, n, n2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String Il(String string, String string2) {
        String string3;
        String string4 = string == null ? "" : string;
        String string5 = string3 = string2 != null ? string2.toUpperCase(Locale.ROOT) : "";
        if (!string3.contains("UPPER")) {
            if (!string3.contains("LOWER")) return string4;
            return string4.toLowerCase(Locale.ROOT);
        }
        return string4.toUpperCase(Locale.ROOT);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, double d6, int n2, double d7) {
        if (drawContext == null) return;
        if (d3 <= 0.0) return;
        if (d4 <= 0.0) return;
        if (d6 <= 0.0) return;
        if (n2 <= 0) return;
        if (d7 <= 0.0) return;
        if ((n >>> 24 & 0xFF) <= 0) {
            return;
        }
        int n3 = n >>> 24 & 0xFF;
        int n4 = (int)Math.round((double)n3 * IIllIIlII.II(d7));
        if (n4 > 0) {
            int n5 = n4 << 24 | n & 0xFFFFFF;
            IIIlIIllI.IllIl(drawContext, d, d2, d3, d4, d5, d6, n5);
            return;
        }
    }

    public static double ll(TextRenderer textRenderer) {
        return Math.ceil(IIIlI.IllIII(textRenderer) + 1.0);
    }

    public static void III(DrawContext drawContext, double d, double d2, double d3, double d4, int n) {
        IIIlI.lIIlll(drawContext, d, d2, d + d3, d2 + d4, n);
    }

    public static String IIl(TextRenderer textRenderer, String string, double d) {
        return textRenderer.trimToWidth(string, (int)d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void IlI(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, int n) {
        block1: {
            if (!llllIII.lIl()) break block1;
            IIIlI.lllll(drawContext, textRenderer, string, d - (double)IIIlI.IIIlll(textRenderer, string), d2, n);
            return;
        }
        Text text = Interface.lI(string);
        IIIlI.IIIllI(drawContext, textRenderer, text, d - (double)IIIlI.IIIll(textRenderer, text), d2, n, true);
    }

    public static void Ill(DrawContext drawContext, double d, double d2) {
        IIIlIIllI.Illl(drawContext, d, d2);
    }

    public static void lII(DrawContext drawContext, TextRenderer textRenderer, Text text, double d, double d2, int n) {
        Text text2 = Interface.lll(text);
        IIIlI.IIIllI(drawContext, textRenderer, text2, d - (double)IIIlI.IIIll(textRenderer, text2) / 2.0, d2 - IIIlI.IllIII(textRenderer) / 2.0, n, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Boolean lIl(Boolean bl) {
        Boolean bl2 = I.get();
        if (bl == null) {
            I.remove();
            return bl2;
        }
        I.set(bl);
        return bl2;
    }

    public static void llI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2) {
        IIIlI.IlIIlI(drawContext, d, d2, d3, d4, d5, n, n2, true, true);
    }

    public static void lll(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, int n, int n2, int n3, int n4, int n5, int n6) {
        IIIlI.llIIl(drawContext, identifier, d, d2, d3, d4, n, n2, n3, n4, n5, n6, -1);
    }

    public static boolean IIII(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, float f, float f2, float f3, float f4, int n, float f5) {
        return IIIlIIllI.llIlI(drawContext, identifier, d, d2, d3, d4, f, f2, f3, f4, n, f5);
    }

    public static void IIIl(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        IIIlI.Illl(drawContext, d, d2, d3, d4, d5, n);
    }

    public static void IIlI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5) {
        IIIlI.IllII(drawContext, d, d2, d3, d4, d5, -669114327, 0x66FFFFFF);
    }

    public static void IIll(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, double d3, double d4, double d5, int n) {
        double d6 = Math.max(0.0, d3 - d5 * 2.0);
        IIIlI.llIlll(drawContext, textRenderer, IIIlI.llIIIl(textRenderer, string, d6), d + d5, d2, d6, d4, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlII(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3, int n4) {
        int n5;
        IIlIlII iIlIlII = IIIlI.IIlllI(d, d2, d3, d4, d5, 0.0);
        if (!iIlIlII.l()) {
            return;
        }
        int n6 = n;
        int n7 = n2;
        int n8 = n3;
        int n9 = n4;
        if (d3 < 0.0) {
            n5 = n6;
            n6 = n7;
            n7 = n5;
            n5 = n9;
            n9 = n8;
            n8 = n5;
        }
        if (d4 < 0.0) {
            n5 = n6;
            n6 = n9;
            n9 = n5;
            n5 = n7;
            n7 = n8;
            n8 = n5;
        }
        IIIlIIllI.IlIl(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.ll(), iIlIlII.III(), iIlIlII.Il(), n6, n7, n8, n9);
    }

    public static void IlIl(DrawContext drawContext, TextRenderer textRenderer, Text text, double d, double d2, double d3, int n) {
        IIIlI.lIlIll(drawContext, textRenderer, text, d, d2 + (d3 - IIIlI.IllIII(textRenderer)) / 2.0, n);
    }

    public static void IllI(DrawContext drawContext, double d, double d2, double d3, double d4, int n) {
        IIIlI.Illl(drawContext, d, d2, d3, d4, Math.min(Math.abs(d3), Math.abs(d4)) * 0.5, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void Illl(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        if ((n >>> 24 & 0xFF) <= 0) {
            return;
        }
        IIlIlII iIlIlII = IIIlI.IIlllI(d, d2, d3, d4, d5, 0.0);
        if (!iIlIlII.l()) {
            return;
        }
        IIIlIIllI.lIll(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.ll(), iIlIlII.III(), iIlIlII.Il(), n);
    }

    public static void lIII(DrawContext drawContext, TextRenderer textRenderer, Text text, double d, double d2, double d3, double d4, int n) {
        IIIlI.lII(drawContext, textRenderer, text, d + d3 / 2.0, d2 + d4 / 2.0, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIIl(DrawContext drawContext, double d, double d2, boolean bl, int n, int n2) {
        double d3 = IIIlI.llIIll();
        double d4 = IIIlI.IlIlI();
        double d5 = IIIlI.lIlIII(IIIlI.lIlIl(d, d2, bl));
        double d6 = Math.max(4.0, d3 - 2.6);
        int n3 = lIIIlIII.II(n, Math.max(76, n >>> 24 & 0xFF));
        int n4 = IIIlI.IlIIl(n3, n, d5);
        IIIlI.Illl(drawContext, d, d2, d4, d3, d3 * 0.5, n4);
        double d7 = 1.3;
        double d8 = Math.max(0.0, d4 - d6 - d7 * 2.0);
        double d9 = d + d7 + d8 * d5;
        IIIlI.IIIIIl(drawContext, d9 + d6 * 0.5, d2 + d3 * 0.5, d6 * 0.5, lIIIlIII.II(n2, 238));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIlI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5) {
        if (drawContext == null) {
            return;
        }
        double d6 = Math.max(0.0, d5);
        IlIllllI ilIllllI = IlIllllI.Il(d - d6, d2 - d6, d3 + d6, d4 + d6);
        Deque<IlIllllI> deque = IIl.get();
        if (!deque.isEmpty()) {
            ilIllllI = ilIllllI.lI(deque.peek());
        }
        deque.push(ilIllllI);
        IIIlI.llIlI(drawContext, ilIllllI);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIll(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, double d3, boolean bl, int n, int n2, int n3) {
        double d4 = II.I();
        IIIlI.Illl(drawContext, d, d2, d3, d4, II.l(), n);
        if ((n2 >>> 24 & 0xFF) > 0 || bl) {
            IIIlI.IllllI(drawContext, d, d2, d3, d4, II.l(), n2);
        }
        IIIlI.IIll(drawContext, textRenderer, string, d, d2, d3, d4, II.II(), n3);
    }

    public static void llII(DrawContext drawContext, double d, double d2, double d3, double d4) {
        IIIlI.lIlI(drawContext, d, d2, d3, d4, 2.0);
    }

    public static boolean llIl(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, float f, float f2, float f3, float f4, int n) {
        return IIIlIIllI.II(drawContext, identifier, d, d2, d3, d4, f, f2, f3, f4, n);
    }

    public static double lllI() {
        return II.II();
    }

    public static void llll(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4) {
        IIIlI.lIllIl(drawContext, identifier, d, d2, d3, d4, -1);
    }

    private static long IIIII(double d, double d2) {
        long l2 = Math.round(d * 4.0);
        long l3 = Math.round(d2 * 4.0);
        return l2 << 32 ^ l3 & 0xFFFFFFFFL;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int IIIIl(int n, int n2, int n3, int n4) {
        float f;
        long l2 = System.currentTimeMillis();
        float f2 = (float)(l2 % 4200L) / 4200.0f;
        float f3 = (f2 + (float)n4 * 0.075f + (f = (float)(n2 + n3) * 0.0025f)) % 1.0f;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        return n << 24 | IIIlI.I(f3) & 0xFFFFFF;
    }

    public static boolean IIIlI(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, int n) {
        return IIIlIIllI.IlIII(drawContext, identifier, d, d2, d3, d4, n);
    }

    public static int IIIll(TextRenderer textRenderer, Text text) {
        return textRenderer.getWidth((StringVisitable)Interface.lll(text));
    }

    public static void IIlII(DrawContext drawContext, double d) {
        IIIlIIllI.lIlIl(drawContext, d);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIlIl(DrawContext drawContext, double d, double d2, double d3, double d4, int n, int n2, boolean bl) {
        double d5 = 12.0;
        IIIlI.IllllI(drawContext, d, d2, d3, d4, d5, n2);
        IIIlI.Illl(drawContext, d + 1.0, d2 + 1.0, d3 - 2.0, d4 - 2.0, Math.max(0.0, d5 - 1.0), n);
        IIIlI.lIIIIl(drawContext, d + 1.0, d2 + 1.0, d3 - 2.0, Math.max(12.0, d4 * 0.5), Math.max(0.0, d5 - 1.0), !bl ? 0xEFFFFFF : 0x1AFFFFFF, 0xFFFFFF);
    }

    private static void IIllI(DrawContext drawContext, TextRenderer textRenderer, Text text, int n, int n2, int n3, boolean bl) {
        if (ll != null) {
            try {
                ll.invoke((Object)drawContext, textRenderer, text, n, n2, n3, bl);
                return;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                // empty catch block
            }
        }
    }

    public static void IIlll(DrawContext drawContext, double d, double d2) {
        IIIlIIllI.IIlIl(drawContext, d, d2);
    }

    public static void IlIII(DrawContext drawContext, TextRenderer textRenderer, Text text, double d, double d2, int n) {
        Text text2 = Interface.lll(text);
        IIIlI.IIIllI(drawContext, textRenderer, text2, d - (double)IIIlI.IIIll(textRenderer, text2), d2, n, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int IlIIl(int n, int n2, double d) {
        double d2 = Math.max(0.0, Math.min(1.0, d));
        int n3 = (int)Math.round((double)(n >>> 24 & 0xFF) + (double)((n2 >>> 24 & 0xFF) - (n >>> 24 & 0xFF)) * d2);
        int n4 = (int)Math.round((double)(n >>> 16 & 0xFF) + (double)((n2 >>> 16 & 0xFF) - (n >>> 16 & 0xFF)) * d2);
        int n5 = (int)Math.round((double)(n >>> 8 & 0xFF) + (double)((n2 >>> 8 & 0xFF) - (n >>> 8 & 0xFF)) * d2);
        int n6 = (int)Math.round((double)(n & 0xFF) + (double)((n2 & 0xFF) - (n & 0xFF)) * d2);
        return n3 << 24 | n4 << 16 | n5 << 8 | n6;
    }

    public static double IlIlI() {
        return IIIlI.llIIll() * 2.15;
    }

    public static void IlIll(Boolean bl) {
        if (bl == null) {
            I.remove();
        } else {
            I.set(bl);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void IllII(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2) {
        IIIlI.IlII(drawContext, d, d2, d3, d4, d5, llIlllIl.ll(llIlllIl.Ill(n, -1, 0.06), 1.0), llIlllIl.ll(llIlllIl.Ill(n, -1, 0.1), 1.0), llIlllIl.ll(n, 0.92), llIlllIl.ll(n, 0.96));
        IIIlI.IllllI(drawContext, d, d2, d3, d4, d5, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IllIl(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        if ((n >>> 24 & 0xFF) <= 0) return;
        if (d3 <= 0.0) return;
        if (d4 <= 0.0) return;
        if (!(d5 <= 0.0)) {
            IIIlIIllI.ll(drawContext, d, d2, d3, d4, d5, n);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlllI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, double d6, int n) {
        if ((n >>> 24 & 0xFF) <= 0) return;
        if (d6 <= 0.0) {
            return;
        }
        IIlIlII iIlIlII = IIIlI.IIlllI(d, d2, d3, d4, d5, Math.max(0.5, d6));
        if (!iIlIlII.l()) {
            return;
        }
        IIIlIIllI.l(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.ll(), iIlIlII.III(), iIlIlII.Il(), iIlIlII.I(), n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void Illll(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, double d3, double d4, boolean bl, int n, int n2, int n3) {
        double d5 = Math.max(1.0, d4);
        double d6 = Math.min(II.l(), d5 * 0.5);
        IIIlI.Illl(drawContext, d, d2, d3, d5, d6, n);
        if ((n2 >>> 24 & 0xFF) > 0 || bl) {
            IIIlI.IllllI(drawContext, d, d2, d3, d5, d6, n2);
        }
        String string2 = IIIlI.llIIIl(textRenderer, string, Math.max(0.0, d3 - II.II() * 2.0));
        IIIlI.IlIIll(drawContext, textRenderer, string2, d + (d3 - (double)IIIlI.IIIlll(textRenderer, string2)) * 0.5, d2 + (d5 - IIIlI.IllIII(textRenderer)) * 0.5, n3);
    }

    public static void lIIII(double d) {
        III = Math.max(0.0, d);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIIIl(DrawContext drawContext, double d, double d2, double d3, double d4, int n, int n2, boolean bl) {
        IIIlI.llIllI(drawContext, d, d2, d3, d4, n, n2);
        IIIlI.llIIII(drawContext, d + 1.0, d2 + 1.0, d + d3 - 1.0, d2 + Math.max(12.0, d4 * 0.5), bl ? 0x1AFFFFFF : 0xEFFFFFF, 0xFFFFFF);
    }

    public static void lIIlI(DrawContext drawContext, double d, double d2, double d3, double d4, int n, int n2) {
        IIIlI.IllII(drawContext, d, d2, d3, d4, II.l(), n, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIIll(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, int n) {
        if (llllIII.lIl()) {
            IIIlI.IlIIll(drawContext, textRenderer, string, d - (double)IIIlI.IIIlll(textRenderer, string) / 2.0, d2 - IIIlI.IllIII(textRenderer) / 2.0, n);
            return;
        }
        Text text = Interface.lI(string);
        IIIlI.IIIllI(drawContext, textRenderer, text, d - (double)IIIlI.IIIll(textRenderer, text) / 2.0, d2 - IIIlI.IllIII(textRenderer) / 2.0, n, false);
    }

    public static void lIlII(DrawContext drawContext, double d, double d2, double d3, double d4, int n) {
        IIIlI.lIlIlI(drawContext, d, d2, d3, d4, 1.0, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double lIlIl(double d, double d2, boolean bl) {
        long l2 = IIIlI.IIIII(d, d2);
        long l3 = System.nanoTime();
        double d3 = bl ? 1.0 : 0.0;
        lllllIIl lllllIIl2 = Ill.get(l2);
        if (lllllIIl2 == null) {
            Ill.put(l2, new lllllIIl(d3, l3));
            return d3;
        }
        double d4 = Math.min(0.05, Math.max(0.0, (double)(l3 - lllllIIl2.I()) / 1.0E9));
        double d5 = 1.0 - Math.pow(0.001, d4 / 0.16);
        double d6 = lllllIIl2.l() + (d3 - lllllIIl2.l()) * Math.max(0.0, Math.min(1.0, d5));
        if (Math.abs(d6 - d3) < 0.002) {
            d6 = d3;
        }
        Ill.put(l2, new lllllIIl(d6, l3));
        return d6;
    }

    public static void lIllI(DrawContext drawContext, TextRenderer textRenderer, Text text, double d, double d2, int n) {
        Text text2 = Interface.lll(text);
        IIIlI.IIIllI(drawContext, textRenderer, text2, d - (double)IIIlI.IIIll(textRenderer, text2), d2, n, true);
    }

    public static void lIlll(DrawContext drawContext, TextRenderer textRenderer, Text text, double d, double d2, double d3, int n) {
        IIIlI.IllIIl(drawContext, textRenderer, text, d, d2 + (d3 - IIIlI.IllIII(textRenderer)) / 2.0, n);
    }

    public static void llIII(DrawContext drawContext, double d, double d2, double d3, int n) {
        IIIlI.lIIlll(drawContext, d, d3, d2, d3 + 1.0, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void llIIl(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if ((n7 >>> 24 & 0xFF) <= 0) return;
        if (n3 <= 0) return;
        if (n4 <= 0) return;
        if (n5 <= 0) return;
        if (n6 <= 0) {
            return;
        }
        IIIlIIllI.IIlll(drawContext, identifier, (int)Math.round(d), (int)Math.round(d2), (int)Math.round(d3), (int)Math.round(d4), n, n2, n3, n4, n5, n6, n7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void llIlI(DrawContext drawContext, IlIllllI ilIllllI) {
        int n = (int)Math.floor(ilIllllI.ll());
        int n2 = (int)Math.floor(ilIllllI.I());
        int n3 = (int)Math.ceil(ilIllllI.II());
        int n4 = (int)Math.ceil(ilIllllI.l());
        drawContext.enableScissor(n, n2, Math.max(n, n3), Math.max(n2, n4));
    }

    public static void llIll(DrawContext drawContext, double d, double d2, double d3, double d4, int n, int n2, double d5) {
        IIIlI.IllllI(drawContext, d, d2, d3, d4, d5, n2);
        IIIlI.Illl(drawContext, d + 1.0, d2 + 1.0, d3 - 2.0, d4 - 2.0, Math.max(0.0, d5 - 1.0), n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lllII(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2, double d6) {
        if (d3 <= 0.0) return;
        if (d4 <= 0.0) return;
        if (d6 <= 0.01) {
            return;
        }
        double d7 = Math.max(0.0, d5 - 0.5);
        IIIlI.Illl(drawContext, d, d2, d3, d4, d5, n);
        double d8 = Math.max(3.0, d4 * 0.45);
        IIIlI.Illl(drawContext, d + 0.5, d2 + 0.5, d3 - 1.0, d8, d7, (int)Math.round(10.0 * d6) << 24 | 0xFFFFFF);
        double d9 = Math.max(2.0, d4 * 0.2);
        IIIlI.Illl(drawContext, d + 0.5, d2 + 0.5, d3 - 1.0, d9, d7, (int)Math.round(18.0 * d6) << 24 | 0xFFFFFF);
        double d10 = Math.max(2.0, d4 * 0.25);
        IIIlI.Illl(drawContext, d + 0.5, d2 + d4 - d10, d3 - 1.0, d10, d7, (int)Math.round(12.0 * d6) << 24);
        IIIlI.IllllI(drawContext, d, d2, d3, d4, d5, (int)Math.round(28.0 * d6) << 24 | 0xFFFFFF);
        int n3 = (int)Math.round(14.0 * d6);
        if (n3 <= 0) return;
        IIIlI.Illl(drawContext, d + 1.0, d2 + 1.0, d3 - 2.0, d4 - 2.0, Math.max(0.0, d5 - 1.0), n3 << 24 | n2 & 0xFFFFFF);
    }

    public static void lllIl(DrawContext drawContext, double d, double d2, double d3, double d4) {
        IIIlI.llII(drawContext, d, d2, d3, d4);
    }

    public static void llllI(DrawContext drawContext, TextRenderer textRenderer, Text text, double d, double d2, double d3, double d4, int n) {
        IIIlI.IIIlII(drawContext, textRenderer, text, d + d3 / 2.0, d2 + d4 / 2.0, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lllll(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, int n) {
        if (llllIII.II(drawContext, string, d, d2, n, true, IIIlI.lIIlII(n, (Text)Text.literal((String)(string == null ? "" : string))))) {
            return;
        }
        IIIlI.IIIllI(drawContext, textRenderer, Interface.lI(string), d, d2, n, true);
    }

    public static void IIIIII(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, double d3, int n) {
        IIIlI.IlIIll(drawContext, textRenderer, string, d, d2 + (d3 - IIIlI.IllIII(textRenderer)) / 2.0, n);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block24: {
                block22: {
                    block28: {
                        block26: {
                            block29: {
                                block23: {
                                    block25: {
                                        block27: {
                                            var6 = 30273;
                                            ** GOTO lbl36
lbl3:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl5:
                                            // 1 sources

                                            while (true) {
                                                ** GOTO lbl26
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (true) {
                                                var13_8 = -1;
                                                ** GOTO lbl28
                                                break;
                                            }
lbl10:
                                            // 1 sources

                                            while (true) {
                                                var8_3 = "\b\b\u0004\u0004\u0004".toCharArray();
                                                var9_4 = new String[var8_3.length];
                                                ** continue;
                                                break;
                                            }
                                            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                                            var15_10 = 0;
                                            block10: while (true) {
                                                block0 : switch (var15_10 % 5) {
                                                    case 3: {
                                                        v0 = 64;
                                                        break block10;
                                                    }
lbl21:
                                                    // 1 sources

                                                    while (true) {
                                                        var11_6 += var12_7;
                                                        break block22;
                                                        break;
                                                    }
lbl24:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl26:
                                                    // 1 sources

                                                    if (var15_10 < var14_9.length) continue block10;
                                                    ** GOTO lbl53
lbl28:
                                                    // 2 sources

                                                    while (true) {
                                                        var10_5 = 0;
                                                        break block23;
                                                        break;
                                                    }
lbl31:
                                                    // 1 sources

                                                    while (true) {
                                                        IIIlI.lII[var4_15] = var5_16 ^= var2_13;
                                                        ** GOTO lbl62
                                                        break;
                                                    }
lbl34:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl36:
                                                    // 1 sources

                                                    var7_2 = "\u91be\u91ea\u91f4\u91f4\u91a6\u9e23\u91bc\u9e5b\u6807\ue8c0\u682d\ue872\u682d\ue8a0\u683f\ue8e0\uf2e4\uf01a\uf05c\uf05b\ufa53\ufab4\ufb6f\ufb6a\u0bfa\u0b60\u0b99\u0b9c";
                                                    ** continue;
                                                    case 2: {
                                                        v0 = 69;
                                                        break block10;
                                                    }
lbl41:
                                                    // 1 sources

                                                    while (true) {
                                                        if (++var10_5 < var8_3.length) break block0;
                                                        break block24;
                                                        break;
                                                    }
lbl44:
                                                    // 1 sources

                                                    while (true) {
                                                        IIIlI.Ill = new HashMap<Long, lllllIIl>();
                                                        break block25;
                                                        break;
                                                    }
lbl47:
                                                    // 1 sources

                                                    while (true) {
                                                        var2_13 = 1292946852;
                                                        break block26;
                                                        break;
                                                    }
                                                    IIIlI.lIl = var9_4;
                                                    IIIlI.llI = new Object[var9_4.length];
                                                    ** continue;
lbl53:
                                                    // 1 sources

                                                    var9_4[var10_5] = new String(var14_9).intern();
                                                    ** continue;
                                                    IIIlI.lII = new int[var1_12];
                                                    var3_14 = 0;
                                                    break block27;
lbl58:
                                                    // 1 sources

                                                    while (var13_8 == 0) {
                                                        ** continue;
lbl60:
                                                        // 1 sources

                                                        ** GOTO lbl34
                                                    }
                                                    break;
lbl62:
                                                    // 1 sources

                                                    var3_14 += 4;
                                                    if (++var4_15 < var1_12) break block28;
                                                    break block29;
lbl65:
                                                    // 1 sources

                                                    while (true) {
                                                        IIIlI.IIl = ThreadLocal.withInitial((Supplier<Deque>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, <init>(), ()Ljava/util/Deque;)());
                                                        break block30;
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
lbl68:
                                            // 5 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var4_15 = 0;
                                        break block28;
                                    }
                                    IIIlI.II = new llIlIIll(14.0, 4.0, 6.0);
                                    return;
                                }
                                var11_6 = 0;
                                var12_7 = '\u0000';
                                ** GOTO lbl58
                                {
                                    default: {
                                        v0 = 111;
                                        break;
                                    }
                                    case 1: {
                                        v0 = 80;
                                        break;
                                    }
                                }
                                var12_7 = var8_3[var10_5];
                                ** while (true)
                            }
                            IIIlI.III = 1.0;
                            IIIlI.ll = IIIlI.lIllII();
                            ** while (true)
                        }
                        var0_11 = "\u00d6I\"\u00ec\u001am\u00ba6\u00947f'\u00ec\u00c4=\u00b7\u000b\u00da\u0016:q\u00dc`\u0003\u0010\b,S\u00ed\u0090\u00da\u00db SQH\u0094B2\u00ebY\u0014\u00c9*bt\u0099+5\u001b1|C\u00d0\u00b0\u00f2\u00c3%\u00ce\u00bb\u0001\u00df\u0088\u001cQ-\u00c3\u00a3a\u0088\u00a7d\u000e\u00feX\u00dd\u00b9\u00e9/(\u0094\u00b7C\u00eb\u0085\u00b2\u0004\u00b3}\u001ek\u00ad\u00ab\r\u001dCN\u0098*cu\u0007t!\u00cc\u00dcb*\u009d\u0095\u008f9\u00c9\u00e2Y\u00b9\u0096\u00e2\u00b2[\u0010E`\u00e3;'U\u00c7\u0013\u009a\u00e6\u0081L\u00e4\u001f:z\u00b5\u00f3\u00afb\u00c3\u00a2\u00b0\u0010<\\\u0084I\u00f3\u00a8\u0091\u00b1\u0007\u00193\u00e9\u00e7\u0001B\u00a5yQA\u00d7\u0085w\u00c8q\"[\tZ\u007f\u000e_\u00fd\u00c9\u00e5\u001d8\u0092\u0016\u0085m\u00a7\u00e1\u00f9\u009d\u00f4Q\u001cE\u00e1\u00aa\u001e\u009bj\u00d6\u0001\u00d3\u00c7fo\u009b&\u0091\u009c.\u0099\u00ec;\u00b51\u00a7\u00f9\u00da\u00ee\u00c0\u0018@M\u00ea\u0012+\u00ceS\u00b5/K6\n[\u00c6U\u00dd\u00f8\u009a\u0080 \u009d\u00c0\u00b2^\u001d\u00ec\u008e\u00d6{\u00f8\u0098/j\u00ebK]\u0087\u00a9e\u00bd;\u00eer\u00e4\u000e6x\u00d9c}E\u00f6\u00f2\u009c\t\u001e%\u00f3\u00b2\u0018\b\u00c6\u00b7K\u008d\u0016\u00b2\u008c\u0092\u00df\u00c8ry\u00ccu\u00d1\u00b1E#'\u00e1\u001byo\u00ce\u0019\u0012\u00b8\u00ceZzz\u00db\u0017\u00fdH\u0089\u00e7B\u00c5\u00f7\u00ee\tk\u00d5C`\u00efp\u00a4\u00e6\u00f5.\u00ccj\u00c8\u00f8=\u00a81?\u0006\u0091\u008d\u00e6\u0086\u00bd\u00c9##/\u008a\u0085o\"/_\u009fh\u00f2n\u00db\u001d\u0094\u00a1\u00ad\u0088\u00a5\u0097\u00de\u00ba[\u00c1i\u0085\u009a\u0099\u00aa-\u00f3\u0095\u00d8\u00e0\u00db\u00d0\u00bd\u00fe(\u0014\u00fbe\u00dfH\u000f\u008f\u00a2\u0091\u007f\u00d3\u00aa\u008c\u0093\u0089\u0099kE\u00d2\u00f1\u00bcR\u007f\u00fepO\u009d4\u001ax\u008c\u00be\u00a6\u00cft\u00abn~*T\u00cf\u0089\u001f\u00ac*\u00a9y\u00f2\f\u00a1\u00d7\u00a4IRbR\u00cb\u00f4\u00dd}\u008f\u00f7\u00b6\u00dc\u00e1\u00b3\u0092g\u0002\u00c2:}f!\u00b5\u00ddued\u001f\u00e7e\u00a3\u00f9N\u00cd\u00ba\u00b9\u00df\u00a1\u0088h".getBytes("ISO-8859-1");
                        var1_12 = var0_11.length / 4;
                        ** while (true)
                    }
                    var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                    ** while (true)
                    var16_1 = v0;
                    v1 = var15_10++;
                    var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
                    ** while (true)
                    {
                        ** case 4:
                    }
lbl104:
                    // 1 sources

                    v0 = 64;
                    ** while (true)
                }
                ** while (true)
            }
            var13_8 = 0;
            ** while (true)
        }
        IIIlI.I = new ThreadLocal<T>();
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void IIIIIl(DrawContext drawContext, double d, double d2, double d3, int n) {
        if ((n >>> 24 & 0xFF) <= 0 || d3 <= 0.0) {
            return;
        }
        IIIlIIllI.lII(drawContext, d, d2, d3, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIIIlI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3) {
        if (drawContext == null) return;
        if (d3 <= 0.0) return;
        if (d4 <= 0.0) {
            return;
        }
        IIIlI.lI(drawContext, d, d2, d3, d4, d5, -1778384896, 10.0, 8, 0.44);
        IIIlI.IllII(drawContext, d, d2, d3, d4, d5, n, n2);
        int n4 = n3 >>> 24 & 0xFF;
        if (n4 <= 0) return;
        IIIlI.lIIIIl(drawContext, d + 1.0, d2 + 1.0, d3 - 2.0, Math.min(30.0, d4 - 2.0), Math.max(0.0, d5 - 1.0), n3, n3 & 0xFFFFFF);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIIIll(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2) {
        if (drawContext == null) return;
        if (d3 <= 0.0) return;
        if (!(d4 <= 0.0)) {
            double d6 = Math.min(d3, d4) * 0.5;
            IIIlI.Illl(drawContext, d, d2, d3, d4, d6, n);
            double d7 = Math.max(0.0, Math.min(d3, d3 * IIllIIlII.II(d5)));
            if (!(d7 > 0.0)) return;
            IIIlI.Illl(drawContext, d, d2, d7, d4, Math.min(d6, d7 * 0.5), n2);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void IIIlII(DrawContext drawContext, TextRenderer textRenderer, Text text, double d, double d2, int n) {
        Text text2 = Interface.lll(text);
        IIIlI.IIIllI(drawContext, textRenderer, text2, d - (double)IIIlI.IIIll(textRenderer, text2) / 2.0, d2 - IIIlI.IllIII(textRenderer) / 2.0, n, false);
    }

    public static void IIIlIl(DrawContext drawContext, double d, double d2) {
        IIIlIIllI.llI(drawContext, d, d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIIllI(DrawContext drawContext, TextRenderer textRenderer, Text text, double d, double d2, int n, boolean bl) {
        int n2;
        int n3;
        if (drawContext == null) return;
        if (textRenderer == null) return;
        if (text == null) return;
        if (!Double.isFinite(d)) return;
        if (Double.isFinite(d2)) {
            n3 = (int)Math.round(d);
            n2 = (int)Math.round(d2);
            if (!IIIlI.lIIlII(n, text)) {
                IIIlI.IIllI(drawContext, textRenderer, text, n3, n2, n, bl);
                return;
            }
        } else {
            return;
        }
        IIIlI.IIlIlI(drawContext, textRenderer, text, n3, n2, n, bl);
    }

    public static int IIIlll(TextRenderer textRenderer, String string) {
        int n = llllIII.IIIl(string);
        if (n >= 0) {
            return n;
        }
        return textRenderer.getWidth((StringVisitable)Interface.lI(string));
    }

    public static double IIlIII() {
        return III;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIlIIl(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2) {
        int n3 = n >>> 24 & 0xFF;
        int n4 = n2 >>> 24 & 0xFF;
        if (n3 > 0 || n4 > 0) {
            IIlIlII iIlIlII = IIIlI.IIlllI(d, d2, d3, d4, d5, 0.0);
            if (!iIlIlII.l()) {
                return;
            }
            int n5 = d3 < 0.0 ? n2 : n;
            int n6 = d3 < 0.0 ? n : n2;
            IIIlIIllI.IlI(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.ll(), iIlIlII.III(), iIlIlII.Il(), n5, n6);
            return;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static void IIlIlI(DrawContext drawContext, TextRenderer textRenderer, Text text, int n, int n2, int n3, boolean bl) {
        String string = text.getString();
        int n4 = n3 >>> 24 & 0xFF;
        double d = n;
        int n5 = 0;
        int n6 = 0;
        boolean bl2 = true;
        while (true) {
            int n7;
            MutableText mutableText;
            if (!bl2 || (bl2 = false) || !true) {
                d += (double)textRenderer.getWidth((StringVisitable)mutableText);
                n6 += Character.charCount(n7);
                ++n5;
            }
            if (n6 >= string.length()) {
                return;
            }
            n7 = string.codePointAt(n6);
            String string2 = new String(Character.toChars(n7));
            mutableText = Text.literal((String)string2).setStyle(text.getStyle());
            if (Character.isWhitespace(n7)) continue;
            int n8 = IIIlI.IIIIl(n4, n, n2, n5);
            IIIlI.IIllI(drawContext, textRenderer, (Text)mutableText, (int)Math.round(d), n2, n8, bl);
        }
    }

    public static void IIlIll(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, double d5, int n) {
        IIIlIIllI.lI(drawContext, identifier, d, d2, d3, d4, d5, n);
    }

    public static double IIllII() {
        return II.I();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIllIl(DrawContext drawContext, double d, double d2, double d3, double d4, int n, int n2) {
        double d5 = Math.min(d, d3);
        double d6 = Math.max(d, d3);
        double d7 = Math.min(d2, d4);
        double d8 = Math.max(d2, d4);
        if (d6 <= d5) return;
        if (!(d8 <= d7)) {
            IIIlIIllI.IlI(drawContext, d5, d7, d6 - d5, d8 - d7, 0.0, n, n2);
            return;
        }
    }

    private static IIlIlII IIlllI(double d, double d2, double d3, double d4, double d5, double d6) {
        return IllIlIl.lll(d, d2, d3, d4, Math.max(0.0, d5 * III), Math.max(0.0, d6));
    }

    public static void IIllll(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, double d3, double d4, double d5, int n) {
        double d6 = Math.max(0.0, d3 - d5 * 2.0);
        IIIlI.l(drawContext, textRenderer, IIIlI.llIIIl(textRenderer, string, d6), d + d5, d2, d6, d4, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlIIII(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3) {
        if (d3 <= 0.0) return;
        if (!(d4 <= 0.0)) {
            IIIlI.IllllI(drawContext, d, d2, d3, d4, d5, n2);
            double d6 = Math.max(0.0, d5 - 1.0);
            IIIlI.Illl(drawContext, d + 1.0, d2 + 1.0, d3 - 2.0, d4 - 2.0, d6, n);
            if (n3 == 0) return;
            double d7 = Math.min(40.0, d4 - 2.0);
            IIIlI.lIIIIl(drawContext, d + 1.0, d2 + 1.0, d3 - 2.0, d7, d6, 0x10000000 | n3 & 0xFFFFFF, 0 | n3 & 0xFFFFFF);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void IlIIIl(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, int n) {
        block2: {
            if (!llllIII.lIl()) break block2;
            IIIlI.IlIIll(drawContext, textRenderer, string, d - (double)IIIlI.IIIlll(textRenderer, string), d2, n);
            return;
        }
        Text text = Interface.lI(string);
        IIIlI.IIIllI(drawContext, textRenderer, text, d - (double)IIIlI.IIIll(textRenderer, text), d2, n, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IlIIlI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2, boolean bl, boolean bl2) {
        boolean bl3;
        IIlIlII iIlIlII;
        int n3 = n >>> 24 & 0xFF;
        int n4 = n2 >>> 24 & 0xFF;
        if (n3 > 0 || n4 > 0) {
            iIlIlII = IIIlI.IIlllI(d, d2, d3, d4, d5, 0.0);
            if (!iIlIlII.l()) {
                return;
            }
        } else {
            return;
        }
        int n5 = d4 < 0.0 ? n2 : n;
        int n6 = !(d4 < 0.0) ? n2 : n;
        boolean bl4 = d4 < 0.0 ? bl2 : bl;
        boolean bl5 = bl3 = d4 < 0.0 ? bl : bl2;
        if (bl4 || bl3) {
            IIIlIIllI.llII(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.ll(), iIlIlII.III(), iIlIlII.Il(), n5, n6, bl4, bl3);
            return;
        }
        IIIlI.llIIII(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.lI() + iIlIlII.ll(), iIlIlII.II() + iIlIlII.III(), n5, n6);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlIIll(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, int n) {
        if (llllIII.II(drawContext, string, d, d2, n, false, IIIlI.lIIlII(n, (Text)Text.literal((String)(string == null ? "" : string))))) {
            return;
        }
        IIIlI.IIIllI(drawContext, textRenderer, Interface.lI(string), d, d2, n, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlIlII(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, int n, int n2, int n3) {
        if ((n3 >>> 24 & 0xFF) <= 0) return;
        if (n <= 0) return;
        if (n2 <= 0) {
            return;
        }
        IIIlIIllI.IIll(drawContext, identifier, (int)Math.round(d), (int)Math.round(d2), (int)Math.round(d3), (int)Math.round(d4), n, n2, n3);
    }

    public static void IlIlIl(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, int n, int n2) {
        IIIlI.IlIlII(drawContext, identifier, d, d2, d3, d4, n, n2, -1);
    }

    public static void IlIllI(DrawContext drawContext) {
        IIIlIIllI.lllI(drawContext);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlIlll(DrawContext drawContext, double d, double d2, double d3, double d4, int n) {
        if ((n >>> 24 & 0xFF) <= 0) return;
        if (d3 <= 0.0) return;
        if (d4 <= 0.0) {
            return;
        }
        IIIlIIllI.lll(drawContext, d, d2, d3, d4, n);
    }

    public static double IllIII(TextRenderer textRenderer) {
        block2: {
            block1: {
                double d;
                block0: {
                    d = llllIII.IIII();
                    if (d >= 0.0) break block0;
                    if (textRenderer != null) break block1;
                    break block2;
                }
                return d;
            }
            Objects.requireNonNull(textRenderer);
            return 9.0;
        }
        return 9.0;
    }

    public static void IllIIl(DrawContext drawContext, TextRenderer textRenderer, Text text, double d, double d2, int n) {
        IIIlI.IIIllI(drawContext, textRenderer, Interface.lll(text), d, d2, n, true);
    }

    public static boolean IllIlI(double d, double d2, double d3, double d4, double d5, double d6) {
        return IllIlIl.IIII(d, d2, d3, d4, d5, d6);
    }

    public static llIlIIll IllIll() {
        return II;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlllII(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        if ((n >>> 24 & 0xFF) <= 0) {
            return;
        }
        IIlIlII iIlIlII = IIIlI.IIlllI(d, d2, d3, d4, d5, 0.0);
        if (!iIlIlII.l()) {
            return;
        }
        if (iIlIlII.Il() <= 0.0) {
            IIIlI.III(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.ll(), iIlIlII.III(), n);
            return;
        }
        IIIlIIllI.lIll(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.ll(), iIlIlII.III(), iIlIlII.Il(), n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlllIl(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        if ((n >>> 24 & 0xFF) <= 0) {
            return;
        }
        IIlIlII iIlIlII = IIIlI.IIlllI(d, d2, d3, d4, d5, 1.0);
        if (!iIlIlII.l()) {
            return;
        }
        if (iIlIlII.Il() <= 0.0) {
            IIIlI.lIlIlI(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.ll(), iIlIlII.III(), iIlIlII.I(), n);
            return;
        }
        IIIlIIllI.l(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.ll(), iIlIlII.III(), iIlIlII.Il(), iIlIlII.I(), n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void IllllI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        if ((n >>> 24 & 0xFF) <= 0) {
            return;
        }
        IIlIlII iIlIlII = IIIlI.IIlllI(d, d2, d3, d4, d5, 1.0);
        if (!iIlIlII.l()) {
            return;
        }
        IIIlIIllI.l(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.ll(), iIlIlII.III(), iIlIlII.Il(), iIlIlII.I(), n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void Illlll(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        if (drawContext == null || (n >>> 24 & 0xFF) <= 0 || d5 <= 0.0) {
            return;
        }
        double d6 = d3 - d;
        double d7 = d4 - d2;
        double d8 = Math.hypot(d6, d7);
        if (!Double.isFinite(d8) || d8 < 0.001) {
            return;
        }
        IIIlI.lIlIIl(drawContext);
        try {
            IIIlI.Ill(drawContext, d, d2);
            IIIlI.IIlII(drawContext, Math.toDegrees(Math.atan2(d7, d6)));
            IIIlIIllI.lIll(drawContext, 0.0, d5 * -0.5, d8, d5, 0.0, n);
        }
        finally {
            IIIlI.IlIllI(drawContext);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIIIII(DrawContext drawContext) {
        Deque<IlIllllI> deque = IIl.get();
        if (drawContext == null) {
            deque.clear();
            return;
        }
        while (!deque.isEmpty()) {
            deque.pop();
            drawContext.disableScissor();
        }
    }

    public static void lIIIIl(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2) {
        IIIlI.IlIIlI(drawContext, d, d2, d3, d4, d5, n, n2, true, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIIIlI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, double d6, int n) {
        if ((n >>> 24 & 0xFF) <= 0) return;
        if (!(d6 <= 0.0)) {
            IIlIlII iIlIlII = IIIlI.IIlllI(d, d2, d3, d4, d5, d6);
            if (!iIlIlII.l()) {
                return;
            }
            IIIlIIllI.lIlI(drawContext, iIlIlII.lI(), iIlIlII.II(), iIlIlII.ll(), iIlIlII.III(), iIlIlII.Il(), iIlIlII.I(), n);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void lIIIll(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, int n) {
        block2: {
            block1: {
                if (!llllIII.lIl()) break block1;
                break block2;
            }
            Text text = Interface.lI(string);
            IIIlI.IIIllI(drawContext, textRenderer, text, d - (double)IIIlI.IIIll(textRenderer, text) / 2.0, d2 - IIIlI.IllIII(textRenderer) / 2.0, n, true);
            return;
        }
        IIIlI.lllll(drawContext, textRenderer, string, d - (double)IIIlI.IIIlll(textRenderer, string) / 2.0, d2 - IIIlI.IllIII(textRenderer) / 2.0, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lIIlII(int n, Text text) {
        int n2 = n >>> 24 & 0xFF;
        if (n2 <= 0) return false;
        if ((n & 0xFFFFFF) == 0) return false;
        if (text == null) return false;
        if (text.getString().isEmpty()) {
            return false;
        }
        Boolean bl = I.get();
        if (bl == null) {
            return false;
        }
        if (bl == false) return false;
        if (!Interface.IIIII()) return false;
        return true;
    }

    public static double lIIlIl() {
        return II.l();
    }

    public static void lIIllI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5) {
        double d6 = d4 * IllIlIl.ll(d5, 0.0, 1.0);
        IIIlI.llII(drawContext, d, d2, d + d3, d2 + d6);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIIlll(DrawContext drawContext, double d, double d2, double d3, double d4, int n) {
        int n2 = (int)Math.floor(Math.min(d, d3));
        int n3 = (int)Math.floor(Math.min(d2, d4));
        int n4 = (int)Math.ceil(Math.max(d, d3));
        int n5 = (int)Math.ceil(Math.max(d2, d4));
        if (n4 <= n2) return;
        if (n5 <= n3) {
            return;
        }
        drawContext.fill(n2, n3, n4, n5, n);
    }

    private static double lIlIII(double d) {
        double d2 = Math.max(0.0, Math.min(1.0, d));
        return d2 * d2 * (3.0 - 2.0 * d2);
    }

    public static void lIlIIl(DrawContext drawContext) {
        IIIlIIllI.IlIll(drawContext);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIlIlI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n) {
        if ((n >>> 24 & 0xFF) <= 0) return;
        if (d3 <= 0.0) return;
        if (d4 <= 0.0) return;
        if (d5 <= 0.0) {
            return;
        }
        double d6 = Math.min(d5, Math.min(d3, d4) * 0.5);
        IIIlI.lIIlll(drawContext, d, d2, d + d3, d2 + d6, n);
        IIIlI.lIIlll(drawContext, d, d2 + d4 - d6, d + d3, d2 + d4, n);
        double d7 = d2 + d6;
        double d8 = d2 + d4 - d6;
        if (!(d8 <= d7)) {
            IIIlI.lIIlll(drawContext, d, d7, d + d6, d8, n);
            IIIlI.lIIlll(drawContext, d + d3 - d6, d7, d + d3, d8, n);
            return;
        }
    }

    public static void lIlIll(DrawContext drawContext, TextRenderer textRenderer, Text text, double d, double d2, int n) {
        IIIlI.IIIllI(drawContext, textRenderer, Interface.lll(text), d, d2, n, false);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static Method lIllII() {
        Method[] methodArray = DrawContext.class.getMethods();
        int n = methodArray.length;
        int n2 = 0;
        while (n2 < n) {
            Method method = methodArray[n2];
            Class<?>[] classArray = method.getParameterTypes();
            if (classArray.length == 6 && classArray[0] == TextRenderer.class && classArray[1] == Text.class && classArray[2] == Integer.TYPE && classArray[3] == Integer.TYPE && classArray[4] == Integer.TYPE) {
                if (classArray[5] == Boolean.TYPE) return method;
            }
            ++n2;
        }
        return null;
    }

    public static void lIllIl(DrawContext drawContext, Identifier identifier, double d, double d2, double d3, double d4, int n) {
        if ((n >>> 24 & 0xFF) > 0) {
            IIIlIIllI.lIlII(drawContext, identifier, (int)Math.round(d), (int)Math.round(d2), (int)Math.round(d3), (int)Math.round(d4), n);
            return;
        }
    }

    public static void lIlllI(DrawContext drawContext) {
        IIIlI.lIllll(drawContext);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIllll(DrawContext drawContext) {
        if (drawContext == null) {
            return;
        }
        Deque<IlIllllI> deque = IIl.get();
        if (!deque.isEmpty()) {
            deque.pop();
            drawContext.disableScissor();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void llIIII(DrawContext drawContext, double d, double d2, double d3, double d4, int n, int n2) {
        int n3 = (int)Math.floor(Math.min(d, d3));
        int n4 = (int)Math.floor(Math.min(d2, d4));
        int n5 = (int)Math.ceil(Math.max(d, d3));
        int n6 = (int)Math.ceil(Math.max(d2, d4));
        if (n5 <= n3) return;
        if (n6 > n4) {
            drawContext.fillGradient(n3, n4, n5, n6, n, n2);
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static String llIIIl(TextRenderer var0, String var1_1, double var2_2) {
        block16: {
            block19: {
                block18: {
                    block17: {
                        block15: {
                            block21: {
                                block13: {
                                    block14: {
                                        block20: {
                                            if (var0 == null) break block19;
                                            break block20;
lbl3:
                                            // 1 sources

                                            while (true) {
                                                var7_6 = var7_6.substring(0, var7_6.length() - 1).trim();
                                                break block13;
                                                break;
                                            }
lbl6:
                                            // 1 sources

                                            return "";
lbl8:
                                            // 1 sources

                                            while (true) {
                                                var10_9 = var5_4;
                                                var9_8 = var7_6;
                                                v0 = var9_8 + var10_9;
                                                break block14;
                                                break;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                if (!((double)var6_5 > var2_2)) break block15;
                                                ** continue;
                                                break;
                                            }
lbl16:
                                            // 1 sources

                                            while (true) {
                                                v1 = "";
                                                break block16;
                                                break;
                                            }
lbl19:
                                            // 1 sources

                                            while (true) {
                                                v0 = var5_4;
                                                break block14;
                                                break;
                                            }
lbl22:
                                            // 1 sources

                                            return var4_3;
lbl24:
                                            // 1 sources

                                            while (var1_1 == null) {
                                                ** continue;
lbl26:
                                                // 1 sources

                                                ** GOTO lbl16
                                            }
                                            break block21;
                                            while (true) {
                                                break block17;
                                                break;
                                            }
lbl30:
                                            // 1 sources

                                            while (true) {
                                                if (!((double)IIIlI.IIIlll(var0, var4_3) <= var2_2)) ** continue;
                                                ** continue;
                                                break;
                                            }
                                        }
                                        if (!(var2_2 <= 0.0)) ** GOTO lbl24
                                        break block19;
                                    }
                                    return v0;
lbl38:
                                    // 1 sources

                                    while (true) {
                                        var9_8 = var5_4;
                                        var8_7 = var7_6;
                                        v2 = new StringBuilder();
                                        if ((double)IIIlI.IIIlll(var0, v2.append((Object)var8_7).append((Object)var9_8).toString()) > var2_2) {
                                            ** continue;
                                        }
                                        break block18;
                                        break;
                                    }
                                }
lbl46:
                                // 2 sources

                                while (!var7_6.isEmpty()) {
                                    ** continue;
lbl48:
                                    // 1 sources

                                    ** GOTO lbl38
                                }
                                break block18;
                            }
                            v1 = var1_1;
                            break block16;
                        }
                        var7_6 = var0.trimToWidth(var4_3, Math.max(0, (int)Math.floor(var2_2 - (double)var6_5))).trim();
                        ** GOTO lbl46
                    }
                    var5_4 = "...";
                    var6_5 = IIIlI.IIIlll(var0, var5_4);
                    ** while (true)
                }
                ** while (!var7_6.isEmpty())
lbl62:
                // 1 sources

                ** while (true)
            }
            return "";
        }
        var4_3 = v1;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int llIIlI(Color color, Color color2, double d) {
        Color color3 = color == null ? Color.WHITE : color;
        Color color4 = color2 != null ? color2 : Color.WHITE;
        double d2 = Math.max(0.0, Math.min(1.0, d));
        int n = (int)Math.round((double)color3.getRed() + (double)(color4.getRed() - color3.getRed()) * d2);
        int n2 = (int)Math.round((double)color3.getGreen() + (double)(color4.getGreen() - color3.getGreen()) * d2);
        int n3 = (int)Math.round((double)color3.getBlue() + (double)(color4.getBlue() - color3.getBlue()) * d2);
        return (n & 0xFF) << 16 | (n2 & 0xFF) << 8 | n3 & 0xFF;
    }

    public static double llIIll() {
        return Math.max(6.0, II.I() - II.II());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String llIlII(String string, String string2) {
        String string3 = IIIlI.Il(string, string2).trim();
        if (string3.isEmpty()) return "";
        String string4 = "]";
        String string5 = string3;
        String string6 = "[";
        String string7 = string6 + string5 + string4;
        return string7;
    }

    public static void llIlIl(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, double d3, int n) {
        IIIlI.lllll(drawContext, textRenderer, string, d, d2 + (d3 - IIIlI.IllIII(textRenderer)) / 2.0, n);
    }

    public static void llIllI(DrawContext drawContext, double d, double d2, double d3, double d4, int n, int n2) {
        IIIlI.lIIlll(drawContext, d, d2, d + d3, d2 + d4, n2);
        IIIlI.lIIlll(drawContext, d + 1.0, d2 + 1.0, d + d3 - 1.0, d2 + d4 - 1.0, n);
    }

    public static void llIlll(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, double d3, double d4, int n) {
        IIIlI.lIIll(drawContext, textRenderer, string, d + d3 / 2.0, d2 + d4 / 2.0, n);
    }

    public static void lllIII(Boolean bl, Runnable runnable) {
        Boolean bl2 = IIIlI.lIl(bl);
        try {
            if (runnable != null) {
                runnable.run();
            }
        }
        finally {
            IIIlI.IlIll(bl2);
        }
    }

    private static int lllIIl(int n, int n2) {
        return lII[n ^ 0xA4D09885] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lllIlI(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x44D4;
        char[] cArray = lIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIlI.llI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2870;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 52847;
            n6 ^= 0x5951;
            n6 += 12258;
            n6 ^= 0xC6C0;
            n6 -= 11077;
            cArray[n5] = (char)((n6 += 48946) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

