/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIII
 * Module         : Panic  [IFACE]
 * Description    : Disables all active modules.   (client's own text)
 *
 * Recovered strings in this class:
 *   - .getBytes(
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
package orchard.module.iface;

import java.util.Iterator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.lllIIlI;

@Environment(value=EnvType.CLIENT)
public final class Panic
extends ModuleBase {
    private static String[] I;
    private final lllIIlI l;
    private static final int[] II;
    private static final String[] Il;
    private static final Object[] lI;

    private static void lI() {
        Panic.I[0] = Panic.IIl(Panic.lII(1939763327, 63641, (short)23395).toCharArray(), 66835L, 1663251444);
        Panic.I[1] = Panic.IIl(Panic.lII(-1604553020, 63640, (short)63864).toCharArray(), 98448L, -888726455);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            var6 = 24776;
            var7_3 = "\u61d4\u3147\ua01d\uc787\u89c1\ub9fe\u40c8\ud213\ufc24\u34e8\uaac7\ub2ab\u0cb2\u867f\uf613\u0375\u5e12\u6730\uec65\u5d7e\uc82c\uce3b\uc958\ub639\u627d\ucc88\ub99a\ub197\u0a35\u6164\uad41\u1a80\u27a2\uc6ad\ua2a0\u39ea\u1cd4\ua691\ua61f\u8e0c\u58e2\uf9f4\u1970\u7c86\u9320\u174a\ue6cf\u3e02";
            var8_4 = "\b(".toCharArray();
            var9_5 = new String[var8_4.length];
            var13_9 = -1;
            ** GOTO lbl13
lbl7:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var11_7 += var12_8;
                if (++var10_6 < var8_4.length) break block12;
                var13_9 = 0;
lbl13:
                // 2 sources

                var10_6 = 0;
                var11_7 = 0;
                var12_8 = '\u0000';
                if (var13_9 == 0) {
                    Panic.Il = var9_5;
                    Panic.lI = new Object[var9_5.length];
                    var2_2 = -1031984194;
                    ** continue;
                }
                break block12;
                break;
            }
            var0_12 = "\u00867\u00d4\u00f39\u00b3\u0017\u008b\u00ba\u00c5t\u00ba\u00eb\u00c8\u00d6\u00de".getBytes("ISO-8859-1");
            var1_13 = var0_12.length / 4;
            Panic.II = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
                Panic.II[var4_15] = var5_16 ^= var2_2;
                var3_14 += 4;
            } while (++var4_15 < var1_13);
            Panic.I = new String[2];
            Panic.lI();
            return;
        }
        var12_8 = var8_4[var10_6];
        var14_10 = var7_3.substring(var11_7, var11_7 + var12_8).toCharArray();
        var15_11 = 0;
        do {
            switch (var15_11 % 5) {
                case 4: {
                    v0 = 122;
                    ** break;
                }
                default: {
                    v0 = 66;
                    ** break;
                }
                case 1: {
                    v0 = 59;
                    ** break;
                }
                case 3: {
                    v0 = 78;
                    ** break;
                }
                case 2: 
            }
            v0 = 50;
            ** break;
lbl56:
            // 5 sources

            var16_1 = v0;
            v1 = var15_11++;
            var14_10[v1] = (char)(var14_10[v1] ^ var16_1 ^ var6);
        } while (var15_11 < var14_10.length);
        var9_5[var10_6] = new String(var14_10).intern();
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        if (this.l != null) {
            Iterator<ModuleBase> iterator = this.l.IIIIIll().iterator();
            boolean bl = true;
            block0: while (true) {
                ModuleBase moduleBase;
                if (!bl || (bl = false) || !true) {
                    moduleBase.IIlIIll(false);
                }
                while (iterator.hasNext()) {
                    moduleBase = iterator.next();
                    if (moduleBase == this || !moduleBase.IIIlIIl()) continue;
                    continue block0;
                }
                break;
            }
            this.IIlIIll(false);
        }
    }

    public Panic(lllIIlI lllIIlI2) {
        super(StringFactory.IIII("Panic"), Category.lI, StringFactory.IIII("Disables all active modules."));
        this.l = lllIIlI2;
    }

    private static String IIl(char[] cArray, long l2, int n) {
        int n2 = 0x406943B1 ^ n;
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

    private static int IlI(int n, int n2) {
        return II[n ^ 0x912D77AF] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lII(int n, int n2, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0xF899;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Panic.lI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x78BE;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 12028;
            n7 ^= 0x9DCC;
            n7 += 810;
            n7 += 304;
            cArray[n6] = (char)((n7 -= 41806) ^ n4 ^ s ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

