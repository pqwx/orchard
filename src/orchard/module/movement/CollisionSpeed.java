/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllIlIl
 * Module         : CollisionSpeed  [MOVEMENT]
 * Description    : Borrows the anticheat's per-entity collision lenience to move faster while pushable entities are near.   (client's own text)
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.vehicle.AbstractBoatEntity
 *  net.minecraft.predicate.entity.EntityPredicates
 *  net.minecraft.util.math.Box
 */
package orchard.module.movement;

import java.util.Iterator;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.AbstractBoatEntity;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.math.Box;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.lIlIIlI;
import orchard.internal.llIllI;

@Environment(value=EnvType.CLIENT)
public final class CollisionSpeed
extends ModuleBase {
    private final lIlIIlI I;
    private static final double l = 0.08;
    private static final double II = 1.0;
    private static final double Il = 0.2;
    private final IIIIIIIIl<llIllI> lI;
    private static final String[] ll;
    private static final Object[] III;

    static double I(int n, double d) {
        if (n <= 0) {
            return 0.0;
        }
        double d2 = Math.min(1.0, Math.max(0.0, d));
        return (double)n * 0.08 * d2;
    }

    @Override
    public String II() {
        String string = "%";
        long l2 = Math.round((Double)this.I.lIl());
        return l2 + string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.getNetworkHandler() == null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (minecraftClient.player.isSpectator()) return false;
        if (minecraftClient.player.hasVehicle()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIl(MinecraftClient minecraftClient) {
        float f;
        float f2;
        float f3;
        block9: {
            block10: {
                block8: {
                    f3 = 0.0f;
                    if (minecraftClient.options.forwardKey.isPressed()) {
                        f3 += 1.0f;
                    }
                    if (minecraftClient.options.backKey.isPressed()) {
                        f3 -= 1.0f;
                    }
                    f2 = 0.0f;
                    if (minecraftClient.options.leftKey.isPressed()) {
                        f2 += 1.0f;
                    }
                    if (minecraftClient.options.rightKey.isPressed()) {
                        f2 -= 1.0f;
                    }
                    if (f3 == 0.0f && f2 == 0.0f) break block8;
                    f = minecraftClient.player.getYaw();
                    if (!(f3 < 0.0f)) break block9;
                    break block10;
                }
                return Double.NaN;
            }
            f += 180.0f;
        }
        float f4 = 1.0f;
        if (!(f3 < 0.0f)) {
            if (f3 > 0.0f) {
                f4 = 0.5f;
            }
        } else {
            f4 = -0.5f;
        }
        if (f2 > 0.0f) {
            f -= 90.0f * f4;
        }
        if (!(f2 < 0.0f)) return Math.toRadians(f);
        return Math.toRadians(f += 90.0f * f4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public CollisionSpeed() {
        super(StringFactory.IIII("u5tYkBBEWROZO49cCtc="), Category.ll, StringFactory.IIII("uptGjhZAQ1yDAJoZDt3Kl5ucUZ0NEENchw2NFArdypeMjRSfFltcFYQBkFdP39uQkZFanxwXRBPXBZBPCpPYn4uAUY5ZQFgVmw3fSRrA1p+amFHcHFlEFYMBmkpP0syb2JpRnQsZ"));
        lIlIIlI lIlIIlI2;
        lIlIIlI2(StringFactory.IIII("q4BGmRdQRBQ="), 90.0, 10.0, 100.0, 5.0);
        this.I = this.IIlllIl(lIlIIlI2.IIII(StringFactory.IIII("3Q==")));
        this.lI = this.IIlllIl(new IIIIIIIIl<llIllI>(StringFactory.IIII("rJVGmxxDQw=="), llIllI.class, llIllI.II));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlI(Entity entity) {
        switch (((llIllI)((Object)this.lI.lIl())).ordinal()) {
            case 0: {
                boolean bl = entity instanceof AbstractBoatEntity;
                return bl;
            }
            case 1: {
                boolean bl = entity instanceof PlayerEntity;
                return bl;
            }
            default: {
                throw new MatchException(null, null);
            }
            case 2: 
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.lI(minecraftClient)) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        Box box = clientPlayerEntity.getBoundingBox().expand(0.2);
        Predicate predicate = EntityPredicates.canBePushedBy((Entity)clientPlayerEntity);
        int n = 0;
        Iterator iterator = minecraftClient.world.getOtherEntities((Entity)clientPlayerEntity, box, entity -> !entity.isSpectator()).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (n <= 0) {
                    return;
                }
                double d = this.IIl(minecraftClient);
                if (Double.isNaN(d)) {
                    return;
                }
                double d2 = CollisionSpeed.I(n, (Double)this.I.lIl() / 100.0);
                if (!(d2 <= 0.0)) {
                    clientPlayerEntity.setVelocity(clientPlayerEntity.getVelocity().add(-Math.sin(d) * d2, 0.0, Math.cos(d) * d2));
                    return;
                }
                return;
            }
            Entity entity2 = (Entity)iterator.next();
            if (!predicate.test(entity2) || !this.IlI(entity2)) continue;
            ++n;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 3047;
        var1_1 = "\ud101\ud1e6\ud1cf\ud146\u327b\u32be\u32ba\u321e\u3209\u3289\u320c\u32a5\u327a\u327d\u32c3\u32d4\u3244\u3255\u3273\u3285\u322c\u3206\u321b\u3274\u426c\u42ec\u42ad\u4217\u421f\u42b4\u4203\u42b6\u426b\u4209\u42e2\u42dd\u425d\u423c\u4232\u42ab\u423c\u4211\u425c\u4215\u4264\u42f9\u42cc\u421a\u422a\u4266\u4209\u4240\u42f7\u4244\u42d0\u42ad\u4243\u42fd\u4284\u4246\u4220\u42af\u423d\u42fc\u421b\u425b\u42cc\u42c2\u4219\u427c\u421d\u42a5\u4228\u4266\u4243\u422e\u427c\u4283\u4287\u4263\u4207\u4248\u424b\u4231\u42d9\u422b\u42d9\u4289\u422f\u4288\u42e3\u425b\u421e\u42f9\u4260\u42d3\u4202\u427f\u4296\u428f\u4222\u4246\u421a\u42fc\u4275\u4269\u4255\u4202\u423b\u42b6\u42b0\u4252\u422f\u4238\u4242\u4228\u4289\u4242\u42a4\u42d6\u423a\u4297\u4280\u4233\u427b\u42c0\u4257\u42dc\u420e\u4215\u42fe\u4284\u421b\u4235\u4248\u42dc\u424c\u4249\u4206\u4246\u4200\u42e9\u429e\u423e\u424f\u4219\u4235\u4234\u4287\u422f\u42a9\u42d0\u4273\u42c5\u429b\u4214\u4274\u42d5\u4239\u429f\u24c0\u2400\u2433\u24bf\u24b0\u2426\u2495\u240e\u24c0\u24d2\u2462\u240c\u6261\u6286\u62af\u6226\u50a6\u501b\u5042\u50da\u50d5\u5069\u50ec\u507e\u50a6\u5082\u506b\u5069";
        var2_2 = "\u0be3\u0bf3\u0b6f\u0beb\u0be3\u0beb".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_4 = -1;
        if (true) ** GOTO lbl13
        while (true) {
            block9: {
                block10: {
                    if (var9_9 < var8_8.length) break block9;
                    var3_3[var4_5] = new String(var8_8).intern();
                    var5_6 += var6_7;
                    if (++var4_5 < var2_2.length) break block10;
                    var7_4 = 0;
lbl13:
                    // 2 sources

                    var4_5 = 0;
                    var5_6 = 0;
                    var6_7 = 0;
                    if (var7_4 == 0) break;
                }
                var6_7 = var2_2[var4_5] ^ var0;
                var8_8 = var1_1.substring(var5_6, var5_6 + var6_7).toCharArray();
                var9_9 = 0;
            }
            switch (var9_9 % 5) {
                default: {
                    v0 = 127;
                    break;
                }
                case 1: {
                    v0 = 49;
                    break;
                }
                case 2: {
                    v0 = 77;
                    break;
                }
                case 4: {
                    v0 = 34;
                    break;
                }
                case 3: {
                    v0 = 39;
                }
            }
            var10_10 = v0;
            ** break;
lbl39:
            // 1 sources

            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
        }
        CollisionSpeed.ll = var3_3;
        CollisionSpeed.III = new Object[var3_3.length];
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String lII(int var0, int var1_1) {
        var3_2 = var0 ^ 1215040457;
        var4_4 = CollisionSpeed.ll[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])CollisionSpeed.III[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            CollisionSpeed.III[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -1087983591;
        var8_8 = 0;
        if (true) ** GOTO lbl16
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) break;
lbl16:
            // 2 sources

            switch (var8_8 & 31) {
                case 13: {
                    var9_9 = 203;
                    continue block33;
                }
                case 15: {
                    var9_9 = 20;
                    continue block33;
                }
                case 2: {
                    var9_9 = 14;
                    continue block33;
                }
                case 5: {
                    var9_9 = 57;
                    continue block33;
                }
                case 28: {
                    var9_9 = 15;
                    continue block33;
                }
                case 4: {
                    var9_9 = 205;
                    continue block33;
                }
                case 22: {
                    var9_9 = 110;
                    continue block33;
                }
                case 30: {
                    var9_9 = 123;
                    continue block33;
                }
                case 6: {
                    var9_9 = 242;
                    continue block33;
                }
                case 11: {
                    var9_9 = 50;
                    continue block33;
                }
                case 25: {
                    var9_9 = 217;
                    continue block33;
                }
                case 19: {
                    var9_9 = 230;
                    continue block33;
                }
                case 8: {
                    var9_9 = 135;
                    continue block33;
                }
                case 27: {
                    var9_9 = 217;
                    continue block33;
                }
                case 24: {
                    var9_9 = 199;
                    continue block33;
                }
                case 9: {
                    var9_9 = 128;
                    continue block33;
                }
                case 7: {
                    var9_9 = 32;
                    continue block33;
                }
                case 23: {
                    var9_9 = 196;
                    continue block33;
                }
                case 3: {
                    var9_9 = 237;
                    continue block33;
                }
                case 18: {
                    var9_9 = 210;
                    continue block33;
                }
                case 16: {
                    var9_9 = 211;
                    continue block33;
                }
                case 1: {
                    var9_9 = 55;
                    continue block33;
                }
                case 26: {
                    var9_9 = 146;
                    continue block33;
                }
                case 17: {
                    var9_9 = 178;
                    continue block33;
                }
                case 10: {
                    var9_9 = 126;
                    continue block33;
                }
                case 14: {
                    var9_9 = 229;
                    continue block33;
                }
                case 12: {
                    var9_9 = 203;
                    continue block33;
                }
                case 31: {
                    var9_9 = 101;
                    continue block33;
                }
                case 21: {
                    var9_9 = 103;
                    continue block33;
                }
                case 20: {
                    var9_9 = 237;
                    continue block33;
                }
                default: {
                    var9_9 = 252;
                    continue block33;
                }
                case 29: 
            }
            var9_9 = 185;
        }
        return new String(var4_4).intern();
    }
}

