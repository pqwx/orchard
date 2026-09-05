/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlI
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
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.GameRenderer
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import orchard.internal.IIIIllIIl;
import orchard.internal.IlIlIIlI;
import orchard.internal.IlIlIIllI;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

@Environment(value=EnvType.CLIENT)
public final class lIIlI {
    private static volatile IIIIllIIl I;
    public static final IlIlIIlI l;
    private static volatile IlIlIIllI II;

    private lIIlI() {
    }

    private static Matrix4f I(Matrix4f matrix4f) {
        return matrix4f == null ? null : new Matrix4f((Matrix4fc)matrix4f);
    }

    private static <T> T l(T t, T t2) {
        return t != null ? t : t2;
    }

    static {
        l = new IlIlIIlI();
        II = new IlIlIIllI(null, null, null, null, null);
        I = new IIIIllIIl(null, null, null, null);
    }

    public static void II(Camera camera, GameRenderer gameRenderer, Matrix4f matrix4f, Matrix4f matrix4f2) {
        I = new IIIIllIIl(camera, gameRenderer, lIIlI.I(matrix4f), lIIlI.I(matrix4f2));
    }
}

