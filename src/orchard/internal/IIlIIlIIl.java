/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIlIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Fatal Only
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
public final class IIlIIlIIl
extends Enum<IIlIIlIIl> {
    public static final /* enum */ IIlIIlIIl I;
    private static final /* synthetic */ IIlIIlIIl[] l;
    public static final /* enum */ IIlIIlIIl II;
    private final IIIlIIIII Il;
    private static final String[] lI;
    private static final Object[] ll;

    private IIlIIlIIl(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    public static IIlIIlIIl[] values() {
        return (IIlIIlIIl[])l.clone();
    }

    public static IIlIIlIIl valueOf(String string) {
        return Enum.valueOf(IIlIIlIIl.class, string);
    }

    public String toString() {
        return this.Il.IIII();
    }

    private static /* synthetic */ IIlIIlIIl[] I() {
        return new IIlIIlIIl[]{II, I};
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block10: {
            var0 = 10344;
            var1_1 = "\ue97f\ue98f\ue917\ue965\ue933\ue991\uff60\ufeee\uff25\ufee9\uff29\uff44\ufee6\ufeaa\udf0a\udf10\udf62\udf15\udf74\udf55\udf3a\udf78\udf3a\udf03\uf29c\uf285\uede6\ued97\uedd0\uedb8\ued9e\ued88\uf276\uf266\ueda3\uf277\ued8b\ueda7\uedad\uedf9";
            var2_2 = "\u286e\u2860\u2862\u2878".toCharArray();
            var3_3 = new String[var2_2.length];
            var7_7 = -1;
lbl6:
            // 2 sources

            while (true) {
                var4_4 = 0;
                var5_5 = 0;
                var6_6 = 0;
                if (var7_7 != 0) ** GOTO lbl17
                break block10;
                break;
            }
lbl-1000:
            // 1 sources

            {
                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                if (++var4_4 >= var2_2.length) {
                    var7_7 = 0;
                    ** continue;
                }
lbl17:
                // 3 sources

                var6_6 = var2_2[var4_4] ^ var0;
                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
                do {
                    switch (var9_9 % 5) {
                        case 2: {
                            v0 = 70;
                            break;
                        }
                        case 1: {
                            v0 = 3;
                            break;
                        }
                        default: {
                            v0 = 28;
                            break;
                        }
                        case 3: {
                            v0 = 6;
                            break;
                        }
                        case 4: {
                            v0 = 72;
                        }
                    }
                    var10_10 = v0;
                    v1 = var9_9++;
                    var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                } while (var9_9 < var8_8.length);
                ** while (true)
            }
        }
        IIlIIlIIl.lI = var3_3;
        IIlIIlIIl.ll = new Object[var3_3.length];
        IIlIIlIIl.II = new IIlIIlIIl(StringFactory.IIII("Always"));
        IIlIIlIIl.I = new IIlIIlIIl(StringFactory.IIII("Fatal Only"));
        IIlIIlIIl.l = IIlIIlIIl.I();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x4EB;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlIIlIIl.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6202;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 1008;
            n6 ^= 0x2D70;
            n6 ^= 0x6F2D;
            n6 -= 10057;
            n6 ^= 0x26B2;
            n6 += 54529;
            n6 -= 1945;
            n6 ^= 0x8E9F;
            cArray[n5] = (char)((n6 ^= 0xE1C7) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

