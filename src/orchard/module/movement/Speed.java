/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIll
 * Module         : Speed  [MOVEMENT]
 * Description    : Legit speed with straight-line equalization or sprint + autojump.   (client's own text)
 *
 * Recovered strings in this class:
 *   - No Jump Delay
 *   - Exploit Mode
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.util.math.MathHelper
 */
package orchard.module.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.MathHelper;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlllI;
import orchard.internal.IlIlllI;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;
import orchard.mixin.LivingEntityMixin3;

@Environment(value=EnvType.CLIENT)
public final class Speed
extends ModuleBase {
    private final llIll I;
    private static final double l = 0.09;
    private static String[] II;
    private boolean Il;
    private boolean lI;
    private static final double III = 1.0E-5;
    private final IIIIIIIIl<IIIlllI> IIl = this.IIlllIl(new IIIIIIIIl<IIIlllI>(StringFactory.IIII("Exploit Mode"), IIIlllI.class, IIIlllI.l));
    private boolean IlI;
    private boolean Ill;
    private static final double lII = 1.0E-4;
    private static final float lIl = 45.0f;
    private static final int[] ll;
    private static final String[] llI;
    private static final Object[] lll;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player != null && minecraftClient.options != null && minecraftClient.getNetworkHandler() != null) {
            if (((Boolean)this.I.lIl()).booleanValue()) {
                ((LivingEntityMixin3)minecraftClient.player).ilovcats$setJumpingCooldown(0);
            }
        } else {
            this.lII();
            return;
        }
        if (this.IIlI(minecraftClient) && this.IIl.lIl() == IIIlllI.l) {
            this.IIII(minecraftClient);
            this.lll(minecraftClient);
            return;
        }
        this.Il = false;
        this.IlI = false;
        this.Ill = false;
        this.lI = minecraftClient.player.isOnGround();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lI(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (this.IIl.lIl() != IIIlllI.II) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.options == null) return false;
        if (!minecraftClient.options.forwardKey.isPressed()) return false;
        if (this.lIIl(minecraftClient)) return true;
        return false;
    }

    @Override
    public void llll() {
        this.lII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return 0;
        if (minecraftClient.options == null) {
            return 0;
        }
        int n = 0;
        if (minecraftClient.options.forwardKey.isPressed()) {
            ++n;
        }
        if (minecraftClient.options.backKey.isPressed()) {
            ++n;
        }
        if (minecraftClient.options.leftKey.isPressed()) {
            ++n;
        }
        if (!minecraftClient.options.rightKey.isPressed()) return n;
        return ++n;
    }

    private void lII() {
        this.Il = false;
        this.IlI = false;
        this.Ill = false;
        this.lI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(MinecraftClient minecraftClient, double d) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.options == null) return;
        if (d != 0.0) {
            double d2 = this.lIII(minecraftClient);
            if (!Double.isNaN(d2)) {
                minecraftClient.player.setVelocity(minecraftClient.player.getVelocity().add(-Math.sin(d2) * d, 0.0, Math.cos(d2) * d));
                return;
            }
            return;
        }
    }

    @Override
    public void ll() {
        this.lII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lll(MinecraftClient minecraftClient) {
        boolean bl = minecraftClient.player.isOnGround();
        double d = minecraftClient.player.getVelocity().y;
        if (bl) {
            this.IlI = false;
            this.Ill = false;
            this.lI = true;
            return;
        }
        if (this.lI && d > 0.09 && this.lIlI(minecraftClient)) {
            this.IlI = true;
        }
        this.lI = false;
        if (!this.IlI) return;
        if (this.Ill) return;
        if (lIIllllI.IIllIl((Entity)minecraftClient.player)) return;
        if (d < 1.0E-4) return;
        if (d > 0.09) {
            return;
        }
        double d2 = this.lIII(minecraftClient);
        if (Double.isNaN(d2)) {
            return;
        }
        float f = MathHelper.wrapDegrees((float)((float)Math.toDegrees(d2) + 45.0f));
        IlIlllI.IlII(minecraftClient, 50, f, minecraftClient.player.getPitch(), () -> {
            this.Ill = true;
            return true;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIII(MinecraftClient minecraftClient) {
        if (minecraftClient.options.jumpKey.isPressed() && minecraftClient.player.isOnGround()) {
            if (this.Il) return;
            if (this.lIlI(minecraftClient)) {
                this.lIl(minecraftClient, 1.0E-5);
                this.Il = true;
                return;
            }
            return;
        }
        this.Il = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.getNetworkHandler() == null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (minecraftClient.player.isSneaking()) return false;
        if (minecraftClient.player.isUsingItem()) return false;
        if (minecraftClient.player.isTouchingWater()) return false;
        if (minecraftClient.player.isInLava()) return false;
        if (minecraftClient.player.isClimbing()) return false;
        return true;
    }

    public Speed() {
        super(StringFactory.IIII("Speed"), Category.ll, StringFactory.IIII("Legit speed with straight-line equalization or sprint + autojump."));
        this.I = this.IIlllIl(new llIll((Object)StringFactory.IIII("No Jump Delay"), true));
    }

    private static void IlII() {
        Speed.II[0] = Speed.Illl(Speed.llII(37424, -1640206450, (short)48673).toCharArray(), 8657L, -176180655);
        Speed.II[1] = Speed.Illl(Speed.llII(37425, 1432433145, (short)49701).toCharArray(), 26597L, -1902151810);
        Speed.II[2] = Speed.Illl(Speed.llII(37426, -1397340348, (short)46600).toCharArray(), 36786L, -1191334625);
        Speed.II[3] = Speed.Illl(Speed.llII(37427, 1008217424, (short)27335).toCharArray(), 65513L, -923656165);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IllI(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (this.IIl.lIl() != IIIlllI.II) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.options == null) {
            return false;
        }
        if (!minecraftClient.player.isOnGround()) return false;
        if (!this.lIlI(minecraftClient)) return false;
        if (!this.lIIl(minecraftClient)) return false;
        return true;
    }

    private static String Illl(char[] cArray, long l2, int n) {
        int n2 = 0x456BD800 ^ n;
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
    private double lIII(MinecraftClient minecraftClient) {
        float f = 0.0f;
        if (minecraftClient.options.forwardKey.isPressed()) {
            f += 1.0f;
        }
        if (minecraftClient.options.backKey.isPressed()) {
            f -= 1.0f;
        }
        float f2 = 0.0f;
        if (minecraftClient.options.leftKey.isPressed()) {
            f2 += 1.0f;
        }
        if (minecraftClient.options.rightKey.isPressed()) {
            f2 -= 1.0f;
        }
        if (f != 0.0f || f2 != 0.0f) {
            float f3 = minecraftClient.player.getYaw();
            if (f < 0.0f) {
                f3 += 180.0f;
            }
            float f4 = 1.0f;
            if (f < 0.0f) {
                f4 = -0.5f;
            } else if (f > 0.0f) {
                f4 = 0.5f;
            }
            if (f2 > 0.0f) {
                f3 -= 90.0f * f4;
            }
            if (!(f2 < 0.0f)) return Math.toRadians(f3);
            return Math.toRadians(f3 += 90.0f * f4);
        }
        return Double.NaN;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIl(MinecraftClient minecraftClient) {
        if (!this.IIlI(minecraftClient)) return false;
        if (minecraftClient.player.getHungerManager().getFoodLevel() < 6) return false;
        if (!minecraftClient.player.hasStatusEffect(StatusEffects.BLINDNESS)) return true;
        return false;
    }

    @Override
    public void IllIll(MinecraftClient minecraftClient) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIlI(MinecraftClient minecraftClient) {
        if (this.IlI(minecraftClient) <= 0) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block27: {
            block25: {
                block24: {
                    block28: {
                        block23: {
                            block26: {
                                break block26;
lbl1:
                                // 1 sources

                                while (++var10_5 < var8_3.length) {
                                    while (true) {
                                        break block23;
                                        break;
                                    }
                                }
                                break block27;
lbl5:
                                // 1 sources

                                while (true) {
                                    var2_11 = 960941294;
                                    ** GOTO lbl76
                                    break;
                                }
                            }
                            var6 = 4230;
                            var7_1 = "\uc6c6\u0511\uc1fb\u4131\udfdf\u3a90\u3b9f\ub135\u3c6e\u37e8\u7b1a\u73b1\u44f9\u5626\u5dbf\ue8e6\u300c\udcc9\u44d4\u692d\ua18c\u258e\ubcb7\ubc8f\uc8f5\u72a4\ua4f6\ubb00\ue572\u87fe\uabf0\u6bd7\u093c\ue075\udb4d\u7007\ua1c4\uf348\u4778\u98c3\u9d18\uf3fd\u1959\u3356\u6b89\u274f\u2194\uf890\u6bba\u3548\u6797\uf427\ue525\ub311\ufbe5\u993a\ucd4c\u633f\ucece\ue439\u7582\u1ae5\u1d09\u9418\u93d3\u15b4\ub086\u4a14\u7e38\u8ce0\u409b\u901d\u4537\u0692\uc812\u71ae\u0a9d\u0452\u565c\uce02\uf52e\u159d\u627e\u6b4c\u567d\u10bb\u117d\uf66e\ufef9\u5006\ue558\u4151\u79c0\ua8e5\uc66f\ue9d7\u913f\ufbc4\uc30d\u9a7c\u51e2\u1662\uae3f\u623f\u2027\u0ac6\uf1b2\uc114\u922c\ub8e9\u0d54\u744b\u5933\uebc8\u13fc\uf0a2\u8a92\ucb28\ue572\udc53\ua7d8\u406f\u4c0f\u23bb\udc0b\u875e\ubded\uf52f\u4875\u6b69\u61b7\uf30e";
                            var8_3 = "\u0014\bX\u0010".toCharArray();
                            ** GOTO lbl81
lbl13:
                            // 1 sources

                            while (true) {
                                v0 = 7;
                                break block24;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var11_6 += var12_7;
                                ** GOTO lbl1
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var12_7 = var8_3[var10_5];
                        var14_9 = var7_1.substring(var11_6, var11_6 + var12_7).toCharArray();
                        var15_10 = 0;
                        break block28;
lbl26:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            if (var13_8 != 0) ** continue;
                            ** GOTO lbl65
                            break;
                        }
lbl31:
                        // 1 sources

                        while (true) {
                            var4_15 = 0;
                            break block25;
                            break;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            Speed.II = new String[4];
                            Speed.IlII();
                            return;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var11_6 = 0;
                            ** GOTO lbl-1000
                            break;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            var13_8 = -1;
                            ** GOTO lbl73
                            break;
                        }
                        v1 = var15_10++;
                        var14_9[v1] = (char)(var14_9[v1] ^ var16_2 ^ var6);
                        if (var15_10 >= var14_9.length) ** GOTO lbl71
                    }
                    switch (var15_10 % 5) {
                        case 1: {
                            ** continue;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        case 2: {
                            v0 = 60;
                            break;
                        }
                    }
lbl-1000:
                    // 1 sources

                    {
                        var12_7 = '\u0000';
                        ** continue;
                        case 3: {
                            v0 = 76;
                            break;
                        }
lbl62:
                        // 1 sources

                        while (true) {
                            var1_13 = var0_12.length / 4;
                            ** continue;
                            break;
                        }
lbl65:
                        // 1 sources

                        Speed.llI = var9_4;
                        Speed.lll = new Object[var9_4.length];
                        ** continue;
                        Speed.ll = new int[var1_13];
                        var3_14 = 0;
                        ** continue;
lbl71:
                        // 1 sources

                        var9_4[var10_5] = new String(var14_9).intern();
                        ** continue;
lbl73:
                        // 2 sources

                        while (true) {
                            var10_5 = 0;
                            ** continue;
                            break;
                        }
lbl76:
                        // 1 sources

                        var0_12 = "\u0084L\u00a6\u00a0\u00b8\u008e\u00ef,\u0000o\u0082\u0088$\u0006\u0019\u00d8\u00b1\u00d0\u00d2l\u00ab\u00c2\u00b5#\u0014\u00da\u00b8\u009b\u00c7\u00cco\u0004".getBytes("ISO-8859-1");
                        ** continue;
                        default: {
                            v0 = 71;
                            break;
                        }
lbl81:
                        // 1 sources

                        var9_4 = new String[var8_3.length];
                        ** continue;
                        case 4: {
                            v0 = 64;
                            break;
                        }
                    }
                }
                var16_2 = v0;
                ** while (true)
                Speed.ll[var4_15] = var5_16 ^= var2_11;
                var3_14 += 4;
                ** while (++var4_15 >= var1_13)
            }
            var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
            ** while (true)
        }
        var13_8 = 0;
        ** while (true)
    }

    private static int lIll(int n, int n2) {
        return ll[n ^ 0x2476514C] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llII(int n, int n2, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x9230;
        char[] cArray = llI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Speed.lll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2364;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 63060;
            n7 -= 30306;
            n7 -= 45635;
            n7 -= 37100;
            n7 += 47587;
            n7 -= 53331;
            n7 ^= 0x5FD4;
            n7 += 34933;
            n7 += 56988;
            cArray[n6] = (char)((n7 ^= 0x1737) ^ n4 ^ s ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

