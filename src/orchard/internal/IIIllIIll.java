/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Conservative
 *   - .getBytes(
 *   - Aggressive
 *   - Balanced
 *   - Strict
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 */
package orchard.internal;

public final class IIIllIIll
extends Enum<IIIllIIll> {
    private final String I;
    public static final /* enum */ IIIllIIll l;
    private final double II;
    public static final /* enum */ IIIllIIll Il;
    private static final /* synthetic */ IIIllIIll[] lI;
    public static final /* enum */ IIIllIIll ll;
    private static String[] III;
    private final double IIl;
    public static final /* enum */ IIIllIIll IlI;
    private static final int[] Ill;
    private static final String[] lII;
    private static final Object[] lIl;

    private static /* synthetic */ IIIllIIll[] I() {
        return new IIIllIIll[]{l, IlI, Il, ll};
    }

    public double l() {
        return this.IIl;
    }

    public static IIIllIIll II(String string) {
        return Enum.valueOf(IIIllIIll.class, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block32: {
            block29: {
                block30: {
                    block27: {
                        block24: {
                            block28: {
                                block26: {
                                    block31: {
                                        block25: {
                                            break block30;
lbl1:
                                            // 1 sources

                                            while (var15_10 >= var14_9.length) {
                                                break block24;
                                            }
                                            break block31;
lbl4:
                                            // 1 sources

                                            while (true) {
                                                v0 = var15_10++;
                                                var14_9[v0] = (char)(var14_9[v0] ^ var16_1 ^ var6);
                                                ** GOTO lbl1
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
                                                var13_8 = -1;
                                                break block25;
                                                break;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                var9_4 = new String[var8_3.length];
                                                ** continue;
                                                break;
                                            }
lbl16:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
lbl19:
                                        // 2 sources

                                        while (true) {
                                            var10_5 = 0;
                                            ** GOTO lbl47
                                            break;
                                        }
                                    }
                                    block13: while (true) {
                                        switch (var15_10 % 5) {
                                            default: {
                                                v1 = 85;
                                                break block13;
                                            }
lbl28:
                                            // 2 sources

                                            while (true) {
                                                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                                                ** continue;
                                                break;
                                            }
lbl31:
                                            // 1 sources

                                            while (true) {
                                                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                                                var15_10 = 0;
                                                continue block13;
                                                break;
                                            }
lbl35:
                                            // 1 sources

                                            while (true) {
                                                var1_12 = var0_11.length / 4;
                                                break block26;
lbl38:
                                                // 1 sources

                                                while (true) {
                                                    var3_14 = 0;
                                                    break block27;
                                                    break;
                                                }
                                                break;
                                            }
                                            case 3: {
                                                v1 = 28;
                                                break block13;
                                            }
                                            case 1: {
                                                v1 = 59;
                                                break block13;
                                            }
lbl47:
                                            // 1 sources

                                            var11_6 = 0;
                                            break block28;
                                        }
                                        break;
                                    }
lbl49:
                                    // 5 sources

                                    while (true) {
                                        var16_1 = v1;
                                        ** continue;
                                        break;
                                    }
                                }
                                IIIllIIll.Ill = new int[var1_12];
                                ** while (true)
lbl55:
                                // 1 sources

                                while (true) {
                                    var0_11 = "\u000f\u00c9\u00c7\u00c2\u00a2\u0000x\u00d6\u009e\n\u00f9\u008a+\u0089\u009f\u00d64c\u00fb0\u00ab?\u0016\u00c9\u0080.\u00d38`\u00fd\u009c\u00c6\u00da\u00a6\u00ca\u001c\u00f61\u0002\u00cd\u0007\u009d\u0019\u000fU\u0097\u00a7\u00d6\u001b=*\u008c\u00a6A\rx\u00a8\u00ef\u00b1\u00d6".getBytes("ISO-8859-1");
                                    ** continue;
                                    break;
                                }
                            }
                            var12_7 = '\u0000';
                            if (var13_8 != 0) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var12_7 = var8_3[var10_5];
                                    ** continue;
                                    break;
                                }
lbl64:
                                // 1 sources

                                while (true) {
                                    var11_6 += var12_7;
                                    break block29;
                                    break;
                                }
                            }
                            IIIllIIll.lII = var9_4;
                            ** while (true)
                            IIIllIIll.Ill[var4_15] = var5_16 ^= var2_13;
                            var3_14 += 4;
                            if (++var4_15 < var1_12) ** GOTO lbl28
                            IIIllIIll.III = new String[8];
                            IIIllIIll.lI();
                            IIIllIIll.l = new IIIllIIll("Strict", 1.0, 1.0);
                            IIIllIIll.IlI = new IIIllIIll("Aggressive", 2.0, 2.0);
                            IIIllIIll.Il = new IIIllIIll("Balanced", 8.0, 8.0);
                            IIIllIIll.ll = new IIIllIIll("Conservative", 12.0, 12.0);
                            IIIllIIll.lI = IIIllIIll.I();
                            return;
                            {
                                case 2: {
                                    v1 = 98;
                                    break;
                                }
                            }
                        }
                        var9_4[var10_5] = new String(var14_9).intern();
                        ** while (true)
                    }
                    var4_15 = 0;
                    ** while (true)
                }
                var6 = 19956;
                break block32;
                IIIllIIll.lIl = new Object[var9_4.length];
                var2_13 = 1137869763;
                ** while (true)
lbl95:
                // 1 sources

                while (true) {
                    var13_8 = 0;
                    ** continue;
                    break;
                }
            }
            ** while (++var10_5 < var8_3.length)
lbl100:
            // 1 sources

            ** while (true)
            {
                ** case 4:
            }
lbl102:
            // 1 sources

            v1 = 27;
            ** while (true)
        }
        var7_2 = "\uce1c\u57f6\u3bba\u0b62\u371f\uf60a\u726d\ue86c\ue9e6\u34a0\u8df1\ue54d\ufa1f\u657b\u238e\u8a00\ued0a\u6468\u063f\u5908\u48a0\u5fdb\uc914\u10c9\u2817\u7fb4\u4fa7\u1c2d\u2bb2\u29aa\u22c2\uaf16\u793c\u452f\u9d5c\u2e3a\u1644\u3c3a\u8929\ucf83\uc5cf\ubbae\ud9fd\u1c34\ua58a\u2526\uf825\u244d\ue8f3\u0303\uee05\ub1a0\u1fa3\uad9f\uf856\u75a3\ubb62\ud8e7\u1c1f\u7895\ucf69\ub36b\ue0a7\udf34\u99b4\u0d8f\uaf95\ufe03\u0f6e\u78e9\u3b9f\ua682\u4bb2\ua969\u80c2\u4953\u72d3\ue8eb\u53fb\ua8f5\u7849\uf40b\u14ac\u0ff1\u277d\u50d6\u1324\u03f7";
        var8_3 = "\f\f\b\u0010\u0010\b\u0006\n".toCharArray();
        ** while (true)
    }

    private IIIllIIll(String string2, double d, double d2) {
        this.I = string2;
        this.IIl = d;
        this.II = d2;
    }

    public double Il() {
        return this.II;
    }

    public static IIIllIIll[] values() {
        return (IIIllIIll[])lI.clone();
    }

    public String toString() {
        return this.I;
    }

    private static void lI() {
        IIIllIIll.III[0] = IIIllIIll.ll(IIIllIIll.IIl('\u3ccd', 1097604452, '\u0429').toCharArray(), 15069L, 137976148);
        IIIllIIll.III[1] = IIIllIIll.ll(IIIllIIll.IIl('\u3ccc', -670814777, '\ufcf9').toCharArray(), 84971L, 1322009025);
        IIIllIIll.III[2] = IIIllIIll.ll(IIIllIIll.IIl('\u3ccf', -1928972543, '\u0148').toCharArray(), 73243L, 817499139);
        IIIllIIll.III[3] = IIIllIIll.ll(IIIllIIll.IIl('\u3cce', -818144108, '\u1bf1').toCharArray(), 61390L, -572883878);
        IIIllIIll.III[4] = IIIllIIll.ll(IIIllIIll.IIl('\u3cc9', -1072932760, '\u603a').toCharArray(), 33946L, -1090327194);
        IIIllIIll.III[5] = IIIllIIll.ll(IIIllIIll.IIl('\u3cc8', -1401342943, '\ucb53').toCharArray(), 34661L, 1246369741);
        IIIllIIll.III[6] = IIIllIIll.ll(IIIllIIll.IIl('\u3ccb', -505721419, '\uda8f').toCharArray(), 5009L, -21177101);
        IIIllIIll.III[7] = IIIllIIll.ll(IIIllIIll.IIl('\u3cca', -683708981, '\ub804').toCharArray(), 39517L, 1986235463);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(char[] cArray, long l2, int n) {
        int n2 = 0x8EE9F85F ^ n;
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

    private static int III(int n, int n2) {
        return Ill[n ^ 0x56EF7397] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x3CCD;
        char[] cArray = lII[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIl[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIllIIll.lIl[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4827;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 60777;
            n6 += 54485;
            n6 += 2363;
            n6 ^= 0x72C1;
            n6 += 40757;
            n6 += 16201;
            n6 += 5192;
            n6 ^= 0xBEB3;
            n6 += 11684;
            cArray[n5] = (char)((n6 += 33897) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

