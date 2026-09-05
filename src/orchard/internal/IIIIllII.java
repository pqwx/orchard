/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Last hit
 *   - Closest
 *   - Health
 *   - Fov
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
final class IIIIllII
extends Enum<IIIIllII> {
    public static final /* enum */ IIIIllII I;
    public static final /* enum */ IIIIllII l;
    public static final /* enum */ IIIIllII II;
    private static final /* synthetic */ IIIIllII[] Il;
    private final IIIlIIIII lI;
    public static final /* enum */ IIIIllII ll;
    private static final String[] III;
    private static final Object[] IIl;

    private IIIIllII(IIIlIIIII iIIlIIIII) {
        this.lI = iIIlIIIII;
    }

    private static /* synthetic */ IIIIllII[] I() {
        return new IIIIllII[]{I, ll, II, l};
    }

    public static IIIIllII[] values() {
        return (IIIIllII[])Il.clone();
    }

    public static IIIIllII l(String string) {
        return Enum.valueOf(IIIIllII.class, string);
    }

    public String toString() {
        return this.lI.IIII();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block21: {
                var0 = 6996;
                ** GOTO lbl56
lbl3:
                // 1 sources

                while (true) {
                    v0 = 40;
                    break block20;
                    break;
                }
lbl6:
                // 1 sources

                while (true) {
                    var2_2 = "\u0003\u0004\u0007\f\u0006\b\b\f".toCharArray();
                    ** GOTO lbl70
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    if (++var4_4 < var2_2.length) ** GOTO lbl62
                    ** GOTO lbl73
lbl12:
                    // 1 sources

                    while (true) {
                        IIIIllII.Il = IIIIllII.I();
                        return;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        IIIIllII.l = new IIIIllII(StringFactory.IIII("Last hit"));
                        ** continue;
                        break;
                    }
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    if (var9_9 < var8_8.length) break block21;
                    ** GOTO lbl75
                    break;
                }
lbl21:
                // 1 sources

                while (true) {
                    var6_6 = '\u0000';
                    ** GOTO lbl58
lbl24:
                    // 1 sources

                    while (true) {
                        var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                        var9_9 = 0;
                        break block21;
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    v1 = var9_9++;
                    var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
                    ** GOTO lbl61
                    break;
                }
                IIIIllII.ll = new IIIIllII(StringFactory.IIII("Closest"));
                IIIIllII.II = new IIIIllII(StringFactory.IIII("Health"));
                ** while (true)
            }
            switch (var9_9 % 5) {
                case 4: {
                    ** continue;
                }
lbl41:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
                case 3: {
                    v0 = 19;
                    break;
                }
                IIIIllII.III = var3_3;
                ** GOTO lbl53
lbl48:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
                default: {
                    v0 = 109;
                    break;
                }
lbl53:
                // 1 sources

                IIIIllII.IIl = new Object[var3_3.length];
                IIIIllII.I = new IIIIllII(StringFactory.IIII("Fov"));
                ** continue;
lbl56:
                // 1 sources

                var1_1 = "\u978c\u97be\u9783\u3430\u3459\u3439\u3433\ud306\ud346\ud31d\ud368\ud341\ud316\ud34e\u7cd6\u7355\u7cdc\u7343\u7c80\u7cd3\u7c90\u7cb9\u7cd3\u7cdf\u731e\u735d\u10a1\u10e7\u10af\u10db\u10e8\u10a1\u2c89\u2c1b\u2c7b\u2c0a\u2cc4\u2c67\u2c14\u2c9b\u7642\u7604\u7656\u7634\u7610\u764e\u760c\u7655\u4d46\u4d7f\u4d2f\u4d4c\u4d16\u4d40\u4d1d\u4d7f\u4d67\u4d5e\u4d49\u4dcc";
                ** continue;
lbl58:
                // 1 sources

                if (var7_7 == 0) {
                    ** continue;
                }
                ** GOTO lbl62
lbl61:
                // 1 sources

                ** continue;
lbl62:
                // 2 sources

                var6_6 = var2_2[var4_4];
                ** continue;
                var4_4 = 0;
                var5_5 = 0;
                ** continue;
                case 2: {
                    v0 = 114;
                    break;
                }
lbl70:
                // 1 sources

                var3_3 = new String[var2_2.length];
                var7_7 = -1;
                ** GOTO lbl48
lbl73:
                // 1 sources

                var7_7 = 0;
                ** continue;
lbl75:
                // 1 sources

                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                ** continue;
            }
        }
lbl79:
        // 2 sources

        while (true) {
            var10_10 = v0;
            ** continue;
            break;
        }
        {
            ** case 1:
        }
lbl83:
        // 1 sources

        v0 = 46;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xD120;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIllII.IIl[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7DF0;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 11781;
            n6 ^= 0xC6ED;
            n6 ^= 0x26E1;
            n6 ^= 0xD909;
            n6 ^= 0xD531;
            n6 += 51661;
            cArray[n5] = (char)((n6 += 63250) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

