/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIllIl
 * Purpose not identified - name is the original obfuscated one.
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

@Environment(value=EnvType.CLIENT)
public final class IIlIllIl
extends Enum<IIlIllIl> {
    public static final /* enum */ IIlIllIl I;
    private static final /* synthetic */ IIlIllIl[] l;
    public static final /* enum */ IIlIllIl II;
    public static final /* enum */ IIlIllIl Il;
    public static final /* enum */ IIlIllIl lI;
    private static final String[] ll;
    private static final Object[] III;

    private static /* synthetic */ IIlIllIl[] I() {
        return new IIlIllIl[]{Il, I, II, lI};
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 2040;
        String string = "\u5640\u5637\u56b5\u56f4\u56a4\u5640\u56ed\u5662\u56ac\u56a0\u5631\u56ef\u564d\u56a8\u56d5\u56f1\u39a4\u39d8\u3958\u391e\u3943\u39ac\u3919\u3988\u395d\u3959\u39dc\u390f\u39bb\ue399\ue3e1\ue377\ue330\ue37c\ue381\ue330\ue3bf\ue362\ue365\ue3e9\ue33a\u4d88\u4dea\u4d6f\u4d31\u4d62\u4d82\u4d29\u4dbf\u4d69\u4d6f\u4dff\u4d28\u4d8e\u4d7e\u4d01";
        char[] cArray = "\u07e8\u07f5\u07f4\u07f7".toCharArray();
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
        ll = stringArray;
        III = new Object[stringArray.length];
        Il = new IIlIllIl();
        I = new IIlIllIl();
        II = new IIlIllIl();
        lI = new IIlIllIl();
        l = IIlIllIl.I();
    }

    public static IIlIllIl[] values() {
        return (IIlIllIl[])l.clone();
    }

    public static IIlIllIl l(String string) {
        return Enum.valueOf(IIlIllIl.class, string);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xEDD2EFAD;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlIllIl.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xEE97D2E8;
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
                case 16: {
                    n6 = 79;
                    continue block33;
                }
                case 28: {
                    n6 = 6;
                    continue block33;
                }
                case 17: {
                    n6 = 166;
                    continue block33;
                }
                case 10: {
                    n6 = 45;
                    continue block33;
                }
                case 11: {
                    n6 = 255;
                    continue block33;
                }
                case 20: {
                    n6 = 208;
                    continue block33;
                }
                case 22: {
                    n6 = 16;
                    continue block33;
                }
                case 14: {
                    n6 = 195;
                    continue block33;
                }
                case 19: {
                    n6 = 79;
                    continue block33;
                }
                case 31: {
                    n6 = 103;
                    continue block33;
                }
                case 7: {
                    n6 = 123;
                    continue block33;
                }
                case 13: {
                    n6 = 177;
                    continue block33;
                }
                case 24: {
                    n6 = 28;
                    continue block33;
                }
                case 30: {
                    n6 = 167;
                    continue block33;
                }
                case 21: {
                    n6 = 3;
                    continue block33;
                }
                case 9: {
                    n6 = 160;
                    continue block33;
                }
                default: {
                    n6 = 82;
                    continue block33;
                }
                case 2: {
                    n6 = 164;
                    continue block33;
                }
                case 27: {
                    n6 = 252;
                    continue block33;
                }
                case 5: {
                    n6 = 77;
                    continue block33;
                }
                case 23: {
                    n6 = 149;
                    continue block33;
                }
                case 12: {
                    n6 = 92;
                    continue block33;
                }
                case 15: {
                    n6 = 233;
                    continue block33;
                }
                case 29: {
                    n6 = 126;
                    continue block33;
                }
                case 4: {
                    n6 = 184;
                    continue block33;
                }
                case 25: {
                    n6 = 61;
                    continue block33;
                }
                case 18: {
                    n6 = 89;
                    continue block33;
                }
                case 26: {
                    n6 = 153;
                    continue block33;
                }
                case 6: {
                    n6 = 243;
                    continue block33;
                }
                case 3: {
                    n6 = 238;
                    continue block33;
                }
                case 1: {
                    n6 = 33;
                    continue block33;
                }
                case 8: 
            }
            n6 = 167;
        }
    }
}

