/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Normal
 *   - Custom
 *   - Swipe
 *   - Scale
 *   - Chop
 *   - Flip
 *   - Stab
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
public final class IIlIlllI
extends Enum<IIlIlllI> {
    private final IIIlIIIII I;
    public static final /* enum */ IIlIlllI l;
    public static final /* enum */ IIlIlllI II;
    public static final /* enum */ IIlIlllI Il;
    public static final /* enum */ IIlIlllI lI;
    private static final /* synthetic */ IIlIlllI[] ll;
    public static final /* enum */ IIlIlllI III;
    public static final /* enum */ IIlIlllI IIl;
    public static final /* enum */ IIlIlllI IlI;
    private static String[] Ill;
    private static final int[] lII;
    private static final String[] lIl;
    private static final Object[] llI;

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0x249AB2FB ^ n;
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

    private IIlIlllI(String string2) {
        this.I = StringFactory.lIl(string2);
    }

    public static IIlIlllI l(String string) {
        return Enum.valueOf(IIlIlllI.class, string);
    }

    public String toString() {
        return this.I.IIII();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 15470;
        var7_2 = "\u9219\u8709\uf03d\ue550\u2623\ud841\u9cbc\u56b8\u7a10\u16ba\uce54\ue8cc\u1d36\u3426\u18eb\u989d\u8267\ua576\u682c\ua6d0\u4c15\u16e3\u81ab\u8ab6\u5bd0\ubf7d\u2e5a\u5987\uf759\u6566\u68ef\u00d3\u82cd\u6c19\uddc5\u58eb\u7071\u9a56\u5324\u8405\u0331\ub368\uc580\ua745\ue009\ub502\uae6b\u9e83\ubfcf\ub9f0\uf916\ud855\ucb27\ud7ad\u763f\ubbf9\u135c\udced\uc445\ud1ff\ue1e4\u088c\u7004\u73bb\u5e38\u46ac\u9181\u399a\u27d1P\u13df\u6368\u62ab\u8ae2\ua810\ueaa9\u71ae\uba3c\uc5de\u8ac3\u228d\ue16c\ua571\u14a3\u6cb2\ub029\u9ff4\u88e6\u9575\u8ab9";
        var8_3 = "\b\u0005\b\u0004\b\u0006\u0004\u0005\b\b\b\b\u0004\u0006".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl12
        while (true) {
            block10: {
                block9: {
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block9;
                    var13_8 = 0;
lbl12:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = '\u0000';
                    if (var13_8 != 0) break block9;
                    IIlIlllI.lIl = var9_4;
                    IIlIlllI.llI = new Object[var9_4.length];
                    var2_13 = 47015297;
                    var0_11 = "3\u0092\u0086f&\u00cf\u00b4\u0084+\u00ce\u00b6>\u00b7\u00ba\u00b1\u0011#9\u00a8f(W\b\u000f\u008b\u00c3\u00da\u00f6t\u00e2\u00f4y\u00f5mg\u001c_W\u00d3\u009e\u00ad\u00ae\u00eb\u00e7\u00bf\u0098(\u00da\u00cbV\u00cd\u0007\u00eal\u00e2\u00ac\u00a4G\u0089\u00dfXo\u00d5\u00bau\u00c3\u00ab\u0014\u00a5\u00a5&X\u00bes`K0\u00a20\u0019\u00c9%9g\u00c8\u0097^\u00db\r\t\u0090\u00b5\u0099\u000b\u001b\u00ae\u00d1Q\u009d\u00f8\u0080\u00bd\u00d8{\u00be\u0087\u009a\u00dc\u0013\u00a2Z\u00e7N6\u0090\u00ad\u00ec\u0006\u00fa~\u0085\u00b9\u00e1y\u001e\u001c\u0084\u00f6\u008d\u00b7\u001b\u00e5bR\u00f0\u00a0\u008f\u00d1:M\u00e5OB\u00ae".getBytes("ISO-8859-1");
                    var1_12 = var0_11.length / 4;
                    IIlIlllI.lII = new int[var1_12];
                    var3_14 = 0;
                    var4_15 = 0;
                    do {
                        var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                        IIlIlllI.lII[var4_15] = var5_16 ^= var2_13;
                        var3_14 += 4;
                    } while (++var4_15 < var1_12);
                    break block10;
                }
                var12_7 = var8_3[var10_5];
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl52
            }
            IIlIlllI.Ill = new String[14];
            IIlIlllI.II();
            IIlIlllI.IlI = new IIlIlllI("Normal");
            IIlIlllI.l = new IIlIlllI("Swipe");
            IIlIlllI.Il = new IIlIlllI("Chop");
            IIlIlllI.II = new IIlIlllI("Flip");
            IIlIlllI.lI = new IIlIlllI("Scale");
            IIlIlllI.III = new IIlIlllI("Stab");
            IIlIlllI.IIl = new IIlIlllI("Custom");
            IIlIlllI.ll = IIlIlllI.Il();
            return;
        }
        block8: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) ** continue;
lbl52:
            // 2 sources

            switch (var15_10 % 5) {
                case 1: {
                    v0 = 60;
                    continue block8;
                }
                case 4: {
                    v0 = 67;
                    continue block8;
                }
                case 2: {
                    v0 = 31;
                    continue block8;
                }
                case 3: {
                    v0 = 67;
                    continue block8;
                }
            }
            v0 = 120;
        }
    }

    private static void II() {
        IIlIlllI.Ill[0] = IIlIlllI.I(IIlIlllI.III(-909002152, -1943917327).toCharArray(), 6383L, 1175174740);
        IIlIlllI.Ill[1] = IIlIlllI.I(IIlIlllI.III(-909002151, 406484999).toCharArray(), 76681L, 1957597168);
        IIlIlllI.Ill[2] = IIlIlllI.I(IIlIlllI.III(-909002150, 1554992545).toCharArray(), 33555L, -1950233203);
        IIlIlllI.Ill[3] = IIlIlllI.I(IIlIlllI.III(-909002149, -882477081).toCharArray(), 77273L, 453828933);
        IIlIlllI.Ill[4] = IIlIlllI.I(IIlIlllI.III(-909002148, -514891230).toCharArray(), 35309L, -649638746);
        IIlIlllI.Ill[5] = IIlIlllI.I(IIlIlllI.III(-909002147, -636274369).toCharArray(), 98324L, 398521490);
        IIlIlllI.Ill[6] = IIlIlllI.I(IIlIlllI.III(-909002146, 62531698).toCharArray(), 19412L, -610167817);
        IIlIlllI.Ill[7] = IIlIlllI.I(IIlIlllI.III(-909002145, -2033375864).toCharArray(), 2109L, -619337986);
        IIlIlllI.Ill[8] = IIlIlllI.I(IIlIlllI.III(-909002160, 1329559156).toCharArray(), 40146L, -1681459650);
        IIlIlllI.Ill[9] = IIlIlllI.I(IIlIlllI.III(-909002159, 1241400968).toCharArray(), 72227L, 1022197015);
        IIlIlllI.Ill[10] = IIlIlllI.I(IIlIlllI.III(-909002158, 1667398462).toCharArray(), 17046L, 1709955015);
        IIlIlllI.Ill[11] = IIlIlllI.I(IIlIlllI.III(-909002157, 894516437).toCharArray(), 50626L, -1591527803);
        IIlIlllI.Ill[12] = IIlIlllI.I(IIlIlllI.III(-909002156, -1065921786).toCharArray(), 34564L, -506692316);
        IIlIlllI.Ill[13] = IIlIlllI.I(IIlIlllI.III(-909002155, -288024872).toCharArray(), 83012L, -1175750074);
    }

    public static IIlIlllI[] values() {
        return (IIlIlllI[])ll.clone();
    }

    private static /* synthetic */ IIlIlllI[] Il() {
        return new IIlIlllI[]{IlI, l, Il, II, lI, III, IIl};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lI() {
        if (this == IlI) return false;
        return true;
    }

    private static int ll(int n, int n2) {
        return lII[n ^ 0xDD862350] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String III(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xC9D1BA58;
        char[] cArray = lIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlIlllI.llI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3B3E80F0;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 11: {
                    n6 = 0;
                    continue block33;
                }
                case 26: {
                    n6 = 175;
                    continue block33;
                }
                case 30: {
                    n6 = 177;
                    continue block33;
                }
                case 28: {
                    n6 = 207;
                    continue block33;
                }
                case 21: {
                    n6 = 47;
                    continue block33;
                }
                case 1: {
                    n6 = 15;
                    continue block33;
                }
                case 15: {
                    n6 = 153;
                    continue block33;
                }
                case 23: {
                    n6 = 111;
                    continue block33;
                }
                case 24: {
                    n6 = 31;
                    continue block33;
                }
                case 25: {
                    n6 = 117;
                    continue block33;
                }
                case 31: {
                    n6 = 197;
                    continue block33;
                }
                case 4: {
                    n6 = 131;
                    continue block33;
                }
                case 16: {
                    n6 = 31;
                    continue block33;
                }
                case 22: {
                    n6 = 204;
                    continue block33;
                }
                default: {
                    n6 = 244;
                    continue block33;
                }
                case 27: {
                    n6 = 55;
                    continue block33;
                }
                case 17: {
                    n6 = 255;
                    continue block33;
                }
                case 9: {
                    n6 = 166;
                    continue block33;
                }
                case 13: {
                    n6 = 2;
                    continue block33;
                }
                case 2: {
                    n6 = 95;
                    continue block33;
                }
                case 10: {
                    n6 = 205;
                    continue block33;
                }
                case 29: {
                    n6 = 139;
                    continue block33;
                }
                case 8: {
                    n6 = 80;
                    continue block33;
                }
                case 18: {
                    n6 = 122;
                    continue block33;
                }
                case 19: {
                    n6 = 35;
                    continue block33;
                }
                case 6: {
                    n6 = 157;
                    continue block33;
                }
                case 12: {
                    n6 = 234;
                    continue block33;
                }
                case 7: {
                    n6 = 210;
                    continue block33;
                }
                case 20: {
                    n6 = 134;
                    continue block33;
                }
                case 5: {
                    n6 = 226;
                    continue block33;
                }
                case 3: {
                    n6 = 131;
                    continue block33;
                }
                case 14: 
            }
            n6 = 64;
        }
        return new String(cArray).intern();
    }
}

