/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlll
 * Module         : Jump Reset  [MOVEMENT]
 * Description    : Mitigates velocity by automatically jumping.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Only facing target
 *   - Players Only
 *   - Cooldown
 *   - Chance
 *   - ticks
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
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.damage.DamageSource
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.MathHelper
 */
package orchard.module.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIlII;
import orchard.internal.lIIIIIlI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class JumpReset
extends ModuleBase {
    private boolean I;
    private LivingEntity l;
    private final IIIIIIIIl<lIIIIIlI> II = this.IIlllIl(new IIIIIIIIl<lIIIIIlI>(StringFactory.IIII("Mode"), lIIIIIlI.class, lIIIIIlI.Il));
    private final lIlIIlI Il;
    private final lIlIIlI lI;
    private int ll;
    private static final int III = 1;
    private final llIll IIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Players Only"), true));
    private final llIll IlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only facing target"), true));
    private int Ill;
    private boolean lII;
    private static final String[] lIl;
    private static final Object[] llI;

    /*
     * Enabled aggressive block sorting
     */
    public JumpReset() {
        super(StringFactory.IIII("soFZjFllVQ+SHA=="), Category.ll, StringFactory.IIII("tZ1AlR5WRBmESIlcA9zdl4yNFJ4AF1EJgweSWBva3Z+UmE3cE0JdDJ4GmBc="));
        this.lI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Chance"), 100.0, 0.0, 100.0, 1.0).IIII(StringFactory.IIII("%")));
        this.Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Cooldown"), 10.0, 0.0, 20.0, 1.0).IIII(StringFactory.IIII("ticks")));
    }

    @Override
    public void llll() {
        this.lII(MinecraftClient.getInstance(), false);
        this.IlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void I(DamageSource damageSource) {
        LivingEntity livingEntity;
        if (!this.IIIlIIl()) {
            return;
        }
        Entity entity = damageSource == null ? null : damageSource.getAttacker();
        this.l = entity instanceof LivingEntity ? (livingEntity = (LivingEntity)entity) : null;
        this.I = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lI(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl() || minecraftClient == null || minecraftClient.player == null || minecraftClient.currentScreen != null || !minecraftClient.isWindowFocused()) {
            this.lII(minecraftClient, false);
            this.IlI();
            return false;
        }
        if (this.ll > 0) {
            --this.ll;
        }
        boolean bl = false;
        if (this.I) {
            LivingEntity livingEntity = this.l;
            this.lIl();
            if (this.ll != 0 || !this.IIl(minecraftClient, livingEntity) || !(Math.random() * 100.0 < (Double)this.lI.lIl())) {
                this.lII = false;
                this.Ill = 0;
            } else {
                this.ll = ((Double)this.Il.lIl()).intValue();
                if (this.II.lIl() != lIIIIIlI.l) {
                    this.lII = false;
                    this.Ill = 1;
                } else {
                    this.lII = true;
                    this.Ill = 0;
                    bl = true;
                }
            }
        }
        if (this.lII && !bl) {
            this.lII = false;
            this.Ill = 1;
        }
        boolean bl2 = this.Ill > 0;
        if (this.Ill <= 0) return bl2;
        --this.Ill;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient.player == null) return false;
        if (!minecraftClient.player.isOnGround()) return false;
        if (minecraftClient.player.isUsingItem()) {
            return false;
        }
        if (livingEntity == minecraftClient.player) {
            return false;
        }
        if (((Boolean)this.IIl.lIl()).booleanValue()) {
            if (!(livingEntity instanceof PlayerEntity)) return false;
        }
        if ((Boolean)this.IlI.lIl() == false) return true;
        if (livingEntity == null) return false;
        if (this.lll((PlayerEntity)minecraftClient.player, livingEntity)) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IlI() {
        this.Ill = 0;
        this.lII = false;
        this.ll = 0;
        this.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lII(MinecraftClient minecraftClient, boolean bl) {
        boolean bl2;
        KeyBinding keyBinding;
        block5: {
            block3: {
                block4: {
                    IIIIlII iIIIlII;
                    block2: {
                        if (minecraftClient == null) return;
                        if (minecraftClient.options == null) return;
                        if (minecraftClient.options.jumpKey == null) {
                            return;
                        }
                        iIIIlII = IIIIlII.IlI();
                        if (iIIIlII != null) break block2;
                        keyBinding = minecraftClient.options.jumpKey;
                        if (!bl && !lIIllllI.IIllIII(minecraftClient, minecraftClient.options.jumpKey)) break block3;
                        break block4;
                    }
                    if (!bl) {
                        iIIIlII.ll(this, minecraftClient, minecraftClient.options.jumpKey);
                        return;
                    }
                    iIIIlII.Il(this, minecraftClient, minecraftClient.options.jumpKey, true);
                    return;
                }
                bl2 = true;
                break block5;
            }
            bl2 = false;
        }
        keyBinding.setPressed(bl2);
    }

    private void lIl() {
        this.I = false;
        this.l = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null && minecraftClient.player != null && minecraftClient.currentScreen == null) {
            if (minecraftClient.isWindowFocused()) return;
        }
        this.lII(minecraftClient, false);
        this.IlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(PlayerEntity playerEntity, LivingEntity livingEntity) {
        double d;
        double d2 = livingEntity.getX() - playerEntity.getX();
        if (d2 * d2 + (d = livingEntity.getZ() - playerEntity.getZ()) * d < 1.0E-6) {
            return true;
        }
        float f = (float)(Math.toDegrees(Math.atan2(d, d2)) - 90.0);
        if (!(Math.abs(MathHelper.wrapDegrees((float)(f - playerEntity.getYaw()))) <= 90.0f)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block8: {
                block7: {
                    block9: {
                        block10: {
                            break block10;
lbl1:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl3:
                            // 1 sources

                            while (true) {
                                JumpReset.llI = new Object[var3_3.length];
                                return;
                            }
lbl6:
                            // 1 sources

                            while (true) {
                                if (var7_7 != 0) break block7;
                                break block8;
lbl9:
                                // 1 sources

                                while (true) {
                                    break block9;
                                    break;
                                }
                                break;
                            }
                        }
                        var0 = 24386;
                        break block11;
                    }
                    if (++var4_4 >= var2_2.length) {
                        var7_7 = 0;
lbl17:
                        // 2 sources

                        while (true) {
                            var4_4 = 0;
                            ** continue;
                            break;
                        }
lbl20:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                }
                var6_6 = var2_2[var4_4] ^ var0;
                var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                var5_5 += var6_6;
                ** while (true)
            }
            JumpReset.lIl = var3_3;
            ** while (true)
        }
        var1_1 = "\uc9ff\uc958\uc924\uc97e\uc934\uc91b\uc9eb\uc987\uc9b5\uc95e\uc9de\uc9e9\uc9c6\uc924\uc984\uc96b\ubdde\ubd4b\ubd75\ubd43\ubd14\ubd29\ubd94\ubd9a\ubd97\ubd6b\ubdbe\ubdd9\ubdfb\ubd0a\ubdf3\ubd13\ubd1d\ubdcd\ubd23\ubd3c\ubdec\ubd7d\ubda1\ubd0b\ubd7e\ubd76\ubd8b\ubd6d\ubd73\ubd6f\ubd9c\ubd7d\ubdcd\ubd66\ubd21\ubd51\ubd2f\ubd39\ubdd7\ubdac\ubdf6\ubd73\ubdf8\ubdc9\ubdc5\ubd06\ubdac\ubd13\ubd19\ubdc4\ubd13\ubd3c\ubdc4\ubd03\ubdec\ubd02\ubd55\ubd7e\ubddc\ubd11\u4a2f\u4aba\u4ac1\u4aa2\u4ae4\u4adb\u4a6d\u4a01\u5340\u53c0\u53b7\u53cf\u538b\u53b2\u5342\u5310\u530f\u5383\u5331\u5333\u5371\u53a8\u534a\u53aa\u1519\u15e3\u15f3\u159c\u15d7\u15ea\u150a\u1558\u1557\u15bc\u153f\u153e\u152d\u15f4\u153f\u15ed\u15dc\u150a\u15d2\u15d2\u152a\u15d4\u152d\u15c3\u06a9\u0652\u064a\u0622\u0665\u0665\u06a7\u06e8\ua49b\ua442\ua47b\ua43d\ucb5c\ucba7\ucbb3\ucbe3\ucb90\ucbba\ucb13\ucb17\ucb14\ucbd2\ucb19\ucb22\u2fa7\u2f3c\u2f12\u2f3d\u2f73\u2f6b\u2fa9\u2f97";
        var2_2 = "\u5f52\u5f7e\u5f4a\u5f52\u5f5a\u5f4a\u5f46\u5f4e\u5f4a".toCharArray();
        ** while (true)
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        ** while (true)
        var5_5 = 0;
        var6_6 = 0;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xAA9A2EBD;
        char[] cArray = lIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            JumpReset.llI[n3] = stackTraceElementArray = new Throwable().getStackTrace();
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xB8FAC5D6;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 9 -> 195;
                case 11 -> 118;
                case 18 -> 179;
                case 2 -> 174;
                case 14 -> 117;
                case 21 -> 163;
                case 23 -> 175;
                case 27 -> 198;
                case 16 -> 182;
                case 19 -> 178;
                case 26 -> 85;
                case 10 -> 57;
                case 5 -> 145;
                case 28 -> 223;
                case 4 -> 146;
                case 29 -> 180;
                case 24 -> 210;
                case 1 -> 251;
                case 17 -> 30;
                case 31 -> 221;
                case 7 -> 39;
                case 8 -> 47;
                case 13 -> 169;
                case 25 -> 214;
                case 12 -> 66;
                case 3 -> 232;
                case 20 -> 106;
                case 30 -> 51;
                case 15 -> 154;
                case 6 -> 75;
                case 22 -> 50;
                default -> 64;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

