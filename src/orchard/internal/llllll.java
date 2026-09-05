/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllll
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
 *  net.minecraft.client.render.Frustum
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.util.math.MatrixStack
 *  org.joml.Matrix4f
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import orchard.internal.II;
import org.joml.Matrix4f;

@Environment(value=EnvType.CLIENT)
final class llllll
implements II {
    private VertexConsumerProvider I;
    private II l;

    @Override
    public VertexConsumerProvider I() {
        return this.I;
    }

    @Override
    public Matrix4f l() {
        return this.l.l();
    }

    private void II() {
        this.l = null;
        this.I = null;
    }

    @Override
    public MatrixStack Il() {
        return this.l.Il();
    }

    @Override
    public GameRenderer lI() {
        return this.l.lI();
    }

    private II ll(II iI, VertexConsumerProvider vertexConsumerProvider) {
        if (iI != null) {
            this.l = iI;
            this.I = vertexConsumerProvider;
            return this;
        }
        return null;
    }

    @Override
    public Matrix4f III() {
        return this.l.III();
    }

    private llllll() {
    }

    @Override
    public Camera IIl() {
        return this.l.IIl();
    }

    @Override
    public Frustum IlI() {
        return this.l.IlI();
    }
}

