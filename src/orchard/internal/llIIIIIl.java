/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIIIIl
 * Purpose not identified - name is the original obfuscated one.
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
final class llIIIIIl
extends Enum<llIIIIIl> {
    private static final /* synthetic */ llIIIIIl[] I;
    public static final /* enum */ llIIIIIl l;
    public static final /* enum */ llIIIIIl II;
    public static final /* enum */ llIIIIIl Il;
    public static final /* enum */ llIIIIIl lI;
    private static final String[] ll;
    private static final Object[] III;

    private static /* synthetic */ llIIIIIl[] I() {
        return new llIIIIIl[]{l, lI, Il, II};
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 15928;
        String string = "\uc195\uc1ef\uc1a3\uc178\uc1b4\ue69f\ue6ed\ue6b3\ue673\ue6af\ue6f8\ue630\ue6a5\ue69c\ue699\ua291\ua2f1\ua2a5\ua27a\ua2b3\ua2e8\u1710\u176c\u1737\u17fa\u1721\u1774\u17b6\u1738\u1719\u1719\u17d2";
        char[] cArray = "\u3e3d\u3e32\u3e3e\u3e33".toCharArray();
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
        ll = stringArray;
        III = new Object[stringArray.length];
        l = new llIIIIIl();
        lI = new llIIIIIl();
        Il = new llIIIIIl();
        II = new llIIIIIl();
        I = llIIIIIl.I();
    }

    public static llIIIIIl[] values() {
        return (llIIIIIl[])I.clone();
    }

    public static llIIIIIl l(String string) {
        return Enum.valueOf(llIIIIIl.class, string);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String II(int var0, int var1_1) {
        var3_2 = var0 ^ -1593719591;
        var4_4 = llIIIIIl.ll[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])llIIIIIl.III[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            llIIIIIl.III[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -884023241;
        var8_8 = 0;
        if (true) ** GOTO lbl16
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) break;
lbl16:
            // 2 sources

            switch (var8_8 & 31) {
                case 22: {
                    var9_9 = 161;
                    continue block33;
                }
                case 16: {
                    var9_9 = 125;
                    continue block33;
                }
                case 15: {
                    var9_9 = 98;
                    continue block33;
                }
                case 5: {
                    var9_9 = 222;
                    continue block33;
                }
                case 2: {
                    var9_9 = 147;
                    continue block33;
                }
                case 27: {
                    var9_9 = 119;
                    continue block33;
                }
                case 30: {
                    var9_9 = 247;
                    continue block33;
                }
                case 19: {
                    var9_9 = 108;
                    continue block33;
                }
                case 4: {
                    var9_9 = 130;
                    continue block33;
                }
                default: {
                    var9_9 = 166;
                    continue block33;
                }
                case 12: {
                    var9_9 = 131;
                    continue block33;
                }
                case 7: {
                    var9_9 = 153;
                    continue block33;
                }
                case 14: {
                    var9_9 = 52;
                    continue block33;
                }
                case 1: {
                    var9_9 = 202;
                    continue block33;
                }
                case 17: {
                    var9_9 = 148;
                    continue block33;
                }
                case 25: {
                    var9_9 = 42;
                    continue block33;
                }
                case 8: {
                    var9_9 = 181;
                    continue block33;
                }
                case 9: {
                    var9_9 = 178;
                    continue block33;
                }
                case 21: {
                    var9_9 = 68;
                    continue block33;
                }
                case 23: {
                    var9_9 = 212;
                    continue block33;
                }
                case 31: {
                    var9_9 = 254;
                    continue block33;
                }
                case 24: {
                    var9_9 = 171;
                    continue block33;
                }
                case 26: {
                    var9_9 = 165;
                    continue block33;
                }
                case 3: {
                    var9_9 = 89;
                    continue block33;
                }
                case 11: {
                    var9_9 = 54;
                    continue block33;
                }
                case 29: {
                    var9_9 = 138;
                    continue block33;
                }
                case 13: {
                    var9_9 = 179;
                    continue block33;
                }
                case 20: {
                    var9_9 = 33;
                    continue block33;
                }
                case 6: {
                    var9_9 = 31;
                    continue block33;
                }
                case 10: {
                    var9_9 = 112;
                    continue block33;
                }
                case 18: {
                    var9_9 = 159;
                    continue block33;
                }
                case 28: 
            }
            var9_9 = 193;
        }
        return new String(var4_4).intern();
    }
}

