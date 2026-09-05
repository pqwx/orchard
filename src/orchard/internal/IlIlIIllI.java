/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - cullProjectionMatrix
 *   - projectionMatrix
 *   - gameRenderer
 *   - .getBytes(
 *   - viewMatrix
 *   - hashCode
 *   - toString
 *   - frustum
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.Frustum
 *  net.minecraft.client.render.GameRenderer
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.GameRenderer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

@Environment(value=EnvType.CLIENT)
final class IlIlIIllI
extends Record {
    private final Frustum I;
    private static String[] l;
    private final Camera II;
    private final Matrix4f Il;
    private final Matrix4f lI;
    private final GameRenderer ll;
    private static final int[] III;
    private static final String[] IIl;
    private static final Object[] IlI;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIlIIllI.class, "camera;frustum;gameRenderer;viewMatrix;projectionMatrix", "II", "I", "ll", "Il", "lI"}, this);
    }

    private static <T> T I(Object object, Class<T> clazz, String ... stringArray) {
        for (String string : stringArray) {
            try {
                Method method = object.getClass().getMethod(string, new Class[0]);
                method.setAccessible(true);
                Object object2 = method.invoke(object, new Object[0]);
                if (!clazz.isInstance(object2)) continue;
                return clazz.cast(object2);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                // empty catch block
            }
        }
        return null;
    }

    public Matrix4f l() {
        return this.lI;
    }

    private static void II() {
        IlIlIIllI.l[0] = IlIlIIllI.ll(IlIlIIllI.lIl('\u42ed', '\u1392', 2077977481).toCharArray(), 38311L, 1913815254);
        IlIlIIllI.l[1] = IlIlIIllI.ll(IlIlIIllI.lIl('\u18d4', '\u1393', 1622495908).toCharArray(), 99168L, -731195820);
        IlIlIIllI.l[2] = IlIlIIllI.ll(IlIlIIllI.lIl('\u80b2', '\u1390', -1364241708).toCharArray(), 41076L, -1572274136);
        IlIlIIllI.l[3] = IlIlIIllI.ll(IlIlIIllI.lIl('\u26b5', '\u1391', 1431835738).toCharArray(), 18390L, -448228473);
        IlIlIIllI.l[4] = IlIlIIllI.ll(IlIlIIllI.lIl('\ub033', '\u1396', 1017190167).toCharArray(), 45518L, -1988872887);
        IlIlIIllI.l[5] = IlIlIIllI.ll(IlIlIIllI.lIl('\ubd37', '\u1397', 1412703416).toCharArray(), 14368L, 14174731);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIlIIllI.class, "camera;frustum;gameRenderer;viewMatrix;projectionMatrix", "II", "I", "ll", "Il", "lI"}, this);
    }

    public Matrix4f Il() {
        return this.Il;
    }

    public GameRenderer lI() {
        return this.ll;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(char[] cArray, long l2, int n) {
        int n2 = 0x207E6125 ^ n;
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
     * Unable to fully structure code
     */
    static {
        block32: {
            block30: {
                block31: {
                    block27: {
                        block29: {
                            block28: {
                                block26: {
                                    var6 = 11388;
                                    ** GOTO lbl67
lbl3:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl5:
                                    // 1 sources

                                    while (true) {
                                        var14_11 = var7_4.substring(var11_8, var11_8 + var12_9).toCharArray();
                                        var15_12 = 0;
                                        break block26;
                                        break;
                                    }
lbl9:
                                    // 1 sources

                                    while (true) {
                                        v0 = 87;
                                        ** GOTO lbl58
                                        break;
                                    }
lbl12:
                                    // 1 sources

                                    while (true) {
                                        break block27;
                                        break;
                                    }
lbl14:
                                    // 1 sources

                                    while (true) {
                                        var3_14 += 4;
                                        if (++var4_15 < var1_2) break block28;
                                        break block29;
                                        break;
                                    }
lbl18:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var3_14 = 0;
                                    var4_15 = 0;
                                    break block28;
lbl23:
                                    // 1 sources

                                    while (true) {
                                        v0 = 77;
                                        ** GOTO lbl58
                                        break;
                                    }
lbl26:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        if (++var10_7 < var8_5.length) ** GOTO lbl35
                                        break block30;
                                        break;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl33:
                                    // 2 sources

                                    while (true) {
                                        continue;
lbl35:
                                        // 2 sources

                                        while (true) {
                                            var12_9 = var8_5[var10_7];
                                            ** continue;
                                            break;
                                        }
                                        break;
                                    }
                                }
lbl39:
                                // 2 sources

                                while (true) {
                                    switch (var15_12 % 5) {
                                        case 3: {
                                            ** continue;
                                        }
                                        case 2: {
                                            ** continue;
                                        }
lbl45:
                                        // 1 sources

                                        while (true) {
                                            continue;
lbl47:
                                            // 1 sources

                                            while (true) {
                                                ** continue;
                                                break;
                                            }
                                            break;
                                        }
                                        case 1: {
                                            v0 = 5;
                                            ** GOTO lbl58
                                        }
                                        var9_6[var10_7] = new String(var14_11).intern();
                                        var11_8 += var12_9;
                                        ** continue;
lbl55:
                                        // 1 sources

                                        while (true) {
                                            IlIlIIllI.IIl = var9_6;
                                            break block31;
                                            break;
                                        }
lbl58:
                                        // 5 sources

                                        while (true) {
                                            var16_13 = v0;
                                            break block32;
                                            break;
                                        }
lbl61:
                                        // 1 sources

                                        while (true) {
                                            IlIlIIllI.III[var4_15] = var5_16 ^= var2_3;
                                            ** continue;
                                            break;
                                        }
lbl64:
                                        // 1 sources

                                        while (true) {
                                            if (var13_10 != 0) ** continue;
                                            ** continue;
                                            break;
                                        }
lbl67:
                                        // 1 sources

                                        var7_4 = "\ua595\u4dcb\ub4d5\uc256\uc86b\u3033\uccee\u0795\ua929\u0c6b\u90a6\u19b1\u6688\u1536\ucba0\ud346\u8fc8\u0da8\u9e1e\u94ed\u7564\u08d4\u7321\ue356\ub8eb\u9611\u5749\uaea8\u6fbb\u6fc2\u05c2\u0639\u1024\ua56a\ud3e8\ue836\ube24\u7949\u27e5\uf5a5\ua531\u4b2d\u9442\u69f6\ua41a\ucdb9\u0cfa\uef68\u744e\u1fde\ued32\ueee0\u7088\u5abb\u2a4d\uf052\u0df6\u21ce\u84ff\u4e1b\uf2d1\ub501\ua6e0\u7ec7\u6967\udc22\ue6ea\uc927\udb5f\uea74\u31cd\u302d\u79a1\ucceb\u17ca\uac89\uf32f\u2863\u24a0\u3608\u023c\ud5be\u1522\ua375\u5a6e\u7ebe\u549f\u4634\u2707\u4867\u4991\uc61e\u72c1\udc07\u9c03\u2c2a\u1d52\u698d\u46f7\u4116\uf54f\u74d8\u52b3\ua242";
                                        ** continue;
                                        default: {
                                            v0 = 85;
                                            ** GOTO lbl58
                                        }
                                        case 4: 
                                    }
                                    break;
                                }
                                v0 = 6;
                                ** while (true)
                            }
                            var5_16 = (var0_1[var3_14] & 255) << 24 | (var0_1[var3_14 + 1] & 255) << 16 | (var0_1[var3_14 + 2] & 255) << 8 | var0_1[var3_14 + 3] & 255;
                            ** while (true)
lbl78:
                            // 1 sources

                            while (true) {
                                var13_10 = -1;
                                ** GOTO lbl33
                                break;
                            }
                            var2_3 = -39283277;
                            var0_1 = "\u00d6:\r9:O\u009a\u00f9o\u0017\u008f\u00e3w\u00d4t~*r\u00c6\u00da\u001e\u0094\u009b\u00ca\u00c9\u0092\u001f\u00c7\u00cd\u00b9\u00e6N\u00b1\u00ac0\u00c3".getBytes("ISO-8859-1");
                            ** while (true)
                            var1_2 = var0_1.length / 4;
                            IlIlIIllI.III = new int[var1_2];
                            ** while (true)
                            var8_5 = "\u0010\f\b\u0010\u0018\u001c".toCharArray();
                            var9_6 = new String[var8_5.length];
                            ** while (true)
                        }
                        IlIlIIllI.l = new String[6];
                        IlIlIIllI.II();
                        return;
                        var10_7 = 0;
                        var11_8 = 0;
                        var12_9 = '\u0000';
                        ** while (true)
                    }
                    ** while (var15_12 < var14_11.length)
lbl100:
                    // 1 sources

                    ** while (true)
                }
                IlIlIIllI.IlI = new Object[var9_6.length];
                ** while (true)
            }
            var13_10 = 0;
            ** while (true)
        }
        v1 = var15_12++;
        var14_11[v1] = (char)(var14_11[v1] ^ var16_13 ^ var6);
        ** while (true)
    }

    private static IlIlIIllI III(Object object) {
        if (object == null) {
            return new IlIlIIllI(null, null, null, null, null);
        }
        Camera camera = IlIlIIllI.I(object, Camera.class, "camera");
        Frustum frustum = IlIlIIllI.I(object, Frustum.class, "frustum");
        GameRenderer gameRenderer = IlIlIIllI.I(object, GameRenderer.class, "gameRenderer");
        Matrix4f matrix4f = IlIlIIllI.IlI(object, "viewMatrix");
        Matrix4f matrix4f2 = IlIlIIllI.IlI(object, "cullProjectionMatrix", "projectionMatrix");
        return new IlIlIIllI(camera, frustum, gameRenderer, matrix4f, matrix4f2);
    }

    private IlIlIIllI(Camera camera, Frustum frustum, GameRenderer gameRenderer, Matrix4f matrix4f, Matrix4f matrix4f2) {
        this.II = camera;
        this.I = frustum;
        this.ll = gameRenderer;
        this.Il = matrix4f;
        this.lI = matrix4f2;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIlIIllI.class, "camera;frustum;gameRenderer;viewMatrix;projectionMatrix", "II", "I", "ll", "Il", "lI"}, this, object);
    }

    public Frustum IIl() {
        return this.I;
    }

    private static Matrix4f IlI(Object object, String ... stringArray) {
        for (String string : stringArray) {
            try {
                Method method = object.getClass().getMethod(string, new Class[0]);
                method.setAccessible(true);
                Object object2 = method.invoke(object, new Object[0]);
                if (!(object2 instanceof Matrix4fc)) continue;
                Matrix4fc matrix4fc = (Matrix4fc)object2;
                return new Matrix4f(matrix4fc);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                // empty catch block
            }
        }
        return null;
    }

    public Camera Ill() {
        return this.II;
    }

    private static int lII(int n, int n2) {
        return III[n ^ 0x656B7FE9] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x1392;
        char[] cArray = IIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIlIIllI.IlI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x28C1;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 31536;
            n6 += 56922;
            n6 += 2299;
            n6 -= 6086;
            n6 -= 39839;
            cArray[n5] = (char)((n6 += 29786) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

