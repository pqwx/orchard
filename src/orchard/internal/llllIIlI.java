/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - this platform
 *   - Windows
 *   - macOS
 *   - Linux
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
public final class llllIIlI
extends Enum<llllIIlI> {
    public static final /* enum */ llllIIlI I;
    private static final /* synthetic */ llllIIlI[] l;
    public static final /* enum */ llllIIlI II;
    private final IIIlIIIII Il;
    public static final /* enum */ llllIIlI lI;
    public static final /* enum */ llllIIlI ll;
    private static final String[] III;
    private static final Object[] IIl;

    public static llllIIlI[] values() {
        return (llllIIlI[])l.clone();
    }

    public String I() {
        return this.Il.IIII();
    }

    public static llllIIlI valueOf(String string) {
        return Enum.valueOf(llllIIlI.class, string);
    }

    private llllIIlI(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    public IIIlIIIII l() {
        return this.Il;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block22: {
                block26: {
                    block24: {
                        block25: {
                            block23: {
                                break block24;
lbl1:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl3:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl5:
                                // 1 sources

                                while (true) {
                                    v0 = 74;
                                    break block21;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var5_5 += var6_6;
                                    break block22;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var7_7 = -1;
                                    break block23;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    v0 = 37;
                                    break block21;
                                    break;
                                }
lbl19:
                                // 2 sources

                                while (true) {
                                    var6_6 = var2_2[var4_4] ^ var0;
                                    ** continue;
                                    break;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    v0 = 118;
                                    break block21;
                                    break;
                                }
                                llllIIlI.III = var3_3;
                                break block25;
lbl27:
                                // 1 sources

                                while (true) {
                                    ** GOTO lbl60
                                    break;
                                }
                            }
lbl30:
                            // 2 sources

                            while (true) {
                                var4_4 = 0;
                                ** GOTO lbl53
                                break;
                            }
lbl33:
                            // 1 sources

                            while (true) {
                                v1 = var9_9++;
                                var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                                ** continue;
                                break;
                            }
                        }
                        llllIIlI.IIl = new Object[var3_3.length];
                        llllIIlI.lI = new llllIIlI(StringFactory.IIII("Windows"));
                        ** GOTO lbl62
                        var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                        var9_9 = 0;
                        block18: while (true) {
                            switch (var9_9 % 5) {
                                default: {
                                    ** continue;
                                }
                                case 1: {
                                    ** continue;
                                }
                                case 4: {
                                    ** continue;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl53:
                                // 1 sources

                                var5_5 = 0;
                                var6_6 = 0;
                                if (var7_7 != 0) ** GOTO lbl19
                                ** continue;
                                case 2: {
                                    v0 = 112;
                                    break block18;
                                }
lbl60:
                                // 1 sources

                                if (var9_9 < var8_8.length) continue block18;
                                ** GOTO lbl64
lbl62:
                                // 1 sources

                                llllIIlI.ll = new llllIIlI(StringFactory.IIII("macOS"));
                                ** continue;
lbl64:
                                // 1 sources

                                var3_3[var4_4] = new String(var8_8).intern();
                                ** continue;
lbl66:
                                // 1 sources

                                while (true) {
                                    var7_7 = 0;
                                    ** continue;
                                    break;
                                }
                                var2_2 = "\u77a0\u77ab\u77a2\u77af\u77a2\u77af\u77a2\u77b3".toCharArray();
                                var3_3 = new String[var2_2.length];
                                ** continue;
                                case 3: {
                                    v0 = 65;
                                    break block18;
                                }
                            }
                            break;
                        }
                        break block21;
                        llllIIlI.I = new llllIIlI(StringFactory.IIII("Linux"));
                        break block26;
                    }
                    var0 = 30631;
                    var1_1 = "\u11ca\u11f7\u118c\u1128\u1175\u1179\u1122\ub845\ub821\ub859\ub8a7\ub8fd\ub8c6\ub881\ub8ee\ub890\ub8d0\ub837\ub8d2\u1bd4\u1bfb\u1b85\u1b27\u1b6d\ua853\ua846\ua836\ua896\ua8eb\ua8f5\ua8bc\ua89a\u02c2\u02e4\u029f\u022a\u0271\ud345\ud358\ud35f\ud3a1\ud3ff\ud3d3\ud398\ud394\ucd8b\ucdb3\ucdd3\ucd70\ucd31\u300f\u300c\u3042\u30f0\u30a8\u30e7\u30e5\u30b5\u30cb\u30b7\u306a\u30f9\u306a\u3045\u3047\u306e\u3092\u305a\u308a\u3017";
                    ** while (true)
                }
                llllIIlI.II = new llllIIlI(StringFactory.IIII("this platform"));
                llllIIlI.l = llllIIlI.II();
                return;
            }
            if (++var4_4 >= var2_2.length) ** break;
            ** while (true)
            ** while (true)
        }
        var10_10 = v0;
        ** while (true)
    }

    private static /* synthetic */ llllIIlI[] II() {
        return new llllIIlI[]{lI, ll, I, II};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Il(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xE2405C7A;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            llllIIlI.IIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x72154B30;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 26 -> 243;
                case 23 -> 48;
                case 7 -> 159;
                case 29 -> 48;
                case 19 -> 78;
                case 28 -> 184;
                case 30 -> 118;
                case 5 -> 142;
                case 17 -> 95;
                case 24 -> 203;
                case 4 -> 166;
                case 18 -> 228;
                case 10 -> 0;
                case 13 -> 102;
                case 20 -> 156;
                default -> 61;
                case 8 -> 192;
                case 9 -> 145;
                case 25 -> 219;
                case 1 -> 113;
                case 11 -> 138;
                case 6 -> 190;
                case 14 -> 97;
                case 22 -> 138;
                case 27 -> 200;
                case 16 -> 228;
                case 2 -> 88;
                case 15 -> 122;
                case 31 -> 33;
                case 21 -> 137;
                case 3 -> 199;
                case 12 -> 76;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

