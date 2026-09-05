/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Failed to register 1.21.11 world render callback bridge
 *   - AFTER_ENTITIES
 *   - $AfterEntities
 *   - $EndExtraction
 *   - END_EXTRACTION
 *   - .getBytes(
 *   - register
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

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IlIIIlIll;
import orchard.internal.IlllIlll;
import orchard.internal.llIIIIlI;

@Environment(value=EnvType.CLIENT)
public final class IlIlIIlI {
    private static String[] I;
    private static final String l;
    private static volatile boolean II;
    private static final String Il;
    private static final String lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    public void I(IlIIIlIll ilIIIlIll) {
        if (ilIIIlIll == null) {
            return;
        }
        try {
            IlIlIIlI.l();
            Class<?> clazz = Class.forName(l);
            Object object = clazz.getField("AFTER_ENTITIES").get(null);
            Class<?> clazz2 = Class.forName(lI);
            Method method = IlIlIIlI.lI(object.getClass());
            Object object2 = Proxy.newProxyInstance(clazz2.getClassLoader(), new Class[]{clazz2}, new IlllIlll(ilIIIlIll));
            method.invoke(object, object2);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException("Failed to register 1.21.11 world render callback bridge", reflectiveOperationException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block18: {
                    block13: {
                        block17: {
                            break block17;
lbl1:
                            // 1 sources

                            while (true) {
                                block14: {
                                    break block13;
lbl3:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl5:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl7:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl9:
                                    // 1 sources

                                    while (true) {
                                        var16_1 = 0;
                                        break block14;
                                        break;
                                    }
                                    IlIlIIlI.III = var12_4;
                                    IlIlIIlI.IIl = new Object[var12_4.length];
                                    ** continue;
lbl15:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var5_13 = (var0_9[var3_11] & 255) << 24 | (var0_9[var3_11 + 1] & 255) << 16 | (var0_9[var3_11 + 2] & 255) << 8 | var0_9[var3_11 + 3] & 255;
                                    break block15;
lbl19:
                                    // 1 sources

                                    while (true) {
                                        var4_12 = 0;
                                        ** GOTO lbl7
                                        break;
                                    }
lbl22:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        IlIlIIlI.I = new String[7];
                                        IlIlIIlI.Il();
                                        IlIlIIlI.l = "net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents";
                                        var7_14 = "$AfterEntities";
                                        var6_15 = IlIlIIlI.l;
                                        IlIlIIlI.lI = var6_15 + var7_14;
                                        var8_16 = "$EndExtraction";
                                        var7_14 = IlIlIIlI.l;
                                        IlIlIIlI.Il = var7_14 + var8_16;
                                        return;
                                    }
                                }
lbl36:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl38:
                                // 1 sources

                                while (true) {
                                    var3_11 = 0;
                                    ** continue;
                                    break;
                                }
lbl41:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                var15_7 = var11_3[var13_5] ^ var9;
                                break block16;
                                break;
                            }
                        }
                        var9 = 9657;
                        break block18;
                        var2_8 = 2087536231;
                        var0_9 = "\u00b9\u001e\u001c\u00c7\u00d7\u00e2g4\u000flJ\u00a9I\u00f7\u009dN\u00cc\u00a1<\u0083\u00b7t~\u00e9\u00ef\u00e7\u000f\u009f#\u00b9\u00fb\u00a8\u0092\u00d7\b\u009cT\u00d2\u0094\u00be\u00d0\u00fe\u00a3Y\u00bc\u00b2\u00b6\u00c1".getBytes("ISO-8859-1");
                        ** while (true)
                        var15_7 = 0;
                        if (var16_1 != 0) ** GOTO lbl15
                        ** while (true)
                    }
                    if (++var13_5 >= var11_3.length) ** break;
                    ** while (true)
                    ** while (true)
lbl58:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                    var1_10 = var0_9.length / 4;
                    IlIlIIlI.ll = new int[var1_10];
                    ** while (true)
                    var12_4 = new String[var11_3.length];
                    var16_1 = -1;
                    ** while (true)
                }
                var10_2 = "\ufe91\u310f\ub459\u0cc6\u8a3d\ua58c\u2c68\uc36a\u8986\uec4d\u72ae\u4705\u8201\u52a4\ucb0b\u1c2a\uc595\u6d62\u99bb\ua4c8\u47ed\u0dd4\ud589\u6eec\uadae\u73d4\u894f\u0138\u7912\uefa1\ub274\u2e87\ue60c\u2299\u743c\uf6b1\ud9d2\u3212\u15ea\u5552\u2db6\ue766\ubcc6\u6755\u1773\ud7dd\ue3c3\ub2a4\u9e91\u165f\u3495\ufe21\u1df9\uebc8\ue909\ue2c6\u15e3\u785d\u72e0\ue61e\ud6c3\u6cfe\u06f5\u404b\u60f9\u0cc8\uc5a5\uba61\u420f\u18e6\u1e3d\ub299\u3ca1\u2b16\u25a7\u6496\ubbda\ube81\ufbdf\u9056\u5081\u9080\u413e\u81a2\u43ad\u7522\u80ed\u1ff9\u9f43\u6174\ub394\u10f7\uada3\u6ed1\u0f08\ueb0b\u19ea\ucb00\u65ef\u5929\ud8a0\u0eea\u1809\udebe\u94fb\u82c7\u1e48\u5a27\uad06\u1298\ua0da\u40c9\u4f02\u4ce2\u7635\u7b55\u6955\u2db8\u996f\u40d1\u876f\ue15e\u0e7e\u3ed3\uc3bf\uf2e3\u14bf\u6961\u5a3e\uae45\u5347\u82d1\ubce3\ua10c\ufc8d\u11f8\u15fd\u77b9\u9346\u3072\ua681\u1ecd\uf9f6\u7e89\u5b01\ud5c1\uf63d\uf01f\ufb9c\u7fad\u7b34\ub17f\uf9c4\u2109\u8841\u89ee\u3a3d\u1607\u4626\u8a52\u1ffb\ubb28\u27ac\ua8b4\u8cda\u4fcd\u4066\u6015\u3edd\u8861\uda4c\ua515\u4e0a\ua914\u2250\u6dad\uc2a1\u501d\u52a6\u3c7f\u06e9\u5b82\u0011\u9cb8\u9a7e\u1913\udb85\ub384\u668e\u89af\ub2ef\u0213\u9481\u9dfe\u1715\u0b8f\u6398\ub10e\u33b3\u8591\u9c18\u38a5\u69b6\ucb11\uf485\ub4df\u87ca\ua1cd\u3e7b\uf2fa\udf77\u293b\u53cc\u4b9e\u8139\uc068\u7e9a\u7c04\uc6ec\u19e6\u9a74\ud67f\u82ed\u7bb9\ua4d6\uf7e5\uac96\u096d\u3f00\u9778\uab67\ub74e\u8875\u1ecf\u3a2e\uaeb2\u85a5\u576f\u2971\ucb89\u8531\ua3a6\u7675\ubeff\u37aa\ua3fe\u77c1\u35b8\u3805\u087dx\u8ab8\u981e\u53b8\u4c6d\u457b\ueee2\u9192\u9d35\u5351";
                var11_3 = "\u25ad\u25f5\u25ad\u25e5\u25ad\u25b5\u25ad".toCharArray();
                ** while (true)
            }
            IlIlIIlI.ll[var4_12] = var5_13 ^= var2_8;
            var3_11 += 4;
            if (++var4_12 >= var1_10) ** break;
            ** while (true)
            ** while (true)
            var13_5 = 0;
            var14_6 = 0;
            ** while (true)
        }
        var12_4[var13_5] = var10_2.substring(var14_6, var14_6 + var15_7);
        var14_6 += var15_7;
        ** while (true)
    }

    private static synchronized void l() throws ReflectiveOperationException {
        if (II) {
            return;
        }
        Class<?> clazz = Class.forName(l);
        Object object = clazz.getField("END_EXTRACTION").get(null);
        Class<?> clazz2 = Class.forName(Il);
        Method method = IlIlIIlI.lI(object.getClass());
        Object object2 = Proxy.newProxyInstance(clazz2.getClassLoader(), new Class[]{clazz2}, new llIIIIlI());
        method.invoke(object, object2);
        II = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0xDA8535C ^ n;
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

    private static void Il() {
        IlIlIIlI.I[0] = IlIlIIlI.II(IlIlIIlI.III('\u40b3', (short)11002, 464324361).toCharArray(), 47451L, -550965700);
        IlIlIIlI.I[1] = IlIlIIlI.II(IlIlIIlI.III('\u40b2', (short)9406, -687858300).toCharArray(), 77829L, 2071009991);
        IlIlIIlI.I[2] = IlIlIIlI.II(IlIlIIlI.III('\u40b1', (short)19372, -1308071000).toCharArray(), 59369L, 1437395516);
        IlIlIIlI.I[3] = IlIlIIlI.II(IlIlIIlI.III('\u40b0', (short)56786, 193872269).toCharArray(), 88222L, -1199583854);
        IlIlIIlI.I[4] = IlIlIIlI.II(IlIlIIlI.III('\u40b7', (short)49384, -1591981098).toCharArray(), 16016L, 964184631);
        IlIlIIlI.I[5] = IlIlIIlI.II(IlIlIIlI.III('\u40b6', (short)57194, 896937987).toCharArray(), 29695L, 1241725504);
        IlIlIIlI.I[6] = IlIlIIlI.II(IlIlIIlI.III('\u40b5', (short)54171, 1541343991).toCharArray(), 98543L, 237630980);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Method lI(Class<?> clazz) throws NoSuchMethodException {
        Method[] methodArray = clazz.getMethods();
        int n = methodArray.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                throw new NoSuchMethodException("register");
            }
            Method method = methodArray[n2];
            if (method.getName().equals("register") && method.getParameterCount() == 1) {
                method.setAccessible(true);
                return method;
            }
            ++n2;
        }
    }

    private static int ll(int n, int n2) {
        return ll[n ^ 0xB304D790] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String III(char c, short s, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x40B3;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIlIIlI.IIl[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4908;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 41122;
            n6 ^= 0x5541;
            n6 -= 51439;
            n6 -= 48493;
            n6 ^= 0x6850;
            cArray[n5] = (char)((n6 -= 12979) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

