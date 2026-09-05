/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - W-Tap
 *   - S-Tap
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
public final class lIllll
extends Enum<lIllll> {
    private final IIIlIIIII I;
    public static final /* enum */ lIllll l;
    private static final /* synthetic */ lIllll[] II;
    public static final /* enum */ lIllll Il;
    private static final String[] lI;
    private static final Object[] ll;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 21247;
        var1_1 = "\u5379\u52b2\u5290\u52f2\u5304\u4a78\u7e44\u4a00\u4a24\u4a22\u4a0b\u4a4d\u7e40\u2650\u2657\u2605\u266f\u2639\u6bc4\u6bcf\u6b9b\u6bf7\u6ba9\u6bf0\u6bd6\u6bc3";
        var2_2 = "\u52fa\u52f7\u52fa\u52f7".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        ** GOTO lbl9
        while (true) {
            var7_7 = 0;
lbl9:
            // 2 sources

            var4_4 = 0;
            var5_5 = 0;
            var6_6 = 0;
            if (var7_7 != 0) ** GOTO lbl26
            lIllll.lI = var3_3;
            lIllll.ll = new Object[var3_3.length];
            lIllll.l = new lIllll(StringFactory.IIII("W-Tap"));
            lIllll.Il = new lIllll(StringFactory.IIII("S-Tap"));
            lIllll.II = lIllll.I();
            return;
        }
lbl-1000:
        // 6 sources

        {
            block11: {
                var10_10 = v0;
                v1 = var9_9++;
                var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                if (var9_9 < var8_8.length) break block11;
                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                if (++var4_4 >= var2_2.length) ** continue;
lbl26:
                // 2 sources

                var6_6 = var2_2[var4_4] ^ var0;
                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
            }
            switch (var9_9 % 6) {
                case 2: {
                    v0 = 69;
                    continue block8;
                }
                case 1: {
                    v0 = 96;
                    continue block8;
                }
                case 4: {
                    v0 = 125;
                    continue block8;
                }
                case 3: {
                    v0 = 38;
                    continue block8;
                }
                case 5: {
                    v0 = 71;
                    continue block8;
                }
            }
            v0 = 19;
            ** while (true)
        }
    }

    private lIllll(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    public String toString() {
        return this.I.IIII();
    }

    public static lIllll[] values() {
        return (lIllll[])II.clone();
    }

    private static /* synthetic */ lIllll[] I() {
        return new lIllll[]{l, Il};
    }

    public static lIllll l(String string) {
        return Enum.valueOf(lIllll.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xD1A4;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIllll.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5F8A;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0xBBF0;
            n7 ^= 0x6586;
            n7 -= 14696;
            n7 -= 14645;
            n7 ^= 0x87B9;
            n7 += 5105;
            n7 ^= 0xEBB9;
            n7 ^= 0xEDA3;
            n7 -= 29293;
            cArray[n6] = (char)((n7 -= 25817) ^ n4 ^ s ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

