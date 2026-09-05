/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
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

@Environment(value=EnvType.CLIENT)
final class IIlIlIll
extends Enum<IIlIlIll> {
    public static final /* enum */ IIlIlIll I;
    public static final /* enum */ IIlIlIll l;
    public static final /* enum */ IIlIlIll II;
    public static final /* enum */ IIlIlIll Il;
    public static final /* enum */ IIlIlIll lI;
    public static final /* enum */ IIlIlIll ll;
    private static final /* synthetic */ IIlIlIll[] III;
    private static final int[] IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 2704;
        var7_2 = "\u9ad0\u9a6a\u9aba\u9a21\u3139\u318c\u3143\u31c4\u31b5\u3199\u31f4\u31d9\u3116\u31ac\u31e5\u928e\u922c\u92f4\u9273\u9211\u9226\u9248\u9261\u92a9\u9217\u67c1\u6774\u67bb\u673c\u674d\u6761\u670c\u6721\u67e2\u674d\u671b\u6744\u9cd6\u9c74\u9cac\u9c2b\u9c49\u9c7e\u9c10\u9c35\u9ce8\u9c49\u9c1b\uaf1b\uafb9\uaf61\uafe6\uaf84\uafb3\uafdd\uafe4\uaf31\uaf82\uafc6\uaf8f\uaf12";
        var8_3 = "\u0004\u000b\n\f\u000b\r".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl22
        while (true) {
            IIlIlIll.IlI = var9_4;
            IIlIlIll.Ill = new Object[var9_4.length];
            var2_12 = -2095674588;
            var0_11 = "\u00d2\u00d2\u0005`".getBytes("ISO-8859-1");
            var1_13 = var0_11.length / 4;
            IIlIlIll.IIl = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            if (true) ** GOTO lbl67
            break;
        }
        while (true) {
            block15: {
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 < var8_3.length) break block15;
                var13_8 = 0;
lbl22:
                // 2 sources

                var10_5 = 0;
                var11_6 = 0;
                var12_7 = '\u0000';
                if (var13_8 == 0) ** continue;
            }
            var12_7 = var8_3[var10_5];
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            if (true) ** GOTO lbl36
            break;
        }
        block9: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) ** continue;
lbl36:
            // 2 sources

            switch (var15_10 % 6) {
                case 1: {
                    v0 = 4;
                    continue block9;
                }
                case 5: {
                    v0 = 76;
                    continue block9;
                }
                default: {
                    v0 = 9;
                    continue block9;
                }
                case 4: {
                    v0 = 78;
                    continue block9;
                }
                case 3: {
                    v0 = 108;
                    continue block9;
                }
                case 2: 
            }
            v0 = 67;
        }
        while (true) {
            IIlIlIll.IIl[var4_15] = var5_16 ^= var2_12;
            var3_14 += 4;
            if (++var4_15 >= var1_13) {
                IIlIlIll.lI = new IIlIlIll();
                IIlIlIll.l = new IIlIlIll();
                IIlIlIll.II = new IIlIlIll();
                IIlIlIll.ll = new IIlIlIll();
                IIlIlIll.I = new IIlIlIll();
                IIlIlIll.Il = new IIlIlIll();
                IIlIlIll.III = IIlIlIll.I();
                return;
            }
lbl67:
            // 3 sources

            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
        }
    }

    private static /* synthetic */ IIlIlIll[] I() {
        return new IIlIlIll[]{lI, l, II, ll, I, Il};
    }

    public static IIlIlIll[] values() {
        return (IIlIlIll[])III.clone();
    }

    public static IIlIlIll valueOf(String string) {
        return Enum.valueOf(IIlIlIll.class, string);
    }

    private static int l(int n, int n2) {
        return IIl[n ^ 0x971E2C63] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String II(int var0, int var1_1) {
        var3_2 = var0 ^ 897126319;
        var4_4 = IIlIlIll.IlI[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])IIlIlIll.Ill[var3_2];
        if (var2_3 != null) {
            var5_5 = var2_3;
        } else {
            var5_5 = new Throwable().getStackTrace();
            IIlIlIll.Ill[var3_2] = var5_5;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -1510006166;
        var8_8 = 0;
        if (true) ** GOTO lbl17
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) {
                return new String(var4_4).intern();
            }
lbl17:
            // 3 sources

            switch (var8_8 & 31) {
                case 16: {
                    var9_9 = 178;
                    continue block33;
                }
                case 24: {
                    var9_9 = 149;
                    continue block33;
                }
                default: {
                    var9_9 = 24;
                    continue block33;
                }
                case 14: {
                    var9_9 = 177;
                    continue block33;
                }
                case 5: {
                    var9_9 = 255;
                    continue block33;
                }
                case 11: {
                    var9_9 = 205;
                    continue block33;
                }
                case 27: {
                    var9_9 = 151;
                    continue block33;
                }
                case 31: {
                    var9_9 = 98;
                    continue block33;
                }
                case 15: {
                    var9_9 = 249;
                    continue block33;
                }
                case 3: {
                    var9_9 = 128;
                    continue block33;
                }
                case 10: {
                    var9_9 = 150;
                    continue block33;
                }
                case 12: {
                    var9_9 = 20;
                    continue block33;
                }
                case 26: {
                    var9_9 = 211;
                    continue block33;
                }
                case 8: {
                    var9_9 = 108;
                    continue block33;
                }
                case 22: {
                    var9_9 = 194;
                    continue block33;
                }
                case 17: {
                    var9_9 = 134;
                    continue block33;
                }
                case 29: {
                    var9_9 = 11;
                    continue block33;
                }
                case 13: {
                    var9_9 = 148;
                    continue block33;
                }
                case 4: {
                    var9_9 = 194;
                    continue block33;
                }
                case 6: {
                    var9_9 = 192;
                    continue block33;
                }
                case 25: {
                    var9_9 = 156;
                    continue block33;
                }
                case 21: {
                    var9_9 = 147;
                    continue block33;
                }
                case 30: {
                    var9_9 = 139;
                    continue block33;
                }
                case 18: {
                    var9_9 = 23;
                    continue block33;
                }
                case 2: {
                    var9_9 = 61;
                    continue block33;
                }
                case 23: {
                    var9_9 = 104;
                    continue block33;
                }
                case 28: {
                    var9_9 = 211;
                    continue block33;
                }
                case 9: {
                    var9_9 = 224;
                    continue block33;
                }
                case 20: {
                    var9_9 = 238;
                    continue block33;
                }
                case 19: {
                    var9_9 = 128;
                    continue block33;
                }
                case 7: {
                    var9_9 = 250;
                    continue block33;
                }
                case 1: 
            }
            var9_9 = 162;
        }
    }
}

