/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Always
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
final class IIIIIIlIl
extends Enum<IIIIIIlIl> {
    private final IIIlIIIII I;
    private static final /* synthetic */ IIIIIIlIl[] l;
    public static final /* enum */ IIIIIIlIl II;
    private static String[] Il;
    public static final /* enum */ IIIIIIlIl lI;
    public static final /* enum */ IIIIIIlIl ll;
    private static final int[] III;
    private static final String[] IIl;
    private static final Object[] IlI;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block10: {
            var6 = 18111;
            var7_3 = "\u0f69\u606c\ud81b\ufd5b\u8bb5\ua5eb\u909a\ua337\u2be9\u7d64\u0414\u0112\u666e\uc944\u3c1c\u7712\ucd82\u5c69\u5d0b\u2c10\ua312\u922a\u10c5\u1caf\u976d\u7294\u60ca\u3447";
            var8_4 = "\u0004\u0003\u0004\u0006\b\u0003".toCharArray();
            var9_5 = new String[var8_4.length];
            var13_9 = -1;
lbl6:
            // 2 sources

            while (true) {
                var10_6 = 0;
                var11_7 = 0;
                var12_8 = '\u0000';
                if (var13_9 != 0) break block10;
                IIIIIIlIl.IIl = var9_5;
                IIIIIIlIl.IlI = new Object[var9_5.length];
                var2_2 = 933292037;
                var0_1 = "\u0011\u009eO\u00fb\u00fa\u00991\u00c5\u0081\u0006/\u00c6\u001b\u00dbh=v\u0000\u009dK|HE\u00ca\u00b7\u008b\u00e1a\u00e6Sa\u0095yy\u0089\u0002".getBytes("ISO-8859-1");
                var1_13 = var0_1.length / 4;
                IIIIIIlIl.III = new int[var1_13];
                var3_14 = 0;
                var4_15 = 0;
                do {
                    var5_16 = (var0_1[var3_14] & 255) << 24 | (var0_1[var3_14 + 1] & 255) << 16 | (var0_1[var3_14 + 2] & 255) << 8 | var0_1[var3_14 + 3] & 255;
                    IIIIIIlIl.III[var4_15] = var5_16 ^= var2_2;
                    var3_14 += 4;
                } while (++var4_15 < var1_13);
                IIIIIIlIl.Il = new String[6];
                IIIIIIlIl.II();
                IIIIIIlIl.ll = new IIIIIIlIl("Always");
                IIIIIIlIl.II = new IIIIIIlIl("LMB");
                IIIIIIlIl.lI = new IIIIIIlIl("RMB");
                IIIIIIlIl.l = IIIIIIlIl.Il();
                return;
            }
            var13_9 = 0;
            ** while (true)
        }
lbl34:
        // 2 sources

        var12_8 = var8_4[var10_6];
        var14_10 = var7_3.substring(var11_7, var11_7 + var12_8).toCharArray();
        var15_11 = 0;
        do {
            switch (var15_11 % 6) {
                default: {
                    v0 = 124;
                    break;
                }
                case 3: {
                    v0 = 127;
                    break;
                }
                case 2: {
                    v0 = 126;
                    break;
                }
                case 4: {
                    v0 = 25;
                    break;
                }
                case 1: {
                    v0 = 115;
                    break;
                }
                case 5: {
                    v0 = 68;
                }
            }
            var16_12 = v0;
            v1 = var15_11++;
            var14_10[v1] = (char)(var14_10[v1] ^ var16_12 ^ var6);
        } while (var15_11 < var14_10.length);
        var9_5[var10_6] = new String(var14_10).intern();
        var11_7 += var12_8;
        if (++var10_6 < var8_4.length) ** GOTO lbl34
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0x780BF94D ^ n;
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

    public static IIIIIIlIl[] values() {
        return (IIIIIIlIl[])l.clone();
    }

    public static IIIIIIlIl l(String string) {
        return Enum.valueOf(IIIIIIlIl.class, string);
    }

    private IIIIIIlIl(String string2) {
        this.I = StringFactory.lIl(string2);
    }

    private static void II() {
        IIIIIIlIl.Il[0] = IIIIIIlIl.I(IIIIIIlIl.ll(807713392, -805028416).toCharArray(), 15889L, 1843924660);
        IIIIIIlIl.Il[1] = IIIIIIlIl.I(IIIIIIlIl.ll(807713393, 730485478).toCharArray(), 71949L, -301803378);
        IIIIIIlIl.Il[2] = IIIIIIlIl.I(IIIIIIlIl.ll(807713394, -1078240749).toCharArray(), 86955L, 1806429056);
        IIIIIIlIl.Il[3] = IIIIIIlIl.I(IIIIIIlIl.ll(807713395, -868203352).toCharArray(), 34623L, 1350201178);
        IIIIIIlIl.Il[4] = IIIIIIlIl.I(IIIIIIlIl.ll(807713396, 1533495955).toCharArray(), 31352L, 1256437305);
        IIIIIIlIl.Il[5] = IIIIIIlIl.I(IIIIIIlIl.ll(807713397, 1955024635).toCharArray(), 52347L, -586213980);
    }

    public String toString() {
        return this.I.IIII();
    }

    private static /* synthetic */ IIIIIIlIl[] Il() {
        return new IIIIIIlIl[]{ll, II, lI};
    }

    private static int lI(int n, int n2) {
        return III[n ^ 0xEF90C3B6] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x3024BA70;
        char[] cArray = IIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIIIlIl.IlI[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x56C2099C;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 14 -> 127;
                case 1 -> 187;
                case 30 -> 247;
                case 26 -> 2;
                case 4 -> 15;
                case 10 -> 221;
                case 28 -> 85;
                case 27 -> 131;
                case 13 -> 155;
                case 18 -> 242;
                case 11 -> 26;
                case 23 -> 227;
                case 16 -> 134;
                case 9 -> 1;
                case 20 -> 19;
                case 6 -> 233;
                case 19 -> 86;
                default -> 104;
                case 15 -> 200;
                case 2 -> 166;
                case 5 -> 83;
                case 17 -> 220;
                case 3 -> 148;
                case 8 -> 222;
                case 25 -> 139;
                case 29 -> 6;
                case 22 -> 216;
                case 24 -> 94;
                case 31 -> 253;
                case 7 -> 194;
                case 12 -> 217;
                case 21 -> 149;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

