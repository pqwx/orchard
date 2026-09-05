/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Glass
 *   - None
 *   - Flat
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
final class llIlIllI
extends Enum<llIlIllI> {
    public static final /* enum */ llIlIllI I;
    private static final /* synthetic */ llIlIllI[] l;
    public static final /* enum */ llIlIllI II;
    private final IIIlIIIII Il;
    public static final /* enum */ llIlIllI lI;
    private static final String[] ll;
    private static final Object[] III;

    private llIlIllI(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block21: {
                block18: {
                    block20: {
                        break block20;
lbl1:
                        // 2 sources

                        while (true) {
                            var6_6 = var2_2[var4_4];
                            ** GOTO lbl31
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl6:
                        // 1 sources

                        while (true) {
                            llIlIllI.III = new Object[var3_3.length];
                            ** GOTO lbl39
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            v0 = var9_9++;
                            var8_8[v0] = (char)(var8_8[v0] ^ var10_10 ^ var0);
                            break block18;
lbl13:
                            // 1 sources

                            while (true) {
                                var7_7 = 0;
                                ** GOTO lbl56
                                break;
                            }
                            break;
                        }
                    }
                    var0 = 31256;
                    var1_1 = "\u7866\u78d1\u780b\u787e\uc990\uc922\uc9fd\uc996\uc993\uc9e0\uc95f\uc980\uaa70\uaacc\uaa1a\uaa71\u6f84\u6f34\u6ff7\u6fb7\u6f81\u6fe6\u6f49\u6f96\u0f86\u0f3b\u0fed\u0f81\u0f88\u8fc9\u8f3c\u8fba\u8ffa\u8fcf\u8f9d\u8f56\u8fdb";
                    ** while (true)
                    var2_2 = "\u0004\b\u0004\b\u0005\b".toCharArray();
                    var3_3 = new String[var2_2.length];
                    ** GOTO lbl55
lbl23:
                    // 1 sources

                    block11: while (true) {
                        switch (var9_9 % 5) {
                            case 3: {
                                v1 = 17;
                                break block11;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var5_5 += var6_6;
                                ** GOTO lbl50
                                break;
                            }
lbl31:
                            // 1 sources

                            var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                            var9_9 = 0;
                            continue block11;
lbl34:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl36:
                            // 1 sources

                            while (true) {
                                llIlIllI.l = llIlIllI.I();
                                return;
                            }
lbl39:
                            // 1 sources

                            llIlIllI.lI = new llIlIllI(StringFactory.IIII("None"));
                            ** continue;
                            default: {
                                v1 = 1;
                                break block11;
                            }
lbl44:
                            // 1 sources

                            while (true) {
                                var3_3[var4_4] = new String(var8_8).intern();
                                ** continue;
                                break;
                            }
lbl47:
                            // 1 sources

                            while (true) {
                                llIlIllI.ll = var3_3;
                                ** continue;
                                break;
                            }
lbl50:
                            // 1 sources

                            if (++var4_4 < var2_2.length) ** GOTO lbl1
                            ** continue;
                            case 2: {
                                v1 = 44;
                                break block11;
                            }
lbl55:
                            // 1 sources

                            var7_7 = -1;
lbl56:
                            // 2 sources

                            var4_4 = 0;
                            break block19;
lbl58:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                            llIlIllI.I = new llIlIllI(StringFactory.IIII("Flat"));
                            llIlIllI.II = new llIlIllI(StringFactory.IIII("Glass"));
                            ** continue;
                            var6_6 = '\u0000';
                            if (var7_7 == 0) ** break;
                            ** continue;
                            ** continue;
                            case 1: {
                                v1 = 12;
                                break block11;
                            }
                            case 4: {
                                v1 = 55;
                                break block11;
                            }
                        }
                        break;
                    }
                    break block21;
                }
                if (var9_9 >= var8_8.length) ** break;
                ** while (true)
                ** while (true)
            }
            var10_10 = v1;
            ** while (true)
        }
        var5_5 = 0;
        ** while (true)
    }

    private static /* synthetic */ llIlIllI[] I() {
        return new llIlIllI[]{lI, I, II};
    }

    public static llIlIllI l(String string) {
        return Enum.valueOf(llIlIllI.class, string);
    }

    public String toString() {
        return this.Il.IIII();
    }

    public static llIlIllI[] values() {
        return (llIlIllI[])l.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xAAD00F52;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIlIllI.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2B543CE0;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 31 -> 88;
                case 7 -> 99;
                case 1 -> 172;
                case 22 -> 27;
                case 8 -> 219;
                case 30 -> 247;
                case 29 -> 44;
                case 24 -> 194;
                case 19 -> 72;
                case 13 -> 0;
                case 6 -> 156;
                case 26 -> 65;
                case 3 -> 20;
                case 9 -> 56;
                case 14 -> 95;
                case 17 -> 114;
                case 5 -> 66;
                case 11 -> 43;
                case 28 -> 201;
                case 16 -> 250;
                case 21 -> 198;
                case 18 -> 114;
                case 25 -> 116;
                case 2 -> 87;
                case 27 -> 67;
                case 20 -> 50;
                default -> 23;
                case 4 -> 59;
                case 23 -> 170;
                case 10 -> 105;
                case 12 -> 187;
                case 15 -> 122;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

