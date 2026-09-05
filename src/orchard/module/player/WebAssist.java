/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlIlI
 * Module         : WebAssist  [PLAYER]
 * Description    : Allows you to place ONLY cobwebs through entities.   (client's own text)
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
package orchard.module.player;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public final class WebAssist
extends ModuleBase {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0x61E23A06 ^ n;
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

    public WebAssist() {
        super(StringFactory.IIII("WebAssist"), Category.IIl, StringFactory.IIII("Allows you to place ONLY cobwebs through entities."));
    }

    private static void l() {
        WebAssist.I[0] = WebAssist.I(WebAssist.IIl('\ub669', -1309593270, '\uc0c6').toCharArray(), 5014L, -1860462305);
        WebAssist.I[1] = WebAssist.I(WebAssist.IIl('\ub668', 1223839818, '\ue42a').toCharArray(), 1949L, -597053200);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 13364;
        String string = "\u6def\u80a0\ucc6c\ud388\ud94a\u8164\u547e\u8cda\u5abe\uffcc\u1817\u0fdd\ufc0a\u42a4\u4810\uce53\u5352\ud967\u6e7c\u3247\u3aa0\u5f29\u2a89\uf8cf\ub10b\uf264\u1dcb\u037e\u802e\uad48\u4164\u3e39\ua370\u3938\u2eac\ud438\u98a4\u2314\u16a5\ua706\ua734\uc31a\u9709\uf90c\u50b2\u3b71\u7133\u1327\u155c\ud77a\u5385\ue591\u8542\uf74f\u5776\u815b\ud6f6\u3654\u826b\u42d1\ub58f\u25f7\u27d9\udd24\uf8d9\u674e\u63aa\uefce\ue06c\uf725\u28c3\ue095\u1a3d\ue9fd\uc3f4\u2a72\ub696\u2bc9\u4599\u5337";
        char[] cArray = "\u3438\u3470".toCharArray();
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
        II = stringArray;
        Il = new Object[stringArray.length];
        int n6 = -1077797435;
        byte[] byArray = "Z|c2\u00be#\u00c7\u00c9!'\u0011\u000fit\"1".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        l = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            WebAssist.l[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        I = new String[2];
        WebAssist.l();
    }

    private static int lI(int n, int n2) {
        return l[n ^ 0xD7A2DC07] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xB669;
        char[] cArray = II[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            WebAssist.Il[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2C3E;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 8827;
            n6 -= 48047;
            n6 ^= 0xF1C6;
            n6 ^= 0xB608;
            n6 += 49148;
            n6 -= 6333;
            cArray[n5] = (char)((n6 ^= 0x45C5) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

