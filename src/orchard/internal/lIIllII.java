/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - type
 *   - code
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.client.util.InputUtil$Type
 */
package orchard.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.util.InputUtil;
import orchard.internal.IIllIl;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
public final class lIIllII
extends IIllIl<InputUtil.Key> {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    @Override
    public JsonElement III() {
        JsonElement jsonElement = lIIllllI.IllIIII((InputUtil.Key)this.lIl());
        if (jsonElement != null) {
            return jsonElement;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", InputUtil.Type.KEYSYM.name());
        jsonObject.addProperty("code", (Number)-1);
        return jsonObject;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block15: {
                block17: {
                    block16: {
                        block18: {
                            break block15;
lbl1:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl3:
                            // 1 sources

                            while (++var10_4 >= var8_2.length) {
                                break block14;
                            }
                            break block16;
lbl6:
                            // 1 sources

                            while (var13_7 == 0) {
                                ** continue;
lbl8:
                                // 1 sources

                                ** GOTO lbl1
                            }
                            break block16;
lbl10:
                            // 1 sources

                            while (true) {
                                var11_5 += var12_6;
                                ** GOTO lbl3
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                            lIIllII.II = var9_3;
                            break block17;
lbl17:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl19:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl21:
                            // 1 sources

                            while (true) {
                                lIIllII.I = new String[2];
                                lIIllII.I();
                                return;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                                ** continue;
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl30:
                            // 2 sources

                            while (true) {
                                var10_4 = 0;
                                ** continue;
                                break;
                            }
                            var11_5 = 0;
                            var12_6 = 0;
                            ** GOTO lbl6
                            var5_13 = (var0_9[var3_11] & 255) << 24 | (var0_9[var3_11 + 1] & 255) << 16 | (var0_9[var3_11 + 2] & 255) << 8 | var0_9[var3_11 + 3] & 255;
                            break block18;
                            lIIllII.l = new int[var1_10];
                            var3_11 = 0;
                            var4_12 = 0;
                            ** GOTO lbl19
                        }
                        lIIllII.l[var4_12] = var5_13 ^= var2_8;
                        var3_11 += 4;
                        if (++var4_12 >= var1_10) ** break;
                        ** while (true)
                        ** while (true)
lbl48:
                        // 1 sources

                        while (true) {
                            var13_7 = -1;
                            ** GOTO lbl30
                            break;
                        }
                    }
                    var12_6 = var8_2[var10_4] ^ var6;
                    ** while (true)
lbl54:
                    // 1 sources

                    while (true) {
                        var9_3 = new String[var8_2.length];
                        ** continue;
                        break;
                    }
                    var0_9 = "\u0011\n:\u00bb:\u00c7\u00e9u\u000b4\u0004wN\u00c3\u00ab\f".getBytes("ISO-8859-1");
                    var1_10 = var0_9.length / 4;
                    ** while (true)
                }
                lIIllII.Il = new Object[var9_3.length];
                var2_8 = 363790442;
                ** while (true)
lbl64:
                // 1 sources

                while (true) {
                    var8_2 = "\u618f\u618f".toCharArray();
                    ** continue;
                    break;
                }
            }
            var6 = 24967;
            var7_1 = "\ucba8\ud10f\u8997\ufae6\u88c2\u7635\u3472\u0d90\u41e1\u9330\uf99c\ud9b5\u2fff\uaac2\u1f6c\u9b5f";
            ** while (true)
        }
        var13_7 = 0;
        ** while (true)
    }

    private static void I() {
        lIIllII.I[0] = lIIllII.lI(lIIllII.IlI(-99387327, -1125684020).toCharArray(), 84625L, -236064591);
        lIIllII.I[1] = lIIllII.lI(lIIllII.IlI(-99387328, 2084597362).toCharArray(), 82435L, 353063234);
    }

    public lIIllII(String string) {
        this((Object)string);
    }

    public lIIllII(Object object, InputUtil.Key key) {
        super(object, key);
    }

    public void Il(InputUtil.Key key) {
        super.II(key != null ? key : InputUtil.UNKNOWN_KEY);
    }

    @Override
    public void l(JsonElement jsonElement) {
        this.Il(lIIllllI.lIIlIl(jsonElement));
    }

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0x58EAAB9B ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & 0xFF;
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    public lIIllII(String string, InputUtil.Key key) {
        this((Object)string, key);
    }

    @Override
    public boolean ll() {
        return !lIIllllI.IlIIlll((InputUtil.Key)this.lIl());
    }

    public lIIllII(Object object) {
        this(object, InputUtil.UNKNOWN_KEY);
    }

    private static int IIl(int n, int n2) {
        return l[n ^ 0xE0B720D9] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IlI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xFA137841;
        char[] cArray = II[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIllII.Il[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2D64D797;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 7: {
                    n6 = 138;
                    continue block33;
                }
                case 10: {
                    n6 = 22;
                    continue block33;
                }
                case 22: {
                    n6 = 102;
                    continue block33;
                }
                case 19: {
                    n6 = 26;
                    continue block33;
                }
                case 27: {
                    n6 = 111;
                    continue block33;
                }
                case 8: {
                    n6 = 111;
                    continue block33;
                }
                case 14: {
                    n6 = 13;
                    continue block33;
                }
                case 21: {
                    n6 = 240;
                    continue block33;
                }
                case 31: {
                    n6 = 140;
                    continue block33;
                }
                case 3: {
                    n6 = 204;
                    continue block33;
                }
                case 26: {
                    n6 = 10;
                    continue block33;
                }
                case 5: {
                    n6 = 217;
                    continue block33;
                }
                case 12: {
                    n6 = 83;
                    continue block33;
                }
                case 25: {
                    n6 = 190;
                    continue block33;
                }
                case 28: {
                    n6 = 41;
                    continue block33;
                }
                case 29: {
                    n6 = 88;
                    continue block33;
                }
                case 30: {
                    n6 = 80;
                    continue block33;
                }
                case 15: {
                    n6 = 238;
                    continue block33;
                }
                case 20: {
                    n6 = 54;
                    continue block33;
                }
                case 11: {
                    n6 = 63;
                    continue block33;
                }
                default: {
                    n6 = 102;
                    continue block33;
                }
                case 16: {
                    n6 = 72;
                    continue block33;
                }
                case 6: {
                    n6 = 209;
                    continue block33;
                }
                case 23: {
                    n6 = 8;
                    continue block33;
                }
                case 13: {
                    n6 = 193;
                    continue block33;
                }
                case 4: {
                    n6 = 195;
                    continue block33;
                }
                case 1: {
                    n6 = 177;
                    continue block33;
                }
                case 17: {
                    n6 = 188;
                    continue block33;
                }
                case 18: {
                    n6 = 55;
                    continue block33;
                }
                case 2: {
                    n6 = 160;
                    continue block33;
                }
                case 24: {
                    n6 = 154;
                    continue block33;
                }
                case 9: 
            }
            n6 = 190;
        }
        return new String(cArray).intern();
    }
}

