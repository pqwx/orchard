/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - PvPTiers Style
 *   - Uku Style
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
public final class IIIllllI
extends Enum<IIIllllI> {
    public static final /* enum */ IIIllllI I;
    public static final /* enum */ IIIllllI l;
    private final IIIlIIIII II;
    private static final /* synthetic */ IIIllllI[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    public IIIlIIIII I() {
        return this.II;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block24: {
                block22: {
                    block23: {
                        block21: {
                            break block21;
lbl1:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var0 = 15236;
                        break block22;
                        IIIllllI.ll = new Object[var3_1.length];
                        break block23;
lbl8:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl10:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            v0 = 70;
                            break block20;
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            var7_7 = -1;
                            ** GOTO lbl10
                            break;
                        }
                    }
                    IIIllllI.I = new IIIllllI(StringFactory.IIII("Uku Style"));
                    IIIllllI.l = new IIIllllI(StringFactory.IIII("PvPTiers Style"));
                    ** GOTO lbl56
                    var4_4 = 0;
                    var5_5 = 0;
                    ** GOTO lbl69
                    var6_6 = var2_3[var4_4] ^ var0;
                    break block24;
lbl27:
                    // 1 sources

                    while (true) {
                        v0 = 99;
                        break block20;
                        break;
                    }
                }
                var1_2 = "\u55ee\u55d0\u5525\uf033\uf03b\uf0b3\uf0dc\uf0cf\uf07f\uf048\uf07a\uf0cf\uf082\uf0a3\uf025\ueda4\ued82\ued6f\ued7f\ued00\uedcc\ueddf\uedd8\u7d34\u7d2c\u7dc4\u7df1\u7d89\u7d7a\u7d7e\u7d69\u7dc9\u7db3\u7dcb\u7d2a\u7ddf\u7d1f\u7dc3\u7db2\u7da7\u7d5f\u7d86\u7d6d";
                var2_3 = "\u3b87\u3b88\u3b8c\u3b90".toCharArray();
                ** GOTO lbl62
            }
            var8_8 = var1_2.substring(var5_5, var5_5 + var6_6).toCharArray();
            var9_9 = 0;
            block12: while (true) {
                switch (var9_9 % 5) {
                    case 4: {
                        ** continue;
                    }
                    case 1: {
                        ** continue;
                    }
lbl43:
                    // 1 sources

                    while (true) {
                        if (var7_7 != 0) ** GOTO lbl8
                        ** GOTO lbl80
                        break;
                    }
lbl46:
                    // 1 sources

                    while (true) {
                        if (++var4_4 >= var2_3.length) ** break;
                        ** continue;
                        ** GOTO lbl64
                        break;
                    }
lbl50:
                    // 1 sources

                    while (true) {
                        if (var9_9 < var8_8.length) continue block12;
                        ** GOTO lbl78
                        break;
                    }
                    case 3: {
                        v0 = 120;
                        break block12;
                    }
lbl56:
                    // 1 sources

                    IIIllllI.Il = IIIllllI.II();
                    return;
lbl58:
                    // 1 sources

                    while (true) {
                        ** continue;
                        break;
                    }
lbl60:
                    // 1 sources

                    while (true) {
                        ** continue;
                        break;
                    }
lbl62:
                    // 1 sources

                    var3_1 = new String[var2_3.length];
                    ** continue;
lbl64:
                    // 1 sources

                    var7_7 = 0;
                    ** continue;
lbl66:
                    // 1 sources

                    while (true) {
                        var5_5 += var6_6;
                        ** continue;
                        break;
                    }
lbl69:
                    // 1 sources

                    var6_6 = 0;
                    ** continue;
lbl71:
                    // 1 sources

                    while (true) {
                        v1 = var9_9++;
                        var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                        ** continue;
                        break;
                    }
                    case 2: {
                        v0 = 98;
                        break block12;
                    }
lbl78:
                    // 1 sources

                    var3_1[var4_4] = new String(var8_8).intern();
                    ** continue;
lbl80:
                    // 1 sources

                    IIIllllI.lI = var3_1;
                    ** continue;
                    default: {
                        v0 = 112;
                        break block12;
                    }
                }
                break;
            }
        }
        var10_10 = v0;
        ** while (true)
    }

    private IIIllllI(IIIlIIIII iIIlIIIII) {
        this.II = iIIlIIIII;
    }

    public static IIIllllI l(String string) {
        return Enum.valueOf(IIIllllI.class, string);
    }

    public static IIIllllI[] values() {
        return (IIIllllI[])Il.clone();
    }

    private static /* synthetic */ IIIllllI[] II() {
        return new IIIllllI[]{I, l};
    }

    public String toString() {
        return this.II.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Il(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x7D5776BE;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIllllI.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xB09DA669;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 6 -> 251;
                case 14 -> 85;
                case 31 -> 130;
                case 3 -> 70;
                case 12 -> 86;
                case 4 -> 26;
                case 26 -> 201;
                case 9 -> 54;
                case 11 -> 181;
                case 25 -> 200;
                case 23 -> 57;
                case 8 -> 68;
                case 18 -> 3;
                case 30 -> 79;
                case 28 -> 131;
                case 29 -> 138;
                case 15 -> 39;
                case 21 -> 74;
                case 5 -> 236;
                case 2 -> 72;
                case 17 -> 160;
                case 22 -> 2;
                case 10 -> 48;
                case 16 -> 33;
                case 27 -> 92;
                case 7 -> 252;
                case 19 -> 178;
                default -> 145;
                case 24 -> 183;
                case 1 -> 162;
                case 13 -> 247;
                case 20 -> 65;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

