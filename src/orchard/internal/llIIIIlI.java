/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Decompilation failed
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
package orchard.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class llIIIIlI
implements InvocationHandler {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    private static void I() {
        llIIIIlI.I[0] = llIIIIlI.l(llIIIIlI.Il(-1826600276, 1901488072).toCharArray(), 95375L, -1721014460);
        llIIIIlI.I[1] = llIIIIlI.l(llIIIIlI.Il(-1826600275, -263688902).toCharArray(), 73642L, 807310679);
        llIIIIlI.I[2] = llIIIIlI.l(llIIIIlI.Il(-1826600274, 5248255).toCharArray(), 909L, 294804097);
        llIIIIlI.I[3] = llIIIIlI.l(llIIIIlI.Il(-1826600273, 438636340).toCharArray(), 87598L, 1176414452);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 12087;
        String string = "\u69c4\u5c02\u0308\u0c5b\ua1cf\u745a\u7076\u3e67\u4703\u5594\u40f1\udc28\ub5a4\u0732\u1714\u91d7\uf3d0\u5153\u5bf9\uafab\ub76c\uc263\ub901\u8e79\ucd40\uef12\u9b7b\uff4e\u638f\udbd6\u1cd9\uab64\u7e61\u1ab0\u8072\u6576\u927b\ubec3\u4c89\u9e93\u8ab5\u47cb\ubd19\u4954\ue610\u45af\ueafc\u9372\u0761\u07e5\u074b\uc262\u08f0\u3781\u1f37\u80d3\u89c2\u8dec\u2cde\ud0cd\u44b6\u9d26";
        char[] cArray = "\u2f3f\u2f31\u2f1f\u2f3f".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 != 0) {
                do {
                    n5 = cArray[n3] ^ n;
                    stringArray[n3] = string.substring(n4, n4 + n5);
                    n4 += n5;
                } while (++n3 < cArray.length);
            } else {
                II = stringArray;
                Il = new Object[stringArray.length];
                int n6 = 1626585214;
                byte[] byArray = "\u008b^\u00d5\u009a\u0013K\u00c9\u00b7#\u00f4\u00bd\u0013\u00c7Q~y\u0014\u0002\u0004\u00d2\u0007\u00c3\u00baC".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                l = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    llIIIIlI.l[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                I = new String[4];
                llIIIIlI.I();
                return;
            }
            n2 = 0;
        }
    }

    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0x18E9360D ^ n;
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
     * Exception decompiling
     */
    @Override
    public Object invoke(Object var1_1, Method var2_2, Object[] var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private llIIIIlI() {
    }

    private static int II(int n, int n2) {
        return l[n ^ 0x5005480F] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String Il(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x93204AAC;
        char[] cArray = II[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIIIIlI.Il[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xC663BD35;
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
                    n6 = 63;
                    continue block33;
                }
                case 26: {
                    n6 = 248;
                    continue block33;
                }
                case 11: {
                    n6 = 42;
                    continue block33;
                }
                case 22: {
                    n6 = 172;
                    continue block33;
                }
                case 16: {
                    n6 = 112;
                    continue block33;
                }
                case 23: {
                    n6 = 146;
                    continue block33;
                }
                case 24: {
                    n6 = 215;
                    continue block33;
                }
                case 19: {
                    n6 = 144;
                    continue block33;
                }
                case 18: {
                    n6 = 132;
                    continue block33;
                }
                case 29: {
                    n6 = 125;
                    continue block33;
                }
                case 3: {
                    n6 = 2;
                    continue block33;
                }
                case 8: {
                    n6 = 251;
                    continue block33;
                }
                case 30: {
                    n6 = 202;
                    continue block33;
                }
                case 9: {
                    n6 = 215;
                    continue block33;
                }
                case 4: {
                    n6 = 60;
                    continue block33;
                }
                case 10: {
                    n6 = 65;
                    continue block33;
                }
                case 13: {
                    n6 = 247;
                    continue block33;
                }
                case 1: {
                    n6 = 136;
                    continue block33;
                }
                case 7: {
                    n6 = 75;
                    continue block33;
                }
                case 17: {
                    n6 = 106;
                    continue block33;
                }
                case 2: {
                    n6 = 62;
                    continue block33;
                }
                case 21: {
                    n6 = 22;
                    continue block33;
                }
                case 15: {
                    n6 = 223;
                    continue block33;
                }
                case 25: {
                    n6 = 136;
                    continue block33;
                }
                case 6: {
                    n6 = 59;
                    continue block33;
                }
                case 14: {
                    n6 = 80;
                    continue block33;
                }
                default: {
                    n6 = 54;
                    continue block33;
                }
                case 5: {
                    n6 = 140;
                    continue block33;
                }
                case 12: {
                    n6 = 197;
                    continue block33;
                }
                case 27: {
                    n6 = 209;
                    continue block33;
                }
                case 31: {
                    n6 = 147;
                    continue block33;
                }
                case 28: 
            }
            n6 = 96;
        }
    }
}

