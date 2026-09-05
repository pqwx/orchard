/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIlIl
 * Module         : Spear lunge  [COMBAT]
 * Description    : Automatically preforms a spear lunge at a click of a button   (client's own text)
 *
 * Recovered strings in this class:
 *   - Action Delay
 *   - Switch Delay
 *   - Switch Back
 *   - Lunge Bind
 *   - .getBytes(
 *   - AutoLunge
 *   - lunge
 *   - Delay
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
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  net.minecraft.component.type.PiercingWeaponComponent
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.util.Hand
 */
package orchard.module.combat;

import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.PiercingWeaponComponent;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Hand;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlII;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class SpearLunge
extends ModuleBase {
    private int I = -1;
    private boolean l;
    private boolean II;
    private static final int Il = 9;
    private boolean lI;
    private final llIll ll;
    private boolean III;
    private final IIIlIlIIl IIl;
    private static final Item[] IlI;
    private final llIll Ill = this.IIlllIl(new llIll((Object)StringFactory.IIII("AutoLunge"), false));
    private static final IIIlIIIII lII;
    private int lIl;
    private int llI;
    private int lll;
    private static final int IIII = 1;
    private int IIIl;
    private boolean IIlI;
    private boolean IIll;
    private static final int[] IlII;
    private static final String[] IlIl;
    private static final Object[] IllI;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        this.III = true;
        this.l = false;
        this.IIlI = false;
        this.lIl(true);
    }

    private int lI(IIIlIlIIl iIIlIlIIl) {
        return Math.max(1, (int)Math.ceil((double)this.IlI(iIIlIlIIl) / 50.0));
    }

    private void IIl(MinecraftClient minecraftClient) {
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        this.lIl(true);
        this.lIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private long IlI(IIIlIlIIl iIIlIlIIl) {
        double d = iIIlIlIIl.IIIl();
        double d2 = iIIlIlIIl.IIII();
        if (d != d2) return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
        return Math.max(0L, Math.round(d));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.III = true;
        this.l = false;
        this.IIlI = false;
        this.lIl(true);
    }

    /*
     * Unable to fully structure code
     */
    private boolean lII() {
        block8: {
            block7: {
                block5: {
                    block6: {
                        var1_1 = ClientEntrypoint.lII();
                        break block6;
lbl3:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl5:
                        // 1 sources

                        return true;
                        var3_3 = var2_2.next();
                        if (!(var3_3 instanceof lIlIIlII) || !(var4_4 = (lIlIIlII)var3_3).IIIlIIl()) break block5;
                        break block7;
lbl10:
                        // 1 sources

                        while (true) {
                            var2_2 = var1_1.IlI().IIIIIll().iterator();
                            break block5;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (var1_1.IlI() != null) {
                            ** continue;
lbl15:
                            // 1 sources

                            ** GOTO lbl10
                        }
                        break block8;
                    }
                    if (var1_1 == null) break block8;
                    ** GOTO lbl13
                }
lbl21:
                // 2 sources

                while (var2_2.hasNext()) {
                    ** continue;
lbl23:
                    // 1 sources

                    ** GOTO lbl3
                }
                break block8;
            }
            if (!var4_4.IIlll()) ** GOTO lbl21
            ** while (true)
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.lllIll(jsonObject, lII.IIII());
        this.llllll(jsonObject, "Action Delay", this.IIl);
        this.llllll(jsonObject, "Switch Delay", this.IIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(boolean bl) {
        this.IIll = false;
        this.lI = false;
        this.llI = -1;
        this.IIIl = -1;
        this.lll = -1;
        this.I = -1;
        if (!bl) return;
        this.lIl = -1;
        this.II = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (!this.IIll) {
            return;
        }
        if (!this.IlII(minecraftClient)) {
            this.IIl(minecraftClient);
            return;
        }
        if (orchard.internal.IIlI.IIl(minecraftClient)) {
            this.IIl(minecraftClient);
            return;
        }
        if (minecraftClient.player.age < this.IIIl) {
            return;
        }
        this.Illl(minecraftClient);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIII() {
        if (this.lI) return true;
        if (!this.IIll) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient) {
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
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (this.IlII(minecraftClient)) return;
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        this.lIl(true);
        this.lIlI();
    }

    /*
     * Unable to fully structure code
     */
    private int IllI(PlayerInventory var1_1) {
        block13: {
            block21: {
                block14: {
                    block17: {
                        block19: {
                            block20: {
                                block16: {
                                    block12: {
                                        block15: {
                                            block18: {
                                                if (var1_1 != null) break block17;
                                                break block18;
lbl3:
                                                // 1 sources

                                                while (var11_11 <= 0) {
                                                    break block12;
lbl5:
                                                    // 2 sources

                                                    while (var7_7 >= var6_6) {
                                                        return var3_3;
                                                    }
                                                    break block13;
                                                }
                                                break block19;
lbl9:
                                                // 1 sources

                                                while (true) {
                                                    var9_9 = 0;
                                                    ** GOTO lbl31
                                                    break;
                                                }
lbl12:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            return -1;
lbl16:
                                            // 1 sources

                                            while (true) {
                                                if (var12_12 <= var4_4) break block12;
                                                break block14;
                                                break;
                                            }
lbl19:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = -1;
                                                ** continue;
                                                break;
                                            }
lbl22:
                                            // 1 sources

                                            while (!var10_10.isOf(var8_8)) {
                                                break block12;
                                            }
                                            break block20;
lbl25:
                                            // 1 sources

                                            while (true) {
                                                var3_3 = var9_9;
                                                break block12;
                                                while (true) {
                                                    ++var7_7;
                                                    ** GOTO lbl5
                                                    break;
                                                }
lbl31:
                                                // 2 sources

                                                while (true) {
                                                    if (var9_9 >= 9) ** continue;
                                                    break block15;
                                                    break;
                                                }
                                                break;
                                            }
lbl34:
                                            // 1 sources

                                            while (true) {
                                                v0 = 0;
                                                break block16;
                                                break;
                                            }
                                        }
                                        var10_10 = var1_1.getStack(var9_9);
                                        if (var10_10 != null) ** GOTO lbl22
                                    }
                                    ++var9_9;
                                    ** while (true)
                                }
lbl44:
                                // 2 sources

                                while (true) {
                                    var12_12 = var11_11 * 100 + v0;
                                    ** continue;
                                    break;
                                }
                            }
                            var11_11 = this.lIII(var10_10);
                            ** GOTO lbl3
                        }
                        ** while (var9_9 != var2_2)
lbl52:
                        // 1 sources

                        break block21;
                    }
                    var2_2 = lIIllllI.lllI(var1_1);
                    ** while (true)
                }
                var4_4 = var12_12;
                ** while (true)
                var4_4 = -2147483648;
                var5_5 = SpearLunge.IlI;
                var6_6 = var5_5.length;
                var7_7 = 0;
                ** GOTO lbl5
            }
            v0 = 1;
            ** while (true)
        }
        var8_8 = var5_5[var7_7];
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        block13: {
            block17: {
                boolean bl;
                boolean bl2;
                block18: {
                    block16: {
                        block15: {
                            block14: {
                                block12: {
                                    if (!this.IlII(minecraftClient)) {
                                        this.IIl(minecraftClient);
                                        return;
                                    }
                                    if (orchard.internal.IIlI.IIl(minecraftClient) || this.lII()) {
                                        this.IIl(minecraftClient);
                                        return;
                                    }
                                    if (!this.lI) break block12;
                                    if (minecraftClient.player.age - this.lll > 40) {
                                        this.IIl(minecraftClient);
                                        return;
                                    }
                                    break block13;
                                }
                                if (this.IIll) {
                                    if (minecraftClient.player.age < this.IIIl) return;
                                    this.Illl(minecraftClient);
                                    return;
                                }
                                if (!this.IIIIIII()) break block14;
                                bl2 = this.llII(minecraftClient);
                                if (!bl2 || this.IIlI) break block15;
                                break block16;
                            }
                            this.III = true;
                            if (this.l) return;
                            if (this.IIll) return;
                            if (this.lI) {
                                return;
                            }
                            break block17;
                        }
                        bl = false;
                        break block18;
                    }
                    bl = true;
                }
                boolean bl3 = bl;
                this.IIlI = bl2;
                if (!((Boolean)this.Ill.lIl()).booleanValue()) {
                    if (!bl2) {
                        this.III = true;
                    }
                    if (!bl3) return;
                    if (this.IIll) return;
                    if (this.lI) return;
                    if (!this.lIIl(minecraftClient)) return;
                    this.III = false;
                    return;
                }
                if (!bl2) {
                    this.III = true;
                    return;
                }
                if (minecraftClient.player.age < this.lIl) return;
                if (lIIllllI.lIlII(this)) return;
                if (!this.III) return;
                if (this.IIll) return;
                if (this.lI) return;
                if (!this.lIIl(minecraftClient)) return;
                this.III = false;
                return;
            }
            this.l = true;
            if (this.lIIl(minecraftClient)) return;
            this.lIlI();
            return;
        }
        if (minecraftClient.player.age < this.llI) return;
        this.llIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illl(MinecraftClient minecraftClient) {
        boolean bl = (Boolean)this.Ill.lIl();
        lIIlIllI lIIlIllI2 = !bl && !((Boolean)this.ll.lIl()).booleanValue() ? lIIlIllI.Il : lIIlIllI.II;
        lIIllllI.llIII(minecraftClient, this, lIIlIllI2);
        this.lIl(false);
        this.III = true;
        if (this.IIIIIII()) return;
        if (!this.IIIlIIl()) return;
        this.IIlIIll(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int lIII(ItemStack itemStack) {
        if (itemStack == null) return 0;
        if (!itemStack.isEmpty()) {
            RegistryEntry registryEntry;
            String string;
            ItemEnchantmentsComponent itemEnchantmentsComponent = (ItemEnchantmentsComponent)itemStack.getOrDefault(DataComponentTypes.ENCHANTMENTS, (Object)ItemEnchantmentsComponent.DEFAULT);
            Iterator iterator = itemEnchantmentsComponent.getEnchantments().iterator();
            do {
                if (!iterator.hasNext()) return 0;
            } while (!"lunge".equals(string = (registryEntry = (RegistryEntry)iterator.next()).getKey().map(registryKey -> registryKey.getValue().getPath()).orElse("")));
            return itemEnchantmentsComponent.getLevel(registryEntry);
        }
        return 0;
    }

    @Override
    public boolean IlIIIIl() {
        return this.IIIIIII();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block27: {
                block26: {
                    block29: {
                        block25: {
                            block24: {
                                block23: {
                                    block28: {
                                        block31: {
                                            break block30;
lbl1:
                                            // 1 sources

                                            while (var13_8 == 0) {
                                                break block23;
                                            }
                                            break block31;
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var4_15 = 0;
                                                break block24;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (true) {
                                                var13_8 = 0;
                                                break block25;
                                                break;
                                            }
lbl10:
                                            // 1 sources

                                            while (true) {
                                                var9_4[var10_5] = new String(var14_9).intern();
                                                var11_6 += var12_7;
                                                break block26;
                                                break;
                                            }
lbl14:
                                            // 1 sources

                                            while (true) {
                                                var1_12 = var0_11.length / 4;
                                                ** GOTO lbl68
                                                break;
                                            }
lbl17:
                                            // 1 sources

                                            while (true) {
                                                var8_3 = "\u69c8\u69c8\u69d0\u69c8\u69c8\u6988\u69d4\u69d0\u69dc\u69c8".toCharArray();
                                                ** GOTO lbl60
                                                break;
                                            }
lbl20:
                                            // 1 sources

                                            while (true) {
                                                var3_14 += 4;
                                                if (++var4_15 < var1_12) break block24;
                                                ** GOTO lbl52
                                                break;
                                            }
lbl24:
                                            // 1 sources

                                            while (true) {
                                                var12_7 = 0;
                                                ** GOTO lbl1
                                                break;
                                            }
lbl27:
                                            // 1 sources

                                            while (true) {
                                                v0 = 69;
                                                break block27;
                                                break;
                                            }
                                        }
lbl31:
                                        // 2 sources

                                        block16: while (true) {
                                            var12_7 = var8_3[var10_5] ^ var6;
                                            if (true) ** GOTO lbl38
                                            block17: while (true) {
                                                switch (var15_10 % 6) {
                                                    default: {
                                                        ** continue;
                                                    }
lbl38:
                                                    // 1 sources

                                                    var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                                                    var15_10 = 0;
                                                    continue block17;
                                                    case 5: {
                                                        v0 = 21;
                                                        break block16;
                                                    }
lbl44:
                                                    // 1 sources

                                                    while (true) {
                                                        var0_11 = "&\u00e4\u00bd\u00bdtN\u00a4\u00bd \u00d4y\u007f\u001b\u00e6\u00c5\u00d3\u00f1y\u00a0\u00b9Vc\u00ed\u00fd\u008d\u0091\u00ff\u0097\u00bf\u008d\u008f\u00d7".getBytes("ISO-8859-1");
                                                        ** continue;
                                                        break;
                                                    }
lbl47:
                                                    // 1 sources

                                                    while (true) {
                                                        var2_13 = -998858881;
                                                        ** continue;
                                                        break;
                                                    }
lbl50:
                                                    // 1 sources

                                                    while (true) {
                                                        ** GOTO lbl71
                                                        break;
                                                    }
lbl52:
                                                    // 1 sources

                                                    SpearLunge.lII = StringFactory.IIII("Lunge Bind");
                                                    break block28;
lbl54:
                                                    // 1 sources

                                                    while (true) {
                                                        SpearLunge.IlII[var4_15] = var5_16 ^= var2_13;
                                                        ** continue;
                                                        break;
                                                    }
                                                    case 4: {
                                                        v0 = 123;
                                                        break block16;
                                                    }
lbl60:
                                                    // 1 sources

                                                    var9_4 = new String[var8_3.length];
                                                    break block29;
                                                    case 3: {
                                                        v0 = 118;
                                                        break block16;
                                                    }
                                                    case 1: {
                                                        v0 = 50;
                                                        break block16;
                                                    }
lbl68:
                                                    // 1 sources

                                                    SpearLunge.IlII = new int[var1_12];
                                                    var3_14 = 0;
                                                    ** continue;
lbl71:
                                                    // 1 sources

                                                    if (var15_10 >= var14_9.length) ** break;
                                                    continue block17;
                                                    ** continue;
                                                    case 2: {
                                                        v0 = 108;
                                                        break block16;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break block27;
                                    }
                                    SpearLunge.IlI = new Item[]{Items.NETHERITE_SPEAR, Items.DIAMOND_SPEAR, Items.IRON_SPEAR, Items.GOLDEN_SPEAR, Items.COPPER_SPEAR, Items.STONE_SPEAR, Items.WOODEN_SPEAR};
                                    return;
                                }
                                SpearLunge.IlIl = var9_4;
                                SpearLunge.IllI = new Object[var9_4.length];
                                ** while (true)
                            }
                            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                            ** while (true)
                        }
lbl89:
                        // 2 sources

                        while (true) {
                            var10_5 = 0;
                            var11_6 = 0;
                            ** continue;
                            break;
                        }
                    }
                    var13_8 = -1;
                    ** while (true)
                }
                ** while (++var10_5 < var8_3.length)
lbl98:
                // 1 sources

                ** while (true)
            }
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
            ** while (true)
        }
        var6 = 27096;
        var7_2 = "\u25ec\u25f7\u255e\u259e\u2556\u2505\u257f\u2533\u2518\u2572\u2576\u2563\u2580\u25cb\u258a\u251e\ue27b\ue20a\ue2e7\ue228\ue2c0\ue286\ue2c6\ue29c\ue28b\ue2e1\ue2e5\ue2f0\ue213\ue258\ue219\ue28d\ubd8e\ubd9f\ubd07\ubdc5\ubd2c\ubd54\ubd29\ubd2f\u7506\u750f\u7597\u7555\u75bc\u75c4\u75b9\u75da\u75d5\u75b5\u75a3\u7581\u756d\u752b\u7569\u7589\u61fb\u618a\u617b\u619e\u6147\u6115\u6145\u6122\u6116\u6164\u6161\u6179\u6195\u61a7\u61c3\u6171\udd85\udd9d\udd15\uddf7\udd38\udd46\udd1e\udd57\udd66\udd1d\udd21\udd0c\udde8\uddb2\udd98\udd60\udde1\udd4d\udd32\udd35\udda1\uddd7\uddd5\uddbb\uddb2\uddad\udd3c\uddd1\udd83\uddbd\uddd1\udd2a\udde8\uddf8\udd31\udd85\udd35\udd58\udd52\udd06\udd4d\udd4c\udd03\udd30\uddef\uddc0\udd8e\udd0f\uddce\udd4c\udd11\udd7b\udd84\uddb4\udd83\udd86\udda2\udd9b\udd4a\udda0\udddf\udd96\udde1\udd6f\udda2\uddd6\udd33\udda7\udd2a\udd0b\udd1e\udd71\udd4f\udd4a\udd08\udd7e\uddd7\uddfa\uddba\udd4f\u3459\u3441\u34c9\u342b\u34e4\u3498\u34c6\u349f\u34b0\u34eb\u34df\u34d6\u589f\u5897\u580c\u58f6\u5824\u5876\u5814\u5824\ud9af\ud9ae\ud903\ud9b8\u45de\u45af\u4542\u458d\u4565\u4523\u4563\u4539\u452e\u4544\u451f\u4551\u45b7\u4582\u45d8\u4554";
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIl(MinecraftClient minecraftClient) {
        PlayerInventory playerInventory = minecraftClient.player.getInventory();
        int n = this.IllI(playerInventory);
        if (n >= 0) {
            this.I = n;
            if (!orchard.internal.IIlI.IIl(minecraftClient)) {
                this.lI = true;
                this.IIll = false;
                this.lll = minecraftClient.player.age;
                this.llI = minecraftClient.player.age;
                this.llIl(minecraftClient);
                return true;
            }
            this.lIl(false);
            return false;
        }
        return false;
    }

    @Override
    public boolean IlIlIlI(MinecraftClient minecraftClient) {
        return this.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlI() {
        if (!this.IIIIIII() && this.IIIlIIl()) {
            this.IIlIIll(false);
        }
    }

    @Override
    public int IIll() {
        return 2980;
    }

    private boolean llII(MinecraftClient minecraftClient) {
        if (this.IIIIIII()) {
            if (minecraftClient != null) {
                return lIIllllI.llI(minecraftClient, this.IIIllII());
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void llIl(MinecraftClient minecraftClient) {
        boolean bl;
        if (minecraftClient == null || minecraftClient.player == null || this.I < 0 || this.I >= 9 || this.lIII(minecraftClient.player.getInventory().getStack(this.I)) <= 0) {
            this.IIl(minecraftClient);
            return;
        }
        if (lIIllllI.Il(minecraftClient, lIIllllI.llIlII(minecraftClient))) {
            return;
        }
        ItemStack itemStack = minecraftClient.player.getInventory().getStack(this.I);
        if (itemStack == null || minecraftClient.player.isBelowMinimumAttackCharge(itemStack, 5)) {
            return;
        }
        boolean bl2 = lIIllllI.lIIIIl();
        try {
            bl = lIIllllI.IlIIIl(minecraftClient, this, this.I, () -> {
                ItemStack itemStack = minecraftClient.player.getInventory().getStack(this.I);
                PiercingWeaponComponent piercingWeaponComponent = itemStack == null ? null : (PiercingWeaponComponent)itemStack.get(DataComponentTypes.PIERCING_WEAPON);
                if (piercingWeaponComponent == null) return false;
                if (this.lIII(itemStack) > 0) {
                    lIIllllI.IlIIIIl(minecraftClient);
                    minecraftClient.interactionManager.attackWithPiercingWeapon(piercingWeaponComponent);
                    minecraftClient.player.swingHand(Hand.MAIN_HAND);
                    return true;
                }
                return false;
            });
        }
        finally {
            if (bl2) {
                lIIllllI.IlIIlIl();
            }
        }
        if (!bl) {
            this.IIl(minecraftClient);
            return;
        }
        this.lI = false;
        this.IIll = true;
        this.IIIl = minecraftClient.player.age + 1;
        this.Illl(minecraftClient);
        if (((Boolean)this.Ill.lIl()).booleanValue()) {
            this.lIl = minecraftClient.player.age + this.lI(this.IIl);
            this.II = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public SpearLunge() {
        super(StringFactory.IIII("Spear lunge"), Category.II, StringFactory.IIII("Automatically preforms a spear lunge at a click of a button"));
        this.IIl = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Delay"), 45.0, 45.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Switch Back"), true));
        this.ll.lIII(() -> {
            if ((Boolean)this.Ill.lIl() != false) return false;
            return true;
        });
    }

    private static int lllI(int n, int n2) {
        return IlII[n ^ 0x698966E9] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIIII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x370378BA;
        char[] cArray = IlIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IllI[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            SpearLunge.IllI[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xC7ACD136;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 10 -> 172;
                case 14 -> 27;
                case 30 -> 116;
                case 27 -> 83;
                case 4 -> 137;
                case 11 -> 237;
                case 28 -> 11;
                case 5 -> 138;
                case 24 -> 1;
                case 15 -> 225;
                case 6 -> 168;
                case 9 -> 136;
                case 18 -> 134;
                case 13 -> 123;
                case 21 -> 74;
                case 29 -> 75;
                case 2 -> 158;
                case 3 -> 97;
                case 12 -> 79;
                case 31 -> 221;
                case 16 -> 125;
                case 1 -> 87;
                case 25 -> 10;
                case 17 -> 137;
                case 7 -> 147;
                default -> 20;
                case 22 -> 61;
                case 26 -> 197;
                case 23 -> 92;
                case 8 -> 249;
                case 19 -> 233;
                case 20 -> 6;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

