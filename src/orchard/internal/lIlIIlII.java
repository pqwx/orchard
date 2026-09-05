/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Switch Delay
 *   - Throw Bind
 *   - ClickPearl
 *   - PearlCatch
 *   - .getBytes(
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.Hand
 */
package orchard.internal;

import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IlIlIll;
import orchard.internal.IlIlllI;
import orchard.internal.lIIIIII;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;
import orchard.module.combat.SpearLunge;

@Environment(value=EnvType.CLIENT)
public final class lIlIIlII
extends ModuleBase {
    private int I = -1;
    private static int l;
    private int II = -1;
    private int Il = -1;
    private long lI;
    private static final IIIlIIIII ll;
    private int III;
    private IlIlIll IIl;
    private boolean IlI;
    private final llIll Ill;
    private lIIIIII lII = lIIIIII.I;
    private final boolean lIl;
    private boolean llI;
    private static final long lll = 3000L;
    private static final int IIII = 9;
    private int IIIl = Integer.MIN_VALUE;
    private boolean IIlI;
    private final llIll IIll;
    private final IIIlIlIIl IlII;
    private boolean IlIl;
    private static final int[] IllI;
    private static final String[] Illl;
    private static final Object[] lIII;

    /*
     * Enabled aggressive block sorting
     */
    private void lI() {
        this.lII = lIIIIII.I;
        this.lI = 0L;
        this.II = -1;
        this.Il = -1;
        this.I = -1;
        this.IlI = false;
        this.IIl = null;
        this.IIIl = Integer.MIN_VALUE;
        this.III = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(MinecraftClient minecraftClient) {
        this.IIIl = Integer.MIN_VALUE;
        if (this.lII != lIIIIII.l) {
            return;
        }
        if (this.IlI) {
            long l2 = System.currentTimeMillis();
            this.III = minecraftClient.player.age + 1;
            this.llIl(lIIIIII.II, l2);
            return;
        }
        this.IIlIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        this.IIlI = false;
        this.llI = false;
        this.IlIl = false;
        this.lI();
    }

    @Override
    public boolean IlIIIIl() {
        return this.lIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(MinecraftClient minecraftClient, int n, long l2) {
        if (this.IIl == null || this.IIl.l() != n) {
            this.IIIlI(minecraftClient, n);
        }
        if (this.IIl == null) return false;
        if (!this.IIl.Il()) return false;
        if (!lIIllllI.IIIllll(minecraftClient, this.IIl)) return false;
        if (lIIllllI.lllI(minecraftClient.player.getInventory()) == n) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public lIlIIlII(boolean bl) {
        super(!bl ? "ClickPearl" : "PearlCatch", Category.II, bl ? "Throws an ender pearl and then a wind charge from your hotbar." : "Switches to a pearl, throws it, and restores the previous slot.");
        llIll llIll2;
        this.III = Integer.MIN_VALUE;
        this.lIl = bl;
        llIll2((Object)StringFactory.IIII("uYFAk1l2WRE="), false);
        this.Ill = this.IIlllIl(llIll2);
        this.IlII = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Switch Delay"), 55.0, 60.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.IIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("q4NdiBpfED6WC5Q="), true));
    }

    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.lllIll(jsonObject, ll.IIII());
    }

    /*
     * Unable to fully structure code
     */
    private boolean lII(MinecraftClient var1_1, boolean var2_2) {
        block6: {
            block9: {
                block8: {
                    block7: {
                        if (var1_1 == null) break block7;
                        if (var1_1.player == null) break block7;
                        break block8;
lbl4:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl6:
                        // 2 sources

                        while (true) {
                            v0 = false;
                            ** GOTO lbl4
                            break;
                        }
lbl9:
                        // 2 sources

                        return v1;
lbl11:
                        // 2 sources

                        while (true) {
                            v1 = true;
                            ** GOTO lbl9
                            break;
                        }
                    }
                    return true;
                }
                var3_3 = var1_1.player.getItemCooldownManager().isCoolingDown(new ItemStack((ItemConvertible)Items.ENDER_PEARL));
                if (!var2_2) ** GOTO lbl6
                break block9;
lbl20:
                // 1 sources

                while (true) {
                    v0 = true;
                    ** continue;
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    if (!var4_4) break block6;
                    ** GOTO lbl11
                    break;
                }
            }
            if (var1_1.player.getItemCooldownManager().isCoolingDown(new ItemStack((ItemConvertible)Items.WIND_CHARGE))) ** break;
            ** while (true)
            ** while (true)
        }
        v1 = false;
        ** while (true)
        var4_4 = v0;
        if (!var3_3) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl() {
        this.IIIl = Integer.MIN_VALUE;
        if (this.lII != lIIIIII.l) {
            if (this.lII != lIIIIII.ll) return;
            this.lII = lIIIIII.II;
            return;
        }
        this.lII = lIIIIII.Il;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lll(MinecraftClient minecraftClient, long l2) {
        float f;
        block9: {
            float f2;
            if (l2 - this.lI > 3000L) {
                this.IIlIl(minecraftClient);
                return;
            }
            switch (this.lII.ordinal()) {
                case 1: {
                    if (this.IlI(minecraftClient, this.II, l2)) break;
                    return;
                }
                case 3: {
                    if (minecraftClient.player.age < this.III) {
                        return;
                    }
                    if (!this.IlI(minecraftClient, this.Il, l2)) {
                        return;
                    }
                    break block9;
                }
                default: {
                    return;
                }
            }
            float f3 = minecraftClient.player.getYaw();
            float f4 = f2 = (Boolean)this.Ill.lIl() != false ? -90.0f : minecraftClient.player.getPitch();
            if (this.lIll(minecraftClient, this.II, Items.ENDER_PEARL, f3, f2, () -> this.IIl(minecraftClient))) {
                this.llIl(lIIIIII.l, l2);
                return;
            }
            return;
        }
        float f5 = minecraftClient.player.getYaw();
        float f6 = f = (Boolean)this.Ill.lIl() != false ? -90.0f : minecraftClient.player.getPitch();
        if (this.lIll(minecraftClient, this.Il, Items.WIND_CHARGE, f5, f, () -> this.lIlI(minecraftClient))) {
            this.llIl(lIIIIII.ll, l2);
            return;
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int IIII(PlayerInventory playerInventory, Item item) {
        int n;
        block4: {
            block3: {
                if (playerInventory == null) {
                    return -1;
                }
                n = 0;
                if (!true) break block3;
                if (n >= 9) return -1;
                if (playerInventory.getStack(n).isOf(item)) break block4;
            }
            do {
                ++n;
                if (n >= 9) return -1;
            } while (!playerInventory.getStack(n).isOf(item));
        }
        return n;
    }

    private int IIlI(IIIlIlIIl iIIlIlIIl) {
        return Math.max(0, (int)Math.ceil((double)this.lllI(iIIlIlIIl) / 50.0));
    }

    private static void IlII(int n) {
        l = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(MinecraftClient minecraftClient, long l2, boolean bl) {
        PlayerInventory playerInventory = minecraftClient.player.getInventory();
        int n = this.IIII(playerInventory, Items.ENDER_PEARL);
        int n2 = !bl ? -1 : this.IIII(playerInventory, Items.WIND_CHARGE);
        if (n < 0) return false;
        if (bl) {
            if (n2 < 0) return false;
        }
        if (this.lII(minecraftClient, bl)) {
            return false;
        }
        this.II = n;
        this.Il = n2;
        this.I = lIIllllI.lllI(playerInventory);
        this.IlI = bl;
        this.IlIl = false;
        this.IIIlI(minecraftClient, n);
        this.llIl(lIIIIII.Il, l2);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illl(MinecraftClient minecraftClient) {
        int n = this.I;
        if (((Boolean)this.IIll.lIl()).booleanValue() && n >= 0 && n < 9 && minecraftClient != null && minecraftClient.player != null) {
            lIIllllI.IlIlllI(minecraftClient, this, n);
        } else {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
        }
        this.IIl = null;
        this.IlIl = true;
    }

    public lIlIIlII() {
        this(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIII(MinecraftClient minecraftClient) {
        this.IIIl = Integer.MIN_VALUE;
        if (this.lII == lIIIIII.l || this.lII == lIIIIII.ll) {
            this.IIlIl(minecraftClient);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlI(MinecraftClient minecraftClient) {
        this.IIIl = Integer.MIN_VALUE;
        if (this.lII == lIIIIII.ll) {
            this.IIlIl(minecraftClient);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIll(MinecraftClient minecraftClient, int n, Item item, float f, float f2, Runnable runnable) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) return false;
        if (!minecraftClient.player.getInventory().getStack(n).isOf(item)) return false;
        if (this.IIl == null) return false;
        if (!lIIllllI.IIIllll(minecraftClient, this.IIl)) return false;
        if (runnable == null) {
            return false;
        }
        int n2 = minecraftClient.player.age;
        if (l == n2) {
            return false;
        }
        boolean bl = IlIlllI.IIl(minecraftClient, 250, f, f2, () -> {
            if (minecraftClient.player.getInventory().getStack(n).isOf(item) && lIIllllI.lllI(minecraftClient.player.getInventory()) == n) {
                boolean bl = lIIllllI.llIIll(minecraftClient, Hand.MAIN_HAND);
                if (bl) {
                    lIlIIlII.IlII(minecraftClient.player.age);
                    minecraftClient.player.swingHand(Hand.MAIN_HAND);
                    runnable.run();
                    return bl;
                }
                this.lIl();
                return bl;
            }
            this.lIII(minecraftClient);
            return false;
        });
        if (!bl) return bl;
        this.IIIl = n2 + 2;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        if (!this.IIIII(minecraftClient)) {
            this.IIlIl(minecraftClient);
            this.IIlI = false;
            this.llI = false;
            return;
        }
        long l2 = System.currentTimeMillis();
        if (orchard.internal.IIlI.IIl(minecraftClient)) {
            if (this.lII == lIIIIII.I) return;
            if (l2 - this.lI <= 3000L) return;
            this.IIlIl(minecraftClient);
            return;
        }
        if (this.lII != lIIIIII.I) {
            this.IIllI(minecraftClient);
            this.lll(minecraftClient, l2);
            return;
        }
        if (this.IIIIl()) {
            this.IIlIl(minecraftClient);
            return;
        }
        if (this.lIl) {
            boolean bl = this.IIIIIII() && lIIllllI.llI(minecraftClient, this.IIIllII());
            boolean bl2 = bl && !this.llI;
            this.llI = bl;
            if (!bl) {
                this.IIlI = false;
            }
            if (!bl2) {
                return;
            }
        }
        if (this.IIlI) return;
        this.IIlI = true;
        if (!this.IllI(minecraftClient, l2, this.lIl)) {
            this.IIlIl(minecraftClient);
            return;
        }
        this.lll(minecraftClient, l2);
    }

    public llIll llII() {
        return this.Ill;
    }

    private void llIl(lIIIIII lIIIIII2, long l2) {
        this.lII = lIIIIII2;
        this.lI = l2;
    }

    private long lllI(IIIlIlIIl iIIlIlIIl) {
        double d = iIIlIlIIl.IIIl();
        double d2 = iIIlIlIIl.IIII();
        if (!(d >= d2)) {
            return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
        }
        return Math.max(0L, Math.round(d));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIII(MinecraftClient minecraftClient) {
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
     * Enabled aggressive block sorting
     */
    private boolean IIIIl() {
        SpearLunge spearLunge;
        ModuleBase moduleBase;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        Iterator<ModuleBase> iterator = clientEntrypoint.IlI().IIIIIll().iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!((moduleBase = iterator.next()) instanceof SpearLunge) || !(spearLunge = (SpearLunge)moduleBase).IIII());
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlI(MinecraftClient minecraftClient, int n) {
        boolean bl = lIIllllI.llIllI(minecraftClient) != n;
        int n2 = bl ? this.IIlI(this.IlII) : 0;
        this.IIl = lIIllllI.IIIIlII(minecraftClient, this, n, n2, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IlIl) {
            this.Illl(minecraftClient);
        }
        this.lI();
        this.IIlI = false;
        this.llI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIl(MinecraftClient minecraftClient) {
        if (!this.IlIl) {
            this.Illl(minecraftClient);
        }
        this.lI();
        if (this.lIl) return;
        if (!this.IIIlIIl()) return;
        this.IIlIIll(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (this.IIIl != Integer.MIN_VALUE) {
            if (minecraftClient.player.age <= this.IIIl) return;
            this.lIl();
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIlll() {
        if (this.lII == lIIIIII.I) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block20: {
                block19: {
                    block16: {
                        block21: {
                            block17: {
                                block18: {
                                    block14: {
                                        block15: {
                                            break block18;
lbl1:
                                            // 1 sources

                                            while (var13_7 == 0) {
                                                break block14;
                                            }
                                            break block19;
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var11_5 += var12_6;
                                                break block15;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (true) {
                                                var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                                                ** continue;
                                                break;
                                            }
                                        }
                                        while (++var10_4 >= var8_2.length) {
                                            break block16;
                                        }
                                        break block19;
lbl14:
                                        // 1 sources

                                        while (true) {
                                            lIlIIlII.l = -2147483648;
                                            return;
                                        }
lbl17:
                                        // 2 sources

                                        while (true) {
                                            continue;
lbl19:
                                            // 1 sources

                                            while (true) {
                                                lIlIIlII.ll = StringFactory.IIII("Throw Bind");
                                                ** continue;
                                                break;
                                            }
                                            break;
                                        }
lbl22:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        while (true) {
                                            var13_7 = -1;
                                            break block17;
                                            break;
                                        }
                                    }
                                    lIlIIlII.Illl = var9_3;
                                    ** while (true)
                                }
                                var6 = 9149;
                                break block20;
                            }
lbl34:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                            lIlIIlII.lIII = new Object[var9_3.length];
                            break block21;
lbl38:
                            // 1 sources

                            while (true) {
                                var9_3 = new String[var8_2.length];
                                ** continue;
                                break;
                            }
lbl41:
                            // 1 sources

                            while (true) {
                                var12_6 = 0;
                                ** GOTO lbl1
                                break;
                            }
                        }
                        var2_10 = -860431151;
                        break block22;
lbl47:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl49:
                        // 1 sources

                        while (true) {
                            lIlIIlII.IllI = new int[var1_9];
                            ** continue;
                            break;
                        }
                        var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
                        lIlIIlII.IllI[var4_12] = var5_13 ^= var2_10;
                        var3_11 += 4;
                        if (++var4_12 < var1_9) ** GOTO lbl17
                        ** while (true)
                        var3_11 = 0;
                        var4_12 = 0;
                        ** while (true)
                    }
                    var13_7 = 0;
                    ** while (true)
                }
                var12_6 = var8_2[var10_4] ^ var6;
                ** while (true)
            }
            var7_1 = "\u0812\u082b\u0817\u0827\u080b\u0815\u0827\u06dd\u0826\u0832\u080a\u0826\u0822\u0822\u06ee\u06ee\u6659\u6599\u6642\u665e\u6644\u6652\u6660\u6644\u667c\u6678\u6598\u666c\u6668\u6675\u6591\u6591\u126d\u1265\u126b\u1246\u127a\u1256\u11a4\u1254\u1254\u125d\u11ad\u1255\u1242\u1265\u1263\u124b\u1252\u11a8\u127d\u125c\u11a2\u118e\u1278\u124d\u1241\u1248\u1197\u1241\u1251\u11a0\u1254\u1242\u127a\u11a3\u1278\u126f\u1244\u1240\u126d\u1267\u1279\u1263\u10ce\u1248\u1266\u11a0\u11ad\u1242\u125b\u124d\u1267\u1237\u1251\u1265\u1248\u1270\u127c\u1251\u126b\u1243\u11a0\u1272\u1268\u124d\u118f\u1267\u124d\u1259\u127a\u1256\u126b\u1251\u1254\u125d\u1242\u1248\u125b\u1265\u11a0\u1248\u125b\u1255\u11a3\u11ac\u632a\u65e9\u6307\u6a39\u6332\u631b\u6335\u6a4f\u631f\u630a\u65f4\u630d\u631d\u6313\u631a\u6603\u6319\u6335\u6315\u6314\u6326\u65fe\u6326\u631c\u630c\u6307\u631b\u6603\u630a\u65ea\u6a3c\u6314\u6326\u631b\u65f0\u6306\u631c\u630a\u6a3b\u631d\u6330\u6329\u65ff\u6603\u6326\u6331\u6319\u6a38\u6318\u65ea\u6313\u6319\u6318\u6313\u6a3c\u6a3a\u6326\u6330\u6335\u6315\u632d\u65e2\u6a3a\u6a3b\u65eb\u6312\u630b\u631c\u6326\u630a\u65e2\u6a4e\u630d\u632c\u6326\u632e\u6308\u6312\u632d\u631f\u631a\u6306\u6a4e\u630a\ud45e\ud462\ud38f\ud47a\ud450\ud38a\ud451\ud38b\ud46c\ud46b\ud38e\ud476\u601f\u5ec8\u6032\u6018\u6007\u5f4e\u600c\u601a\u5f3b\u5f38\u6007\u6029\u5f4e\u6026\u5ecb\u5f4f\u4090\u4097\u4099\u4143\u1754\u1693\u1775\u1743\u174c\u1761\u1747\u174d\u1760\u1763\u169d\u1772\u1756\u1690\u1774\u1698\ubd14\ubd2c\ubd2e\ubd23\ubd1f\ubd13\ubfd2\ubc4e\ubff7\ubd1e\ubd33\ubc3c\ubd22\ubd21\ubfe5\ubfe5";
            var8_2 = "\u23ad\u23ad\u23e9\u23e9\u23b1\u23ad\u23b9\u23ad\u23ad".toCharArray();
            ** while (true)
            var10_4 = 0;
            var11_5 = 0;
            ** while (true)
        }
        var0_8 = "\u009f\u00a8\u00cd\u00aa]\u00b0\u00e4\u001f=l\u009f\u00a4\u00b6\u00e9\u00c6{\u00fc\u00adU\u00cf\u00ab\u0000\u00e3\u009a\u00ab\u00b8\u001e\u00abbV\u008f\u00cd\u00db\u00c1\u00ae\u00c7,fcX\u00e2\u00182\u00bc\u00a6\u00c0g\u0086 \u00a1\u00c4\u0080:Rz\u00d8".getBytes("ISO-8859-1");
        var1_9 = var0_8.length / 4;
        ** while (true)
    }

    private static int IlIII(int n, int n2) {
        return IllI[n ^ 0x9BDEDCC5] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlIIl(int n, int n2, int n3) {
        StackTraceElement[] stackTraceElementArray;
        int n4 = n3 ^ 0xDAFF;
        char[] cArray = Illl[n4].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIII[n4];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIlIIlII.lIII[n4] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n5 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1056;
        int n6 = 0;
        do {
            int n7 = n6++;
            int n8 = cArray[n7] + 49726;
            n8 -= 30916;
            n8 ^= 0xE176;
            n8 -= 2126;
            n8 ^= 0x8D8C;
            n8 += 27145;
            cArray[n7] = (char)((n8 ^= 0x1542) ^ n5 ^ n ^ n2 >> 16);
        } while (n6 < cArray.length);
        return new String(cArray).intern();
    }
}

