/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIlII
 * Module         : No Bounce  [RENDER]
 * Description    : Removes the end crystal hand bounce   (client's own text)
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
package orchard.module.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public final class NoBounce
extends ModuleBase {
    private static final String[] I;
    private static final Object[] l;

    public NoBounce() {
        super(StringFactory.IIII("No Bounce"), Category.l, StringFactory.IIII("Removes the end crystal hand bounce"));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 24499;
        String string = "\u8ed3\u8ed7\u8d2a\u8d34\u8ed5\u8edf\u8ec1\u8d3a\u8d0f\u8edf\u8c12\u8d0a\u6f28\u60d7\u6f25\u60c1\u60d2\u60d6\u6e60\u6f0a\u6f08\u6e68\u6f20\u6f23\u6f38\u6f31\u60de\u60c1\u6f3a\u60d3\u6e6a\u60d8\u6e6a\u60d7\u60d4\u6f26\u6f33\u6f00\u6e6f\u6f3d\u6f35\u60db\u6f2f\u60da\u60dd\u60d6\u60dc\u6f09\u6f0f\u6f34\u6e1e\u6f09\u6e17\u6f00\u60d4\u6f36\u60db\u6e68\u6f24\u6e6c";
        char[] cArray = "\u5fbf\u5f83".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                I = stringArray;
                l = new Object[stringArray.length];
                return;
            }
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lI(int n, char c, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0xD0EB;
        char[] cArray = I[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])l[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            NoBounce.l[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4095;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0x8728;
            n7 += 57769;
            n7 += 2478;
            n7 ^= 0x4760;
            cArray[n6] = (char)((n7 -= 37698) ^ n4 ^ n ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

