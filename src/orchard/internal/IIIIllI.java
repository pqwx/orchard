/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Totemguard
 *   - Normal
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
public final class IIIIllI
extends Enum<IIIIllI> {
    private static String[] I;
    private final IIIlIIIII l;
    private static final /* synthetic */ IIIIllI[] II;
    public static final /* enum */ IIIIllI Il;
    public static final /* enum */ IIIIllI lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 2483;
        var7_2 = "\u2084\u2abe\u834f\uea68\u70aa\u43c4\ud5cf\u5def\u4edf[\u6166\u5768\u358c\uf32d\uccb4\u25e0\u1ee4\u8a97\u7651\ua17c\u0721\u6480\u7fc3\u5e17\ufa9b\u4848\u8dd5\u7b0f\u8d82\u0d07\u91b6\u5d21\uea9e\u0bdb\u20f3\u9951\u0d48\u0ba7\ue96a\u3dd9";
        var8_3 = "\u09a3\u09b5\u09b9\u09bb".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl52
lbl7:
        // 1 sources

        while (true) {
            var2_13 = 977160450;
            var0_11 = "\u00c3y\u00df\u009d\u0002\u00f0\u00ff\u00a8.\u00e4$\u00ad\u00f1kN\u00f6\u0081D?\u00e4n\u009a\u008dm".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            IIIIllI.ll = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                IIIIllI.ll[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            IIIIllI.I = new String[4];
            IIIIllI.Il();
            IIIIllI.Il = new IIIIllI("Totemguard");
            IIIIllI.lI = new IIIIllI("Normal");
            IIIIllI.II = IIIIllI.l();
            return;
        }
        while (true) {
            block14: {
                switch (var15_10 % 6) {
                    case 5: {
                        v0 = 3;
                        break;
                    }
                    case 4: {
                        v0 = 38;
                        break;
                    }
                    case 1: {
                        v0 = 29;
                        break;
                    }
                    case 2: {
                        v0 = 25;
                        break;
                    }
                    default: {
                        v0 = 23;
                        break;
                    }
                    case 3: {
                        v0 = 62;
                    }
                }
                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                if (var15_10 < var14_9.length) continue;
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 < var8_3.length) break block14;
                var13_8 = 0;
lbl52:
                // 2 sources

                var10_5 = 0;
                var11_6 = 0;
                var12_7 = 0;
                if (var13_8 == 0) {
                    IIIIllI.III = var9_4;
                    IIIIllI.IIl = new Object[var9_4.length];
                    ** continue;
                }
            }
            var12_7 = var8_3[var10_5] ^ var6;
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
        }
    }

    private IIIIllI(String string2) {
        this.l = StringFactory.lIl(string2);
    }

    public String toString() {
        return this.l.IIII();
    }

    public static IIIIllI I(String string) {
        return Enum.valueOf(IIIIllI.class, string);
    }

    private static /* synthetic */ IIIIllI[] l() {
        return new IIIIllI[]{Il, lI};
    }

    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0xBCAA1C78 ^ n;
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

    public static IIIIllI[] values() {
        return (IIIIllI[])II.clone();
    }

    private static void Il() {
        IIIIllI.I[0] = IIIIllI.II(IIIIllI.ll((short)2594, '\ufd80', -1318570399).toCharArray(), 95394L, -857360151);
        IIIIllI.I[1] = IIIIllI.II(IIIIllI.ll((short)41072, '\ufd81', 810705064).toCharArray(), 60200L, 280967543);
        IIIIllI.I[2] = IIIIllI.II(IIIIllI.ll((short)4912, '\ufd82', -579718885).toCharArray(), 45512L, -1285448332);
        IIIIllI.I[3] = IIIIllI.II(IIIIllI.ll((short)38010, '\ufd83', 1859997373).toCharArray(), 75497L, -212759449);
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0x2C2A5DDC] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(short s, char c, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xFD80;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIllI.IIl[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x399D;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 54300;
            n6 -= 26876;
            n6 ^= 0x43EC;
            n6 -= 60417;
            n6 -= 38627;
            n6 += 3905;
            n6 += 47967;
            cArray[n5] = (char)((n6 += 28917) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

