/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIllIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
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
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import org.joml.Matrix4f;

@Environment(value=EnvType.CLIENT)
final class IIIIllIIl
extends Record {
    private final Camera I;
    private final Matrix4f l;
    private final GameRenderer II;
    private final Matrix4f Il;

    public GameRenderer I() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIIllIIl.class, "camera;gameRenderer;viewMatrix;projectionMatrix", "I", "II", "l", "Il"}, this);
    }

    public Camera l() {
        return this.I;
    }

    public Matrix4f II() {
        return this.Il;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIIllIIl.class, "camera;gameRenderer;viewMatrix;projectionMatrix", "I", "II", "l", "Il"}, this, object);
    }

    private IIIIllIIl(Camera camera, GameRenderer gameRenderer, Matrix4f matrix4f, Matrix4f matrix4f2) {
        this.I = camera;
        this.II = gameRenderer;
        this.l = matrix4f;
        this.Il = matrix4f2;
    }

    public Matrix4f Il() {
        return this.l;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIIllIIl.class, "camera;gameRenderer;viewMatrix;projectionMatrix", "I", "II", "l", "Il"}, this);
    }
}

