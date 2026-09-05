/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlllI
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
public final class IIIIlllI
extends Enum<IIIIlllI> {
    private static String[] I;
    public static final /* enum */ IIIIlllI l;
    private static final /* synthetic */ IIIIlllI[] II;
    public static final /* enum */ IIIIlllI Il;
    public static final /* enum */ IIIIlllI lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    private static void I() {
        IIIIlllI.I[0] = IIIIlllI.II(IIIIlllI.ll(-1457450755, -2110044536).toCharArray(), 32459L, 1079658444);
        IIIIlllI.I[1] = IIIIlllI.II(IIIIlllI.ll(-1457450756, 1793735740).toCharArray(), 3327L, -1780642750);
        IIIIlllI.I[2] = IIIIlllI.II(IIIIlllI.ll(-1457450753, -725000448).toCharArray(), 8464L, 1216546610);
    }

    public static IIIIlllI l(String string) {
        return Enum.valueOf(IIIIlllI.class, string);
    }

    public static IIIIlllI[] values() {
        return (IIIIlllI[])II.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0x36AD4577 ^ n;
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

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 25930;
        String string = "\ube95\uea57\u4db8\uf3b4\u5726\u68ea\uf79f\ub298\ud893\u2b1d\ud8f8\u99b6\uc4b6\uc3f5\u1244";
        char[] cArray = "\u654d\u654e\u654e".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        block6: while (true) {
            int n3;
            int n4;
            block14: {
                int n5;
                int n6;
                int n7;
                char[] cArray2;
                block15: {
                    block13: {
                        if (bl && !(bl = false) && true) break block13;
                        int n8 = n4;
                        int n9 = n3++;
                        cArray2[n9] = (char)(cArray2[n9] ^ n8);
                        if (n3 < cArray2.length) break block14;
                        stringArray[n6] = new String(cArray2).intern();
                        n5 += n7;
                        if (++n6 < cArray.length) break block15;
                        n2 = 0;
                    }
                    n6 = 0;
                    n5 = 0;
                    n7 = 0;
                    if (n2 == 0) {
                        III = stringArray;
                        IIl = new Object[stringArray.length];
                        int n10 = 1927961023;
                        byte[] byArray = "A\u00a0R\u00fdg\u00d1%/y\u00f8\u0096\u00d0\u00e4\u00a7Z\u0011\u00a7\u00f2C\u00e4".getBytes("ISO-8859-1");
                        int n11 = byArray.length / 4;
                        ll = new int[n11];
                        int n12 = 0;
                        int n13 = 0;
                        do {
                            int n14 = (byArray[n12] & 0xFF) << 24 | (byArray[n12 + 1] & 0xFF) << 16 | (byArray[n12 + 2] & 0xFF) << 8 | byArray[n12 + 3] & 0xFF;
                            IIIIlllI.ll[n13] = n14 ^= n10;
                            n12 += 4;
                        } while (++n13 < n11);
                        I = new String[3];
                        IIIIlllI.I();
                        Il = new IIIIlllI();
                        l = new IIIIlllI();
                        lI = new IIIIlllI();
                        II = IIIIlllI.Il();
                        return;
                    }
                }
                n7 = cArray[n6] ^ n;
                cArray2 = string.substring(n5, n5 + n7).toCharArray();
                n3 = 0;
            }
            switch (n3 % 5) {
                case 1: {
                    n4 = 28;
                    continue block6;
                }
                case 3: {
                    n4 = 3;
                    continue block6;
                }
                default: {
                    n4 = 4;
                    continue block6;
                }
                case 2: {
                    n4 = 4;
                    continue block6;
                }
                case 4: 
            }
            n4 = 51;
        }
    }

    private static /* synthetic */ IIIIlllI[] Il() {
        return new IIIIlllI[]{Il, l, lI};
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0xB3A046F2] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String ll(int var0, int var1_1) {
        var3_2 = var0 ^ -1457450755;
        var4_3 = IIIIlllI.III[var3_2].toCharArray();
        var2_4 = (StackTraceElement[])IIIIlllI.IIl[var3_2];
        if (var2_4 != null) {
            var5_5 = var2_4;
        } else {
            var5_5 = new Throwable().getStackTrace();
            IIIIlllI.IIl[var3_2] = var5_5;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -410864962;
        var8_8 = 0;
        if (true) ** GOTO lbl16
        block33: while (true) {
            var4_3[var8_8] = var4_3[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_3.length) break;
lbl16:
            // 2 sources

            switch (var8_8 & 31) {
                case 21: {
                    var9_9 = 173;
                    continue block33;
                }
                case 19: {
                    var9_9 = 135;
                    continue block33;
                }
                case 15: {
                    var9_9 = 57;
                    continue block33;
                }
                case 3: {
                    var9_9 = 194;
                    continue block33;
                }
                case 17: {
                    var9_9 = 27;
                    continue block33;
                }
                case 7: {
                    var9_9 = 158;
                    continue block33;
                }
                case 25: {
                    var9_9 = 187;
                    continue block33;
                }
                case 16: {
                    var9_9 = 148;
                    continue block33;
                }
                case 14: {
                    var9_9 = 11;
                    continue block33;
                }
                case 4: {
                    var9_9 = 195;
                    continue block33;
                }
                case 30: {
                    var9_9 = 227;
                    continue block33;
                }
                case 8: {
                    var9_9 = 211;
                    continue block33;
                }
                case 5: {
                    var9_9 = 62;
                    continue block33;
                }
                case 11: {
                    var9_9 = 140;
                    continue block33;
                }
                case 13: {
                    var9_9 = 67;
                    continue block33;
                }
                case 9: {
                    var9_9 = 59;
                    continue block33;
                }
                case 24: {
                    var9_9 = 177;
                    continue block33;
                }
                case 6: {
                    var9_9 = 248;
                    continue block33;
                }
                case 18: {
                    var9_9 = 238;
                    continue block33;
                }
                case 22: {
                    var9_9 = 42;
                    continue block33;
                }
                default: {
                    var9_9 = 218;
                    continue block33;
                }
                case 29: {
                    var9_9 = 114;
                    continue block33;
                }
                case 20: {
                    var9_9 = 133;
                    continue block33;
                }
                case 26: {
                    var9_9 = 106;
                    continue block33;
                }
                case 2: {
                    var9_9 = 152;
                    continue block33;
                }
                case 1: {
                    var9_9 = 113;
                    continue block33;
                }
                case 10: {
                    var9_9 = 152;
                    continue block33;
                }
                case 28: {
                    var9_9 = 234;
                    continue block33;
                }
                case 23: {
                    var9_9 = 88;
                    continue block33;
                }
                case 12: {
                    var9_9 = 131;
                    continue block33;
                }
                case 27: {
                    var9_9 = 156;
                    continue block33;
                }
                case 31: 
            }
            var9_9 = 146;
        }
        return new String(var4_3).intern();
    }
}

