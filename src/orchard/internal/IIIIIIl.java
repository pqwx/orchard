/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Normal
 *   - Side
 *   - Spin
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
public final class IIIIIIl
extends Enum<IIIIIIl> {
    private static String[] I;
    public static final /* enum */ IIIIIIl l;
    private final IIIlIIIII II;
    private static final /* synthetic */ IIIIIIl[] Il;
    public static final /* enum */ IIIIIIl lI;
    public static final /* enum */ IIIIIIl ll;
    private static final int[] III;
    private static final String[] IIl;
    private static final Object[] IlI;

    private IIIIIIl(String string2) {
        this.II = StringFactory.lIl(string2);
    }

    private static void I() {
        IIIIIIl.I[0] = IIIIIIl.Il(IIIIIIl.ll(22305046, (short)20360, '\u0aa1').toCharArray(), 77417L, -695131823);
        IIIIIIl.I[1] = IIIIIIl.Il(IIIIIIl.ll(-1839048881, (short)39391, '\u0aa0').toCharArray(), 78343L, 69531746);
        IIIIIIl.I[2] = IIIIIIl.Il(IIIIIIl.ll(-907780538, (short)21665, '\u0aa3').toCharArray(), 47946L, 1173640039);
        IIIIIIl.I[3] = IIIIIIl.Il(IIIIIIl.ll(1058604292, (short)54695, '\u0aa2').toCharArray(), 18319L, -84027782);
        IIIIIIl.I[4] = IIIIIIl.Il(IIIIIIl.ll(1963480085, (short)6949, '\u0aa5').toCharArray(), 43288L, -1731307668);
        IIIIIIl.I[5] = IIIIIIl.Il(IIIIIIl.ll(1399407408, (short)53211, '\u0aa4').toCharArray(), 92122L, 1210394455);
    }

    private static /* synthetic */ IIIIIIl[] l() {
        return new IIIIIIl[]{l, ll, lI};
    }

    public static IIIIIIl II(String string) {
        return Enum.valueOf(IIIIIIl.class, string);
    }

    public String toString() {
        return this.II.IIII();
    }

    public static IIIIIIl[] values() {
        return (IIIIIIl[])Il.clone();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 8232;
        var7_2 = "\u9994\uec55\u8ef8\u5843\u123b\ua3ac\uc49d\uadee\uc8dc\u31a6\ued58\ud92b\u6abf\u4020\uce63\uae73\u7311\u0f9f\u9943\ud942\uc108\u1ca2\u73ed\u1e40\u00b6\uaac3\u3355\ufa75\u8a04\u5061\ua9cd\u21f2\uad75\u6b70\u0bf1\u9e09\uf625\u6a8a";
        var8_3 = "\u0004\b\b\u0004\u0006\b".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl17
lbl7:
        // 2 sources

        while (true) {
            var12_7 = var8_3[var10_5];
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            if (true) ** GOTO lbl47
            break;
        }
        while (true) {
            var9_4[var10_5] = new String(var14_9).intern();
            var11_6 += var12_7;
            if (++var10_5 < var8_3.length) ** GOTO lbl7
            var13_8 = 0;
lbl17:
            // 2 sources

            var10_5 = 0;
            var11_6 = 0;
            var12_7 = '\u0000';
            if (var13_8 == 0) ** break;
            ** continue;
            IIIIIIl.IIl = var9_4;
            IIIIIIl.IlI = new Object[var9_4.length];
            var2_13 = -1755242245;
            var0_11 = "\b']\u00d7\u00bex!\u00d0Q\\\b\u00f62.5\u00cfB\u00cd\u00c9\u0017\u001dO\u00f97`\u00b6\r\u0007\u00b7\u0080\u00f4\u0080\u00e2\u00f2\rm".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            IIIIIIl.III = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                IIIIIIl.III[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            IIIIIIl.I = new String[6];
            IIIIIIl.I();
            IIIIIIl.l = new IIIIIIl("Normal");
            IIIIIIl.ll = new IIIIIIl("Side");
            IIIIIIl.lI = new IIIIIIl("Spin");
            IIIIIIl.Il = IIIIIIl.l();
            return;
        }
        block9: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) ** continue;
lbl47:
            // 2 sources

            switch (var15_10 % 5) {
                case 2: {
                    v0 = 8;
                    continue block9;
                }
                case 4: {
                    v0 = 6;
                    continue block9;
                }
                case 3: {
                    v0 = 30;
                    continue block9;
                }
                default: {
                    v0 = 5;
                    continue block9;
                }
                case 1: 
            }
            v0 = 100;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Il(char[] cArray, long l2, int n) {
        int n2 = 0x23B0825C ^ n;
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

    private static int lI(int n, int n2) {
        return III[n ^ 0xAB809450] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xAA1;
        char[] cArray = IIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIIIl.IlI[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1E5E;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x4A1D;
            n6 ^= 0x572D;
            n6 += 42456;
            n6 += 19515;
            n6 -= 50936;
            cArray[n5] = (char)((n6 -= 41002) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

