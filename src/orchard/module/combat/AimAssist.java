/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIllII
 * Module         : Aim Assist  [COMBAT]
 * Description    : q5lbkw1fXAXXGIpVA8Ceh5eBRtwaRV8PhACeUB2TypGPlUaYChdREtcHj0kA3duQjA==   (client's own text)
 *
 * Recovered strings in this class:
 *   - Dev Micro Pause Duration
 *   - Dev Pitch Variance Min
 *   - Dev Pitch Variance Max
 *   - Dev Blend Variance Min
 *   - Dev Blend Variance Max
 *   - Dev Micro Pause Chance
 *   - Dev Variance Time Min
 *   - Dev Variance Time Max
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.MaceItem
 *  net.minecraft.registry.Registries
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.combat;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MaceItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIllII;
import orchard.internal.IIlIIllII;
import orchard.internal.IIllIIlI;
import orchard.internal.IIllIl;
import orchard.internal.IIlllllIl;
import orchard.internal.IIllllllI;
import orchard.internal.IlIIllIII;
import orchard.internal.IlIlIIIIl;
import orchard.internal.IlIlIIIlI;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlIlIII;
import orchard.internal.IlIlIlIl;
import orchard.internal.IllIlIlI;
import orchard.internal.IlllIl;
import orchard.internal.IlllIll;
import orchard.internal.Illll;
import orchard.internal.lIIIlll;
import orchard.internal.lIIllII;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlIll;
import orchard.internal.llIlIl;
import orchard.internal.llIlIlI;
import orchard.internal.llIll;
import orchard.internal.lllIIIII;
import orchard.internal.lllllI;
import orchard.module.combat.KnockbackDisplacement;

@Environment(value=EnvType.CLIENT)
public final class AimAssist
extends ModuleBase
implements IIlllllIl {
    private final lIlIIlI I;
    private static final float l = 0.14f;
    private final lIlIIlI II;
    private static final float Il = 0.0035f;
    private static final float lI = 0.025f;
    private final llIll ll;
    private final lIlIIlI III;
    private final lIlIIlI IIl;
    private static final float IlI = 2.6f;
    private final lIlIIlI Ill;
    private static final double lII = 1.0E-6;
    private final lIlIIlI lIl;
    private static final float llI = 2.5f;
    private final llIll lll;
    private final lIlIIlI IIII;
    private final lIlIIlI IIIl;
    private static final float IIlI = 179.0f;
    private final lIlIIlI IIll;
    private final llIll IlII;
    private static final float IlIl = 0.76f;
    private static final float IllI = 0.2f;
    private float Illl;
    private static final float lIII = 0.92f;
    private static final float lIIl = 0.35f;
    private static final float lIlI = 0.07f;
    private final lIlIIlI lIll;
    private static final List<IlllIll> llII;
    private float llIl;
    private static final float lllI = 0.018f;
    private static final float llll = 0.18f;
    private float IIIII;
    private static final float IIIIl = 1.12f;
    private static final float IIIlI = 2.7f;
    private static final float IIIll = 1.25f;
    private float IIlII;
    private float IIlIl;
    private boolean IIllI;
    private float IIlll;
    private static final int IlIII = 4;
    private static final int IlIIl = 4;
    private static final float IlIlI = 0.65f;
    private static final float IlIll = 1.06f;
    private final lIlIIlI IllII;
    private static final float IllIl = 0.1f;
    private static final IIIlIIIII IlllI;
    private static final float Illll = 0.052f;
    private static final float lIIII = 0.0f;
    private final IllIlIlI lIIIl;
    private final llIlIlI lIIlI;
    private static final float lIIll = 0.8f;
    private static final float lIlII = 2.0f;
    private float lIlIl;
    private int lIllI;
    private boolean lIlll;
    private static final float llIII = 0.55f;
    private long llIIl;
    private float llIlI;
    private static final float llIll = 0.42f;
    private static final float lllII = 1.08f;
    private float lllIl;
    private float llllI;
    private final lIIllII lllll;
    private final lIlIIlI IIIIII;
    private final lIlIIlI IIIIIl;
    private static final float IIIIlI = 0.0125f;
    private final lIlIIlI IIIIll;
    private long IIIlII;
    private final lIlIIlI IIIlIl;
    private static final float IIIllI = 0.0015f;
    private final lIlIIlI IIIlll;
    private static final float IIlIII = 1.07f;
    private final lIlIIlI IIlIIl;
    private final lIlIIlI IIlIlI;
    private static final float IIlIll = 0.065f;
    private final llIll IIllII;
    private static final float IIllIl = 0.18f;
    private float IIlllI;
    private int IIllll;
    private static final float IlIIII = 0.04f;
    private float IlIIIl;
    private static final float IlIIlI = 0.035f;
    private static final float IlIIll = 0.022f;
    private static final float IlIlII = 0.88f;
    private final lIlIIlI IlIlIl;
    private static final float IlIllI = 0.72f;
    private static final IIIlIIIII IlIlll;
    private float IllIII;
    private long IllIIl;
    private float IllIlI;
    private static final float IllIll = 0.05f;
    private float IlllII;
    private final IIIIIIIIl<lIIIlll> IlllIl;
    private final lIlIIlI IllllI;
    private final IIIIIIIIl<lIlIll> Illlll;
    private float lIIIII;
    private float lIIIIl;
    private float lIIIlI;
    private float lIIIll;
    private final llIll lIIlII;
    private float lIIlIl;
    private float lIIllI;
    private final lIlIIlI lIIlll;
    private float lIlIII;
    private float lIlIIl;
    private static final float lIlIlI = 0.005f;
    private final IIIIIIIIl<IlIlIIIIl> lIlIll = this.IIlllIl(new IIIIIIIIl<IlIlIIIIl>("Mode", IlIlIIIIl.class, IlIlIIIIl.ll));
    private static final float lIllII = 1.8f;
    private final IlIlIlI lIllIl;
    private float lIlllI;
    private final IllIlIlI lIllll;
    private final llIll llIIII;
    private static final float llIIIl = -90.0f;
    private static final float llIIlI = 1.4f;
    private float llIIll;
    private static final float llIlII = 0.016666668f;
    private float llIlIl;
    private static final float llIllI = 0.024f;
    private final llIll llIlll;
    private final lIlIIlI lllIII;
    private static final float lllIIl = 0.91f;
    private float lllIlI;
    private static final float lllIll = 0.018f;
    private float llllII;
    private Vec3d llllIl;
    private static final float lllllI = 0.95f;
    private static final float llllll = 0.94f;
    private static final IIIlIIIII IIIIIII;
    private final IlIlIlIII IIIIIIl;
    private float IIIIIlI;
    private final lIlIIlI IIIIIll;
    private static final float IIIIlII = 0.4f;
    private static final float IIIIlIl = 14.0f;
    private float IIIIllI;
    private float IIIIlll;
    private static final float IIIlIII = 0.0015f;
    private static final float IIIlIIl = 1.45f;
    private static final float IIIlIlI = 0.016f;
    private int IIIlIll;
    private static final float IIIllII = 0.01f;
    private final lIlIIlI IIIllIl;
    private static final float IIIlllI = 2.1f;
    private static final float IIIllll = 0.06666667f;
    private static final float IIlIIII = 3.0f;
    private static final float IIlIIIl = 6.5f;
    private final lIlIIlI IIlIIlI;
    private boolean IIlIIll;
    private boolean IIlIlII;
    private static final float IIlIlIl = 0.6f;
    private final lIlIIlI IIlIllI;
    private final lIlIIlI IIlIlll;
    private static final float IIllIII = 90.0f;
    private final lIlIIlI IIllIIl;
    private static final float IIllIlI = 0.38f;
    private static final float IIllIll = 0.3f;
    private static final float IIlllII = 0.38f;
    private final IllIlIlI IIlllIl;
    private final llIll IIllllI;
    private final lIlIIlI IIlllll;
    private float IlIIIII;
    private float IlIIIIl;
    private static final float IlIIIlI = 0.16f;
    private float IlIIIll;
    private float IlIIlII;
    private long IlIIlIl;
    private final lIlIIlI IlIIllI;
    private final lIlIIlI IlIIlll;
    private float IlIlIII;
    private static final int[] Illllll;
    private static final String[] lIIIIII;
    private static final Object[] lIIIIIl;

    /*
     * Enabled aggressive block sorting
     */
    private float I(int n, int n2, int n3, float f, float f2) {
        float f3;
        int n4 = this.IlIII(n * 31 + n3 * 17 + n2);
        int n5 = Math.floorMod(n4, 3);
        float f4 = this.IlIIII(this.IlIII(n * 97 + n3 * 37 + n2 * 3));
        float f5 = this.llIll(f, 0.992f, 0.72f);
        float f6 = this.llIll(1.008f, f2, 0.28f);
        switch (n5) {
            case 0: {
                f3 = this.llIll(f, f5, f4);
                return f3;
            }
            default: {
                f3 = this.llIll(f5, f6, f4);
                return f3;
            }
            case 1: 
        }
        f3 = this.llIll(f6, f2, f4);
        return f3;
    }

    private float l() {
        float f = MathHelper.clamp((float)this.llIlIl(), (float)0.0f, (float)this.lI());
        return MathHelper.clamp((float)(f / Math.max(1.0f, this.lI())), (float)0.0f, (float)1.0f);
    }

    private float lI() {
        return 100.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        this.IIlIll(MinecraftClient.getInstance(), false);
        this.llI();
        this.lIllIl.IlIIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIl(float f, float f2, float f3) {
        float f4 = Math.max(f, 0.005f);
        float f5 = this.IIIIll();
        float f6 = f4 * 20.0f * (0.95f + (1.0f - f5) * 0.55f + f2 * 0.95f) * f3 * 1.12f;
        if (this.lIIlII()) {
            f6 *= this.lllI();
        }
        if (this.lIlIll.lIl() == IlIlIIIIl.l) {
            return f6 *= 1.35f;
        }
        if (this.lIlIll.lIl() == IlIlIIIIl.III) {
            return f6 *= 0.86f;
        }
        if (this.lIlIll.lIl() != IlIlIIIIl.Il) {
            if (this.lIlIll.lIl() != IlIlIIIIl.lI) return f6;
            return f6 *= 1.95f;
        }
        return f6 *= 1.65f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlI(Illll illll) {
        switch (illll) {
            case I: {
                boolean bl = this.lIIlI.IIl(IIIIIII);
                return bl;
            }
            case II: {
                boolean bl = this.lIIlI.IIl(IlIlll);
                return bl;
            }
            case ll: {
                boolean bl = this.lIIlI.IIl(IlllI);
                return bl;
            }
        }
        throw new MatchException(null, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lII(float f) {
        if (!(Math.abs(f) >= 179.0f)) {
            this.lIIIIl = 0.0f;
            return f;
        }
        if (this.lIIIIl != 0.0f) return this.lIIIIl * 180.0f;
        this.lIIIIl = f >= 0.0f ? 1.0f : -1.0f;
        return this.lIIIIl * 180.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(MinecraftClient minecraftClient, IlIIllIII ilIIllIII, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        boolean bl;
        float f6 = minecraftClient.player.getYaw();
        float f7 = this.Illl(minecraftClient.player.getPitch());
        llIlIl llIlIl2 = this.lIIllI(minecraftClient, ilIIllIII, f6, f7, f);
        float f8 = llIlIl2.l();
        float f9 = this.llIIl(f7, llIlIl2.I());
        float f10 = this.lII(MathHelper.wrapDegrees((float)(f8 - f6)));
        if (this.lIIIIl != 0.0f) {
            f8 = f6 + f10;
        }
        float f11 = f9 - f7;
        this.Illlll(f6, f7, f10, f11);
        float f12 = this.lIlIlI(this.IIlllIl, ilIIllIII.III(), 45, f, 0.92f, 1.08f);
        float f13 = this.lIlIlI(this.lIIIl, ilIIllIII.III(), 87, f, 0.91f, 1.07f);
        float f14 = this.llIIIl(ilIIllIII, f10, f11);
        float f15 = this.Illll(f14, f12);
        float f16 = this.Illll(f14, f13) * 0.78f;
        float f17 = Math.max(0.0f, Math.min(f, 0.1f));
        this.IIIII += f17;
        float f18 = this.lllll(f14);
        if (Math.abs(f10) <= f15 && Math.abs(f11) <= f16) {
            this.llIl();
            this.IIlll(f6, f7);
            return;
        }
        boolean bl2 = this.IIIlIll > 0;
        boolean bl3 = bl = this.IIllll > 0;
        if (!bl2 || !bl) {
            float f19 = this.IIIlIl();
            float f20 = this.IIlIIl();
            IIllIIlI iIllIIlI = this.lIIIlI(f6, f8, this.IllIII, f19, bl2, f, f14, f12, true);
            IIllIIlI iIllIIlI2 = f11 == 0.0f ? new IIllIIlI(f7, 0.0f) : this.lIIIlI(f7, f9, this.IlIIIII, f20, bl, f, f14, f13, false);
            f5 = MathHelper.wrapDegrees((float)(iIllIIlI.l() - f6));
            f4 = iIllIIlI2.l() - f7;
            this.IllIII = iIllIIlI.I();
            this.IlIIIII = iIllIIlI2.I();
            if (Math.abs(f9 - f7) <= 0.0015f || Math.abs(f4) <= 0.0015f) {
                f4 = 0.0f;
                this.IlIIIII = 0.0f;
            }
        } else {
            this.llIl();
            this.IIlll(f6, f7);
            return;
        }
        if (Math.abs(f5) <= 0.01f && Math.abs(f4) <= 0.01f) {
            this.IIlll(f6, f7);
            return;
        }
        float f21 = this.IlllIl(f);
        f5 *= f21;
        f4 *= f21;
        f5 += this.llIII(f5);
        f4 += this.llIII(f4) * 0.16f;
        f5 += this.lIIlll(f17) * f18;
        f4 += this.IIlIl(f) * f18;
        if (this.lIlllI == 0.0f && this.IIlII == 0.0f) {
            ThreadLocalRandom threadLocalRandom;
            if (f18 > 0.95f && !this.lIII() && (threadLocalRandom = ThreadLocalRandom.current()).nextFloat() < 0.022f * f17) {
                f3 = 0.025f + threadLocalRandom.nextFloat() * 0.04f;
                f2 = f5 * f3;
                float f22 = f4 * f3;
                f5 += f2;
                f4 += f22 * 0.35f;
                this.lIlllI = -f2;
                this.IIlII = -f22;
            }
        } else {
            f5 += this.lIlllI;
            f4 += this.IIlII;
            this.lIlllI = 0.0f;
            this.IIlII = 0.0f;
        }
        float f23 = this.IlII(minecraftClient);
        f5 = this.IIIIII(f5, f23);
        f4 = this.IIIIII(f4, f23);
        f3 = f6 + f5;
        f2 = this.Illl(f7 + f4);
        lIIllllI.IIlII(minecraftClient, f3, f2);
        this.IIlll(f3, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llI() {
        if (this.lIIlII()) {
            this.I.lll(2.0, 360.0);
            this.Ill.lll(1.0, 100.0);
            this.IIIllIl.lll(1.0, 100.0);
            return;
        }
        this.I.lll(2.0, 360.0);
        this.Ill.lll(1.0, 100.0);
        this.IIIllIl.lll(1.0, 8.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIlIlIl lll() {
        IIIlIllII iIIlIllII;
        boolean bl = this.lIIlII();
        float f = this.IIIIl(this.IIlIlI);
        float f2 = MathHelper.clamp((float)(f / 100.0f), (float)0.0f, (float)1.0f);
        float f3 = 0.35f + 0.65f * (float)Math.pow(f2, 0.85);
        float f4 = this.IIIIl(this.IlIIlll) / 100.0f;
        float f5 = this.IIIIl(this.IIlIIl) / 1000.0f;
        float f6 = AimAssist.llIIlI(this.IIIIl(this.IIIIIl));
        float f7 = AimAssist.llIIlI(this.IIIIl(this.IIlllll));
        float f8 = this.llIlIl();
        lllIIIII lllIIIII2 = bl ? lllIIIII.l : lllIIIII.I;
        IIlIIllII iIlIIllII = bl ? IIlIIllII.I : IIlIIllII.l;
        boolean bl2 = (Boolean)this.IlII.lIl();
        if (bl) {
            iIIlIllII = this.IlIIll();
            return new IlIlIlIl(f8, lllIIIII2, iIlIIllII, bl2, iIIlIllII, new IlllIl(f3, f5, f6, f7, this.IIIIl(this.lIl) / 100.0f, f4, 1.0f, 1.0f), false, 1.0f);
        }
        iIIlIllII = IIIlIllII.II();
        return new IlIlIlIl(f8, lllIIIII2, iIlIIllII, bl2, iIIlIllII, new IlllIl(f3, f5, f6, f7, this.IIIIl(this.lIl) / 100.0f, f4, 1.0f, 1.0f), false, 1.0f);
    }

    private float IIII() {
        return this.llIll(0.38f, 0.16f, this.l());
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIllIIlI IIlI(float f, float f2, float f3, float f4, float f5, boolean bl, IlIlIIIIl ilIlIIIIl) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        block5: {
            block4: {
                float f11;
                block3: {
                    f11 = bl ? f + MathHelper.wrapDegrees((float)(f2 - f)) : this.Illl(f2);
                    f10 = f11 - f;
                    f9 = Math.abs(f10);
                    if (f9 <= 1.0E-4f) break block3;
                    float f12 = f3;
                    if (ilIlIIIIl != IlIlIIIIl.Il) {
                        if (ilIlIIIIl == IlIlIIIIl.lI) {
                            f12 *= 1.85f;
                        }
                    } else {
                        f12 *= 1.45f;
                    }
                    f8 = Math.max(0.005f, f12 * f4);
                    if (ilIlIIIIl == IlIlIIIIl.lI) break block4;
                    f7 = f8;
                    break block5;
                }
                return new IIllIIlI(f11, 0.0f);
            }
            f6 = MathHelper.clamp((float)(0.2f + f5 * 0.36f + f9 / 90.0f), (float)0.22f, (float)0.78f);
            f7 = Math.max(0.005f, f9 * f6);
        }
        f6 = Math.min(f9, Math.min(f8, f7)) * Math.signum(f10);
        return new IIllIIlI(f + f6, 0.0f);
    }

    private float IlII(MinecraftClient minecraftClient) {
        double d;
        if (minecraftClient == null || minecraftClient.options == null) {
            return 0.0f;
        }
        try {
            d = (Double)minecraftClient.options.getMouseSensitivity().getValue();
        }
        catch (Exception exception) {
            d = 0.5;
        }
        double d2 = d * 0.6 + 0.2;
        double d3 = d2 * d2 * d2;
        return (float)(d3 * 8.0 * 0.15);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.llI();
        this.lIllIl.lIlIII();
        this.IIlIll(MinecraftClient.getInstance(), true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IllI(Vec3d vec3d, Vec3d vec3d2, LivingEntity livingEntity) {
        Box box = livingEntity.getBoundingBox();
        Vec3d vec3d3 = box.getCenter();
        double d = box.maxY - box.minY;
        Vec3d vec3d4 = new Vec3d(vec3d3.x, box.minY, vec3d3.z);
        Vec3d vec3d5 = new Vec3d(vec3d3.x, box.minY + d, vec3d3.z);
        return this.IIlIII(vec3d, vec3d4, vec3d5);
    }

    private float Illl(float f) {
        return MathHelper.clamp((float)f, (float)-90.0f, (float)90.0f);
    }

    private boolean lIII() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lIIl(float f, float f2) {
        float f3 = this.IIIIll();
        float f4 = MathHelper.clamp((float)(0.035f + f3 * 0.145f - f * 0.02f), (float)0.03f, (float)0.22f);
        float f5 = MathHelper.clamp((float)(f4 * MathHelper.clamp((float)(2.0f - f2), (float)0.95f, (float)1.05f)), (float)0.03f, (float)0.22f);
        if (!this.lIIlII()) {
            if (this.lIlIll.lIl() == IlIlIIIIl.l) {
                return MathHelper.clamp((float)(f5 * 0.85f), (float)0.025f, (float)0.2f);
            }
            if (this.lIlIll.lIl() != IlIlIIIIl.III) return f5;
            return MathHelper.clamp((float)(f5 * 1.15f), (float)0.035f, (float)0.24f);
        }
        return MathHelper.clamp((float)(f5 *= this.IIII()), (float)0.025f, (float)0.2f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlI(MinecraftClient minecraftClient, long l2) {
        if (this.IlIIlIl == 0L) {
            this.IlIIlIl = l2;
            this.IIIIllI = 0.0f;
            this.IlIlII(minecraftClient, 0.016666668f, l2);
            return;
        }
        float f = MathHelper.clamp((float)((float)(l2 - this.IlIIlIl) / 1.0E9f), (float)0.0f, (float)0.2f);
        this.IlIIlIl = l2;
        this.IIIIllI = Math.min(this.IIIIllI + f, 0.06666667f);
        int n = 0;
        while (this.IIIIllI >= 0.016666668f && n < 4) {
            this.IlIlII(minecraftClient, 0.016666668f, l2);
            this.IIIIllI -= 0.016666668f;
            ++n;
        }
        if (n != 0) return;
        if (!(this.IIIIllI > 0.0f)) return;
        float f2 = MathHelper.clamp((float)this.IIIIllI, (float)0.0033333334f, (float)0.016666668f);
        this.IIIIllI = 0.0f;
        this.IlIlII(minecraftClient, f2, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIll(int n) {
        int n2 = this.IlIII(n * 13 + 31);
        int n3 = this.IlIII(n * 19 + 45);
        this.lIlIII = this.IlIIII(n2);
        this.llIlI = this.IlIIII(this.IlIII(n2 ^ 0xA5A5)) * 2.0f - 1.0f;
        this.lllIlI = this.IlIIII(this.IlIII(n2 ^ 0x5A5A)) * 2.0f - 1.0f;
        this.lllIl = this.IlIIII(n3);
        this.llIl = this.IlIIII(this.IlIII(n3 ^ 0xA5A5)) * 2.0f - 1.0f;
        this.llIIll = this.IlIIII(this.IlIII(n3 ^ 0x5A5A)) * 2.0f - 1.0f;
        int n4 = this.IlIII(n * 23 + 113);
        this.lIlIIl = 0.35f + this.IlIIII(n4) * 0.9f;
        this.IlllII = 0.35f + this.IlIIII(this.IlIII(n4 ^ 0x1357)) * 0.9f;
        this.IlIIIIl = 0.35f + this.IlIIII(this.IlIII(n4 ^ 0x2468)) * 0.9f;
        this.IIIIlll = this.IlIIII(this.IlIII(n4 ^ 0x33CC)) * ((float)Math.PI * 2);
        this.IlIlIII = this.IlIIII(this.IlIII(n4 ^ 0xCC33)) * ((float)Math.PI * 2);
        this.IllIlI = this.IlIIII(this.IlIII(n4 ^ 0x6996)) * ((float)Math.PI * 2);
        this.lIlll = true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block27: {
                block29: {
                    block26: {
                        block28: {
                            block32: {
                                block31: {
                                    var6 = 14075;
                                    ** GOTO lbl70
lbl3:
                                    // 1 sources

                                    while (true) {
                                        var13_4 = -1;
                                        ** GOTO lbl78
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    AimAssist.Illllll[var4_9] = var5_10 ^= var2_7;
                                    var3_8 += 4;
                                    if (++var4_9 < var1_6) break block31;
                                    break block32;
lbl14:
                                    // 1 sources

                                    while (true) {
                                        AimAssist.lIIIIII = var9_3;
                                        ** GOTO lbl89
                                        break;
                                    }
lbl17:
                                    // 1 sources

                                    while (true) {
                                        break block26;
                                        break;
                                    }
                                }
lbl20:
                                // 2 sources

                                while (true) {
                                    var5_10 = (var0_5[var3_8] & 255) << 24 | (var0_5[var3_8 + 1] & 255) << 16 | (var0_5[var3_8 + 2] & 255) << 8 | var0_5[var3_8 + 3] & 255;
                                    ** continue;
                                    break;
                                }
lbl23:
                                // 1 sources

                                while (true) {
                                    var9_3 = new String[var8_2.length];
                                    ** continue;
                                    break;
                                }
lbl26:
                                // 5 sources

                                while (true) {
                                    var16_16 = v0;
                                    ** GOTO lbl86
                                    break;
                                }
lbl29:
                                // 2 sources

                                while (true) {
                                    var12_13 = var8_2[var10_11];
                                    ** GOTO lbl56
                                    break;
                                }
lbl32:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                var12_13 = '\u0000';
                                if (var13_4 != 0) ** GOTO lbl29
                                ** while (true)
lbl37:
                                // 1 sources

                                while (true) {
                                    var11_12 = 0;
                                    ** continue;
                                    break;
                                }
lbl40:
                                // 1 sources

                                while (true) {
                                    break block27;
                                    break;
                                }
                                var3_8 = 0;
                                var4_9 = 0;
                                ** while (true)
lbl45:
                                // 1 sources

                                while (true) {
                                    AimAssist.IIIIIII = StringFactory.IIII("legs");
                                    ** GOTO lbl62
                                    break;
                                }
lbl48:
                                // 1 sources

                                block19: while (true) {
                                    switch (var15_15 % 5) {
                                        case 2: {
                                            v0 = 62;
                                            ** GOTO lbl26
                                        }
lbl53:
                                        // 1 sources

                                        while (true) {
                                            AimAssist.IlIlll = StringFactory.IIII("chest");
                                            ** continue;
                                            break;
                                        }
lbl56:
                                        // 1 sources

                                        var14_14 = var7_1.substring(var11_12, var11_12 + var12_13).toCharArray();
                                        var15_15 = 0;
                                        continue block19;
lbl59:
                                        // 1 sources

                                        while (true) {
                                            var0_5 = "\u00bc\u008e\u0007\u0081\b\u000f\u00d2V4\u00d1|\u00f7\u0092\u001cLw\u00ecFC\u00d8\u0001`\u00d1\u00cd\u00d0\u000fK]=0\u00ddY\u00c5\u00e3\u00c3\u00c3?\n\u0091\u00b4Eg'\u00d2\u00dd\u001d\u008a\n.X\u00e8\u0004\u001du}\u009d\f{\u001ey\u0011k=\u00a7\u00b9\u00bfE^&\u00ea\u00ab\u0081\u000e\n\u00a7\u00f7}\u00cd!\u009f\u00ca\u00b6\u0084k\u00e3\u0099R\u00df\u00dd+~9\u00b9V\u0091\u001d\u0012,\u0001\u00cb\u0094\u00e6\u00fe}".getBytes("ISO-8859-1");
                                            break block28;
                                            break;
                                        }
lbl62:
                                        // 1 sources

                                        AimAssist.llII = List.of(new IlllIll(AimAssist.IlllI, (Object)AimAssist.IlllI), new IlllIll(AimAssist.IlIlll, (Object)AimAssist.IlIlll), new IlllIll(AimAssist.IIIIIII, (Object)AimAssist.IIIIIII));
                                        return;
                                        default: {
                                            v0 = 27;
                                            ** GOTO lbl26
                                        }
                                        case 4: {
                                            v0 = 46;
                                            ** GOTO lbl26
                                        }
lbl70:
                                        // 1 sources

                                        var7_1 = "\u4539\u458e\u4554\u450c\u45f3\u45b4\u4583\u456e\udcd8\udc16\udc8d\udcef\udc13\udc65\udc69\udc89\u9c68\u9cd8\u9c02\u9c58\u9ca2\u9cd4\u9cd5\u9c38\u485d\u48e4\u4859\u487a\u48d7\u48cb\u48ac\u486c\u485f\u480c\u4878\u485a\u4805\u4830\u48f9\u4897\u3f22\u3ff0\u3f7f\u3f39\u3ff4\u3f83\u3f8e\u3f34\u3f2d\u3f4e\u3f0c\u3f3c\u3f71\u3f43\u3fcf\u3f87\u3f66\u3fae\u3fc7\u3f38\u3f99\u3f58\u3f6b\u3fbb\u3f30\u3ff7\u3f31\u3f7e\u3fe4\u3ffb\u3f59\u3f36\u3f1e\u3fd2\u3f40\u3f11\u3f86\u3f93\u3fdb\u3f16\u3f23\u3f33\u3f36\u3f62\u3f4a\u3f70\u3f92\u3fad\u3f32\u3fee\u3fcf\u3f43\u3f91\u3f4f\u3f7d\u3f9e\u3f44\u3f96\u3f7b\u3f4e\u3faa\u3f85\u3f31\u3f61\u3f0c\u3ffd\u3f72\u3f6c\u535b\u53e3\u531b\u5376\u538e\u53d9\u53fe\u5313\uecab\uec05\ueccf\uec96\uec78\uec06\uec4d\uec9c\uecba\uecc1\uec99\uecb7\uecf8\uecca\uec5a\uec66\u3fa4\u3f33\u3fc3\u3fbc\u3f74\u3f0a\u3f4e\u3fe9\u2991\u293a\u2980\u29c8\u3549\u35db\u350b\u355e\u6eb2\u6e00\u6eda\u6e80\u1f40\u1f93\u1f33\u1f7e\u1f90\u1fc4\u1fb9\u1f61\u1f45\u1f2f\u1f67\u1f3b\u2ee1\u2e33\u2ebc\u2efa\u2e37\u2e40\u2e4d\u2ef7\u2eee\u2ea4\u2efa\u2ee2\u2eb2\u2ebe\u2e41\u2e2f\u4503\u45f7\u454d\u4505\u3591\u3547\u35ef\u35bf\u3543\u3525\u3579\u3582\u359b\u35c1\u35ad\u3596\u813a\u81ce\u8174\u813c\uff65\ufff2\uff12\uff4a\uffb6\uffc4\uffc9\uff70\uff6a\uff30\uff5f\uff7b\uff21\uff07\uffa2\uffc3\uff23\uffb6\ufffe\uff27\u6438\u649b\u6477\u6461\uabac\uab15\uaba8\uab8b\uab26\uab3a\uab04\uab9e\uaba8\uabd7\uabaf\uabaa\ue1f1\ue105\ue1bf\ue1f7\u8d6a\u8dc5\u8d0f\u8d70\u8db8\u8df8\u8d99\u8d72\u8d6e\u8d2d\u8d73\u8d4f\u8d3e\u8d74\u8dc5\u8da6\u09a6\u0952\u09e8\u09a0\ub006\ub0ab\ub006\ub03e\ub0d5\ub0a8\ub0de\ub02e\ub008\ub043\ub042\ub004\ub053\ub074\ub0da\ub0c8\ua8d5\ua821\ua89b\ua8d3\uc65a\uc6f7\uc603\uc675\uc68f\uc6de\uc6bf\uc66c\uc65c\uc646\uc655\uc628\uc60c\uc602\uc689\uc6e8\udf61\udfcc\udf09\udf4d\udfb1\udfcc\udfb6\udf4a\udf62\udf1d\udf5f\udf66\udf37\udf13\udf87\udfc0\udf23\udfb2\udfeb\udf7f\udfdb\udf7c\udf73\udf84\uf6c2\uf613\uf6b6\uf6ee\uf616\uf655\uf606\uf6eb\uf6d3\uf6a8\uf6f8\uf6dd\uf697\uf6a0\uf605\uf60f\u21b6\u2160\u21eb\u21af\u2161\u211c\u2166\u219a\u2186\u21cd\u2193\u2195\u21f5\u21d6\u211a\u210a\u21ff\u2148\u2166\u2183\u2108\u219a\u21a3\u2154\uaf05\uafbc\uaf58\uaf21\uafd7\uafa0\uafa8\uaf29\uaf30\uaf5b\uaf06\uaf14\uaf52\uaf46\uafad\uafa3\uaf47\uaf8c\uaffe\uaf43\u0caf\u0c7d\u0cf2\u0c80\u0c78\u0c1e\u0c02\u0ce2\ud584\ud52b\ud5c3\ud5a6\ud556\ud512\ud559\ud5ac\ud587\ud59a\ud589\ud5f1\ud5d3\ud5f4\ud55d\ud511\ud5d7\ud51d\ud55a\ud5a8\ud53e\ud5a6\ud5ef\ud560\u8c6c\u8cc3\u8c2b\u8c4e\u8cbe\u8cfe\u8c9f\u8c2f\u8c6e\u8c11\u8c53\u8c7c\u51e2\u515b\u51e6\u51c5\u5168\u5173\u5117\u51d0\u51e6\u5199\u51df\u51e6\u51b3\u5197\u510f\u5154\ua8ee\ua844\ua89e\ua8d3\ua867\ua87c\ua84d\ua8ce\ua8ef\ua8ac\ua8c8\ua8f8\ua8bf\ua8b1\ua80c\ua879\ua8b8\ua876\ua829\ua8ce\ua851\ua893\ua8f6\ua867\ua8cc\ua812\ua8d8\ua88c\udfbd\udf35\udfa9\udfe1\ud14c\ud1e6\ud13c\ud171\ud1c5\ud1de\ud1ef\ud16c\ud14d\ud10e\ud16a\ud15a\ud11d\ud113\ud1ae\ud1db\ud11a\ud1d4\ud18b\ud16c\ud1f3\ud131\ud154\ud1c5\ud16e\ud1b0\ud11f\ud134\ub10d\ub185\ub119\ub151\u11b5\u111f\u11c5\u1188\u113c\u1127\u116d\u1195\u11b7\u11ae\u11bd\u119c\u11e5\u11c3\u111e\u1110\u11f3\u1172\u1127\u11a9\u110c\u11c4\u11f7\u115c\u11aa\u1149\u119f\u11b2\uc348\uc3e2\uc338\uc375\uc3c1\uc3da\uc390\uc368\uc34a\uc353\uc340\uc361\uc318\uc33e\uc3e3\uc3ed\uc30e\uc38f\uc3da\uc354\uc3f1\uc339\uc30a\uc3a1\uc359\uc3b7\uc37a\uc34f\u89c6\u896c\u89b6\u89fb\u894f\u8954\u8930\u89d4\u89c4\u89ae\u899c\u89e1\u8986\u89a2\u8930\u896b\u898c\u8911\u8915\u89d8\u8979\u89c4\u8998\u8948\u89c7\u892c\u89e0\u89ad\u8902\u891f\u89bf\u89b8\ubb23\ubb89\ubb53\ubb1e\ubbaa\ubbb1\ubbd5\ubb31\ubb21\ubb4b\ubb79\ubb04\ubb63\ubb47\ubbd5\ubb8e\ubb69\ubbf4\ubbf0\ubb3d\ubb9c\ubb21\ubb7d\ubbad\ubb22\ubbc9\ubb05\ubb40\ubbe4\ubbdc\ubb5a\ubb5d\u517c\u51d6\u510c\u5141\u51f5\u51e9\u5192\u5169\u517a\u5104\u5146\u5169\u513c\u5118\u518a\u51d1\u5136\u51ab\u51af\u5162\u51c3\u517e\u5122\u51f2\u517d\u5196\u515a\u5117\u51b8\u51a5\u5105\u5102\u8795\u873f\u87e5\u87a8\u871c\u8700\u877b\u8780\u8793\u87ed\u87af\u8780\u87d5\u87f1\u8763\u8738\u87df\u8742\u8746\u878b\u872a\u8797\u87cb\u871b\u8794\u877f\u87b3\u87f6\u8752\u876a\u87ec\u87eb\u4b8a\u4b20\u4bfa\u4bb7\u4b03\u4b1f\u4b21\u4bbb\u4b8d\u4bf2\u4b8a\u4b8f\u262c\u2687\u263d\u2675\ue9f9\ue953\ue989\ue9c4\ue970\ue96c\ue952\ue9c8\ue9fe\ue981\ue9f9\ue9fc\ue9b9\ue99a\ue90f\ue941\ue9b8\ue939\ue914\ue9cd\ue940\ue984\ue9b3\ue97d\ue9ea\ue90e\ue9a7\ue9fe\u153f\u1595\u154f\u1502\u15b6\u15ad\u15d5\u150c\u1539\u1544\u1534\u1526\u1566\u1560\u15e7\u159a\u1575\u15c2\u15c7\u157a\uc93f\uc995\uc94f\uc902\uc9b6\uc9ad\uc9d5\uc92e\uc93a\uc947\uc92b\uc92d\u8a08\u8aa2\u8a78\u8a35\u8a81\u8a9a\u8aa3\u8a3e\u8a0f\u8a73\u8a10\u8a1c\u8a5a\u8a69\u8aab\u8aca\u8a48\u8a82\u8ae5\u8a21\u8ab2\u8a1a\u8a13\u8ae9\u8e7a\u8ed0\u8e0a\u8e47\u8ef3\u8ee8\u8ed1\u8e4c\u8e7d\u8e01\u8e62\u8e6e\u8e28\u8e1b\u8ed9\u8eba\u8e39\u8ebd\u8ea1\u8e4e\u8ec5\u8e7b\u8e26\u8e9b\u289d\u2837\u28ed\u28a0\u2814\u2808\u285d\u28a8\u289b\u28e6\u28da\u2899\u28cf\u28f8\u2845\u283e\u28d8\u2859\u2801\u28d8\u4248\u42e2\u4238\u4275\u42c1\u42dd\u4280\u425a\u424d\u4215\u420f\u4250\u4208\u422c\u42eb\u42e5\u420d\u4288\u42ad\u4252\u42af\u4272\u4216\u42f7\u4259\u42b4\u4262\u4213\u428e\u42a7\u4231\u4236\u7e9e\u7e34\u7eee\u7ea3\u7e17\u7e0b\u7e56\u7e8c\u7e9b\u7ec3\u7ed9\u7e86\u7ede\u7efa\u7e3d\u7e33\u7edb\u7e5e\u7e7b\u7e84\u7e79\u7ea4\u7ee2\u7e26\u7e8e\u7e5f\u7ec0\u7e99\ufc9e\ufc34\ufcee\ufca3\ufc17\ufc0b\ufc56\ufc8c\ufc9b\ufcc3\ufcd9\ufc86\ufcde\ufcfa\ufc3d\ufc33\ufcdb\ufc5e\ufc7b\ufc84\ufc79\ufca4\ufce2\ufc14\ufc8d\ufc79\ufcc0\ufc99\uc713\uc7b9\uc763\uc72e\uc79a\uc786\uc7db\uc701\uc716\uc74e\uc754\uc70b\uc753\uc777\uc7b0\uc7be\uc756\uc7d3\uc7f6\uc709\uc7f4\uc729\uc741\uc78d\uc706\uc7c5\uc740\uc767\uc7d8\uc7f7\uc76f\uc703\u0371\u03db\u0301\u034c\u03f8\u03e4\u039f\u0364\u0377\u0309\u034b\u0364\u0331\u0315\u0393\u03e4\u0337\u03b6\u03ff\u036b\uf57d\uf5d7\uf50d\uf540\uf5f4\uf5ef\uf597\uf56b\uf575\uf52f\uf543\uf578\uf52f\uf51c\uf5de\uf5f8\uf53b\uf580\uf590\uf556\uf5c4\uf542\uf56b\uf59c\u0fa3\u0f09\u0fd3\u0f9e\u0f2a\u0f36\u0f6f\u0f8d\u0fa6\u0ff1\u0fb4\u0fba\u0fff\u0fb9\u0f41\u0f0e\u0fe0\u0f29\u0f5b\u0fe6\ua187\ua108\ua1eb\ua1ab\ua150\ua100\ua171\ua1c0\ua182\ua1ff\ua1b1\ua195\ua1d3\ua1d8\ua129\ua14e\u8754\u8786\u8700\u8768\u8783\u87f4\u87bc\u8771\uf90f\uf9c5\uf960\uf92f\uf9c3\uf983\uf9c8\uf93d\uf916\uf94d\uf959\uf96c\u520b\u52c1\u5264\u522b\u52c7\u5287\u52cc\u5239\u5212\u5249\u525d\u5268";
                                        break block29;
lbl72:
                                        // 1 sources

                                        while (true) {
                                            var13_4 = 0;
                                            ** GOTO lbl78
                                            break;
                                        }
lbl75:
                                        // 1 sources

                                        while (true) {
                                            AimAssist.Illllll = new int[var1_6];
                                            ** continue;
                                            break;
                                        }
lbl78:
                                        // 2 sources

                                        var10_11 = 0;
                                        ** continue;
lbl80:
                                        // 1 sources

                                        while (true) {
                                            var9_3[var10_11] = new String(var14_14).intern();
                                            break block30;
                                            break;
                                        }
lbl83:
                                        // 1 sources

                                        while (true) {
                                            var2_7 = 195363930;
                                            ** continue;
                                            break;
                                        }
lbl86:
                                        // 1 sources

                                        v1 = var15_15++;
                                        var14_14[v1] = (char)(var14_14[v1] ^ var16_16 ^ var6);
                                        ** continue;
lbl89:
                                        // 1 sources

                                        AimAssist.lIIIIIl = new Object[var9_3.length];
                                        ** continue;
                                        case 1: {
                                            v0 = 98;
                                            ** GOTO lbl26
                                        }
                                        case 3: 
                                    }
                                    break;
                                }
                                v0 = 52;
                                ** while (true)
                            }
                            AimAssist.IlllI = StringFactory.IIII("head");
                            ** while (true)
                        }
                        var1_6 = var0_5.length / 4;
                        ** while (true)
                    }
                    if (++var10_11 >= var8_2.length) ** break;
                    ** while (true)
                    ** while (true)
                }
                var8_2 = "\b\b\b\u0010D\b\u0010\b\u0004\u0004\u0004\f\u0010\u0004\f\u0004\u0014\u0004\f\u0004\u0010\u0004\u0010\u0004\u0010\u0018\u0010\u0018\u0014\b\u0018\f\u0010\u001c\u0004\u001c\u0004\u001c\u001c    \f\u0004\u001c\u0014\f\u0018\u0018\u0014 \u001c\u001c \u0014\u0018\u0014\u0010\b\f\f".toCharArray();
                ** while (true)
            }
            if (var15_15 >= var14_14.length) ** break;
            ** while (true)
            ** while (true)
        }
        var11_12 += var12_13;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private Vec3d llII(MinecraftClient var1_1, Vec3d var2_2, Vec3d var3_3, LivingEntity var4_4) {
        block19: {
            block20: {
                block22: {
                    block28: {
                        block21: {
                            block26: {
                                block27: {
                                    block30: {
                                        block31: {
                                            block24: {
                                                block29: {
                                                    block25: {
                                                        block23: {
                                                            break block27;
lbl1:
                                                            // 3 sources

                                                            while (true) {
                                                                v0 = false;
                                                                break block19;
                                                                break;
                                                            }
lbl4:
                                                            // 1 sources

                                                            while (var2_2.squaredDistanceTo(var17_15) > var5_5 * var5_5) {
                                                                ** GOTO lbl14
                                                            }
                                                            break block28;
lbl7:
                                                            // 2 sources

                                                            while (!AimAssist.IlIll(var17_15)) {
                                                                ** GOTO lbl14
                                                            }
                                                            ** GOTO lbl4
lbl10:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
lbl12:
                                                            // 1 sources

                                                            while (true) {
                                                                var12_11 = var17_15;
lbl14:
                                                                // 6 sources

                                                                while (var15_13.hasNext()) {
                                                                    break block20;
                                                                }
                                                                break block21;
                                                                break;
                                                            }
lbl17:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_7 = this.lIIlI.IIl(AimAssist.IlllI);
                                                                break block22;
                                                                break;
                                                            }
lbl20:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
lbl22:
                                                                // 1 sources

                                                                while (true) {
                                                                    var22_19 = (double)var19_17 + var24_20 * 1.8 + Math.sqrt(var20_18) * 1.1;
                                                                    ** GOTO lbl35
                                                                    break;
                                                                }
                                                                break;
                                                            }
lbl25:
                                                            // 1 sources

                                                            while (true) {
                                                                if (!var9_8) ** GOTO lbl1
                                                                break block23;
                                                                break;
                                                            }
lbl28:
                                                            // 1 sources

                                                            while (true) {
                                                                v1 = var18_16;
                                                                break block24;
                                                                break;
                                                            }
                                                            var18_16 = IIlllllIl.IlIllll(var4_4, var16_14);
                                                            break block29;
lbl33:
                                                            // 1 sources

                                                            while (true) {
                                                                var22_19 = var20_18;
lbl35:
                                                                // 2 sources

                                                                if (!(var22_19 < var13_12)) ** GOTO lbl14
                                                                break block25;
                                                                break;
                                                            }
lbl37:
                                                            // 1 sources

                                                            while (true) {
                                                                var24_20 = Math.sqrt(this.IlllII(var2_2, var3_3, var17_15));
                                                                ** continue;
                                                                break;
                                                            }
                                                        }
                                                        if (!var10_9) ** GOTO lbl1
                                                        break block30;
                                                    }
                                                    var13_12 = var22_19;
                                                    ** while (true)
                                                }
                                                var19_17 = this.llIlII(var1_1, var2_2, var17_15);
                                                ** while (var18_16 != null)
lbl49:
                                                // 1 sources

                                                break block31;
lbl50:
                                                // 1 sources

                                                while (((Boolean)this.llIlll.lIl()).booleanValue()) {
                                                    ** continue;
lbl52:
                                                    // 1 sources

                                                    ** GOTO lbl10
                                                }
                                                ** GOTO lbl7
lbl54:
                                                // 1 sources

                                                while (true) {
                                                    break block26;
                                                    break;
                                                }
lbl56:
                                                // 1 sources

                                                while (true) {
                                                    var17_15 = IIlllllIl.IlIllIl(var4_4, var16_14);
                                                    ** GOTO lbl50
                                                    break;
                                                }
                                            }
lbl60:
                                            // 2 sources

                                            while (true) {
                                                var17_15 = this.lIlIII(var17_15, v1, 0.05f, var19_17);
                                                ** GOTO lbl7
                                                break;
                                            }
                                        }
                                        v1 = var4_4.getBoundingBox();
                                        ** while (true)
lbl66:
                                        // 1 sources

                                        while (true) {
                                            if (var8_7) ** break;
                                            ** continue;
                                            ** continue;
                                            break;
                                        }
lbl70:
                                        // 1 sources

                                        while (true) {
                                            var13_12 = Infinity;
                                            var15_13 = IIlllllIl.IllIIIl(var8_7, var9_8, var10_9).iterator();
                                            ** GOTO lbl14
                                            break;
                                        }
                                        var19_17 = this.lIIlIl(var3_3, (Vec3d)var18_16);
                                        ** while (!(var19_17 > var7_6 + 2.0f))
lbl76:
                                        // 1 sources

                                        ** GOTO lbl14
                                    }
                                    v0 = true;
                                    break block19;
                                }
                                var5_5 = (Double)this.IIIllIl.lIl();
                                var7_6 = this.IIlII();
                                ** while (true)
                            }
                            var20_18 = var2_2.squaredDistanceTo(var17_15);
                            ** while (!var11_10)
lbl87:
                            // 1 sources

                            ** while (true)
                        }
                        return var12_11;
                    }
                    var18_16 = var17_15.subtract(var2_2);
                    ** while (true)
                }
                var9_8 = this.lIIlI.IIl(AimAssist.IlIlll);
                var10_9 = this.lIIlI.IIl(AimAssist.IIIIIII);
                ** while (true)
            }
            var16_14 = var15_13.next();
            ** while (true)
        }
        var11_10 = v0;
        var12_11 = null;
        ** while (true)
    }

    private void llIl() {
        this.IllIII = 0.0f;
        this.IlIIIII = 0.0f;
    }

    private float lllI() {
        return this.llIll(3.0f, 6.5f, this.l());
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IIIII(float f, float f2) {
        double d = Math.toRadians(f);
        double d2 = Math.toRadians(f2);
        double d3 = Math.cos(d2);
        return new Vec3d(-Math.sin(d) * d3, -Math.sin(d2), Math.cos(d) * d3).normalize();
    }

    private float IIIIl(lIlIIlI lIlIIlI2) {
        return ((Double)lIlIIlI2.lIl()).floatValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIlI(Entity entity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (entity != minecraftClient.player) return false;
        if (!this.lIlllI()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIll() {
        this.llIl();
        this.IIIlIll = 0;
        this.IIllll = 0;
        this.llllIl = null;
        this.lIllI = -1;
        this.lIIIIl = 0.0f;
        this.IllIIl = 0L;
        this.IIIlII = 0L;
        this.IlIIlIl = 0L;
        this.IIIIllI = 0.0f;
        this.IIlllIl.I();
        this.lIIIl.I();
        this.lIllll.I();
        this.IlIIIl = 0.0f;
        this.IIIIIlI = 1.0f;
        this.IIIII = 0.0f;
        this.lIlllI = 0.0f;
        this.IIlII = 0.0f;
        this.llIIl = 0L;
    }

    private float IIlII() {
        return MathHelper.clamp((float)(((Double)this.I.lIl()).floatValue() * 0.5f), (float)0.5f, (float)180.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIlIl(float f) {
        this.lllIl += Math.max(0.0f, f) * 2.1f;
        while (true) {
            if (!(this.lllIl >= 1.0f)) {
                float f2 = MathHelper.clamp((float)this.lllIl, (float)0.0f, (float)1.0f);
                float f3 = f2 * f2 * (3.0f - 2.0f * f2);
                return MathHelper.lerp((float)f3, (float)this.llIl, (float)this.llIIll) * 0.0035f;
            }
            this.lllIl -= 1.0f;
            this.llIl = this.llIIll;
            this.llIIll = ThreadLocalRandom.current().nextFloat() * 2.0f - 1.0f;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float IIllI(long l2) {
        if (this.IllIIl == 0L) {
            return 0.05f;
        }
        float f = (float)(l2 - this.IllIIl) / 1.0E9f;
        return MathHelper.clamp((float)f, (float)0.0033333334f, (float)0.055555556f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlll(float f, float f2) {
        this.IIlIIll = true;
        this.llIlIl = f;
        this.IlIIIll = this.Illl(f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IlIII(int n) {
        int n2 = n;
        n2 ^= n2 << 13;
        n2 ^= n2 >>> 17;
        n2 ^= n2 << 5;
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IlIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) {
            return null;
        }
        if (this.IIllI) {
            return this.IIIII(this.lIIllI, this.llllII);
        }
        if (minecraftClient.gameRenderer == null) return this.lIllll(minecraftClient);
        if (minecraftClient.gameRenderer.getCamera() == null) return this.lIllll(minecraftClient);
        Camera camera = minecraftClient.gameRenderer.getCamera();
        return this.IIIII(camera.getYaw(), camera.getPitch());
    }

    private float IlIlI(int n, int n2, int n3) {
        float f = this.IlIIII(this.IlIII(n * 53 + n3 * 29 + n2 * 5));
        return this.llIll(0.18f, 0.65f, f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IlIll(Vec3d vec3d) {
        if (vec3d == null) return false;
        if (!Double.isFinite(vec3d.x)) return false;
        if (!Double.isFinite(vec3d.y)) return false;
        if (!Double.isFinite(vec3d.z)) return false;
        return true;
    }

    private float IllII(float f, float f2, float f3) {
        if (f < f2) {
            return Math.min(f + f3, f2);
        }
        return Math.max(f - f3, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIlIIIlI IllIl(MinecraftClient minecraftClient, LivingEntity livingEntity, lllllI lllllI2, boolean bl) {
        if (!this.IIlIlI(minecraftClient, livingEntity)) {
            return null;
        }
        if (this.Illlll.lIl() != orchard.internal.lIlIll.ll) return this.lIllIl.Ill(minecraftClient, livingEntity, lllllI2, bl, (Boolean)this.IIllII.lIl());
        Vec3d vec3d = this.IlIIl(minecraftClient);
        if (vec3d != null) return this.lIllIl.IIlIIIl(minecraftClient, livingEntity, lllllI2, bl, (Boolean)this.IIllII.lIl(), minecraftClient.player.getEyePos(), vec3d);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IlllI(float f, float f2) {
        float f3 = this.IIIIll();
        float f4 = MathHelper.clamp((float)((0.05f + (1.0f - f3) * 0.11f + f * 0.08f) * f2), (float)0.035f, (float)0.26f);
        if (!this.lIIlII()) return f4;
        return MathHelper.clamp((float)(f4 *= this.lllII()), (float)0.08f, (float)0.72f);
    }

    private float Illll(float f, float f2) {
        float f3 = this.IIIIll();
        return MathHelper.clamp((float)(0.024f + f3 * 0.038f + (1.0f - f2) * 0.09f - f * 0.018f), (float)0.024f, (float)0.14f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public AimAssist(IlIlIlIII ilIlIlIII) {
        super(StringFactory.IIl("uZ1Z3DhEQxWEHA=="), Category.II, StringFactory.IIl("q5lbkw1fXAXXGIpVA8Ceh5eBRtwaRV8PhACeUB2TypGPlUaYChdREtcHj0kA3duQjA=="));
        llIlIlI llIlIlI2;
        this.Illlll = this.IIlllIl(new IIIIIIIIl<lIlIll>("Target Mode", lIlIll.class, orchard.internal.lIlIll.ll));
        this.IIIllIl = this.IIlllIl(new lIlIIlI("Range", 3.65, 1.0, 8.0, 0.05).IIIl("m"));
        this.I = this.IIlllIl(new lIlIIlI("FOV", 180.0, 2.0, 360.0, 1.0).IIIl("deg"));
        this.Ill = this.IIlllIl(new lIlIIlI("Strength", 100.0, 1.0, 100.0, 1.0));
        this.IIlIlI = this.IIlllIl(new lIlIIlI("Smoothness", 100.0, 0.0, 100.0, 1.0).IIIl("%"));
        this.IlIIlll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Overshoot"), 15.0, 0.0, 100.0, 1.0).IIII(StringFactory.IIII("%")));
        this.IIlIIl = this.IIlllIl(new lIlIIlI("Reaction Time", 195.0, 0.0, 500.0, 5.0).IIIl("ms"));
        this.IIIIIl = this.IIlllIl(new lIlIIlI("Aim Drift", 26.0, 0.0, 100.0, 1.0).IIIl("%"));
        this.IIlllll = this.IIlllIl(new lIlIIlI("Hand Tremor", 39.0, 0.0, 100.0, 1.0).IIIl("%"));
        this.lIl = this.IIlllIl(new lIlIIlI("Pitch Ratio", 65.0, 0.0, 100.0, 1.0).IIIl("%"));
        this.llIIII = this.IIlllIl(new llIll("Players Only", true));
        this.IIllII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Track invisibles"), false));
        this.ll = this.IIlllIl(new llIll("Weapon Only", true));
        this.lll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Click Aim Assist"), false));
        this.IlII = this.IIlllIl(new llIll("Allow Override", true));
        this.llIlll = this.IIlllIl(new llIll("Smart", false));
        this.lIIlII = this.IIlllIl(new llIll("Holding Bind Only", false));
        this.lllll = this.IIlllIl(new lIIllII("Hold Bind"));
        llIlIlI2(IIlllllIl.IlllllI, llII, Set.of(IlllI));
        this.lIIlI = this.IIlllIl(llIlIlI2);
        this.IlllIl = this.IIlllIl(new IIIIIIIIl<lIIIlll>(StringFactory.IIl("uZ1Z3ClFWROFAYtA"), lIIIlll.class, lIIIlll.Il));
        this.lIll = new lIlIIlI("Dev Variance Time Min", 0.12, 0.02, 5.0, 0.01).IIIl("s");
        this.II = new lIlIIlI("Dev Variance Time Max", 0.58, 0.02, 5.0, 0.01).IIIl("s");
        this.IlIIllI = new lIlIIlI("Dev Yaw Variance Min", 0.86, 0.05, 3.0, 0.01);
        this.IllllI = new lIlIIlI("Dev Yaw Variance Max", 1.2, 0.05, 3.0, 0.01);
        this.IIl = new lIlIIlI("Dev Pitch Variance Min", 0.84, 0.05, 3.0, 0.01);
        this.IllII = new lIlIIlI("Dev Pitch Variance Max", 1.18, 0.05, 3.0, 0.01);
        this.III = new lIlIIlI("Dev Blend Variance Min", 0.88, 0.05, 3.0, 0.01);
        this.IIlIIlI = new lIlIIlI("Dev Blend Variance Max", 1.16, 0.05, 3.0, 0.01);
        this.IIlIllI = new lIlIIlI("Dev Drift", 0.12, 0.0, 1.0, 0.01).IIIl("m");
        this.lIIlll = new lIlIIlI("Dev Drift Frequency", 1.02, 0.0, 5.0, 0.01);
        this.IlIlIl = new lIlIIlI("Dev Step Noise", 0.82, 0.0, 5.0, 0.01);
        this.IIIIIll = new lIlIIlI("Dev Shake", 0.48, 0.0, 5.0, 0.01);
        this.IIIlIl = new lIlIIlI("Dev Twitch Chance", 0.34, 0.0, 5.0, 0.01);
        this.IIll = new lIlIIlI("Dev Twitch Amount", 0.5, 0.0, 5.0, 0.01);
        this.IIIlll = new lIlIIlI("Dev Overshoot", 0.16, 0.0, 2.0, 0.01);
        this.IIIIII = new lIlIIlI("Dev Micro Pause Chance", 0.3, 0.0, 5.0, 0.01);
        this.IIIIll = new lIlIIlI("Dev Micro Pause Min", 0.46, 0.0, 1.0, 0.01);
        this.IIllIIl = new lIlIIlI("Dev Micro Pause Max", 0.82, 0.0, 1.0, 0.01);
        this.IIII = new lIlIIlI("Dev Micro Pause Duration", 0.62, 0.0, 5.0, 0.01);
        this.IIIl = new lIlIIlI("Dev Blend Scale", 1.0, 0.0, 3.0, 0.01);
        this.IIlIlll = new lIlIIlI("Dev Smooth Scale", 1.0, 0.05, 4.0, 0.01);
        this.lllIII = new lIlIIlI("Dev Lock Scale", 1.0, 0.05, 3.0, 0.01);
        this.IIllllI = this.IIlllIl((llIll)((IIllIl)new llIll("Free Camera", false).lIII(this::lIIlII)).llll());
        this.lIllI = -1;
        this.IIlllIl = new IllIlIlI();
        this.lIIIl = new IllIlIlI();
        this.lIllll = new IllIlIlI();
        this.llIl = ThreadLocalRandom.current().nextFloat() * 2.0f - 1.0f;
        this.llIIll = ThreadLocalRandom.current().nextFloat() * 2.0f - 1.0f;
        this.llIlI = ThreadLocalRandom.current().nextFloat() * 2.0f - 1.0f;
        this.lllIlI = ThreadLocalRandom.current().nextFloat() * 2.0f - 1.0f;
        this.IIIII = 0.0f;
        this.lIlllI = 0.0f;
        this.IIlII = 0.0f;
        this.IlIIlII = (float)(Math.random() * 6.2831853);
        this.IIlIl = (float)(Math.random() * 6.2831853);
        this.lIlIIl = 1.0f;
        this.IlllII = 1.0f;
        this.IIIIIlI = 1.0f;
        this.lIIlIl = (float)(Math.random() * 6.2831853);
        this.IIlll = (float)(Math.random() * 6.2831853);
        this.llllI = (float)(Math.random() * 6.2831853);
        this.lIIIII = 1.0f;
        this.lIlIl = 1.0f;
        this.lIIIll = 1.0f;
        this.IlIIIIl = 1.0f;
        this.IIlllI = (float)(Math.random() * 6.2831853);
        this.lIllIl = new IlIlIlI();
        this.IIIIIIl = ilIlIlIII;
        this.lllll.lIII(this.lIIlII::lIl);
        this.llI();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean lIIIl(Illll illll) {
        if (illll == null) return false;
        if (((lIIIlll)((Object)this.IlllIl.lIl())).lI != illll) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIlI() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        KnockbackDisplacement knockbackDisplacement = clientEntrypoint.IlI().IIllIIl();
        if (knockbackDisplacement == null) return false;
        if (!knockbackDisplacement.IIIlIIl()) return false;
        if (!knockbackDisplacement.IIII()) return false;
        return true;
    }

    public float lIIll(float f) {
        return MathHelper.lerp((float)f, (float)this.Illl, (float)this.llllII);
    }

    public float lIlII(float f) {
        return MathHelper.lerpAngleDegrees((float)f, (float)this.lIIIlI, (float)this.lIIllI);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int lIlIl(float f, float f2, float f3, int n, boolean bl) {
        if (Math.abs(f3) <= 0.01f) {
            return 0;
        }
        float f4 = bl ? MathHelper.wrapDegrees((float)(f - f2)) : f - f2;
        if (!(Math.abs(f4) >= 0.8f)) return Math.max(0, n - 1);
        if (Math.signum(f4) == Math.signum(f3)) return Math.max(0, n - 1);
        return 4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIIllIII lIllI(MinecraftClient minecraftClient, LivingEntity livingEntity, boolean bl) {
        block6: {
            float f;
            float f2;
            double d;
            Vec3d vec3d;
            Vec3d vec3d2;
            Vec3d vec3d3;
            block7: {
                block5: {
                    if (!this.IIlIlI(minecraftClient, livingEntity)) {
                        return null;
                    }
                    vec3d3 = minecraftClient.player.getEyePos();
                    vec3d2 = this.Illlll.lIl() != orchard.internal.lIlIll.ll ? this.lIllll(minecraftClient) : this.IlIIl(minecraftClient);
                    if (!AimAssist.IlIll(vec3d2)) {
                        return null;
                    }
                    vec3d = this.llII(minecraftClient, vec3d3, vec3d2, livingEntity);
                    if (!AimAssist.IlIll(vec3d)) break block5;
                    double d2 = (Double)this.IIIllIl.lIl();
                    d = vec3d3.squaredDistanceTo(vec3d);
                    if (d > d2 * d2) break block6;
                    Vec3d vec3d4 = vec3d.subtract(vec3d3);
                    double d3 = Math.sqrt(vec3d4.x * vec3d4.x + vec3d4.z * vec3d4.z);
                    if (d3 <= 1.0E-4) {
                        return null;
                    }
                    float f3 = (float)(Math.toDegrees(Math.atan2(vec3d4.z, vec3d4.x)) - 90.0);
                    float f4 = this.Illl((float)(-Math.toDegrees(Math.atan2(vec3d4.y, d3))));
                    float f5 = MathHelper.wrapDegrees((float)(f3 - minecraftClient.player.getYaw()));
                    float f6 = f4 - this.Illl(minecraftClient.player.getPitch());
                    f2 = this.IIlII();
                    f = this.lIIlIl(vec3d2, vec3d4);
                    if (f > f2 + 2.0f) {
                        return null;
                    }
                    break block7;
                }
                return null;
            }
            double d4 = Math.sqrt(this.IlllII(vec3d3, vec3d2, vec3d));
            double d5 = (double)f + d4 * 1.8 + Math.sqrt(d) * 1.1;
            if (bl) {
                d5 -= 2.0;
            }
            float f7 = MathHelper.clamp((float)(f / Math.max(f2, 1.0f)), (float)0.0f, (float)1.0f);
            return new IlIIllIII(livingEntity.getId(), vec3d, f7, d5, Math.sqrt(d), f, livingEntity.getHealth());
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float llIII(float f) {
        float f2 = this.IlIllI();
        float f3 = Math.abs(f);
        float f4 = Math.max(0.0015f, f3 * 0.018f);
        f4 = Math.min(f4, 0.035f);
        if (this.lIII()) {
            return f2 * (f4 *= 0.35f);
        }
        if (!this.lIIlII()) return f2 * f4;
        return f2 * (f4 *= 1.45f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private float llIIl(float f, float f2) {
        float f3;
        if (this.IIIIl(this.lIl) <= 0.0f) {
            return f;
        }
        float f4 = this.Illl(f2);
        if (!(Math.abs(f4 - f) <= 0.0125f)) {
            f3 = f4;
            return f3;
        }
        f3 = f;
        return f3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIlI(ItemStack itemStack) {
        if (itemStack.isEmpty()) {
            return false;
        }
        if (itemStack.getItem() instanceof AxeItem) return true;
        if (!(itemStack.getItem() instanceof MaceItem)) {
            String string = Registries.ITEM.getId((Object)itemStack.getItem()).getPath();
            return string.endsWith("_sword");
        }
        return true;
    }

    private float llIll(float f, float f2, float f3) {
        return MathHelper.lerp((float)MathHelper.clamp((float)f3, (float)0.0f, (float)1.0f), (float)f, (float)f2);
    }

    private float lllII() {
        return this.llIll(1.8f, 2.6f, this.l());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lllIl(MinecraftClient minecraftClient) {
        if (!this.IlIIIl(minecraftClient)) return false;
        if (this.lIllIl(minecraftClient) == null) return false;
        return true;
    }

    private boolean llllI(IlIIllIII ilIIllIII, IlIIllIII ilIIllIII2) {
        return switch (((lIlIll)((Object)this.Illlll.lIl())).ordinal()) {
            case 2 -> this.lIIIll(ilIIllIII.II(), ilIIllIII2.II(), ilIIllIII.ll(), ilIIllIII2.ll(), ilIIllIII.l(), ilIIllIII2.l());
            case 1 -> this.lIIIll(ilIIllIII.ll(), ilIIllIII2.ll(), ilIIllIII.l(), ilIIllIII2.l(), ilIIllIII.II(), ilIIllIII2.II());
            default -> throw new MatchException(null, null);
            case 0, 3 -> this.lIIIll(ilIIllIII.l(), ilIIllIII2.l(), ilIIllIII.ll(), ilIIllIII2.ll(), ilIIllIII.II(), ilIIllIII2.II());
        };
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lllll(float f) {
        if (this.lIII()) {
            return 0.0f;
        }
        if (!(this.IIIII <= 0.2f)) {
            float f2 = Math.max(1.0E-4f, 0.2f);
            float f3 = MathHelper.clamp((float)((this.IIIII - 0.2f) / f2), (float)0.0f, (float)1.0f);
            f3 = f3 * f3 * (3.0f - 2.0f * f3);
            float f4 = MathHelper.clamp((float)(1.0f - f), (float)0.0f, (float)1.0f);
            return f3 * f4;
        }
        return 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        this.llI();
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.IIlIll(minecraftClient, false);
        boolean bl = !this.lIIlI() && this.IlIIIl(minecraftClient);
        this.lIllIl.ll(minecraftClient, this.lll(), bl, !bl ? null : this.lIllIl(minecraftClient), this.lIII());
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIIIII(float f, float f2) {
        if (f2 <= 1.0E-6f) return f;
        if (!Float.isFinite(f2)) return f;
        if (!Float.isFinite(f)) {
            return f;
        }
        float f3 = Math.abs(f);
        if (!(f3 < f2 * 0.5f)) return (float)Math.round(f / f2) * f2;
        return 0.0f;
    }

    private float IIIIIl(lIlIIlI lIlIIlI2, lIlIIlI lIlIIlI3) {
        return Math.max(this.IIIIl(lIlIIlI2), this.IIIIl(lIlIIlI3));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIlI() {
        this.IIlIIll = false;
        this.llIlIl = 0.0f;
        this.IlIIIll = 0.0f;
        this.IIIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIIIll() {
        if (this.lIIlII()) {
            return MathHelper.clamp((float)this.llIll(0.14f, 0.01f, this.l()), (float)0.01f, (float)0.14f);
        }
        float f = MathHelper.clamp((float)this.llIlIl(), (float)1.0f, (float)this.lI());
        float f2 = f / 155.0f;
        return MathHelper.clamp((float)(1.01f - f2), (float)0.01f, (float)1.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlII(MinecraftClient minecraftClient) {
        long l2 = System.currentTimeMillis();
        if (!this.IllllI(minecraftClient)) {
            if (l2 > this.llIIl) return false;
            return true;
        }
        this.llIIl = l2 + 120L;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIIlIl() {
        float f = this.IIIIll();
        float f2 = (1.0f + (1.0f - f) * 1.55f) * 1.12f;
        if (this.lIIlII()) {
            f2 *= this.lllI();
        }
        if (this.lIlIll.lIl() == IlIlIIIIl.l) {
            f2 *= 1.25f;
            return f2;
        }
        if (this.lIlIll.lIl() == IlIlIIIIl.III) {
            return f2 *= 0.82f;
        }
        if (this.lIlIll.lIl() == IlIlIIIIl.Il) {
            return f2 *= 1.55f;
        }
        if (this.lIlIll.lIl() != IlIlIIIIl.lI) return f2;
        return f2 *= 1.75f;
    }

    private void IIIllI(MinecraftClient minecraftClient) {
        if (minecraftClient != null && minecraftClient.player != null) {
            this.IIIll();
            this.IIlll(minecraftClient.player.getYaw(), this.Illl(minecraftClient.player.getPitch()));
            return;
        }
        this.IIIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IIIlll(Vec3d vec3d, LivingEntity livingEntity) {
        Vec3d vec3d2;
        Box box = livingEntity.getBoundingBox();
        vec3d2(MathHelper.clamp((double)vec3d.x, (double)box.minX, (double)box.maxX), MathHelper.clamp((double)vec3d.y, (double)box.minY, (double)box.maxY), MathHelper.clamp((double)vec3d.z, (double)box.minZ, (double)box.maxZ));
        return vec3d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IIlIII(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3) {
        Vec3d vec3d4 = vec3d3.subtract(vec3d2);
        double d = vec3d4.lengthSquared();
        if (!(d <= 1.0E-6)) {
            double d2 = vec3d4.dotProduct(vec3d.subtract(vec3d2)) / d;
            d2 = MathHelper.clamp((double)d2, (double)0.0, (double)1.0);
            return vec3d2.add(vec3d4.multiply(d2));
        }
        return vec3d3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIlIIl() {
        float f = this.IIIIll();
        float f2 = (0.74f + (1.0f - f) * 1.15f) * 1.12f;
        if (this.lIIlII()) {
            f2 *= this.lllI();
        }
        if (this.lIlIll.lIl() == IlIlIIIIl.l) {
            return (f2 *= 1.2f) * 0.42f;
        }
        if (this.lIlIll.lIl() == IlIlIIIIl.III) {
            return (f2 *= 0.84f) * 0.42f;
        }
        if (this.lIlIll.lIl() == IlIlIIIIl.Il) {
            return (f2 *= 1.48f) * 0.42f;
        }
        if (this.lIlIll.lIl() != IlIlIIIIl.lI) return f2 * 0.42f;
        return (f2 *= 1.68f) * 0.42f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIlI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (livingEntity == null) return false;
        if (livingEntity == minecraftClient.player) return false;
        if (!livingEntity.isAlive()) return false;
        if (livingEntity.isRemoved()) {
            return false;
        }
        if (!((Boolean)this.IIllII.lIl()).booleanValue() && livingEntity.isInvisible()) {
            return false;
        }
        if (!IIllllllI.II(livingEntity)) {
            if ((Boolean)this.llIIII.lIl() == false) return true;
            if (livingEntity instanceof PlayerEntity) return true;
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIll(MinecraftClient minecraftClient, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = this.IIIlIIl() && this.lIIlII() && (Boolean)this.IIllllI.lIl() != false && minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && this.lllIl(minecraftClient);
        if (bl2 == this.IIllI) {
            if (!bl2) return;
            this.lIIIlI = this.lIIllI;
            this.Illl = this.llllII;
            return;
        }
        this.IIllI = bl2;
        if (!bl2) {
            if (bl) return;
        } else {
            this.lIIllI = minecraftClient.player.getYaw();
            this.llllII = minecraftClient.player.getPitch();
            this.lIIIlI = this.lIIllI;
            this.Illl = this.llllII;
            return;
        }
        this.lIIIlI = minecraftClient == null || minecraftClient.player == null ? this.lIIIlI : minecraftClient.player.getYaw();
        this.Illl = minecraftClient != null && minecraftClient.player != null ? minecraftClient.player.getPitch() : this.Illl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIllIIlI IIllII(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = Math.max(0.003f, f4);
        float f8 = 2.0f / f7;
        float f9 = f8 * f6;
        float f10 = 1.0f / (1.0f + f9 + 0.48f * f9 * f9 + 0.235f * f9 * f9 * f9);
        float f11 = f - f2;
        float f12 = f2;
        float f13 = f5 * f7;
        f11 = MathHelper.clamp((float)f11, (float)(-f13), (float)f13);
        f2 = f - f11;
        float f14 = (f3 + f8 * f11) * f6;
        float f15 = (f3 - f8 * f14) * f10;
        float f16 = f2 + (f11 + f14) * f10;
        boolean bl = f12 - f > 0.0f == f16 > f12;
        if (!bl) return new IIllIIlI(f16, f15);
        f16 = f12;
        return new IIllIIlI(f16, f15 *= 0.25f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void IIlllI(float f, float f2, float f3, float f4) {
        float f5 = MathHelper.wrapDegrees((float)(f3 - f));
        float f6 = f4 - f2;
        this.lIIllI = MathHelper.wrapDegrees((float)(this.lIIllI + f5));
        this.llllII = MathHelper.clamp((float)(this.llllII + f6), (float)-90.0f, (float)90.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIllll(MinecraftClient minecraftClient, IlIlIIIlI ilIlIIIlI) {
        if (minecraftClient == null) return Double.POSITIVE_INFINITY;
        if (minecraftClient.player == null) return Double.POSITIVE_INFINITY;
        if (ilIlIIIlI == null) return Double.POSITIVE_INFINITY;
        if (ilIlIIIlI.l() != null) return minecraftClient.player.getEyePos().distanceTo(ilIlIIIlI.l());
        return Double.POSITIVE_INFINITY;
    }

    private float IlIIII(int n) {
        return (float)(n & Integer.MAX_VALUE) / 2.1474836E9f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (minecraftClient.player.isUsingItem()) return false;
        if (minecraftClient.player.hasVehicle()) {
            return false;
        }
        if (IlIlIlI.IIIIlIl()) {
            return false;
        }
        if (((Boolean)this.ll.lIl()).booleanValue() && !this.llIlI(minecraftClient.player.getMainHandStack())) {
            return false;
        }
        if (((Boolean)this.lIIlII.lIl()).booleanValue() && !this.lIlIll(minecraftClient)) {
            return false;
        }
        if ((Boolean)this.lll.lIl() == false) return true;
        if (this.IIIlII(minecraftClient)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIlIllII IlIIll() {
        IIIlIllII iIIlIllII;
        IIIlIllII iIIlIllII2 = IIIlIllII.III(this.llIlIl(), IIlIIllII.I);
        float f = Math.min(this.IlIlll(this.IlIIllI, this.IllllI), iIIlIllII2.IIII());
        float f2 = Math.max(this.IIIIIl(this.IlIIllI, this.IllllI), iIIlIllII2.lI());
        float f3 = Math.min(this.IlIlll(this.IIl, this.IllII), iIIlIllII2.ll());
        float f4 = Math.max(this.IIIIIl(this.IIl, this.IllII), iIIlIllII2.llI());
        float f5 = Math.min(this.IlIlll(this.III, this.IIlIIlI), iIIlIllII2.lIlI());
        float f6 = Math.max(this.IIIIIl(this.III, this.IIlIIlI), iIIlIllII2.IIlI());
        float f7 = Math.min(this.IlIlll(this.lIll, this.II), iIIlIllII2.I());
        float f8 = Math.min(this.IIIIIl(this.lIll, this.II), iIIlIllII2.l());
        float f9 = this.IlIlll(this.IIIIll, this.IIllIIl);
        float f10 = this.IIIIIl(this.IIIIll, this.IIllIIl);
        iIIlIllII(f, f2, f3, f4, f5, f6, f7, f8, Math.max(this.IIIIl(this.IIlIllI), iIIlIllII2.lIll()), Math.max(this.IIIIl(this.lIIlll), iIIlIllII2.Ill()), Math.max(this.IIIIl(this.IlIlIl), iIIlIllII2.lIIl()), Math.max(this.IIIIl(this.IIIIIll), iIIlIllII2.IIl()), Math.max(this.IIIIl(this.IIIlIl), iIIlIllII2.lllI()), Math.max(this.IIIIl(this.IIll), iIIlIllII2.IIll()), Math.max(this.IIIIl(this.IIIlll), iIIlIllII2.llIl()), this.IIIIl(this.IIIIII), f9, f10, this.IIIIl(this.IIII), 0.0f, iIIlIllII2.Il() * this.IIIIl(this.IIIl), iIIlIllII2.llII() * this.IIIIl(this.IIlIlll), iIIlIllII2.lII() * this.IIIIl(this.lllIII));
        return iIIlIllII;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIllIl(JsonObject jsonObject) {
        if (jsonObject != null && jsonObject.has("settings")) {
            JsonObject jsonObject2 = jsonObject.getAsJsonObject("settings");
            JsonElement jsonElement = jsonObject2.get(this.lIlIll.llII());
            if (jsonElement != null) {
                this.lIlIll.l(jsonElement);
                this.llI();
            }
            this.IllIIl(jsonObject2);
        }
        super.IIllIl(jsonObject);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIlII(MinecraftClient minecraftClient, float f, long l2) {
        if (this.lIIlI()) {
            this.IIIllI(minecraftClient);
            this.IllIIl = l2;
            return;
        }
        if (!this.IlIIIl(minecraftClient)) {
            this.IIIllI(minecraftClient);
            this.IllIIl = l2;
            return;
        }
        IlIIllIII ilIIllIII = this.IllIII(minecraftClient);
        if (ilIIllIII != null) {
            this.lIl(minecraftClient, ilIIllIII, f);
            this.IllIIl = l2;
            return;
        }
        this.IIIllI(minecraftClient);
        this.IllIIl = l2;
    }

    @Override
    public List<IIllIl<?>> IlIlIl() {
        this.llI();
        return super.IlIlIl();
    }

    private float IlIllI() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        return (threadLocalRandom.nextFloat() + threadLocalRandom.nextFloat() + threadLocalRandom.nextFloat()) / 1.5f - 1.0f;
    }

    private float IlIlll(lIlIIlI lIlIIlI2, lIlIIlI lIlIIlI3) {
        return Math.min(this.IIIIl(lIlIIlI2), this.IIIIl(lIlIIlI3));
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIIllIII IllIII(MinecraftClient minecraftClient) {
        if (this.Illlll.lIl() == orchard.internal.lIlIll.lI) {
            IlIIllIII ilIIllIII = this.lIllI(minecraftClient, this.IIIIIIl.lIll(), true);
            if (ilIIllIII == null) return null;
            return ilIIllIII;
        }
        IlIIllIII ilIIllIII = null;
        Iterator iterator = minecraftClient.world.getEntities().iterator();
        while (iterator.hasNext()) {
            LivingEntity livingEntity;
            IlIIllIII ilIIllIII2;
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof LivingEntity) || (ilIIllIII2 = this.lIllI(minecraftClient, livingEntity = (LivingEntity)entity, false)) == null || ilIIllIII != null && !this.llllI(ilIIllIII2, ilIIllIII)) continue;
            ilIIllIII = ilIIllIII2;
        }
        return ilIIllIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllIIl(JsonObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        JsonElement jsonElement = jsonObject.get(this.Ill.llII());
        if (jsonElement == null) return;
        if (!jsonElement.isJsonPrimitive()) return;
        if (jsonElement.getAsJsonPrimitive().isNumber()) {
            double d = jsonElement.getAsDouble();
            if (!(d >= 0.0)) return;
            if (!(d <= 10.0)) return;
            jsonObject.addProperty(this.Ill.llII(), (Number)Math.min(100.0, Math.max(1.0, d * 20.0)));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Illll IllIlI() {
        Illll illll = ((lIIIlll)((Object)this.IlllIl.lIl())).lI;
        if (this.IlI(illll)) {
            return illll;
        }
        if (this.lIIlI.IIl(IlIlll)) {
            return orchard.internal.Illll.II;
        }
        if (!this.lIIlI.IIl(IlllI)) {
            if (!this.lIIlI.IIl(IIIIIII)) return orchard.internal.Illll.II;
            return orchard.internal.Illll.I;
        }
        return orchard.internal.Illll.ll;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double IlllII(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3) {
        Vec3d vec3d4 = vec3d3.subtract(vec3d);
        double d = Math.max(0.0, vec3d4.dotProduct(vec3d2));
        Vec3d vec3d5 = vec3d.add(vec3d2.multiply(d));
        return vec3d3.squaredDistanceTo(vec3d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IlllIl(float f) {
        if (this.lIII()) {
            this.IlIIIl = 0.0f;
            this.IIIIIlI = 1.0f;
            return 1.0f;
        }
        float f2 = Math.max(0.0f, Math.min(f, 0.1f));
        if (this.IlIIIl > 0.0f) {
            this.IlIIIl -= f2;
            if (this.IlIIIl > 0.0f) {
                return this.IIIIIlI;
            }
            this.IlIIIl = 0.0f;
            this.IIIIIlI = 1.0f;
        }
        float f3 = 0.18f * f2;
        float f4 = 0.55f;
        float f5 = 0.88f;
        float f6 = 0.018f;
        float f7 = 0.07f;
        if (this.lIIlII()) {
            f3 *= 0.42f;
            f4 = 0.38f;
            f5 = 0.76f;
            f6 *= 0.72f;
            f7 *= 0.72f;
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        if (!(threadLocalRandom.nextFloat() < f3)) return 1.0f;
        this.IlIIIl = f6 + threadLocalRandom.nextFloat() * (f7 - f6);
        this.IIIIIlI = f4 + threadLocalRandom.nextFloat() * (f5 - f4);
        return this.IIIIIlI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) {
            return false;
        }
        boolean bl = minecraftClient.options.attackKey != null && (minecraftClient.options.attackKey.isPressed() || lIIllllI.IIl(minecraftClient.options.attackKey) > 0);
        boolean bl2 = minecraftClient.options.useKey != null && (minecraftClient.options.useKey.isPressed() || lIIllllI.IIl(minecraftClient.options.useKey) > 0);
        if (bl) return true;
        if (bl2) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illlll(float f, float f2, float f3, float f4) {
        if (((Boolean)this.IlII.lIl()).booleanValue() && this.IIlIIll) {
            this.IIIlIll = this.lIlIl(f, this.llIlIl, f3, this.IIIlIll, true);
            this.IIllll = this.lIlIl(f2, this.IlIIIll, f4, this.IIllll, false);
            return;
        }
        this.IIIlIll = 0;
        this.IIllll = 0;
    }

    private void lIIIII() {
        this.IlIIlIl = 0L;
        this.IIIIllI = 0.0f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private lllllI lIIIIl() {
        return new lllllI((Double)this.IIIllIl.lIl(), this.IIlII(), (Boolean)this.llIlll.lIl(), this.IllIlI(), this.lIIlI.IIl(IlllI), this.lIIlI.IIl(IlIlll), this.lIIlI.IIl(IIIIIII), true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIllIIlI lIIIlI(float f, float f2, float f3, float f4, boolean bl, float f5, float f6, float f7, boolean bl2) {
        float f8 = this.lIIl(f6, f7);
        float f9 = this.IIl(f4, f6, f7);
        float f10 = MathHelper.clamp((float)f5, (float)0.0033333334f, (float)0.055555556f);
        if (bl) {
            IIllIIlI iIllIIlI;
            iIllIIlI(f, this.IllII(f3, 0.0f, f9 * f10 * 1.25f));
            return iIllIIlI;
        }
        if (this.lIlIll.lIl() == IlIlIIIIl.Il) return this.IIlI(f, f2, f9, f10, f6, bl2, (IlIlIIIIl)((Object)this.lIlIll.lIl()));
        if (this.lIlIll.lIl() == IlIlIIIIl.lI) {
            return this.IIlI(f, f2, f9, f10, f6, bl2, (IlIlIIIIl)((Object)this.lIlIll.lIl()));
        }
        if (!bl2) return this.IIllII(f, this.Illl(f2), f3, f8, f9, f10);
        return this.lIlIIl(f, f2, f3, f8, f9, f10);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIIll(double d, double d2, double d3, double d4, double d5, double d6) {
        int n = Double.compare(d, d2);
        if (n != 0) {
            if (n < 0) return true;
            return false;
        }
        int n2 = Double.compare(d3, d4);
        if (n2 != 0) {
            if (n2 < 0) return true;
            return false;
        }
        if (Double.compare(d5, d6) >= 0) return false;
        return true;
    }

    private boolean lIIlII() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        this.llI();
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.IIlIll(minecraftClient, false);
        boolean bl = !this.lIIlI() && this.IlIIIl(minecraftClient);
        this.lIllIl.llllII(minecraftClient, this.lll(), bl, !bl ? null : this.lIllIl(minecraftClient), this.lIII());
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lIIlIl(Vec3d vec3d, Vec3d vec3d2) {
        double d = vec3d.length();
        double d2 = vec3d2.length();
        if (d <= 1.0E-6) return Float.POSITIVE_INFINITY;
        if (d2 <= 1.0E-6) {
            return Float.POSITIVE_INFINITY;
        }
        double d3 = vec3d.dotProduct(vec3d2) / (d * d2);
        d3 = MathHelper.clamp((double)d3, (double)-1.0, (double)1.0);
        return (float)Math.toDegrees(Math.acos(d3));
    }

    /*
     * Enabled aggressive block sorting
     */
    private llIlIl lIIllI(MinecraftClient minecraftClient, IlIIllIII ilIIllIII, float f, float f2, float f3) {
        Vec3d vec3d = minecraftClient.player.getEyePos();
        Vec3d vec3d2 = ilIIllIII.I();
        if (!AimAssist.IlIll(vec3d2)) {
            return new llIlIl(f, this.Illl(f2));
        }
        if (this.lIllI != ilIIllIII.III() || !AimAssist.IlIll(this.llllIl)) {
            this.lIllI = ilIIllIII.III();
            this.llllIl = vec3d2;
            this.IIIII = 0.0f;
            this.lIlllI = 0.0f;
            this.IIlII = 0.0f;
            this.lIll(ilIIllIII.III());
        } else {
            this.llllIl = vec3d2;
        }
        Vec3d vec3d3 = this.llIIII(vec3d, this.llllIl, f3);
        Vec3d vec3d4 = vec3d3.subtract(vec3d);
        double d = Math.sqrt(vec3d4.x * vec3d4.x + vec3d4.z * vec3d4.z);
        if (!(d <= 1.0E-4)) {
            float f4 = (float)(Math.toDegrees(Math.atan2(vec3d4.z, vec3d4.x)) - 90.0);
            float f5 = this.Illl((float)(-Math.toDegrees(Math.atan2(vec3d4.y, d))));
            return new llIlIl(f4, f5);
        }
        return new llIlIl(f, this.Illl(f2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lIIlll(float f) {
        this.lIlIII += Math.max(0.0f, f) * 2.7f;
        while (true) {
            if (!(this.lIlIII >= 1.0f)) {
                float f2 = MathHelper.clamp((float)this.lIlIII, (float)0.0f, (float)1.0f);
                float f3 = f2 * f2 * (3.0f - 2.0f * f2);
                return MathHelper.lerp((float)f3, (float)this.llIlI, (float)this.lllIlI) * 0.04f;
            }
            this.lIlIII -= 1.0f;
            this.llIlI = this.lllIlI;
            this.lllIlI = ThreadLocalRandom.current().nextFloat() * 2.0f - 1.0f;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d lIlIII(Vec3d vec3d, Box box, float f, float f2) {
        if (!this.IIlIlII) {
            ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
            this.lIIIII = threadLocalRandom.nextFloat() * 1.0999999f + 0.3f;
            this.lIlIl = threadLocalRandom.nextFloat() * 1.0999999f + 0.3f;
            this.lIIIll = threadLocalRandom.nextFloat() * 1.0999999f + 0.3f;
            this.IIlIlII = true;
        }
        float f3 = Math.max(0.0f, Math.min(f, 0.1f));
        this.lIIlIl += f3 * this.lIIIII * ((float)Math.PI * 2);
        this.IIlll += f3 * this.lIlIl * ((float)Math.PI * 2);
        this.llllI += f3 * this.lIIIll * ((float)Math.PI * 2);
        float f4 = (float)(Math.sin(this.lIIlIl) * 0.6 + Math.sin((double)this.lIIlIl * 1.9) * 0.4);
        float f5 = (float)(Math.sin(this.IIlll) * 0.55 + Math.sin((double)this.IIlll * 1.5) * 0.45);
        float f6 = (float)(Math.sin(this.llllI) * 0.65 + Math.sin((double)this.llllI * 1.7) * 0.35);
        double d = vec3d.x + (double)(f4 * f2);
        double d2 = vec3d.y + (double)(f5 * f2);
        double d3 = vec3d.z + (double)(f6 * f2);
        return new Vec3d(MathHelper.clamp((double)d, (double)box.minX, (double)box.maxX), MathHelper.clamp((double)d2, (double)box.minY, (double)box.maxY), MathHelper.clamp((double)d3, (double)box.minZ, (double)box.maxZ));
    }

    private IIllIIlI lIlIIl(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = MathHelper.wrapDegrees((float)(f2 - f));
        float f8 = f + f7;
        return this.IIllII(f, f8, f3, f4, f5, f6);
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lIlIlI(IllIlIlI illIlIlI, int n, int n2, float f, float f2, float f3) {
        if (illIlIlI.I != n) {
            illIlIlI.I = n;
            illIlIlI.l = 0;
            illIlIlI.II = 1.0f;
            illIlIlI.Il = 1.0f;
            illIlIlI.lI = this.I(n, n2, 0, f2, f3);
            illIlIlI.III = this.IlIlI(n, n2, 0);
            illIlIlI.ll = 0.0f;
        }
        illIlIlI.ll += Math.max(f, 0.0f);
        while (illIlIlI.ll >= illIlIlI.III) {
            illIlIlI.ll -= illIlIlI.III;
            illIlIlI.II = illIlIlI.lI;
            illIlIlI.Il = illIlIlI.II;
            ++illIlIlI.l;
            illIlIlI.lI = this.I(n, n2, illIlIlI.l, f2, f3);
            illIlIlI.III = this.IlIlI(n, n2, illIlIlI.l);
        }
        float f4 = illIlIlI.III <= 1.0E-4f ? 1.0f : MathHelper.clamp((float)(illIlIlI.ll / illIlIlI.III), (float)0.0f, (float)1.0f);
        float f5 = f4 * f4 * (3.0f - 2.0f * f4);
        illIlIlI.II = MathHelper.lerp((float)f5, (float)illIlIlI.Il, (float)illIlIlI.lI);
        return illIlIlI.II;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlIll(MinecraftClient minecraftClient) {
        if (((Boolean)this.lIIlII.lIl()).booleanValue() && minecraftClient != null && minecraftClient.getWindow() != null) {
            if (this.lllll.ll()) return lIIllllI.llI(minecraftClient, (InputUtil.Key)this.lllll.lIl());
            return false;
        }
        if ((Boolean)this.lIIlII.lIl() != false) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIllII(MinecraftClient minecraftClient, LivingEntity livingEntity, IlIlIIIlI ilIlIIIlI, LivingEntity livingEntity2, IlIlIIIlI ilIlIIIlI2) {
        boolean bl;
        if (ilIlIIIlI2 == null) {
            return true;
        }
        double d = this.IIllll(minecraftClient, ilIlIIIlI);
        double d2 = this.IIllll(minecraftClient, ilIlIIIlI2);
        double d3 = ilIlIIIlI.ll() * ilIlIIIlI.III();
        double d4 = ilIlIIIlI2.ll() * ilIlIIIlI2.III();
        double d5 = livingEntity != null ? (double)livingEntity.getHealth() : Double.POSITIVE_INFINITY;
        double d6 = livingEntity2 == null ? Double.POSITIVE_INFINITY : (double)livingEntity2.getHealth();
        switch (((lIlIll)((Object)this.Illlll.lIl())).ordinal()) {
            case 2: {
                bl = this.lIIIll(d5, d6, d, d2, d3, d4);
                return bl;
            }
            default: {
                throw new MatchException(null, null);
            }
            case 0: 
            case 3: {
                bl = this.lIIIll(d3, d4, d, d2, d5, d6);
                return bl;
            }
            case 1: 
        }
        bl = this.lIIIll(d, d2, d3, d4, d5, d6);
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    private IlIlIIIlI lIllIl(MinecraftClient var1_1) {
        block14: {
            block17: {
                block16: {
                    block15: {
                        block10: {
                            block12: {
                                block11: {
                                    block9: {
                                        block13: {
                                            if (var1_1 == null || var1_1.player == null) break block12;
                                            break block13;
lbl3:
                                            // 1 sources

                                            while (var8_9 == null) {
                                                ** GOTO lbl12
                                            }
                                            break block14;
lbl6:
                                            // 1 sources

                                            while (true) {
                                                if (!this.lIllII(var1_1, var7_8, var8_9, var4_5, var3_3)) ** GOTO lbl12
lbl8:
                                                // 2 sources

                                                while (true) {
                                                    break block9;
                                                    return var3_3;
lbl12:
                                                    // 5 sources

                                                    while (true) {
                                                        if (!var5_6.hasNext()) ** continue;
                                                        break block10;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
lbl15:
                                            // 1 sources

                                            while (true) {
                                                break block11;
                                                break;
                                            }
                                        }
                                        if (var1_1.world != null) break block15;
                                        break block12;
lbl20:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var3_3 = var8_9;
                                    var4_5 = var7_8;
                                    ** GOTO lbl12
                                    var7_8 = (LivingEntity)var6_7;
                                    var8_9 = this.IllIl(var1_1, var7_8, var2_2, false);
                                    ** GOTO lbl3
                                }
                                var3_3 = null;
                                break block16;
                            }
                            return null;
lbl34:
                            // 1 sources

                            while (true) {
                                if (!(var6_7 instanceof LivingEntity)) ** GOTO lbl12
                                ** continue;
                                break;
                            }
                        }
                        var6_7 = (Entity)var5_6.next();
                        ** while (true)
                    }
                    var2_2 = this.lIIIIl();
                    ** while (this.Illlll.lIl() != orchard.internal.lIlIll.lI)
lbl43:
                    // 1 sources

                    break block17;
                }
                var4_5 = null;
                var5_6 = var1_1.world.getEntities().iterator();
                ** while (true)
            }
            var3_4 = this.IllIl(var1_1, this.IIIIIIl.lIll(), var2_2, true);
            if (var3_4 == null) {
                return null;
            }
            return var3_4;
        }
        ** while (var3_3 == null)
lbl55:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lIlllI() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIllI) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.currentScreen == null) return this.lllIl(minecraftClient);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d lIllll(MinecraftClient minecraftClient) {
        Vec3d vec3d = minecraftClient.player.getRotationVec(1.0f);
        double d = vec3d.lengthSquared();
        if (!(d <= 1.0E-6)) return vec3d.multiply(1.0 / Math.sqrt(d));
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d llIIII(Vec3d vec3d, Vec3d vec3d2, float f) {
        if (!this.lIlll) {
            ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
            this.lIlIIl = threadLocalRandom.nextFloat() * 0.9f + 0.35f;
            this.IlllII = threadLocalRandom.nextFloat() * 0.9f + 0.35f;
            this.IlIIIIl = threadLocalRandom.nextFloat() * 0.9f + 0.35f;
            this.IIIIlll = threadLocalRandom.nextFloat() * ((float)Math.PI * 2);
            this.IlIlIII = threadLocalRandom.nextFloat() * ((float)Math.PI * 2);
            this.IllIlI = threadLocalRandom.nextFloat() * ((float)Math.PI * 2);
            this.lIlll = true;
        }
        float f2 = Math.max(0.0f, Math.min(f, 0.1f));
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        float f3 = 1.0f + (threadLocalRandom.nextFloat() - 0.5f) * 0.12f;
        float f4 = 1.0f + (threadLocalRandom.nextFloat() - 0.5f) * 0.12f;
        float f5 = 1.0f + (threadLocalRandom.nextFloat() - 0.5f) * 0.12f;
        this.IlIIlII += f2 * this.lIlIIl * f3 * ((float)Math.PI * 2);
        this.IIlIl += f2 * this.IlllII * f4 * ((float)Math.PI * 2);
        this.IIlllI += f2 * this.IlIIIIl * f5 * ((float)Math.PI * 2);
        float f6 = (float)(Math.sin(this.IlIIlII + this.IIIIlll) * 0.5 + Math.sin((double)this.IlIIlII * 1.7 + (double)this.IlIlIII) * 0.3 + Math.sin((double)this.IIlllI * 2.3 + (double)this.IllIlI) * 0.2);
        float f7 = (float)(Math.sin(this.IIlIl + this.IlIlIII) * 0.45 + Math.sin((double)this.IIlIl * 1.3 + (double)this.IIIIlll) * 0.3 + Math.sin((double)this.IIlllI * 1.9 + (double)this.IllIlI) * 0.25);
        f6 += (threadLocalRandom.nextFloat() - 0.5f) * 0.15f;
        f7 += (threadLocalRandom.nextFloat() - 0.5f) * 0.15f;
        Vec3d vec3d3 = vec3d2.subtract(vec3d);
        double d = Math.sqrt(vec3d3.x * vec3d3.x + vec3d3.z * vec3d3.z);
        if (!(d <= 1.0E-4)) {
            double d2 = -vec3d3.z / d;
            double d3 = vec3d3.x / d;
            double d4 = d2 * (double)f6 * (double)0.052f;
            double d5 = d3 * (double)f6 * (double)0.052f;
            double d6 = f7 * 0.052f;
            return vec3d2.add(d4, d6, d5);
        }
        return vec3d2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float llIIIl(IlIIllIII ilIIllIII, float f, float f2) {
        float f3 = this.llIIll(f, f2);
        float f4 = Math.max(this.IIlII(), 1.0f);
        float f5 = MathHelper.clamp((float)(f3 / f4), (float)0.0f, (float)1.0f);
        return Math.max(ilIIllIII.Il(), f5);
    }

    static float llIIlI(float f) {
        float f2 = MathHelper.clamp((float)(f / 100.0f), (float)0.0f, (float)1.0f);
        return 0.3f * f2 * f2;
    }

    private float llIIll(float f, float f2) {
        return (float)Math.hypot(f, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private float llIlII(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2) {
        Vec3d vec3d3 = vec3d2.subtract(vec3d);
        double d = Math.sqrt(vec3d3.x * vec3d3.x + vec3d3.z * vec3d3.z);
        if (!(d <= 1.0E-4)) {
            float f = (float)(Math.toDegrees(Math.atan2(vec3d3.z, vec3d3.x)) - 90.0);
            float f2 = (float)(-Math.toDegrees(Math.atan2(vec3d3.y, d)));
            float f3 = MathHelper.wrapDegrees((float)(f - minecraftClient.player.getYaw()));
            float f4 = f2 - this.Illl(minecraftClient.player.getPitch());
            float f5 = (float)Math.sqrt(f3 * f3 + f4 * f4);
            float f6 = MathHelper.clamp((float)((f5 - 2.5f) / 11.5f), (float)0.0f, (float)1.0f);
            return 0.016f + f6 * 0.084f;
        }
        return 0.016f;
    }

    private float llIlIl() {
        return MathHelper.clamp((float)((Double)this.Ill.lIl()).floatValue(), (float)1.0f, (float)this.lI());
    }

    private static int IllIIlI(int n, int n2) {
        return Illllll[n ^ 0x3EFB3488] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllIIll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x2CF1FE7;
        char[] cArray = lIIIIII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIIIIIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            AimAssist.lIIIIIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xD0E80F20;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 1 -> 170;
                case 19 -> 126;
                case 3 -> 98;
                case 6 -> 208;
                case 11 -> 11;
                case 4 -> 188;
                case 20 -> 231;
                case 16 -> 72;
                case 10 -> 66;
                case 8 -> 76;
                case 21 -> 2;
                case 17 -> 165;
                case 25 -> 149;
                case 23 -> 192;
                case 9 -> 44;
                case 14 -> 156;
                case 18 -> 189;
                case 22 -> 61;
                case 28 -> 143;
                case 7 -> 97;
                case 24 -> 65;
                case 29 -> 142;
                case 5 -> 226;
                case 30 -> 119;
                default -> 69;
                case 12 -> 5;
                case 26 -> 41;
                case 31 -> 9;
                case 27 -> 44;
                case 15 -> 199;
                case 2 -> 32;
                case 13 -> 51;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

