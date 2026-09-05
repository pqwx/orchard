/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 */
package orchard.internal;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import orchard.internal.IIlIIIlll;
import orchard.internal.IlIIllllI;
import orchard.internal.IlllIIll;
import orchard.internal.lIIIIIll;
import orchard.internal.lIIlllI;

public final class IlIIlIII {
    private static final double I = 0.05;
    private IIlIIIlll l;
    private static final double II = 28.0;
    private long Il;
    private static final double lI = 26.0;
    private static final double ll = 210.0;
    private static final double III = 0.96;
    private static final double IIl = 240.0;
    private final Map<String, IlIIllllI> IlI = new LinkedHashMap<String, IlIIllllI>();
    private static final double Ill = 5.0E-4;
    private static final double lII = 0.008333333333333333;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ boolean I(IlIIllllI ilIIllllI) {
        if (ilIIllllI.IlI) return false;
        if (!(ilIIllllI.IIl <= 5.0E-4)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public IIlIIIlll l(List<lIIlllI> var1_2, double var2_3, double var4_4, double var6_5, long var8_1) {
        block40: {
            block36: {
                block34: {
                    block38: {
                        block29: {
                            block39: {
                                block21: {
                                    block28: {
                                        block25: {
                                            block33: {
                                                block27: {
                                                    block31: {
                                                        block26: {
                                                            block30: {
                                                                block20: {
                                                                    block32: {
                                                                        block37: {
                                                                            block24: {
                                                                                block22: {
                                                                                    block35: {
                                                                                        block23: {
                                                                                            block19: {
                                                                                                var10_6 = IlIIlIII.ll(var2_3);
                                                                                                var12_7 = IlIIlIII.ll(var4_4);
                                                                                                var14_8 = IlIIlIII.Ill(var6_5, 0.0, 1.0);
                                                                                                var16_9 = this.Il(var8_1);
                                                                                                var18_10 = this.IlI.values().iterator();
                                                                                                break block35;
lbl7:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    var23_15 = (IlIIllllI)var22_14.next();
                                                                                                    if (var19_11.contains(var23_15.Il)) break block19;
                                                                                                    break block20;
                                                                                                    break;
                                                                                                }
lbl11:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    var25_20 = (IlIIllllI)var24_16.next();
                                                                                                    var26_19 = Math.max(0, Math.min(var25_20.lI, var23_15.size()));
                                                                                                    var23_15.add(var26_19, var25_20.Il);
                                                                                                    break block21;
lbl16:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        ++var31_24;
                                                                                                        break block22;
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
lbl19:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    if (var20_12.l() == null) break block23;
                                                                                                    break block24;
                                                                                                    break;
                                                                                                }
                                                                                            }
lbl23:
                                                                                            // 3 sources

                                                                                            while (true) {
                                                                                                if (!var22_14.hasNext()) break block25;
                                                                                                ** continue;
                                                                                                while (true) {
                                                                                                    var31_25 = Math.max(0.0, var25_21 - var29_23);
                                                                                                    this.l = new IIlIIIlll(List.copyOf(var24_16), var27_22, var31_25);
                                                                                                    return this.l;
                                                                                                }
lbl30:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    var32_26.lI = var31_24;
                                                                                                    var33_27 = IlIIlIII.II(var32_26.IIl);
                                                                                                    var35_28 = var25_21;
                                                                                                    if (var32_26.II) break block26;
                                                                                                    break block27;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
lbl37:
                                                                                        // 5 sources

                                                                                        while (true) {
                                                                                            if (!var19_11.hasNext()) break block28;
                                                                                            break block29;
                                                                                            break;
                                                                                        }
                                                                                    }
lbl41:
                                                                                    // 2 sources

                                                                                    while (var18_10.hasNext()) {
                                                                                        break block30;
                                                                                    }
                                                                                    break block36;
                                                                                }
lbl45:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    if (var31_24 >= var23_15.size()) ** continue;
                                                                                    break block31;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (var20_12.l().isBlank()) ** GOTO lbl37
                                                                            break block37;
lbl51:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                v0 = 0.0;
                                                                                break block32;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var18_10.putIfAbsent(var20_12.l(), var20_12);
                                                                        ** GOTO lbl37
                                                                    }
lbl59:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var23_15.IIl = IlIIlIII.III(v1, v0, var14_8, var16_9);
                                                                        var24_16 = IlIIlIII.IlI(var23_15.III, var23_15.I, var23_15.ll, var16_9, 240.0, 28.0);
                                                                        var23_15.III = var24_16.I();
                                                                        var23_15.I = var24_16.l();
                                                                        ** GOTO lbl23
                                                                        break;
                                                                    }
                                                                }
                                                                v1 = var23_15.IIl;
                                                                ** while (!var23_15.IlI)
lbl68:
                                                                // 1 sources

                                                                break block38;
                                                            }
                                                            var19_11 = var18_10.next();
                                                            var19_11.IlI = false;
                                                            ** GOTO lbl41
                                                        }
                                                        var37_29 = IlIIlIII.IlI(var32_26.Ill, var32_26.l, var35_28, var16_9, 210.0, 26.0);
                                                        var32_26.Ill = var37_29.I();
                                                        var32_26.l = var37_29.l();
                                                        break block39;
lbl78:
                                                        // 1 sources

                                                        while (true) {
                                                            var26_18 = new IlIIllllI(var23_15.l(), var24_17, var21_13);
                                                            this.IlI.put(var23_15.l(), var26_18);
                                                            var19_11.add(var23_15.l());
                                                            break block33;
                                                            break;
                                                        }
                                                    }
                                                    ** while ((var32_26 = this.IlI.get(var23_15.get((int)var31_24))) != null)
lbl87:
                                                    // 1 sources

                                                    ** GOTO lbl16
                                                }
                                                var32_26.Ill = var35_28;
                                                var32_26.II = true;
                                                break block39;
                                            }
                                            while (true) {
                                                var26_18.IlI = true;
                                                var26_18.ll = var24_17;
                                                var20_12.add(var23_15.l());
                                                ++var21_13;
                                                break block34;
                                                break;
                                            }
                                        }
                                        this.IlI.values().removeIf((Predicate<IlIIllllI>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, I(orchard.internal.IlIIllllI ), (Lorchard/internal/IlIIllllI;)Z)());
                                        var22_14 = this.IlI.values().stream().filter((Predicate<IlIIllllI>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lIl(orchard.internal.IlIIllllI ), (Lorchard/internal/IlIIllllI;)Z)()).sorted(Comparator.comparingInt((ToIntFunction<IlIIllllI>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, lI(orchard.internal.IlIIllllI ), (Lorchard/internal/IlIIllllI;)I)())).toList();
                                        var23_15 = new ArrayList<String>((Collection<String>)var20_12);
                                        var24_16 = var22_14.iterator();
                                        break block21;
                                    }
lbl108:
                                    // 2 sources

                                    while (true) {
                                        var19_11 = new HashSet<String>();
                                        var20_12 = new ArrayList<E>(var18_10.size());
                                        var21_13 = 0;
                                        var22_14 = var18_10.values().iterator();
                                        break block34;
                                        break;
                                    }
lbl114:
                                    // 1 sources

                                    while (true) {
                                        var24_16 = new ArrayList<lIIIIIll>(var23_15.size());
                                        var25_21 = 0.0;
                                        var27_22 = 0.0;
                                        var29_23 = 0.0;
                                        var31_24 = 0;
                                        ** continue;
                                        break;
                                    }
lbl121:
                                    // 1 sources

                                    while (true) {
                                        var19_11 = var1_2.iterator();
                                        ** GOTO lbl37
                                        break;
                                    }
                                }
                                ** while (!var24_16.hasNext())
lbl126:
                                // 1 sources

                                ** while (true)
lbl127:
                                // 1 sources

                                while (true) {
                                    var23_15 = (lIIlllI)var22_14.next();
                                    var24_17 = IlIIlIII.ll(var23_15.I());
                                    if ((var26_18 = this.IlI.get(var23_15.l())) != null) ** continue;
                                    ** continue;
                                    break;
                                }
                            }
                            var24_16.add(new lIIIIIll(var32_26.Il, var32_26.IlI, var32_26.IIl, var33_27, var32_26.Ill, var32_26.III, var32_26.ll, var32_26.lI));
                            var27_22 = Math.max(var27_22, var32_26.ll);
                            var25_21 += (var10_6 + var12_7) * var33_27;
                            var29_23 = var12_7 * var33_27;
                            ** while (true)
                        }
                        var20_12 = (lIIlllI)var19_11.next();
                        if (var20_12 != null) ** break;
                        ** while (true)
                        ** while (true)
                    }
                    v0 = 1.0;
                    ** while (true)
                }
                if (var22_14.hasNext()) {
                    ** continue;
                }
                break block40;
            }
            var18_10 = new LinkedHashMap<K, V>();
            ** while (var1_2 == null)
lbl154:
            // 1 sources

            ** while (true)
        }
        var22_14 = this.IlI.values().iterator();
        ** while (true)
    }

    private static double II(double d) {
        double d2 = 1.0 - IlIIlIII.Ill(d, 0.0, 1.0);
        return 1.0 - d2 * d2 * d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double Il(long l2) {
        if (this.Il == Long.MIN_VALUE) {
            this.Il = l2;
            return 0.0;
        }
        if (l2 > this.Il) {
            double d = (double)(l2 - this.Il) / 1.0E9;
            this.Il = l2;
            return Math.min(0.05, Math.max(0.0, d));
        }
        return 0.0;
    }

    private static /* synthetic */ int lI(IlIIllllI ilIIllllI) {
        return ilIIllllI.lI;
    }

    public IlIIlIII() {
        this.l = IIlIIIlll.Il();
        this.Il = Long.MIN_VALUE;
    }

    private static double ll(double d) {
        return !Double.isFinite(d) ? 0.0 : Math.max(0.0, d);
    }

    private static double III(double d, double d2, double d3, double d4) {
        if (!(d4 <= 0.0) && d != d2) {
            double d5 = d4 * 60.0;
            double d6 = 1.0 - Math.pow(1.0 - IlIIlIII.Ill(d3, 0.0, 1.0), d5);
            return d + (d2 - d) * d6;
        }
        return d;
    }

    public void IIl() {
        this.IlI.clear();
        this.l = IIlIIIlll.Il();
        this.Il = Long.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static IlllIIll IlI(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d4 <= 0.0) {
            return new IlllIIll(d, d2);
        }
        int n = Math.max(1, (int)Math.ceil(d4 / 0.008333333333333333));
        double d7 = d4 / (double)n;
        double d8 = d;
        double d9 = d2;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                if (!(Math.abs(d3 - d8) < 5.0E-4)) return new IlllIIll(d8, d9);
                if (!(Math.abs(d9) < 0.005)) return new IlllIIll(d8, d9);
                return new IlllIIll(d3, 0.0);
            }
            double d10 = (d3 - d8) * d5 - d9 * d6;
            d8 += (d9 += d10 * d7) * d7;
            ++n2;
        }
    }

    private static double Ill(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public IIlIIIlll lII() {
        return this.l;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ boolean lIl(IlIIllllI ilIIllllI) {
        if (ilIIllllI.IlI) return false;
        return true;
    }
}

