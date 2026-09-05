/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - None
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IIllIl;

@Environment(value=EnvType.CLIENT)
public final class IIIIlIIll
extends IIllIl<String> {
    private int I;
    private final List<String> l;
    private static String[] II;
    private static final int[] Il;
    private static final String[] lII;
    private static final Object[] lIl;

    public String I() {
        String string = (String)this.lIl();
        return string.isEmpty() ? "None" : string;
    }

    public void Il() {
        this.I = (this.I + 1) % this.l.size();
        super.II(this.l.get(this.I));
    }

    @Override
    public JsonElement III() {
        return new JsonPrimitive((String)this.lIl());
    }

    @Override
    public void l(JsonElement jsonElement) {
        block1: {
            if (jsonElement == null) break block1;
            if (jsonElement.isJsonPrimitive()) {
                this.lII(jsonElement.getAsString());
            }
        }
    }

    private static void lI() {
        IIIIlIIll.II[0] = IIIIlIIll.IlI("".toCharArray(), 5833L, -138661699);
        IIIIlIIll.II[1] = IIIIlIIll.IlI(IIIIlIIll.IIIl(-2037666623, 783639092).toCharArray(), 34906L, 1157015215);
    }

    public List<String> IIl() {
        return this.l;
    }

    private static String IlI(char[] cArray, long l2, int n) {
        int n2 = 0x332B2CB ^ n;
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void lII(String string) {
        int n = this.l.indexOf(string);
        if (n < 0) {
            this.I = 0;
            super.II(this.l.get(0));
            return;
        }
        this.I = n;
        super.II(string);
    }

    public int llI() {
        return this.I;
    }

    public IIIIlIIll(Object object, List<String> list) {
        super(object, "");
        this.l = list;
        this.I = 0;
    }

    public void lll() {
        this.I = (this.I - 1 + this.l.size()) % this.l.size();
        super.II(this.l.get(this.I));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 24894;
        var7_2 = "\u7ceb\ue033\uc810\u3548\ud412\u8e35\uf928\ucdc1";
        var8_3 = "\u6136".toCharArray();
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
                    var12_7 = 0;
                    if (var13_8 == 0) break block10;
                }
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl43
            }
            IIIIlIIll.lII = var9_4;
            IIIIlIIll.lIl = new Object[var9_4.length];
            var2_11 = -659192983;
            var0_12 = "\ri\u00a2Wbf0\u00d5q\t$\u008c\u00aa\u0006\u008c\u00a5".getBytes("ISO-8859-1");
            var1_13 = var0_12.length / 4;
            IIIIlIIll.Il = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
                IIIIlIIll.Il[var4_15] = var5_16 ^= var2_11;
                var3_14 += 4;
            } while (++var4_15 < var1_13);
            IIIIlIIll.II = new String[2];
            IIIIlIIll.lI();
            return;
        }
        block8: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
            if (var15_10 >= var14_9.length) ** continue;
lbl43:
            // 2 sources

            switch (var15_10 % 5) {
                case 4: {
                    v0 = 56;
                    continue block8;
                }
                default: {
                    v0 = 89;
                    continue block8;
                }
                case 2: {
                    v0 = 31;
                    continue block8;
                }
                case 1: {
                    v0 = 3;
                    continue block8;
                }
                case 3: 
            }
            v0 = 51;
        }
    }

    private static int IIII(int n, int n2) {
        return Il[n ^ 0x8C59AD14] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x868BACC1;
        char[] cArray = lII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIlIIll.lIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x74DD32EC;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 20: {
                    n6 = 245;
                    continue block33;
                }
                case 14: {
                    n6 = 222;
                    continue block33;
                }
                case 16: {
                    n6 = 79;
                    continue block33;
                }
                case 4: {
                    n6 = 92;
                    continue block33;
                }
                case 23: {
                    n6 = 82;
                    continue block33;
                }
                case 15: {
                    n6 = 235;
                    continue block33;
                }
                case 17: {
                    n6 = 236;
                    continue block33;
                }
                case 29: {
                    n6 = 126;
                    continue block33;
                }
                case 13: {
                    n6 = 5;
                    continue block33;
                }
                case 5: {
                    n6 = 228;
                    continue block33;
                }
                case 12: {
                    n6 = 16;
                    continue block33;
                }
                default: {
                    n6 = 102;
                    continue block33;
                }
                case 10: {
                    n6 = 231;
                    continue block33;
                }
                case 6: {
                    n6 = 174;
                    continue block33;
                }
                case 26: {
                    n6 = 109;
                    continue block33;
                }
                case 21: {
                    n6 = 50;
                    continue block33;
                }
                case 7: {
                    n6 = 154;
                    continue block33;
                }
                case 30: {
                    n6 = 99;
                    continue block33;
                }
                case 24: {
                    n6 = 144;
                    continue block33;
                }
                case 11: {
                    n6 = 95;
                    continue block33;
                }
                case 8: {
                    n6 = 82;
                    continue block33;
                }
                case 31: {
                    n6 = 71;
                    continue block33;
                }
                case 19: {
                    n6 = 138;
                    continue block33;
                }
                case 25: {
                    n6 = 169;
                    continue block33;
                }
                case 3: {
                    n6 = 59;
                    continue block33;
                }
                case 18: {
                    n6 = 60;
                    continue block33;
                }
                case 2: {
                    n6 = 159;
                    continue block33;
                }
                case 1: {
                    n6 = 243;
                    continue block33;
                }
                case 9: {
                    n6 = 199;
                    continue block33;
                }
                case 28: {
                    n6 = 72;
                    continue block33;
                }
                case 22: {
                    n6 = 94;
                    continue block33;
                }
                case 27: 
            }
            n6 = 195;
        }
    }
}

