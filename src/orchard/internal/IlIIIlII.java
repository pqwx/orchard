/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - cullProjectionMatrix
 *   - projectionMatrix
 *   - gameRenderer
 *   - matrixStack
 *   - .getBytes(
 *   - viewMatrix
 *   - consumers
 *   - matrices
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
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.util.math.MatrixStack
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package orchard.internal;

import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import orchard.internal.II;
import orchard.internal.IIIIllIIl;
import orchard.internal.lIIlI;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

@Environment(value=EnvType.CLIENT)
final class IlIIIlII
implements II {
    private final Matrix4f I;
    private final MatrixStack l;
    private final GameRenderer II;
    private final VertexConsumerProvider Il;
    private static String[] lI;
    private final Camera ll;
    private final Frustum III;
    private final Matrix4f IIl;
    private static final int[] IlI;
    private static final String[] Ill;
    private static final Object[] lII;

    @Override
    public MatrixStack Il() {
        return this.l;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 31860;
        String string = "\u81fb\u935c\ubbbb\ua471\u8c75\ua73b\uccc2\u0c22\u596c\udbf4\u4704\u4c21\u31d6\u970b\ua4c6\u5426\uf6cd\u127b\uebad\uf245\u3a8f\u9a31\u7e73\uc5b7\u91ba\u398d\ufbd1\u6844\u2cda\uf48b\u45da\uaa58\u434e\u1401\u29dd\ube33\uc600\ua63e\u4005\u18a1\u6266\u110f\u1220\udd4e\ue9d5\uf38b\u8964\uba5c\ue852\u55c8\u69cf\ud529\ue70f\u05e2\u0135\u1f48\u148c\udda5\uf4b1\u6c2a\ud1bc\u879f\u8483\u5efa\u4746\u75d5\u9a95\u3aa8\ua17e\uf9cd\u1b5e\u57a1\ua60e\u77bd\u6810\uee71\u9c79\u1c52\u9643\u13ec\u74d5\uae7d\u1d60\u06b6\uaf1e\ub7f3\u48d4\ue8fb\u1be5\u21f0\uacf9\u4f76\ue492\ue5d9\ub423\u0e24\ua940\ub857\u8e6b\uea7d\u2e1e\u4169\u8f65\ud151\uda69\u1d59\u1480\ue1f8\u7196\u9e1b\u19cc\ube01\u1769\u8782\u0819\u921a\ua433\uad74\u8da7\ud1e9\u31cf\ue458\ub3de\u979c\udd11\u435a\u832a\u382f\uc370\ube1b\uabac\uf8a3\ub96f\u19c2\uc404\u9d1e\u6cec\ub532\udcee\u44aa\uc5a8\ubc43\uc5e4\u00d9";
        char[] cArray = "\u7c6c\u7c78\u7c68\u7c64\u7c78\u7c7c\u7c64\u7c64\u7c78".toCharArray();
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
        int n6 = -1659668367;
        byte[] byArray = "3'\u00c3\u00d9\u00d0\u0012\u00b10\"\u0015:\u001c\u00ba\u00fc\u00a1a\u0091A\u008cP4'\u00fc\u00f9\u008e\u0014\u0093l\u001b\u00c3\u00d1,R\u00d4\u00be\u00a8T\u00a4\u00f8\u0095\u00ff\u0095\u00b25\u00c41\u00ba\u00bfh\u00db\u00bb0\u0002`<\u00bb1\u00cdyl\u0097FCG\u0081S\u0081L\u0083\u0080{\u00e2".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IlI = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IlIIIlII.IlI[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        lI = new String[9];
        IlIIIlII.Ill();
    }

    @Override
    public Matrix4f III() {
        return this.IIl;
    }

    @Override
    public Matrix4f l() {
        return this.I;
    }

    @Override
    public GameRenderer lI() {
        return this.II;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIIIlII(Object object) {
        IIIIllIIl iIIIllIIl = lIIlI.I;
        this.l = IlIIIlII.lII(object, MatrixStack.class, "matrices", "matrixStack");
        this.Il = IlIIIlII.lII(object, VertexConsumerProvider.class, "consumers");
        Frustum frustum = IlIIIlII.lII(object, Frustum.class, "frustum");
        this.III = frustum != null ? frustum : lIIlI.II.IIl();
        Camera camera = IlIIIlII.lII(object, Camera.class, "camera");
        this.ll = camera != null ? camera : lIIlI.l(iIIIllIIl.l(), lIIlI.II.Ill());
        GameRenderer gameRenderer = IlIIIlII.lII(object, GameRenderer.class, "gameRenderer");
        this.II = gameRenderer != null ? gameRenderer : lIIlI.l(iIIIllIIl.I(), lIIlI.II.lI());
        Matrix4f matrix4f = IlIIIlII.lIl(object, "viewMatrix");
        this.I = matrix4f != null ? matrix4f : lIIlI.l(iIIIllIIl.Il(), lIIlI.II.Il());
        Matrix4f matrix4f2 = IlIIIlII.lIl(object, "projectionMatrix", "cullProjectionMatrix");
        this.IIl = matrix4f2 != null ? matrix4f2 : lIIlI.l(iIIIllIIl.II(), lIIlI.II.l());
    }

    @Override
    public Camera IIl() {
        return this.ll;
    }

    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0xF2C11CB2 ^ n;
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

    private static Object ll(Object object, String string) {
        if (object == null) {
            return null;
        }
        try {
            Method method = object.getClass().getMethod(string, new Class[0]);
            method.setAccessible(true);
            return method.invoke(object, new Object[0]);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return null;
        }
    }

    private static void Ill() {
        IlIIIlII.lI[0] = IlIIIlII.II(IlIIIlII.lll(1973329648, 1433221637).toCharArray(), 32604L, 120604136);
        IlIIIlII.lI[1] = IlIIIlII.II(IlIIIlII.lll(1973329649, 1412377136).toCharArray(), 3386L, -1553161170);
        IlIIIlII.lI[2] = IlIIIlII.II(IlIIIlII.lll(1973329650, 642398728).toCharArray(), 42325L, -1832255480);
        IlIIIlII.lI[3] = IlIIIlII.II(IlIIIlII.lll(1973329651, -295491692).toCharArray(), 53388L, 983066194);
        IlIIIlII.lI[4] = IlIIIlII.II(IlIIIlII.lll(1973329652, -2005252509).toCharArray(), 36082L, 206826022);
        IlIIIlII.lI[5] = IlIIIlII.II(IlIIIlII.lll(1973329653, -237998953).toCharArray(), 34175L, -1529818820);
        IlIIIlII.lI[6] = IlIIIlII.II(IlIIIlII.lll(1973329654, 659902024).toCharArray(), 43547L, -903256937);
        IlIIIlII.lI[7] = IlIIIlII.II(IlIIIlII.lll(1973329655, -1798491013).toCharArray(), 25780L, 1384823953);
        IlIIIlII.lI[8] = IlIIIlII.II(IlIIIlII.lll(1973329656, 1982419399).toCharArray(), 25705L, -1302534395);
    }

    @Override
    public VertexConsumerProvider I() {
        return this.Il;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private static <T> T lII(Object object, Class<T> clazz, String ... stringArray) {
        Object object2;
        block4: {
            String string;
            int n;
            int n2;
            String[] stringArray2;
            block3: {
                if (object == null) {
                    return null;
                }
                stringArray2 = stringArray;
                n2 = stringArray2.length;
                n = 0;
                if (!true) break block3;
                if (n >= n2) return null;
                if (clazz.isInstance(object2 = IlIIIlII.ll(object, string = stringArray2[n]))) break block4;
            }
            do {
                ++n;
                if (n >= n2) return null;
            } while (!clazz.isInstance(object2 = IlIIIlII.ll(object, string = stringArray2[n])));
        }
        return clazz.cast(object2);
    }

    @Override
    public Frustum IlI() {
        return this.III;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Matrix4f lIl(Object object, String ... stringArray) {
        Object object2;
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                return null;
            }
            String string = stringArray2[n2];
            object2 = IlIIIlII.ll(object, string);
            if (object2 instanceof Matrix4fc) break;
            ++n2;
        }
        Matrix4fc matrix4fc = (Matrix4fc)object2;
        return new Matrix4f(matrix4fc);
    }

    private static int llI(int n, int n2) {
        return IlI[n ^ 0xFDDCC46F] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x759E9EF0;
        char[] cArray = Ill[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIIlII.lII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x26FDE949;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 13 -> 253;
                case 16 -> 48;
                case 27 -> 82;
                case 26 -> 2;
                case 19 -> 75;
                case 7 -> 161;
                case 3 -> 153;
                case 11 -> 106;
                case 31 -> 136;
                case 6 -> 93;
                case 12 -> 81;
                case 25 -> 85;
                case 20 -> 146;
                case 8 -> 235;
                case 21 -> 98;
                case 14 -> 219;
                case 29 -> 200;
                case 4 -> 111;
                case 2 -> 154;
                case 15 -> 185;
                case 23 -> 244;
                case 5 -> 223;
                case 1 -> 173;
                case 10 -> 196;
                case 30 -> 153;
                case 18 -> 122;
                case 9 -> 246;
                case 17 -> 85;
                case 28 -> 204;
                default -> 67;
                case 22 -> 81;
                case 24 -> 114;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

