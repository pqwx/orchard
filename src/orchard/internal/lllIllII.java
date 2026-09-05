/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Right
 *   - Left
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
final class lllIllII
extends Enum<lllIllII> {
    public static final /* enum */ lllIllII I;
    private final IIIlIIIII l;
    private static final /* synthetic */ lllIllII[] II;
    public static final /* enum */ lllIllII Il;
    private static final String[] lI;
    private static final Object[] ll;

    public String toString() {
        return this.l.IIII();
    }

    public static lllIllII[] values() {
        return (lllIllII[])II.clone();
    }

    private static /* synthetic */ lllIllII[] I() {
        return new lllIllII[]{Il, I};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                block21: {
                    break block21;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl3:
                    // 1 sources

                    while (true) {
                        v0 = 24;
                        ** GOTO lbl9
                        break;
                    }
lbl6:
                    // 1 sources

                    while (true) {
                        if (var7_7 != 0) break block19;
                        ** GOTO lbl70
lbl9:
                        // 6 sources

                        while (true) {
                            var10_10 = v0;
                            ** GOTO lbl63
                            break;
                        }
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        lllIllII.II = lllIllII.I();
                        return;
                    }
                }
                var0 = 25245;
                var1_2 = "\ua759\ua7d4\ua7bb\ua7d9\ua798\u1181\u1116\u1136\u113e\u115b\u1115\u1192\u110f\uba1e\uba81\ubae3\uba9c\u8f83\u8f2b\u8f46\u8f3e\u8f59\u8f12\u8f98\u8f08";
                ** GOTO lbl51
            }
            while (true) {
                var6_6 = var2_3[var4_4];
                ** GOTO lbl48
                break;
            }
lbl23:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl25:
            // 1 sources

            while (true) {
                if (var9_9 < var8_8.length) break block20;
                ** GOTO lbl68
                break;
            }
            var3_1 = new String[var2_3.length];
            var7_7 = -1;
            ** GOTO lbl66
lbl31:
            // 1 sources

            while (true) {
                var5_5 += var6_6;
                ** GOTO lbl75
                break;
            }
            lllIllII.ll = new Object[var3_1.length];
            lllIllII.Il = new lllIllII(StringFactory.IIII("Right"));
            ** GOTO lbl53
lbl37:
            // 1 sources

            while (true) {
                var5_5 = 0;
                ** GOTO lbl55
                break;
            }
        }
        block17: while (true) {
            switch (var9_9 % 6) {
                case 1: {
                    ** continue;
                }
                case 2: {
                    v0 = 125;
                    ** GOTO lbl9
                }
lbl48:
                // 1 sources

                var8_8 = var1_2.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
                continue block17;
lbl51:
                // 1 sources

                var2_3 = "\u0005\b\u0004\b".toCharArray();
                ** continue;
lbl53:
                // 1 sources

                lllIllII.I = new lllIllII(StringFactory.IIII("Left"));
                ** continue;
lbl55:
                // 1 sources

                var6_6 = '\u0000';
                ** continue;
                case 4: {
                    v0 = 8;
                    ** GOTO lbl9
                }
lbl60:
                // 1 sources

                while (true) {
                    var7_7 = 0;
                    ** GOTO lbl66
                    break;
                }
lbl63:
                // 1 sources

                v1 = var9_9++;
                var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
                ** continue;
lbl66:
                // 2 sources

                var4_4 = 0;
                ** continue;
lbl68:
                // 1 sources

                var3_1[var4_4] = new String(var8_8).intern();
                ** continue;
lbl70:
                // 1 sources

                lllIllII.lI = var3_1;
                ** continue;
                default: {
                    v0 = 75;
                    ** GOTO lbl9
                }
lbl75:
                // 1 sources

                if (++var4_4 < var2_3.length) ** continue;
                ** continue;
                case 3: {
                    v0 = 3;
                    ** GOTO lbl9
                }
                case 5: 
            }
            break;
        }
        v0 = 125;
        ** while (true)
    }

    public static lllIllII l(String string) {
        return Enum.valueOf(lllIllII.class, string);
    }

    private lllIllII(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x9AFDB9E0;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lllIllII.ll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5937BB0A;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 28 -> 41;
                default -> 216;
                case 29 -> 127;
                case 23 -> 118;
                case 10 -> 142;
                case 20 -> 12;
                case 14 -> 59;
                case 18 -> 176;
                case 2 -> 25;
                case 16 -> 247;
                case 21 -> 37;
                case 8 -> 63;
                case 24 -> 149;
                case 31 -> 121;
                case 30 -> 201;
                case 5 -> 74;
                case 26 -> 28;
                case 11 -> 11;
                case 22 -> 178;
                case 12 -> 236;
                case 13 -> 87;
                case 7 -> 73;
                case 27 -> 73;
                case 15 -> 186;
                case 4 -> 92;
                case 17 -> 155;
                case 19 -> 190;
                case 25 -> 172;
                case 1 -> 29;
                case 9 -> 250;
                case 3 -> 10;
                case 6 -> 138;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

