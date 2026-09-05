/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIllI
 * Purpose not identified - name is the original obfuscated one.
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
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.BufferAllocator
 */
package orchard.internal;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;

@Environment(value=EnvType.CLIENT)
final class IIIIIIllI
implements VertexConsumerProvider {
    private BufferAllocator I;
    private boolean l;
    private final SequencedMap<RenderLayer, BufferAllocator> II = new LinkedHashMap<RenderLayer, BufferAllocator>();
    private VertexConsumerProvider.Immediate Il;
    private static final int[] lI;

    private void I() {
        this.l = false;
    }

    private boolean l() {
        return this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void II() {
        this.l = false;
        this.Il = null;
        if (this.I != null) {
            this.I.close();
            this.I = null;
        }
        this.II.values().forEach(BufferAllocator::close);
        this.II.clear();
    }

    private void Il() {
        if (!this.l || this.Il == null) {
            return;
        }
        try {
            this.Il.draw();
            this.I.clear();
            this.II.values().forEach(BufferAllocator::clear);
        }
        catch (Throwable throwable) {
            this.II();
            throw throwable;
        }
        finally {
            this.l = false;
        }
    }

    private IIIIIIllI() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public VertexConsumer getBuffer(RenderLayer renderLayer2) {
        if (this.Il == null) {
            this.I = new BufferAllocator(256);
            this.Il = VertexConsumerProvider.immediate(this.II, (BufferAllocator)this.I);
        }
        this.II.computeIfAbsent(renderLayer2, renderLayer -> new BufferAllocator(Math.max(256, renderLayer.getExpectedBufferSize())));
        this.l = true;
        return this.Il.getBuffer(renderLayer2);
    }

    private void ll() {
        if (this.l) {
            this.II();
        }
    }

    private static int III(int n, int n2) {
        return lI[n ^ 0xF6B4EDBA] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -860882444;
        byte[] byArray = "\u0081\u00f5\u00a7\u0090\u00f0\u00d6?~".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        lI = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIIIIIllI.lI[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

