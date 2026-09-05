/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Visual
 *   - Server
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
import orchard.internal.lIIlll;

@Environment(value=EnvType.CLIENT)
final class IIIlllIl
extends Enum<IIIlllIl>
implements lIIlll {
    private static String[] I;
    public static final /* enum */ IIIlllIl l;
    private static final /* synthetic */ IIIlllIl[] II;
    public static final /* enum */ IIIlllIl Il;
    private final IIIlIIIII lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 28907;
        var7_2 = "\ub7ad\u806a\u4557\u62cc\ue7e4\ud94b\u67eb\u326b\u6327\u13a1\u3c8c\u9e36\ub9a7\u387d\u3ca2\uddaa\ue8f1\u530e\u8d3d\uc66a\u747a\u2c1e\ub3d1\u83b6\u977e\u54e6\ua87f\u8e34";
        var8_3 = "\b\u0006\b\u0006".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl9
        while (true) {
            var13_8 = 0;
lbl9:
            // 2 sources

            var10_5 = 0;
            var11_6 = 0;
            var12_7 = '\u0000';
            if (var13_8 != 0) ** GOTO lbl38
            IIIlllIl.III = var9_4;
            IIIlllIl.IIl = new Object[var9_4.length];
            var2_13 = -726634917;
            var0_11 = "HoK\u0005\u00c8\u000b\u00a0\u00bc\u00f7g\u0005\u00e7\u00a2\u00de\u0003vO\u00c0\u00a1\u00f3O\u00f5J\u00b9".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            IIIlllIl.ll = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            if (true) ** GOTO lbl31
            while (true) {
                var3_14 += 4;
                if (++var4_15 >= var1_12) {
                    IIIlllIl.I = new String[4];
                    IIIlllIl.Il();
                    IIIlllIl.Il = new IIIlllIl("Visual");
                    IIIlllIl.l = new IIIlllIl("Server");
                    IIIlllIl.II = IIIlllIl.lI();
                    return;
                }
lbl31:
                // 3 sources

                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                IIIlllIl.ll[var4_15] = var5_16 ^= var2_13;
            }
            break;
        }
        while (true) {
            var9_4[var10_5] = new String(var14_9).intern();
            var11_6 += var12_7;
            if (++var10_5 >= var8_3.length) ** continue;
lbl38:
            // 2 sources

            var12_7 = var8_3[var10_5];
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            if (true) ** GOTO lbl47
            break;
        }
        block10: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) ** continue;
lbl47:
            // 2 sources

            switch (var15_10 % 6) {
                case 5: {
                    v0 = 113;
                    continue block10;
                }
                case 2: {
                    v0 = 86;
                    continue block10;
                }
                default: {
                    v0 = 65;
                    continue block10;
                }
                case 3: {
                    v0 = 61;
                    continue block10;
                }
                case 4: {
                    v0 = 115;
                    continue block10;
                }
                case 1: 
            }
            v0 = 10;
        }
    }

    public static IIIlllIl II(String string) {
        return Enum.valueOf(IIIlllIl.class, string);
    }

    private static void Il() {
        IIIlllIl.I[0] = IIIlllIl.ll(IIIlllIl.IIl(-149720953, -1576707928).toCharArray(), 57037L, 1168156291);
        IIIlllIl.I[1] = IIIlllIl.ll(IIIlllIl.IIl(-149720954, 1262054394).toCharArray(), 26364L, -1928039216);
        IIIlllIl.I[2] = IIIlllIl.ll(IIIlllIl.IIl(-149720955, 382995003).toCharArray(), 95052L, 1880026603);
        IIIlllIl.I[3] = IIIlllIl.ll(IIIlllIl.IIl(-149720956, 2072399446).toCharArray(), 28673L, 1182144748);
    }

    private IIIlllIl(String string2) {
        this.lI = StringFactory.lIl(string2);
    }

    public static IIIlllIl[] values() {
        return (IIIlllIl[])II.clone();
    }

    public String toString() {
        return this.lI.IIII();
    }

    private static /* synthetic */ IIIlllIl[] lI() {
        return new IIIlllIl[]{Il, l};
    }

    private static String ll(char[] cArray, long l2, int n) {
        int n2 = 0x58E451B1 ^ n;
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

    private static int III(int n, int n2) {
        return ll[n ^ 0x2EE95F6B] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xF7137087;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIlllIl.IIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xB0679314;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 3 -> 115;
                case 20 -> 221;
                case 25 -> 53;
                case 22 -> 106;
                case 12 -> 30;
                case 26 -> 122;
                case 2 -> 207;
                case 16 -> 234;
                default -> 124;
                case 31 -> 240;
                case 7 -> 113;
                case 19 -> 178;
                case 6 -> 49;
                case 27 -> 200;
                case 24 -> 73;
                case 15 -> 103;
                case 29 -> 164;
                case 9 -> 195;
                case 11 -> 161;
                case 18 -> 15;
                case 21 -> 164;
                case 1 -> 70;
                case 5 -> 50;
                case 14 -> 26;
                case 28 -> 187;
                case 8 -> 117;
                case 10 -> 38;
                case 23 -> 201;
                case 30 -> 109;
                case 4 -> 199;
                case 17 -> 158;
                case 13 -> 181;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

