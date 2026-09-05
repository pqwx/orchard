/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lII
 * Module         : Extinguish  [PLAYER]
 * Description    : Auto-douses the player with a water bucket when on fire.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Switch Delay
 *   - Switch Back
 *   - RotateMode
 *   - .getBytes(
 *   - Strength
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
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.player;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIlIIlll;
import orchard.internal.IIlllIllI;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlIll;
import orchard.internal.IlIlllI;
import orchard.internal.IllllII;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIllIlIl;
import orchard.internal.llIll;
import orchard.internal.lllI;
import orchard.internal.llll;

@Environment(value=EnvType.CLIENT)
public final class Extinguish
extends ModuleBase {
    private float I;
    private Vec3d l;
    private int II = -1;
    private int Il;
    private static final float lI = 0.5f;
    private static final long ll = 1000L;
    private static final long III = 2000L;
    private long IIl;
    private final IlIlIlI IlI;
    private float Ill;
    private boolean lII;
    private IllllII lIl;
    private int llI = -1;
    private final IIIlIlIIl lll;
    private long IIII;
    private static final long IIIl = 50L;
    private long IIlI;
    private IIlIIlll IIll;
    private final lIlIIlI IlII;
    private final IIIIIIIIl<IIlllIllI> IlIl = this.IIlllIl(new IIIIIIIIl<IIlllIllI>(StringFactory.IIII("RotateMode"), IIlllIllI.class, IIlllIllI.I));
    private static String[] IllI;
    private static final int Illl = 9;
    private static final int lIII = 2;
    private long lIIl;
    private final llIll lIlI;
    private static final int lIll = 40;
    private static final int llII = 1;
    private long llIl;
    private llll lllI;
    private IlIlIll llll = null;
    private static final int IIIII = 2;
    private static final int[] IIIIl;
    private static final String[] IIIlI;
    private static final Object[] IIIll;

    private Vec3d I(ClientPlayerEntity clientPlayerEntity) {
        return new Vec3d(clientPlayerEntity.getX(), clientPlayerEntity.getY() - 0.125, clientPlayerEntity.getZ());
    }

    public Extinguish() {
        super(StringFactory.IIII("Extinguish"), Category.IIl, StringFactory.IIII("Auto-douses the player with a water bucket when on fire."));
        this.lll = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Switch Delay"), 0.0, 0.0, 0.0, 300.0, 5.0).lII("ms"));
        this.lIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Switch Back"), true));
        this.IlII = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("Strength"), 50.0, 1.0, 100.0, 1.0).lIII(() -> this.IlIl.lIl() == IIlllIllI.Il));
        this.IlI = new IlIlIlI();
        this.lllI = orchard.internal.llll.l;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int lI(ClientPlayerEntity clientPlayerEntity) {
        int n;
        block3: {
            ItemStack itemStack;
            block2: {
                n = 0;
                if (!true) break block2;
                if (n >= 9) return -1;
                if ((itemStack = clientPlayerEntity.getInventory().getStack(n)) != null && itemStack.isOf(Items.WATER_BUCKET)) break block3;
            }
            do {
                ++n;
                if (n >= 9) return -1;
            } while ((itemStack = clientPlayerEntity.getInventory().getStack(n)) == null || !itemStack.isOf(Items.WATER_BUCKET));
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(MinecraftClient minecraftClient, int n, long l2) {
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        this.llI = lIIllllI.lllI(clientPlayerEntity.getInventory());
        this.II = n;
        this.I = clientPlayerEntity.getPitch();
        this.Ill = clientPlayerEntity.getYaw();
        boolean bl = lIIllllI.llIllI(minecraftClient) != this.II;
        int n2 = bl ? this.IlIII(this.lll) : 0;
        this.llll = lIIllllI.IIIIlII(minecraftClient, this, this.II, n2, true);
        if (this.llll != null && this.llll.Il()) {
            long l3 = (long)n2 * 50L + 0L;
            this.lIIl = Long.MAX_VALUE;
            this.IIlI = l2 + l3 + 1000L;
            this.lllI = orchard.internal.llll.ll;
            this.IIII = l2;
            return;
        }
        this.IIlII();
    }

    private static String IlI(char[] cArray, long l2, int n) {
        int n2 = 0x538720FF ^ n;
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
     * Enabled aggressive block sorting
     */
    private void lII(MinecraftClient minecraftClient) {
        lIIlIllI lIIlIllI2 = (Boolean)this.lIlI.lIl() != false ? lIIlIllI.II : lIIlIllI.Il;
        lIIllllI.llIII(minecraftClient, this, lIIlIllI2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(MinecraftClient minecraftClient, long l2) {
        if (!this.IlIlI(minecraftClient)) {
            this.IIIlI(minecraftClient);
            return;
        }
        if (!this.llII(minecraftClient, orchard.internal.lllI.l)) {
            this.IIIlI(minecraftClient);
            return;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (this.IlIl.lIl() != IIlllIllI.Il) {
            IIlIIlll iIlIIlll = new IIlIIlll(orchard.internal.lllI.l, 0);
            if (this.IIlll(minecraftClient, iIlIIlll)) return;
            this.IIll = iIlIIlll;
            return;
        }
        this.lII = true;
        this.l = clientPlayerEntity.getEyePos().add(0.0, -2.0, 0.0);
        this.IIl = l2;
        this.Il = 0;
        this.lllI = orchard.internal.llll.lI;
        this.IIII = l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(MinecraftClient minecraftClient, long l2, IIlIIlll iIlIIlll) {
        IllllII illllII = this.lIl;
        if (illllII == null) return false;
        if (illllII.l() != l2) {
            return false;
        }
        this.lIl = null;
        this.IIll = null;
        boolean bl = this.IIIII(minecraftClient, iIlIIlll.l());
        long l3 = System.currentTimeMillis();
        if (!bl) {
            if (iIlIIlll.l() == orchard.internal.lllI.l) {
                this.IIIlI(minecraftClient);
                return false;
            }
            if (l3 - this.IIII >= 1000L) {
                this.lllI(minecraftClient, l3);
                return false;
            }
        } else {
            if (iIlIIlll.l() != orchard.internal.lllI.l) {
                this.lllI = orchard.internal.llll.III;
                this.IIII = l3;
                this.lIIl = l3;
                return true;
            }
            if (this.IlIl.lIl() == IIlllIllI.Il) {
                minecraftClient.player.setPitch(90.0f);
            }
            this.lllI = orchard.internal.llll.I;
            this.IIII = l3;
            this.lIIl = l3 + 0L;
            return true;
        }
        this.lIIl = l3 + 50L;
        return false;
    }

    private static void IIlI() {
        Extinguish.IllI[0] = Extinguish.IlI(Extinguish.IllII(-1522653320, -1510864319).toCharArray(), 60631L, -1927056061);
        Extinguish.IllI[1] = Extinguish.IlI(Extinguish.IllII(-1522653319, 2130124220).toCharArray(), 74815L, -1754549339);
        Extinguish.IllI[2] = Extinguish.IlI(Extinguish.IllII(-1522653318, -180324904).toCharArray(), 80905L, 1095423622);
        Extinguish.IllI[3] = Extinguish.IlI(Extinguish.IllII(-1522653317, -799012713).toCharArray(), 93583L, -1663368353);
        Extinguish.IllI[4] = Extinguish.IlI(Extinguish.IllII(-1522653316, 1595158223).toCharArray(), 85178L, 178530184);
        Extinguish.IllI[5] = Extinguish.IlI(Extinguish.IllII(-1522653315, 1182614167).toCharArray(), 17428L, -865277011);
        Extinguish.IllI[6] = Extinguish.IlI(Extinguish.IllII(-1522653314, 2084650938).toCharArray(), 95804L, 1716133677);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlII(MinecraftClient minecraftClient, long l2) {
        block17: {
            block15: {
                block14: {
                    block16: {
                        if (this.lIIl(minecraftClient, l2)) {
                            return;
                        }
                        if (this.IIll != null) {
                            this.lIII(minecraftClient, l2);
                            return;
                        }
                        switch (this.lllI.ordinal()) {
                            case 3: {
                                if (l2 < this.lIIl) return;
                                this.IIIll(minecraftClient, l2);
                                return;
                            }
                            case 4: {
                                if (l2 < this.lIIl) return;
                                this.lllI(minecraftClient, l2);
                                return;
                            }
                            case 2: {
                                if (l2 - this.IIl >= 2000L) break block14;
                                if (this.l == null) break;
                                float f = this.IlI.IllII(minecraftClient, this.l, ((Double)this.IlII.lIl()).floatValue());
                                ++this.Il;
                                if (!(f <= 0.5f)) {
                                    if (this.Il < 40) return;
                                }
                                break block15;
                            }
                            case 1: {
                                if (l2 > this.IIlI) {
                                    this.IIIlI(minecraftClient);
                                    return;
                                }
                                break block16;
                            }
                        }
                        this.llIl(minecraftClient, l2);
                        return;
                    }
                    if (!lIIllllI.IlIllI(minecraftClient, this.llll)) {
                        this.llll = lIIllllI.IIIIlII(minecraftClient, this, this.II, 0, true);
                        this.lIIl = Long.MAX_VALUE;
                    }
                    break block17;
                }
                this.llIl(minecraftClient, l2);
                return;
            }
            this.llIl(minecraftClient, l2);
            return;
        }
        if (!lIIllllI.IIIllll(minecraftClient, this.llll)) {
            return;
        }
        if (this.lIIl == Long.MAX_VALUE) {
            this.lIIl = l2 + 0L;
        }
        if (l2 < this.lIIl) {
            return;
        }
        this.lIl(minecraftClient, l2);
    }

    private long IllI(IIIlIlIIl iIIlIlIIl) {
        double d;
        double d2 = iIIlIlIIl.IIIl();
        if (d2 == (d = iIIlIlIIl.IIII())) {
            return Math.max(0L, Math.round(d2));
        }
        return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d2, d)));
    }

    private boolean Illl(MinecraftClient minecraftClient) {
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        return lIllIlIl.Ill(clientPlayerEntity.isOnFire(), clientPlayerEntity.getFireTicks(), clientPlayerEntity.isInLava());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIII(MinecraftClient minecraftClient, long l2) {
        IIlIIlll iIlIIlll = this.IIll;
        if (iIlIIlll == null) {
            return;
        }
        if (iIlIIlll.l() == orchard.internal.lllI.l && !this.IlIlI(minecraftClient)) {
            this.IIIlI(minecraftClient);
            return;
        }
        if (!this.llII(minecraftClient, iIlIIlll.l())) {
            this.IIll = null;
            if (iIlIIlll.l() == orchard.internal.lllI.l) {
                this.IIIlI(minecraftClient);
                return;
            }
        } else {
            if (lIIllllI.IIIIIlI(minecraftClient) > 0) {
                return;
            }
            if (!this.IIlll(minecraftClient, iIlIIlll)) return;
            this.IIll = null;
            return;
        }
        if (l2 - this.IIII < 1000L) {
            this.lIIl = l2 + 50L;
            return;
        }
        this.lllI(minecraftClient, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIl(MinecraftClient minecraftClient, long l2) {
        IllllII illllII = this.lIl;
        if (illllII == null) {
            return false;
        }
        if (minecraftClient.player.age <= illllII.I()) {
            return true;
        }
        this.lIl = null;
        ++this.llIl;
        IIlIIlll iIlIIlll = illllII.II();
        if (iIlIIlll.II() < 2) {
            this.IIll = iIlIIlll.I(iIlIIlll.II() + 1);
            return false;
        }
        if (iIlIIlll.l() == orchard.internal.lllI.l) {
            this.IIIlI(minecraftClient);
            return true;
        }
        if (l2 - this.IIII < 1000L) {
            this.lIIl = l2 + 50L;
            return true;
        }
        this.lllI(minecraftClient, l2);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (this.lII && minecraftClient != null && minecraftClient.player != null) {
            IlIlllI.IIIlIl(minecraftClient, this.Ill, this.I);
        }
        this.lII(minecraftClient);
        this.IlI.IlIIIlI();
        this.IIlII();
        this.lIIl = 0L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean lIll(MinecraftClient minecraftClient, IIlIIlll iIlIIlll) {
        if (iIlIIlll == null || !this.llII(minecraftClient, iIlIIlll.l()) || lIIllllI.IIIIIlI(minecraftClient) > 0) {
            return false;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        float f = clientPlayerEntity.getYaw();
        float f2 = clientPlayerEntity.getPitch();
        float f3 = clientPlayerEntity.renderYaw;
        float f4 = clientPlayerEntity.lastRenderYaw;
        float f5 = clientPlayerEntity.renderPitch;
        float f6 = clientPlayerEntity.lastRenderPitch;
        try {
            clientPlayerEntity.setPitch(90.0f);
            ActionResult actionResult = minecraftClient.interactionManager.interactItem((PlayerEntity)minecraftClient.player, Hand.MAIN_HAND);
            if (actionResult == null || !actionResult.isAccepted()) {
                boolean bl = false;
                return bl;
            }
        }
        finally {
            clientPlayerEntity.setYaw(f);
            clientPlayerEntity.setPitch(f2);
            clientPlayerEntity.renderYaw = f3;
            clientPlayerEntity.lastRenderYaw = f4;
            clientPlayerEntity.renderPitch = f5;
            clientPlayerEntity.lastRenderPitch = f6;
        }
        long l2 = System.currentTimeMillis();
        this.lIl = null;
        this.IIll = null;
        if (iIlIIlll.l() == orchard.internal.lllI.l) {
            this.lllI = orchard.internal.llll.I;
            this.IIII = l2;
            this.lIIl = l2 + 0L;
        } else {
            this.lllI = orchard.internal.llll.III;
            this.IIII = l2;
            this.lIIl = l2;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llII(MinecraftClient minecraftClient, lllI lllI2) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.II < 0) return false;
        if (this.II >= 9) {
            return false;
        }
        if (lIIllllI.llIllI(minecraftClient) != this.II) return false;
        if (!lIIllllI.IllIllI(minecraftClient, this.II)) {
            return false;
        }
        ItemStack itemStack = minecraftClient.player.getInventory().getStack(this.II);
        if (itemStack == null) return false;
        if (lllI2 != orchard.internal.lllI.l) {
            if (!itemStack.isOf(Items.BUCKET)) return false;
            return true;
        } else if (!itemStack.isOf(Items.WATER_BUCKET)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIl(MinecraftClient minecraftClient, long l2) {
        if (this.llII(minecraftClient, orchard.internal.lllI.l) && lIIllllI.IIIIIlI(minecraftClient) <= 0) {
            IIlIIlll iIlIIlll = new IIlIIlll(orchard.internal.lllI.l, 0);
            if (this.IIlll(minecraftClient, iIlIIlll)) return;
            this.IIll = iIlIIlll;
            return;
        }
        this.IIIlI(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllI(MinecraftClient minecraftClient, long l2) {
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (this.lII && this.IlIl.lIl() == IIlllIllI.Il) {
            IlIlllI.IIIlIl(minecraftClient, this.Ill, this.I);
        }
        this.lII = false;
        this.llll = null;
        if (!((Boolean)this.lIlI.lIl()).booleanValue()) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
        } else if (this.llI >= 0 && this.llI < 9) {
            lIIllllI.IlIlllI(minecraftClient, this, this.llI);
        } else {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        }
        this.IlIIl(minecraftClient, l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIII(MinecraftClient minecraftClient, lllI lllI2) {
        if (!this.llII(minecraftClient, lllI2)) return false;
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) return false;
        ActionResult actionResult = minecraftClient.interactionManager.interactItem((PlayerEntity)minecraftClient.player, Hand.MAIN_HAND);
        if (actionResult == null) return false;
        if (!actionResult.isAccepted()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block19: {
                block18: {
                    break block18;
lbl1:
                    // 1 sources

                    while (true) {
                        var13_7 = 0;
                        break block17;
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var13_7 = -1;
                        break block17;
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        Extinguish.IllI = new String[7];
                        Extinguish.IIlI();
                        return;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl15:
                    // 1 sources

                    while (true) {
                        var9_3 = new String[var8_2.length];
                        ** continue;
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl20:
                    // 1 sources

                    while (true) {
                        Extinguish.IIIll = new Object[var9_3.length];
                        ** continue;
                        break;
                    }
lbl23:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var8_2 = "\u12cd\u1291\u1285\u128d\u1291\u1291\u1291".toCharArray();
                        ** continue;
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl30:
                    // 2 sources

                    while (true) {
                        var5_13 = (var0_9[var3_11] & 255) << 24 | (var0_9[var3_11 + 1] & 255) << 16 | (var0_9[var3_11 + 2] & 255) << 8 | var0_9[var3_11 + 3] & 255;
                        ** continue;
                        break;
                    }
lbl33:
                    // 1 sources

                    while (true) {
                        Extinguish.IIIlI = var9_3;
                        ** continue;
                        break;
                    }
                }
                var6 = 4737;
                var7_1 = "\udf65\u2c71\uc73e\ud303\u8923\u197d\u6423\u6f12\u1bda\ufcef\u647c\u71ee\u28b9\u5c66\udf02\uce4c\u9834\u9159\ubcd3\u5359\u11ff\u6272\udca4\ub7c9\u8060\ud0e3\ueff7\u9ac8\u42e4\uf81e\u712f\u66af\u47a1\u15a2\u9450\u1462\uee3d\u6447\ube9f\u27aa\ua179\u08e6\u746a\u3a76\u8cd6\u8a3a\u7e06\ue7e5\ue4fc\uba90\u4bcf\uf1cb\ueba2\u9002\ud3e4\ue47b\u3fe5\u584c\u66f3\u7447\u2305\u5618\udaeb\uf146\ude83\u997f\u9747\ue1d7\u66e5\u3a64\uca33\ud900\u6ad4\u4c8e\u3018\u9a56\u2cba\u89e3\ua983\uefc3\u038e\u2b51\ued34\uf075\uc400\u269b\uf768\u99dd\u096a\uc562\u4974\uf8c2\u073f\u5555\ue6fc\u581d\u8ea7\u2bf2\ubcfc\u17c7\u099f\uffd6\u131f\u26bd\uaf80\uf47e\u6153\u2164\u210c\uc38e\ueb57\ua4b9\u80c0\u29fb\u9407\uf44b\ub7f6\uc42c\u07dc\u39e9\u592d\uf56a\ucdbe\ua07d\uc029\ub393\u751c\u8b99\ucafd\ud6d9\ufb0f\ud7e7\u9678\u9273\u0dac\u4bc3\ubb30\ucc37\u990b\u1244\ud11a\ua7a2\ucdbe\u474c\u8edc\u914d\u3667\uddf4\u8bf3\u40c9\u3f35\u97f9\u3c6e\u547f\u1b8b\ud0c8";
                ** while (true)
lbl40:
                // 1 sources

                while (true) {
                    var4_12 = 0;
                    ** GOTO lbl30
                    break;
                }
                Extinguish.IIIIl[var4_12] = var5_13 ^= var2_8;
                var3_11 += 4;
                if (++var4_12 >= var1_10) ** break;
                ** while (true)
                ** while (true)
                var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                var11_5 += var12_6;
                break block19;
lbl51:
                // 1 sources

                while (true) {
                    var3_11 = 0;
                    ** continue;
                    break;
                }
lbl54:
                // 2 sources

                while (true) {
                    var12_6 = var8_2[var10_4] ^ var6;
                    ** continue;
                    break;
                }
                var12_6 = 0;
                if (var13_7 != 0) ** GOTO lbl54
                ** while (true)
lbl60:
                // 1 sources

                while (true) {
                    if (++var10_4 >= var8_2.length) ** break;
                    ** continue;
                    ** continue;
                    break;
                }
            }
            ** while (true)
            var1_10 = var0_9.length / 4;
            Extinguish.IIIIl = new int[var1_10];
            ** while (true)
        }
        var10_4 = 0;
        var11_5 = 0;
        ** while (true)
        var2_8 = -1729656280;
        var0_9 = "|\u00e4\u00a8\u00f0\u00f9\u00911\u00feE\u00ef\u00f7\u0081\u00b6W\u00bd\u0093\u0010G\u00fd\u00ca'\u00e6\u009d=\u00e4\u00c3\u00dd\u00a8\u0093\u00d81s\u00bc\u0001\u00db\u00a1\u00a5y\u00fdw\u001c\r'F`\u00b6\"?\u00e0\u00150\u00bcW\u00ed\u00c9\u0082\u0089\u00fd\u0093\u00fbt \b\u001d;HN\\\u000e\u00b5\u0082\u00aa".getBytes("ISO-8859-1");
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlI(MinecraftClient minecraftClient) {
        if (this.lII && minecraftClient != null && minecraftClient.player != null && this.IlIl.lIl() == IIlllIllI.Il) {
            IlIlllI.IIIlIl(minecraftClient, this.Ill, this.I);
        }
        this.lII(minecraftClient);
        this.IIlII();
        this.lIIl = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIll(MinecraftClient minecraftClient, long l2) {
        if (this.llII(minecraftClient, orchard.internal.lllI.I)) {
            IIlIIlll iIlIIlll = new IIlIIlll(orchard.internal.lllI.I, 0);
            if (this.IIlll(minecraftClient, iIlIIlll)) return;
            this.IIll = iIlIIlll;
            return;
        }
        if (l2 - this.IIII < 1000L) {
            this.lIIl = l2 + 50L;
            return;
        }
        this.lllI(minecraftClient, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIIIl(minecraftClient)) {
            this.IIIlI(minecraftClient);
            return;
        }
        if (orchard.internal.IIlI.IIl(minecraftClient)) {
            this.IIIlI(minecraftClient);
            return;
        }
        long l2 = System.currentTimeMillis();
        if (this.IIllI(minecraftClient)) {
            if (this.lllI != orchard.internal.llll.l) {
                this.IIIlI(minecraftClient);
            }
        } else {
            if (this.lllI != orchard.internal.llll.l) {
                this.IlII(minecraftClient, l2);
                return;
            }
            boolean bl = this.Illl(minecraftClient);
            if (!bl) {
                this.lIIl = 0L;
                return;
            }
            if (l2 < this.lIIl) {
                return;
            }
            if (!this.IlIlI(minecraftClient)) {
                return;
            }
            int n = this.lI(minecraftClient.player);
            if (n < 0) {
                return;
            }
            this.IIl(minecraftClient, n, l2);
            return;
        }
        this.lIIl = 0L;
    }

    private void IIlII() {
        ++this.llIl;
        this.lIl = null;
        this.IIll = null;
        this.lllI = orchard.internal.llll.l;
        this.IIII = 0L;
        this.IIlI = 0L;
        this.II = -1;
        this.llI = -1;
        this.lII = false;
        this.llll = null;
        this.l = null;
        this.IIl = 0L;
        this.Il = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIllI(MinecraftClient minecraftClient) {
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (clientPlayerEntity == null) return false;
        if (!clientPlayerEntity.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlll(MinecraftClient minecraftClient, IIlIIlll iIlIIlll) {
        if (iIlIIlll == null) return false;
        if (!this.llII(minecraftClient, iIlIIlll.l())) return false;
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) {
            return false;
        }
        if (this.IlIl.lIl() == IIlllIllI.I) {
            return this.lIll(minecraftClient, iIlIIlll);
        }
        float f = minecraftClient.player.getYaw();
        long l2 = ++this.llIl;
        boolean bl = iIlIIlll.l() == orchard.internal.lllI.l ? IlIlllI.llIlI(minecraftClient, 250, this.I(minecraftClient.player), () -> this.lll(minecraftClient, l2, iIlIIlll)) : IlIlllI.IlII(minecraftClient, 250, f, 90.0f, () -> this.lll(minecraftClient, l2, iIlIIlll));
        if (!bl) {
            ++this.llIl;
            return false;
        }
        int n = iIlIIlll.l() == orchard.internal.lllI.l ? 2 : 1;
        this.lIl = new IllllII(l2, iIlIIlll, minecraftClient.player.age + n);
        return true;
    }

    private int IlIII(IIIlIlIIl iIIlIlIIl) {
        return Math.max(0, (int)Math.ceil((double)this.IllI(iIIlIlIIl) / 50.0));
    }

    private void IlIIl(MinecraftClient minecraftClient, long l2) {
        this.IIlII();
        this.lIIl = 0L;
    }

    @Override
    public void ll() {
        this.IIlII();
        this.lIIl = 0L;
        this.IlI.lIlIII();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIlI(MinecraftClient minecraftClient) {
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (clientPlayerEntity == null) return false;
        if (!clientPlayerEntity.isOnGround()) return false;
        return true;
    }

    private static int IlIll(int n, int n2) {
        return IIIIl[n ^ 0x5727EA28] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IllII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xA53E2778;
        char[] cArray = IIIlI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Extinguish.IIIll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xDAD04019;
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
                    n6 = 137;
                    continue block33;
                }
                case 31: {
                    n6 = 141;
                    continue block33;
                }
                case 3: {
                    n6 = 140;
                    continue block33;
                }
                case 13: {
                    n6 = 131;
                    continue block33;
                }
                case 12: {
                    n6 = 146;
                    continue block33;
                }
                case 5: {
                    n6 = 32;
                    continue block33;
                }
                case 26: {
                    n6 = 44;
                    continue block33;
                }
                case 22: {
                    n6 = 130;
                    continue block33;
                }
                case 7: {
                    n6 = 72;
                    continue block33;
                }
                case 23: {
                    n6 = 246;
                    continue block33;
                }
                case 9: {
                    n6 = 64;
                    continue block33;
                }
                case 19: {
                    n6 = 61;
                    continue block33;
                }
                case 30: {
                    n6 = 128;
                    continue block33;
                }
                case 17: {
                    n6 = 138;
                    continue block33;
                }
                case 24: {
                    n6 = 255;
                    continue block33;
                }
                case 2: {
                    n6 = 134;
                    continue block33;
                }
                case 21: {
                    n6 = 217;
                    continue block33;
                }
                case 1: {
                    n6 = 104;
                    continue block33;
                }
                case 25: {
                    n6 = 208;
                    continue block33;
                }
                case 14: {
                    n6 = 154;
                    continue block33;
                }
                case 4: {
                    n6 = 29;
                    continue block33;
                }
                case 6: {
                    n6 = 215;
                    continue block33;
                }
                case 18: {
                    n6 = 234;
                    continue block33;
                }
                case 11: {
                    n6 = 193;
                    continue block33;
                }
                case 27: {
                    n6 = 165;
                    continue block33;
                }
                case 29: {
                    n6 = 130;
                    continue block33;
                }
                case 15: {
                    n6 = 232;
                    continue block33;
                }
                case 8: {
                    n6 = 63;
                    continue block33;
                }
                case 10: {
                    n6 = 234;
                    continue block33;
                }
                case 28: {
                    n6 = 25;
                    continue block33;
                }
                case 16: {
                    n6 = 84;
                    continue block33;
                }
            }
            n6 = 122;
        }
    }
}

