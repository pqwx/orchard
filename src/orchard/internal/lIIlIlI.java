/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Distance
 *   - Health
 *   - FOV
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
public final class lIIlIlI
extends Enum<lIIlIlI> {
    public static final /* enum */ lIIlIlI I;
    public static final /* enum */ lIIlIlI l;
    private static final /* synthetic */ lIIlIlI[] II;
    private final IIIlIIIII Il;
    public static final /* enum */ lIIlIlI lI;
    private static final String[] ll;
    private static final Object[] III;

    public static lIIlIlI[] values() {
        return (lIIlIlI[])II.clone();
    }

    public static lIIlIlI valueOf(String string) {
        return Enum.valueOf(lIIlIlI.class, string);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 7697;
        var1_1 = "\u2c3d\u2c3e\u2ebb\u1149\u1167\u1129\u1108\u658a\u6595\u65e5\u65f4\u627f\u65d3\u08d2\u08e9\u08c1\u088d\u08f3\u08dd\u0614\u0885\u2bbd\u2ba2\u2800\u2827\u2b91\u2bf2\u2ba6\u2ba6\ua247\ua269\ua5e2\ua20f\ua275\ua25a\ua245\ua279\ua20e\ua21f\ua273\ua5c9";
        var2_2 = "\u0003\u0004\u0006\b\b\f".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_4 = -1;
        ** GOTO lbl12
        while (true) {
            block13: {
                var3_3[var4_5] = new String(var8_8).intern();
                var5_6 += var6_7;
                if (++var4_5 < var2_2.length) break block13;
                var7_4 = 0;
lbl12:
                // 2 sources

                var4_5 = 0;
                var5_6 = 0;
                var6_7 = '\u0000';
                if (var7_4 == 0) {
                    lIIlIlI.ll = var3_3;
                    lIIlIlI.III = new Object[var3_3.length];
                    lIIlIlI.lI = new lIIlIlI(StringFactory.IIII("FOV"));
                    lIIlIlI.l = new lIIlIlI(StringFactory.IIII("Health"));
                    lIIlIlI.I = new lIIlIlI(StringFactory.IIII("Distance"));
                    lIIlIlI.II = lIIlIlI.I();
                    return;
                }
            }
            var6_7 = var2_2[var4_5];
            var8_8 = var1_1.substring(var5_6, var5_6 + var6_7).toCharArray();
            var9_9 = 0;
            if (true) ** GOTO lbl33
            break;
        }
        block8: while (true) {
            var10_10 = v0;
            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
            if (var9_9 >= var8_8.length) ** continue;
lbl33:
            // 2 sources

            switch (var9_9 % 6) {
                case 3: {
                    v0 = 44;
                    continue block8;
                }
                default: {
                    v0 = 70;
                    continue block8;
                }
                case 4: {
                    v0 = 111;
                    continue block8;
                }
                case 1: {
                    v0 = 84;
                    continue block8;
                }
                case 2: {
                    v0 = 48;
                    continue block8;
                }
                case 5: 
            }
            v0 = 31;
        }
    }

    public String toString() {
        return this.Il.IIII();
    }

    private static /* synthetic */ lIIlIlI[] I() {
        return new lIIlIlI[]{lI, l, I};
    }

    private lIIlIlI(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x13C6;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIlIlI.III[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6D5E;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 49795;
            n6 ^= 0xE4FF;
            n6 ^= 0x1FBC;
            n6 ^= 0xB1A8;
            cArray[n5] = (char)((n6 += 59211) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

