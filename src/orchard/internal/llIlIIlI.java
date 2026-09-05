/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlIIlI
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
final class llIlIIlI
extends Enum<llIlIIlI> {
    public static final /* enum */ llIlIIlI I;
    public static final /* enum */ llIlIIlI l;
    private static final /* synthetic */ llIlIIlI[] II;
    public static final /* enum */ llIlIIlI Il;
    public static final /* enum */ llIlIIlI lI;
    public static final /* enum */ llIlIIlI ll;
    public static final /* enum */ llIlIIlI III;
    public static final /* enum */ llIlIIlI IIl;
    private static final int[] IlI;
    private static final String[] Ill;
    private static final Object[] lII;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 18572;
        var7_2 = "\u54d8\u54f9\u54ac\u54e2\ufe12\ufe28\ufe7d\ufe27\ufe2c\ufe26\ufe07\ufe3a\ufe7d\ufe37\ufe3a\ufe28\ufe0b\ufe36\ufe61\ufe20\ufe36\u7c7d\u7c47\u7c12\u7c48\u7c43\u7c49\u7c68\u7c55\u7c12\u7c58\u7c55\u7c47\u7c64\u7c59\u7c18\u7c53\u7c52\u7c40\u7c63\u7c54\u7c16\uddb5\udd8f\uddda\udd80\udd8b\udd8d\uddb0\udd97\uddc0\udd80\udd95\udd82\uddbd\udd8a\uddd6\udd98\udd95\udd97\u6be8\u6bd2\u6b87\u6bdd\u6bd6\u6bd0\u6bed\u6bca\u6b9d\u6bdd\u6bc8\u6bdf\u6be0\u6bc6\u6b9d\u6bcc\u5b6a\u5b50\u5b05\u5b5f\u5b54\u5b52\u5b6f\u5b48\u5b1f\u5b5f\u5b4a\u5b5d\u5b62\u5b45\u5b0d\u5b42\u5b47\uc905\uc93f\uc96a\uc930\uc93b\uc93b\uc90a\uc92e\uc96f\uc92b\uc920\uc93b";
        var8_3 = "\u4888\u489d\u4899\u489e\u489c\u489d\u4880".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl9
        while (true) {
            var13_8 = 0;
lbl9:
            // 2 sources

            var10_5 = 0;
            var11_6 = 0;
            var12_7 = 0;
            if (var13_8 != 0) ** GOTO lbl42
            llIlIIlI.Ill = var9_4;
            llIlIIlI.lII = new Object[var9_4.length];
            var2_13 = -1645269711;
            var0_11 = "\n\u0094\u00d5\t\u00b1\u00a2\u00aa\u0083\u00f4\u00137\u00cb".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            llIlIIlI.IlI = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                llIlIIlI.IlI[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            llIlIIlI.Il = new llIlIIlI();
            llIlIIlI.I = new llIlIIlI();
            llIlIIlI.l = new llIlIIlI();
            llIlIIlI.lI = new llIlIIlI();
            llIlIIlI.III = new llIlIIlI();
            llIlIIlI.ll = new llIlIIlI();
            llIlIIlI.IIl = new llIlIIlI();
            llIlIIlI.II = llIlIIlI.I();
            return;
        }
lbl-1000:
        // 6 sources

        {
            block12: {
                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                if (var15_10 < var14_9.length) break block12;
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 >= var8_3.length) ** continue;
lbl42:
                // 2 sources

                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
            }
            switch (var15_10 % 6) {
                case 1: {
                    v0 = 117;
                    continue block9;
                }
                case 5: {
                    v0 = 117;
                    continue block9;
                }
                case 4: {
                    v0 = 111;
                    continue block9;
                }
                case 2: {
                    v0 = 40;
                    continue block9;
                }
                case 3: {
                    v0 = 111;
                    continue block9;
                }
            }
            v0 = 89;
            ** while (true)
        }
    }

    public static llIlIIlI[] values() {
        return (llIlIIlI[])II.clone();
    }

    private static /* synthetic */ llIlIIlI[] I() {
        return new llIlIIlI[]{Il, I, l, lI, III, ll, IIl};
    }

    public static llIlIIlI l(String string) {
        return Enum.valueOf(llIlIIlI.class, string);
    }

    private static int II(int n, int n2) {
        return IlI[n ^ 0xE6E2483E] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Il(int n, short s, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xF3F2;
        char[] cArray = Ill[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lII[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIlIIlI.lII[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x716F;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 956;
            n7 += 25519;
            n7 -= 17601;
            n7 += 64596;
            n7 -= 46470;
            n7 ^= 0x610A;
            cArray[n6] = (char)((n7 ^= 0x739D) ^ n4 ^ s ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

