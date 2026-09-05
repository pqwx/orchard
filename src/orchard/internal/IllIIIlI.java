/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIIIlI
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
public final class IllIIIlI
extends Enum<IllIIIlI> {
    public static final /* enum */ IllIIIlI I;
    private final IIIlIIIII l;
    public static final /* enum */ IllIIIlI II;
    private static final /* synthetic */ IllIIIlI[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    private static /* synthetic */ IllIIIlI[] I() {
        return new IllIIIlI[]{II, I};
    }

    public String toString() {
        return this.l.IIII();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block22: {
                block23: {
                    break block23;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl3:
                    // 1 sources

                    while (true) {
                        var7_7 = -1;
                        ** GOTO lbl67
                        break;
                    }
                    v0 = var9_9++;
                    var8_8[v0] = (char)(var8_8[v0] ^ var10_10);
                    ** GOTO lbl64
lbl9:
                    // 1 sources

                    while (true) {
                        IllIIIlI.Il = IllIIIlI.I();
                        return;
                    }
lbl12:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl16:
                    // 1 sources

                    while (true) {
                        if (++var4_4 < var2_2.length) ** GOTO lbl12
                        break block22;
                        break;
                    }
lbl19:
                    // 1 sources

                    while (true) {
                        v1 = 36;
                        ** GOTO lbl80
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        v1 = 121;
                        ** GOTO lbl80
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var5_5 += var6_6;
                        ** GOTO lbl66
                        break;
                    }
                    IllIIIlI.lI = var3_3;
                    IllIIIlI.ll = new Object[var3_3.length];
                    ** GOTO lbl76
lbl33:
                    // 1 sources

                    while (true) {
                        var3_3 = new String[var2_2.length];
                        ** continue;
                        break;
                    }
                    var6_6 = var2_2[var4_4] ^ var0;
                    break block24;
                    var6_6 = 0;
                    if (var7_7 == 0) ** break;
                    ** while (true)
                    ** while (true)
lbl42:
                    // 1 sources

                    while (true) {
                        v1 = 53;
                        ** GOTO lbl80
                        break;
                    }
                }
                var0 = 3791;
                var1_1 = "\ue32b\ue38c\ue3fa\ue391\ue3dc\ue365\ufd93\ufe0a\ufe4d\ufde7\ufe05\ufde9\ufe46\ufe3b\ud61c\ud640\ud67e\ud653\ud619\ud657\u1d24\u1d17\u1d48\u2048\u1d56\u20b8\u1d50\u1d00";
                var2_2 = "\u0ec9\u0ec7\u0ec9\u0ec7".toCharArray();
                ** while (true)
            }
            var7_7 = 0;
            ** GOTO lbl67
        }
        var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
        var9_9 = 0;
        block19: while (true) {
            switch (var9_9 % 6) {
                case 1: {
                    ** continue;
                }
                default: {
                    ** continue;
                }
                case 3: {
                    ** continue;
                }
lbl64:
                // 1 sources

                if (var9_9 < var8_8.length) continue block19;
                ** GOTO lbl78
lbl66:
                // 1 sources

                ** continue;
lbl67:
                // 2 sources

                var4_4 = 0;
                var5_5 = 0;
                ** continue;
lbl70:
                // 1 sources

                while (true) {
                    IllIIIlI.I = new IllIIIlI(StringFactory.IIII("Legit"));
                    ** continue;
                    break;
                }
                case 4: {
                    v1 = 67;
                    ** GOTO lbl80
                }
lbl76:
                // 1 sources

                IllIIIlI.II = new IllIIIlI(StringFactory.IIII("Silent"));
                ** continue;
lbl78:
                // 1 sources

                var3_3[var4_4] = new String(var8_8).intern();
                ** continue;
lbl80:
                // 6 sources

                while (true) {
                    var10_10 = v1;
                    ** continue;
                    break;
                }
                case 2: {
                    v1 = 103;
                    ** GOTO lbl80
                }
                case 5: 
            }
            break;
        }
        v1 = 48;
        ** while (true)
    }

    private IllIIIlI(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    public static IllIIIlI valueOf(String string) {
        return Enum.valueOf(IllIIIlI.class, string);
    }

    public IIIlIIIII l() {
        return this.l;
    }

    public static IllIIIlI[] values() {
        return (IllIIIlI[])Il.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x570;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IllIIIlI.ll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2829;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 52791;
            n7 -= 56267;
            n7 += 14565;
            n7 += 63507;
            n7 ^= 0x11EF;
            n7 += 13328;
            n7 += 43328;
            n7 ^= 0x6166;
            n7 -= 35779;
            cArray[n6] = (char)((n7 -= 54219) ^ n4 ^ c ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

