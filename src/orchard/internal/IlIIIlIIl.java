/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIlIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Static
 *   - Aurora
 *   - Prism
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
final class IlIIIlIIl
extends Enum<IlIIIlIIl> {
    public static final /* enum */ IlIIIlIIl I;
    public static final /* enum */ IlIIIlIIl l;
    private static String[] II;
    public static final /* enum */ IlIIIlIIl Il;
    public static final /* enum */ IlIIIlIIl lI;
    private final IIIlIIIII ll;
    private static final /* synthetic */ IlIIIlIIl[] III;
    private static final int[] IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    public String toString() {
        return this.ll.IIII();
    }

    private IlIIIlIIl(String string2) {
        this.ll = StringFactory.lIl(string2);
    }

    private static void I() {
        IlIIIlIIl.II[0] = IlIIIlIIl.l(IlIIIlIIl.ll(-1020300347, -1879499230).toCharArray(), 35872L, -547832903);
        IlIIIlIIl.II[1] = IlIIIlIIl.l(IlIIIlIIl.ll(-1020300348, -1099157564).toCharArray(), 39113L, 1520004893);
        IlIIIlIIl.II[2] = IlIIIlIIl.l(IlIIIlIIl.ll(-1020300345, -1348187120).toCharArray(), 7672L, 1461111992);
        IlIIIlIIl.II[3] = IlIIIlIIl.l(IlIIIlIIl.ll(-1020300346, -1860368229).toCharArray(), 53542L, -68378838);
        IlIIIlIIl.II[4] = IlIIIlIIl.l(IlIIIlIIl.ll(-1020300351, -779586150).toCharArray(), 61952L, -691681857);
        IlIIIlIIl.II[5] = IlIIIlIIl.l(IlIIIlIIl.ll(-1020300352, 1833980989).toCharArray(), 66465L, -1744013462);
        IlIIIlIIl.II[6] = IlIIIlIIl.l(IlIIIlIIl.ll(-1020300349, -769430745).toCharArray(), 99279L, 216806535);
        IlIIIlIIl.II[7] = IlIIIlIIl.l(IlIIIlIIl.ll(-1020300350, 390280624).toCharArray(), 87081L, 1791827809);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0x54ACB186 ^ n;
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

    public static IlIIIlIIl II(String string) {
        return Enum.valueOf(IlIIIlIIl.class, string);
    }

    public static IlIIIlIIl[] values() {
        return (IlIIIlIIl[])III.clone();
    }

    private static /* synthetic */ IlIIIlIIl[] Il() {
        return new IlIIIlIIl[]{l, I, lI, Il};
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 14089;
        var7_2 = "\ud495\udd1c\u884f\ud762\u2500\u366b\uafbf\udb2a\u31a8\ue1f3\u66ac\u2a69\u94c7\u054b\u82ae\u573f\u512c\u571d\uf708\u9636\u3c07\u071e\ue31b\u5ddd\u9992\u4ee5\ue5e2\u502f\ua83b\u44d7\u5832\u1603\uff09\u9879\u5e96\ue034\u8aa7\u8335\u04ce\uedc3\u824c\u8ee1\u548f\ue413\u7f30\u0091\ua16e\u7312\uf6b8\u9101\u2799\u5f06\u2bd5";
        var8_3 = "\u3701\u3701\u3701\u370c\u370f\u370f\u3701\u370d".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl16
lbl7:
        // 2 sources

        while (true) {
            var12_7 = var8_3[var10_5] ^ var6;
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            if (true) ** GOTO lbl47
            break;
        }
lbl12:
        // 1 sources

        while (true) {
            var11_6 += var12_7;
            if (++var10_5 < var8_3.length) ** GOTO lbl7
            var13_8 = 0;
lbl16:
            // 2 sources

            var10_5 = 0;
            var11_6 = 0;
            var12_7 = 0;
            if (var13_8 == 0) ** break;
            ** continue;
            IlIIIlIIl.IlI = var9_4;
            IlIIIlIIl.Ill = new Object[var9_4.length];
            var2_12 = 561961799;
            var0_11 = "\u00e8\u00a9\t>\u00e2\u00a5B\u0086-\u00a0y\u0015n8\u008d\u00e1n\u0004\u0012\u001fv\u0011\u0092\u00f42A\u0001\u00e4\u008b}*\u001cW\u009c\u00eb6\u001ch\u00dd\u00f1Bu\u0086\"t\u00fb\u001d4\u00ba\u0003\u00cd_\u00aeI\u00de\u00bb\u00ba$B\u00fd".getBytes("ISO-8859-1");
            var1_13 = var0_11.length / 4;
            IlIIIlIIl.IIl = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                IlIIIlIIl.IIl[var4_15] = var5_16 ^= var2_12;
                var3_14 += 4;
            } while (++var4_15 < var1_13);
            IlIIIlIIl.II = new String[8];
            IlIIIlIIl.I();
            IlIIIlIIl.l = new IlIIIlIIl("Static");
            IlIIIlIIl.I = new IlIIIlIIl("Prism");
            IlIIIlIIl.lI = new IlIIIlIIl("Aurora");
            IlIIIlIIl.Il = new IlIIIlIIl("Glow");
            IlIIIlIIl.III = IlIIIlIIl.Il();
            return;
        }
        block9: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
            if (var15_10 >= var14_9.length) ** GOTO lbl57
lbl47:
            // 2 sources

            switch (var15_10 % 5) {
                case 3: {
                    v0 = 124;
                    continue block9;
                }
                case 2: {
                    v0 = 39;
                    continue block9;
                }
                case 1: {
                    v0 = 74;
                    continue block9;
                }
lbl57:
                // 1 sources

                var9_4[var10_5] = new String(var14_9).intern();
                ** continue;
                default: {
                    v0 = 40;
                    continue block9;
                }
                case 4: 
            }
            v0 = 47;
        }
    }

    private static int lI(int n, int n2) {
        return IIl[n ^ 0x19913C33] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xC32F73C5;
        char[] cArray = IlI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Ill[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIIlIIl.Ill[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6C8DD6F0;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 8: {
                    n6 = 45;
                    continue block33;
                }
                case 29: {
                    n6 = 2;
                    continue block33;
                }
                case 23: {
                    n6 = 220;
                    continue block33;
                }
                case 1: {
                    n6 = 8;
                    continue block33;
                }
                case 27: {
                    n6 = 37;
                    continue block33;
                }
                default: {
                    n6 = 78;
                    continue block33;
                }
                case 24: {
                    n6 = 201;
                    continue block33;
                }
                case 12: {
                    n6 = 87;
                    continue block33;
                }
                case 16: {
                    n6 = 52;
                    continue block33;
                }
                case 9: {
                    n6 = 17;
                    continue block33;
                }
                case 4: {
                    n6 = 147;
                    continue block33;
                }
                case 5: {
                    n6 = 67;
                    continue block33;
                }
                case 2: {
                    n6 = 204;
                    continue block33;
                }
                case 15: {
                    n6 = 211;
                    continue block33;
                }
                case 17: {
                    n6 = 219;
                    continue block33;
                }
                case 11: {
                    n6 = 87;
                    continue block33;
                }
                case 28: {
                    n6 = 236;
                    continue block33;
                }
                case 20: {
                    n6 = 179;
                    continue block33;
                }
                case 31: {
                    n6 = 133;
                    continue block33;
                }
                case 10: {
                    n6 = 187;
                    continue block33;
                }
                case 25: {
                    n6 = 204;
                    continue block33;
                }
                case 6: {
                    n6 = 84;
                    continue block33;
                }
                case 19: {
                    n6 = 229;
                    continue block33;
                }
                case 14: {
                    n6 = 150;
                    continue block33;
                }
                case 21: {
                    n6 = 157;
                    continue block33;
                }
                case 22: {
                    n6 = 39;
                    continue block33;
                }
                case 30: {
                    n6 = 40;
                    continue block33;
                }
                case 7: {
                    n6 = 189;
                    continue block33;
                }
                case 3: {
                    n6 = 185;
                    continue block33;
                }
                case 13: {
                    n6 = 29;
                    continue block33;
                }
                case 26: {
                    n6 = 90;
                    continue block33;
                }
                case 18: 
            }
            n6 = 114;
        }
    }
}

