/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlllII
 * Module         : Stray utils  [PLAYER]
 * Description    : Utilities for stray FFA gamemodes.   (client's own text)
 *
 * Recovered strings in this class:
 *   - You are no longer in combat.
 *   - Auto Runner
 *   - Auto TpBack
 *   - .getBytes(
 *   - spawn
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
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.player;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IlIlIll;
import orchard.internal.IlIlllI;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class StrayUtils
extends ModuleBase {
    private boolean I;
    private String l;
    private boolean II;
    private static final String Il;
    private final llIll lI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Auto Runner"), true));
    private boolean ll;
    private static String[] III;
    private int IIl;
    private final llIll IlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Auto TpBack"), false));
    private IlIlIll Ill;
    private static final double lII = 2304.0;
    private static final int lIl = 9;
    private boolean llI;
    private Vec3d lll;
    private static final String IIII;
    private static final int[] IIIl;
    private static final String[] IIlI;
    private static final Object[] IIll;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        if (!this.IIIlIIl()) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player != null) {
            this.lI(minecraftClient, minecraftClient.player);
            if ((Boolean)this.IlI.lIl() == false) return;
            if (!this.ll) return;
            if (!minecraftClient.player.isAlive()) {
                return;
            }
            if (this.II && minecraftClient.player.age > this.IIl) {
                this.II = false;
                this.IIl = Integer.MIN_VALUE;
            }
            this.I(minecraftClient, minecraftClient.player);
            return;
        }
    }

    public StrayUtils() {
        super(StringFactory.IIII("Stray utils"), Category.IIl, StringFactory.IIII("Utilities for stray FFA gamemodes."));
        this.IIl = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void I(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        if (minecraftClient == null) return;
        if (clientPlayerEntity != null) {
            PlayerInventory playerInventory = clientPlayerEntity.getInventory();
            int n = this.l(playerInventory);
            if (n < 0) return;
            if (this.II) return;
            this.IIl(minecraftClient, n);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int l(PlayerInventory playerInventory) {
        if (playerInventory == null) {
            return -1;
        }
        int n = 0;
        while (n < 9) {
            ItemStack itemStack = playerInventory.getStack(n);
            if (itemStack.isOf(Items.DIAMOND)) return n;
            ++n;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lI(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        boolean bl;
        String string;
        boolean bl2 = clientPlayerEntity.isAlive();
        Vec3d vec3d = new Vec3d(clientPlayerEntity.getX(), clientPlayerEntity.getY(), clientPlayerEntity.getZ());
        String string2 = string = minecraftClient.world != null ? minecraftClient.world.getRegistryKey().getValue().toString() : "";
        if (!this.I) {
            this.I = true;
            this.llI = bl2;
            this.lll = vec3d;
            this.l = string;
            return;
        }
        boolean bl3 = this.llI && !bl2;
        boolean bl4 = this.l != null && !this.l.equals(string);
        boolean bl5 = bl = bl2 && this.lll != null && vec3d.squaredDistanceTo(this.lll) >= 2304.0;
        if (((Boolean)this.IlI.lIl()).booleanValue() && (bl3 || bl4 || bl)) {
            this.llI();
        }
        this.llI = bl2;
        this.lll = vec3d;
        this.l = string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(MinecraftClient minecraftClient, int n) {
        if (this.Ill == null || !this.Ill.Il() || !lIIllllI.IlIllI(minecraftClient, this.Ill) || this.Ill.l() != n) {
            this.Ill = lIIllllI.IIIIlII(minecraftClient, this, n, 0, true);
        }
        if (!lIIllllI.IIIllll(minecraftClient, this.Ill)) {
            return;
        }
        this.Ill = null;
        float f = minecraftClient.player.getYaw();
        float f2 = minecraftClient.player.getPitch();
        this.II = IlIlllI.IlII(minecraftClient, 150, f, f2, () -> {
            this.II = false;
            this.IIl = Integer.MIN_VALUE;
            if (!this.IIIlIIl()) return false;
            if ((Boolean)this.IlI.lIl() == false) return false;
            if (!this.ll) return false;
            if (minecraftClient.player == null) return false;
            if (minecraftClient.interactionManager == null) return false;
            if (!minecraftClient.player.getInventory().getStack(n).isOf(Items.DIAMOND)) return false;
            if (lIIllllI.llIllI(minecraftClient) == n) {
                lIIllllI.IIIlIlI(minecraftClient);
                ActionResult actionResult = minecraftClient.interactionManager.interactItem((PlayerEntity)minecraftClient.player, Hand.MAIN_HAND);
                if (actionResult == null) return false;
                if (!actionResult.isAccepted()) {
                    return false;
                }
            } else {
                return false;
            }
            this.ll = false;
            lIIllllI.IlIlllI(minecraftClient, this, n);
            return true;
        });
        this.IIl = this.II ? minecraftClient.player.age + 1 : Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IlI(String string) {
        if (!this.IIIlIIl()) return;
        if (string == null) return;
        if (!Il.equals(string.trim())) {
            return;
        }
        if (((Boolean)this.lI.lIl()).booleanValue()) {
            this.lll(IIII);
        }
        if ((Boolean)this.IlI.lIl() == false) return;
        this.llI();
    }

    private static String lII(char[] cArray, long l2, int n) {
        int n2 = 0x832454C2 ^ n;
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

    private static void lIl() {
        StrayUtils.III[0] = StrayUtils.lII(StrayUtils.IllI((short)14700, -1335602351, '\uf2a4').toCharArray(), 10504L, 1009980490);
        StrayUtils.III[1] = StrayUtils.lII(StrayUtils.IllI((short)5790, 1338056951, '\uf2a5').toCharArray(), 65446L, 1893012030);
        StrayUtils.III[2] = StrayUtils.lII(StrayUtils.IllI((short)30021, 1766726518, '\uf2a6').toCharArray(), 16317L, 859575432);
        StrayUtils.III[3] = StrayUtils.lII(StrayUtils.IllI((short)11326, -211985076, '\uf2a7').toCharArray(), 46154L, -1574227697);
        StrayUtils.III[4] = StrayUtils.lII(StrayUtils.IllI((short)14744, -1420819244, '\uf2a0').toCharArray(), 78296L, -2099484094);
        StrayUtils.III[5] = StrayUtils.lII(StrayUtils.IllI((short)3120, 1958301497, '\uf2a1').toCharArray(), 45788L, 1032603986);
        StrayUtils.III[6] = StrayUtils.lII("".toCharArray(), 20768L, -2011780473);
    }

    private void llI() {
        this.ll = true;
        this.II = false;
        this.IIl = Integer.MIN_VALUE;
    }

    @Override
    public void ll() {
        this.IIII();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block17: {
                    block18: {
                        block20: {
                            block16: {
                                block19: {
                                    block15: {
                                        block14: {
                                            break block19;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var3_4 += 4;
                                                if (++var4_5 < var1_2) break block14;
                                                break block15;
                                                break;
                                            }
lbl5:
                                            // 1 sources

                                            while (true) {
                                                var13_13 = -1;
                                                break block16;
                                                break;
                                            }
                                        }
lbl9:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl11:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    StrayUtils.III = new String[7];
                                    StrayUtils.lIl();
                                    StrayUtils.Il = "You are no longer in combat.";
                                    StrayUtils.IIII = "spawn";
                                    return;
lbl19:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl21:
                                    // 1 sources

                                    while (true) {
                                        var9_9 = new String[var8_8.length];
                                        ** continue;
                                        break;
                                    }
lbl24:
                                    // 1 sources

                                    while (true) {
                                        var8_8 = "\u28a0\u2880\u28b8\u28b8\u28b8\u2898".toCharArray();
                                        ** continue;
                                        break;
                                    }
                                }
                                var6 = 10408;
                                var7_7 = "\u4377\u6efd\u9340\u6f39\ub146\uc001\u2bc9\u4082\u4efe\u4930\u42f1\uf1aa\ud8ac\u14c2\u5c8d\u03d6\u97ec\uf5fe\ua3b8\u7072\u8dbc\u3ea3\u4784\ud80e\u251e\u6dbc\u48a2\u34c6\u2dd7\u4e0e\ud44b\u68f1\u5586\u0ae4\uc017\u5fe2\ueab1\u74c0\u9f05\ua32a\u2f3a\u309b\ub378\ubd84\u67c1\u6a79\u9110\u8b21\u9406\u6883\u0a77\u08c1\udb40\u677f\ua555\u92de\ub57a\u497e\u272a\u31bf\uc540\u219b\uca00\u2e45\u4251\u7e62\ue81f\u3827\ua845\u130f\uc3f0\u2728\u11e5\u3f07\udb6c\ue569\u8229\ud85f\u39a2\u326d\uf7f3\u3158\u28a4\u0d6e\ua85f\u7d50\u39aa\u997b\ud7fa\uc2bb\u7439\u6509\ubc8c\u9f08\u78ae\u6072\u4051\uc751\uaa51\u98d2\u4869\u0860\ue049\u9002\u1ad1\uf6dc\ub282\u308b\u7bae\u68b6\uadc3\uf48d\ued2a\u725e\u7993\ubc6c\udc50\u6283\u2f5e\u75fc\ue3e1\u2970\u285c\uc0e5\uac11\uc9f6\u682d\u70b1\u43ba\ue70d\ue836\u130d\u64b1\u4219\uc903\u7a11\uffeb\u466c\u01be\u1052\ube20\u4ebb\ueb22\u97f3";
                                ** while (true)
lbl31:
                                // 1 sources

                                while (true) {
                                    if (var13_13 == 0) {
                                        ** continue;
                                    }
                                    break block17;
                                    break;
                                }
                                StrayUtils.IIlI = var9_9;
                                break block20;
lbl37:
                                // 1 sources

                                while (true) {
                                    if (++var10_10 >= var8_8.length) break block18;
                                    break block17;
lbl40:
                                    // 1 sources

                                    while (true) {
                                        var12_12 = 0;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
                                var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                                StrayUtils.IIIl[var4_5] = var5_6 ^= var2_3;
                                ** while (true)
lbl46:
                                // 1 sources

                                while (true) {
                                    var4_5 = 0;
                                    ** continue;
                                    break;
                                }
                            }
lbl50:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        StrayUtils.IIll = new Object[var9_9.length];
                        break block21;
                        var10_10 = 0;
                        var11_11 = 0;
                        ** while (true)
                    }
                    var13_13 = 0;
                    ** while (true)
                }
                var12_12 = var8_8[var10_10] ^ var6;
                break block22;
lbl64:
                // 1 sources

                while (true) {
                    var3_4 = 0;
                    ** continue;
                    break;
                }
                var1_2 = var0_1.length / 4;
                StrayUtils.IIIl = new int[var1_2];
                ** while (true)
            }
            var2_3 = -2030812715;
            var0_1 = "\u00fa\u00acc\u00a3\u00ec\u00f0\u000fy\u00c9C\u00ab\"\u00a9-MQ\u0012~_\u00ed\u008d\u0080Z\u0084\u0086\u00fd\u00e3N~\u00a0V\u00f0\u008b\u00067\u001a\u007f=\u0080\u0087\u0098\u00d6\u00e3\u00dd\u0095\n\u00a0w\u00e9\u000b\"\u0003\u00b4\u007fa\u00f38i:\u00bc\u00de\u0089\u0005\u0092k\u0007\u0089\u001d\u00b84\u00e8\u00b3O\u001c\u00c5z\u009al\u00d8\u00cd".getBytes("ISO-8859-1");
            ** while (true)
        }
        var9_9[var10_10] = var7_7.substring(var11_11, var11_11 + var12_12);
        var11_11 += var12_12;
        ** while (true)
    }

    private void lll(String string) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player != null && minecraftClient.getNetworkHandler() != null) {
            minecraftClient.getNetworkHandler().sendChatCommand(string);
            return;
        }
    }

    private void IIII() {
        this.ll = false;
        this.I = false;
        this.llI = false;
        this.lll = null;
        this.l = null;
        this.II = false;
        this.IIl = Integer.MIN_VALUE;
        this.Ill = null;
    }

    @Override
    public void llll() {
        lIIllllI.llIII(MinecraftClient.getInstance(), this, lIIlIllI.II);
        this.IIII();
    }

    private static int IlII(int n, int n2) {
        return IIIl[n ^ 0x433AA764] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllI(short s, int n, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xF2A4;
        char[] cArray = IIlI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            StrayUtils.IIll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2D8D;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 10547;
            n6 -= 63277;
            n6 ^= 0xDD91;
            n6 += 41284;
            n6 += 17185;
            n6 += 1748;
            n6 -= 15408;
            n6 += 49490;
            n6 += 24969;
            cArray[n5] = (char)((n6 -= 34662) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

