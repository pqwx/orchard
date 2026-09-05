/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllIllI
 * Module         : Autoclicker  [COMBAT]
 * Description    : Automatically clicks at a configurable rate.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Only When Holding
 *   - .getBytes(
 *   - settings
 *   - Button
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.KeyBinding
 */
package orchard.module.combat;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIllIlIlI;
import orchard.internal.IIlllIIll;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class Autoclicker
extends ModuleBase {
    private final IIIlIlIIl I = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("CPS"), 10.0, 14.0, 1.0, 20.0, 0.5).lII("cps"));
    private final IIIIIIIIl<IIllIlIlI> l = this.IIlllIl(new IIIIIIIIl<IIllIlIlI>(StringFactory.IIII("Button"), IIllIlIlI.class, IIllIlIlI.I));
    private final llIll II = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only When Holding"), true));
    private static String[] Il;
    private final IIlllIIll lI = new IIlllIIll();
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private KeyBinding I(MinecraftClient minecraftClient) {
        KeyBinding keyBinding;
        if (minecraftClient == null) return null;
        if (minecraftClient.options == null) return null;
        if (this.l.lIl() == IIllIlIlI.II) {
            keyBinding = minecraftClient.options.useKey;
            return keyBinding;
        }
        keyBinding = minecraftClient.options.attackKey;
        return keyBinding;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean l(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (minecraftClient.options == null) {
            return false;
        }
        if (minecraftClient.player.isUsingItem()) {
            return false;
        }
        if (!((Boolean)this.II.lIl()).booleanValue()) {
            return true;
        }
        KeyBinding keyBinding = this.I(minecraftClient);
        if (keyBinding == null) return false;
        if (lIIllllI.IIllIII(minecraftClient, keyBinding)) return true;
        if (keyBinding.isPressed()) return true;
        return false;
    }

    @Override
    public void ll() {
        this.lI();
    }

    @Override
    public void llll() {
        this.lI();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        if (jsonObject == null) return;
        if (!jsonObject.has("settings")) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("settings");
        if (jsonObject2 != null) {
            JsonElement jsonElement = jsonObject2.get("CPS");
            if (jsonElement == null) return;
            if (!jsonElement.isJsonPrimitive()) return;
            if (!jsonElement.getAsJsonPrimitive().isNumber()) return;
            double d = jsonElement.getAsDouble();
            this.I.I(new double[]{d, d});
            return;
        }
    }

    private void lI() {
        this.lI.Il();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 23771;
        String string = "\u638c\uf74d\ufab1\ub7f9\ua429\uc7aa\u0ad7\u23c0\uf877\ubf12\ucd86\uba39\ud678\ua073\u6ac6\u7485\ue5cc\ue526\ua5f8\u44e2\u9cf2\u9714\u794b\u4357\u0acf\u5512\u2916\u6709\ub275\ub3bf\u2020\u7d61\u711b\u4dc0\ub3c6\u7fca\uc64e\u6984\u7d32\u2a06\u2127\ucc28\udd89\ue7bc\u159c\u00a6\ub408\u6917\u1c6d\u02a3\u0da6\uad35\u85ea\u2011\u519f\ubbcc\u9f25\u20be\u6451\u8ace\u3607\u9a3f\u9493\uc565\u5567\u4b0b\ub936\u82b8\u2a6f\uce19\u7281\u2a03\u44ae\u0823\u8e54\u9fc7\u748f\u2307\ua0da\u274a\u9217\uf909\u1c7b\u7eef\u930f\ud32f\u08f9\u438c\u99cb\u2baa\u2929\uba60\ub266\ucc33\u748f\u0b68\u5bad\u2a93\ub394\uf946\u26d0\u152f\u7543\u1dd1\u50eb\ucf3c\u65b7\u435e\uc8da\u84e0\u8775\uab01\u3d0e\u8f8f\u0843\ud46c\u5a6f\u3849\u9cc0\u14bd\ud30e\ubfea\u8ef7\u179b\ued55\u196d\uf435\uf66b";
        char[] cArray = "\u5cdf\u5cd7\u5ccb\u5cc3\u5cdf\u5cd3\u5ce7".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                n2 = 0;
            }
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                III = stringArray;
                IIl = new Object[stringArray.length];
                int n6 = 1226322604;
                byte[] byArray = " $\u00a1<\u008f\u00d8\u009e\u00e2]/\u0098\u00ef\u00c9\u00afp\u00b9&\u00f1F\u0096\u008ao\u0017s\u00e9Y\u00c5\u00c7U\u00c35\u00a5|\u00cfgJ\u009d\u00e6\u009ee\u00db2\u00e2\u008d(\u0086J@".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                ll = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    Autoclicker.ll[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                break;
            }
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
        }
        Il = new String[7];
        Autoclicker.IIl();
    }

    @Override
    public String II() {
        return ((IIllIlIlI)((Object)this.l.lIl())).toString();
    }

    private static void IIl() {
        Autoclicker.Il[0] = Autoclicker.lII(Autoclicker.IIII(684253213, -727365242).toCharArray(), 79285L, -1732860660);
        Autoclicker.Il[1] = Autoclicker.lII(Autoclicker.IIII(684253212, 779825320).toCharArray(), 65825L, -560061301);
        Autoclicker.Il[2] = Autoclicker.lII(Autoclicker.IIII(684253215, 173885044).toCharArray(), 66556L, 208746702);
        Autoclicker.Il[3] = Autoclicker.lII(Autoclicker.IIII(684253214, -1902036704).toCharArray(), 12839L, 1621043394);
        Autoclicker.Il[4] = Autoclicker.lII(Autoclicker.IIII(684253209, -62624923).toCharArray(), 29963L, 1651444612);
        Autoclicker.Il[5] = Autoclicker.lII(Autoclicker.IIII(684253208, 1461336761).toCharArray(), 78472L, 1574237524);
        Autoclicker.Il[6] = Autoclicker.lII(Autoclicker.IIII(684253211, -2081918238).toCharArray(), 76433L, 1022221458);
    }

    private boolean IlI(MinecraftClient minecraftClient) {
        block1: {
            block2: {
                block0: {
                    if (this.l.lIl() == IIllIlIlI.II) break block0;
                    if (!lIIllllI.lIlI(minecraftClient, lIIllllI.llIlII(minecraftClient))) break block1;
                    break block2;
                }
                lIIllllI.IIIlIlI(minecraftClient);
                lIIllllI.IIllllI(minecraftClient);
                return true;
            }
            return false;
        }
        lIIllllI.llIll(minecraftClient);
        lIIllllI.lIIll(minecraftClient);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lII(char[] cArray, long l2, int n) {
        int n2 = 0x34A767D1 ^ n;
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

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(MinecraftClient minecraftClient) {
        if (minecraftClient != null && this.l(minecraftClient)) {
            if (!this.lI.II()) {
                return;
            }
        } else {
            this.lI();
            return;
        }
        if (!this.IlI(minecraftClient)) return;
        this.lI.I(this.I.IIIl(), this.I.IIII());
    }

    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        this.lIl(minecraftClient);
    }

    public Autoclicker() {
        super(StringFactory.IIII("Autoclicker"), Category.II, StringFactory.IIII("Automatically clicks at a configurable rate."));
    }

    private static int lll(int n, int n2) {
        return ll[n ^ 0x7F21171C] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x28C8E01D;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Autoclicker.IIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x49A5BEC2;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 24 -> 11;
                case 21 -> 110;
                case 26 -> 164;
                case 5 -> 245;
                case 23 -> 198;
                case 17 -> 43;
                case 31 -> 211;
                case 19 -> 218;
                case 16 -> 148;
                case 10 -> 47;
                case 1 -> 114;
                case 11 -> 249;
                case 30 -> 81;
                case 18 -> 119;
                case 7 -> 230;
                case 14 -> 50;
                case 3 -> 140;
                case 6 -> 73;
                case 9 -> 245;
                case 20 -> 117;
                case 2 -> 84;
                case 12 -> 1;
                case 4 -> 218;
                case 15 -> 175;
                case 27 -> 32;
                case 22 -> 145;
                case 29 -> 142;
                case 13 -> 215;
                case 28 -> 44;
                case 25 -> 181;
                default -> 65;
                case 8 -> 76;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

