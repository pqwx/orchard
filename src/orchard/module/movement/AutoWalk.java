/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIllIIl
 * Module         : Auto Walk  [MOVEMENT]
 * Description    : Automatically walks forward until toggled off or a menu is opened.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Strafe Seconds
 *   - Auto Strafe
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
 *  net.minecraft.client.option.KeyBinding
 */
package orchard.module.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIlII;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class AutoWalk
extends ModuleBase {
    private long I;
    private boolean l = true;
    private final lIlIIlI II;
    private final llIll Il = this.IIlllIl(new llIll((Object)StringFactory.IIII("Auto Strafe"), false));
    private static final String[] lI;
    private static final Object[] ll;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void lI(MinecraftClient minecraftClient, IIIIlII iIIIlII, KeyBinding keyBinding, boolean bl) {
        if (keyBinding == null) {
            return;
        }
        if (iIIIlII != null) {
        } else {
            keyBinding.setPressed(bl);
            return;
        }
        iIIIlII.Il(this, minecraftClient, keyBinding, bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoWalk() {
        super(StringFactory.IIII("uYFAk1lgURCc"), Category.ll, StringFactory.IIII("uYFAkxRWRBWUCZNVFpPJn5SfR9wfWEILlhqbGRrdypeU1ECTHlBcGZNIkF8Jk9GM2JUUkRxZRVyeG99WH9bQm5za"));
        this.II = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Strafe Seconds"), 0.8, 0.1, 5.0, 0.1).IIII(StringFactory.IIII("s")));
        this.II.lIII(this.Il::lIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.options != null) {
            IIIIlII iIIIlII = IIIIlII.IlI();
            this.IlI(minecraftClient, iIIIlII, minecraftClient.options.forwardKey);
            this.IlI(minecraftClient, iIIIlII, minecraftClient.options.leftKey);
            this.IlI(minecraftClient, iIIIlII, minecraftClient.options.rightKey);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IlI(MinecraftClient minecraftClient, IIIIlII iIIIlII, KeyBinding keyBinding) {
        if (keyBinding == null) return;
        if (iIIIlII != null) {
            iIIIlII.ll(this, minecraftClient, keyBinding);
            return;
        }
        keyBinding.setPressed(false);
    }

    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        this.lII(minecraftClient);
    }

    @Override
    public void llll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.IIl(minecraftClient);
    }

    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.lII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII(MinecraftClient minecraftClient) {
        IIIIlII iIIIlII;
        if (minecraftClient == null) {
            return;
        }
        if (minecraftClient.player == null) return;
        if (minecraftClient.options != null) {
            if (minecraftClient.currentScreen != null) {
                this.IIl(minecraftClient);
                return;
            }
            iIIIlII = IIIIlII.IlI();
            this.lI(minecraftClient, iIIIlII, minecraftClient.options.forwardKey, true);
            if (!((Boolean)this.Il.lIl()).booleanValue()) {
                this.lI(minecraftClient, iIIIlII, minecraftClient.options.leftKey, false);
                this.lI(minecraftClient, iIIIlII, minecraftClient.options.rightKey, false);
                return;
            }
        } else {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 >= this.I) {
            this.l = !this.l;
            this.I = l2 + Math.max(100L, Math.round((Double)this.II.lIl() * 1000.0));
        }
        this.lI(minecraftClient, iIIIlII, minecraftClient.options.leftKey, this.l);
        this.lI(minecraftClient, iIIIlII, minecraftClient.options.rightKey, !this.l);
    }

    @Override
    public void ll() {
        this.l = true;
        this.I = 0L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 2299;
        String string = "\ue783\ue7ff\ue7bc\ue769\ue775\ue7b1\ue7dd\ue7f6\ue725\ue780\ue7bc\ue7f2\u51d6\u51aa\u51e9\u513c\u5120\u51ad\u51b6\u5193\u5177\u51c5\u51fd\u5191\u51b2\u5103\u51e2\u51a4\u51b2\u5195\u51cb\u5124\u5197\u51da\u51a1\u5194\u5124\u512c\u5177\u51a9\u51a4\u51f5\u5179\u511d\u51cf\u519b\u51de\u511f\u510c\u5187\u5196\u51a0\u515c\u51f7\u51cf\u5191\u51c0\u511c\u51ef\u51a6\u51bc\u5189\u51d9\u510d\u51be\u51b5\u51bc\u51bb\u511d\u5153\u5138\u5185\u5198\u5189\u5177\u511c\u5191\u51b9\u51fa\u5128\u5120\u5187\u519c\u519e\u5177\u51d1\u51d3\u51a1\u51b6\u5160\u5195\u51a5\u51bc\u51dc\u51f9\u513f\u5194\u51da\u5188\u5193\u798c\u79f0\u79b3\u7966\u797a\u79be\u79d2\u79f5\u792d\u799c\u79c6\u79c9\u79ef\u7973\u7999\u7995\uf9c7\uf9d2\uf9f8\uf92f\uf930\uf992\uf9c8\uf982\uf975\uf9d1\uf994\uf982\uf9a7\uf979\uf9fb\uf9bf\uf9a2\uf9c8\uf9cf\uf946\ue7aa\ue7e4\ue7f2\ue720";
        char[] cArray = "\u08f7\u08a3\u08eb\u08ef\u08ff".toCharArray();
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
        lI = stringArray;
        ll = new Object[stringArray.length];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xCF07E9F2;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoWalk.ll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x84827794;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 27 -> 229;
                case 10 -> 128;
                case 24 -> 92;
                case 11 -> 238;
                case 9 -> 173;
                case 31 -> 123;
                case 23 -> 216;
                case 25 -> 63;
                case 20 -> 211;
                case 12 -> 219;
                case 28 -> 217;
                case 14 -> 134;
                case 3 -> 87;
                default -> 137;
                case 21 -> 197;
                case 26 -> 42;
                case 19 -> 68;
                case 4 -> 97;
                case 18 -> 177;
                case 13 -> 115;
                case 7 -> 238;
                case 16 -> 222;
                case 30 -> 26;
                case 22 -> 216;
                case 17 -> 207;
                case 1 -> 217;
                case 5 -> 255;
                case 6 -> 206;
                case 8 -> 15;
                case 2 -> 133;
                case 29 -> 154;
                case 15 -> 216;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

