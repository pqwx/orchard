/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIIIll
 * Module         : ElytraSwap  [PLAYER]
 * Description    : Swaps an elytra or chestplate from the hotbar into your chest slot.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Swap Bind
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
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 */
package orchard.module.player;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlIllI;
import orchard.internal.lIIllII;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class ElytraSwap
extends ModuleBase {
    private final lIIllII I = this.IIlllIl(new lIIllII(StringFactory.IIII("Swap Bind")));
    private int l;
    private int II;
    private static final int Il = 9;
    private boolean lI;
    private final llIll ll;
    private IIlIllI III;
    private long IIl;
    private final IIIlIlIIl IlI;
    private static final int[] Ill;
    private static final String[] lII;
    private static final Object[] lIl;

    /*
     * Enabled aggressive block sorting
     */
    public ElytraSwap() {
        super(StringFactory.IIII("ElytraSwap"), Category.IIl, StringFactory.IIII("Swaps an elytra or chestplate from the hotbar into your chest slot."));
        llIll llIll2;
        IIIlIlIIl iIIlIlIIl;
        iIIlIlIIl(StringFactory.IIII("q4NdiBpfEDiSBJ5A"), 45.0, 45.0, 0.0, 500.0, 5.0);
        this.IlI = this.IIlllIl(iIIlIlIIl.IIll(StringFactory.IIII("ms")));
        llIll2((Object)StringFactory.IIII("q4NdiBpfED6WC5Q="), true);
        this.ll = this.IIlllIl(llIll2);
        this.III = IIlIllI.Il;
        this.II = -1;
        this.l = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (!itemStack.isOf(Items.ELYTRA)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(MinecraftClient minecraftClient) {
        if (!this.lIII(minecraftClient) || minecraftClient.player.isUsingItem()) {
            this.lIl(minecraftClient);
            this.IllI();
            return;
        }
        int n = lIIllllI.lllI(minecraftClient.player.getInventory());
        if (lIIllllI.IlllIll(minecraftClient, this.l)) {
            this.III = IIlIllI.I;
            return;
        }
        if (n == this.l) {
            this.lIl(minecraftClient);
            this.IllI();
            return;
        }
        this.III = IIlIllI.II;
        this.IIl = System.currentTimeMillis();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (this.IlI(minecraftClient)) {
            return;
        }
        this.lIl(minecraftClient);
        this.IllI();
        this.lI = false;
    }

    public boolean lII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(MinecraftClient minecraftClient) {
        if ((Boolean)this.ll.lIl() == false) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (this.II < 0) return;
        if (this.II >= 9) return;
        if (this.II == this.l) {
            return;
        }
        lIIllllI.IlIlllI(minecraftClient, this, this.II);
    }

    @Override
    public String II() {
        return null;
    }

    private boolean lll(ClientPlayerEntity clientPlayerEntity) {
        return this.lI(clientPlayerEntity.getEquippedStack(EquipmentSlot.CHEST));
    }

    public boolean IIII() {
        return this.III != IIlIllI.Il;
    }

    private boolean IIlI(ClientPlayerEntity clientPlayerEntity) {
        return this.lIlI(clientPlayerEntity.getEquippedStack(EquipmentSlot.CHEST));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient, IIIIIIIl iIIIIIIl) {
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (iIIIIIIl == IIIIIIIl.I && this.lll(clientPlayerEntity)) {
            return false;
        }
        if (iIIIIIIl == IIIIIIIl.II && this.IIlI(clientPlayerEntity)) {
            return false;
        }
        int n = this.Illl(clientPlayerEntity, iIIIIIIl);
        if (n < 0) {
            return false;
        }
        PlayerInventory playerInventory = clientPlayerEntity.getInventory();
        this.II = lIIllllI.lllI(playerInventory);
        this.l = n;
        this.III = IIlIllI.II;
        long l2 = System.currentTimeMillis();
        boolean bl = lIIllllI.llIllI(minecraftClient) != n;
        this.IIl = l2 + (bl ? this.lIll() : 0L);
        if (this.IIl > l2) return true;
        this.IIl(minecraftClient);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        this.lIl(MinecraftClient.getInstance());
        this.IllI();
        this.lI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllI() {
        this.III = IIlIllI.Il;
        this.IIl = 0L;
        this.II = -1;
        this.l = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (this.III != IIlIllI.I) {
            return;
        }
        this.lIl(minecraftClient);
        this.IllI();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int Illl(ClientPlayerEntity clientPlayerEntity, IIIIIIIl iIIIIIIl) {
        int n;
        block4: {
            ItemStack itemStack;
            PlayerInventory playerInventory;
            block3: {
                playerInventory = clientPlayerEntity.getInventory();
                n = 0;
                if (!true) break block3;
                if (n >= 9) return -1;
                itemStack = playerInventory.getStack(n);
                if (iIIIIIIl == IIIIIIIl.I && this.lI(itemStack)) break block4;
            }
            do {
                if (iIIIIIIl == IIIIIIIl.II && this.lIlI(itemStack)) {
                    return n;
                }
                ++n;
                if (n >= 9) return -1;
                itemStack = playerInventory.getStack(n);
            } while (iIIIIIIl != IIIIIIIl.I || !this.lI(itemStack));
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.l < 0) return false;
        if (this.l >= 9) {
            return false;
        }
        ItemStack itemStack = minecraftClient.player.getInventory().getStack(this.l);
        if (itemStack.isEmpty()) {
            return false;
        }
        if (this.lll(minecraftClient.player)) {
            return this.lIlI(itemStack);
        }
        if (this.lI(itemStack)) return true;
        if (this.lIlI(itemStack)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl(MinecraftClient minecraftClient) {
        boolean bl;
        InputUtil.Key key = (InputUtil.Key)this.I.lIl();
        boolean bl2 = bl = !lIIllllI.IlIIlll(key) && lIIllllI.llI(minecraftClient, key);
        if (bl && !this.lI) {
            IIIIIIIl iIIIIIIl;
            IIIIIIIl iIIIIIIl2 = iIIIIIIl = !this.lll(minecraftClient.player) ? IIIIIIIl.I : IIIIIIIl.II;
            if (!this.IlII(minecraftClient, iIIIIIIl)) {
                this.IlII(minecraftClient, iIIIIIIl != IIIIIIIl.I ? IIIIIIIl.I : IIIIIIIl.II);
            }
        }
        this.lI = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlI(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (itemStack.isOf(Items.LEATHER_CHESTPLATE)) return true;
        if (itemStack.isOf(Items.CHAINMAIL_CHESTPLATE)) return true;
        if (itemStack.isOf(Items.IRON_CHESTPLATE)) return true;
        if (itemStack.isOf(Items.GOLDEN_CHESTPLATE)) return true;
        if (itemStack.isOf(Items.DIAMOND_CHESTPLATE)) return true;
        if (itemStack.isOf(Items.NETHERITE_CHESTPLATE)) return true;
        if (!itemStack.isOf(Items.COPPER_CHESTPLATE)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        if (!this.IlI(minecraftClient)) {
            this.lIl(minecraftClient);
            this.IllI();
            this.lI = false;
            return;
        }
        if (this.III == IIlIllI.II) {
            if (System.currentTimeMillis() < this.IIl) return;
            this.IIl(minecraftClient);
            return;
        }
        if (this.III == IIlIllI.I) {
            return;
        }
        this.lIIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private long lIll() {
        double d = this.IlI.IIIl();
        double d2 = this.IlI.IIII();
        if (d != d2) return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
        return Math.max(0L, Math.round(d));
    }

    @Override
    public void ll() {
        this.IllI();
        this.lI = false;
    }

    private static int llII(int n, int n2) {
        return Ill[n ^ 0x29FD4E4E] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block9: {
            var6 = 24652;
            var7_2 = "\ub7b5\ub7ed\ub7bf\ub7b7\ub7ac\ub79e\ub7d7\ub7f4\ub78c\ub7c6\ub7aa\ub7f0\ub7e4\ub784\ub798\ub7f2\u71a2\u719b\u71d1\u71db\u71ff\u71b2\u71fc\u71c3\u71dc\u71a7\u71af\u71c7\u71cf\u71df\u71c3\u71b2\u71f4\u71a3\u71b1\u71fb\u71e4\u71df\u71ee\u7192\u71db\u71b5\u71a7\u71b5\u71dc\u71e6\u71ae\u71d6\u71f3\u71a2\u71ae\u7196\u71bb\u71ba\u71b8\u71ad\u71ed\u71d6\u71e2\u71a1\u71e4\u71cd\u71b8\u71d2\u71ac\u71ab\u71aa\u71be\u71c9\u71af\u7102\u7194\u71f5\u71b9\u7172\u71fd\u718c\u71a6\u71ee\u71d8\u71ff\u71b5\u71d8\u71be\u7191\u71a7\u71c5\u71c8\u71ba\u7195\u71f0\u71c6\u71ce\u71cd\u71b9\u71c6\u7188\u719a\u71bb\u71b3\u71e6\u71a3\u71ea\u71ca\u7192\u7102\u71de\u71a2\u9499\u94a0\u94ca\u94a0\u94fc\u94aa\u94e8\u94a1\u94a1\u94d4\u94b7\u94c0\u8c01\u8db8\u8db2\u8dee\u8d83\u8dd6\u8c64\u8d8a\u8dc7\u8dbe\u8de9\u8d9b\u8dae\u8dd4\u8da7\u8dd1\uf709\uf740\uf76a\uf74a\u6bb6\u6b8f\u6bdd\u6bd9\u6bd4\u6ba1\u6bcb\u6bb5\u6bb8\u6bc9\u6bfd\u6be8\u6bc0\u6be8\u6bfc\u6bea";
            var8_3 = "\u0010\\\f\u0010\u0004\u0010".toCharArray();
            var9_4 = new String[var8_3.length];
            var13_8 = -1;
            break block9;
            var13_8 = 0;
        }
        var10_5 = 0;
        var11_6 = 0;
        var12_7 = '\u0000';
        if (var13_8 == 0) {
            ElytraSwap.lII = var9_4;
            ElytraSwap.lIl = new Object[var9_4.length];
            var2_13 = 536999952;
            var0_11 = "\u00cd\u00ad\u0011\u00b8<\u00bb|\u0097\u00a4K\u00ba\u0010".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            ElytraSwap.Ill = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                ElytraSwap.Ill[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            return;
        }
lbl27:
        // 3 sources

        var12_7 = var8_3[var10_5];
        var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
        var15_10 = 0;
        if (true) ** GOTO lbl36
        block7: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) break;
lbl36:
            // 2 sources

            switch (var15_10 % 5) {
                case 1: {
                    v0 = 5;
                    continue block7;
                }
                case 4: {
                    v0 = 19;
                    continue block7;
                }
                case 2: {
                    v0 = 1;
                    continue block7;
                }
                default: {
                    v0 = 121;
                    continue block7;
                }
                case 3: 
            }
            v0 = 99;
        }
        var9_4[var10_5] = new String(var14_9).intern();
        var11_6 += var12_7;
        if (++var10_5 < var8_3.length) ** GOTO lbl27
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llIl(char c, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xBA1D;
        char[] cArray = lII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            ElytraSwap.lIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x562B;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0xA922;
            n7 -= 11583;
            n7 ^= 0xFA0E;
            n7 ^= 0xB5E2;
            cArray[n6] = (char)((n7 -= 50359) ^ n4 ^ c ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

