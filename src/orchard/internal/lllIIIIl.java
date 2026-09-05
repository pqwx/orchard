/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - )) return 
 *   - smp.fadedmc.net
 *   - pvp.fadedmc.net
 *   - fadedmc.net
 *   - .getBytes(
 *   - getAddress
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.network.ServerAddress
 *  net.minecraft.client.network.ServerInfo
 */
package orchard.internal;

import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;

@Environment(value=EnvType.CLIENT)
public final class lllIIIIl {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    public static boolean I(Screen screen, MinecraftClient minecraftClient, ServerAddress serverAddress, ServerInfo serverInfo) {
        String string = lllIIIIl.ll(serverAddress, serverInfo);
        return lllIIIIl.l(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean l(String string) {
        if (string == null) {
            return false;
        }
        String string2 = string.trim().toLowerCase();
        if (string2.contains(":")) {
            string2 = string2.split(":")[0].trim();
        }
        if (string2.equals("smp.fadedmc.net")) return true;
        if (string2.equals("fadedmc.net")) return true;
        if (string2.equals("pvp.fadedmc.net")) return true;
        return false;
    }

    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0x403795E1 ^ n;
        for (int i = 0; i < cArray.length; ++i) {
            n2 = n2 ^ (int)l2 ^ ~i;
            n2 ^= n - i * cArray.length;
            n2 = -n2 * n | i;
            cArray[i] = (char)(cArray[i] ^ n2);
            int n3 = i & 0xFF;
            n = n << n3 | n >>> -n3;
            l2 ^= (long)n3;
        }
        return new String(cArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block32: {
            block28: {
                block26: {
                    block30: {
                        block31: {
                            block27: {
                                block29: {
                                    block25: {
                                        break block30;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var13_4 = -1;
                                            break block25;
                                            break;
                                        }
lbl4:
                                        // 2 sources

                                        while (true) {
                                            var5_10 = (var0_5[var3_8] & 255) << 24 | (var0_5[var3_8 + 1] & 255) << 16 | (var0_5[var3_8 + 2] & 255) << 8 | var0_5[var3_8 + 3] & 255;
                                            ** GOTO lbl38
                                            break;
                                        }
                                    }
lbl8:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl12:
                                    // 1 sources

                                    while (true) {
                                        var3_8 = 0;
                                        ** GOTO lbl36
                                        break;
                                    }
lbl15:
                                    // 1 sources

                                    while (true) {
                                        if (var13_4 != 0) ** GOTO lbl43
                                        break block26;
                                        break;
                                    }
lbl18:
                                    // 1 sources

                                    block13: while (true) {
                                        var9_3[var10_11] = new String(var14_14).intern();
                                        ** GOTO lbl34
lbl21:
                                        // 2 sources

                                        while (true) {
                                            switch (var15_15 % 6) {
                                                case 3: {
                                                    v0 = 29;
                                                    break block13;
                                                }
lbl26:
                                                // 1 sources

                                                while (true) {
                                                    break block27;
                                                    break;
                                                }
lbl28:
                                                // 1 sources

                                                while (true) {
                                                    lllIIIIl.l = new int[var1_6];
                                                    ** continue;
                                                    break;
                                                }
                                                case 5: {
                                                    v0 = 44;
                                                    break block13;
                                                }
lbl34:
                                                // 1 sources

                                                var11_12 += var12_13;
                                                ** continue;
lbl36:
                                                // 1 sources

                                                var4_9 = 0;
                                                ** GOTO lbl4
lbl38:
                                                // 1 sources

                                                lllIIIIl.l[var4_9] = var5_10 ^= var2_7;
                                                var3_8 += 4;
                                                if (++var4_9 >= var1_6) ** break;
                                                ** continue;
                                                break block28;
lbl43:
                                                // 2 sources

                                                while (true) {
                                                    var12_13 = var8_2[var10_11] ^ var6;
                                                    break block29;
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
lbl46:
                                    // 6 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var14_14 = var7_1.substring(var11_12, var11_12 + var12_13).toCharArray();
                                var15_15 = 0;
                                ** GOTO lbl21
                            }
                            ** while (++var10_11 < var8_2.length)
lbl54:
                            // 1 sources

                            break block31;
                            lllIIIIl.Il = new Object[var9_3.length];
                            break block32;
lbl57:
                            // 1 sources

                            while (true) {
                                var9_3 = new String[var8_2.length];
                                ** continue;
                                break;
                            }
                        }
                        var13_4 = 0;
                        ** while (true)
lbl63:
                        // 1 sources

                        while (true) {
                            if (var15_15 >= var14_14.length) ** break;
                            ** continue;
                            ** continue;
                            break;
                        }
lbl67:
                        // 1 sources

                        while (true) {
                            ** continue;
                            break;
                        }
                        {
                            case 4: {
                                v0 = 62;
                                break;
                            }
                        }
lbl72:
                        // 1 sources

                        while (true) {
                            var12_13 = 0;
                            ** continue;
                            break;
                        }
                        var10_11 = 0;
                        var11_12 = 0;
                        ** while (true)
                        {
                            case 1: {
                                v0 = 94;
                                break;
                            }
                        }
lbl81:
                        // 1 sources

                        while (true) {
                            var8_2 = "\u6d26\u6d32\u6d22\u6d22\u6d32\u6d26".toCharArray();
                            ** continue;
                            break;
                        }
                    }
                    var6 = 27958;
                    var7_1 = "\ub706\u9059\u4d30\u74bf\uaa88\u5fbf\uffb8\ue7f2\ue306\ud187\u04ab\u4ef9\u0994\u18a6\u6622\u8786\uff81\u51f4\ufe7c\u5b7d\ucc12\u540f\ub960\u2200\u4342\u0142\uc3b6\ufbe3\u2ebe\u5c19\ucef2\ua67c\u9cbf\u4a3a\u6c48\u1a3c\u4f95\uec61\u3dfb\ub142\u0136\uec17\u447e\uf854\u5aef\ub8e6\ua9ba\u8c7f\ufe4a\ud85b\ufd96\ua0bc\u53db\u0bfe\ua4dc\u3868\u1ce5\u70d5\u734b\u84fe\u8bf4\u7121\ud39f\u683a\u0ba4\u13ee\u5c2f\uc589\udb4d\u1d09\u7d77\ub471\u4db7\ua88e\u1f5f\u0eb0\uc8b0\uc7fc\u8c0b\u98e0";
                    ** while (true)
                }
                lllIIIIl.II = var9_3;
                ** while (true)
                var16_16 = v0;
                v1 = var15_15++;
                var14_14[v1] = (char)(var14_14[v1] ^ var16_16);
                ** while (true)
                {
                    default: {
                        v0 = 22;
                        break;
                    }
                }
lbl98:
                // 1 sources

                while (true) {
                    var1_6 = var0_5.length / 4;
                    ** continue;
                    break;
                }
            }
            lllIIIIl.I = new String[7];
            lllIIIIl.Il();
            return;
            {
                ** case 2:
            }
lbl106:
            // 1 sources

            v0 = 92;
            ** while (true)
        }
        var2_7 = 2066757670;
        var0_5 = "\u00ec\u008b\u00bb\u0095\u0093\u0095\u00f5\u0084\u00c1K:n\u00d7-Tv#\u00ad\u008c\u001a\u00ee\u00ceX\u00a0_o2d\u0098D\u00a9:\u00c6F\u0012\u00bc\u000bZ\u00aa\u00bb6\u00e1\u00cb\u00d3\u00e8p\u0081\u00ab".getBytes("ISO-8859-1");
        ** while (true)
    }

    private lllIIIIl() {
    }

    private static void Il() {
        lllIIIIl.I[0] = lllIIIIl.II("".toCharArray(), 70471L, -1729817600);
        lllIIIIl.I[1] = lllIIIIl.II(lllIIIIl.IIl(1733783292, -1912649217).toCharArray(), 67695L, -1408018892);
        lllIIIIl.I[2] = lllIIIIl.II(lllIIIIl.IIl(1733783293, 1632457060).toCharArray(), 14254L, 1146574730);
        lllIIIIl.I[3] = lllIIIIl.II(lllIIIIl.IIl(1733783294, -2139086892).toCharArray(), 95270L, -1984191220);
        lllIIIIl.I[4] = lllIIIIl.II(lllIIIIl.IIl(1733783295, 26508184).toCharArray(), 83866L, -1671291092);
        lllIIIIl.I[5] = lllIIIIl.II(lllIIIIl.IIl(1733783288, -1271261631).toCharArray(), 15444L, -1983235536);
        lllIIIIl.I[6] = lllIIIIl.II(lllIIIIl.IIl(1733783289, -1464260862).toCharArray(), 56256L, 1088404020);
    }

    private static String lI(Object object, String string) {
        if (object == null) {
            return "";
        }
        try {
            String string2;
            Method method = object.getClass().getMethod(string, new Class[0]);
            Object object2 = method.invoke(object, new Object[0]);
            return object2 instanceof String ? (string2 = (String)object2) : "";
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return "";
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String ll(ServerAddress serverAddress, ServerInfo serverInfo) {
        String string;
        if (serverInfo != null && serverInfo.address != null) {
            if (!serverInfo.address.isBlank()) return serverInfo.address;
        }
        if (!(string = lllIIIIl.lI(serverAddress, "getAddress")).isBlank()) {
            return string;
        }
        String string2 = serverAddress == null ? "" : String.valueOf(serverAddress);
        if (string2.contains("@")) return "";
        String string3 = string2;
        return string3;
    }

    private static int III(int n, int n2) {
        return l[n ^ 0xBA796F97] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x67576EFC;
        char[] cArray = II[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lllIIIIl.Il[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x8C8F048B;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 18 -> 116;
                case 17 -> 185;
                case 29 -> 98;
                case 26 -> 62;
                case 19 -> 193;
                case 1 -> 128;
                case 28 -> 120;
                case 11 -> 110;
                default -> 232;
                case 7 -> 24;
                case 15 -> 163;
                case 8 -> 121;
                case 6 -> 122;
                case 24 -> 144;
                case 21 -> 61;
                case 27 -> 46;
                case 16 -> 94;
                case 13 -> 102;
                case 4 -> 93;
                case 2 -> 83;
                case 12 -> 82;
                case 20 -> 73;
                case 31 -> 32;
                case 5 -> 78;
                case 25 -> 21;
                case 22 -> 23;
                case 9 -> 74;
                case 10 -> 186;
                case 23 -> 27;
                case 14 -> 72;
                case 30 -> 118;
                case 3 -> 186;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

