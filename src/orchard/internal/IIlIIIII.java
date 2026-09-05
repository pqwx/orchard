/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Last hit
 *   - Anyone
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
final class IIlIIIII
extends Enum<IIlIIIII> {
    public static final /* enum */ IIlIIIII I;
    private static final /* synthetic */ IIlIIIII[] l;
    public static final /* enum */ IIlIIIII II;
    private final IIIlIIIII Il;
    private static final String[] lI;
    private static final Object[] ll;

    private static /* synthetic */ IIlIIIII[] I() {
        return new IIlIIIII[]{II, I};
    }

    private IIlIIIII(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    public static IIlIIIII[] values() {
        return (IIlIIIII[])l.clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block21: {
                block22: {
                    block19: {
                        var0 = 3269;
                        ** GOTO lbl39
lbl3:
                        // 1 sources

                        while (true) {
                            var5_5 = 0;
                            ** GOTO lbl58
                            break;
                        }
lbl6:
                        // 1 sources

                        while (true) {
                            IIlIIIII.I = new IIlIIIII(StringFactory.IIII("Last hit"));
                            ** GOTO lbl63
                            break;
                        }
lbl9:
                        // 1 sources

                        block9: while (true) {
                            var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                            var9_9 = 0;
                            block10: while (true) {
                                switch (var9_9 % 6) {
                                    case 1: {
                                        v0 = 87;
                                        break block9;
                                    }
lbl17:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = -1;
                                        break block19;
                                        break;
                                    }
lbl20:
                                    // 1 sources

                                    while (var7_7 == 0) {
                                        ** GOTO lbl53
                                    }
                                    break block20;
lbl23:
                                    // 1 sources

                                    continue block10;
lbl25:
                                    // 1 sources

                                    while (true) {
                                        var3_3[var4_4] = new String(var8_8).intern();
                                        break block21;
                                        break;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        v1 = var9_9++;
                                        var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                                        ** continue;
                                        break;
                                    }
                                    if (var9_9 < var8_8.length) continue block10;
                                    ** continue;
lbl34:
                                    // 1 sources

                                    while (true) {
                                        ** GOTO lbl47
                                        break;
                                    }
                                    case 4: {
                                        v0 = 39;
                                        break block9;
                                    }
lbl39:
                                    // 1 sources

                                    var1_1 = "\ued50\ued62\uedf5\ued4b\ued12\ued0c\ue0da\ue0d8\ue092\ue0bc\ue179\ue087\ue0cb\ue0c1\ueefe\ueec2\ueee8\ueebf\ueee0\ueeaa\ueefb\uee97\u2434\u247f\u245f\u2459\u24a0\u2412\u242c\u24d3\u245e\u2410\u24a2\u23ad";
                                    ** GOTO lbl44
lbl41:
                                    // 1 sources

                                    while (true) {
                                        IIlIIIII.ll = new Object[var3_3.length];
                                        break block22;
                                        break;
                                    }
lbl44:
                                    // 1 sources

                                    var2_2 = "\u0cc3\u0ccd\u0ccd\u0cc9".toCharArray();
                                    var3_3 = new String[var2_2.length];
                                    ** continue;
lbl47:
                                    // 1 sources

                                    if (++var4_4 < var2_2.length) break block20;
                                    var7_7 = 0;
                                    break block19;
                                    case 2: {
                                        v0 = 43;
                                        break block9;
                                    }
lbl53:
                                    // 1 sources

                                    IIlIIIII.lI = var3_3;
                                    ** continue;
                                    case 5: {
                                        v0 = 54;
                                        break block9;
                                    }
lbl58:
                                    // 1 sources

                                    var6_6 = 0;
                                    ** GOTO lbl20
                                    default: {
                                        v0 = 102;
                                        break block9;
                                    }
lbl63:
                                    // 1 sources

                                    IIlIIIII.l = IIlIIIII.I();
                                    return;
                                }
                                break;
                            }
                            break;
                        }
lbl65:
                        // 6 sources

                        while (true) {
                            var10_10 = v0;
                            ** continue;
                            break;
                        }
                    }
                    var4_4 = 0;
                    ** while (true)
                }
                IIlIIIII.II = new IIlIIIII(StringFactory.IIII("Anyone"));
                ** while (true)
                {
                    ** case 3:
                }
lbl75:
                // 1 sources

                v0 = 127;
                ** while (true)
            }
            var5_5 += var6_6;
            ** while (true)
        }
        var6_6 = var2_2[var4_4] ^ var0;
        ** while (true)
    }

    public static IIlIIIII l(String string) {
        return Enum.valueOf(IIlIIIII.class, string);
    }

    public String toString() {
        return this.Il.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(short s, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0x123F;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlIIIII.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2D99;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 64650;
            n7 ^= 0xA467;
            n7 ^= 0x2FC4;
            n7 += 17880;
            n7 += 19956;
            n7 ^= 0x1E14;
            cArray[n6] = (char)((n7 ^= 0x9FEB) ^ n4 ^ s ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

