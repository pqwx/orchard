/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlllIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Unable to compile streamer overlay shader: 
 *   - Unable to link streamer overlay shader: 
 *   - Orchard Streamer Overlay
 *   - SetWindowDisplayAffinity
 *   - overlayTexture
 *   - outputColor
 *   - .getBytes(
 *   - org.lwjgl
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWNativeWin32
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL32C
 *  org.lwjgl.opengl.GLCapabilities
 *  org.lwjgl.system.JNI
 *  org.lwjgl.system.Library
 *  org.lwjgl.system.Platform
 *  org.lwjgl.system.SharedLibrary
 *  org.lwjgl.system.windows.User32
 */
package orchard.internal;

import java.nio.IntBuffer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWNativeWin32;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.system.JNI;
import org.lwjgl.system.Library;
import org.lwjgl.system.Platform;
import org.lwjgl.system.SharedLibrary;
import org.lwjgl.system.windows.User32;

@Environment(value=EnvType.CLIENT)
final class lIlllIll {
    private int I;
    private boolean l;
    private boolean II = true;
    private int Il;
    private boolean lI;
    private int ll;
    private int III;
    private int IIl;
    private long IlI;
    private int Ill;
    private static final int lII = 17;
    private SharedLibrary lIl;
    private int llI;
    private GLCapabilities lll;
    private int IIII;
    private int IIIl = Integer.MIN_VALUE;
    private final IntBuffer IIlI;
    private int IIll;
    private final IntBuffer IlII;
    private long IlIl;
    private final IntBuffer IllI;
    private final IntBuffer Illl;
    private boolean lIII;
    private final IntBuffer lIIl;
    private static final int lIlI = 0;
    private final IntBuffer lIll;
    private long llII;
    private static final int[] llIl;
    private static final String[] lllI;
    private static final Object[] llll;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void I(int n, int n2, int n3) {
        if (this.llII == 0L) {
            return;
        }
        this.lII();
        this.llI();
        if (!this.lI) {
            return;
        }
        long l2 = GLFW.glfwGetCurrentContext();
        GLCapabilities gLCapabilities = GL.getCapabilities();
        try {
            GLFW.glfwMakeContextCurrent((long)this.llII);
            GL.setCapabilities((GLCapabilities)this.lll);
            GLFW.glfwGetFramebufferSize((long)this.llII, (IntBuffer)this.lIll, (IntBuffer)this.IlII);
            int n4 = Math.max(1, this.lIll.get(0));
            int n5 = Math.max(1, this.IlII.get(0));
            if (n4 != this.IIl || n5 != this.I) {
                GL32C.glViewport((int)0, (int)0, (int)n4, (int)n5);
                this.IIl = n4;
                this.I = n5;
            }
            GL32C.glDisable((int)2929);
            GL32C.glDisable((int)2884);
            GL32C.glDisable((int)3089);
            GL32C.glDisable((int)3042);
            GL32C.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
            GL32C.glClear((int)16384);
            GL32C.glUseProgram((int)this.ll);
            GL32C.glBindVertexArray((int)this.llI);
            GL32C.glActiveTexture((int)33984);
            GL32C.glBindTexture((int)3553, (int)n);
            GL32C.glUniform1i((int)this.Il, (int)0);
            GL32C.glDrawArrays((int)4, (int)0, (int)3);
            GL32C.glBindTexture((int)3553, (int)0);
            GL32C.glBindVertexArray((int)0);
            GL32C.glUseProgram((int)0);
            GLFW.glfwSwapBuffers((long)this.llII);
        }
        finally {
            GLFW.glfwMakeContextCurrent((long)l2);
            GL.setCapabilities((GLCapabilities)gLCapabilities);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l() {
        if (this.ll != 0) {
            GL32C.glDeleteProgram((int)this.ll);
            this.ll = 0;
        }
        if (this.llI != 0) {
            GL32C.glDeleteVertexArrays((int)this.llI);
            this.llI = 0;
        }
        if (this.llII != 0L) {
            GLFW.glfwDestroyWindow((long)this.llII);
            this.llII = 0L;
        }
        this.lll = null;
        this.IlI = 0L;
        this.IlIl = 0L;
        this.lI = false;
        this.l = false;
        this.IIIl = Integer.MIN_VALUE;
        this.III = Integer.MIN_VALUE;
        this.Ill = Integer.MIN_VALUE;
        this.IIII = Integer.MIN_VALUE;
        this.IIl = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void II() {
        String string = "#version 150 core\nout vec2 texCoord;\nvoid main() {\n    vec2 point = vec2(\n        gl_VertexID == 1 ? 3.0 : -1.0,\n        gl_VertexID == 2 ? 3.0 : -1.0\n    );\n    texCoord = point * 0.5 + 0.5;\n    gl_Position = vec4(point, 0.0, 1.0);\n}\n";
        String string2 = "#version 150 core\nuniform sampler2D overlayTexture;\nin vec2 texCoord;\nout vec4 outputColor;\nvoid main() {\n    vec4 sampled = texture(overlayTexture, texCoord);\n    outputColor = vec4(sampled.rgb * sampled.a, sampled.a);\n}\n";
        int n = lIlllIll.IlI(35633, string);
        int n2 = lIlllIll.IlI(35632, string2);
        this.ll = GL32C.glCreateProgram();
        GL32C.glAttachShader((int)this.ll, (int)n);
        GL32C.glAttachShader((int)this.ll, (int)n2);
        GL32C.glBindFragDataLocation((int)this.ll, (int)0, (CharSequence)"outputColor");
        GL32C.glLinkProgram((int)this.ll);
        GL32C.glDeleteShader((int)n);
        GL32C.glDeleteShader((int)n2);
        if (GL32C.glGetProgrami((int)this.ll, (int)35714) != 0) {
            this.Il = GL32C.glGetUniformLocation((int)this.ll, (CharSequence)"overlayTexture");
            this.llI = GL32C.glGenVertexArrays();
            return;
        }
        String string3 = GL32C.glGetProgramInfoLog((int)this.ll);
        String string4 = "Unable to link streamer overlay shader: ";
        throw new IllegalStateException(string4 + string3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean Il(long l2, boolean bl) {
        this.II = bl;
        long l3 = GLFW.glfwGetCurrentContext();
        if (l2 == 0L || l3 == 0L) {
            return false;
        }
        if (this.llII != 0L && (this.IlI != l2 || this.IlIl != l3 || this.lll == null || this.ll == 0 || this.llI == 0 || GLFW.glfwWindowShouldClose((long)this.llII))) {
            this.Ill();
        }
        if (this.llII != 0L) {
            this.llI();
            return true;
        }
        this.IlI = l2;
        this.IlIl = l3;
        this.lIII = false;
        long l4 = l3;
        GLCapabilities gLCapabilities = GL.getCapabilities();
        try {
            this.llII = this.ll(l2, true);
            if (this.llII == 0L) {
                this.llII = this.ll(l2, false);
            }
            if (this.llII == 0L) {
                boolean bl2 = false;
                return bl2;
            }
            GLFW.glfwMakeContextCurrent((long)this.llII);
            this.lll = GL.createCapabilities();
            GLFW.glfwSwapInterval((int)0);
            this.II();
            this.IIl();
            GLFW.glfwSetWindowAttrib((long)this.llII, (int)131079, (int)1);
            this.lll();
            ++this.IIll;
            boolean bl3 = true;
            return bl3;
        }
        catch (Throwable throwable) {
            this.l();
            boolean bl4 = false;
            return bl4;
        }
        finally {
            GLFW.glfwMakeContextCurrent((long)l4);
            GL.setCapabilities((GLCapabilities)gLCapabilities);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void lI() {
        if (this.llII == 0L) return;
        if (!this.lI) return;
        GLFW.glfwHideWindow((long)this.llII);
        this.lI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long ll(long l2, boolean bl) {
        long l3;
        GLFW.glfwDefaultWindowHints();
        GLFW.glfwWindowHint((int)131076, (int)0);
        GLFW.glfwWindowHint((int)131077, (int)0);
        GLFW.glfwWindowHint((int)131075, (int)0);
        GLFW.glfwWindowHint((int)131079, (int)1);
        GLFW.glfwWindowHint((int)131073, (int)0);
        GLFW.glfwWindowHint((int)131084, (int)0);
        GLFW.glfwWindowHint((int)131082, (int)1);
        GLFW.glfwWindowHint((int)131085, (int)1);
        if (bl) {
            GLFW.glfwWindowHint((int)139266, (int)3);
            GLFW.glfwWindowHint((int)139267, (int)2);
            GLFW.glfwWindowHint((int)139272, (int)204801);
            if (Platform.get() == Platform.MACOSX) {
                GLFW.glfwWindowHint((int)139270, (int)1);
            }
        }
        if ((l3 = GLFW.glfwCreateWindow((int)1, (int)1, (CharSequence)"Orchard Streamer Overlay", (long)0L, (long)l2)) == 0L || GLFW.glfwGetWindowAttrib((long)l3, (int)131082) == 1) {
            return l3;
        }
        this.lIII = true;
        GLFW.glfwDestroyWindow((long)l3);
        return 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    lIlllIll() {
        this.III = Integer.MIN_VALUE;
        this.Ill = Integer.MIN_VALUE;
        this.IIII = Integer.MIN_VALUE;
        this.IIl = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        this.lIIl = BufferUtils.createIntBuffer((int)1);
        this.IIlI = BufferUtils.createIntBuffer((int)1);
        this.IllI = BufferUtils.createIntBuffer((int)1);
        this.Illl = BufferUtils.createIntBuffer((int)1);
        this.lIll = BufferUtils.createIntBuffer((int)1);
        this.IlII = BufferUtils.createIntBuffer((int)1);
    }

    /*
     * Enabled aggressive block sorting
     */
    void III(boolean bl) {
        if (this.II == bl) {
            return;
        }
        this.II = bl;
        this.l = !bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl() {
        if (Platform.get() != Platform.WINDOWS) {
            return;
        }
        long l2 = GLFWNativeWin32.glfwGetWin32Window((long)this.llII);
        if (l2 == 0L) {
            return;
        }
        long l3 = User32.GetWindowLongPtr((long)l2, (int)-20);
        l3 |= 0x8000080L;
        User32.SetWindowLongPtr((long)l2, (int)-20, (long)(l3 &= 0xFFFFFFFFFFFBFFFFL));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int IlI(int n, String string) {
        int n2 = GL32C.glCreateShader((int)n);
        GL32C.glShaderSource((int)n2, (CharSequence)string);
        GL32C.glCompileShader((int)n2);
        if (GL32C.glGetShaderi((int)n2, (int)35713) != 0) {
            return n2;
        }
        String string2 = GL32C.glGetShaderInfoLog((int)n2);
        GL32C.glDeleteShader((int)n2);
        String string3 = string2;
        String string4 = "Unable to compile streamer overlay shader: ";
        throw new IllegalStateException(string4 + string3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void Ill() {
        if (this.llII == 0L) {
            return;
        }
        long l2 = GLFW.glfwGetCurrentContext();
        GLCapabilities gLCapabilities = GL.getCapabilities();
        try {
            GLFW.glfwMakeContextCurrent((long)this.llII);
            GL.setCapabilities((GLCapabilities)this.lll);
            this.l();
        }
        finally {
            GLFW.glfwMakeContextCurrent((long)l2);
            GL.setCapabilities((GLCapabilities)gLCapabilities);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII() {
        boolean bl;
        boolean bl2 = bl = GLFW.glfwGetWindowAttrib((long)this.IlI, (int)131076) == 1 && GLFW.glfwGetWindowAttrib((long)this.IlI, (int)131074) == 0;
        if (!bl) {
            if (!this.lI) return;
            GLFW.glfwHideWindow((long)this.llII);
            this.lI = false;
            return;
        }
        GLFW.glfwGetWindowPos((long)this.IlI, (IntBuffer)this.lIIl, (IntBuffer)this.IIlI);
        GLFW.glfwGetWindowSize((long)this.IlI, (IntBuffer)this.IllI, (IntBuffer)this.Illl);
        int n = Math.max(1, this.IllI.get(0));
        int n2 = Math.max(1, this.Illl.get(0));
        int n3 = this.lIIl.get(0);
        int n4 = this.IIlI.get(0);
        if (n3 != this.IIIl || n4 != this.III) {
            GLFW.glfwSetWindowPos((long)this.llII, (int)n3, (int)n4);
            this.IIIl = n3;
            this.III = n4;
        }
        if (n != this.Ill || n2 != this.IIII) {
            GLFW.glfwSetWindowSize((long)this.llII, (int)n, (int)n2);
            this.Ill = n;
            this.IIII = n2;
        }
        if (this.lI) return;
        GLFW.glfwShowWindow((long)this.llII);
        this.lI = true;
    }

    int lIl() {
        return this.IIll;
    }

    private void llI() {
        if (this.l != this.II) {
            this.lll();
        }
    }

    private void lll() {
        if (this.llII == 0L || Platform.get() != Platform.WINDOWS) {
            this.l = this.II;
            return;
        }
        try {
            if (this.lIl == null) {
                this.lIl = Library.loadNative(lIlllIll.class, (String)"org.lwjgl", (String)"user32");
            }
            long l2 = this.lIl.getFunctionAddress((CharSequence)"SetWindowDisplayAffinity");
            long l3 = GLFWNativeWin32.glfwGetWin32Window((long)this.llII);
            if (l2 != 0L && l3 != 0L) {
                JNI.invokePI((long)l3, (int)(this.II ? 17 : 0), (long)l2);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        this.l = this.II;
    }

    boolean IIII() {
        return this.lIII;
    }

    private static int IIIl(int n, int n2) {
        return llIl[n ^ 0x911D71F3] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 9512;
        var7_4 = "\u9880\u98b9\u9b2a\u9b5e\u98f4\u9881\u98ba\u9896\u9b70\u9b4c\u9b0a\u9b34\u9b57\u9b44\u98dd\u9b76\u9b32\u9893\u9b5e\u9b57\u98ca\u9b76\u98df\u98cd\u9b57\u98b9\u98c9\u9b62\u9b18\u98dc\u9b15\u9b6f\u98d4\u9b7a\u9b1c\u9882\u9b6e\u9b6a\u9b22\u9b68\u98a3\u9b7e\u9b47\u9b25\u98c0\u9888\u9b02\u9b64\u9b73\u98cd\u9b26\u989a\u9b18\u9b7e\u9b5c\u9b72\u98c9\u9888\u98fb\u9b61\u9883\u9b6f\u9b12\u9b2c\u98dc\u9b63\u98b2\u98dc\u98e1\u9b7a\u98f7\u9b34\u9b41\u9b7a\u98df\u9b5d\u9b4f\u9894\u98fa\u9b6f\u9b20\u988b\u98e4\u9b34\u98ab\u9b72\u98da\u9b2f\u9b4f\u9898\u98b7\u9b6d\u9b73\u9888\u9b00\u9b79\u9883\u98b7\u9b34\u989a\u9b1b\u9b37\u98eb\u9b59\u98de\u9b70\u98ab\u9b33\u98fd\u9b73\u9b3d\u9b63\u9b14\u989f\u9b44\u9b63\u9b3c\u9881\u9b05\u9b7a\u98a2\u98b4\u9b2f\u9b7e\u98f7\u98a8\u9b5a\u9b69\u98e2\u9b67\u9b4d\u9b37\u98b7\u98ca\u98c9\u9b7f\u9b1e\u988d\u98b8\u9b25\u9b73\u9b70\u98ee\u9b37\u9b12\u988d\u98e2\u9b61\u98a6\u9892\u9b56\u9b26\u9b26\u9b62\u9b2e\u9b7e\u9b44\u9b45\u9b72\u9b4d\u98a1\u9891\u98eb\u9b59\u9b3a\u9896\u98e0\u9b71\u98b8\u9b72\u98df\u9880\u98f4\u9b64\u9880\u98b9\u9b35\u9b63\u98e3\u9b7a\u9b12\u9b6e\u9b36\u9b7b\u98eb\u9b36\u98b6\u9b44\u98de\u9b2b\u98ab\u9887\u98b7\u9b79\u9b3f\u9b66\u98e4\u9b72\u9b73\u9b75\u9b3d\u9888\u98e4\u9b34\u9b63\u9b6b\u98d0\u9b63\u9b08\u9b70\u98b9\u9896\u98e1\u9b70\u98f4\u9b37\u9b5d\u9b7f\u98c9\u9b2e\u98e2\u9b62\u98b2\u9b59\u98c0\u9b63\u98e4\u9882\u9b10\u9b76\u989d\u9b60\u98a6\u9b7e\u98a1\u9b60\u98c5\u9b2e\u9b32\u9b71\u9b57\u9b6a\u9b11\u989f\u9b3f\u9898\u98be\u9b69\u98e1\u9889\u98ea\u9b36\u98a2\u9888\u9b70\u98c4\u98dc\u9b7a\u9b5d\u9b26\u98e1\u9b2e\u98ed\u9b56\u9b70\u9b42\u9b17\u9b2b\u9b1b\u9897\u9b58\u9b6b\u9b72\u9b70\u98e4\u9b7b\u9883\u9b74\u9b70\u9b2f\u9b01\u989c\u98ab\u989a\u9b2f\u9b4c\u98fb\u9b7f\u98b9\u9b7a\u9b25\u9b5e\u9b32\u9b37\u9b5f\u9b59\u98ca\u9b70\u9b02\u9b63\u9880\u9b27\u9b0c\u9b62\u9b08\u9891\u9b73\u9b6f\u9b02\u98c1\u98a6\u9b72\u98b5\u9b6a\u98eb\u98b7\ubfb0\ubfc9\ube3a\ube2e\ubfe4\ubf91\ubfaa\ube46\ube20\ubf9c\ube3a\ube64\ube47\ube74\ube2d\ube66\ube02\ubfc3\ube6e\ube27\ubfda\ube66\ubfef\ubfdd\ube4d\ube7f\ube77\ube73\ube1d\ube62\ubfe2\ube58\ube2b\ubf85\ube29\ube4f\ube47\ube6a\ube04\ube50\ubfb6\ubf8c\ubfa1\ube6c\ubfc0\ube72\ube32\ube65\ube54\ubf8c\ube36\ube7a\ube32\ubf8c\ube73\ube6f\ube10\ube77\ubfb6\ube7d\ubfa5\ubfd5\ubfcf\ube58\ube29\ubf8c\ube11\ube7d\ubf87\ube4c\ube3c\ube6e\ube11\ube6a\ubfcf\ube2d\ube3f\ubfc4\ubfea\ube7f\ube35\ubfdb\ube1c\ube71\ubfa4\ube7f\ube13\ube7e\ube4c\ubf8c\ube72\ube54\ube28\ube7a\ubfbe\ube7e\ubfb7\ubfdd\ube17\ube66\ube1e\ube7b\ubfa5\ube25\ube2e\ubf94\ube0b\ube4a\ubfb7\ube26\ube71\ube66\ube32\ube64\ube10\ubf83\ube73\ube66\ubfeb\ubf9b\ubfa2\ube59\ube0b\ube76\ubfef\ube4a\ube71\ubf8a\ubfd2\ube66\ube1a\ube62\ube46\ube27\ube21\ubf8a\ube0b\ube62\ubfa5\ube5e\ube27\ubf80\ubfbe\ube6e\ube5e\ubfd6\ube28\ube2b\ube15\ubfc7\ubfa4\ube6a\ube36\ube2b\ubfbe\ube63\ube47\ubf8c\ube3f\ube73\ubfe7\ubf91\ubfa8\ubf83\ube02\ube2f\ubfd3\ube34\ubfb0\ubfc9\ubfdf\ube57\ubfeb\ube67\ubfbd\ube7f\ube23\ube7a\ube2e\ube71\ube57\ube72\ube23\ube2f\ube10\ubf9d\ube5d\ubfd0\ubf8f\ube4d\ubfe1\ube7d\ubfb8\ube72\ube2a\ube2e\ubfb6\ube72\ube46\ube59\ube26\ube73\ube4f\ubfcc\ube60\ubfd6\ube02\ube58\ube3f\ubfc7\ubfad\ube63\ubf87\ube52\ubfe4\ube67\ube54\ube5b\ubfc5\ube79\ube11\ubf9d\ube4d\ube5e\ubfd5\ube4c\ubff9\ubfc4\ube44\ubf80\ube28\ube7d\ubff4\ube4a\ubfe7\ube63\ubf8f\ube2f\ube07\ube6e\ube57\ubf80\ube0b\ube7b\ube32\ubfc7\ube45\ube63\ubfda\ubfd3\ube1d\ube7d\ubfed\ubfd6\ube01\ube57\ube10\ubfc7\ube45\ube76\ubf8f\ube78\ube1a\ube37\ube41\ube27\ube35\ube2c\ube3c\ube7e\ubfaa\ube79\ube2f\ube70\ube07\ube35\ubfb3\ube78\ubfc3\ube7a\ube1b\ube63\ubfa7\ube73\ube23\ube78\ube4c\ube35\ube46\ubf8c\ube70\ube2f\ube35\ubf84\ube5b\ubfd6\u64eb\u6774\u64ef\u64ba\u64a5\u64a2\u648f\u6764\u649c\u64b1\u64de\u64c7\u6481\u6774\u64d5\u6486\ud12a\ud1f5\ud192\ud1e0\ud19a\ud11e\ud1de\ud1fa\ud1b5\ud1dd\ud167\ud1ed\ud1cd\ud1a5\ud184\ud1ad\ud1bf\ud112\ud13b\ud100\ud190\ud1f5\ud177\ud1b7\ud1c7\ud1f5\ud152\ud1f9\ud19b\ud1d3\ud192\ud10a\ud1ad\ud1e4\ud122\ud1e5\ud1cd\ud116\ud1f2\ud1f3\ud174\ud14d\ud17e\ud1db\ud1a4\ud1d0\ud19d\ud1ed\ud1d8\ud1e0\ud1a5\ud1ab\ud194\ud1c5\ud17f\ud148\uc84b\uc994\uc9db\uc84f\uc805\uc879\uc9bd\uc98d\uc82c\uc870\uc800\uc868\uc870\uc98b\uc801\uc996\uc9e3\uc835\uc84c\uc9af\u26f8\u268f\u26cc\u26aa\u26ec\u26b0\u26e4\u26b5\u2130\u26bc\u26ab\u26c7\u2684\u26b0\u212d\u26c7\u26d4\u26de\u2175\u26c1\u269c\u26b4\u26bb\u2153\u26af\u26bb\u2683\u216e\u2109\u2169\u268b\u26b5\uc57f\uc530\uc51b\uc535\uc55f\uc517\uc50b\uc52b\uc5b0\uc518\uc552\uc538\uc51c\uc520\uc503\uc536\uc57a\uc55a\uc519\uc536\uc516\uc547\uc560\uc524\uc51f\uc512\uc51a\uc523\uc55e\uc55b\uc5d2\uc528\uc516\uc50f\uc523\uc55d\uc50b\uc506\uc561\uc536\uc53b\uc531\uc514\uc530\uc515\uc521\uc540\uc53f\uc5d2\uc53c\uc565\uc53c\uc544\uc538\uc50b\uc52b\uc55e\uc556\uc576\uc50c\u7b78\u7bc7\u7b74\u7bee\u7b78\u7b2a\u7b0a\u7b20\u7b6f\u7b32\u7b6f\u7b28\u8671\u8673\u87d9\u8667\u862d\u8668\u87ba\u8622\u2b71\u28ca\u2b72\u2b7f\u2b2d\u2b60\u2b44\u2b5b\u2b02\u2b7a\u2b17\u2b67\u2b42\u2b6b\u2b0e\u2b61\u2b0a\u28af\u28eb\u2b47\u28d4\u28bd\u28f9\u2b71\u2b5d\u2b79\u2b3f\u2b58\u2b3a\u2899\u2b11\u2b27";
        var8_5 = "\u013c\u0128\u00108\u0014 <\f\b ".toCharArray();
        var9_6 = new String[var8_5.length];
        var13_10 = -1;
        ** GOTO lbl24
lbl7:
        // 1 sources

        while (true) {
            var3_14 = 0;
            var4_15 = 0;
            if (true) ** GOTO lbl67
            break;
        }
lbl11:
        // 1 sources

        while (true) {
            var1_2 = var0_1.length / 4;
            lIlllIll.llIl = new int[var1_2];
            ** continue;
            break;
        }
lbl15:
        // 1 sources

        while (true) {
            var14_11 = var7_4.substring(var11_8, var11_8 + var12_9).toCharArray();
            var15_12 = 0;
            if (true) ** GOTO lbl39
            break;
        }
        while (true) {
            block18: {
                block17: {
                    var9_6[var10_7] = new String(var14_11).intern();
                    var11_8 += var12_9;
                    if (++var10_7 < var8_5.length) break block17;
                    var13_10 = 0;
lbl24:
                    // 2 sources

                    var10_7 = 0;
                    var11_8 = 0;
                    var12_9 = '\u0000';
                    if (var13_10 == 0) break block18;
                }
                var12_9 = var8_5[var10_7];
                ** continue;
            }
            lIlllIll.lllI = var9_6;
            lIlllIll.llll = new Object[var9_6.length];
            var2_3 = 1749233634;
            var0_1 = "~\u00b6>X\n\u00d9\u00bd\u00fe\u0086k1\u00be\u00b8z\u00f3\u001f\u00f5\u00e6h\u0007\u0004U\u00ebmz.P\u001b\u00e5\u009c~\u00c9\"\u0087\u00ef\u00dc*\u00b2\u008d6Q@\u0011|N\u00bc\u00de)q#\u00dca\u00d7\u00cd\u00ae{\r\u00a2\u008fk\u00bf\u0011-\u001fJ\u00bc\u00d3\u00c2am\u00bc\u00da\u0016\u00d8\u00f0sqZ\b8\u00ac\u00b9\u00cer\u00fbm\u00b2\u0013\u00b89\u0098Z5[0\u00b2wr J\u00c6Wg\u00ack\u008b\u0082\u00ad\\\u00ebb}\u00e6g;\u00d7\u0011\u00d5\u00da\u008bTD\u001e\u00e0\u00f8{\u00e9\u0012)\"*\u00993&\u0096\u0090\u00cd1\u00f3]C\u0094\u0014u\u00d1\u0005ei\u00f0w\u0012\u00a1\u00ecL\u00b8\u00e3\u0080y\u00d2\u00a1\u009e\u00aa\u009c\u0011\u0089\u0099\u009e\u00ac\u00f3F\u00a8\u0006\u00f9g\u009fF".getBytes("ISO-8859-1");
            ** continue;
            break;
        }
        while (true) {
            if (var15_12 >= var14_11.length) ** continue;
lbl39:
            // 2 sources

            switch (var15_12 % 6) {
                case 5: {
                    v0 = 95;
                    break;
                }
                case 4: {
                    v0 = 37;
                    break;
                }
                case 3: {
                    v0 = 71;
                    break;
                }
                case 2: {
                    v0 = 27;
                    break;
                }
                default: {
                    v0 = 121;
                    break;
                }
                case 1: {
                    v0 = 78;
                    break;
                }
            }
            var16_13 = v0;
            v1 = var15_12++;
            var14_11[v1] = (char)(var14_11[v1] ^ var16_13 ^ var6);
        }
        while (true) {
            lIlllIll.llIl[var4_15] = var5_16 ^= var2_3;
            var3_14 += 4;
            if (++var4_15 >= var1_2) {
                return;
            }
lbl67:
            // 3 sources

            var5_16 = (var0_1[var3_14] & 255) << 24 | (var0_1[var3_14 + 1] & 255) << 16 | (var0_1[var3_14 + 2] & 255) << 8 | var0_1[var3_14 + 3] & 255;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlI(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xBBA;
        char[] cArray = lllI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIlllIll.llll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1DEA;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 17987;
            n6 -= 15046;
            n6 += 54014;
            n6 += 15904;
            n6 ^= 0xF07D;
            n6 ^= 0x4466;
            n6 += 486;
            n6 ^= 0x840C;
            n6 += 29006;
            cArray[n5] = (char)((n6 ^= 0x9236) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

