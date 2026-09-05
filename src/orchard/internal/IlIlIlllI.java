/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIlllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - getProperties
 *   - properties
 *   - .getBytes(
 *   - getName
 *   - getId
 *   - name
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ArrayListMultimap
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.reflect.Method;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class IlIlIlllI {
    private static final Method I;
    private static String[] l;
    private static final Method II;
    private static final Method Il;
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Enabled aggressive block sorting
     */
    public static GameProfile I(GameProfile gameProfile, String string, Property property) {
        if (gameProfile == null) return gameProfile;
        if (string == null) return gameProfile;
        if (string.isBlank()) return gameProfile;
        if (property != null) {
            ArrayListMultimap arrayListMultimap = ArrayListMultimap.create();
            PropertyMap propertyMap = IlIlIlllI.II(gameProfile);
            if (propertyMap != null) {
                arrayListMultimap.putAll((Multimap)propertyMap);
            }
            arrayListMultimap.put((Object)string, (Object)property);
            return new GameProfile(IlIlIlllI.III(gameProfile), IlIlIlllI.ll(gameProfile), new PropertyMap((Multimap)arrayListMultimap));
        }
        return gameProfile;
    }

    private IlIlIlllI() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0xA75C520 ^ n;
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

    public static PropertyMap II(GameProfile gameProfile) {
        return IlIlIlllI.Il(gameProfile, II, PropertyMap.class);
    }

    private static <T> T Il(GameProfile gameProfile, Method method, Class<T> clazz) {
        if (gameProfile == null || method == null) {
            return null;
        }
        try {
            Object object = method.invoke((Object)gameProfile, new Object[0]);
            return clazz.isInstance(object) ? (T)clazz.cast(object) : null;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block32: {
            block30: {
                block28: {
                    block33: {
                        block27: {
                            block29: {
                                block31: {
                                    block26: {
                                        break block31;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            v0 = 82;
                                            break block26;
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
                                            IlIlIlllI.l = new String[6];
                                            IlIlIlllI.lI();
                                            IlIlIlllI.Il = IlIlIlllI.IIl(new String[]{"id", "getId"});
                                            IlIlIlllI.I = IlIlIlllI.IIl(new String[]{"name", "getName"});
                                            IlIlIlllI.II = IlIlIlllI.IIl(new String[]{"properties", "getProperties"});
                                            return;
                                        }
lbl13:
                                        // 1 sources

                                        while (true) {
                                            v0 = 103;
                                            break block26;
                                            break;
                                        }
lbl16:
                                        // 1 sources

                                        while (true) {
                                            var11_6 += var12_7;
                                            break block27;
                                            break;
                                        }
lbl19:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        while (true) {
                                            var2_13 = -1474196284;
                                            break block28;
                                            break;
                                        }
lbl24:
                                        // 2 sources

                                        while (true) {
                                            var12_7 = var8_3[var10_5] ^ var6;
                                            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                                            var15_10 = 0;
                                            break block29;
                                            break;
                                        }
                                        var11_6 = 0;
                                        break block32;
lbl31:
                                        // 1 sources

                                        while (true) {
                                            var9_4[var10_5] = new String(var14_9).intern();
                                            ** continue;
                                            break;
                                        }
lbl34:
                                        // 1 sources

                                        while (var15_10 >= var14_9.length) {
                                            ** continue;
lbl36:
                                            // 1 sources

                                            ** GOTO lbl31
                                        }
                                        break block29;
lbl38:
                                        // 1 sources

                                        while (true) {
                                            ** GOTO lbl34
                                            break;
                                        }
lbl40:
                                        // 1 sources

                                        while (true) {
                                            var13_8 = -1;
                                            break block30;
                                            break;
                                        }
lbl43:
                                        // 1 sources

                                        while (true) {
                                            var9_4 = new String[var8_3.length];
                                            ** continue;
                                            break;
                                        }
                                        IlIlIlllI.lI = new int[var1_12];
                                        var3_14 = 0;
                                        ** GOTO lbl77
lbl49:
                                        // 2 sources

                                        while (true) {
                                            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                                            ** GOTO lbl79
                                            break;
                                        }
lbl52:
                                        // 1 sources

                                        while (true) {
                                            IlIlIlllI.III = new Object[var9_4.length];
                                            ** continue;
                                            break;
                                        }
                                    }
lbl56:
                                    // 5 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl58:
                                    // 1 sources

                                    while (true) {
                                        var8_3 = "\u5d2a\u5d3e\u5d26\u5d26\u5d3a\u5d22".toCharArray();
                                        ** continue;
                                        break;
                                    }
                                }
                                var6 = 23854;
                                var7_2 = "\uf749\udc9a\u2e2e\ufb3c\u39e3\u685f\u45f0\u2d2b\udb28\u1c24\u9ab9\ud15c\u7a17\udedb\u6f21\u5e03\uf277\uee4f\uf5e2\u244c\u3b2f\u8fd6\u1eba\uebb7\u903b\uefab\u6877\uee98\u9532\u394c\u1455\u73e3\u46b5\u5b0d\ue1dd\ub807\u1660\uc757\u327b\ufd8e\ua99b\u26cd\uc8ce\u6359\ua896\u1017\u5155\ua8dc\u7f40\u12a8\u7a3f\uede8\u8a85\u606f\ubca3\uae05\uce82\u4999\uf9c5\u11b8\u6bff\ua812\ua084\u1cbf\ue86f\u78ae\u230f\u799d";
                                ** while (true)
                            }
                            switch (var15_10 % 6) {
                                default: {
                                    ** continue;
                                }
                                case 5: {
                                    ** continue;
                                }
                                case 1: {
                                    v0 = 105;
                                    ** GOTO lbl56
                                }
                                case 3: {
                                    v0 = 114;
                                    ** GOTO lbl56
                                }
lbl77:
                                // 1 sources

                                var4_15 = 0;
                                ** GOTO lbl49
lbl79:
                                // 1 sources

                                IlIlIlllI.lI[var4_15] = var5_16 ^= var2_13;
                                break block33;
lbl81:
                                // 1 sources

                                while (true) {
                                    var13_8 = 0;
                                    break block30;
                                    break;
                                }
                                case 2: {
                                    v0 = 125;
                                    ** GOTO lbl56
                                }
                                case 4: 
                            }
                            v0 = 56;
                            ** while (true)
                        }
                        if (++var10_5 < var8_3.length) ** GOTO lbl24
                        ** while (true)
                    }
                    var3_14 += 4;
                    if (++var4_15 >= var1_12) ** break;
                    ** while (true)
                    ** while (true)
                }
                var0_11 = ".\u00d0n\u0094<>)O=\u00ad\u00c9vg\u0093^\u00a4\u0006\u00ae\u007f\u00f2\u0095o\b\u00e62\u0097\u00d9\u00a8\u0087h\u00b6\u00c3\u00a4\u0017v\u00db".getBytes("ISO-8859-1");
                var1_12 = var0_11.length / 4;
                ** while (true)
                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                ** while (true)
lbl106:
                // 1 sources

                while (true) {
                    IlIlIlllI.ll = var9_4;
                    ** continue;
                    break;
                }
            }
            var10_5 = 0;
            ** while (true)
        }
        var12_7 = 0;
        if (var13_8 == 0) ** break;
        ** while (true)
        ** while (true)
    }

    private static void lI() {
        IlIlIlllI.l[0] = IlIlIlllI.l(IlIlIlllI.Ill('\uc228', 1280328994, 29669).toCharArray(), 93583L, 1055694856);
        IlIlIlllI.l[1] = IlIlIlllI.l(IlIlIlllI.Ill('\u8178', -742099892, 29668).toCharArray(), 86833L, -1738086330);
        IlIlIlllI.l[2] = IlIlIlllI.l(IlIlIlllI.Ill('\u8a23', 1248357475, 29671).toCharArray(), 4212L, -1831164600);
        IlIlIlllI.l[3] = IlIlIlllI.l(IlIlIlllI.Ill('\u8118', 1749830894, 29670).toCharArray(), 95554L, 1097092912);
        IlIlIlllI.l[4] = IlIlIlllI.l(IlIlIlllI.Ill('\u4632', -217295790, 29665).toCharArray(), 60868L, 645043106);
        IlIlIlllI.l[5] = IlIlIlllI.l(IlIlIlllI.Ill('\u09ca', -98940502, 29664).toCharArray(), 46372L, 297558830);
    }

    public static String ll(GameProfile gameProfile) {
        return IlIlIlllI.Il(gameProfile, I, String.class);
    }

    public static UUID III(GameProfile gameProfile) {
        return IlIlIlllI.Il(gameProfile, Il, UUID.class);
    }

    private static Method IIl(String ... stringArray) {
        for (String string : stringArray) {
            try {
                Method method = GameProfile.class.getMethod(string, new Class[0]);
                method.setAccessible(true);
                return method;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
            }
        }
        return null;
    }

    private static int IlI(int n, int n2) {
        return lI[n ^ 0xF30BB683] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Ill(char c, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0x73E5;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIlIlllI.III[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6BD;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 22387;
            n7 -= 23096;
            n7 -= 16417;
            n7 ^= 0xDE6C;
            n7 += 25716;
            n7 += 9273;
            cArray[n6] = (char)((n7 -= 54237) ^ n4 ^ c ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

