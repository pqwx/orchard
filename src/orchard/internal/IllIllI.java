/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIllI
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
public final class IllIllI
extends Enum<IllIllI> {
    private static final /* synthetic */ IllIllI[] I;
    public static final /* enum */ IllIllI l;
    public static final /* enum */ IllIllI II;
    public static final /* enum */ IllIllI Il;
    private static String[] lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    public static IllIllI[] values() {
        return (IllIllI[])I.clone();
    }

    private static void I() {
        IllIllI.lI[0] = IllIllI.II(IllIllI.ll(-1065152592, '\u17cf', '\ub414').toCharArray(), 17681L, -2069819410);
        IllIllI.lI[1] = IllIllI.II(IllIllI.ll(1747065254, '\u17ce', '\u5b89').toCharArray(), 22400L, 883436026);
        IllIllI.lI[2] = IllIllI.II(IllIllI.ll(-516593252, '\u17cd', '\u2d5c').toCharArray(), 75287L, -1465762324);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block9: {
            var6 = 25187;
            var7_2 = "\u567e\u5f32\u7688\uf53a\u4de4\u7430\u07ed\ufe88\u0b55\uc91c\u8ce8\u5d0c\ude93\u060e\uc2f5\u62eb\u409e\ueaaf\u22bd\ue00d\u11cb\u4e12\u0ba6\u3bf5\uc900\uce5d\u0e2a\u6af0\u7c39\u77ac\ube44\uc698\udbb3\u143c";
            var8_3 = "\u626e\u626c\u6265".toCharArray();
            var9_4 = new String[var8_3.length];
            var13_8 = -1;
lbl6:
            // 2 sources

            while (true) {
                var10_5 = 0;
                var11_6 = 0;
                var12_7 = 0;
                if (var13_8 != 0) break block9;
                IllIllI.III = var9_4;
                IllIllI.IIl = new Object[var9_4.length];
                var2_13 = 35231648;
                var0_11 = "9M\n\u000fT\u0001\u000b\u00f7\u0090\u00fc\u000e\u00e5\u0089\u00df\u00b3\u00e6\u009d\u00d6\u0017\u00c8".getBytes("ISO-8859-1");
                var1_12 = var0_11.length / 4;
                IllIllI.ll = new int[var1_12];
                var3_14 = 0;
                var4_15 = 0;
                do {
                    var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                    IllIllI.ll[var4_15] = var5_16 ^= var2_13;
                    var3_14 += 4;
                } while (++var4_15 < var1_12);
                IllIllI.lI = new String[3];
                IllIllI.I();
                IllIllI.Il = new IllIllI();
                IllIllI.l = new IllIllI();
                IllIllI.II = new IllIllI();
                IllIllI.I = IllIllI.l();
                return;
            }
lbl31:
            // 1 sources

            while (true) {
                var13_8 = 0;
                ** continue;
                break;
            }
            var9_4[var10_5] = new String(var14_9).intern();
            var11_6 += var12_7;
            ** while (++var10_5 >= var8_3.length)
        }
        var12_7 = var8_3[var10_5] ^ var6;
        var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
        var15_10 = 0;
lbl41:
        // 2 sources

        switch (var15_10 % 5) {
            case 3: {
                v0 = 72;
                break;
            }
            case 4: {
                v0 = 50;
                break;
            }
            case 2: {
                v0 = 13;
                break;
            }
            default: {
                v0 = 47;
                break;
            }
            case 1: {
                v0 = 66;
            }
        }
        var16_1 = v0;
        v1 = var15_10++;
        var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
        if (var15_10 < var14_9.length) ** GOTO lbl41
    }

    private static /* synthetic */ IllIllI[] l() {
        return new IllIllI[]{Il, l, II};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0xE0331D8A ^ n;
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

    public static IllIllI Il(String string) {
        return Enum.valueOf(IllIllI.class, string);
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0x66230298] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x17CF;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IllIllI.IIl[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x37B3;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 39548;
            n6 ^= 0xC556;
            n6 += 48655;
            n6 += 1473;
            n6 -= 5235;
            n6 -= 56368;
            n6 ^= 0x55E9;
            n6 ^= 0xACF;
            cArray[n5] = (char)((n6 ^= 0x828D) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

