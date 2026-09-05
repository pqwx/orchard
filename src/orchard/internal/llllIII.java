/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - distanceRange
 *   - planeBounds
 *   - atlasBounds
 *   - .getBytes(
 *   - lineHeight
 *   - descender
 *   - mptAiBZa
 *   - ascender
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.resource.Resource
 *  net.minecraft.util.Identifier
 */
package orchard.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;
import orchard.core.StringFactory;
import orchard.internal.IIIlI;
import orchard.internal.IIIlIIIII;
import orchard.internal.IlIlIllll;
import orchard.internal.IlIllIIlI;
import orchard.internal.IllIlIl;
import orchard.internal.llIIl;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
final class llllIII {
    private static final Map<Long, WeakReference<llIIl>> I;
    private static final float l = 12.0f;
    private static final IIIlIIIII II;
    private static final Map<IlIllIIlI, WeakReference<llIIl>> Il;
    private static final IIIlIIIII lI;
    private static final IIIlIIIII ll;
    private static final double III = 11.0;
    private static volatile llIIl IIl;
    private static final double IlI = 9.0;
    private static volatile IlIllIIlI Ill;
    private static final IIIlIIIII lII;
    private static final IIIlIIIII lIl;
    private static final int[] llI;
    private static final String[] lll;
    private static final Object[] IIII;

    private static Identifier I(IIIlIIIII iIIlIIIII, IIIlIIIII iIIlIIIII2) {
        return Identifier.of((String)ll.IIII(), (String)lI.llIl(iIIlIIIII).llIl(iIIlIIIII2).IIII());
    }

    private static llIIl l(IlIllIIlI ilIllIIlI) {
        return llllIII.IlII(ilIllIIlI.II());
    }

    static boolean II(DrawContext drawContext, String string, double d, double d2, int n, boolean bl, boolean bl2) {
        llIIl llIIl2 = llllIII.Ill();
        return llllIII.IIlI(llIIl2, drawContext, string, d, d2, n, bl, bl2);
    }

    static boolean Il(IIIlIIIII iIIlIIIII, DrawContext drawContext, String string, double d, double d2, int n, boolean bl, boolean bl2) {
        return llllIII.IIlI(llllIII.lII(iIIlIIIII), drawContext, string, d, d2, n, bl, bl2);
    }

    /*
     * Unable to fully structure code
     */
    private static int lI(llIIl var0, String var1_1) {
        block7: {
            block5: {
                block10: {
                    block8: {
                        block6: {
                            block9: {
                                if (var0 != null) break block8;
                                break block9;
lbl3:
                                // 1 sources

                                while (true) {
                                    var5_4 = 0;
                                    break block5;
lbl6:
                                    // 1 sources

                                    while (var7_6 != null) {
                                        var2_2 += var7_6.lI * 11.0;
                                        break block6;
                                    }
                                    break block6;
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var7_6 = var0.III.getOrDefault(var6_5, var0.Il);
                                        ** GOTO lbl6
                                        break;
                                    }
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (var1_1 != null) {
                                    v0 = var1_1;
                                    break block7;
                                }
                                break block10;
                            }
                            return -1;
lbl19:
                            // 1 sources

                            while (true) {
                                var6_5 = var4_3.codePointAt(var5_4);
                                ** continue;
                                break;
                            }
                        }
                        var5_4 += Character.charCount(var6_5);
                        break block5;
                    }
                    var2_2 = 0.0;
                    ** GOTO lbl13
                }
                v0 = "";
                break block7;
            }
            ** while (var5_4 < var4_3.length())
lbl33:
            // 1 sources

            return (int)Math.ceil(var2_2);
        }
        var4_3 = v0;
        ** while (true)
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void ll() {
        Map<Object, WeakReference<llIIl>> map = Il;
        synchronized (map) {
            IIl = null;
            Ill = null;
            for (WeakReference<llIIl> weakReference : Il.values()) {
                if (weakReference == null) continue;
                weakReference.clear();
            }
            Il.clear();
        }
        map = I;
        synchronized (map) {
            for (WeakReference<llIIl> weakReference : I.values()) {
                if (weakReference == null) continue;
                weakReference.clear();
            }
            I.clear();
        }
    }

    static double III(String string) {
        llIIl llIIl2 = llllIII.Ill();
        return llllIII.llI(llIIl2, string);
    }

    /*
     * Unable to fully structure code
     */
    private static void IIl(llIIl var0, DrawContext var1_1, String var2_2, double var3_3, double var5_4, int var7_5, boolean var8_6) {
        block23: {
            block22: {
                block24: {
                    block18: {
                        block20: {
                            block21: {
                                block16: {
                                    block19: {
                                        block17: {
                                            if (var1_1 == null) break block19;
                                            break block20;
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
                                            // 1 sources

                                            while (true) {
                                                IIIlI.IIII(var1_1, var0.ll, var18_14, var20_15, var22_16, var24_17, var26_18, var27_19, var28_20, var29_21, var17_13, var0.lI);
                                                break block16;
                                                break;
                                            }
                                            var22_16 = (var16_12.IIl - var16_12.Il) * 11.0;
                                            break block21;
lbl13:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl15:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl17:
                                            // 2 sources

                                            while (true) {
                                                if (var14_10 >= var2_2.length()) break block17;
                                                ** continue;
                                                break;
                                            }
lbl20:
                                            // 1 sources

                                            while (!var8_6) {
                                                v0 = var7_5;
                                                ** GOTO lbl13
                                            }
                                            break block22;
                                        }
                                        return;
                                    }
lbl27:
                                    // 3 sources

                                    return;
lbl29:
                                    // 1 sources

                                    while (true) {
                                        break block18;
                                        break;
                                    }
lbl31:
                                    // 1 sources

                                    while (var16_12.lII()) {
                                        ** GOTO lbl20
                                    }
                                    break block16;
lbl34:
                                    // 1 sources

                                    while (var16_12 != null) {
                                        ** GOTO lbl31
                                    }
                                    break block23;
                                }
                                var9_7 += var16_12.lI * 11.0;
                                break block23;
lbl40:
                                // 1 sources

                                while (true) {
                                    var29_21 = (float)(1.0 - var16_12.III / var0.II);
                                    ** continue;
                                    break;
                                }
                            }
                            var24_17 = (var16_12.ll - var16_12.IlI) * 11.0;
                            var26_18 = (float)(var16_12.I / var0.IlI);
                            ** while (true)
lbl47:
                            // 1 sources

                            while (true) {
                                var14_10 = 0;
                                ** GOTO lbl17
                                break;
                            }
                        }
                        if (var2_2.isEmpty()) ** GOTO lbl27
                        break block24;
lbl53:
                        // 1 sources

                        while (true) {
                            var13_9 = 0;
                            ** continue;
                            break;
                        }
                        var15_11 = var2_2.codePointAt(var14_10);
                        var16_12 = var0.III.getOrDefault(var15_11, var0.Il);
                        ** GOTO lbl34
                    }
                    var9_7 = var3_3;
                    var11_8 = var5_4 + IllIlIl.IlII(11.0, var0.I, var0.IIl, var0.l);
                    ** while (true)
lbl63:
                    // 1 sources

                    while (true) {
                        var20_15 = var11_8 - var16_12.ll * 11.0;
                        ** continue;
                        break;
                    }
                    var27_19 = (float)(1.0 - var16_12.II / var0.II);
                    var28_20 = (float)(var16_12.l / var0.IlI);
                    ** while (true)
                }
                ** while ((var7_5 >>> 24 & 255) > 0)
lbl71:
                // 1 sources

                ** while (true)
lbl72:
                // 1 sources

                while (true) {
                    ++var13_9;
                    ** continue;
                    break;
                }
            }
            v0 = IIIlI.IIIIl(var7_5 >>> 24 & 255, (int)Math.round(var3_3), (int)Math.round(var5_4), var13_9);
            ** while (true)
        }
        var14_10 += Character.charCount(var15_11);
        ** while (true)
        var17_13 = v0;
        var18_14 = var9_7 + var16_12.Il * 11.0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static IlIlIllll IlI(int n, double d, JsonObject jsonObject, JsonObject jsonObject2) {
        IlIlIllll ilIlIllll;
        if (jsonObject == null) return new IlIlIllll(n, d, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        if (jsonObject2 == null) {
            return new IlIlIllll(n, d, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        }
        ilIlIllll(n, d, jsonObject.get(StringFactory.IIl("lJFSiA==")).getAsDouble(), jsonObject.get(StringFactory.IIl("mptAiBZa")).getAsDouble(), jsonObject.get("right").getAsDouble(), jsonObject.get("top").getAsDouble(), jsonObject2.get(StringFactory.IIl("lJFSiA==")).getAsDouble(), jsonObject2.get(StringFactory.IIl("mptAiBZa")).getAsDouble(), jsonObject2.get(StringFactory.IIl("ip1TlA0=")).getAsDouble(), jsonObject2.get(StringFactory.IIl("jJtE")).getAsDouble());
        return ilIlIllll;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static llIIl Ill() {
        IlIllIIlI ilIllIIlI = Interface.IIlI();
        if (ilIllIIlI.II().lll()) {
            return null;
        }
        if (Ill == ilIllIIlI && IIl != null) {
            return IIl;
        }
        Map<IlIllIIlI, WeakReference<llIIl>> map = Il;
        synchronized (map) {
            llIIl llIIl2;
            WeakReference<llIIl> weakReference = Il.get(ilIllIIlI);
            llIIl llIIl3 = llIIl2 = weakReference == null ? null : (llIIl)weakReference.get();
            if (llIIl2 != null) {
                IIl = llIIl2;
                Ill = ilIllIIlI;
                return llIIl2;
            }
            llIIl llIIl4 = llllIII.l(ilIllIIlI);
            if (llIIl4 != null) {
                Il.put(ilIllIIlI, new WeakReference<llIIl>(llIIl4));
                IIl = llIIl4;
                Ill = ilIllIIlI;
            } else {
                Il.remove(ilIllIIlI);
                if (Ill == ilIllIIlI) {
                    IIl = null;
                    Ill = null;
                }
            }
            return llIIl4;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static llIIl lII(IIIlIIIII iIIlIIIII) {
        if (iIIlIIIII == null || iIIlIIIII.lll()) {
            return null;
        }
        long l2 = iIIlIIIII.llII();
        Map<Long, WeakReference<llIIl>> map = I;
        synchronized (map) {
            llIIl llIIl2;
            WeakReference<llIIl> weakReference = I.get(l2);
            llIIl llIIl3 = llIIl2 = weakReference == null ? null : (llIIl)weakReference.get();
            if (llIIl2 != null) {
                return llIIl2;
            }
            llIIl llIIl4 = llllIII.IlII(iIIlIIIII);
            if (llIIl4 == null) {
                I.remove(l2);
                return null;
            }
            I.put(l2, new WeakReference<llIIl>(llIIl4));
            return llIIl4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean lIl() {
        if (Interface.IIlI().II().lll()) return false;
        return true;
    }

    private llllIII() {
    }

    /*
     * Unable to fully structure code
     */
    private static double llI(llIIl var0, String var1_1) {
        block9: {
            block13: {
                block12: {
                    block11: {
                        block10: {
                            block8: {
                                block7: {
                                    if (var0 == null) break block9;
                                    break block10;
lbl3:
                                    // 1 sources

                                    while (true) {
                                        var5_4 = 0;
                                        break block7;
                                        break;
                                    }
lbl6:
                                    // 2 sources

                                    while (true) {
                                        var5_4 += Character.charCount(var6_5);
                                        break block7;
                                        break;
                                    }
lbl9:
                                    // 1 sources

                                    while (true) {
                                        v0 = "";
                                        break block8;
                                        break;
                                    }
lbl12:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                if (var5_4 < var4_3.length()) {
                                    ** continue;
                                }
                                break block11;
                            }
lbl19:
                            // 2 sources

                            while (true) {
                                var4_3 = v0;
                                ** continue;
                                break;
                            }
                        }
                        var2_2 = 0.0;
                        if (var1_1 != null) break block12;
                        ** while (true)
lbl26:
                        // 1 sources

                        while (true) {
                            var2_2 += var7_6.lI * 11.0;
                            ** GOTO lbl6
                            break;
                        }
                    }
                    return var2_2;
                    var6_5 = var4_3.codePointAt(var5_4);
                    break block13;
                }
                v0 = var1_1;
                ** while (true)
            }
            var7_6 = var0.III.getOrDefault(var6_5, var0.Il);
            if (var7_6 != null) ** break;
            ** while (true)
            ** while (true)
        }
        return -1.0;
    }

    static int lll(IIIlIIIII iIIlIIIII, String string) {
        return llllIII.lI(llllIII.lII(iIIlIIIII), string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static double IIII() {
        llIIl llIIl2 = llllIII.Ill();
        if (llIIl2 != null) return 9.0;
        return -1.0;
    }

    static int IIIl(String string) {
        llIIl llIIl2 = llllIII.Ill();
        return llllIII.lI(llIIl2, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block31: {
                block29: {
                    block28: {
                        var6 = 23328;
                        ** GOTO lbl52
lbl3:
                        // 1 sources

                        while (true) {
                            break block28;
                            break;
                        }
lbl5:
                        // 1 sources

                        while (true) {
                            llllIII.lIl = StringFactory.IIII(".json");
                            ** GOTO lbl54
                            break;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            if (++var10_5 < var8_3.length) ** GOTO lbl65
                            ** GOTO lbl86
                            break;
                        }
lbl11:
                        // 2 sources

                        while (true) {
                            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                            ** GOTO lbl76
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl16:
                        // 6 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    if (var15_10 < var14_9.length) break block29;
                    break block31;
lbl21:
                    // 1 sources

                    while (true) {
                        v0 = 24;
                        ** GOTO lbl16
                        break;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                        var15_10 = 0;
                        break block29;
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var8_3 = "\u5b28\u5b28\u5b28\u5b24\u5b28\u5b28\u5b28\u5b24\u5b28\u5b2c\u5b28\u5b28\u5b34\u5b28\u5b24\u5b28\u5b2c\u5b28\u5b28\u5b30\u5b2c\u5b2c\u5b28\u5b2c\u5b2c\u5b30\u5b30\u5b30\u5b30".toCharArray();
                        ** GOTO lbl91
                        break;
                    }
lbl31:
                    // 1 sources

                    while (true) {
                        llllIII.I = new HashMap<Long, WeakReference<llIIl>>();
                        return;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        llllIII.IIII = new Object[var9_4.length];
                        ** GOTO lbl74
                        break;
                    }
lbl37:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                switch (var15_10 % 6) {
                    default: {
                        ** continue;
                    }
lbl43:
                    // 1 sources

                    while (true) {
                        var1_12 = var0_11.length / 4;
                        break block30;
                        break;
                    }
lbl46:
                    // 1 sources

                    while (true) {
                        var3_14 += 4;
                        if (++var4_15 < var1_12) ** GOTO lbl11
                        ** GOTO lbl71
                        break;
                    }
lbl50:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl52:
                    // 1 sources

                    var7_2 = "\u34b1\u346d\u3472\u34ea\u3423\u3434\u3487\u3474\u0d0e\u0de9\u0dfe\u0d46\u0d9d\u0d89\u0d5e\u0d96\u455d\u45be\u45ec\u4504\u45cf\u45dd\u4563\u459d\u5d94\u5d4e\u5d63\u5ddf\u8e97\u8e4b\u8e54\u8ecc\u8e05\u8e12\u8ea1\u8e52\u7174\u7193\u7184\u713c\u71e7\u71f3\u7124\u71ec\u36c3\u3620\u3672\u369a\u3651\u3643\u36fd\u3603\u754c\u7596\u75bb\u7507\u4eeb\u4e49\u4e39\u4ea3\u4e7b\u4e59\u4edc\u4e2f\u97a1\u977f\u9763\u97e3\u9727\u9722\u97fe\u971b\u971e\u975b\u977a\u972a\u7cd2\u7c69\u7c3f\u7ccf\u7c1f\u7c33\u7ce7\u7c4a\u5571\u55d5\u55fb\u5545\u55ba\u559f\u551a\u55e9\u45e2\u453c\u4554\u45a0\u4572\u4566\u4583\u4542\u4547\u4510\u456e\u453f\u4510\u455c\u456f\u457c\u45b0\u453e\u4533\u45d9\ue7ee\ue720\ue72c\ue7be\ue77f\ue769\ue7b6\ue775\ud7b1\ud70d\ud754\ud7d9\ud399\ud357\ud35f\ud3c9\ud30d\ud30d\ud3fc\ud35d\u1d21\u1ded\u1de2\u1d68\u1db0\u1d8d\u1d68\u1d8c\u1d82\u1dde\u1dff\u1daf\u943b\u949e\u9489\u9464\u94af\u94bb\u9473\u94f8\ubdc1\ubd1a\ubd05\ubdaa\ubd50\ubd7a\ubd8b\ubd7a\u0f7b\u0fa7\u0fcf\u0f12\u0fed\u0feb\u0f36\u0fd0\u0fde\u0fa1\u0fed\u0fae\u0f80\u0fdc\u0f8f\u0fbf\u60e6\u6028\u6006\u60b7\u6071\u6071\u6088\u604b\u6043\u603e\u6030\u6069\u7346\u7398\u7387\u7304\u73d1\u73f8\u7337\u73e6\u73e0\u738e\u73ca\u73b1\ueb5b\uebfa\uebb4\ueb1f\uebc8\uebdf\ueb14\uebe4\u83c7\u830d\u8334\u83ad\u8354\u837d\u8390\u836d\u8365\u8318\u831f\u834f\ue8ba\ue877\ue87c\ue8f0\ue82e\ue82d\ue8d4\ue816\ue81f\ue862\ue865\ue835\u6d4b\u6d92\u6da3\u6d10\u6dde\u6de2\u6d3d\u6d87\u6de4\u6db1\u6dc0\u6da7\u6db9\u6de1\u6df0\u6d8a\u05c1\u0518\u0529\u059a\u0554\u0568\u05b7\u050d\u056e\u053b\u054a\u052d\u0533\u056b\u057a\u0500\u8c54\u8c9a\u8c92\u8c04\u8cc0\u8cc0\u8c2e\u8c9c\u8cff\u8caa\u8cdb\u8cbc\u8ca2\u8cfa\u8ceb\u8c91\u014b\u0185\u018d\u011b\u01df\u01df\u0131\u0183\u01e0\u01b5\u01c4\u01a3\u01bd\u01e5\u01f4\u018e";
                    ** continue;
lbl54:
                    // 1 sources

                    llllIII.lII = StringFactory.IIII(".png");
                    ** continue;
lbl56:
                    // 1 sources

                    while (true) {
                        var0_11 = "\u00b7p8\u00c5+Ag\u0085\u0087\u001c&*i\u00c35si =F\u00e8^\u001f\u0083\u00eaMB\u00d7\u0014t\u00dc\u00f9".getBytes("ISO-8859-1");
                        ** continue;
                        break;
                    }
                    case 3: {
                        v0 = 108;
                        ** GOTO lbl16
                    }
                    case 2: {
                        v0 = 110;
                        ** GOTO lbl16
                    }
lbl65:
                    // 2 sources

                    while (true) {
                        var12_7 = var8_3[var10_5] ^ var6;
                        ** continue;
                        break;
                    }
lbl68:
                    // 1 sources

                    while (true) {
                        llllIII.lll = var9_4;
                        ** continue;
                        break;
                    }
lbl71:
                    // 1 sources

                    llllIII.ll = StringFactory.IIII("cats");
                    llllIII.lI = StringFactory.IIII("p4z8m1/");
                    ** continue;
lbl74:
                    // 1 sources

                    var2_13 = 1105199031;
                    ** continue;
lbl76:
                    // 1 sources

                    llllIII.llI[var4_15] = var5_16 ^= var2_13;
                    ** continue;
                    case 4: {
                        v0 = 60;
                        ** GOTO lbl16
                    }
lbl81:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl83:
                    // 1 sources

                    while (true) {
                        var13_8 = -1;
                        ** GOTO lbl37
                        break;
                    }
lbl86:
                    // 1 sources

                    var13_8 = 0;
                    ** continue;
                    var3_14 = 0;
                    var4_15 = 0;
                    ** continue;
lbl91:
                    // 1 sources

                    var9_4 = new String[var8_3.length];
                    ** continue;
                    var12_7 = 0;
                    if (var13_8 != 0) ** continue;
                    ** continue;
                    case 1: {
                        v0 = 15;
                        ** GOTO lbl16
                    }
                    case 5: 
                }
                v0 = 127;
                ** while (true)
lbl102:
                // 1 sources

                while (true) {
                    ** continue;
                    break;
                }
            }
            var9_4[var10_5] = new String(var14_9).intern();
            var11_6 += var12_7;
            ** while (true)
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
            ** while (true)
        }
        llllIII.llI = new int[var1_12];
        ** while (true)
        var10_5 = 0;
        var11_6 = 0;
        ** while (true)
        llllIII.II = StringFactory.IIII("distanceRange");
        llllIII.Il = new EnumMap<IlIllIIlI, WeakReference<llIIl>>(IlIllIIlI.class);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIlI(llIIl llIIl2, DrawContext drawContext, String string, double d, double d2, int n, boolean bl, boolean bl2) {
        String string2;
        if (llIIl2 == null) {
            return false;
        }
        String string3 = string2 = string == null ? "" : string;
        if (bl) {
            int n2 = (n >>> 24 & 0xFF) << 24;
            llllIII.IIl(llIIl2, drawContext, string2, d + 1.0, d2 + 1.0 + llllIII.IIll(llIIl2), n2, false);
        }
        llllIII.IIl(llIIl2, drawContext, string2, d, d2 + llllIII.IIll(llIIl2), n, bl2);
        return true;
    }

    private static double IIll(llIIl llIIl2) {
        double d = IllIlIl.lI(11.0, llIIl2.I, llIIl2.IIl, llIIl2.l);
        return (9.0 - d) * 0.5;
    }

    private static llIIl IlII(IIIlIIIII iIIlIIIII) {
        llIIl llIIl2;
        Resource resource;
        Object object;
        Identifier identifier = llllIII.I(iIIlIIIII, lIl);
        Identifier identifier2 = llllIII.I(iIIlIIIII, lII);
        InputStream inputStream = null;
        try {
            object = MinecraftClient.getInstance();
            if (object != null && object.getResourceManager() != null && (resource = (Resource)object.getResourceManager().getResource(identifier).orElse(null)) != null) {
                inputStream = resource.getInputStream();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (inputStream == null) {
            String string = identifier.getPath();
            String string2 = "/";
            String string3 = identifier.getNamespace();
            String string4 = "aullml";
            object = string4 + string3 + string2 + string;
            inputStream = llllIII.class.getClassLoader().getResourceAsStream((String)object);
        }
        if (inputStream == null) {
            return null;
        }
        object = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        try {
            resource = JsonParser.parseReader((Reader)object).getAsJsonObject();
            JsonObject jsonObject = resource.getAsJsonObject("atlas");
            JsonObject jsonObject2 = resource.getAsJsonObject("metrics");
            double d = jsonObject.get("width").getAsDouble();
            double d2 = jsonObject.get("height").getAsDouble();
            float f = jsonObject.has(II.IIII()) ? jsonObject.get(II.IIII()).getAsFloat() : 12.0f;
            double d3 = jsonObject2.get("lineHeight").getAsDouble();
            double d4 = jsonObject2.get("ascender").getAsDouble();
            double d5 = jsonObject2.get("descender").getAsDouble();
            HashMap<Integer, IlIlIllll> hashMap = new HashMap<Integer, IlIlIllll>();
            JsonArray jsonArray = resource.getAsJsonArray("glyphs");
            for (JsonElement jsonElement : jsonArray) {
                JsonObject jsonObject3 = jsonElement.getAsJsonObject();
                int n = jsonObject3.get("unicode").getAsInt();
                double d6 = jsonObject3.get("advance").getAsDouble();
                JsonObject jsonObject4 = jsonObject3.has("planeBounds") ? jsonObject3.getAsJsonObject("planeBounds") : null;
                JsonObject jsonObject5 = jsonObject3.has("atlasBounds") ? jsonObject3.getAsJsonObject("atlasBounds") : null;
                hashMap.put(n, llllIII.IlI(n, d6, jsonObject4, jsonObject5));
            }
            llIIl2 = new llIIl(identifier2, d, d2, f, d3, d4, d5, hashMap, (IlIlIllll)hashMap.get(63));
        }
        catch (Throwable throwable) {
            try {
                try {
                    ((InputStreamReader)object).close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (Exception exception) {
                return null;
            }
        }
        ((InputStreamReader)object).close();
        return llIIl2;
    }

    private static int IlIl(int n, int n2) {
        return llI[n ^ 0x64915345] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xE16630F9;
        char[] cArray = lll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            llllIII.IIII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xB79A31B7;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 6: {
                    n6 = 197;
                    continue block33;
                }
                case 28: {
                    n6 = 35;
                    continue block33;
                }
                case 25: {
                    n6 = 192;
                    continue block33;
                }
                case 19: {
                    n6 = 221;
                    continue block33;
                }
                case 29: {
                    n6 = 46;
                    continue block33;
                }
                case 4: {
                    n6 = 17;
                    continue block33;
                }
                case 12: {
                    n6 = 125;
                    continue block33;
                }
                case 10: {
                    n6 = 9;
                    continue block33;
                }
                case 27: {
                    n6 = 115;
                    continue block33;
                }
                case 9: {
                    n6 = 50;
                    continue block33;
                }
                case 15: {
                    n6 = 67;
                    continue block33;
                }
                case 1: {
                    n6 = 79;
                    continue block33;
                }
                case 7: {
                    n6 = 33;
                    continue block33;
                }
                case 26: {
                    n6 = 149;
                    continue block33;
                }
                case 22: {
                    n6 = 242;
                    continue block33;
                }
                case 11: {
                    n6 = 26;
                    continue block33;
                }
                case 20: {
                    n6 = 190;
                    continue block33;
                }
                case 16: {
                    n6 = 249;
                    continue block33;
                }
                case 24: {
                    n6 = 201;
                    continue block33;
                }
                case 14: {
                    n6 = 113;
                    continue block33;
                }
                case 5: {
                    n6 = 109;
                    continue block33;
                }
                case 3: {
                    n6 = 178;
                    continue block33;
                }
                case 21: {
                    n6 = 32;
                    continue block33;
                }
                case 2: {
                    n6 = 61;
                    continue block33;
                }
                default: {
                    n6 = 162;
                    continue block33;
                }
                case 18: {
                    n6 = 32;
                    continue block33;
                }
                case 13: {
                    n6 = 63;
                    continue block33;
                }
                case 31: {
                    n6 = 252;
                    continue block33;
                }
                case 8: {
                    n6 = 74;
                    continue block33;
                }
                case 23: {
                    n6 = 190;
                    continue block33;
                }
                case 30: {
                    n6 = 194;
                    continue block33;
                }
                case 17: 
            }
            n6 = 16;
        }
        return new String(cArray).intern();
    }
}

