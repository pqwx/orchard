/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllI
 * Module         : SnapTap  [MOVEMENT]
 * Description    : Makes opposing movement inputs resolve to the most recent direction.   (client's own text)
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
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.option.KeyBinding
 */
package orchard.module.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.KeyBinding;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIlII;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
public final class SnapTap
extends ModuleBase {
    private boolean I;
    private long l;
    private long II;
    private boolean Il;
    private long lI;
    private boolean ll;
    private long III;
    private boolean IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lI(boolean bl, boolean bl2, long l2, long l3, boolean bl3) {
        boolean bl4;
        if (!bl || !bl2) {
            boolean bl5;
            if (bl3) {
                bl5 = bl;
                return bl5;
            }
            bl5 = bl2;
            return bl5;
        }
        boolean bl6 = bl4 = l2 > l3;
        if (bl3) {
            boolean bl7 = bl4;
            return bl7;
        }
        if (!bl4) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(MinecraftClient minecraftClient, KeyBinding keyBinding, boolean bl, boolean bl2, KeyBinding keyBinding2, boolean bl3, boolean bl4) {
        IIIIlII iIIIlII = IIIIlII.IlI();
        if (iIIIlII == null) {
            return;
        }
        if (!bl || !bl3) {
            iIIIlII.ll(this, minecraftClient, keyBinding);
            iIIIlII.ll(this, minecraftClient, keyBinding2);
            return;
        }
        iIIIlII.Il(this, minecraftClient, keyBinding, bl2);
        iIIIlII.Il(this, minecraftClient, keyBinding2, bl4);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.IIl = false;
        this.Il = false;
        this.I = false;
        this.ll = false;
        this.II = 0L;
        this.lI = 0L;
        this.l = 0L;
        this.III = 0L;
    }

    public SnapTap() {
        super(StringFactory.IIII("SnapTap"), Category.ll, StringFactory.IIII("Makes opposing movement inputs resolve to the most recent direction."));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        MinecraftClient minecraftClient;
        block1: {
            IIIIlII iIIIlII;
            block2: {
                block0: {
                    minecraftClient = MinecraftClient.getInstance();
                    if (minecraftClient == null) return;
                    if (minecraftClient.options == null) break block0;
                    iIIIlII = IIIIlII.IlI();
                    if (iIIIlII == null) break block1;
                    break block2;
                }
                return;
            }
            iIIIlII.II(this, minecraftClient);
        }
        GameOptions gameOptions = minecraftClient.options;
        gameOptions.leftKey.setPressed(lIIllllI.IIllIII(minecraftClient, gameOptions.leftKey));
        gameOptions.rightKey.setPressed(lIIllllI.IIllIII(minecraftClient, gameOptions.rightKey));
        gameOptions.forwardKey.setPressed(lIIllllI.IIllIII(minecraftClient, gameOptions.forwardKey));
        gameOptions.backKey.setPressed(lIIllllI.IIllIII(minecraftClient, gameOptions.backKey));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.options == null) return;
        if (minecraftClient.currentScreen != null) {
            return;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null && clientEntrypoint.IlI() != null && clientEntrypoint.IlI().IIIIIII() != null && clientEntrypoint.IlI().IIIIIII().lll()) {
            return;
        }
        GameOptions gameOptions = minecraftClient.options;
        boolean bl = lIIllllI.IIllIII(minecraftClient, gameOptions.leftKey);
        boolean bl2 = lIIllllI.IIllIII(minecraftClient, gameOptions.rightKey);
        boolean bl3 = lIIllllI.IIllIII(minecraftClient, gameOptions.forwardKey);
        boolean bl4 = lIIllllI.IIllIII(minecraftClient, gameOptions.backKey);
        long l2 = System.currentTimeMillis();
        if (bl && !this.IIl) {
            this.II = l2;
        }
        if (bl2 && !this.Il) {
            this.lI = l2;
        }
        if (bl3 && !this.I) {
            this.l = l2;
        }
        if (bl4 && !this.ll) {
            this.III = l2;
        }
        this.IIl = bl;
        this.Il = bl2;
        this.I = bl3;
        this.ll = bl4;
        boolean bl5 = SnapTap.lI(bl, bl2, this.II, this.lI, true);
        boolean bl6 = SnapTap.lI(bl, bl2, this.II, this.lI, false);
        boolean bl7 = SnapTap.lI(bl4, bl3, this.III, this.l, false);
        boolean bl8 = SnapTap.lI(bl4, bl3, this.III, this.l, true);
        this.IIl(minecraftClient, gameOptions.leftKey, bl, bl5, gameOptions.rightKey, bl2, bl6);
        this.IIl(minecraftClient, gameOptions.forwardKey, bl3, bl7, gameOptions.backKey, bl4, bl8);
        gameOptions.leftKey.setPressed(bl5);
        gameOptions.rightKey.setPressed(bl6);
        gameOptions.forwardKey.setPressed(bl7);
        gameOptions.backKey.setPressed(bl8);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block7: {
                block11: {
                    block8: {
                        block9: {
                            break block9;
lbl1:
                            // 1 sources

                            while (var7_7 == 0) {
                                break block7;
                            }
                            break block10;
lbl4:
                            // 1 sources

                            while (true) {
                                var6_6 = 0;
                                ** GOTO lbl1
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

                            while (++var4_4 >= var2_2.length) {
                                break block8;
                            }
                            break block10;
lbl12:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl14:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                ** GOTO lbl9
                                break;
                            }
                        }
                        var0 = 6960;
                        break block11;
                    }
                    var7_7 = 0;
                    ** GOTO lbl14
                    var4_4 = 0;
                    var5_5 = 0;
                    ** while (true)
                    var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                    var5_5 += var6_6;
                    ** while (true)
                }
                var1_1 = "\ue959\ue9b9\ue9ef\ue9b5\ue990\ue939\ue9a5\ue913\ue946\ue9d3\ue978\ue942\ud2a7\ud22d\ud232\ud27e\ud26c\ud2d0\ud200\ud2e7\ud2b4\ud21e\ud2c7\ud2cc\ud217\ud2ae\ud28a\ud2da\ud2e0\ud200\ud258\ud2eb\ud231\ud286\ud25b\ud242\ud20f\ud24d\ud2fb\ud2bf\ud211\ud2d9\ud233\ud205\ud2bd\ud210\ud205\ud248\ud255\ud2c3\ud219\ud2fe\ud282\ud206\ud2c7\ud2e0\ud23d\ud2ab\ud287\ud2da\ud2e5\ud255\ud242\ud2df\ud219\ud2f9\ud256\ud248\ud233\ud226\ud2fb\ud297\ud22d\ud2b5\ud22e\ud234\ud2ba\ud243\ud225\ud24d\ud26b\ud2e9\ud217\ud2ea\ud2ba\ud23b\ud2f5\ud2c0\ud206\ud2d0\ud286\ud2da\ud2e9\ud200\ud269\ud2ea\ud233\ud2c3\ud279\ud263\ud20d\ud263\ud2f7\ud2e1";
                var2_2 = "\u1b3c\u1b6c".toCharArray();
                ** while (true)
            }
            SnapTap.IlI = var3_3;
            SnapTap.Ill = new Object[var3_3.length];
            return;
            var3_3 = new String[var2_2.length];
            var7_7 = -1;
            ** while (true)
        }
        var6_6 = var2_2[var4_4] ^ var0;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String IlI(int var0, int var1_1) {
        var3_2 = var0 ^ -271485010;
        var4_4 = SnapTap.IlI[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])SnapTap.Ill[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            SnapTap.Ill[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 715673762;
        var8_8 = 0;
        if (true) ** GOTO lbl17
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) {
                return new String(var4_4).intern();
            }
lbl17:
            // 3 sources

            switch (var8_8 & 31) {
                case 21: {
                    var9_9 = 118;
                    continue block33;
                }
                case 15: {
                    var9_9 = 78;
                    continue block33;
                }
                case 26: {
                    var9_9 = 123;
                    continue block33;
                }
                case 18: {
                    var9_9 = 206;
                    continue block33;
                }
                case 9: {
                    var9_9 = 172;
                    continue block33;
                }
                case 25: {
                    var9_9 = 210;
                    continue block33;
                }
                case 22: {
                    var9_9 = 251;
                    continue block33;
                }
                case 20: {
                    var9_9 = 159;
                    continue block33;
                }
                case 1: {
                    var9_9 = 178;
                    continue block33;
                }
                case 5: {
                    var9_9 = 68;
                    continue block33;
                }
                case 14: {
                    var9_9 = 55;
                    continue block33;
                }
                case 27: {
                    var9_9 = 25;
                    continue block33;
                }
                case 29: {
                    var9_9 = 73;
                    continue block33;
                }
                case 8: {
                    var9_9 = 41;
                    continue block33;
                }
                case 16: {
                    var9_9 = 100;
                    continue block33;
                }
                case 12: {
                    var9_9 = 144;
                    continue block33;
                }
                case 30: {
                    var9_9 = 164;
                    continue block33;
                }
                case 19: {
                    var9_9 = 75;
                    continue block33;
                }
                case 31: {
                    var9_9 = 163;
                    continue block33;
                }
                case 28: {
                    var9_9 = 131;
                    continue block33;
                }
                case 4: {
                    var9_9 = 196;
                    continue block33;
                }
                case 13: {
                    var9_9 = 95;
                    continue block33;
                }
                case 11: {
                    var9_9 = 65;
                    continue block33;
                }
                case 10: {
                    var9_9 = 123;
                    continue block33;
                }
                default: {
                    var9_9 = 22;
                    continue block33;
                }
                case 17: {
                    var9_9 = 161;
                    continue block33;
                }
                case 7: {
                    var9_9 = 122;
                    continue block33;
                }
                case 6: {
                    var9_9 = 170;
                    continue block33;
                }
                case 2: {
                    var9_9 = 161;
                    continue block33;
                }
                case 3: {
                    var9_9 = 221;
                    continue block33;
                }
                case 23: {
                    var9_9 = 196;
                    continue block33;
                }
                case 24: 
            }
            var9_9 = 159;
        }
    }
}

