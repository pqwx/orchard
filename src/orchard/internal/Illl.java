/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.Illl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Control Panel
 *   - .getBytes(
 *   - Modules
 *   - Configs
 *   - Editor
 *   - Themes
 *   - Binds
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
public final class Illl
extends Enum<Illl> {
    public static final /* enum */ Illl I;
    private final IIIlIIIII l;
    public static final /* enum */ Illl II;
    public static final /* enum */ Illl Il;
    public static final /* enum */ Illl lI;
    public static final /* enum */ Illl ll;
    public static final /* enum */ Illl III;
    private static final /* synthetic */ Illl[] IIl;
    private static final int[] IlI;
    private static final String[] Ill;
    private static final Object[] lII;

    private Illl(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    public static Illl[] values() {
        return (Illl[])IIl.clone();
    }

    public String I() {
        return this.l.IIII();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block11: {
            var6 = 27783;
            var7_1 = "\u92ce\u9286\u930c\u92b2\u929e\u9336\u935a\u37c4\u3850\u37fd\u386b\u3844\u382e\u3864\u3814\u386b\u3792\u380b\u384d\u6e77\u6e35\u6e4d\u6e5e\u6e7b\u6e73\u6e34\u6e1a\u6e62\u6e76\u6e74\u6e3f\u6e4b\u2689\u260f\u26b3\u26f1\u258e\u25e5\u26cc\u25d4\u259a\u266f\u268d\u2592\u260e\u2594\u266f\u25d7\u25a3\u26b2\u2635\u2612\ue39c\ue3f9\ue3a9\u6980\u68aa\u690d\u68aa\u688a\u6934\u68aa\u6909\uec90\uecda\ueca2\uece7\uec15\uec94\uec06\uecac\uebaa\uec92\uec8c\ueca7\uecef\uec03\uec71\uec3c\uecf9\uebe4\ueba2\u0564\u052f\u0551\u051a\u05e0\u6667\u662a\u6712\u66cf\u66fc\u665b\u66fb\u6726\ue65a\ue748\ue730\ue775\ue75a\ue657\ua97b\ua885\ua948\ua96f\ua977\ua91b\ua937\ua90f";
            var8_2 = "\u6c80\u6c8b\u6c8a\u6c93\u6c84\u6c8f\u6c80\u6c8b\u6c82\u6c8f\u6c81\u6c8f".toCharArray();
            var9_3 = new String[var8_2.length];
            var13_8 = -1;
            ** GOTO lbl20
lbl7:
            // 2 sources

            while (true) {
                var12_7 = var8_2[var10_5] ^ var6;
                var14_9 = var7_1.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl44
                break;
            }
lbl12:
            // 1 sources

            while (true) {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                Illl.IlI[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
                if (++var4_15 < var1_12) continue;
                break block11;
                break;
            }
lbl18:
            // 1 sources

            while (true) {
                var13_8 = 0;
lbl20:
                // 2 sources

                var10_5 = 0;
                var11_6 = 0;
                var12_7 = 0;
                if (var13_8 != 0) ** GOTO lbl7
                Illl.Ill = var9_3;
                Illl.lII = new Object[var9_3.length];
                var2_13 = -573784556;
                var0_11 = "\u00f3bj\u0094".getBytes("ISO-8859-1");
                var1_12 = var0_11.length / 4;
                Illl.IlI = new int[var1_12];
                var3_14 = 0;
                var4_15 = 0;
                ** continue;
                break;
            }
            while (true) {
                var9_3[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 >= var8_2.length) ** break;
                ** continue;
                ** continue;
                break;
            }
            block10: while (true) {
                var16_4 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_4);
                if (var15_10 >= var14_9.length) ** continue;
lbl44:
                // 2 sources

                switch (var15_10 % 5) {
                    default: {
                        v0 = 63;
                        continue block10;
                    }
                    case 1: {
                        v0 = 121;
                        continue block10;
                    }
                    case 4: {
                        v0 = 108;
                        continue block10;
                    }
                    case 2: {
                        v0 = 6;
                        continue block10;
                    }
                    case 3: 
                }
                v0 = 75;
            }
        }
        Illl.Il = new Illl(StringFactory.IIII("Modules"));
        Illl.III = new Illl(StringFactory.IIII("Control Panel"));
        Illl.I = new Illl(StringFactory.IIII("Editor"));
        Illl.ll = new Illl(StringFactory.IIII("Configs"));
        Illl.lI = new Illl(StringFactory.IIII("Binds"));
        Illl.II = new Illl(StringFactory.IIII("Themes"));
        Illl.IIl = Illl.II();
    }

    public IIIlIIIII l() {
        return this.l;
    }

    private static /* synthetic */ Illl[] II() {
        return new Illl[]{Il, III, I, ll, lI, II};
    }

    public static Illl Il(String string) {
        return Enum.valueOf(Illl.class, string);
    }

    private static int lI(int n, int n2) {
        return IlI[n ^ 0x3C8CD21F] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2, int n3) {
        StackTraceElement[] stackTraceElementArray;
        int n4 = n3 ^ 0x7B25;
        char[] cArray = Ill[n4].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lII[n4];
        if (stackTraceElementArray2 == null) {
            Illl.lII[n4] = stackTraceElementArray = new Throwable().getStackTrace();
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n5 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6B5C;
        int n6 = 0;
        do {
            int n7 = n6++;
            int n8 = cArray[n7] - 11893;
            n8 += 24024;
            n8 -= 11175;
            n8 -= 60991;
            n8 -= 51790;
            n8 ^= 0x1F96;
            n8 += 60114;
            cArray[n7] = (char)((n8 ^= 0xFCB9) ^ n5 ^ n2 ^ n >> 16);
        } while (n6 < cArray.length);
        return new String(cArray).intern();
    }
}

