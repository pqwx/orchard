/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Scaffolding
 *   - Windcharge
 *   - Cobweb
 *   - Water
 *   - All
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
final class IIIIII
extends Enum<IIIIII> {
    public static final /* enum */ IIIIII I;
    private static final /* synthetic */ IIIIII[] l;
    public static final /* enum */ IIIIII II;
    public static final /* enum */ IIIIII Il;
    private final IIIlIIIII lI;
    public static final /* enum */ IIIIII ll;
    public static final /* enum */ IIIIII III;
    private static final String[] IIl;
    private static final Object[] IlI;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block11: {
            var0 = 28081;
            var1_1 = "\u487c\u486a\u4867\u4824\u4d4b\u4d7f\u4d7b\u4d4d\ubc2f\ubc22\ubc29\ubc7f\ubc61\u55ee\u5a12\u55c7\u55df\u559a\u55ed\u55fc\u5a2c\u65bc\u6599\u6590\u65ed\u65e3\u658b\u6591\u6594\u65ce\u65cd\u4e2b\u4987\u49cd\u499a\u49bf\u4e3b\u4e3a\u49e2\u4e76\u4e6b\u4997\u4e1b\u4e00\u4e4a\u498f\u49ec\u68ce\u6939\u68ea\u6890\u6943\u68cf\uae5c\uaa0f\uae78\uaedc\uaecb\uaa59\uaa4a\uaeba\u4e8d\u4eae\u4eba\u4ef2\u4ed3\u4eb9\u4ea9\u4e97\u4ee5\u4edb\u4eb1\ubab6\ua659\uba9e\ubaeb\ubad1\uba9f\ua67d\ua66b\ua60d\ua626\uba9e\ubaa9\ua660\ubaf5\ubadb\ua642";
            var2_2 = "\u0004\u0004\u0005\b\n\u0010\u0006\b\u000b\u0010".toCharArray();
            var3_3 = new String[var2_2.length];
            var7_7 = -1;
            break block11;
lbl7:
            // 2 sources

            while (true) {
                var6_6 = var2_2[var4_4];
                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
                if (true) ** GOTO lbl41
                break;
            }
        }
lbl13:
        // 2 sources

        while (true) {
            var4_4 = 0;
            var5_5 = 0;
            var6_6 = '\u0000';
            if (var7_7 != 0) ** GOTO lbl7
            IIIIII.IIl = var3_3;
            IIIIII.IlI = new Object[var3_3.length];
            IIIIII.Il = new IIIIII(StringFactory.IIII("All"));
            IIIIII.III = new IIIIII(StringFactory.IIII("Water"));
            IIIIII.II = new IIIIII(StringFactory.IIII("Windcharge"));
            IIIIII.ll = new IIIIII(StringFactory.IIII("Cobweb"));
            IIIIII.I = new IIIIII(StringFactory.IIII("Scaffolding"));
            IIIIII.l = IIIIII.l();
            return;
        }
lbl27:
        // 1 sources

        while (true) {
            var7_7 = 0;
            ** continue;
            break;
        }
        while (true) {
            var3_3[var4_4] = new String(var8_8).intern();
            var5_5 += var6_6;
            if (++var4_4 >= var2_2.length) ** break;
            ** continue;
            ** continue;
            break;
        }
        block10: while (true) {
            var10_10 = v0;
            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
            if (var9_9 >= var8_8.length) ** continue;
lbl41:
            // 2 sources

            switch (var9_9 % 5) {
                default: {
                    v0 = 101;
                    continue block10;
                }
                case 2: {
                    v0 = 64;
                    continue block10;
                }
                case 3: {
                    v0 = 39;
                    continue block10;
                }
                case 4: {
                    v0 = 6;
                    continue block10;
                }
                case 1: 
            }
            v0 = 118;
        }
    }

    private IIIIII(IIIlIIIII iIIlIIIII) {
        this.lI = iIIlIIIII;
    }

    public static IIIIII[] values() {
        return (IIIIII[])l.clone();
    }

    public static IIIIII I(String string) {
        return Enum.valueOf(IIIIII.class, string);
    }

    public String toString() {
        return this.lI.IIII();
    }

    private static /* synthetic */ IIIIII[] l() {
        return new IIIIII[]{Il, III, II, ll, I};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x12DE;
        char[] cArray = IIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIII.IlI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7A50;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 55690;
            n6 ^= 0xE618;
            n6 ^= 0x4C08;
            n6 -= 20834;
            n6 ^= 0xDB79;
            n6 ^= 0xDC90;
            n6 += 6991;
            n6 += 20580;
            n6 -= 21708;
            cArray[n5] = (char)((n6 += 55681) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

