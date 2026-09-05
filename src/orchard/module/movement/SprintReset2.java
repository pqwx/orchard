/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIlllI
 * Module         : SprintReset  [MOVEMENT]
 * Description    : Resets sprint on hit via W-Tap or S-Tap for extra knockback.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Reaction Delay
 *   - Allow In Air
 *   - .getBytes(
 *   - Duration
 *   - Chance
 *   - Mode
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
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.PlayerInput
 */
package orchard.module.movement;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.Input;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.PlayerInput;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIlII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IlIIlllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIllll;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class SprintReset2
extends ModuleBase {
    private IlIIlllI I;
    private int l;
    private final llIll II;
    private final lIlIIlI Il;
    private long lI;
    private int ll;
    private Entity III;
    private final IIIlIlIIl IIl;
    private long IlI;
    private final IIIlIlIIl Ill;
    private final IIIIIIIIl<lIllll> lII = this.IIlllIl(new IIIIIIIIl<lIllll>(StringFactory.IIII("Mode"), lIllll.class, lIllll.l));
    private boolean lIl;
    private boolean llI;
    private static final int[] lll;
    private static final String[] IIII;
    private static final Object[] IIIl;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.options == null) return;
        if (this.I == IlIIlllI.l) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (this.I == IlIIlllI.Il) {
            if (l2 < this.IlI) return;
            this.I = IlIIlllI.I;
            this.lIl = false;
            minecraftClient.player.setSprinting(false);
            this.lIl(minecraftClient);
            return;
        }
        if (this.I != IlIIlllI.I) return;
        if (l2 >= this.lI) {
            this.IIl(minecraftClient);
            return;
        }
        minecraftClient.player.setSprinting(false);
        this.lIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lI(MinecraftClient minecraftClient, Input input) {
        float f;
        float f2;
        this.lIl(minecraftClient);
        PlayerInput playerInput = input.playerInput;
        boolean bl = this.lII.lIl() == lIllll.Il;
        boolean bl2 = false;
        boolean bl3 = !bl ? playerInput.backward() : true;
        boolean bl4 = playerInput.left();
        boolean bl5 = playerInput.right();
        boolean bl6 = playerInput.jump();
        boolean bl7 = playerInput.sneak();
        input.playerInput = new PlayerInput(bl2, bl3, bl4, bl5, bl6, bl7, false);
        float f3 = !bl ? (bl3 ? -1.0f : 0.0f) : (f2 = -1.0f);
        float f4 = bl4 != bl5 ? (bl4 ? 1.0f : -1.0f) : (f = 0.0f);
        if (f2 != 0.0f && f != 0.0f) {
            float f5 = 0.70710677f;
            f2 *= f5;
            f *= f5;
        }
        lIIllllI.lIII(input, f2, f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(MinecraftClient minecraftClient) {
        this.lII(minecraftClient);
        if (this.lIl && this.IlI(minecraftClient)) {
            minecraftClient.player.setSprinting(true);
        }
        this.lIIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!lIIllllI.IIllIII(minecraftClient, minecraftClient.options.forwardKey)) {
            if (!minecraftClient.options.forwardKey.isPressed()) return false;
        }
        if (lIIllllI.IIllIII(minecraftClient, minecraftClient.options.backKey)) return false;
        if (minecraftClient.player.isSneaking()) return false;
        if (minecraftClient.player.isUsingItem()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII(MinecraftClient minecraftClient) {
        IIIIlII iIIIlII;
        if (minecraftClient == null) return;
        if (minecraftClient.options != null) {
            iIIIlII = IIIIlII.IlI();
            if (iIIIlII == null) {
                this.Illl(minecraftClient, null, minecraftClient.options.forwardKey);
                this.Illl(minecraftClient, null, minecraftClient.options.backKey);
                return;
            }
        } else {
            return;
        }
        iIIIlII.II(this, minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void I(Entity entity) {
        this.lIII();
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (this.lIlI(minecraftClient, entity)) {
            this.III = entity;
            this.llI = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.options != null) {
            IIIIlII iIIIlII = IIIIlII.IlI();
            this.IIII(minecraftClient, iIIIlII, minecraftClient.options.forwardKey, false);
            if (this.lII.lIl() != lIllll.Il) {
                this.Illl(minecraftClient, iIIIlII, minecraftClient.options.backKey);
                return;
            }
            this.IIII(minecraftClient, iIIIlII, minecraftClient.options.backKey, true);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.options == null) return;
        if (this.I == IlIIlllI.l) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (this.I == IlIIlllI.Il) {
            if (l2 < this.IlI) return;
            if (minecraftClient.player.age < this.ll) return;
            this.I = IlIIlllI.I;
            this.lIl = false;
            minecraftClient.player.setSprinting(false);
            this.lIl(minecraftClient);
            return;
        }
        if (this.I != IlIIlllI.I) return;
        if (l2 >= this.lI && minecraftClient.player.age >= this.l) {
            this.IIl(minecraftClient);
            return;
        }
        minecraftClient.player.setSprinting(false);
        this.lIl(minecraftClient);
    }

    @Override
    public void llll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.IIl(minecraftClient);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lll() {
        if (!this.IIIlIIl()) return false;
        if (this.I != IlIIlllI.I) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIII(MinecraftClient minecraftClient, IIIIlII iIIIlII, KeyBinding keyBinding, boolean bl) {
        if (keyBinding == null) {
            return;
        }
        if (iIIIlII != null) {
            iIIIlII.Il(this, minecraftClient, keyBinding, bl);
            return;
        }
        keyBinding.setPressed(bl);
    }

    public lIllll IIlI() {
        return (lIllll)((Object)this.lII.lIl());
    }

    /*
     * Enabled aggressive block sorting
     */
    private long IlII(IIIlIlIIl iIIlIlIIl) {
        double d = Math.min(iIIlIlIIl.IIIl(), iIIlIlIIl.IIII());
        double d2 = Math.max(iIIlIlIIl.IIIl(), iIIlIlIIl.IIII());
        if (!(d2 <= d)) return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
        return Math.max(0L, Math.round(d));
    }

    /*
     * Enabled aggressive block sorting
     */
    public SprintReset2() {
        super(StringFactory.IIII("SprintReset"), Category.ll, StringFactory.IIII("Resets sprint on hit via W-Tap or S-Tap for extra knockback."));
        this.Ill = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Duration"), 100.0, 150.0, 20.0, 500.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.IIl = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Reaction Delay"), 0.0, 15.0, 0.0, 200.0, 1.0).IIll(StringFactory.IIII("ms")));
        this.II = this.IIlllIl(new llIll((Object)StringFactory.IIII("Allow In Air"), true));
        this.Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Chance"), 100.0, 0.0, 100.0, 1.0).IIII(StringFactory.IIII("%")));
        this.I = IlIIlllI.l;
        this.ll = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI() {
        double d = (Double)this.Il.lIl();
        if (d >= 100.0) return true;
        if (d <= 0.0) {
            return false;
        }
        if (ThreadLocalRandom.current().nextDouble(100.0) < d) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illl(MinecraftClient minecraftClient, IIIIlII iIIIlII, KeyBinding keyBinding) {
        if (keyBinding == null) {
            return;
        }
        if (iIIIlII != null) {
            iIIIlII.ll(this, minecraftClient, keyBinding);
            return;
        }
        keyBinding.setPressed(minecraftClient != null && lIIllllI.IIllIII(minecraftClient, keyBinding));
    }

    private void lIII() {
        this.III = null;
        this.llI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl() {
        this.I = IlIIlllI.l;
        this.IlI = 0L;
        this.lI = 0L;
        this.ll = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.lIl = false;
        this.lIII();
    }

    @Override
    public String II() {
        return ((lIllll)((Object)this.lII.lIl())).toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IlIIlI(Entity entity) {
        boolean bl;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        boolean bl2 = bl = this.llI && entity == this.III;
        if (!bl && this.lIlI(minecraftClient, entity)) {
            bl = true;
        }
        this.lIII();
        if (!bl) return;
        if (!(entity instanceof LivingEntity)) return;
        LivingEntity livingEntity = (LivingEntity)entity;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.options == null) return;
        if (minecraftClient.currentScreen != null) return;
        if (livingEntity == minecraftClient.player) return;
        if (!livingEntity.isAlive()) return;
        if (livingEntity.isRemoved()) {
            return;
        }
        long l2 = System.currentTimeMillis();
        long l3 = this.IlII(this.IIl);
        this.IlI = l2 + l3;
        this.ll = minecraftClient.player.age + (l3 > 0L ? (int)Math.ceil((double)l3 / 50.0) : 0);
        long l4 = Math.max(1L, this.IlII(this.Ill));
        this.lI = this.IlI + l4;
        this.l = this.ll + Math.max(2, (int)Math.ceil((double)l4 / 50.0));
        this.lIl = false;
        this.I = l3 > 0L ? IlIIlllI.Il : IlIIlllI.I;
        if (this.I != IlIIlllI.I) return;
        minecraftClient.player.setSprinting(false);
        this.lIl = true;
        this.lIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlI(MinecraftClient minecraftClient, Entity entity) {
        if (!(entity instanceof LivingEntity)) return false;
        LivingEntity livingEntity = (LivingEntity)entity;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!((Boolean)this.II.lIl()).booleanValue()) {
            if (!minecraftClient.player.isOnGround()) return false;
        }
        if (livingEntity == minecraftClient.player) return false;
        if (!livingEntity.isAlive()) return false;
        if (livingEntity.isRemoved()) return false;
        if (!minecraftClient.player.isSprinting()) {
            // empty if block
        }
        if (!this.IllI()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lIll(MinecraftClient minecraftClient, Input input) {
        if (this.I == IlIIlllI.l) {
            return false;
        }
        if (this.IIIlIIl() && minecraftClient != null && minecraftClient.player != null && minecraftClient.options != null && input != null && input.playerInput != null && minecraftClient.currentScreen == null) {
            long l2 = System.currentTimeMillis();
            if (this.I == IlIIlllI.Il) {
                if (l2 < this.IlI) return false;
                if (minecraftClient.player.age < this.ll) return false;
                this.I = IlIIlllI.I;
                this.lIl = false;
            }
            if (l2 < this.lI || minecraftClient.player.age < this.l) {
                minecraftClient.player.setSprinting(false);
                this.lIl = true;
                this.lI(minecraftClient, input);
                return true;
            }
            this.IIl(minecraftClient);
            return false;
        }
        this.IIl(minecraftClient);
        return false;
    }

    private static int llII(int n, int n2) {
        return lll[n ^ 0xBEB89B0C] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block39: {
            block38: {
                block35: {
                    block26: {
                        block36: {
                            block32: {
                                block37: {
                                    block29: {
                                        block27: {
                                            block34: {
                                                block28: {
                                                    block33: {
                                                        block30: {
                                                            block31: {
                                                                break block30;
lbl1:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl3:
                                                                // 1 sources

                                                                while (true) {
                                                                    var11_7 += var12_8;
                                                                    break block26;
                                                                    break;
                                                                }
lbl6:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl8:
                                                                // 2 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                                SprintReset2.lll[var4_15] = var5_16 ^= var2_2;
                                                                var3_14 += 4;
                                                                if (++var4_15 < var1_13) break block31;
                                                                break block32;
lbl14:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl16:
                                                                // 1 sources

                                                                while (true) {
                                                                    break block27;
                                                                    break;
                                                                }
lbl18:
                                                                // 1 sources

                                                                while (true) {
                                                                    v0 = 30;
                                                                    break block28;
                                                                    break;
                                                                }
                                                            }
lbl22:
                                                            // 2 sources

                                                            while (true) {
                                                                var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
                                                                ** continue;
                                                                break;
                                                            }
lbl25:
                                                            // 1 sources

                                                            while (true) {
                                                                v0 = 33;
                                                                break block28;
                                                                break;
                                                            }
                                                            var0_12 = "9\\xV\u00c5WsT\u00d9J:X\u0006\u00f7\u00b77".getBytes("ISO-8859-1");
                                                            break block33;
lbl30:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
lbl32:
                                                            // 1 sources

                                                            while (true) {
                                                                var9_5[var10_6] = new String(var14_10).intern();
                                                                ** continue;
                                                                break;
                                                            }
                                                            var12_8 = 0;
                                                            if (var13_9 == 0) {
                                                                ** continue;
                                                            }
                                                            break block34;
                                                        }
                                                        var6 = 17484;
                                                        break block35;
                                                    }
                                                    var1_13 = var0_12.length / 4;
                                                    break block36;
                                                }
lbl46:
                                                // 4 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl48:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl50:
                                                // 1 sources

                                                while (true) {
                                                    var13_9 = 0;
                                                    ** GOTO lbl8
                                                    break;
                                                }
                                                SprintReset2.IIII = var9_5;
                                                break block37;
                                            }
lbl56:
                                            // 2 sources

                                            while (true) {
                                                break block29;
                                                break;
                                            }
                                        }
                                        if (var15_11 >= var14_10.length) {
                                            ** continue;
                                        }
                                        break block38;
                                    }
                                    var12_8 = var8_4[var10_6] ^ var6;
                                    var14_10 = var7_3.substring(var11_7, var11_7 + var12_8).toCharArray();
                                    var15_11 = 0;
                                    break block38;
                                }
                                SprintReset2.IIIl = new Object[var9_5.length];
                                var2_2 = 46278885;
                                ** while (true)
                                var10_6 = 0;
                                var11_7 = 0;
                                ** while (true)
                                var16_1 = v0;
                                v1 = var15_11++;
                                var14_10[v1] = (char)(var14_10[v1] ^ var16_1);
                                ** while (true)
                            }
                            return;
lbl80:
                            // 1 sources

                            while (true) {
                                v0 = 43;
                                ** GOTO lbl46
                                break;
                            }
                        }
                        SprintReset2.lll = new int[var1_13];
                        break block39;
lbl86:
                        // 1 sources

                        while (true) {
                            v0 = 40;
                            ** GOTO lbl46
                            break;
                        }
                    }
                    ** while (++var10_6 < var8_4.length)
lbl91:
                    // 1 sources

                    ** while (true)
                }
                var7_3 = "\u68b1\u68f7\u6897\u68b9\u680e\u6894\u68a7\u688d\u68af\u68f2\u6855\u6884\u688d\u68af\u68eb\u68e5\uc287\uc291\uc2a9\uc296\uc2db\uc2a7\uc2ce\uc2a8\uc29d\uc20f\uc2cd\uc2a9\uc2aa\uc2ae\uc2e6\uc2b0\uc2a0\uc2d8\uc28e\uc2fe\uc28d\uc2ab\uc28c\uc283\uc2e8\uc2bf\uc289\uc2bd\uc291\uc2e2\uc28d\uc285\uc2c4\uc2a8\uc299\uc2a5\uc2bf\uc2a4\uc2ef\uc2f4\uc282\uc291\uc2aa\uc29b\uc29f\uc2a9\uc283\uc2a5\uc292\uc2e2\uc2be\uc25e\uc2b3\uc298\uc2f3\uc2a0\uc287\uc2a5\uc2bb\uc2f5\uc29f\uc2d9\uc284\uc295\uc2db\uc28c\uc2af\uc289\uc2bb\uc2d8\uc2be\uc2b2\uc2ba\uc2a6\uc282\uc2b9\uc25c\uc2d8\uc291\uc2e8\ua3ae\ua385\ua3ad\ua3b7\ua3fd\ua381\ua39c\ua396\u7985\u79ad\u7956\u7960\u79d5\u79bc\u79d5\u798b\u7985\u79cb\u79a4\u79d9\u5b30\u5b0a\u5b3a\u5b59\u98bf\u98b9\u9881\u98a4\u98f2\u98b1\u98f6\u98a0\u98ae\u98e0\u988c\u9891\u988f\u9880\u98e8\u9892\u988d\u98be\u989f\u98a3\u68a9\u688f\u68a3\u68cc\u9e5f\u9e73\u9e4f\u9e4d\u9e11\u9e5d\u9e19\u9e7f\u9e79\u9e2a\u9e68\u9e75\u9e6a\u9e4c\u9e22\u9e68\u3d7f\u3d36\u3d7f\u3d68\u3d31\u3d6c\u3d7d\u3d52\u4f12\u4f7d\u4f1b\u4f2e";
                var8_4 = "\u445c\u441c\u4444\u4440\u4448\u4458\u4448\u445c\u4444\u4448".toCharArray();
                ** while (true)
                var9_5 = new String[var8_4.length];
                var13_9 = -1;
                ** while (true)
lbl99:
                // 1 sources

                while (true) {
                    v0 = 112;
                    ** continue;
                    break;
                }
            }
            switch (var15_11 % 5) {
                case 3: {
                    ** continue;
                }
                case 1: {
                    ** continue;
                }
                case 2: {
                    ** continue;
                }
                default: {
                    ** continue;
                }
                ** case 4:
lbl113:
                // 1 sources

                ** continue;
            }
        }
        var3_14 = 0;
        var4_15 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llIl(char c, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x4942;
        char[] cArray = IIII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            SprintReset2.IIIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x792F;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 22141;
            n7 += 44934;
            n7 ^= 0xEACE;
            cArray[n6] = (char)((n7 ^= 0xA1A4) ^ n4 ^ c ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

