/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIlIlI
 * Module         : Freecam  [RENDER]
 * Description    : Lets the camera fly independently around the world.   (client's own text)
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.OtherClientPlayerEntity
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;

@Environment(value=EnvType.CLIENT)
public final class Freecam
extends ModuleBase {
    private float I;
    private static String[] l;
    private final lIlIIlI II = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Speed"), 1.0, 0.1, 10.0, 0.1));
    private OtherClientPlayerEntity Il;
    private Vec3d lI;
    private float ll;
    private Entity III;
    private float IIl;
    private Vec3d IlI;
    private float Ill;
    private static final int[] lII;
    private static final String[] lIl;
    private static final Object[] llI;

    private Vec3d I(double d, double d2, double d3, float f) {
        double d4 = Math.toRadians(f);
        double d5 = Math.sin(d4);
        double d6 = Math.cos(d4);
        double d7 = d * -d5 + d2 * d6;
        double d8 = d * d6 + d2 * d5;
        return new Vec3d(d7, d3, d8);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || minecraftClient.player == null) {
            this.II(minecraftClient);
            this.lI = null;
            this.IlI = null;
            return;
        }
        if (this.lI != null && this.Il != null) {
            double d;
            double d2;
            this.IlI = this.lI;
            this.Ill = this.ll;
            this.IIl = this.I;
            this.ll = this.Il.getYaw();
            this.I = this.Il.getPitch();
            double d3 = this.lIl(minecraftClient, minecraftClient.options.forwardKey, minecraftClient.options.backKey);
            Vec3d vec3d = this.I(d3, d2 = this.lIl(minecraftClient, minecraftClient.options.leftKey, minecraftClient.options.rightKey), d = this.lIl(minecraftClient, minecraftClient.options.jumpKey, minecraftClient.options.sneakKey), this.ll);
            if (vec3d.lengthSquared() <= 1.0E-6) {
                return;
            }
            double d4 = (Double)this.II.lIl() * (lIIllllI.IIllIII(minecraftClient, minecraftClient.options.sprintKey) ? 0.42 : 0.18);
            this.lI = this.lI.add(vec3d.normalize().multiply(d4));
            this.Il.setPosition(this.lI.x, this.lI.y, this.lI.z);
            return;
        }
        this.ll();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean l(Entity entity) {
        if (!this.IIIlIIl()) return false;
        if (entity == null) return false;
        if (this.lI == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.II(minecraftClient);
        if (minecraftClient != null && minecraftClient.player != null) {
            this.IlI = this.lI = minecraftClient.player.getCameraPosVec(1.0f);
            this.Ill = this.ll = minecraftClient.player.getYaw();
            this.IIl = this.I = minecraftClient.player.getPitch();
            this.III = lIIllllI.lllll(minecraftClient);
            this.Il = new OtherClientPlayerEntity(minecraftClient.world, minecraftClient.player.getGameProfile());
            this.Il.copyPositionAndRotation((Entity)minecraftClient.player);
            this.Il.noClip = true;
            lIIllllI.IlIlIIl(minecraftClient, (Entity)this.Il);
            return;
        }
        this.lI = null;
        this.IlI = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void II(MinecraftClient minecraftClient) {
        if (minecraftClient != null && this.Il != null && lIIllllI.lllll(minecraftClient) == this.Il) {
            ClientPlayerEntity clientPlayerEntity = this.III != null ? this.III : minecraftClient.player;
            lIIllllI.IlIlIIl(minecraftClient, (Entity)clientPlayerEntity);
        }
        this.Il = null;
        this.III = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Vec3d lI(float f) {
        if (this.lI == null) {
            return Vec3d.ZERO;
        }
        if (this.IlI != null) return this.IlI.lerp(this.lI, (double)MathHelper.clamp((float)f, (float)0.0f, (float)1.0f));
        return this.lI;
    }

    private static String IIl(char[] cArray, long l2, int n) {
        int n2 = 0x1BB4D870 ^ n;
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

    public void IlI(float f, float f2, float f3, float f4) {
        if (!this.IIIlIIl() || this.Il == null) {
            return;
        }
        float f5 = MathHelper.wrapDegrees((float)(f3 - f));
        float f6 = f4 - f2;
        this.Ill = this.ll;
        this.IIl = this.I;
        this.ll += f5;
        this.I = MathHelper.clamp((float)(this.I + f6), (float)-90.0f, (float)90.0f);
        this.Il.setYaw(this.ll);
        this.Il.setPitch(this.I);
    }

    public float lII(float f) {
        return MathHelper.lerpAngleDegrees((float)MathHelper.clamp((float)f, (float)0.0f, (float)1.0f), (float)this.Ill, (float)this.ll);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 31075;
        String string = "\u81f5\u4ed1\u9654\u0435\ubf0f\ub021\ud213\u961e\u1785\u8b80\uad7c\u23d7\ua633\ua12b\ufeee\u7a1e\u5648\u8258\uf5a1\uc226\u3448\ue1cd\ucd6f\ua99f\uea1e\u4ac9\ua922\u72bc\u7a30\ufc28\uefb5\u936b\u6e8b\u035e\u7ca8\ub2ab\u044c\uc48e\ufacb\u80d0\u430b\udddd\ufa0d\u1630\u1db1\u457b\ud120\u6d96\ue892\u8ace\u63f5\u95bc\u6f58\uf0bc\u56bd\u3ac5\uee7b\uf4e1\u953d\ud4df\u99fe\uf2c6\u57e0\u9d21\u6927\uef8b\u5397\ua9aa\ueb11\u4446\ufb3d\u4e47\u337b\u5bdc\ud94f\u6de3\u3a88\u56ca\u78a8\u3a75\ub794\u22cb\u0b32\u940c\uaf5c\u2942\u049f\u183a";
        char[] cArray = "\u796b\u7927\u796f".toCharArray();
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
        lIl = stringArray;
        llI = new Object[stringArray.length];
        int n6 = -847239882;
        byte[] byArray = "\u0084\u000f\u0098\u0086\u00cer\u001a\u0092 \u00c1f\u00e0&DMw4\u00a3(e".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        lII = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            Freecam.lII[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        l = new String[3];
        Freecam.llI();
    }

    @Override
    public void llll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.II(minecraftClient);
        this.lI = null;
        this.IlI = null;
    }

    public Freecam() {
        super(StringFactory.IIII("Freecam"), Category.l, StringFactory.IIII("Lets the camera fly independently around the world."));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double lIl(MinecraftClient minecraftClient, KeyBinding keyBinding, KeyBinding keyBinding2) {
        double d;
        if (lIIllllI.IIllIII(minecraftClient, keyBinding)) {
            d = 1.0;
            return d - (lIIllllI.IIllIII(minecraftClient, keyBinding2) ? 1.0 : 0.0);
        }
        d = 0.0;
        return d - (lIIllllI.IIllIII(minecraftClient, keyBinding2) ? 1.0 : 0.0);
    }

    private static void llI() {
        Freecam.l[0] = Freecam.IIl(Freecam.IIlI('\u2b7f', (short)58406, -876459721).toCharArray(), 18375L, 1202666912);
        Freecam.l[1] = Freecam.IIl(Freecam.IIlI('\u2b7e', (short)23168, -1598721862).toCharArray(), 66937L, -513400390);
        Freecam.l[2] = Freecam.IIl(Freecam.IIlI('\u2b7d', (short)12254, 1244796459).toCharArray(), 56938L, -26020922);
    }

    public float lll(float f) {
        return MathHelper.lerp((float)MathHelper.clamp((float)f, (float)0.0f, (float)1.0f), (float)this.IIl, (float)this.I);
    }

    private static int IIII(int n, int n2) {
        return lII[n ^ 0x97C0AB7] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlI(char c, short s, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x2B7F;
        char[] cArray = lIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Freecam.llI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3E4F;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 26268;
            n6 -= 13909;
            n6 += 62974;
            n6 += 51688;
            n6 -= 28149;
            cArray[n5] = (char)((n6 ^= 0x6DAC) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

