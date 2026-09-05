/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlllI
 * Module         : HoverTotem  [PLAYER]
 * Description    : Instantly offhands a hovered totem.   (client's own text)
 *
 * Recovered strings in this class:
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
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 */
package orchard.module.player;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
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
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;
import orchard.mixin.HandledScreenMixin;

@Environment(value=EnvType.CLIENT)
public final class HoverTotem
extends ModuleBase {
    private int I;
    private long l;
    private final llIll II;
    private int Il;
    private static final long lI = 50L;
    private long ll;
    private int III;
    private static final int IIl = 40;
    private final IIIlIlIIl IlI = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("vJFYnQA="), 0.0, 0.0, 0.0, 500.0, 5.0).IIll(StringFactory.IIII("ms")));
    private final lIlIIlI Ill;
    private long lII;
    private static final int[] lIl;
    private static final String[] llI;
    private static final Object[] lll;

    @Override
    public void III() {
        this.lII(MinecraftClient.getInstance());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lI() {
        this.III = -1;
        this.Il = 0;
        this.lII = 0L;
        this.l = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl(MinecraftClient minecraftClient, Slot slot) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (slot == null) return false;
        if (slot.inventory != minecraftClient.player.getInventory()) return false;
        int n = slot.getIndex();
        if (n < 9) return false;
        if (n < 36) return true;
        return false;
    }

    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        this.lII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public HoverTotem() {
        super(StringFactory.IIII("sJtCmQtjXwiSBQ=="), Category.IIl, StringFactory.IIII("sZpHiBhZRBCOSJBfCdvfkJyHFJ1ZX18KkhqaXU/H0YqdmRo="));
        llIll llIll2;
        llIll2((Object)StringFactory.IIII("sJtAnhhFEC6SDpZVAw=="), true);
        this.II = this.IIlllIl(llIll2);
        this.Ill = this.IIlllIl(new lIlIIlI(StringFactory.IIII("qpFSlRVbEC+bB4s="), 1.0, 1.0, 9.0, 1.0));
        this.I = -1;
        this.III = -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void llll() {
        this.lI();
        this.I = -1;
        this.ll = 0L;
    }

    private long IlI() {
        double d = this.IlI.IIIl();
        double d2 = this.IlI.IIII();
        if (d2 <= d) {
            return (long)Math.max(0.0, d);
        }
        return (long)(d + ThreadLocalRandom.current().nextDouble() * (d2 - d));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII(MinecraftClient minecraftClient) {
        block10: {
            int n;
            Slot slot;
            Screen screen;
            block13: {
                block12: {
                    ItemStack itemStack;
                    int n2;
                    block11: {
                        block7: {
                            block9: {
                                block8: {
                                    if (minecraftClient == null || minecraftClient.player == null || minecraftClient.interactionManager == null || !((screen = minecraftClient.currentScreen) instanceof HandledScreen)) break block7;
                                    HandledScreen handledScreen = (HandledScreen)screen;
                                    screen = handledScreen.getScreenHandler();
                                    if (screen == null) return;
                                    if (!screen.getCursorStack().isEmpty()) break block8;
                                    slot = ((HandledScreenMixin)handledScreen).q96fbb2be();
                                    if (slot != null && slot.id >= 0 && slot.hasStack() && slot.getStack().isOf(Items.TOTEM_OF_UNDYING)) break block9;
                                    break block10;
                                }
                                return;
                            }
                            boolean bl = minecraftClient.player.getOffHandStack().isOf(Items.TOTEM_OF_UNDYING);
                            n = -1;
                            if (bl) break block11;
                            break block12;
                        }
                        this.lI();
                        return;
                    }
                    if (((Boolean)this.II.lIl()).booleanValue() && this.IIl(minecraftClient, slot) && (n2 = (int)Math.round((Double)this.Ill.lIl()) - 1) >= 0 && n2 < 9 && (itemStack = minecraftClient.player.getInventory().getStack(n2)).isEmpty() && (slot.inventory != minecraftClient.player.getInventory() || slot.getIndex() != n2)) {
                        n = n2;
                    }
                    break block13;
                }
                n = 40;
            }
            if (n == -1) {
                this.lI();
                return;
            }
            long l2 = System.currentTimeMillis();
            if (slot.id != this.III) {
                this.III = slot.id;
                this.Il = 1;
                this.lII = l2;
                this.l = this.IlI();
            } else {
                ++this.Il;
            }
            if (this.Il < 2) return;
            if (l2 - this.lII < this.l) {
                return;
            }
            if (slot.id == this.I && l2 - this.ll < 50L + this.l) {
                return;
            }
            if (IIlI.II(minecraftClient)) {
                minecraftClient.interactionManager.clickSlot(screen.syncId, slot.id, n, SlotActionType.SWAP, (PlayerEntity)minecraftClient.player);
                this.I = slot.id;
                this.ll = l2;
                return;
            }
            return;
        }
        this.lI();
    }

    private static int lIl(int n, int n2) {
        return lIl[n ^ 0x30AEDB5] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block32: {
            block28: {
                block34: {
                    block33: {
                        block29: {
                            block30: {
                                block37: {
                                    block31: {
                                        block36: {
                                            block35: {
                                                break block35;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl3:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl5:
                                                // 1 sources

                                                while (true) {
                                                    break block28;
                                                    break;
                                                }
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
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
                                                    var13_10 = -1;
                                                    ** GOTO lbl9
                                                    break;
                                                }
                                                var10_7 = 0;
                                                var11_8 = 0;
                                                ** while (true)
lbl17:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl19:
                                                // 1 sources

                                                while (true) {
                                                    break block29;
                                                    break;
                                                }
lbl21:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 121;
                                                    break block30;
                                                    break;
                                                }
                                                var3_14 = 0;
                                                var4_15 = 0;
                                                break block33;
lbl27:
                                                // 1 sources

                                                while (true) {
                                                    break block31;
lbl29:
                                                    // 1 sources

                                                    while (true) {
                                                        var14_11 = var7_4.substring(var11_8, var11_8 + var12_9).toCharArray();
                                                        var15_12 = 0;
                                                        break block32;
                                                        break;
                                                    }
                                                    break;
                                                }
lbl33:
                                                // 1 sources

                                                while (true) {
                                                    var3_14 += 4;
                                                    if (++var4_15 < var1_2) break block33;
                                                    break block34;
                                                    break;
                                                }
                                                var8_5 = "\u00100\b\u0004\u0014\u0010".toCharArray();
                                                var9_6 = new String[var8_5.length];
                                                ** while (true)
                                            }
                                            var6 = 3220;
                                            var7_4 = "\uec03\ueca5\uecf3\uec83\uec62\uecb3\uece4\uec80\uecc7\uec12\uecdb\uec2f\uec03\uec8c\uec19\uecab\u913d\u918b\u91c9\u91b6\u9158\u919e\u91c6\u918e\u91f3\u9119\u91cf\u910d\u912c\u91a9\u9158\u91ce\u91ff\u9159\u917e\u9192\u914f\u91de\u91af\u91e7\u9123\u91fb\u911e\u9167\u91f6\u9136\u91a3\u915b\u9169\u9198\u9197\u919d\u9159\u91c5\u91a0\u91c3\u9193\u9132\u91b1\u9107\u914d\u91b3\u9145\u91d9\uf9e8\uf94b\uf92f\uf977\uf98f\uf95d\uf93f\uf939\ue043\ue0e9\ue0bb\ue0a2\ua26d\ua2cb\ua29d\ua2ef\ua20f\ua2e4\ua296\ua2c2\ua2b4\ua248\ua2ea\ua241\ua26b\ua2c3\ua210\ua2ae\ua2ad\ua21a\ua265\ua299\u175a\u17c4\u179a\u17c8\u1738\u17eb\u179d\u17d3\u1781\u177d\u17c2\u1745\u1758\u17b2\u170c\u17f0";
                                            ** while (true)
                                            var12_9 = '\u0000';
                                            if (var13_10 != 0) break block36;
                                            break block37;
lbl47:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl49:
                                            // 1 sources

                                            while (true) {
                                                v0 = 123;
                                                break block30;
                                                break;
                                            }
lbl52:
                                            // 1 sources

                                            while (true) {
                                                var13_10 = 0;
                                                ** continue;
                                                break;
                                            }
lbl55:
                                            // 1 sources

                                            while (true) {
                                                v0 = 53;
                                                break block30;
                                                break;
                                            }
                                            var1_2 = var0_1.length / 4;
                                            HoverTotem.lIl = new int[var1_2];
                                            ** while (true)
lbl61:
                                            // 1 sources

                                            while (true) {
                                                v1 = var15_12++;
                                                var14_11[v1] = (char)(var14_11[v1] ^ var16_13 ^ var6);
                                                ** continue;
                                                break;
                                            }
lbl65:
                                            // 1 sources

                                            while (true) {
                                                var0_1 = "\u0082\u00fa\u0004rV\u0080\u00ac\u00cc\u00c8\u0091\u00c0g\u008d#\u00d0$".getBytes("ISO-8859-1");
                                                ** continue;
                                                break;
                                            }
                                        }
lbl69:
                                        // 2 sources

                                        while (true) {
                                            var12_9 = var8_5[var10_7];
                                            ** continue;
                                            break;
                                        }
                                    }
                                    ** while (++var10_7 < var8_5.length)
lbl74:
                                    // 1 sources

                                    ** while (true)
                                    HoverTotem.lll = new Object[var9_6.length];
                                    var2_3 = -1582617338;
                                    ** while (true)
lbl78:
                                    // 1 sources

                                    while (true) {
                                        v0 = 90;
                                        break block30;
                                        break;
                                    }
                                }
                                HoverTotem.llI = var9_6;
                                ** while (true)
                            }
lbl85:
                            // 2 sources

                            while (true) {
                                var16_13 = v0;
                                ** continue;
                                break;
                            }
                        }
                        var9_6[var10_7] = new String(var14_11).intern();
                        var11_8 += var12_9;
                        ** while (true)
                    }
                    var5_16 = (var0_1[var3_14] & 255) << 24 | (var0_1[var3_14 + 1] & 255) << 16 | (var0_1[var3_14 + 2] & 255) << 8 | var0_1[var3_14 + 3] & 255;
                    HoverTotem.lIl[var4_15] = var5_16 ^= var2_3;
                    ** while (true)
lbl96:
                    // 1 sources

                    while (true) {
                        v0 = 106;
                        ** continue;
                        break;
                    }
                }
                return;
            }
            ** while (var15_12 >= var14_11.length)
        }
        switch (var15_12 % 5) {
            default: {
                ** continue;
            }
            case 3: {
                ** continue;
            }
            case 2: {
                ** continue;
            }
            case 1: {
                ** continue;
            }
            ** case 4:
lbl114:
            // 1 sources

            ** continue;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x7E292A9B;
        char[] cArray = llI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            HoverTotem.lll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x88052D88;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                default -> 99;
                case 31 -> 30;
                case 29 -> 57;
                case 27 -> 92;
                case 21 -> 154;
                case 17 -> 92;
                case 10 -> 161;
                case 28 -> 129;
                case 5 -> 241;
                case 14 -> 36;
                case 11 -> 76;
                case 18 -> 39;
                case 9 -> 101;
                case 3 -> 209;
                case 8 -> 142;
                case 23 -> 128;
                case 7 -> 181;
                case 2 -> 216;
                case 1 -> 223;
                case 12 -> 30;
                case 13 -> 204;
                case 30 -> 182;
                case 25 -> 156;
                case 26 -> 33;
                case 4 -> 15;
                case 24 -> 91;
                case 22 -> 183;
                case 15 -> 133;
                case 19 -> 202;
                case 16 -> 178;
                case 20 -> 9;
                case 6 -> 160;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

