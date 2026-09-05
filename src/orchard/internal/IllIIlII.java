/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Body Part
 *   - .getBytes(
 *   - Center
 *   - Edge
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
public final class IllIIlII
extends Enum<IllIIlII> {
    private static String[] I;
    public static final /* enum */ IllIIlII l;
    public static final /* enum */ IllIIlII II;
    public static final /* enum */ IllIIlII Il;
    private static final /* synthetic */ IllIIlII[] lI;
    private final IIIlIIIII ll;
    private static final int[] III;
    private static final String[] IIl;
    private static final Object[] IlI;

    public static IllIIlII[] values() {
        return (IllIIlII[])lI.clone();
    }

    public String toString() {
        return this.ll.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0xAF84CF56 ^ n;
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

    private IllIIlII(String string2) {
        this.ll = StringFactory.lIl(string2);
    }

    private static void l() {
        IllIIlII.I[0] = IllIIlII.I(IllIIlII.ll(-888493766, -1035722582).toCharArray(), 8248L, 954493936);
        IllIIlII.I[1] = IllIIlII.I(IllIIlII.ll(-888493765, -613261617).toCharArray(), 13992L, 1625294784);
        IllIIlII.I[2] = IllIIlII.I(IllIIlII.ll(-888493768, 1220560016).toCharArray(), 80397L, -1582778592);
        IllIIlII.I[3] = IllIIlII.I(IllIIlII.ll(-888493767, -180528298).toCharArray(), 76929L, 501253826);
        IllIIlII.I[4] = IllIIlII.I(IllIIlII.ll(-888493762, 513284761).toCharArray(), 7174L, 1122346881);
        IllIIlII.I[5] = IllIIlII.I(IllIIlII.ll(-888493761, -961450368).toCharArray(), 77585L, 1882978627);
    }

    private static /* synthetic */ IllIIlII[] II() {
        return new IllIIlII[]{Il, l, II};
    }

    public static IllIIlII Il(String string) {
        return Enum.valueOf(IllIIlII.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 6185;
        String string = "\ua8cd\u1e18\ub3c4\u4a15\u9720\ufed8\u0be5\ua62b\u149d\u27be\uecda\u8776\u118a\u10a4\u90ee\u2886\u6603\udb45\u941a\u9016\u99b0\ub5ab\uaac1\ufb17\ud3b8\u0f91\u85ed\uf027\u5718\u6799\u66f1\ufbe0\u5af9\u761d\u5ead\ucbf0\uf648\u0857\u41ec\u4714\u0c19\u88ed\u9226\udcb7\u8945\u5f90\u79de";
        char[] cArray = "\u1821\u182f\u1820\u1821\u182d\u1825".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        IIl = stringArray;
        IlI = new Object[stringArray.length];
        int n6 = 50540401;
        byte[] byArray = "H\u00d2\u00c2\u0004\u0006\u0097\u00d8\u00a8\u00ca\u00c0\u00196_u=\u00da\u00d0\u0089\u00a4oA\u0095\u00ac\u00bf\u00be`\u0083I\u00ff\"\u00ad\u00e7\u00d2\u0015\\A".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        III = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IllIIlII.III[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        I = new String[6];
        IllIIlII.l();
        Il = new IllIIlII("Center");
        l = new IllIIlII("Body Part");
        II = new IllIIlII("Edge");
        lI = IllIIlII.II();
    }

    private static int lI(int n, int n2) {
        return III[n ^ 0xA904AE65] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String ll(int var0, int var1_1) {
        var3_2 = var0 ^ -888493766;
        var4_4 = IllIIlII.IIl[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])IllIIlII.IlI[var3_2];
        if (var2_3 != null) {
            var5_5 = var2_3;
        } else {
            var5_5 = new Throwable().getStackTrace();
            IllIIlII.IlI[var3_2] = var5_5;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 1176745406;
        var8_8 = 0;
        if (true) ** GOTO lbl17
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) {
                return new String(var4_4).intern();
            }
lbl17:
            // 3 sources

            switch (var8_8 & 31) {
                case 2: {
                    var9_9 = 252;
                    continue block33;
                }
                case 29: {
                    var9_9 = 88;
                    continue block33;
                }
                case 24: {
                    var9_9 = 11;
                    continue block33;
                }
                case 27: {
                    var9_9 = 160;
                    continue block33;
                }
                case 13: {
                    var9_9 = 220;
                    continue block33;
                }
                case 5: {
                    var9_9 = 163;
                    continue block33;
                }
                case 28: {
                    var9_9 = 117;
                    continue block33;
                }
                case 15: {
                    var9_9 = 117;
                    continue block33;
                }
                case 19: {
                    var9_9 = 61;
                    continue block33;
                }
                case 6: {
                    var9_9 = 103;
                    continue block33;
                }
                case 22: {
                    var9_9 = 13;
                    continue block33;
                }
                case 10: {
                    var9_9 = 148;
                    continue block33;
                }
                case 17: {
                    var9_9 = 172;
                    continue block33;
                }
                case 12: {
                    var9_9 = 209;
                    continue block33;
                }
                case 18: {
                    var9_9 = 220;
                    continue block33;
                }
                case 4: {
                    var9_9 = 129;
                    continue block33;
                }
                case 26: {
                    var9_9 = 36;
                    continue block33;
                }
                case 16: {
                    var9_9 = 243;
                    continue block33;
                }
                case 8: {
                    var9_9 = 247;
                    continue block33;
                }
                case 14: {
                    var9_9 = 178;
                    continue block33;
                }
                case 31: {
                    var9_9 = 65;
                    continue block33;
                }
                case 1: {
                    var9_9 = 16;
                    continue block33;
                }
                case 3: {
                    var9_9 = 95;
                    continue block33;
                }
                case 9: {
                    var9_9 = 228;
                    continue block33;
                }
                case 7: {
                    var9_9 = 110;
                    continue block33;
                }
                case 21: {
                    var9_9 = 36;
                    continue block33;
                }
                case 25: {
                    var9_9 = 183;
                    continue block33;
                }
                case 20: {
                    var9_9 = 8;
                    continue block33;
                }
                case 30: {
                    var9_9 = 80;
                    continue block33;
                }
                case 11: {
                    var9_9 = 140;
                    continue block33;
                }
                default: {
                    var9_9 = 116;
                    continue block33;
                }
                case 23: 
            }
            var9_9 = 245;
        }
    }
}

