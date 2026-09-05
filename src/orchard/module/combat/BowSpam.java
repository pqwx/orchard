/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllllIII
 * Module         : BowSpam  [COMBAT]
 * Description    : Rapidly releases and restarts a held bow at minimum charge.   (client's own text)
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
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.BowItem
 *  net.minecraft.item.ItemStack
 */
package orchard.module.combat;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;

@Environment(value=EnvType.CLIENT)
public final class BowSpam
extends ModuleBase {
    private int I;
    private final lIlIIlI l;
    private static final int II = 3;
    private static final int[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.I(minecraftClient)) {
            this.IIl();
            return;
        }
        boolean bl = lIIllllI.IIllIII(minecraftClient, minecraftClient.options.useKey);
        if (bl && this.l(minecraftClient)) {
            if (!minecraftClient.player.isUsingItem()) {
                if (minecraftClient.player.age >= this.I) {
                    lIIllllI.IIIlIlI(minecraftClient);
                    lIIllllI.IIllllI(minecraftClient);
                    this.I = minecraftClient.player.age + 1;
                    return;
                }
                return;
            }
            ItemStack itemStack = minecraftClient.player.getActiveItem();
            int n = Math.max(3, (int)Math.round((Double)this.l.lIl()));
            if (!(itemStack.getItem() instanceof BowItem)) return;
            if (!BowSpam.lI(minecraftClient.player.getItemUseTime(), n)) {
                return;
            }
        } else {
            this.IIl();
            return;
        }
        minecraftClient.interactionManager.stopUsingItem((PlayerEntity)minecraftClient.player);
        this.I = minecraftClient.player.age + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean I(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    @Override
    public void ll() {
        this.IIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public BowSpam() {
        super(StringFactory.IIII("uptDrwlWXQ=="), Category.II, StringFactory.IIII("qpVElR1bSVyFDZNcDsDbjdiVWphZRVUPgwmNTRyT396QkViYWVVfC9cJixkC2tCXlYFZ3BpfUQ6QDdE="));
        lIlIIlI lIlIIlI2;
        lIlIIlI2(StringFactory.IIII("u5xVjh5SECieC5RK"), 3.0, 3.0, 20.0, 1.0);
        this.l = this.IIlllIl(lIlIIlI2);
        this.I = Integer.MIN_VALUE;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean l(MinecraftClient minecraftClient) {
        if (minecraftClient.player.getMainHandStack().getItem() instanceof BowItem) return true;
        if (!(minecraftClient.player.getOffHandStack().getItem() instanceof BowItem)) return false;
        return true;
    }

    static boolean lI(int n, int n2) {
        return n >= Math.max(3, n2);
    }

    @Override
    public void llll() {
        this.IIl();
    }

    private void IIl() {
        this.I = Integer.MIN_VALUE;
    }

    private static int IlI(int n, int n2) {
        return Il[n ^ 0x30F5209F] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 7285;
        String string = "\u03ca\u03d2\u03c9\u03e8\u03d0\u03ad\u03c3\u03b5\u03ad\u0395\u038f\u03ff\u0b7f\u0b6b\u0b5a\u0b00\u0b57\u0b29\u0b3f\u0b61\u0b47\u0b6b\u0b6a\u0b45\u0b32\u0b49\u0b22\u0b46\u0b2f\u0b08\u0b32\u0b61\u0b4e\u0b61\u0b5a\u0b35\u0b59\u0b6b\u0b44\u0b6f\u0b59\u0b35\u0b23\u0b4b\u0b4b\u0b4a\u0b56\u0b4d\u0b22\u0b51\u0b75\u0b11\u0b38\u0b5a\u0b38\u0b4a\u0b4f\u0b6b\u0b5a\u0b3a\u0b59\u0b4d\u0b5a\u0b7b\u0b48\u0b5a\u0b75\u0b39\u0b45\u0b45\u0b50\u0b38\u0b24\u0b57\u0b57\u0b65\u0b57\u0b3a\u0b28\u0b49\u0b27\u0b67\u0b63\u0b25\u0b23\u0b4a\u0b3a\u0b6c\u0b2f\u0b3f\u0b33\u0b2e\uc9bf\uc9ea\uc9b8\uc9b7\uc99d\uc9e7\uc9ff\uc98c\uce6d\uce5a\uc996\uc9e2\uce69\uc9ea\uc99a\uce52";
        char[] cArray = "\fP\u0010".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            char c;
            char[] cArray2;
            block14: {
                int n4;
                block13: {
                    int n5;
                    block12: {
                        block11: {
                            if (bl && !(bl = false) && true) break block11;
                            stringArray[n5] = new String(cArray2).intern();
                            n3 += c;
                            if (++n5 < cArray.length) break block12;
                            n2 = 0;
                        }
                        n5 = 0;
                        n3 = 0;
                        c = '\u0000';
                        if (n2 != 0) break block12;
                        lI = stringArray;
                        ll = new Object[stringArray.length];
                        break block13;
                    }
                    c = cArray[n5];
                    break block14;
                }
                int n6 = -1995129668;
                byte[] byArray = "\u00903\u00c4\u00b8\u00ce\u0094!(".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                Il = new int[n7];
                int n8 = 0;
                int n9 = 0;
                if (true) {
                    n4 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                }
                while (true) {
                    BowSpam.Il[n9] = n4 ^= n6;
                    n8 += 4;
                    if (++n9 >= n7) break;
                    n4 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                }
                return;
            }
            cArray2 = string.substring(n3, n3 + c).toCharArray();
            int n10 = 0;
            do {
                int n11 = switch (n10 % 6) {
                    case 2 -> 53;
                    case 5 -> 90;
                    case 3 -> 4;
                    case 1 -> 34;
                    default -> 55;
                    case 4 -> 42;
                };
                int n12 = n10++;
                cArray2[n12] = (char)(cArray2[n12] ^ n11 ^ n);
            } while (n10 < cArray2.length);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lII(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x586A;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            BowSpam.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x181C;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x235C;
            n6 ^= 0x6409;
            n6 ^= 0x407C;
            n6 += 27352;
            n6 -= 9430;
            n6 ^= 0xD2F4;
            n6 += 24539;
            cArray[n5] = (char)((n6 += 51383) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

