/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Hitbox
 *   - Middle
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
final class IlIlIIl
extends Enum<IlIlIIl> {
    public static final /* enum */ IlIlIIl I;
    public static final /* enum */ IlIlIIl l;
    private final IIIlIIIII II;
    private static String[] Il;
    private static final /* synthetic */ IlIlIIl[] lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    private static void I() {
        IlIlIIl.Il[0] = IlIlIIl.Il(IlIlIIl.ll(-1707532776, 709, 1619).toCharArray(), 30639L, -380856514);
        IlIlIIl.Il[1] = IlIlIIl.Il(IlIlIIl.ll(-948290634, 19524, 1618).toCharArray(), 44599L, 809394346);
        IlIlIIl.Il[2] = IlIlIIl.Il(IlIlIIl.ll(1542537593, 30544, 1617).toCharArray(), 55079L, -1356339066);
        IlIlIIl.Il[3] = IlIlIIl.Il(IlIlIIl.ll(-957337752, 4971, 1616).toCharArray(), 8208L, 466770579);
    }

    public static IlIlIIl l(String string) {
        return Enum.valueOf(IlIlIIl.class, string);
    }

    private IlIlIIl(String string2) {
        this.II = StringFactory.lIl(string2);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 1902;
        var7_3 = "\ue84a\u815c\ued0b\u41fa\uab62\uff75\u5659\u4f82\u739c\u1416\u6971\u32aa\u95ac\u6696\ucf03\u4510\uca24\uf238\u826a\u0952\u9299\u7604\u6a64\u5456\uba7d\u7e48\u7eed\u653b";
        var8_4 = "\u0006\u0006\b\b".toCharArray();
        var9_5 = new String[var8_4.length];
        var13_9 = -1;
lbl6:
        // 2 sources

        while (true) {
            var10_6 = 0;
            var11_7 = 0;
            var12_8 = '\u0000';
            if (var13_9 != 0) ** GOTO lbl44
            IlIlIIl.III = var9_5;
            IlIlIIl.IIl = new Object[var9_5.length];
            var2_2 = -1545395961;
            var0_12 = "\u00e2\u001e\u00ef\u0019\u00b1\u0014\u00c5\u00b4\u00d1\u009d\u00c3|\u00aaHq\u00d4+\u009b[`\u00bc|i<".getBytes("ISO-8859-1");
            var1_13 = var0_12.length / 4;
            IlIlIIl.ll = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            if (true) ** GOTO lbl52
            break;
        }
lbl-1000:
        // 2 sources

        {
            switch (var15_11 % 5) {
                case 3: {
                    v0 = 43;
                    break;
                }
                case 4: {
                    v0 = 59;
                    break;
                }
                case 2: {
                    v0 = 40;
                    break;
                }
                case 1: {
                    v0 = 82;
                    break;
                }
                default: {
                    v0 = 80;
                }
            }
            var16_1 = v0;
            v1 = var15_11++;
            var14_10[v1] = (char)(var14_10[v1] ^ var16_1 ^ var6);
            if (var15_11 < var14_10.length) continue;
            var9_5[var10_6] = new String(var14_10).intern();
            var11_7 += var12_8;
            if (++var10_6 >= var8_4.length) {
                var13_9 = 0;
                ** continue;
            }
lbl44:
            // 3 sources

            var12_8 = var8_4[var10_6];
            var14_10 = var7_3.substring(var11_7, var11_7 + var12_8).toCharArray();
            var15_11 = 0;
            ** while (true)
        }
        while (true) {
            IlIlIIl.ll[var4_15] = var5_16 ^= var2_2;
            var3_14 += 4;
            if (++var4_15 >= var1_13) break;
lbl52:
            // 2 sources

            var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
        }
        IlIlIIl.Il = new String[4];
        IlIlIIl.I();
        IlIlIIl.l = new IlIlIIl("Hitbox");
        IlIlIIl.I = new IlIlIIl("Middle");
        IlIlIIl.lI = IlIlIIl.II();
    }

    private static /* synthetic */ IlIlIIl[] II() {
        return new IlIlIIl[]{l, I};
    }

    private static String Il(char[] cArray, long l2, int n) {
        int n2 = 0x1A98ADE5 ^ n;
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

    public String toString() {
        return this.II.IIII();
    }

    public static IlIlIIl[] values() {
        return (IlIlIIl[])lI.clone();
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0x788B1D5E] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2, int n3) {
        StackTraceElement[] stackTraceElementArray;
        int n4 = n3 ^ 0x653;
        char[] cArray = III[n4].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n4];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            IlIlIIl.IIl[n4] = stackTraceElementArray = new Throwable().getStackTrace();
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n5 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2E02;
        int n6 = 0;
        do {
            int n7 = n6++;
            int n8 = cArray[n7] + 52868;
            n8 -= 61489;
            n8 ^= 0x871F;
            n8 -= 29955;
            n8 -= 22326;
            cArray[n7] = (char)((n8 ^= 0x9B84) ^ n5 ^ n2 ^ n >> 16);
        } while (n6 < cArray.length);
        return new String(cArray).intern();
    }
}

