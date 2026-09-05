/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllI
 * Module         : Auto Totem  [COMBAT]
 * Description    : Refills your offhand with a totem after it is missing or pops   (client's own text)
 *
 * Recovered strings in this class:
 *   - Only No Screen
 *   - Restore Slot
 *   - Panic Delay
 *   - Conditions
 *   - .getBytes(
 *   - Health
 *   - Delay
 *   - Legit
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
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 */
package orchard.module.combat;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIlll;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class AutoTotem
extends ModuleBase {
    private int I = -1;
    private long l;
    private final llIll II;
    private static final long Il = 300L;
    private final llIll lI;
    private int ll;
    private final IIIlIlIIl III;
    private long IIl;
    private long IlI;
    private static final long Ill = 25L;
    private long lII;
    private final llIll lIl;
    private final llIll llI;
    private boolean lll;
    private final lIlIIlI IIII;
    private long IIIl;
    private int IIlI = -1;
    private final IIIIIIIIl<IIIIlll> IIll = this.IIlllIl(new IIIIIIIIl<IIIIlll>(StringFactory.IIII("Mode"), IIIIlll.class, IIIIlll.II));
    private final IIIlIlIIl IlII;
    private boolean IlIl;
    private boolean IllI;
    private ItemStack Illl;
    private int lIII = -1;
    private static final int[] lIIl;
    private static final String[] lIlI;
    private static final Object[] lIll;

    /*
     * Enabled aggressive block sorting
     */
    private void I(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        long l2;
        int n = lIIllllI.lllI(clientPlayerEntity.getInventory());
        if (this.IIlI(clientPlayerEntity.getInventory().getStack(n))) {
            return;
        }
        int n2 = this.IlII(clientPlayerEntity, n);
        if (n2 >= 0) {
            this.lIII = n;
            long l3 = System.currentTimeMillis();
            this.IIl = l3;
            long l4 = this.Illl();
            lIIllllI.IIIIIII(minecraftClient, n2, true);
            if ((Boolean)this.II.lIl() == false) return;
            if (this.lIII < 0) return;
            if (this.lIII == n2) return;
            this.l = l3 + l4 + 250L;
            return;
        }
        if (this.lIII(clientPlayerEntity)) return;
        if (!this.lIIl(clientPlayerEntity)) return;
        this.IIl = l2 = System.currentTimeMillis();
        this.IIIl = l2;
        this.lII = Long.MIN_VALUE;
        this.I = -1;
        this.lll = false;
        this.IllI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIl() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIIlIIl()) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) {
            return;
        }
        if (((Boolean)this.lIl.lIl()).booleanValue() && minecraftClient.currentScreen != null) {
            return;
        }
        if (this.IIll.lIl() == IIIIlll.l) {
            this.I(minecraftClient, minecraftClient.player);
            return;
        }
        if (this.lIII(minecraftClient.player)) {
            this.IlI();
            return;
        }
        if (!this.lIIl(minecraftClient.player)) {
            this.IlI();
            return;
        }
        long l2 = System.currentTimeMillis();
        this.IIl = l2;
        this.IIIl = l2;
        this.lII = Long.MIN_VALUE;
        this.I = -1;
        this.lll = false;
        this.IllI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI() {
        this.lllI();
        this.lIII = -1;
        this.llIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII(MinecraftClient minecraftClient, long l2) {
        if (this.IlIl) {
            return;
        }
        this.IlIl = true;
        this.IIIl = l2;
        this.IIl = l2;
        this.I = this.IIlI;
        this.lII = l2 + this.Illl();
        this.lll = false;
        this.IllI = false;
        this.lIlI(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lIl(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (this.IIIl == Long.MIN_VALUE) return false;
        if (this.IIl == Long.MIN_VALUE) return false;
        if (System.currentTimeMillis() - this.IIl <= 1000L) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.interactionManager != null) {
            if (!this.IIIlIIl()) return;
            if (this.IIIl == Long.MIN_VALUE) return;
            if (this.I >= 0) {
                if (this.IlIl || AutoTotem.llII((Boolean)this.lI.lIl(), (Double)this.IIII.lIl(), minecraftClient.player.getHealth())) {
                    if (!orchard.internal.IIlI.III(minecraftClient)) {
                        if (System.currentTimeMillis() < this.lII) return;
                        this.lll = false;
                        this.lIlI(minecraftClient);
                        return;
                    }
                    break block14;
                } else {
                    this.lllI();
                    return;
                }
            }
        } else {
            block14: {
                return;
            }
            long l2 = System.currentTimeMillis();
            if (l2 >= this.lII) {
                boolean bl;
                ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
                int n = this.I;
                boolean bl2 = this.IlIl ? this.IIIlI(clientPlayerEntity, n) : (bl = n >= 0 && n < clientPlayerEntity.playerScreenHandler.slots.size() && n != 40 && this.IIlI(((Slot)clientPlayerEntity.playerScreenHandler.slots.get(n)).getStack()));
                if (!bl || n < 0 || n >= clientPlayerEntity.playerScreenHandler.slots.size() || n == 40 || !clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) {
                    if (this.IlIl) {
                        this.llIl();
                        this.lllI();
                    } else {
                        this.IllI = true;
                    }
                } else {
                    boolean bl3 = this.IlIl;
                    ItemStack itemStack = clientPlayerEntity.getOffHandStack().copy();
                    this.I = -1;
                    this.lII = Long.MIN_VALUE;
                    this.lll = false;
                    this.IllI = false;
                    orchard.internal.IIlI.Illl(minecraftClient);
                    minecraftClient.interactionManager.clickSlot(clientPlayerEntity.playerScreenHandler.syncId, n, 40, SlotActionType.SWAP, (PlayerEntity)clientPlayerEntity);
                    if (!bl3) {
                        if (((Boolean)this.lI.lIl()).booleanValue()) {
                            this.IIlI = n;
                            this.Illl = itemStack;
                        }
                    } else {
                        this.llIl();
                    }
                    this.lllI();
                }
            }
            this.IIlIl(l2);
            return;
        }
    }

    public void IIII() {
        this.IIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlI(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (itemStack.getItem() == Items.TOTEM_OF_UNDYING) return true;
        return false;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int IlII(ClientPlayerEntity clientPlayerEntity, int n) {
        int n2;
        block3: {
            block2: {
                n2 = 0;
                if (!true) break block2;
                if (n2 >= 9) return -1;
                if (n2 != n && this.IIlI(clientPlayerEntity.getInventory().getStack(n2))) break block3;
            }
            do {
                ++n2;
                if (n2 >= 9) return -1;
            } while (n2 == n || !this.IIlI(clientPlayerEntity.getInventory().getStack(n2)));
        }
        return n2;
    }

    @Override
    public String II() {
        return ((IIIIlll)((Object)this.IIll.lIl())).toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        boolean bl;
        if (!this.IIIlIIl()) {
            this.IlI();
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.interactionManager == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        long l2 = System.currentTimeMillis();
        if (this.l != Long.MIN_VALUE && l2 >= this.l) {
            this.l = Long.MIN_VALUE;
            if (((Boolean)this.II.lIl()).booleanValue() && this.lIII >= 0 && this.lIII < 9) {
                lIIllllI.IIIIIII(minecraftClient, this.lIII, true);
                this.lIII = -1;
            }
        }
        if (!((Boolean)this.lIl.lIl()).booleanValue() || minecraftClient.currentScreen == null) {
            boolean bl2 = AutoTotem.llII((Boolean)this.lI.lIl(), (Double)this.IIII.lIl(), clientPlayerEntity.getHealth());
            if (!bl2) {
                if (this.IlIl) {
                    return;
                }
                this.lllI();
                if (!this.lIII(clientPlayerEntity)) return;
                if (!this.lIll(clientPlayerEntity)) return;
                this.lII(minecraftClient, l2);
                return;
            }
            if (this.IlIl) {
                this.IlIl = false;
                this.lllI();
            }
        } else {
            return;
        }
        if (this.lIII(clientPlayerEntity)) {
            this.lllI();
            return;
        }
        if (this.IIIl == Long.MIN_VALUE) {
            this.IIIl = l2;
        }
        int n = this.IIIll(clientPlayerEntity);
        boolean bl3 = bl = this.I >= 0 && this.I < clientPlayerEntity.playerScreenHandler.slots.size() && this.IIlI(((Slot)clientPlayerEntity.playerScreenHandler.slots.get(this.I)).getStack());
        if (!bl && n < 0) {
            this.IlI();
            return;
        }
        if (this.I >= 0) {
            if (bl) return;
            this.I = n;
            this.IllI = true;
            this.IIlIl(l2);
            return;
        }
        this.I = n;
        this.lII = l2 + this.Illl();
        this.IllI = false;
        this.lIlI(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private long Illl() {
        long l2;
        long l3 = System.currentTimeMillis();
        boolean bl = this.IIl != Long.MIN_VALUE && l3 - this.IIl <= 1500L;
        IIIlIlIIl iIIlIlIIl = bl ? this.IlII : this.III;
        long l4 = Math.min(300L, Math.max(0L, Math.round(iIIlIlIIl.IIIl())));
        long l5 = Math.min(300L, Math.max(l4, Math.max(0L, Math.round(iIIlIlIIl.IIII()))));
        long l6 = l2 = l4 == l5 ? l4 : ThreadLocalRandom.current().nextLong(l4, l5 + 1L);
        if (this.IlI != Long.MIN_VALUE && Math.abs(l2 - this.IlI) < 25L) {
            long l7 = l2 > this.IlI ? l2 + 25L : l2 - 25L;
            l2 = Math.max(l4, Math.min(l5, l7));
        }
        this.IlI = l2;
        return l2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIII(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (!this.IIlI(clientPlayerEntity.getOffHandStack())) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIIl(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (this.lIII(clientPlayerEntity)) return true;
        if (this.IIIll(clientPlayerEntity) < 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player != null) {
            if (this.lll) return;
            orchard.internal.IIlI.I(minecraftClient);
            this.lll = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoTotem() {
        super(StringFactory.IIII("Auto Totem"), Category.II, StringFactory.IIII("Refills your offhand with a totem after it is missing or pops"));
        this.III = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Delay"), 0.0, 0.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.IlII = this.IIlllIl((IIIlIlIIl)new IIIlIlIIl(StringFactory.IIII("Panic Delay"), 85.0, 170.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")).lIII(() -> false));
        this.lI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Conditions"), false));
        this.IIII = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("Health"), 10.0, 1.0, 20.0, 0.5).IIII(StringFactory.IIII("HP")).lIII(this.lI::lIl));
        this.llI = this.IIlllIl((llIll)new llIll((Object)StringFactory.IIII("Legit"), true).lIII(() -> false));
        this.II = this.IIlllIl((llIll)new llIll((Object)StringFactory.IIII("Restore Slot"), true).lIII(() -> false));
        this.lIl = this.IIlllIl((llIll)new llIll((Object)StringFactory.IIII("Only No Screen"), false).lIII(() -> false));
        this.ll = Integer.MIN_VALUE;
        this.IIIl = Long.MIN_VALUE;
        this.lII = Long.MIN_VALUE;
        this.IIl = Long.MIN_VALUE;
        this.IlI = Long.MIN_VALUE;
        this.l = Long.MIN_VALUE;
        this.Illl = ItemStack.EMPTY;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIll(ClientPlayerEntity clientPlayerEntity) {
        if (this.IIlI < 0) return false;
        if (this.IIlI >= clientPlayerEntity.playerScreenHandler.slots.size()) return false;
        if (this.IIlI == 40) return false;
        if (this.IIIlI(clientPlayerEntity, this.IIlI)) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean llII(boolean bl, double d, float f) {
        if (!bl) return true;
        if (!(f <= (float)d)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void llIl() {
        this.IIlI = -1;
        this.Illl = ItemStack.EMPTY;
        this.IlIl = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllI() {
        this.IIIl = Long.MIN_VALUE;
        this.lII = Long.MIN_VALUE;
        this.IIl = Long.MIN_VALUE;
        this.I = -1;
        this.lll = false;
        this.IllI = false;
        this.l = Long.MIN_VALUE;
    }

    @Override
    public void llll() {
        this.ll = Integer.MIN_VALUE;
        this.IlI();
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
        if (by != 35) return;
        if (entity == null) return;
        if (entity.getId() != minecraftClient.player.getId()) {
            return;
        }
        this.IIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIIl(Packet<?> packet) {
        if (!this.lIl(MinecraftClient.getInstance())) return false;
        if (packet instanceof PlayerInteractEntityC2SPacket) return true;
        if (packet instanceof PlayerInteractBlockC2SPacket) return true;
        if (packet instanceof PlayerInteractItemC2SPacket) return true;
        if (packet instanceof PlayerActionC2SPacket) return true;
        if (!(packet instanceof HandSwingC2SPacket)) return false;
        return true;
    }

    @Override
    public void ll() {
        this.ll = Integer.MIN_VALUE;
        this.IlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlI(ClientPlayerEntity clientPlayerEntity, int n) {
        boolean bl;
        if (clientPlayerEntity == null) return false;
        if (n < 0) return false;
        if (n >= clientPlayerEntity.playerScreenHandler.slots.size()) {
            return false;
        }
        ItemStack itemStack = ((Slot)clientPlayerEntity.playerScreenHandler.slots.get(n)).getStack();
        if (!this.Illl.isEmpty()) {
            bl = ItemStack.areItemsAndComponentsEqual((ItemStack)itemStack, (ItemStack)this.Illl);
            return bl;
        }
        bl = itemStack.isEmpty();
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIIll(ClientPlayerEntity clientPlayerEntity) {
        int n = 9;
        while (n < 45) {
            if (n != 40 && this.IIlI(((Slot)clientPlayerEntity.playerScreenHandler.slots.get(n)).getStack())) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIl(long l2) {
        if (!this.IllI) return;
        if (this.I < 0) {
            return;
        }
        this.IllI = false;
        this.lll = false;
        this.lIlI(MinecraftClient.getInstance());
        this.lII = l2 + this.Illl();
    }

    private static int IIllI(int n, int n2) {
        return lIIl[n ^ 0x971C84FF] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block39: {
            block32: {
                block37: {
                    block30: {
                        block36: {
                            block31: {
                                block34: {
                                    block38: {
                                        block35: {
                                            block33: {
                                                break block37;
lbl1:
                                                // 2 sources

                                                while (true) {
                                                    var10_5 = 0;
                                                    break block30;
                                                    break;
                                                }
lbl4:
                                                // 1 sources

                                                while (true) {
                                                    break block31;
                                                    break;
                                                }
lbl6:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl8:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 12;
                                                    break block32;
                                                    break;
                                                }
lbl11:
                                                // 1 sources

                                                while (true) {
                                                    if (var13_8 != 0) break block33;
                                                    break block34;
                                                    break;
                                                }
lbl14:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl16:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl18:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 55;
                                                    break block32;
                                                    break;
                                                }
lbl21:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 126;
                                                    break block32;
                                                    break;
                                                }
lbl24:
                                                // 1 sources

                                                while (true) {
                                                    var3_14 = 0;
                                                    break block35;
                                                    break;
                                                }
lbl27:
                                                // 1 sources

                                                while (true) {
                                                    var13_8 = 0;
                                                    ** GOTO lbl1
                                                    break;
                                                }
                                                AutoTotem.lIll = new Object[var9_4.length];
                                                break block38;
lbl32:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl34:
                                                // 1 sources

                                                return;
lbl36:
                                                // 1 sources

                                                while (true) {
                                                    var8_3 = "\u6f4c\u6f08\u6f54\u6f54\u6f58\u6f4c\u6f58\u6f4c\u6f54\u6f58\u6f54\u6f4c\u6f48".toCharArray();
                                                    ** continue;
                                                    break;
                                                }
                                            }
lbl40:
                                            // 2 sources

                                            while (true) {
                                                var12_7 = var8_3[var10_5] ^ var6;
                                                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                                                var15_10 = 0;
                                                break block36;
                                                break;
                                            }
                                        }
                                        var4_15 = 0;
                                        ** GOTO lbl32
                                    }
                                    var2_12 = -889197231;
                                    var0_11 = "\u00b7\u00c7\u0082\u00a4Es\u00f5P\u00cd\\\u0017U\u009a\u0004\u00bb\u0014\u0094\u0099\u00bc-\bkrF\u00cd\u008a\u00ab\u00aa\u001eP\u00e6\u009e \u00ee\u00fd\u0006gxi\u00cb\u009c\u00b9\u001a\u00eb;\u00a3\u0083\u0081\u0085~\u001ft".getBytes("ISO-8859-1");
                                    ** while (true)
lbl52:
                                    // 1 sources

                                    while (true) {
                                        var11_6 += var12_7;
                                        ** continue;
                                        break;
                                    }
lbl55:
                                    // 1 sources

                                    while (true) {
                                        v0 = 51;
                                        break block32;
                                        break;
                                    }
                                    var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                                    AutoTotem.lIIl[var4_15] = var5_16 ^= var2_12;
                                    var3_14 += 4;
                                    if (++var4_15 >= var1_13) ** break;
                                    ** while (true)
                                    ** while (true)
lbl64:
                                    // 1 sources

                                    while (true) {
                                        v0 = 110;
                                        break block32;
                                        break;
                                    }
                                    var9_4 = new String[var8_3.length];
                                    var13_8 = -1;
                                    ** while (true)
lbl70:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl72:
                                    // 1 sources

                                    while (true) {
                                        var12_7 = 0;
                                        ** continue;
                                        break;
                                    }
lbl75:
                                    // 1 sources

                                    while (true) {
                                        var9_4[var10_5] = new String(var14_9).intern();
                                        ** continue;
                                        break;
                                    }
                                }
                                AutoTotem.lIlI = var9_4;
                                ** while (true)
lbl81:
                                // 1 sources

                                while (true) {
                                    v0 = 90;
                                    break block32;
                                    break;
                                }
                            }
                            ** while (++var10_5 < var8_3.length)
lbl86:
                            // 1 sources

                            ** while (true)
                        }
lbl88:
                        // 2 sources

                        while (true) {
                            switch (var15_10 % 6) {
                                case 1: {
                                    ** continue;
                                }
                                default: {
                                    ** continue;
                                }
                                case 5: {
                                    ** continue;
                                }
                                case 4: {
                                    ** continue;
                                }
                                case 2: {
                                    ** continue;
                                }
                                ** case 3:
lbl101:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    var11_6 = 0;
                    ** while (true)
                    var1_13 = var0_11.length / 4;
                    AutoTotem.lIIl = new int[var1_13];
                    ** while (true)
                }
                var6 = 28508;
                var7_2 = "\udcf7\udc21\udcc2\udc86\udcd4\udcdc\udcce\udcd5\udce1\udc7d\udc08\udcf6\udc80\udcc0\udc7f\udce3\uf445\uf4be\uf474\uf422\uf465\uf409\uf442\uf46b\uf45e\uf48d\uf4ae\uf45c\uf436\uf413\uf484\uf424\uf4a4\uf4c8\uf411\uf4e1\uf419\uf48f\uf409\uf458\uf431\uf4e1\uf4cc\uf423\uf4fc\uf4ba\uf4a3\uf495\uf403\uf4a8\uf406\uf430\uf44a\uf47b\uf43b\uf43c\uf42b\uf4e8\uf4a6\uf437\uf41c\uf437\uf4fe\uf42d\uf4b0\uf4d5\uf478\uf4ad\uf471\uf4ab\uf47a\uf41f\uf40c\uf4f6\uf4b8\uf43e\uf4c2\uf4b7\uf4de\uf4d2\uf459\uf488\uf40f\uf443\uf43f\uf417\uf424\uf423\uf40e\uf49d\uf4bd\uf46f\uf437\uf41f\uf4ef\uf474\uf4e5\uf494\uf452\uf4f7\u484d\u4899\u484b\u482d\u4869\u4807\u4824\u4839\ue46b\ue4ad\ue45d\ue401\ue44e\ue423\ue47c\ue41d\ud2d9\ud216\ud2d0\ud2cd\u4c02\u4cc3\u4c23\u4c57\u4c22\u4c4e\u4c3c\u4c16\u4c2c\u4cb9\u4cfd\u4c36\u4c70\u4c39\u4cea\u4c12\ua60d\ua6c2\ua604\ua619\u8c71\u8ccb\u8c76\u8c20\u8c54\u8c29\u8c66\u8c7d\u8c68\u8cde\u8ca8\u8c79\u8c03\u8c60\u8cf9\u8c65\ucb29\ucbea\ucb1a\ucb49\ucb0c\ucb74\ucb4b\ucb01\u2778\u27ba\u275c\u2773\u6d3f\u6dfb\u6d0b\u6d5a\u6d1a\u6d75\u6d5b\u6d4b\u6800\u68fb\u6831\u687c\u6825\u685c\u680b\u680a\u681c\u68af\u68eb\u683d\u6873\u6828\u68f3\u6863\ub558\ub5e3\ub55a\ub530\ub579\ub515\ub560\ub524\ub54f\ub595\ub5b6\ub560\ub52f\ub50b\ub5dd\ub513\ub5ab\ub59d\ub543\ub59d";
                ** while (true)
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                break block39;
            }
            var16_1 = v0;
            ** while (true)
        }
        ** while (var15_10 < var14_9.length)
lbl120:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static String IIlll(int var0, int var1_1) {
        block68: {
            block66: {
                block70: {
                    block69: {
                        block67: {
                            break block69;
lbl1:
                            // 1 sources

                            while (true) {
                                var9_9 = 186;
                                ** GOTO lbl165
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var9_9 = 226;
                                ** GOTO lbl165
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                break block66;
lbl9:
                                // 1 sources

                                while (true) {
                                    var9_9 = 204;
                                    ** GOTO lbl165
                                    break;
                                }
lbl12:
                                // 1 sources

                                while (true) {
                                    var9_9 = 66;
                                    ** GOTO lbl165
                                    break;
                                }
                                break;
                            }
lbl15:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                var9_9 = 247;
                                ** GOTO lbl165
                                break;
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var9_9 = 91;
                                ** GOTO lbl165
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                break block67;
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var9_9 = 36;
                                ** GOTO lbl165
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var9_9 = 178;
                                ** GOTO lbl165
                                break;
                            }
                        }
                        var5_5 = new Throwable().getStackTrace();
                        AutoTotem.lIll[var3_2] = var5_5;
                        ** GOTO lbl15
lbl35:
                        // 1 sources

                        while (true) {
                            var9_9 = 123;
                            ** GOTO lbl165
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var9_9 = 250;
                            ** GOTO lbl165
                            break;
                        }
lbl43:
                        // 1 sources

                        return new String(var4_4).intern();
lbl45:
                        // 1 sources

                        while (true) {
                            var8_8 = 0;
                            break block68;
                            break;
                        }
                    }
                    var3_2 = var0 ^ -92601300;
                    var4_4 = AutoTotem.lIlI[var3_2].toCharArray();
                    ** while (true)
lbl52:
                    // 1 sources

                    while (true) {
                        var9_9 = 1;
                        ** GOTO lbl165
                        break;
                    }
                    var6_6 = var5_5[1];
                    var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 880801203;
                    ** while (true)
lbl58:
                    // 1 sources

                    while (true) {
                        var9_9 = 83;
                        ** GOTO lbl165
                        break;
                    }
lbl61:
                    // 1 sources

                    while (true) {
                        var9_9 = 93;
                        ** GOTO lbl165
                        break;
                    }
                    var2_3 = (StackTraceElement[])AutoTotem.lIll[var3_2];
                    ** while (var2_3 == null)
lbl66:
                    // 1 sources

                    break block70;
lbl67:
                    // 1 sources

                    while (true) {
                        var9_9 = 8;
                        ** GOTO lbl165
                        break;
                    }
lbl70:
                    // 1 sources

                    while (true) {
                        var9_9 = 98;
                        ** GOTO lbl165
                        break;
                    }
lbl73:
                    // 1 sources

                    while (true) {
                        var9_9 = 59;
                        ** GOTO lbl165
                        break;
                    }
lbl76:
                    // 1 sources

                    while (true) {
                        var9_9 = 231;
                        ** GOTO lbl165
                        break;
                    }
                }
                var5_5 = var2_3;
                ** while (true)
lbl82:
                // 1 sources

                while (true) {
                    var9_9 = 83;
                    ** GOTO lbl165
                    break;
                }
lbl85:
                // 1 sources

                while (true) {
                    var9_9 = 91;
                    ** GOTO lbl165
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    var9_9 = 125;
                    ** GOTO lbl165
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    var9_9 = 41;
                    ** GOTO lbl165
                    break;
                }
lbl94:
                // 1 sources

                while (true) {
                    var9_9 = 74;
                    ** GOTO lbl165
                    break;
                }
lbl97:
                // 1 sources

                while (true) {
                    var9_9 = 158;
                    ** GOTO lbl165
                    break;
                }
lbl100:
                // 1 sources

                while (true) {
                    var9_9 = 135;
                    ** GOTO lbl165
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    var9_9 = 229;
                    ** GOTO lbl165
                    break;
                }
lbl106:
                // 1 sources

                while (true) {
                    var9_9 = 156;
                    ** GOTO lbl165
                    break;
                }
            }
            ** while (++var8_8 >= var4_4.length)
        }
        switch (var8_8 & 31) {
            case 1: {
                ** continue;
            }
            case 14: {
                ** continue;
            }
            case 19: {
                ** continue;
            }
            case 4: {
                ** continue;
            }
            case 17: {
                ** continue;
            }
            case 27: {
                ** continue;
            }
            case 2: {
                ** continue;
            }
            case 26: {
                ** continue;
            }
            default: {
                ** continue;
            }
            case 29: {
                ** continue;
            }
            case 22: {
                ** continue;
            }
            case 13: {
                ** continue;
            }
            case 5: {
                ** continue;
            }
            case 23: {
                ** continue;
            }
            case 20: {
                ** continue;
            }
            case 12: {
                ** continue;
            }
            case 21: {
                ** continue;
            }
            case 3: {
                ** continue;
            }
            case 6: {
                ** continue;
            }
            case 7: {
                ** continue;
            }
            case 24: {
                ** continue;
            }
            case 15: {
                ** continue;
            }
            case 9: {
                ** continue;
            }
            case 30: {
                ** continue;
            }
            case 25: {
                ** continue;
            }
            case 10: {
                ** continue;
            }
lbl165:
            // 32 sources

            while (true) {
                var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                ** continue;
                break;
            }
            case 16: {
                var9_9 = 187;
                ** GOTO lbl165
            }
            case 8: {
                var9_9 = 25;
                ** GOTO lbl165
            }
            case 28: {
                var9_9 = 230;
                ** GOTO lbl165
            }
            case 31: {
                var9_9 = 168;
                ** GOTO lbl165
            }
            case 18: {
                var9_9 = 36;
                ** GOTO lbl165
            }
            case 11: 
        }
        var9_9 = 21;
        ** while (true)
    }
}

