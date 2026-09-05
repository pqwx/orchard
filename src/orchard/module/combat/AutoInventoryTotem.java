/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIlllI
 * Module         : Auto Inventory Totem  [COMBAT]
 * Description    : Briefly opens inventory and moves a totem into your offhand   (client's own text)
 *
 * Recovered strings in this class:
 *   - Hotbar Totem
 *   - Hotbar Slot
 *   - Auto Open
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
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 */
package orchard.module.combat;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIlIIl;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;
import orchard.module.combat.AutoDhand;

@Environment(value=EnvType.CLIENT)
public final class AutoInventoryTotem
extends ModuleBase {
    private int I;
    private final lIlIIlI l;
    private Object II;
    private final IIIlIlIIl Il;
    private Object lI;
    private final llIll ll;
    private static final int III = 36;
    private InventoryScreen IIl;
    private static final int IlI = 35;
    private static final int Ill = 40;
    private long lII;
    private InventoryScreen lIl;
    private int llI;
    private static final int lll = 9;
    private final llIll IIII;
    private static final int IIIl = 44;
    private static final int[] IIlI;
    private static final String[] IIll;
    private static final Object[] IlII;

    /*
     * Enabled aggressive block sorting
     */
    private boolean I() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) {
            return false;
        }
        AutoDhand autoDhand = clientEntrypoint.IlI().llIlII();
        AutoDhand autoDhand2 = autoDhand;
        if (autoDhand2 == null) return false;
        if (!autoDhand2.IIl()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        int n;
        ClientPlayerEntity clientPlayerEntity;
        MinecraftClient minecraftClient;
        block19: {
            block18: {
                block17: {
                    boolean bl;
                    block16: {
                        InventoryScreen inventoryScreen;
                        boolean bl2;
                        block15: {
                            Screen screen;
                            block14: {
                                block13: {
                                    boolean bl3;
                                    block12: {
                                        block11: {
                                            block10: {
                                                block9: {
                                                    minecraftClient = MinecraftClient.getInstance();
                                                    this.llI(minecraftClient);
                                                    if (!this.IlII(minecraftClient)) break block9;
                                                    if (this.I()) {
                                                        this.lIl(minecraftClient, true);
                                                        return;
                                                    }
                                                    clientPlayerEntity = minecraftClient.player;
                                                    if (this.Illl(clientPlayerEntity.getOffHandStack())) break block10;
                                                    break block11;
                                                }
                                                this.lIl(minecraftClient, false);
                                                return;
                                            }
                                            bl3 = false;
                                            break block12;
                                        }
                                        bl3 = true;
                                    }
                                    bl2 = bl3;
                                    bl = this.l(clientPlayerEntity);
                                    screen = minecraftClient.currentScreen;
                                    if (screen instanceof InventoryScreen) break block13;
                                    this.IlI();
                                    if (minecraftClient.currentScreen != null) return;
                                    if (!((Boolean)this.IIII.lIl()).booleanValue()) {
                                        // empty if block
                                    }
                                    break block14;
                                }
                                inventoryScreen = (InventoryScreen)screen;
                                if (inventoryScreen != this.IIl) {
                                    this.IIl = inventoryScreen;
                                }
                                break block15;
                            }
                            if (!bl2) {
                                if (!bl) return;
                            }
                            if (this.lI(clientPlayerEntity, -1) < 0) return;
                            screen = new InventoryScreen((PlayerEntity)clientPlayerEntity);
                            this.lIl = screen;
                            this.IIl = screen;
                            this.I = clientPlayerEntity.age;
                            this.lII = System.currentTimeMillis() + this.IIII();
                            minecraftClient.setScreen(screen);
                            return;
                            this.I = inventoryScreen != this.lIl ? clientPlayerEntity.age - 1 : this.I;
                            this.llI = Integer.MIN_VALUE;
                            this.lII = System.currentTimeMillis() + this.IIII();
                        }
                        if (!bl2 && !bl) {
                            if (this.lIl != inventoryScreen) return;
                            if (clientPlayerEntity.age <= this.I) return;
                            minecraftClient.setScreen(null);
                            this.IlI();
                            return;
                        }
                        if (clientPlayerEntity.age <= this.I) return;
                        if (clientPlayerEntity.age <= this.llI) return;
                        if (System.currentTimeMillis() < this.lII) return;
                        if (!clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) {
                            return;
                        }
                        if (minecraftClient.interactionManager == null) {
                            return;
                        }
                        if (!bl2) break block16;
                        if (!bl) break block17;
                        break block18;
                    }
                    if (!bl) return;
                    int n2 = this.IllI();
                    int n3 = this.lI(clientPlayerEntity, n2);
                    if (n3 < 0) return;
                    minecraftClient.interactionManager.clickSlot(clientPlayerEntity.playerScreenHandler.syncId, n3, this.lII(), SlotActionType.SWAP, (PlayerEntity)clientPlayerEntity);
                    this.IIl(clientPlayerEntity);
                    return;
                }
                n = -1;
                break block19;
            }
            n = this.IllI();
        }
        int n4 = n;
        int n5 = this.lI(clientPlayerEntity, n4);
        if (n5 < 0) return;
        minecraftClient.interactionManager.clickSlot(clientPlayerEntity.playerScreenHandler.syncId, n5, 40, SlotActionType.SWAP, (PlayerEntity)clientPlayerEntity);
        this.IIl(clientPlayerEntity);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean l(ClientPlayerEntity clientPlayerEntity) {
        if ((Boolean)this.ll.lIl() == false) return false;
        if (this.Illl(clientPlayerEntity.getInventory().getStack(this.lII()))) return false;
        return true;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int lI(ClientPlayerEntity clientPlayerEntity, int n) {
        int n2;
        block3: {
            int n3;
            block2: {
                n3 = Math.min(44, Math.min(44, clientPlayerEntity.playerScreenHandler.slots.size() - 1));
                n2 = 9;
                if (!true) break block2;
                if (n2 > n3) return -1;
                if (n2 != n && this.Illl(((Slot)clientPlayerEntity.playerScreenHandler.slots.get(n2)).getStack())) break block3;
            }
            do {
                ++n2;
                if (n2 > n3) return -1;
            } while (n2 == n || !this.Illl(((Slot)clientPlayerEntity.playerScreenHandler.slots.get(n2)).getStack()));
        }
        return n2;
    }

    private void IIl(ClientPlayerEntity clientPlayerEntity) {
        this.llI = clientPlayerEntity.age;
        this.lII = System.currentTimeMillis() + this.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI() {
        this.lIl = null;
        this.IIl = null;
        this.I = Integer.MIN_VALUE;
        this.llI = Integer.MIN_VALUE;
        this.lII = 0L;
    }

    private int lII() {
        return (int)Math.round((Double)this.l.lIl()) - 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(MinecraftClient minecraftClient, boolean bl) {
        if (bl && minecraftClient != null && minecraftClient.currentScreen == this.lIl) {
            minecraftClient.setScreen(null);
        }
        this.IlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llI(MinecraftClient minecraftClient) {
        ClientWorld clientWorld;
        ClientPlayerEntity clientPlayerEntity = minecraftClient == null ? null : minecraftClient.player;
        ClientWorld clientWorld2 = clientWorld = minecraftClient == null ? null : minecraftClient.world;
        if (clientPlayerEntity != this.lI || clientWorld != this.II) {
            this.IIlI(false);
            this.lI = clientPlayerEntity;
            this.II = clientWorld;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoInventoryTotem() {
        super(StringFactory.IIII("uYFAk1l+XgqSBotWHcqeqpeAUZE="), Category.II, StringFactory.IIII("uoZdmR9bSVyYGJpXHJPXkI6RWogWRUlclgabGQLcyJuL1FXcDVhEGZpIllcb3J6Hl4FG3BZRVhSWBps="));
        IIIlIlIIl iIIlIlIIl;
        iIIlIlIIl(StringFactory.IIII("vJFYnQA="), 0.0, 0.0, 0.0, 1000.0, 5.0);
        this.Il = this.IIlllIl(iIIlIlIIl.IIll(StringFactory.IIII("ms")));
        this.IIII = this.IIlllIl((llIll)new llIll((Object)StringFactory.IIII("Auto Open"), true).lIII(() -> false));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Hotbar Totem"), false));
        this.l = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Hotbar Slot"), 1.0, 1.0, 9.0, 1.0));
        this.I = Integer.MIN_VALUE;
        this.llI = Integer.MIN_VALUE;
    }

    private long IIII() {
        long l2;
        long l3 = Math.max(0L, Math.round(Math.min(this.Il.IIIl(), this.Il.IIII())));
        return l3 == (l2 = Math.max(l3, Math.round(Math.max(this.Il.IIIl(), this.Il.IIII())))) ? l3 : ThreadLocalRandom.current().nextLong(l3, l2 + 1L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlI(boolean bl) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.lIl(minecraftClient, bl);
        this.lI = null;
        this.II = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    private int IllI() {
        return 36 + this.lII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illl(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (!itemStack.isOf(Items.TOTEM_OF_UNDYING)) return false;
        return true;
    }

    @Override
    public void ll() {
        this.IIlI(false);
    }

    @Override
    public void llll() {
        this.IIlI(true);
    }

    private static int lIII(int n, int n2) {
        return IIlI[n ^ 0xC4CF8F78] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 12977;
        String string = "\uf958\uf9bc\uf9c9\uf9d4\uf96a\ufa24\uf983\ufa2a\uf9bf\uf976\uf964\uf9c2\uf9d5\uf96e\uf95b\uf9c6\uf9cf\uf972\uf964\uf968\uf964\uf967\uf968\uf9d4\uf9b8\uf9bd\uf9c8\ufa30\u533c\u5352\u52d9\u534f\u5354\u52f1\u52f8\u52e1\u52de\u52dd\u5338\u52d8\u52ea\u52e9\u5353\u52db\u52eb\u52e9\u52f3\u52db\u5356\u52e8\u52fd\u52f1\u52da\u5352\u534a\u52da\u52f1\u52dc\u5357\u534e\u5357\u534a\u52e0\u52e1\u52ea\u52f0\u52f7\u534e\u5338\u52e9\u533c\u52f7\u5310\u52ed\u52db\u534e\u52ef\u52dd\u534b\u52ec\u52ea\u52d9\u5353\u52e8\u5357\u5357\u534e\u52e1\u52fe\u52e9\u52fd\u52eb\u5357\u52ff\u52ed\u52ea\u52fe\u5301\u52d9\u52f1\u52dd\u534b\u52de\u52da\u5301\u5353\u533e\u5304\uec55\uebf1\uebe5\uec00\uec3d\uebe8\uebd8\uec0c\u5270\u52cf\u5265\u5343\u813f\u80db\u80ea\u8103\u8149\u8113\u8154\u80fc\u80f3\u80ee\u8157\u80e6\u37cd\u3762\u3760\u375f\u37c6\u37c4\u37c4\u375e\u3773\u375d\u37c7\u3777\u3764\u3762\u37cc\u3783\u4feb\u5050\u4ff2\u5039\u4fdc\u4fde\u4fde\u5044\u5045\u503b\u50b3\u4fd8\u5038\u50b2\u4feb\u50ad";
        char[] cArray = "\u32ad\u32e1\u32b9\u32b5\u32bd\u32a1\u32a1".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            if (!bl || (bl = false) || !true) {
                n4 = cArray[n5] ^ n;
                stringArray[n5] = string.substring(n3, n3 + n4);
                n3 += n4;
                if (++n5 < cArray.length) continue;
                n2 = 0;
            }
            n5 = 0;
            n3 = 0;
            n4 = 0;
            if (n2 == 0) break;
        }
        IIll = stringArray;
        IlII = new Object[stringArray.length];
        int n6 = -1687317939;
        byte[] byArray = "D\u008a\u00dd\u00ef\u009c\u00bcu\u00fa\u0088\u00a9\u00d1\u0006\u00f1 \u00d0\u009c\u00cd\u00d9K\\\u00e7\u00ccE\u00f2hd<\u00e4\u0014\u00ba\u009d&\u0089\u00e8\u00f1\u00ca\u00de\u00ab\u00b8h".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IIlI = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            AutoInventoryTotem.IIlI[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIIl(short s, char c, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xD6DA;
        char[] cArray = IIll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlII[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoInventoryTotem.IlII[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x41E6;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 23729;
            n6 -= 8832;
            n6 += 601;
            n6 ^= 0xD049;
            n6 += 22711;
            n6 -= 10572;
            n6 -= 18010;
            n6 += 55710;
            cArray[n5] = (char)((n6 -= 59858) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

