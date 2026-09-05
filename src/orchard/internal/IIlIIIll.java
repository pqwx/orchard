/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Sound Only
 *   - .getBytes(
 *   - SuicideX
 *   - Default
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
public final class IIlIIIll
extends Enum<IIlIIIll> {
    public static final /* enum */ IIlIIIll I;
    public static final /* enum */ IIlIIIll l;
    private static String[] II;
    private final double Il;
    private final IIIlIIIII lI;
    private static final /* synthetic */ IIlIIIll[] ll;
    private final long III;
    public static final /* enum */ IIlIIIll IIl;
    private static final int[] IlI;
    private static final String[] Ill;
    private static final Object[] lII;

    public String toString() {
        return this.lI.IIII();
    }

    public static IIlIIIll I(String string) {
        return Enum.valueOf(IIlIIIll.class, string);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 30452;
        var7_2 = "\uc118\uc18e\u5c8b\u0575\u2ce1\u6e56\u8e28\ue87c\ud3b4\ucf27\u37c8\u001d\ua147\u66e6\u0481\uc528\u728c\u3382\u8429\ud0df\ubd91\uc2b0\u2f13\ud896\u4653\u3048\ue238\u2322\u2a46\u28dd\u8485\uec16\ub1f4\ucc29\u22de\u1b59\u587f\u6aed\u063d\u077e\uc49a\ubc6c\u37b9\ue13d\u99c5\u3640\u8537\u6595\u0ba0\uf627\uc3da\u55fb\u5ed6\u5594\u2589\u83f4\u8dda\u8d07\u4c95\uf6df\uf76c\ufcc4\u4e1b\uc953\u737f\uec0b";
        var8_3 = "\n\f\f\t\u0007\u0010".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl9
lbl7:
        // 1 sources

        while (true) {
            var13_8 = 0;
lbl9:
            // 2 sources

            var10_5 = 0;
            var11_6 = 0;
            var12_7 = '\u0000';
            if (var13_8 == 0) {
                IIlIIIll.Ill = var9_4;
                IIlIIIll.lII = new Object[var9_4.length];
                var2_13 = -1187326316;
                var0_11 = "RE\u0092\u00db\u00d3i\u00bd\u00b4\u00aa7C\u0090\u00feo\f\u00b0l\u00d9~\u00bd\u00f7D\u00b8\u00ab\u00df[\u00fe\u00f8X\u009cA\u00b7\u00eb\u008eO\u0082".getBytes("ISO-8859-1");
                var1_12 = var0_11.length / 4;
                IIlIIIll.IlI = new int[var1_12];
                var3_14 = 0;
                var4_15 = 0;
                do {
                    var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                    IIlIIIll.IlI[var4_15] = var5_16 ^= var2_13;
                    var3_14 += 4;
                } while (++var4_15 < var1_12);
                IIlIIIll.II = new String[6];
                IIlIIIll.II();
                IIlIIIll.l = new IIlIIIll("Default", 250L, 2.0);
                IIlIIIll.IIl = new IIlIIIll("SuicideX", 200L, 2.0);
                IIlIIIll.I = new IIlIIIll("Sound Only", 0L, 0.0);
                IIlIIIll.ll = IIlIIIll.lI();
                return;
            }
            while (true) {
                var12_7 = var8_3[var10_5];
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl47
                break;
            }
            break;
        }
        block9: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) {
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 < var8_3.length) ** continue;
                ** continue;
            }
lbl47:
            // 3 sources

            switch (var15_10 % 5) {
                case 1: {
                    v0 = 16;
                    continue block9;
                }
                default: {
                    v0 = 84;
                    continue block9;
                }
                case 3: {
                    v0 = 80;
                    continue block9;
                }
                case 4: {
                    v0 = 65;
                    continue block9;
                }
                case 2: 
            }
            v0 = 45;
        }
    }

    public static IIlIIIll[] values() {
        return (IIlIIIll[])ll.clone();
    }

    private IIlIIIll(String string2, long l2, double d) {
        this.lI = StringFactory.lIl(string2);
        this.III = l2;
        this.Il = d;
    }

    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0xF032F76D ^ n;
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

    private static void II() {
        IIlIIIll.II[0] = IIlIIIll.l(IIlIIIll.IIl((short)55517, '\u0990', 1942632282).toCharArray(), 60837L, -180456873);
        IIlIIIll.II[1] = IIlIIIll.l(IIlIIIll.IIl((short)3513, '\u0991', 1606180182).toCharArray(), 55398L, -1707013314);
        IIlIIIll.II[2] = IIlIIIll.l(IIlIIIll.IIl((short)14720, '\u0992', -222537761).toCharArray(), 43249L, -1747533311);
        IIlIIIll.II[3] = IIlIIIll.l(IIlIIIll.IIl((short)57603, '\u0993', 692933846).toCharArray(), 74274L, -1277834615);
        IIlIIIll.II[4] = IIlIIIll.l(IIlIIIll.IIl((short)49600, '\u0994', -854429826).toCharArray(), 83488L, -885290876);
        IIlIIIll.II[5] = IIlIIIll.l(IIlIIIll.IIl((short)33453, '\u0995', -1203288197).toCharArray(), 21227L, 1458994590);
    }

    public long Il() {
        return this.III;
    }

    private static /* synthetic */ IIlIIIll[] lI() {
        return new IIlIIIll[]{l, IIl, I};
    }

    public double ll() {
        return this.Il;
    }

    private static int III(int n, int n2) {
        return IlI[n ^ 0x31884C6F] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(short s, char c, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x990;
        char[] cArray = Ill[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lII[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlIIIll.lII[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x35AD;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 19416;
            n6 ^= 0x21EC;
            n6 += 48554;
            n6 -= 44928;
            n6 ^= 0x7E21;
            n6 ^= 0xDF0;
            cArray[n5] = (char)((n6 -= 32618) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

