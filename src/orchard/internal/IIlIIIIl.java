/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Silent
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
final class IIlIIIIl
extends Enum<IIlIIIIl> {
    public static final /* enum */ IIlIIIIl I;
    private static String[] l;
    private static final /* synthetic */ IIlIIIIl[] II;
    private final IIIlIIIII Il;
    public static final /* enum */ IIlIIIIl lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0xC4C55D18 ^ n;
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

    private IIlIIIIl(String string2) {
        this.Il = StringFactory.lIl(string2);
    }

    public String toString() {
        return this.Il.IIII();
    }

    public static IIlIIIIl l(String string) {
        return Enum.valueOf(IIlIIIIl.class, string);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 13026;
        var7_1 = "\ufb0f\u11a0\u6e21\u534b\u957b\ub49c\u57eb\uc73b\u308c\u8e57\udff0\uae11\u621b\uf7f8\u7ca2\u0a85\u9714\uf79d\ub034\ubf9f\u8425\u8a8e\ua500\ud063\ud48b\ubd9f\u0a4e\u7c2e";
        var8_2 = "\u32ea\u32ea\u32e4\u32e4".toCharArray();
        var9_6 = new String[var8_2.length];
        var13_10 = -1;
        ** GOTO lbl37
lbl7:
        // 1 sources

        while (true) {
            var3_14 = 0;
            var4_15 = 0;
            if (true) ** GOTO lbl24
            break;
        }
lbl11:
        // 1 sources

        while (true) {
            var14_11 = var7_1.substring(var11_8, var11_8 + var12_9).toCharArray();
            var15_12 = 0;
            if (true) ** GOTO lbl54
            break;
        }
lbl15:
        // 1 sources

        while (true) {
            var0_3 = "\u008b\u0087!\"#\u00den\u00b4\u00d9<$\u00c627\u00ea5\u0099O\u00a1\u00c1}\u00cf\u00b8\u001d".getBytes("ISO-8859-1");
            var1_4 = var0_3.length / 4;
            IIlIIIIl.ll = new int[var1_4];
            ** continue;
            break;
        }
        while (true) {
            IIlIIIIl.ll[var4_15] = var5_16 ^= var2_5;
            var3_14 += 4;
            if (++var4_15 >= var1_4) break;
lbl24:
            // 2 sources

            var5_16 = (var0_3[var3_14] & 255) << 24 | (var0_3[var3_14 + 1] & 255) << 16 | (var0_3[var3_14 + 2] & 255) << 8 | var0_3[var3_14 + 3] & 255;
        }
        IIlIIIIl.l = new String[4];
        IIlIIIIl.Il();
        IIlIIIIl.I = new IIlIIIIl("Silent");
        IIlIIIIl.lI = new IIlIIIIl("Normal");
        IIlIIIIl.II = IIlIIIIl.II();
        return;
        while (true) {
            block15: {
                block14: {
                    var9_6[var10_7] = new String(var14_11).intern();
                    var11_8 += var12_9;
                    if (++var10_7 < var8_2.length) break block14;
                    var13_10 = 0;
lbl37:
                    // 2 sources

                    var10_7 = 0;
                    var11_8 = 0;
                    var12_9 = 0;
                    if (var13_10 == 0) break block15;
                }
                var12_9 = var8_2[var10_7] ^ var6;
                ** continue;
            }
            IIlIIIIl.III = var9_6;
            IIlIIIIl.IIl = new Object[var9_6.length];
            var2_5 = 1575591737;
            ** continue;
            break;
        }
        block11: while (true) {
            var16_13 = v0;
            v1 = var15_12++;
            var14_11[v1] = (char)(var14_11[v1] ^ var16_13);
            if (var15_12 >= var14_11.length) ** continue;
lbl54:
            // 2 sources

            switch (var15_12 % 5) {
                case 4: {
                    v0 = 89;
                    continue block11;
                }
                case 1: {
                    v0 = 38;
                    continue block11;
                }
                default: {
                    v0 = 86;
                    continue block11;
                }
                case 2: {
                    v0 = 89;
                    continue block11;
                }
                case 3: 
            }
            v0 = 120;
        }
    }

    private static /* synthetic */ IIlIIIIl[] II() {
        return new IIlIIIIl[]{I, lI};
    }

    public static IIlIIIIl[] values() {
        return (IIlIIIIl[])II.clone();
    }

    private static void Il() {
        IIlIIIIl.l[0] = IIlIIIIl.I(IIlIIIIl.ll(38010, '\ud611', -1147713581).toCharArray(), 48741L, -37902515);
        IIlIIIIl.l[1] = IIlIIIIl.I(IIlIIIIl.ll(21840, '\ud610', 1271495470).toCharArray(), 95311L, -1631324989);
        IIlIIIIl.l[2] = IIlIIIIl.I(IIlIIIIl.ll(16151, '\ud613', -565178504).toCharArray(), 78874L, -260142997);
        IIlIIIIl.l[3] = IIlIIIIl.I(IIlIIIIl.ll(13496, '\ud612', -1233161818).toCharArray(), 86891L, -1022758740);
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0x960D668B] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, char c, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0xD611;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            IIlIIIIl.IIl[n3] = stackTraceElementArray = new Throwable().getStackTrace();
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x103B;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 15717;
            n7 ^= 0xACA4;
            n7 -= 42111;
            cArray[n6] = (char)((n7 += 30804) ^ n4 ^ n ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

