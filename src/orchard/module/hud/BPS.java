/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlII
 * Module         : BPS  [HUD]
 * Description    : Shows movement speed in blocks per second in a small HUD cell.   (client's own text)
 *
 * Recovered strings in this class:
 *   - ), 18.0, 0.0, 4000.0, 1.0).IIIl(
 *   - ), 99.0, 0.0, 4000.0, 1.0).IIIl(
 *   - .getBytes(
 *   - Scale
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.hud;

import java.util.Locale;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlI;
import orchard.internal.IIIllIII;
import orchard.internal.IlIIIIll;
import orchard.internal.lIlIIlI;
import orchard.internal.lllIlIII;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class BPS
extends ModuleBase
implements lllIlIII {
    private static final IIIllIII I;
    private static final double l = 7.0;
    private static final double II = 4.0;
    private final lIlIIlI Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("X"), 18.0, 0.0, 4000.0, 1.0).IIIl("px"));
    private double lI;
    private final lIlIIlI ll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y"), 99.0, 0.0, 4000.0, 1.0).IIIl("px"));
    private static final double III = 18.0;
    private final lIlIIlI IIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 100.0, 75.0, 200.0, 5.0).IIIl("%"));
    private static String[] IlI;
    private static final int[] Ill;
    private static final String[] lII;
    private static final Object[] lIl;

    @Override
    public double IIll() {
        return 18.0 * this.IIl();
    }

    @Override
    public void lllI(double d, double d2) {
        this.Il.lI(Math.max(0.0, d));
        this.ll.lI(Math.max(0.0, d2));
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        this.IlI(drawContext, false);
    }

    private double I(TextRenderer textRenderer, String string) {
        return 14.0 + (double)IIIlI.IIIlll(textRenderer, "bps") + 4.0 + (double)IIIlI.IIIlll(textRenderer, string);
    }

    private String lI() {
        return String.format(Locale.ROOT, "%.2f", this.lI);
    }

    private double IIl() {
        return (Double)this.IIl.lIl() / 100.0;
    }

    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null) {
            if (minecraftClient.player != null) {
                Vec3d vec3d = minecraftClient.player.getVelocity();
                this.lI = Math.hypot(vec3d.x, vec3d.z) * 20.0;
                return;
            }
        }
        this.lI = 0.0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IlI(DrawContext drawContext, boolean bl) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (drawContext == null || minecraftClient == null || minecraftClient.textRenderer == null) {
            return;
        }
        double d = this.IIl();
        double d2 = this.IlII();
        double d3 = this.IlIl();
        TextRenderer textRenderer = minecraftClient.textRenderer;
        String string = "bps";
        String string2 = this.lI();
        double d4 = this.I(textRenderer, string2);
        IIIlI.lIlIIl(drawContext);
        IIIlI.Ill(drawContext, d2, d3);
        IIIlI.IIlll(drawContext, d, d);
        try {
            IlIIIIll.l(drawContext, I, 0.0, 0.0, d4, 18.0, bl);
            double d5 = 7.0;
            double d6 = d5 + (double)IIIlI.IIIlll(textRenderer, string) + 4.0;
            Objects.requireNonNull(textRenderer);
            double d7 = (18.0 - 9.0) * 0.5;
            IIIlI.lllIII(true, () -> IIIlI.IlIIll(drawContext, textRenderer, string, d5, d7, IlIIIIll.II(245)));
            IIIlI.IlIIll(drawContext, textRenderer, string2, d6, d7, IlIIIIll.II(245));
        }
        finally {
            IIIlI.IlIllI(drawContext);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 9680;
        String string = "\u85c8\u5a3f\u225c\ua39f\u3203\u02d4\u8258\uda3c\uff68\u1296\ub861\u150d\u8824\u0aa4\ucba3\u67b2\uaf36\u5056\ua49b\u2df1\u9795\uf885\uf009\u5b8e\u6597\uaa42\u0367\u8776\ufbeb\u65b1\u5899\u55a2\u0296\u7d45\ud482\uf938\u5733\udd0c\ucb93\u9f4a\u623d\uc176\uaea6\uf87f\u9020\u04e1\u8e60\udca1\ube79\uc7f7\ufac1\u62de\u76bc\u1e92\u4538\u6b36\uea49\u8124\uea9c\ueacf\u1861\u3a85\uf01e\u5015\u841a\ucebb\ueed4\u1b39\u1c33\u28a7\uec3a\uaa2c\uc269\u83b6\u2d9e\u7d00\uec03\uff0e\ua9df\u0b6a\u4604\u5fa8\u2f0a\ude81\ua525\u6a62\u35e0\u7510\u77f1\u6efe\uba3b\u1582\u7ca7\u8142\ufe2b\uf3dd\u7ac8\uff34\u4445\uc173\ud4b5\udc4e\u87b6\u0ed4\ub53e\ufe9d\ua7d0\u344a\u9e20\u21fb\u1e7d\ud569\u51de\u330e\u70a8\ub947\ub5c4\uc212\u5d58\u3245\u86c3\uae0d\u3fea\udd4b";
        char[] cArray = "\u25d4\u25d4\u25d4\u25d4\u25d8\u25d4\u2584\u25d4\u25d8".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        lII = stringArray;
        lIl = new Object[stringArray.length];
        int n6 = 1128366672;
        byte[] byArray = "\u001d\u00d89\b<\u00bd*\u00ce\u0082\u00cd\u0090\u00c6\u0089nA\u00f4f|\u0012\u009e\u00d9\u00f0\u00fe#)k\u0094\u0013\u00a8\u00d8\u009c\u00be\u00bf\u0095J\u0082\u00a4\u00f8n0\u000e\u00dbA\u0015\u00e4\u001e@\u00f1\u001e\u001f\\'\u00a7\u008d03\u00a9\u0011\u00e5c\u0083,/K\u00e9ppv\u0017\u00c2\u00f3\u00de\u000bB5;\u0019Q@\u00afp\u00ddU~".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        Ill = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            BPS.Ill[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        IlI = new String[9];
        BPS.lII();
        I = IIIllIII.ll;
    }

    @Override
    public double IlIl() {
        return (Double)this.ll.lIl();
    }

    @Override
    public void llII(DrawContext drawContext, int n, int n2, float f, boolean bl) {
        this.IlI(drawContext, bl);
    }

    private static void lII() {
        BPS.IlI[0] = BPS.lIl(BPS.IIlI(855918389, (short)12873, '\u79f0').toCharArray(), 74382L, 1319612517);
        BPS.IlI[1] = BPS.lIl(BPS.IIlI(675637308, (short)65235, '\u79f1').toCharArray(), 65515L, -390103038);
        BPS.IlI[2] = BPS.lIl(BPS.IIlI(-66245699, (short)44461, '\u79f2').toCharArray(), 85075L, -1132092037);
        BPS.IlI[3] = BPS.lIl(BPS.IIlI(-512068043, (short)45542, '\u79f3').toCharArray(), 29011L, 1590413825);
        BPS.IlI[4] = BPS.lIl(BPS.IIlI(725618371, (short)26052, '\u79f4').toCharArray(), 53517L, -124749777);
        BPS.IlI[5] = BPS.lIl(BPS.IIlI(59512406, (short)20644, '\u79f5').toCharArray(), 79470L, -777548011);
        BPS.IlI[6] = BPS.lIl(BPS.IIlI(2032011674, (short)7229, '\u79f6').toCharArray(), 75335L, 1599691391);
        BPS.IlI[7] = BPS.lIl(BPS.IIlI(-482001098, (short)38697, '\u79f7').toCharArray(), 94095L, 985987473);
        BPS.IlI[8] = BPS.lIl(BPS.IIlI(-450881744, (short)24769, '\u79f8').toCharArray(), 9100L, -2035451825);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean Illl(double d, double d2) {
        if (!(d >= this.IlII())) return false;
        if (!(d <= this.IlII() + this.III())) return false;
        if (!(d2 >= this.IlIl())) return false;
        if (!(d2 <= this.IlIl() + this.IIll())) return false;
        return true;
    }

    @Override
    public double III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null) {
            if (minecraftClient.textRenderer != null) {
                return this.I(minecraftClient.textRenderer, this.lI()) * this.IIl();
            }
        }
        return 48.0 * this.IIl();
    }

    @Override
    public void lIII(DrawContext drawContext, int n, int n2, float f) {
        this.IlI(drawContext, false);
    }

    private static String lIl(char[] cArray, long l2, int n) {
        int n2 = 0x7BE7811 ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & 0xFF;
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    public BPS() {
        super(StringFactory.IIII("BPS"), Category.I, StringFactory.IIII("Shows movement speed in blocks per second in a small HUD cell."));
    }

    @Override
    public double IlII() {
        return (Double)this.Il.lIl();
    }

    private static int IIII(int n, int n2) {
        return Ill[n ^ 0xA468EA3D] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlI(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x79F0;
        char[] cArray = lII[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIl[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            BPS.lIl[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2D57;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xE567;
            n6 += 41721;
            n6 -= 15866;
            n6 -= 57702;
            n6 -= 11895;
            cArray[n5] = (char)((n6 ^= 0x7632) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

