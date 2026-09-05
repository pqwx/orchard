/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlllI
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.entity.state.PlayerEntityRenderState
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import orchard.internal.IllIII;
import orchard.internal.lIIIIIl;
import orchard.internal.lIIlIIII;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIlll;
import orchard.internal.lllIIIl;
import orchard.mixin.ClientPlayerEntityMixin2;

@Environment(value=EnvType.CLIENT)
public final class IlIlllI {
    private static float I;
    private static boolean l;
    private static boolean II;
    private static final IllIII Il;
    private static float lI;
    public static final int ll = 100;
    private static int III;
    private static int IIl;
    private static boolean IlI;
    private static boolean Ill;
    private static int lII;
    private static int lIl;
    private static final double llI = 0.035;
    public static final int lll = 250;
    private static int IIII;
    private static boolean IIIl;
    private static int IIlI;
    private static float IIll;
    public static final int IlII = 150;
    private static float IlIl;
    private static final float IllI = 176.0f;
    private static int Illl;
    private static float lIII;
    private static boolean lIIl;
    private static float lIlI;
    private static boolean lIll;
    private static final double llII = 0.1;
    private static int llIl;
    public static final int lllI = 300;
    private static float llll;
    private static IllIII IIIII;
    private static float IIIIl;
    private static float IIIlI;
    private static boolean IIIll;
    private static float IIlII;
    private static boolean IIlIl;
    private static long IIllI;
    public static final int IIlll = 175;
    private static boolean IlIII;
    private static int IlIIl;
    private static boolean IlIlI;
    private static float IlIll;
    private static final int IllII = 3;
    private static final float IllIl = 179.0f;
    public static final int IlllI = 200;
    public static final int Illll = 400;
    private static boolean lIIII;
    private static boolean lIIIl;
    private static float lIIlI;
    private static float lIIll;
    private static boolean lIlII;
    private static int lIlIl;
    public static final int lIllI = 50;
    private static float lIlll;
    public static final int llIII = 300;
    private static final double llIIl = 0.095;
    private static float llIlI;
    private static float llIll;
    private static final int[] lllII;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int I() {
        if (!lIll) return Integer.MIN_VALUE;
        int n = llIl;
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void l() {
        lIll = false;
        IIIII = null;
        lIlII = false;
        Ill = false;
        lIIl = false;
        IlIII = false;
        l = false;
        IlIlI = false;
        lIIII = false;
        IIlIl = false;
        lIIIl = false;
        IlI = false;
        II = false;
        IIII = Integer.MIN_VALUE;
        lII = Integer.MIN_VALUE;
        lIlIl = Integer.MIN_VALUE;
        lIlI = Float.NaN;
        IIIIl = Float.NaN;
        IIl = Integer.MIN_VALUE;
        IlIIl = 0;
        IIIl = false;
        IIIll = false;
        lIIll = 0.0f;
        lIlll = 0.0f;
        IlIl = 0.0f;
        llIll = 0.0f;
        llll = 0.0f;
        III = Integer.MIN_VALUE;
    }

    public static boolean II(MinecraftClient minecraftClient, int n, float f, float f2) {
        return IlIlllI.IlII(minecraftClient, n, f, f2, () -> true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean Il(MinecraftClient minecraftClient, int n, int n2) {
        if (!IlIlllI.IIlIIl(minecraftClient)) {
            return false;
        }
        Entity entity = minecraftClient.world.getEntityById(n2);
        if (entity == null) return false;
        if (!IlIlllI.Illl(minecraftClient, n, entity)) return false;
        return true;
    }

    public static boolean lI(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        return IlIlllI.III(minecraftClient, blockHitResult, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 1856728044;
        byte[] byArray = "\u00e2x\u0097\r\u00d0/\u00c9mD;\u0000\u001c\u00d4\u0000\u009e\u00b4+#w\u00f0\u00ac\u00b7\u008cP8\u0005K0\u0092\u009d/a\u00b8\u0093|\u0093uq\u00d4-\u00a9\u00ed\u0019D\u00c0,\to\u00c7\u00909\u00e8<rU6\u00bc\u00d1/\u0082\u0091\u00f0@]\u00e53T\t\u00ff\u009b(\u0095^sh\u00d7\u00bc1\u00e2\u00e6\u00b3\u0012\u0011\u0088Z\u00d2+\u0095\u00e7\u00aa\u0092\u007f".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        lllII = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IlIlllI.lllII[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
        IIl = Integer.MIN_VALUE;
        IIlI = Integer.MIN_VALUE;
        IIII = Integer.MIN_VALUE;
        lIlIl = Integer.MIN_VALUE;
        lII = Integer.MIN_VALUE;
        lIl = -1;
        Illl = 0;
        III = Integer.MIN_VALUE;
        Il = () -> true;
    }

    public static boolean ll(MinecraftClient minecraftClient) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean III(MinecraftClient minecraftClient, BlockHitResult blockHitResult, boolean bl) {
        if (minecraftClient == null) return false;
        if (blockHitResult == null) return false;
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof BlockHitResult)) return false;
        BlockHitResult blockHitResult2 = (BlockHitResult)hitResult;
        if (blockHitResult2.getType() != HitResult.Type.BLOCK) return false;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        if (!blockHitResult2.getBlockPos().equals((Object)blockHitResult.getBlockPos())) {
            return false;
        }
        if (!bl) return true;
        if (blockHitResult2.getSide() == blockHitResult.getSide()) return true;
        return false;
    }

    public static boolean IIl(MinecraftClient minecraftClient, int n, float f, float f2, IllIII illIII) {
        return IlIlllI.IIII(minecraftClient, n, f, f2, illIII);
    }

    public static boolean IlI(MinecraftClient minecraftClient, int n, float f, float f2, IllIII illIII) {
        if (!IlIlllI.IlIIlI()) {
            return false;
        }
        return IlIlllI.IlIIll(minecraftClient, n, f, f2, illIII, false, true, true, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean Ill(MinecraftClient minecraftClient, int n, Vec3d vec3d, IllIII illIII) {
        if (!IlIlllI.IIlIIl(minecraftClient)) return false;
        if (vec3d != null) {
            float[] fArray = IlIlllI.IIlIlI(minecraftClient.player.getEyePos(), vec3d);
            return IlIlllI.IlIII(minecraftClient, n, fArray[0], fArray[1], illIII);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lII(Packet<?> packet) {
        if (!(packet instanceof PlayerMoveC2SPacket)) return;
        PlayerMoveC2SPacket playerMoveC2SPacket = (PlayerMoveC2SPacket)packet;
        if (!playerMoveC2SPacket.changesLook()) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!IlIlllI.IlIlI(minecraftClient)) {
            return;
        }
        float[] fArray = IlIlllI.IllI(minecraftClient);
        float f = fArray[0];
        float f2 = fArray[1];
        lIIll = playerMoveC2SPacket.getYaw(f);
        lIlll = MathHelper.clamp((float)playerMoveC2SPacket.getPitch(f2), (float)-90.0f, (float)90.0f);
        IIIll = Float.isFinite(lIIll) && Float.isFinite(lIlll);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lIl() {
        if (lIll) return true;
        if (!lIIIl) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean llI(MinecraftClient minecraftClient, PlayerEntityRenderState playerEntityRenderState, float f) {
        if (II && minecraftClient.player.age <= IIII) {
            float f2 = MathHelper.clamp((float)f, (float)0.0f, (float)1.0f);
            float f3 = playerEntityRenderState.bodyYaw;
            float f4 = playerEntityRenderState.relativeHeadYaw;
            float f5 = playerEntityRenderState.pitch;
            playerEntityRenderState.bodyYaw = MathHelper.lerpAngleDegrees((float)f2, (float)IIlII, (float)f3);
            playerEntityRenderState.relativeHeadYaw = MathHelper.lerpAngleDegrees((float)f2, (float)0.0f, (float)f4);
            playerEntityRenderState.pitch = MathHelper.lerp((float)f2, (float)IlIll, (float)f5);
            return true;
        }
        II = false;
        return false;
    }

    public static boolean lll(MinecraftClient minecraftClient, int n, float f, float f2, IllIII illIII) {
        return IlIlllI.IlIIll(minecraftClient, n, f, f2, illIII, true, true, false, false);
    }

    private static boolean IIII(MinecraftClient minecraftClient, int n, float f, float f2, IllIII illIII) {
        return IlIlllI.IlIIll(minecraftClient, n, f, f2, illIII, false, true, false, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static lIIlIIII IIIl(MinecraftClient minecraftClient, float f, float f2, boolean bl) {
        if (minecraftClient == null) return new lIIlIIII(f, f2);
        if (minecraftClient.options == null) return new lIIlIIII(f, f2);
        if (!Float.isFinite(f)) return new lIIlIIII(f, f2);
        if (!Float.isFinite(f2)) {
            return new lIIlIIII(f, f2);
        }
        float f3 = (float)((Double)minecraftClient.options.getMouseSensitivity().getValue()).doubleValue() * 0.6f + 0.2f;
        float f4 = f3 * f3 * f3 * 1.2f;
        if (!Float.isFinite(f4)) return new lIIlIIII(f, f2);
        if (!(f4 <= 0.0f)) {
            float f5 = IlIlllI.IllII(f, f4, bl);
            float f6 = IlIlllI.IllII(f2, f4, bl);
            return new lIIlIIII(f5, f6);
        }
        return new lIIlIIII(f, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIlI(MinecraftClient minecraftClient, BlockHitResult blockHitResult, boolean bl) {
        if (!IlIlllI.IlIlI(minecraftClient)) return false;
        if (!IIIll) return false;
        if (blockHitResult == null) return false;
        if (minecraftClient.world == null) return false;
        Vec3d vec3d = minecraftClient.player.getEyePos();
        double d = Math.max(0.0, minecraftClient.player.getBlockInteractionRange() - 0.05);
        Vec3d vec3d2 = vec3d.add(IlIlllI.lllIl(lIIll, lIlll).multiply(d));
        BlockHitResult blockHitResult2 = lIIllllI.IIIIllI(minecraftClient, (Entity)minecraftClient.player, vec3d, vec3d2);
        if (blockHitResult2 == null) return false;
        if (blockHitResult2.getType() != HitResult.Type.BLOCK) return false;
        if (!blockHitResult2.getBlockPos().equals((Object)blockHitResult.getBlockPos())) return false;
        if (!bl) return true;
        if (blockHitResult2.getSide() != blockHitResult.getSide()) return false;
        return true;
    }

    public static boolean IIll() {
        return lIll || lIIIl;
    }

    public static boolean IlII(MinecraftClient minecraftClient, int n, float f, float f2, IllIII illIII) {
        return IlIlllI.IlIIll(minecraftClient, n, f, f2, illIII, false, true, false, false);
    }

    public static float IlIl() {
        return IIlII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float[] IllI(MinecraftClient minecraftClient) {
        if (IIIll && Float.isFinite(lIIll) && Float.isFinite(lIlll)) {
            return new float[]{lIIll, lIlll};
        }
        if (minecraftClient != null && minecraftClient.player != null) {
            return new float[]{minecraftClient.player.getYaw(), MathHelper.clamp((float)minecraftClient.player.getPitch(), (float)-90.0f, (float)90.0f)};
        }
        return new float[]{0.0f, 0.0f};
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean Illl(MinecraftClient minecraftClient, int n, Entity entity) {
        if (!IlIlllI.IlIlI(minecraftClient)) return false;
        if (lIll && n < llIl) {
            return false;
        }
        int n2 = 31 * n + (entity == null ? -1 : entity.getId());
        lllIIIl lllIIIl2 = IlIlllI.llIII(minecraftClient, entity, n2);
        if (lllIIIl2 == null) {
            return false;
        }
        IIIl = true;
        IIll = lllIIIl2.lI();
        IlIlllI.IIllIl(minecraftClient, lllIIIl2.III(), lllIIIl2.Il());
        return true;
    }

    public static boolean lIII(MinecraftClient minecraftClient, Entity entity, double d) {
        return IlIlllI.lllII(minecraftClient, entity, d);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lIIl(MinecraftClient minecraftClient, int n, IllIII illIII) {
        if (!IlIlllI.IIlIIl(minecraftClient)) {
            return false;
        }
        boolean bl = IlIlllI.IlIIll(minecraftClient, n, minecraftClient.player.getYaw(), minecraftClient.player.getPitch(), illIII, false, false, true, false);
        if (!bl) return bl;
        IlIlI = true;
        return bl;
    }

    private static double lIlI(double d) {
        double d2 = Math.floor(d);
        return MathHelper.clamp((double)d, (double)(d2 + 0.08), (double)(d2 + 0.92));
    }

    public static boolean lIll(MinecraftClient minecraftClient, int n, float f, float f2, IllIII illIII) {
        return IlIlllI.IlIIll(minecraftClient, n, f, f2, illIII, false, true, true, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void llII() {
        lIll = false;
        IIIII = null;
        lIlII = false;
        Ill = false;
        lIIl = false;
        IlIII = false;
        l = false;
        IlIlI = false;
        lIIII = false;
        IIIl = false;
        IIlIl = false;
    }

    private static void llIl() {
        IllIII illIII = IIIII;
        IIIII = null;
        if (illIII == null) {
            return;
        }
        lIIII = true;
        try {
            IlIlllI.lIIII(illIII);
        }
        catch (RuntimeException runtimeException) {
        }
        finally {
            lIIII = false;
        }
    }

    public static float[] lllI(MinecraftClient minecraftClient) {
        if (IlIlllI.IIlIIl(minecraftClient)) {
            float[] fArray = IlIlllI.IllI(minecraftClient);
            return new float[]{fArray[0], fArray[1]};
        }
        return null;
    }

    public static boolean llll(MinecraftClient minecraftClient, int n, BlockPos blockPos, IllIII illIII) {
        if (blockPos == null) {
            return false;
        }
        return IlIlllI.Ill(minecraftClient, n, Vec3d.ofCenter((Vec3i)blockPos), illIII);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float[] IIIII(MinecraftClient minecraftClient, float f, float f2, float f3, float f4) {
        float f5 = IlIlllI.IIlIl(minecraftClient);
        if (Float.isFinite(f5) && !(f5 <= 0.0f)) {
            float f6 = MathHelper.wrapDegrees((float)(f3 - f));
            float f7 = MathHelper.clamp((float)f4, (float)-90.0f, (float)90.0f) - f2;
            float f8 = f + (float)Math.round(f6 / f5) * f5;
            float f9 = f2 + (float)Math.round(f7 / f5) * f5;
            return new float[]{f + MathHelper.wrapDegrees((float)(f8 - f)), MathHelper.clamp((float)f9, (float)-90.0f, (float)90.0f)};
        }
        return new float[]{f3, MathHelper.clamp((float)f4, (float)-90.0f, (float)90.0f)};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float[] IIIIl(MinecraftClient minecraftClient, float f, float f2, float f3, float f4) {
        float f5 = IlIlllI.IIlIl(minecraftClient);
        if (Float.isFinite(f5) && !(f5 <= 0.0f)) {
            float f6 = MathHelper.wrapDegrees((float)(f3 - f)) + IlIl;
            float f7 = MathHelper.clamp((float)f4, (float)-90.0f, (float)90.0f) - f2 + llIll;
            int n = (int)(f6 / f5);
            int n2 = (int)(f7 / f5);
            float f8 = (float)n * f5;
            float f9 = (float)n2 * f5;
            IlIl = f6 - f8;
            llIll = f7 - f9;
            return new float[]{f + MathHelper.wrapDegrees((float)f8), MathHelper.clamp((float)(f2 + f9), (float)-90.0f, (float)90.0f)};
        }
        return new float[]{f + MathHelper.wrapDegrees((float)(f3 - f)), MathHelper.clamp((float)f4, (float)-90.0f, (float)90.0f)};
    }

    public static boolean IIIlI(MinecraftClient minecraftClient, PlayerEntityRenderState playerEntityRenderState, float f) {
        if (playerEntityRenderState != null && IlIlllI.IIlIIl(minecraftClient)) {
            IlIlllI.IIllI(minecraftClient, playerEntityRenderState, f);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float IIIll(MinecraftClient minecraftClient) {
        if (!IlIlllI.IIlIIl(minecraftClient)) return Float.NaN;
        if (IIIl) {
            IIIl = false;
            return IIll;
        }
        return Float.NaN;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIlII(MinecraftClient minecraftClient, Object object, int n, float f, float f2, IllIII illIII, lIlIlll lIlIlll2) {
        boolean bl = IlIlllI.IIllll(minecraftClient, n, f, f2, illIII);
        if (lIlIlll2 == null) {
            return bl;
        }
        lIlIlll2.I(bl);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float IIlIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return 0.0f;
        if (minecraftClient.options == null) {
            return 0.0f;
        }
        double d = (Double)minecraftClient.options.getMouseSensitivity().getValue();
        double d2 = d * 0.6 + 0.2;
        double d3 = d2 * d2 * d2 * 8.0 * 0.15;
        if (!Float.isFinite((float)d3)) {
            return 0.0f;
        }
        float f = (float)d3;
        return f;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIllI(MinecraftClient minecraftClient, PlayerEntityRenderState playerEntityRenderState, float f) {
        if (playerEntityRenderState == null) return false;
        if (!IlIlllI.IIlIIl(minecraftClient)) {
            return false;
        }
        if (minecraftClient.options.getPerspective().isFirstPerson()) {
            return false;
        }
        if (!IlIlllI.IlIIl(minecraftClient)) {
            return IlIlllI.llI(minecraftClient, playerEntityRenderState, f);
        }
        float f2 = minecraftClient.player.age == lIlIl ? MathHelper.clamp((float)f, (float)0.0f, (float)1.0f) : 1.0f;
        playerEntityRenderState.bodyYaw = MathHelper.lerpAngleDegrees((float)f2, (float)lIlI, (float)IIlII);
        playerEntityRenderState.relativeHeadYaw = 0.0f;
        playerEntityRenderState.pitch = MathHelper.lerp((float)f2, (float)IIIIl, (float)IlIll);
        return true;
    }

    private static boolean IIlll(MinecraftClient minecraftClient, int n) {
        return IlIlllI.IlIlI(minecraftClient);
    }

    public static boolean IlIII(MinecraftClient minecraftClient, int n, float f, float f2, IllIII illIII) {
        return IlIlllI.IlIIll(minecraftClient, n, f, f2, illIII, false, true, false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IlIIl(MinecraftClient minecraftClient) {
        if (!IlIlllI.IIlIIl(minecraftClient)) return false;
        if (!IlI) {
            return false;
        }
        if (minecraftClient.player.age <= lII) return true;
        IlI = false;
        II = true;
        IIII = minecraftClient.player.age;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IlIlI(MinecraftClient minecraftClient) {
        if (!IlIlllI.IIlIIl(minecraftClient)) {
            IIl = Integer.MIN_VALUE;
            IlIIl = 0;
            IlIlllI.llII();
            lIIIl = false;
            IlI = false;
            return false;
        }
        int n = System.identityHashCode(minecraftClient.player);
        if (IlIIl == n) return true;
        IlIIl = n;
        IIl = Integer.MIN_VALUE;
        IlIlllI.llII();
        lIIIl = false;
        IlI = false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float[] IlIll(MinecraftClient minecraftClient, Vec3d vec3d) {
        if (!IlIlllI.IIlIIl(minecraftClient)) return null;
        if (vec3d == null) return null;
        float[] fArray = IlIlllI.IIlIlI(minecraftClient.player.getEyePos(), vec3d);
        return IlIlllI.IIIII(minecraftClient, minecraftClient.player.getYaw(), minecraftClient.player.getPitch(), fArray[0], fArray[1]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float IllII(float f, float f2, boolean bl) {
        if (!bl) return (float)Math.round(f / f2) * f2;
        if (!(Math.abs(f) > 0.0f)) return (float)Math.round(f / f2) * f2;
        if (!(Math.abs(f) < f2)) return (float)Math.round(f / f2) * f2;
        return 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IllIl(MinecraftClient minecraftClient) {
        if (l) return;
        if (!Float.isFinite(lIII)) return;
        if (Float.isFinite(I)) {
            float[] fArray = IlIlllI.IllI(minecraftClient);
            float[] fArray2 = IlIlllI.IIIIl(minecraftClient, fArray[0], fArray[1], IlIlllI.IIlIll(lIII, fArray[0]), I);
            lIII = fArray2[0];
            I = fArray2[1];
            l = true;
            return;
        }
    }

    public static boolean IlllI(MinecraftClient minecraftClient, int n, Entity entity, IllIII illIII) {
        if (entity == null) {
            return false;
        }
        return IlIlllI.Ill(minecraftClient, n, entity.getEyePos(), illIII);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Illll() {
        if (!lIll) return false;
        if (!Ill) return false;
        return true;
    }

    private static boolean lIIII(IllIII illIII) {
        lIIllllI.IIIIlI();
        try {
            boolean bl = illIII.run();
            return bl;
        }
        finally {
            lIIllllI.llll();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIIIl(MinecraftClient minecraftClient) {
        if (!lIIIl) {
            return;
        }
        if (IlIlllI.IIlIIl(minecraftClient)) {
            IlIlllI.lIlll(minecraftClient, lI, IIIlI);
        }
        lIIIl = false;
        if (lIIl && !IlIII && IlIlllI.IIlIIl(minecraftClient)) {
            IlIII = true;
            IIlI = minecraftClient.player.age + 1;
            l = false;
            IIlIl = false;
            return;
        }
        IlIlllI.llII();
    }

    /*
     * Enabled aggressive block sorting
     */
    static float lIIll(float f, int n) {
        float f2 = IlIlllI.lIlIl(f);
        if (!Float.isFinite(f2)) {
            return f2;
        }
        if (n != III) {
            III = n;
            llll = 0.0f;
        }
        float f3 = Math.abs(MathHelper.wrapDegrees((float)f2));
        if (llll != 0.0f) {
            if (f3 >= 176.0f) {
                return IlIlllI.llIll(f2, llll);
            }
            llll = 0.0f;
        }
        if (!(f3 >= 179.0f)) return f2;
        llll = f2 < 0.0f ? -1.0f : 1.0f;
        return IlIlllI.llIll(f2, llll);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lIlII(MinecraftClient minecraftClient) {
        int n;
        if (!lIll) return false;
        if (!Ill) return false;
        if (IlIlllI.IIlIIl(minecraftClient)) {
            n = minecraftClient.player.age;
            if (n < IIlI) {
                return false;
            }
        } else {
            return false;
        }
        if (IIlIl) {
            IlIlllI.lIlll(minecraftClient, llIlI, lIIlI);
        }
        if (n > IIlI) {
            IlIlllI.llII();
            return false;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (!IIlIl) {
            llIlI = clientPlayerEntity.getYaw();
            lIIlI = clientPlayerEntity.getPitch();
            IIlIl = true;
        }
        IlIlllI.IllIl(minecraftClient);
        float[] fArray = IlIlllI.IIIlll(minecraftClient, lIII, I);
        if (fArray != null) {
            lIII = fArray[0];
            I = fArray[1];
        }
        clientPlayerEntity.setYaw(lIII);
        clientPlayerEntity.setPitch(I);
        clientPlayerEntity.renderYaw = llIlI;
        clientPlayerEntity.lastRenderYaw = llIlI;
        clientPlayerEntity.renderPitch = lIIlI;
        clientPlayerEntity.lastRenderPitch = lIIlI;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static float lIlIl(float f) {
        if (!Float.isFinite(f)) {
            return f;
        }
        float f2 = MathHelper.wrapDegrees((float)f);
        float f3 = Math.abs(f);
        if (!(f3 >= 176.0f) || !(f3 <= 184.0f)) {
            if (!(Math.abs(f2) >= 179.999f)) return f2;
            if (f == 0.0f) return f2;
            return Math.copySign(Math.abs(f2), f);
        }
        return f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lIllI(MinecraftClient minecraftClient, Entity entity, float f, float f2, Vec3d vec3d) {
        if (!IlIlllI.IIlIIl(minecraftClient)) return false;
        if (entity == null) return false;
        if (vec3d == null) {
            return false;
        }
        Vec3d vec3d2 = minecraftClient.player.getEyePos();
        double d = Math.max(vec3d2.distanceTo(vec3d) + 0.25, 0.25);
        Vec3d vec3d3 = vec3d2.add(IlIlllI.lllIl(f, f2).multiply(d));
        return entity.getBoundingBox().expand(0.1).raycast(vec3d2, vec3d3).isPresent();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void lIlll(MinecraftClient minecraftClient, float f, float f2) {
        if (!IlIlllI.IIlIIl(minecraftClient)) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        float[] fArray = IlIlllI.IIIlll(minecraftClient, f, f2);
        if (fArray != null) {
            f = fArray[0];
            f2 = fArray[1];
            clientPlayerEntity.setYaw(f);
            clientPlayerEntity.setPitch(f2);
            clientPlayerEntity.renderYaw = f;
            clientPlayerEntity.lastRenderYaw = f;
            clientPlayerEntity.renderPitch = f2;
            clientPlayerEntity.lastRenderPitch = f2;
            lIIllllI.IIlIIll(minecraftClient, f);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static lllIIIl llIII(MinecraftClient minecraftClient, Entity entity, int n) {
        if (!IlIlllI.IIlIIl(minecraftClient)) return null;
        if (entity == null) return null;
        if (entity == minecraftClient.player) return null;
        if (!entity.isAlive()) return null;
        if (!entity.isRemoved()) {
            lllIIIl lllIIIl2;
            float f;
            float f2 = minecraftClient.player.getYaw();
            lIIIIIl lIIIIIl2 = IlIlllI.IIIIll(minecraftClient, entity, f2, f = MathHelper.clamp((float)minecraftClient.player.getPitch(), (float)-90.0f, (float)90.0f), 0.1);
            if (lIIIIIl2 == null) {
                return null;
            }
            boolean bl = IlIlllI.lIllI(minecraftClient, entity, lIIIIIl2.l(), lIIIIIl2.I(), lIIIIIl2.II());
            float f3 = IlIlllI.lIIll(lIIIIIl2.lI(), n);
            lIIlIIII lIIlIIII2 = IlIlllI.IIIl(minecraftClient, f3, lIIIIIl2.Il(), bl);
            float f4 = IlIlllI.IIlIll(f2 + lIIlIIII2.l(), f2);
            float f5 = MathHelper.clamp((float)(f + lIIlIIII2.I()), (float)-90.0f, (float)90.0f);
            lllIIIl2(lIIIIIl2.II(), f4, f5, IlIlllI.lIlIl(f4 - f2), f5 - f, lIIIIIl2.lI(), lIIIIIl2.Il());
            return lllIIIl2;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void llIIl(MinecraftClient minecraftClient) {
        if (lIIIl) {
            if (IlIlllI.IIlIIl(minecraftClient)) {
                IlIlllI.lIlll(minecraftClient, lI, IIIlI);
            }
            lIIIl = false;
        }
        if (!lIll) {
            return;
        }
        if (!IlIlllI.IIlIIl(minecraftClient)) {
            IlIlllI.llII();
            return;
        }
        int n = minecraftClient.player.age;
        if (n >= IIlI) {
            if (n > IIlI) {
                if (IIlIl) {
                    IlIlllI.lIlll(minecraftClient, llIlI, lIIlI);
                }
                IlIlllI.llII();
                return;
            }
            if (IlIlI) {
                IlIlllI.llIl();
                IlIlllI.llII();
                return;
            }
        } else {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (!IIlIl) {
            lI = clientPlayerEntity.getYaw();
            IIIlI = clientPlayerEntity.getPitch();
        } else {
            lI = llIlI;
            IIIlI = lIIlI;
        }
        IlIlllI.IllIl(minecraftClient);
        clientPlayerEntity.setYaw(lIII);
        clientPlayerEntity.setPitch(I);
        clientPlayerEntity.renderYaw = lI;
        clientPlayerEntity.lastRenderYaw = lI;
        clientPlayerEntity.renderPitch = IIIlI;
        clientPlayerEntity.lastRenderPitch = IIIlI;
        IlIlllI.IIllIl(minecraftClient, lIII, I);
        if (lIlII && clientPlayerEntity instanceof ClientPlayerEntityMixin2) {
            ClientPlayerEntityMixin2 clientPlayerEntityMixin2 = (ClientPlayerEntityMixin2)clientPlayerEntity;
            clientPlayerEntityMixin2.virel$setLastXClient(clientPlayerEntity.getX());
            clientPlayerEntityMixin2.virel$setLastYClient(clientPlayerEntity.getY());
            clientPlayerEntityMixin2.virel$setLastZClient(clientPlayerEntity.getZ());
            clientPlayerEntityMixin2.virel$setTicksSinceLastPositionPacketSent(0);
        }
        if (!lIIl || IlIII) {
            IlIlllI.llIl();
        }
        lIIIl = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean llIlI(MinecraftClient minecraftClient, int n, Vec3d vec3d, IllIII illIII) {
        if (!IlIlllI.IIlIIl(minecraftClient)) return false;
        if (vec3d == null) {
            return false;
        }
        if (IlIlllI.IlIIlI()) {
            Vec3d vec3d2 = IlIlllI.IIIIIl(vec3d);
            float[] fArray = IlIlllI.IIlIlI(minecraftClient.player.getEyePos(), vec3d2);
            return IlIlllI.IIII(minecraftClient, n, fArray[0], fArray[1], illIII);
        }
        return false;
    }

    private static float llIll(float f, float f2) {
        if (f2 == 0.0f || f == 0.0f || Math.signum(f) == Math.signum(f2)) {
            return f;
        }
        return Math.signum(f2) * (360.0f - Math.abs(MathHelper.wrapDegrees((float)f)));
    }

    private IlIlllI() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lllII(MinecraftClient minecraftClient, Entity entity, double d) {
        if (!IlIlllI.IlIlI(minecraftClient)) return false;
        if (!IIIll) return false;
        if (entity == null) return false;
        if (entity == minecraftClient.player) return false;
        if (!entity.isAlive()) return false;
        if (entity.isRemoved()) return false;
        if (!Double.isFinite(d)) return false;
        if (d <= 0.0) return false;
        Vec3d vec3d = minecraftClient.player.getEyePos();
        Box box = entity.getBoundingBox();
        if (box.contains(vec3d)) {
            return true;
        }
        Vec3d vec3d2 = vec3d.add(IlIlllI.lllIl(lIIll, lIlll).multiply(d));
        Vec3d vec3d3 = box.raycast(vec3d, vec3d2).orElse(null);
        if (vec3d3 == null) {
            return false;
        }
        BlockHitResult blockHitResult = lIIllllI.IIIIllI(minecraftClient, (Entity)minecraftClient.player, vec3d, vec3d3);
        if (blockHitResult == null) return true;
        if (blockHitResult.getType() == HitResult.Type.MISS) return true;
        if (vec3d.squaredDistanceTo(blockHitResult.getPos()) + 1.0E-6 >= vec3d.squaredDistanceTo(vec3d3)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Vec3d lllIl(float f, float f2) {
        float f3 = -f * ((float)Math.PI / 180);
        float f4 = f2 * ((float)Math.PI / 180);
        float f5 = MathHelper.sin((double)f3);
        float f6 = MathHelper.cos((double)f3);
        float f7 = MathHelper.cos((double)f4);
        float f8 = MathHelper.sin((double)f4);
        return new Vec3d((double)(f5 * f7), (double)(-f8), (double)(f6 * f7));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean llllI(Object object) {
        if (object == null) return false;
        if (lIll) {
            MinecraftClient minecraftClient = MinecraftClient.getInstance();
            if (minecraftClient != null) {
                IlIlllI.lIlll(minecraftClient, lI, IIIlI);
            }
            IlIlllI.llII();
            return true;
        }
        return false;
    }

    public static boolean lllll() {
        return lIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static long IIIIII(long l2) {
        l2 ^= l2 >>> 30;
        l2 *= -4658895280553007687L;
        l2 ^= l2 >>> 27;
        return (l2 *= -7723592293110705685L) ^ l2 >>> 31;
    }

    /*
     * Enabled aggressive block sorting
     */
    static synchronized Vec3d IIIIIl(Vec3d vec3d) {
        if (vec3d == null) {
            return null;
        }
        long l2 = ++IIllI;
        long l3 = IlIlllI.IIIIII(Double.doubleToLongBits(vec3d.x) ^ Long.rotateLeft(Double.doubleToLongBits(vec3d.y), 21) ^ Long.rotateLeft(Double.doubleToLongBits(vec3d.z), 42) ^ l2 * -7046029254386353131L);
        double d = vec3d.x - Math.floor(vec3d.x);
        double d2 = vec3d.y - Math.floor(vec3d.y);
        double d3 = vec3d.z - Math.floor(vec3d.z);
        double d4 = Math.min(d, 1.0 - d);
        double d5 = Math.min(d2, 1.0 - d2);
        double d6 = Math.min(d3, 1.0 - d3);
        double d7 = IlIlllI.IIlllI(l3);
        double d8 = IlIlllI.IIlllI(IlIlllI.IIIIII(l3 + 7146057691288625177L));
        if (!(d4 <= d5) || !(d4 <= d6)) {
            if (!(d5 <= d6)) return new Vec3d(IlIlllI.lIlI(vec3d.x + d7), IlIlllI.lIlI(vec3d.y + d8), vec3d.z);
            return new Vec3d(IlIlllI.lIlI(vec3d.x + d7), vec3d.y, IlIlllI.lIlI(vec3d.z + d8));
        }
        return new Vec3d(vec3d.x, IlIlllI.lIlI(vec3d.y + d7), IlIlllI.lIlI(vec3d.z + d8));
    }

    public static boolean IIIIlI(MinecraftClient minecraftClient) {
        if (!IIlIl || !IlIlllI.IIlIIl(minecraftClient)) {
            return false;
        }
        IlIlllI.lIlll(minecraftClient, llIlI, lIIlI);
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public static lIIIIIl IIIIll(MinecraftClient var0, Entity var1_1, float var2_2, float var3_3, double var4_4) {
        block34: {
            block43: {
                block33: {
                    block42: {
                        block28: {
                            block36: {
                                block41: {
                                    block40: {
                                        block38: {
                                            block39: {
                                                block32: {
                                                    block31: {
                                                        block27: {
                                                            block35: {
                                                                block37: {
                                                                    block30: {
                                                                        block29: {
                                                                            if (!IlIlllI.IIlIIl(var0)) break block30;
                                                                            break block35;
lbl3:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var14_13 = var37_31;
                                                                                break block27;
                                                                                break;
                                                                            }
lbl6:
                                                                            // 2 sources

                                                                            return v0;
lbl8:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
lbl10:
                                                                            // 2 sources

                                                                            while (var22_19 < var21_18) {
                                                                                break block28;
                                                                            }
                                                                            break block36;
lbl13:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                break block29;
                                                                                break;
                                                                            }
lbl15:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                if (!Float.isFinite(var2_2)) break block30;
                                                                                break block31;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var6_5 = var0.player.getEyePos();
                                                                        break block37;
                                                                    }
lbl22:
                                                                    // 3 sources

                                                                    return null;
lbl24:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var7_6 = var1_1.getBoundingBox().expand(var4_4);
                                                                break block38;
lbl29:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl31:
                                                                // 1 sources

                                                                while (true) {
                                                                    var30_25 = var10_9;
                                                                    var31_26 = var30_25.length;
                                                                    var32_27 = 0;
                                                                    break block32;
                                                                    break;
                                                                }
lbl36:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            if (var1_1 == null) ** GOTO lbl22
                                                            ** while (true)
lbl41:
                                                            // 1 sources

                                                            while (var41_34 < var18_16) {
                                                                ** GOTO lbl24
                                                            }
                                                            break block39;
lbl44:
                                                            // 1 sources

                                                            while (Math.abs(var39_33 - var16_15) <= 1.0E-6) {
                                                                ** GOTO lbl41
                                                            }
                                                            break block39;
lbl47:
                                                            // 1 sources

                                                            while (true) {
                                                                v0 = null;
                                                                ** GOTO lbl6
                                                                break;
                                                            }
                                                            var11_10 = null;
                                                            var12_11 = 0.0f;
                                                            ** while (true)
lbl53:
                                                            // 1 sources

                                                            while (true) {
                                                                var20_17 = var8_7;
                                                                var21_18 = var20_17.length;
                                                                var22_19 = 0;
                                                                ** GOTO lbl10
                                                                break;
                                                            }
                                                            var16_15 = var39_33;
                                                            break block40;
                                                            while (true) {
                                                                ++var27_23;
                                                                break block33;
                                                                break;
                                                            }
lbl63:
                                                            // 1 sources

                                                            while (true) {
                                                                var28_24 = var25_21[var27_23];
                                                                ** continue;
                                                                break;
                                                            }
lbl66:
                                                            // 1 sources

                                                            while (true) {
                                                                ++var22_19;
                                                                ** GOTO lbl10
                                                                break;
                                                            }
                                                        }
                                                        var15_14 = var38_32;
                                                        break block39;
                                                    }
                                                    ** while (Float.isFinite((float)var3_3))
lbl74:
                                                    // 1 sources

                                                    ** while (true)
lbl75:
                                                    // 1 sources

                                                    while (true) {
                                                        var25_21 = var9_8;
                                                        var26_22 = var25_21.length;
                                                        var27_23 = 0;
                                                        break block33;
                                                        break;
                                                    }
                                                }
lbl81:
                                                // 2 sources

                                                while (true) {
                                                    if (var32_27 >= var31_26) ** continue;
                                                    break block34;
                                                    break;
                                                }
lbl84:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl86:
                                                // 1 sources

                                                while (true) {
                                                    if (!(var39_33 < var16_15)) ** break;
                                                    ** continue;
                                                    ** GOTO lbl44
                                                    break;
                                                }
lbl90:
                                                // 1 sources

                                                while (true) {
                                                    v0 = new lIIIIIl(var11_10, var12_11, var13_12, var14_13, var15_14);
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            ++var32_27;
                                            ** while (true)
lbl96:
                                            // 1 sources

                                            while (true) {
                                                var15_14 = 0.0f;
                                                ** continue;
                                                break;
                                            }
                                            var13_12 = 0.0f;
                                            var14_13 = 0.0f;
                                            ** while (true)
                                            var16_15 = Infinity;
                                            var18_16 = Infinity;
                                            ** while (true)
lbl105:
                                            // 1 sources

                                            while (true) {
                                                var13_12 = MathHelper.clamp((float)var36_30[1], (float)-90.0f, (float)90.0f);
                                                ** continue;
                                                break;
                                            }
                                        }
                                        var8_7 = new double[]{var7_6.minX, var7_6.maxX};
                                        break block41;
                                    }
                                    var18_16 = var41_34;
                                    break block42;
                                }
                                var9_8 = new double[]{var7_6.minY, var7_6.maxY};
                                var10_9 = new double[]{var7_6.minZ, var7_6.maxZ};
                                ** while (true)
lbl118:
                                // 1 sources

                                while (true) {
                                    var38_32 = MathHelper.clamp((float)var36_30[1], (float)-90.0f, (float)90.0f) - MathHelper.clamp((float)var3_3, (float)-90.0f, (float)90.0f);
                                    ** continue;
                                    break;
                                }
                            }
                            ** while (var11_10 != null)
lbl123:
                            // 1 sources

                            ** while (true)
lbl124:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var23_20 = var20_17[var22_19];
                        ** while (true)
                        var39_33 = Math.abs(var37_31) + Math.abs(var38_32);
                        var41_34 = var35_29.squaredDistanceTo(var6_5);
                        ** while (true)
                    }
                    var11_10 = var35_29;
                    var12_11 = var36_30[0];
                    ** while (true)
                    var35_29 = new Vec3d(var23_20, var28_24, var33_28);
                    break block43;
                }
                ** while (var27_23 >= var26_22)
lbl140:
                // 1 sources

                ** while (true)
            }
            var36_30 = IlIlllI.IIlIlI(var6_5, var35_29);
            var37_31 = IlIlllI.lIlIl(var36_30[0] - var2_2);
            ** while (true)
        }
        var33_28 = var30_25[var32_27];
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float IIIlII() {
        float f;
        block1: {
            if (!IIlIl) break block1;
            f = llIlI;
            return f;
        }
        f = lI;
        return f;
    }

    public static void IIIlIl(MinecraftClient minecraftClient, float f, float f2) {
        IlIlllI.lIlll(minecraftClient, f, f2);
    }

    public static boolean IIIllI(MinecraftClient minecraftClient, int n, float f, float f2) {
        if (IlIlllI.IIlIIl(minecraftClient)) {
            f = IlIlllI.IIlIll(f, minecraftClient.player.getYaw());
        }
        return IlIlllI.IlIIll(minecraftClient, n, f, f2, Il, false, false, false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float[] IIIlll(MinecraftClient minecraftClient, float f, float f2) {
        if (!Float.isFinite(f)) return null;
        if (!Float.isFinite(f2)) {
            return null;
        }
        float[] fArray = IlIlllI.IllI(minecraftClient);
        float f3 = fArray[0] + MathHelper.wrapDegrees((float)(f - fArray[0]));
        return IlIlllI.IIIIl(minecraftClient, fArray[0], fArray[1], f3, f2);
    }

    public static float IIlIII() {
        return IlIll;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIlIIl(MinecraftClient minecraftClient) {
        boolean bl;
        boolean bl2 = bl = minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && minecraftClient.getNetworkHandler() != null && minecraftClient.player.isAlive();
        if (!bl) {
            IlIlllI.l();
            return false;
        }
        int n = minecraftClient.player.getId();
        int n2 = System.identityHashCode(minecraftClient.player);
        if (Illl == 0) {
            lIl = n;
            Illl = n2;
            return true;
        }
        if (n == lIl) {
            if (n2 == Illl) return true;
        }
        lIl = n;
        Illl = n2;
        IlIlllI.l();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float[] IIlIlI(Vec3d vec3d, Vec3d vec3d2) {
        double d = vec3d2.x - vec3d.x;
        double d2 = vec3d2.y - vec3d.y;
        double d3 = vec3d2.z - vec3d.z;
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f = (float)(Math.toDegrees(Math.atan2(d3, d)) - 90.0);
        float f2 = MathHelper.clamp((float)((float)(-Math.toDegrees(Math.atan2(d2, d4)))), (float)-90.0f, (float)90.0f);
        return new float[]{f, f2};
    }

    private static float IIlIll(float f, float f2) {
        return f2 + IlIlllI.lIlIl(f - f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIllIl(MinecraftClient minecraftClient, float f, float f2) {
        if (!IlIlllI.IIlIIl(minecraftClient)) {
            return;
        }
        boolean bl = IlI && minecraftClient.player.age <= lII;
        lIlI = bl ? IIlII : minecraftClient.player.bodyYaw;
        IIIIl = bl ? IlIll : minecraftClient.player.getPitch();
        IIlII = f;
        IlIll = MathHelper.clamp((float)f2, (float)-90.0f, (float)90.0f);
        lIlIl = minecraftClient.player.age;
        lII = minecraftClient.player.age + 3;
        IlI = true;
        II = false;
        IIII = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double IIlllI(long l2) {
        double d;
        double d2 = (double)(l2 >>> 11) * (double)1.110223E-16f;
        double d3 = 0.035 + 0.06 * Math.abs(d2 * 2.0 - 1.0);
        if ((l2 & 1L) != 0L) {
            d = -d3;
            return d;
        }
        d = d3;
        return d;
    }

    public static boolean IIllll(MinecraftClient minecraftClient, int n, float f, float f2, IllIII illIII) {
        return IlIlllI.IlIIll(minecraftClient, n, f, f2, illIII, false, true, false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IlIIII(MinecraftClient minecraftClient, int n, float f, float f2) {
        if (!IlIlllI.IlIlI(minecraftClient)) return false;
        if (!Float.isFinite(f)) return false;
        if (!Float.isFinite(f2)) return false;
        if (lIll && n < llIl) {
            return false;
        }
        float f3 = minecraftClient.player.getYaw();
        float f4 = IlIlllI.IIlIll(f, f3);
        float f5 = MathHelper.clamp((float)f2, (float)-90.0f, (float)90.0f);
        return IlIlllI.IlIIll(minecraftClient, n, f4, f5, Il, false, true, false, false);
    }

    public static boolean IlIIIl() {
        return lIll;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean IlIIlI() {
        if (IlIlllI.IIll()) return false;
        if (lIIllllI.llIlI()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IlIIll(MinecraftClient minecraftClient, int n, float f, float f2, IllIII illIII, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (!IlIlllI.IIlIIl(minecraftClient)) return false;
        if (illIII == null) return false;
        if (!Float.isFinite(f)) return false;
        if (Float.isFinite(f2)) {
            if (IIlIl) return false;
            if (lIIIl) {
                return false;
            }
            if (lIll && lIIl) {
                if (IlIII) return false;
                if (n <= llIl) {
                    return false;
                }
            }
        } else {
            return false;
        }
        if (!IlIlllI.IIlll(minecraftClient, n)) {
            return false;
        }
        int n2 = minecraftClient.player.age + 1;
        if (!lIll || IIlI != n2 || n > llIl) {
            float[] fArray = IlIlllI.IllI(minecraftClient);
            int n3 = 31 * n + System.identityHashCode(illIII.getClass());
            lIll = true;
            IIlI = n2;
            llIl = n;
            lIII = fArray[0] + IlIlllI.lIIll(f - fArray[0], n3);
            I = MathHelper.clamp((float)f2, (float)-90.0f, (float)90.0f);
            IIIII = illIII;
            lIlII = bl;
            Ill = bl2;
            lIIl = bl4;
            IlIII = bl4 && IIIll && Math.abs(MathHelper.wrapDegrees((float)(lIII - fArray[0]))) <= 0.001f && Math.abs(I - fArray[1]) <= 0.001f;
            l = false;
            IIlIl = false;
            return true;
        }
        return false;
    }

    private static int IlIlII(int n, int n2) {
        return lllII[n ^ 0x2E5AAC4B] ^ n2 ^ n;
    }
}

