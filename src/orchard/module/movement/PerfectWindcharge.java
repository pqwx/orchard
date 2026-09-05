/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIIllI
 * Module         : Perfect Windcharge  [MOVEMENT]
 * Description    : Automatically jumps when a wind charge is thrown at your feet.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Trigger Range
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.projectile.WindChargeEntity
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.movement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.WindChargeEntity;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.lIlIIlI;
import orchard.mixin.LivingEntityMixin3;

@Environment(value=EnvType.CLIENT)
public final class PerfectWindcharge
extends ModuleBase {
    private static final double I = 1.35;
    private static String[] l;
    private Object II;
    private final lIlIIlI Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Trigger Range"), 1.15, 0.5, 2.5, 0.05).IIIl("m"));
    private int lI;
    private final Map<Integer, Integer> ll = new HashMap<Integer, Integer>();
    private static final int III = 2;
    private static final double IIl = 0.65;
    private static final int IlI = 30;
    private static final int[] Ill;
    private static final String[] lII;
    private static final Object[] lIl;

    /*
     * Enabled aggressive block sorting
     */
    private void I(int n) {
        Iterator<Map.Entry<Integer, Integer>> iterator = this.ll.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() > n) continue;
            iterator.remove();
        }
        return;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block27: {
            block26: {
                block28: {
                    block30: {
                        block29: {
                            var6 = 11525;
                            ** GOTO lbl40
lbl3:
                            // 1 sources

                            while (true) {
                                var4_15 = 0;
                                ** GOTO lbl45
lbl6:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break;
                            }
lbl8:
                            // 1 sources

                            while (true) {
                                v0 = var15_13++;
                                var14_12[v0] = (char)(var14_12[v0] ^ var16_14);
                                if (true) ** GOTO lbl69
                                break;
                            }
lbl12:
                            // 5 sources

                            while (true) {
                                var16_14 = v1;
                                ** continue;
                                break;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                v1 = 74;
                                ** GOTO lbl12
                                break;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                var13_11 = -1;
                                break block26;
                                break;
                            }
                            block12: while (true) {
                                if (var13_11 != 0) ** GOTO lbl57
                                if (true) ** GOTO lbl70
                                block13: while (true) {
                                    switch (var15_13 % 5) {
                                        case 1: {
                                            ** continue;
                                        }
lbl28:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl30:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        case 4: {
                                            v1 = 126;
                                            ** GOTO lbl12
                                        }
lbl35:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl37:
                                        // 1 sources

                                        while (true) {
                                            if (var15_13 < var14_12.length) continue block13;
                                            break block27;
                                            break;
                                        }
lbl40:
                                        // 1 sources

                                        var7_5 = "\ueb83\u546e\uce4a\u0df9\u8219\uc2ef\ue5fb\udaf8\u068e\ue304\u7987\uf6b5\u8f8f\u0f60\ua071\ud38b\u2090\u5489\u4a51\uac28\u1f17\u2230\u7c4f\ua7f0\u8ff2\u8d4a\u6829\u4b78\u57d9\u6ed2\uafde\u0de5\ud8e0\u70cd\uec56\u8bbc\u8f81\u76ed\u20b6\uccc6\u2a3f\u4194\uedf4\u3374\u56fa\ude82\ub6bc\u44e0\u00fc\uf68f\u1ecf\ufecd\u801e\u6a7a\u9464\uac4e\uf60c\ubdec\ub9fa\u73c6\u8e69\u8c4f\u7b16\ua285\u5a46\ubd4b\u83c5\u0b57\uda07\u2fa6\u42eb\u142d\u1502\u5e8b\u5794\u18e8\ue06f\u0e3e\u4312\u3a91\u94b0\ueb75\u4645\ue349\u2000\u99d2\ube0e\u0634\u31c4\u4cf4\ua466\u399f\ubd4d\u2972\uf7a3\uf654\u88c7\ue412\u084f\u0dfc\u82b9\uae20\ua304\u3a6a\uaa73\u992e\ufb73\u3670\u5f2d\u135a\u1a75\uf34d\u28ad\u3f78\ua580\uc0d1\ue785\u3b67\u2cfc\ubca1\u0b82\u994d\u377f\uada5\uae67\u507f\ua169\u2ac8\u6fce\u6e48\uecee\u1c10";
                                        ** continue;
lbl42:
                                        // 1 sources

                                        while (true) {
                                            var13_11 = 0;
                                            break block26;
                                            break;
                                        }
lbl45:
                                        // 2 sources

                                        while (true) {
                                            var5_16 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                                            ** continue;
                                            break;
                                        }
lbl48:
                                        // 1 sources

                                        while (true) {
                                            var2_3 = -1263981185;
                                            ** continue;
                                            break;
                                        }
lbl51:
                                        // 1 sources

                                        while (true) {
                                            PerfectWindcharge.lIl = new Object[var9_7.length];
                                            ** continue;
                                            break;
                                        }
                                        case 2: {
                                            v1 = 53;
                                            ** GOTO lbl12
                                        }
lbl57:
                                        // 2 sources

                                        while (true) {
                                            ** GOTO lbl62
                                            break;
                                        }
lbl59:
                                        // 1 sources

                                        while (true) {
                                            var11_9 += var12_10;
                                            break block28;
                                            break;
                                        }
lbl62:
                                        // 1 sources

                                        var12_10 = var8_6[var10_8] ^ var6;
                                        var14_12 = var7_5.substring(var11_9, var11_9 + var12_10).toCharArray();
                                        var15_13 = 0;
                                        continue block13;
                                        var8_6 = "\u2d1d\u2d51\u2d11\u2d01".toCharArray();
                                        var9_7 = new String[var8_6.length];
                                        ** continue;
lbl69:
                                        // 1 sources

                                        ** continue;
lbl70:
                                        // 1 sources

                                        PerfectWindcharge.lII = var9_7;
                                        ** continue;
lbl72:
                                        // 1 sources

                                        while (true) {
                                            PerfectWindcharge.Ill = new int[var1_2];
                                            break block29;
                                            break;
                                        }
                                        var0_1 = "\u00de\u00ef\u00eazP\u0012}W(x\u00a5!_e\u00cf\u0097\u0084uQL\u0085\u00c4\u001e\u00d6v\u00efi\u000e".getBytes("ISO-8859-1");
                                        var1_2 = var0_1.length / 4;
                                        ** continue;
                                        var11_9 = 0;
                                        var12_10 = 0;
                                        continue block12;
                                        default: {
                                            v1 = 7;
                                            ** GOTO lbl12
                                        }
                                        case 3: 
                                    }
                                    break;
                                }
                                break;
                            }
                            v1 = 18;
                            ** while (true)
                            PerfectWindcharge.Ill[var4_15] = var5_16 ^= var2_3;
                            var3_4 += 4;
                            ** while (++var4_15 < var1_2)
lbl90:
                            // 1 sources

                            break block30;
                        }
                        var3_4 = 0;
                        ** while (true)
lbl94:
                        // 1 sources

                        while (true) {
                            if (++var10_8 < var8_6.length) ** continue;
                            ** continue;
                            break;
                        }
                    }
                    PerfectWindcharge.l = new String[4];
                    PerfectWindcharge.IlII();
                    return;
                }
                ** while (true)
            }
            var10_8 = 0;
            ** while (true)
        }
        var9_7[var10_8] = new String(var14_12).intern();
        ** while (true)
    }

    private double lI(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3) {
        Vec3d vec3d4 = vec3d3.subtract(vec3d2);
        double d = vec3d4.lengthSquared();
        if (d <= 1.0E-8) {
            return vec3d.squaredDistanceTo(vec3d2);
        }
        double d2 = vec3d.subtract(vec3d2).dotProduct(vec3d4) / d;
        d2 = Math.max(0.0, Math.min(1.0, d2));
        return vec3d.squaredDistanceTo(vec3d2.add(vec3d4.multiply(d2)));
    }

    private void IIl() {
        this.ll.clear();
        this.lI = 0;
        this.II = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (minecraftClient.player.getAbilities().flying) return false;
        if (minecraftClient.player.isTouchingWater()) return false;
        if (minecraftClient.player.isSubmergedInWater()) return false;
        if (minecraftClient.player.isInLava()) return false;
        if (minecraftClient.player.isClimbing()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lII(MinecraftClient minecraftClient) {
        if (!(this.IIIlIIl() && this.IlI(minecraftClient) && minecraftClient.player.isOnGround())) {
            this.lI = 0;
            return false;
        }
        this.IIII(minecraftClient);
        this.I(minecraftClient.player.age);
        if (this.lI > 0) {
            --this.lI;
            this.lll(minecraftClient.player);
            return true;
        }
        WindChargeEntity windChargeEntity = this.IIlI(minecraftClient);
        if (windChargeEntity != null) {
            this.ll.put(windChargeEntity.getId(), minecraftClient.player.age + 30);
            this.lI = 1;
            this.lll(minecraftClient.player);
            return true;
        }
        return false;
    }

    public PerfectWindcharge() {
        super(StringFactory.IIII("Perfect Windcharge"), Category.ll, StringFactory.IIII("Automatically jumps when a wind charge is thrown at your feet."));
    }

    private static String lIl(char[] cArray, long l2, int n) {
        int n2 = 0x13FC018 ^ n;
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

    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IlI(minecraftClient)) {
            this.IIl();
            return;
        }
        this.IIII(minecraftClient);
        this.I(minecraftClient.player.age);
    }

    private void lll(ClientPlayerEntity clientPlayerEntity) {
        ((LivingEntityMixin3)clientPlayerEntity).ilovcats$setJumpingCooldown(0);
    }

    private void IIII(MinecraftClient minecraftClient) {
        if (this.II == minecraftClient.world) {
            return;
        }
        this.II = minecraftClient.world;
        this.ll.clear();
        this.lI = 0;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private WindChargeEntity IIlI(MinecraftClient minecraftClient) {
        double d = (Double)this.Il.lIl();
        double d2 = d * d;
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        Vec3d vec3d = new Vec3d(clientPlayerEntity.getX(), clientPlayerEntity.getY() + 0.05, clientPlayerEntity.getZ());
        WindChargeEntity windChargeEntity = null;
        double d3 = Double.MAX_VALUE;
        Iterator iterator = minecraftClient.world.getEntities().iterator();
        boolean bl = true;
        block0: while (true) {
            WindChargeEntity windChargeEntity2;
            if (!bl || (bl = false) || !true) {
                if (!this.ll.containsKey(windChargeEntity2.getId())) {
                    Vec3d vec3d2;
                    Vec3d vec3d3;
                    double d4;
                    double d5 = Math.min(windChargeEntity2.getY(), windChargeEntity2.getY() + windChargeEntity2.getVelocity().y);
                    double d6 = Math.max(windChargeEntity2.getY(), windChargeEntity2.getY() + windChargeEntity2.getVelocity().y);
                    if (!(d5 > clientPlayerEntity.getY() + 1.35) && !(d6 < clientPlayerEntity.getY() - 0.65) && (d4 = this.lI(vec3d, vec3d3 = new Vec3d(windChargeEntity2.getX(), windChargeEntity2.getY(), windChargeEntity2.getZ()), vec3d2 = vec3d3.add(windChargeEntity2.getVelocity()))) <= d2 && d4 < d3) {
                        d3 = d4;
                        windChargeEntity = windChargeEntity2;
                    }
                }
            }
            while (iterator.hasNext()) {
                Entity entity = (Entity)iterator.next();
                if (entity instanceof WindChargeEntity && !(windChargeEntity2 = (WindChargeEntity)entity).isRemoved() && windChargeEntity2.isAlive()) continue block0;
            }
            break;
        }
        return windChargeEntity;
    }

    @Override
    public void llll() {
        this.IIl();
    }

    private static void IlII() {
        PerfectWindcharge.l[0] = PerfectWindcharge.lIl(PerfectWindcharge.Illl('\u8cb3', (short)54403, -113999939).toCharArray(), 72510L, 769952766);
        PerfectWindcharge.l[1] = PerfectWindcharge.lIl(PerfectWindcharge.Illl('\u8cb2', (short)17588, 969677391).toCharArray(), 37572L, 1487980296);
        PerfectWindcharge.l[2] = PerfectWindcharge.lIl(PerfectWindcharge.Illl('\u8cb1', (short)37057, -1062635191).toCharArray(), 51441L, 434321248);
        PerfectWindcharge.l[3] = PerfectWindcharge.lIl(PerfectWindcharge.Illl('\u8cb0', (short)48917, 73751746).toCharArray(), 92390L, 1000377179);
    }

    private static int IllI(int n, int n2) {
        return Ill[n ^ 0x5A6481DF] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Illl(char c, short s, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x8CB3;
        char[] cArray = lII[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIl[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            PerfectWindcharge.lIl[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3011;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 5998;
            n6 -= 31907;
            n6 -= 52451;
            n6 += 43310;
            n6 += 12895;
            n6 += 45162;
            cArray[n5] = (char)((n6 -= 36659) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

