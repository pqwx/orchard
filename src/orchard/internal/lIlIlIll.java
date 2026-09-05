/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIlIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Custom
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
final class lIlIlIll
extends Enum<lIlIlIll> {
    public static final /* enum */ lIlIlIll I;
    private static final /* synthetic */ lIlIlIll[] l;
    public static final /* enum */ lIlIlIll II;
    private final IIIlIIIII Il;
    private static final String[] lI;
    private static final Object[] ll;

    private static /* synthetic */ lIlIlIll[] I() {
        return new lIlIlIll[]{I, II};
    }

    public String toString() {
        return this.Il.IIII();
    }

    private lIlIlIll(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block8: {
            var0 = 1536;
            var1_1 = "\u7523\u75a5\u7538\u755e\udb58\ue64d\ue6ca\udae5\udb4f\udb0e\ue650\ue63e\uad76\uadec\uad14\uad60\uad16\uace8\u89bf\u9646\u89a2\u89e3\u9607\u89ec\u89b8\u89d9";
            var2_2 = "\u0004\b\u0006\b".toCharArray();
            var3_3 = new String[var2_2.length];
            var7_7 = -1;
            break block8;
            var7_7 = 0;
        }
        var4_4 = 0;
        var5_5 = 0;
        var6_6 = '\u0000';
        if (var7_7 == 0) {
            lIlIlIll.lI = var3_3;
            lIlIlIll.ll = new Object[var3_3.length];
            lIlIlIll.I = new lIlIlIll(StringFactory.IIII("Sync"));
            lIlIlIll.II = new lIlIlIll(StringFactory.IIII("Custom"));
            lIlIlIll.l = lIlIlIll.I();
            return;
        }
lbl19:
        // 3 sources

        var6_6 = var2_2[var4_4];
        var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
        var9_9 = 0;
        do {
            switch (var9_9 % 5) {
                case 4: {
                    v0 = 5;
                    break;
                }
                case 2: {
                    v0 = 67;
                    break;
                }
                default: {
                    v0 = 17;
                    break;
                }
                case 1: {
                    v0 = 45;
                    break;
                }
                case 3: {
                    v0 = 60;
                }
            }
            var10_10 = v0;
            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
        } while (var9_9 < var8_8.length);
        var3_3[var4_4] = new String(var8_8).intern();
        var5_5 += var6_6;
        if (++var4_4 < var2_2.length) ** GOTO lbl19
    }

    public static lIlIlIll l(String string) {
        return Enum.valueOf(lIlIlIll.class, string);
    }

    public static lIlIlIll[] values() {
        return (lIlIlIll[])l.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(short s, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0x7DF1;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIlIlIll.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x766D;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 11051;
            n7 ^= 0xEE2F;
            n7 -= 62169;
            n7 -= 43481;
            n7 += 54220;
            n7 ^= 0x75AD;
            cArray[n6] = (char)((n7 -= 54729) ^ n4 ^ s ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

