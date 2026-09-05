/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIlIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   -  Variability
 *   -  Window
 *   - .getBytes(
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIllIl;

@Environment(value=EnvType.CLIENT)
public final class IIIlIlIIl
extends IIllIl<double[]> {
    private IIIlIIIII I = StringFactory.lIl("");
    private static final IIIlIIIII l;
    private final double II;
    private final double Il;
    private final double lII;
    private static final IIIlIIIII lIl;
    private static final int[] llI;
    private static final String[] lll;
    private static final Object[] IIII;

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block13: {
                block14: {
                    block15: {
                        block17: {
                            block18: {
                                block16: {
                                    break block16;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var13_4 = -1;
                                        break block13;
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
                                        continue;
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        var9_3 = new String[var8_2.length];
                                        ** continue;
                                        break;
                                    }
                                    IIIlIlIIl.IIII = new Object[var9_3.length];
                                    break block17;
                                }
                                var6 = 582;
                                break block18;
lbl16:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                IIIlIlIIl.l = StringFactory.IIII(" Variability");
                                IIIlIlIIl.lIl = StringFactory.IIII(" Window");
                                return;
lbl21:
                                // 1 sources

                                while (true) {
                                    var13_4 = 0;
                                    break block13;
                                    break;
                                }
lbl24:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl26:
                                // 1 sources

                                while (true) {
                                    var11_6 += var12_7;
                                    break block14;
                                    break;
                                }
                            }
                            var7_1 = "\ub688\ub671\ub6f4\ub62b\ub6e6\ub684\ub649\ub636\ub619\ub631\ub671\ub68e\ub6d7\ub67c\ub6e7\ub69b\u4312\u43eb\u436a\u4383\u437d\u431e\u43a0\u43a2\u4384\u43b4\u4381\u434b";
                            var8_2 = "\u0256\u024a".toCharArray();
                            ** while (true)
lbl33:
                            // 1 sources

                            while (var13_4 == 0) {
                                break block15;
                            }
                            break block19;
lbl36:
                            // 1 sources

                            while (true) {
                                var12_7 = 0;
                                ** GOTO lbl33
                                break;
                            }
lbl39:
                            // 1 sources

                            while (true) {
                                var4_12 = 0;
                                ** GOTO lbl24
                                break;
                            }
                        }
                        var2_8 = 1995510794;
                        var0_9 = "X\u000e\u00b7R".getBytes("ISO-8859-1");
                        var1_10 = var0_9.length / 4;
                        ** while (true)
                    }
                    IIIlIlIIl.lll = var9_3;
                    ** while (true)
                }
                if (++var10_5 >= var8_2.length) {
                    ** continue;
                }
                break block19;
            }
            var10_5 = 0;
            var11_6 = 0;
            ** while (true)
lbl58:
            // 1 sources

            while (true) {
                var3_11 += 4;
                if (++var4_12 >= var1_10) ** break;
                ** continue;
                ** continue;
                break;
            }
        }
        var12_7 = var8_2[var10_5] ^ var6;
        var9_3[var10_5] = var7_1.substring(var11_6, var11_6 + var12_7);
        ** while (true)
        IIIlIlIIl.llI = new int[var1_10];
        var3_11 = 0;
        ** while (true)
        var5_13 = (var0_9[var3_11] & 255) << 24 | (var0_9[var3_11 + 1] & 255) << 16 | (var0_9[var3_11 + 2] & 255) << 8 | var0_9[var3_11 + 3] & 255;
        IIIlIlIIl.llI[var4_12] = var5_13 ^= var2_8;
        ** while (true)
    }

    @Override
    public long lllI() {
        return this.llI().llII();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void I(double[] dArray) {
        double d;
        if (dArray == null) return;
        if (dArray.length < 2) {
            return;
        }
        double d2 = this.lll(Math.max(this.lII, Math.min(this.II, dArray[0])));
        if (d2 > (d = this.lll(Math.max(this.lII, Math.min(this.II, dArray[1]))))) {
            double d3 = d2;
            d2 = d;
            d = d3;
        }
        super.II(new double[]{d2, d});
    }

    @Override
    public String llII() {
        return this.llI().IIII();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public JsonElement III() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((JsonElement)new JsonPrimitive((Number)((double[])this.lIl())[0]));
        jsonArray.add((JsonElement)new JsonPrimitive((Number)((double[])this.lIl())[1]));
        return jsonArray;
    }

    public String Il() {
        return this.I.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    public IIIlIlIIl(Object object, double d, double d2, double d3, double d4, double d5) {
        super(object, new double[]{d, d2});
        this.lII = d3;
        this.II = d4;
        this.Il = d5;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int lI() {
        double d = Math.abs(this.Il);
        int n = 0;
        while (n < 6 && Math.abs(d - Math.rint(d)) > 1.0E-6) {
            d *= 10.0;
            ++n;
        }
        return n;
    }

    public double IIl() {
        return this.Il;
    }

    public double IlI() {
        return this.II;
    }

    public IIIlIlIIl lII(String string) {
        return this.IIll(string);
    }

    public IIIlIlIIl(String string, double d, double d2, double d3, double d4, double d5) {
        this((Object)string, d, d2, d3, d4, d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIlIIIII llI() {
        IIIlIIIII iIIlIIIII = this.llIl();
        if (!iIIlIIIII.IllI(l)) {
            if (!iIIlIIIII.IllI(lIl)) return iIIlIIIII;
            return iIIlIIIII.II(iIIlIIIII.IIll() - lIl.IIll());
        }
        return iIIlIIIII.II(iIIlIIIII.IIll() - l.IIll());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double lll(double d) {
        if (this.Il <= 0.0) {
            return d;
        }
        long l2 = Math.round(d / this.Il);
        return BigDecimal.valueOf(this.Il).multiply(BigDecimal.valueOf(l2)).setScale(this.lI(), RoundingMode.HALF_UP).doubleValue();
    }

    public double IIII() {
        return ((double[])this.lIl())[1];
    }

    public double IIIl() {
        return ((double[])this.lIl())[0];
    }

    public double IIlI() {
        return this.lII;
    }

    /*
     * Enabled aggressive block sorting
     */
    public IIIlIlIIl IIll(Object object) {
        IIIlIIIII iIIlIIIII;
        if (object instanceof IIIlIIIII) {
            IIIlIIIII iIIlIIIII2 = (IIIlIIIII)object;
            iIIlIIIII = iIIlIIIII2;
        } else {
            iIIlIIIII = StringFactory.lIl(object == null ? "" : object.toString());
        }
        this.I = iIIlIIIII;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void l(JsonElement jsonElement) {
        if (jsonElement != null && jsonElement.isJsonArray()) {
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            if (jsonArray.size() < 2) return;
            this.I(new double[]{jsonArray.get(0).getAsDouble(), jsonArray.get(1).getAsDouble()});
            return;
        }
        if (jsonElement == null) return;
        if (!jsonElement.isJsonPrimitive()) return;
        if (!jsonElement.getAsJsonPrimitive().isNumber()) return;
        double d = jsonElement.getAsDouble();
        this.I(new double[]{d, d});
    }

    public IIIlIIIII IlII() {
        return this.I;
    }

    private static int IlIl(int n, int n2) {
        return llI[n ^ 0x463009BF] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x5487331A;
        char[] cArray = lll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIlIlIIl.IIII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xAEBC4CE6;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 30 -> 181;
                case 5 -> 206;
                case 10 -> 4;
                case 1 -> 24;
                case 26 -> 60;
                case 14 -> 177;
                case 13 -> 7;
                case 22 -> 249;
                case 7 -> 67;
                default -> 152;
                case 21 -> 84;
                case 27 -> 119;
                case 29 -> 237;
                case 2 -> 156;
                case 16 -> 123;
                case 31 -> 6;
                case 8 -> 110;
                case 4 -> 174;
                case 15 -> 248;
                case 23 -> 222;
                case 19 -> 114;
                case 3 -> 95;
                case 28 -> 126;
                case 18 -> 232;
                case 11 -> 206;
                case 17 -> 222;
                case 25 -> 251;
                case 24 -> 74;
                case 9 -> 123;
                case 20 -> 40;
                case 12 -> 180;
                case 6 -> 41;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

