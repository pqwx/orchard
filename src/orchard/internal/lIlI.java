/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Separate
 *   - Singular
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
final class lIlI
extends Enum<lIlI> {
    private static final /* synthetic */ lIlI[] I;
    private final IIIlIIIII l;
    public static final /* enum */ lIlI II;
    public static final /* enum */ lIlI Il;
    private static final String[] lI;
    private static final Object[] ll;

    private static /* synthetic */ lIlI[] I() {
        return new lIlI[]{II, Il};
    }

    public String toString() {
        return this.l.IIII();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block1: {
            var0 = 32760;
            var1_1 = "\u5007\u5035\u500a\u5039\u5008\u5039\u5006\u5035\u4814\u48d8\u4809\u4808\u48f1\u4834\u4817\u483a\u4835\u4805\u48ee\u4960\ud59f\ud5e9\ud5e4\ud5eb\ud59d\ud5e6\ud5f1\ud5a0\ue051\ue78d\ue791\ue001\ue075\ue04b\ue04a\ue000\u022d\u0231\ue78e\ue785";
            var2_2 = "\u7ff0\u7ff4\u7ff0\u7ff4".toCharArray();
            var3_3 = new String[var2_2.length];
            var7_7 = -1;
            break block1;
            var7_7 = 0;
        }
        var4_4 = 0;
        var5_5 = 0;
        var6_6 = 0;
        if (var7_7 == 0) {
            lIlI.lI = var3_3;
            lIlI.ll = new Object[var3_3.length];
            lIlI.II = new lIlI(StringFactory.IIII("Separate"));
            lIlI.Il = new lIlI(StringFactory.IIII("Singular"));
            lIlI.I = lIlI.I();
            return;
        }
lbl19:
        // 3 sources

        var6_6 = var2_2[var4_4] ^ var0;
        var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
        var5_5 += var6_6;
        if (++var4_4 < var2_2.length) ** GOTO lbl19
    }

    public static lIlI l(String string) {
        return Enum.valueOf(lIlI.class, string);
    }

    private lIlI(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    public static lIlI[] values() {
        return (lIlI[])I.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(short s, int n, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xC5EF;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            lIlI.ll[n2] = stackTraceElementArray = new Throwable().getStackTrace();
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x22F3;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x6C40;
            n6 -= 44323;
            n6 ^= 0x11E1;
            n6 += 10022;
            n6 ^= 0xEE07;
            n6 ^= 0xD938;
            cArray[n5] = (char)((n6 += 19478) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

