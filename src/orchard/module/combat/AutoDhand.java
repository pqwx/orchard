/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIIlIl
 * Module         : AutoDhand  [COMBAT]
 * Description    : Moves a totem to the main hand after your offhand totem pops.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Switch Delay
 *   - .getBytes(
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
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 */
package orchard.module.combat;

import com.google.gson.JsonObject;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
public final class AutoDhand
extends ModuleBase {
    private long I;
    private int l;
    private static final long II = 1000L;
    private int Il = -1;
    private static final int lI = 9;
    private final IIIlIlIIl ll = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Switch Delay"), 55.0, 60.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
    private long III;
    private static final int IIl = 3;
    private long IlI;
    private static final int[] Ill;
    private static final String[] lII;
    private static final Object[] lIl;

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int I(ClientPlayerEntity clientPlayerEntity) {
        int n;
        block3: {
            ItemStack itemStack;
            int n2;
            block2: {
                n2 = clientPlayerEntity.playerScreenHandler.slots.size();
                n = 9;
                if (!true) break block2;
                if (n >= Math.min(45, n2)) return -1;
                if (this.lll(itemStack = ((Slot)clientPlayerEntity.playerScreenHandler.slots.get(n)).getStack())) break block3;
            }
            do {
                ++n;
                if (n >= Math.min(45, n2)) return -1;
            } while (!this.lll(itemStack = ((Slot)clientPlayerEntity.playerScreenHandler.slots.get(n)).getStack()));
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity, int n) {
        int n2 = this.I(clientPlayerEntity);
        if (n2 < 0) {
            return true;
        }
        if (!clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) {
            return false;
        }
        if (!IIlI.IlI(minecraftClient)) {
            return false;
        }
        if (!IIlI.lIlI(minecraftClient, 3)) {
            return false;
        }
        IIlI.Illl(minecraftClient);
        minecraftClient.interactionManager.clickSlot(clientPlayerEntity.playerScreenHandler.syncId, n2, n, SlotActionType.SWAP, (PlayerEntity)clientPlayerEntity);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIl() {
        if (!this.IIIlIIl()) return false;
        if (this.I == Long.MIN_VALUE) return false;
        return true;
    }

    private long IlI(IIIlIlIIl iIIlIlIIl) {
        double d = Math.max(0.0, Math.min(iIIlIlIIl.IIIl(), iIIlIlIIl.IIII()));
        double d2 = Math.max(d, Math.max(iIIlIlIIl.IIIl(), iIIlIlIIl.IIII()));
        if (d != d2) {
            return Math.round(ThreadLocalRandom.current().nextDouble(d, d2));
        }
        return Math.round(d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int lII(ClientPlayerEntity clientPlayerEntity, int n) {
        int n2 = 0;
        while (n2 < 9) {
            if (n2 != n && this.lll(clientPlayerEntity.getInventory().getStack(n2))) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    @Override
    public void llll() {
        this.l = Integer.MIN_VALUE;
        this.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int lIl(ClientPlayerEntity clientPlayerEntity, int n) {
        if (this.Il < 0) return this.lII(clientPlayerEntity, n);
        if (this.Il >= 9) return this.lII(clientPlayerEntity, n);
        if (this.Il == n) return this.lII(clientPlayerEntity, n);
        if (!this.lll(clientPlayerEntity.getInventory().getStack(this.Il))) return this.lII(clientPlayerEntity, n);
        return this.Il;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llI(Entity entity, byte by) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIIlIIl()) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.interactionManager == null) return;
        if (minecraftClient.currentScreen != null) return;
        if (by != 35) return;
        if (entity == null) return;
        if (entity.getId() != minecraftClient.player.getId()) {
            return;
        }
        if (this.l == minecraftClient.player.age) {
            return;
        }
        this.l = minecraftClient.player.age;
        if (!this.IllI(minecraftClient.player)) {
            if (this.IIlI(minecraftClient.player)) {
                long l2 = System.currentTimeMillis();
                this.IlI = l2;
                this.I = l2;
                this.III = Long.MIN_VALUE;
                this.Il = -1;
                return;
            }
            this.IIII();
            return;
        }
        this.IIII();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lll(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (!itemStack.isOf(Items.TOTEM_OF_UNDYING)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIII() {
        this.I = Long.MIN_VALUE;
        this.III = Long.MIN_VALUE;
        this.IlI = Long.MIN_VALUE;
        this.Il = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlI(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) {
            return false;
        }
        int n = lIIllllI.lllI(clientPlayerEntity.getInventory());
        if (this.lll(clientPlayerEntity.getInventory().getStack(n))) return true;
        if (this.lII(clientPlayerEntity, n) >= 0) return true;
        if (this.I(clientPlayerEntity) >= 0) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity, long l2) {
        int n;
        int n2 = lIIllllI.lllI(clientPlayerEntity.getInventory());
        if (!this.lll(clientPlayerEntity.getInventory().getStack(n2))) {
            n = this.lIl(clientPlayerEntity, n2);
            if (this.Il >= 0) {
                if (l2 >= this.III) {
                    if (n < 0) return this.lI(minecraftClient, clientPlayerEntity, n2);
                    lIIllllI.IIIIIII(minecraftClient, n, true);
                    return true;
                }
                return false;
            }
        } else {
            return true;
        }
        if (n < 0) return this.lI(minecraftClient, clientPlayerEntity, n2);
        this.Il = n;
        this.III = l2 + this.IlI(this.ll);
        if (l2 >= this.III) {
            lIIllllI.IIIIIII(minecraftClient, n, true);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        if (!this.IIIlIIl()) {
            this.IIII();
            return;
        }
        if (this.I == Long.MIN_VALUE) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        long l2 = System.currentTimeMillis();
        if (l2 - this.IlI <= 1000L) {
            if (l2 < this.I) {
                return;
            }
            if (minecraftClient == null) return;
            if (minecraftClient.player == null) return;
            if (minecraftClient.interactionManager == null) return;
            if (minecraftClient.currentScreen != null) {
                return;
            }
            if (this.IIlI(minecraftClient.player)) {
                if (!this.IlII(minecraftClient, minecraftClient.player, l2)) return;
                this.IIII();
                return;
            }
            this.IIII();
            return;
        }
        this.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) {
            return false;
        }
        int n = lIIllllI.lllI(clientPlayerEntity.getInventory());
        if (n < 0) return false;
        if (n >= 9) return false;
        if (this.lll(clientPlayerEntity.getInventory().getStack(n))) return true;
        return false;
    }

    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.llllll(jsonObject, "Delay", this.ll);
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoDhand() {
        super(StringFactory.IIII("uYFAkz1fURKT"), Category.II, StringFactory.IIII("tZtCmQoXUVyDB4tcApPKkdiAXJlZWlEVmUiXWAHXnp+egFGOWU5fCYVIkF8J29+QnNRAkw1SXVyHB49KQQ=="));
        this.l = Integer.MIN_VALUE;
        this.I = Long.MIN_VALUE;
        this.III = Long.MIN_VALUE;
        this.IlI = Long.MIN_VALUE;
    }

    private static int Illl(int n, int n2) {
        return Ill[n ^ 0x80DB3D6A] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 7580;
        var7_2 = "\ufbed\ufb01\ufb29\ufbc9\ufb82\ufb5a\ufb4f\ufbd2\u6748\u67b4\u678f\u6777\u6721\u67d7\u6799\u672f\u67f3\u677a\u67d5\u6703\uf779\uf787\uf78d\uf745\uf717\uf7cc\uf7f7\uf721\uf7c3\uf74e\uf7d7\uf723\uf788\uf73f\uf7fe\uf701\uf7bd\uf7e8\uf7d6\uf7f4\uf788\uf79a\uf750\uf7df\uf728\uf717\uf7b2\uf721\uf7a6\uf779\uf7e6\uf7a9\uf736\uf7d2\uf7d9\uf74f\uf779\uf78a\uf78a\uf768\uf7e9\uf73c\uf7d3\uf758\uf7e4\uf75c\uf799\uf77b\uf7f1\uf784\uf7a2\uf78d\uf7f6\uf7fd\uf726\uf7c6\uf74f\uf74d\uf7bc\uf778\uf7d2\uf778\uf7de\uf7f4\uf77c\uf7d8\uf7b6\uf700\uf71f\uf7f5\uf7e2\uf737\uf789\uf740\uf7c8\uf764\uf795\uf778\uf7bd\uf736\uf7e6\uf7d4\uf7fc\uf78c\u328c\u3219\u3247\u3292\u32e3\u322f\u3218\u32ef\u3223\u32ac\u3237\u32c4\u3278\u32b1\u324f\u32d3\u2ff7\u2f12\u2f0c\u2fad";
        var8_3 = "\u1d94\u1d90\u1dc8\u1d8c\u1d98".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl9
        while (true) {
            var13_8 = 0;
lbl9:
            // 2 sources

            var10_5 = 0;
            var11_6 = 0;
            var12_7 = 0;
            if (var13_8 != 0) ** GOTO lbl34
            AutoDhand.lII = var9_4;
            AutoDhand.lIl = new Object[var9_4.length];
            var2_13 = -180738690;
            var0_11 = "\u00ea\u0093\u00dd\u00bf\u0019\u00e3\u00d8\u00b4\u007fo\u00c2\u00d2ES\u0096\u0012\u000f\\C\u00b9\u0001]_\u00bb\u009e\u00c4\u00a3c\u0013\u00c3\u00bd\u00d5".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            AutoDhand.Ill = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                AutoDhand.Ill[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            return;
        }
lbl-1000:
        // 5 sources

        {
            block11: {
                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                if (var15_10 < var14_9.length) break block11;
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 >= var8_3.length) ** continue;
lbl34:
                // 2 sources

                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
            }
            switch (var15_10 % 5) {
                case 4: {
                    v0 = 63;
                    continue block8;
                }
                default: {
                    v0 = 32;
                    continue block8;
                }
                case 3: {
                    v0 = 49;
                    continue block8;
                }
                case 1: {
                    v0 = 107;
                    continue block8;
                }
                case 2: 
            }
            v0 = 118;
            ** while (true)
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String lIII(int var0, int var1_1) {
        var3_2 = var0 ^ 1916807539;
        var4_4 = AutoDhand.lII[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])AutoDhand.lIl[var3_2];
        if (var2_3 != null) {
            var5_5 = var2_3;
        } else {
            var5_5 = new Throwable().getStackTrace();
            AutoDhand.lIl[var3_2] = var5_5;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -1974543193;
        var8_8 = 0;
        if (true) ** GOTO lbl16
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) break;
lbl16:
            // 2 sources

            switch (var8_8 & 31) {
                case 12: {
                    var9_9 = 86;
                    continue block33;
                }
                case 19: {
                    var9_9 = 106;
                    continue block33;
                }
                case 2: {
                    var9_9 = 101;
                    continue block33;
                }
                case 7: {
                    var9_9 = 229;
                    continue block33;
                }
                case 3: {
                    var9_9 = 221;
                    continue block33;
                }
                case 25: {
                    var9_9 = 151;
                    continue block33;
                }
                case 9: {
                    var9_9 = 205;
                    continue block33;
                }
                case 13: {
                    var9_9 = 208;
                    continue block33;
                }
                case 14: {
                    var9_9 = 95;
                    continue block33;
                }
                case 22: {
                    var9_9 = 165;
                    continue block33;
                }
                case 1: {
                    var9_9 = 92;
                    continue block33;
                }
                case 4: {
                    var9_9 = 175;
                    continue block33;
                }
                case 20: {
                    var9_9 = 41;
                    continue block33;
                }
                case 31: {
                    var9_9 = 126;
                    continue block33;
                }
                case 16: {
                    var9_9 = 125;
                    continue block33;
                }
                case 18: {
                    var9_9 = 93;
                    continue block33;
                }
                default: {
                    var9_9 = 199;
                    continue block33;
                }
                case 27: {
                    var9_9 = 231;
                    continue block33;
                }
                case 23: {
                    var9_9 = 69;
                    continue block33;
                }
                case 15: {
                    var9_9 = 168;
                    continue block33;
                }
                case 30: {
                    var9_9 = 105;
                    continue block33;
                }
                case 28: {
                    var9_9 = 42;
                    continue block33;
                }
                case 17: {
                    var9_9 = 4;
                    continue block33;
                }
                case 29: {
                    var9_9 = 192;
                    continue block33;
                }
                case 21: {
                    var9_9 = 127;
                    continue block33;
                }
                case 5: {
                    var9_9 = 87;
                    continue block33;
                }
                case 6: {
                    var9_9 = 25;
                    continue block33;
                }
                case 26: {
                    var9_9 = 95;
                    continue block33;
                }
                case 11: {
                    var9_9 = 230;
                    continue block33;
                }
                case 8: {
                    var9_9 = 77;
                    continue block33;
                }
                case 10: {
                    var9_9 = 100;
                    continue block33;
                }
                case 24: 
            }
            var9_9 = 165;
        }
        return new String(var4_4).intern();
    }
}

