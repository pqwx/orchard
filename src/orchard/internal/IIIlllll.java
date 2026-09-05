/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlllll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Silent
 *   - Legit
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
public final class IIIlllll
extends Enum<IIIlllll> {
    private static final /* synthetic */ IIIlllll[] I;
    public static final /* enum */ IIIlllll l;
    private final IIIlIIIII II;
    public static final /* enum */ IIIlllll Il;
    private static final String[] lI;
    private static final Object[] ll;

    public static IIIlllll I(String string) {
        return Enum.valueOf(IIIlllll.class, string);
    }

    private static /* synthetic */ IIIlllll[] l() {
        return new IIIlllll[]{l, Il};
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 18996;
        var1_1 = "\u3d4e\u3c93\u3ce1\u3c9d\u3ca8\u3d52\uc1e1\uc122\uc163\uc0b4\uc1d8\uc09d\uc08a\uc095\u89ae\u89c6\u89b5\u8990\u898b\u36d3\u31be\u31c7\u31ce\u36d6\u31e5\u3617\u36ef";
        var2_2 = "\u0006\b\u0005\b".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        ** GOTO lbl12
        while (true) {
            block13: {
                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                if (++var4_4 < var2_2.length) break block13;
                var7_7 = 0;
lbl12:
                // 2 sources

                var4_4 = 0;
                var5_5 = 0;
                var6_6 = '\u0000';
                if (var7_7 == 0) {
                    IIIlllll.lI = var3_3;
                    IIIlllll.ll = new Object[var3_3.length];
                    IIIlllll.l = new IIIlllll(StringFactory.IIII("Silent"));
                    IIIlllll.Il = new IIIlllll(StringFactory.IIII("Legit"));
                    IIIlllll.I = IIIlllll.l();
                    return;
                }
            }
            var6_6 = var2_2[var4_4];
            var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
            var9_9 = 0;
            if (true) ** GOTO lbl32
            break;
        }
        block8: while (true) {
            var10_10 = v0;
            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
            if (var9_9 >= var8_8.length) ** continue;
lbl32:
            // 2 sources

            switch (var9_9 % 6) {
                case 2: {
                    v0 = 55;
                    continue block8;
                }
                case 5: {
                    v0 = 108;
                    continue block8;
                }
                case 4: {
                    v0 = 120;
                    continue block8;
                }
                case 3: {
                    v0 = 72;
                    continue block8;
                }
                default: {
                    v0 = 117;
                    continue block8;
                }
                case 1: 
            }
            v0 = 74;
        }
    }

    public String toString() {
        return this.II.IIII();
    }

    public static IIIlllll[] values() {
        return (IIIlllll[])I.clone();
    }

    private IIIlllll(IIIlIIIII iIIlIIIII) {
        this.II = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x2D35;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIlllll.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x226E;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 46808;
            n6 -= 42890;
            n6 ^= 0x5A97;
            n6 ^= 0xA10B;
            cArray[n5] = (char)((n6 -= 45863) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

