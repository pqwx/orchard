/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllllllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Click
 *   - Auto
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
public final class IllllllI
extends Enum<IllllllI> {
    public static final /* enum */ IllllllI I;
    private final IIIlIIIII l;
    public static final /* enum */ IllllllI II;
    private static final /* synthetic */ IllllllI[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    public static IllllllI[] values() {
        return (IllllllI[])Il.clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block14: {
                    block10: {
                        break block12;
lbl1:
                        // 1 sources

                        while (true) {
                            IllllllI.Il = IllllllI.l();
                            return;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            block13: {
                                if (++var4_4 < var2_2.length) break block10;
                                break block13;
lbl7:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var7_7 = 0;
                            break block11;
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            continue;
lbl16:
                            // 1 sources

                            while (true) {
                                var7_7 = -1;
                                break block11;
                                break;
                            }
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            IllllllI.II = new IllllllI(StringFactory.IIII("Auto"));
                            ** continue;
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        var2_2 = "\u7106\u710b\u7107\u710b".toCharArray();
                        var3_3 = new String[var2_2.length];
                        ** while (true)
                        var5_5 = 0;
                        var6_6 = 0;
                        if (var7_7 == 0) break block14;
                    }
                    var6_6 = var2_2[var4_4] ^ var0;
                    ** while (true)
                    IllllllI.ll = new Object[var3_3.length];
                    IllllllI.I = new IllllllI(StringFactory.IIII("Click"));
                    ** while (true)
                    var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                    var5_5 += var6_6;
                    ** while (true)
                }
                IllllllI.lI = var3_3;
                ** while (true)
            }
            var4_4 = 0;
            ** while (true)
        }
        var0 = 28931;
        var1_1 = "\u2033\u201c\u20bd\u205a\u2090\ue1cd\ue1ad\ue154\ue1b5\ue17d\ue1de\ue1ba\ue1f8\ufadb\ufaef\ufa4a\ufabc\u0fdc\u0fd0\u0f6b\u0f81\u0f69\u0fc0\u0fdf\u0fe9";
        ** while (true)
    }

    public IIIlIIIII I() {
        return this.l;
    }

    public String toString() {
        return this.l.IIII();
    }

    private static /* synthetic */ IllllllI[] l() {
        return new IllllllI[]{I, II};
    }

    public static IllllllI II(String string) {
        return Enum.valueOf(IllllllI.class, string);
    }

    private IllllllI(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Il(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x9E9351EB;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IllllllI.ll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xB4369009;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 13 -> 92;
                case 5 -> 118;
                case 9 -> 252;
                case 20 -> 168;
                case 4 -> 195;
                case 15 -> 105;
                case 16 -> 62;
                case 11 -> 203;
                case 17 -> 56;
                case 23 -> 227;
                case 24 -> 93;
                case 28 -> 214;
                case 29 -> 119;
                case 7 -> 21;
                case 10 -> 5;
                case 12 -> 97;
                case 18 -> 183;
                case 3 -> 1;
                case 27 -> 120;
                case 14 -> 83;
                case 21 -> 186;
                case 26 -> 64;
                case 31 -> 44;
                case 22 -> 216;
                case 30 -> 68;
                case 19 -> 120;
                case 25 -> 121;
                case 6 -> 35;
                case 1 -> 72;
                default -> 104;
                case 8 -> 125;
                case 2 -> 236;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

