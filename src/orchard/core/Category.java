/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIIIII
 * Identified from direct evidence; see README.md
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
package orchard.core;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class Category
extends Enum<Category> {
    public static final /* enum */ Category I;
    public static final /* enum */ Category l;
    public static final /* enum */ Category II;
    private static final /* synthetic */ Category[] Il;
    public static final /* enum */ Category lI;
    public static final /* enum */ Category ll;
    private static String[] III;
    public static final /* enum */ Category IIl;
    private static final int[] IlI;
    private static final String[] Ill;
    private static final Object[] lII;

    public static Category I(String string) {
        return Enum.valueOf(Category.class, string);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 24731;
        String string = "\ub10e\uc657\uc90b\u7525\ua5b2\u6961\ue7f7\u3104\ub83d\u0f3c\u492c\u1e87\u5e99\u3c93\u65d6\u36a6\u2524\u7ead\u3eb4\u98ea\ue3db\u3253\u8bd4\uc0fa\ub8fe\u5f76\ued5b\ude03\u6cba\u109e\u83ad\u5c44\u7196\ud024\ub234\u4193\ufc0d\u300f";
        char[] cArray = "\u6093\u609d\u6098\u609d\u6092\u609d".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            if (!bl || (bl = false) || !true) {
                n4 = cArray[n5] ^ n;
                stringArray[n5] = string.substring(n3, n3 + n4);
                n3 += n4;
                if (++n5 < cArray.length) continue;
                n2 = 0;
            }
            n5 = 0;
            n3 = 0;
            n4 = 0;
            if (n2 == 0) break;
        }
        Ill = stringArray;
        lII = new Object[stringArray.length];
        int n6 = -2051914451;
        byte[] byArray = "\u00a25(L*:\u00a2C\u00e1\u00ef>\u00e6\u00c4\u0007\u0006\u008c\u00c3\u00fc$\u00001:u0\u009d\u00c8v-\u00bd\u00f8\u008c\u0007\u008dt^;T\u00f9:?".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IlI = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            Category.IlI[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        III = new String[6];
        Category.Il();
        IIl = new Category();
        II = new Category();
        ll = new Category();
        l = new Category();
        I = new Category();
        lI = new Category();
        Il = Category.II();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0xB4D3D8A9 ^ n;
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

    private static /* synthetic */ Category[] II() {
        return new Category[]{IIl, II, ll, l, I, lI};
    }

    private static void Il() {
        Category.III[0] = Category.l(Category.ll('\ua612', -708567239, (short)43504).toCharArray(), 10166L, -1178231121);
        Category.III[1] = Category.l(Category.ll('\ua613', 1176272595, (short)29949).toCharArray(), 45383L, -467519176);
        Category.III[2] = Category.l(Category.ll('\ua610', 1094020508, (short)15332).toCharArray(), 47276L, -318292444);
        Category.III[3] = Category.l(Category.ll('\ua611', -934067232, (short)46913).toCharArray(), 7212L, -1401704012);
        Category.III[4] = Category.l(Category.ll('\ua616', 768422487, (short)9323).toCharArray(), 47853L, -1322713918);
        Category.III[5] = Category.l(Category.ll('\ua617', -1062717110, (short)17939).toCharArray(), 75608L, 1629636372);
    }

    public static Category[] values() {
        return (Category[])Il.clone();
    }

    private static int lI(int n, int n2) {
        return IlI[n ^ 0x47E900F4] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(char c, int n, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xA612;
        char[] cArray = Ill[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lII[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Category.lII[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x352A;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 63214;
            n6 += 31339;
            n6 ^= 0xF196;
            n6 += 34135;
            n6 -= 25192;
            n6 += 20162;
            n6 -= 42155;
            n6 -= 61294;
            n6 -= 16119;
            cArray[n5] = (char)((n6 ^= 0xB1E) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

