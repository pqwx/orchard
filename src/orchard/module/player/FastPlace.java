/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllllIll
 * Module         : FastPlace  [PLAYER]
 * Description    : Removes the right click item-use delay.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Block Filter
 *   - minecraft:
 *   - .getBytes(
 *   - Blacklist
 *   - settings
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
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.registry.Registries
 */
package orchard.module.player;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IlIlllI;
import orchard.internal.Illllll;
import orchard.internal.lIIllllI;
import orchard.mixin.MinecraftClientMixin2;

@Environment(value=EnvType.CLIENT)
public final class FastPlace
extends ModuleBase {
    private final Illllll I;
    private static final String l;
    private final IIIlIlIIl II = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Delay"), 1.0, 4.0, 1.0, 4.0, 1.0).lII("t"));
    private static String[] Il;
    private static final String lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Enabled aggressive block sorting
     */
    private boolean I(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (!(itemStack.getItem() instanceof BlockItem)) {
            return false;
        }
        List list = (List)this.I.lIl();
        if (list.isEmpty()) {
            return true;
        }
        String string = Registries.ITEM.getId((Object)itemStack.getItem()).toString();
        if (!FastPlace.IlI(string, list)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l(MinecraftClient minecraftClient, boolean bl) {
        if (!this.IIIlIIl()) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (!this.lI(minecraftClient)) {
            return;
        }
        if (lIIllllI.llIlI()) return;
        if (IlIlllI.lIl()) return;
        if (IIlI.IIl(minecraftClient)) {
            return;
        }
        MinecraftClientMixin2 minecraftClientMixin2 = (MinecraftClientMixin2)minecraftClient;
        int n = this.llI();
        if (!bl) {
            if (minecraftClientMixin2.ilovcats$getUseCd() <= n) return;
        }
        minecraftClientMixin2.ilovcats$setUseCd(n);
    }

    public FastPlace() {
        super(StringFactory.IIII("FastPlace"), Category.IIl, StringFactory.IIII("Removes the right click item-use delay."));
        this.I = this.IIlllIl(new Illllll((Object)l, (Collection<?>)List.of()));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient) {
        ItemStack itemStack = minecraftClient.player.getMainHandStack();
        if (itemStack == null) return this.I(minecraftClient.player.getOffHandStack());
        if (!(itemStack.getItem() instanceof BlockItem)) return this.I(minecraftClient.player.getOffHandStack());
        return this.I(itemStack);
    }

    @Override
    public String II() {
        String string;
        int n;
        int n2 = (int)Math.round(this.II.IIIl());
        if (n2 != (n = (int)Math.round(this.II.IIII()))) {
            int n3 = n;
            String string2 = "-";
            int n4 = n2;
            string = n4 + string2 + n3;
        } else {
            string = Integer.toString(n2);
        }
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String IIl(String string) {
        String string2;
        String string3 = string.trim().toLowerCase(Locale.ROOT).replace(' ', '_');
        if (!string3.contains(":")) {
            String string4 = string3;
            String string5 = "minecraft:";
            string2 = string5 + string4;
            return string2;
        }
        string2 = string3;
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IlI(String string2, List<String> list) {
        if (string2 == null) return false;
        if (string2.isBlank()) return false;
        if (list == null) return false;
        if (!list.isEmpty()) {
            String string3 = string2.trim().toLowerCase(Locale.ROOT);
            return list.stream().filter(string -> string != null && !string.isBlank()).map(FastPlace::IIl).anyMatch(string3::equals);
        }
        return false;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 8896;
        var7_2 = "\u960b\u7a0e\u6b28\u67e1\ucd11\u6d08\ua0b1\ua520\uc44b\ubb36\uca5b\ud2d8\uca0d\u1109\u749c\uc595\u6f9b\u787c\uec0d\u4314\u6984\u66b0\u0c9a\u5de0\uc97d\uda11\udace\u735f\u05cc\ua3af\ud2bf\u0ed0\u358e\u6272\u7f21\u3290\ue5ba\uec28\u78e7\ubc1c\u085b\u98d7\u49b5\u946b\u52f3\u3f8b\ubb03\ue199\u5598\uef7a\uee8a\ue907\u5c1b\ua698\u4bd0\u08db\u033f\u872b\ue7a3\ub157\u723c\u584e\u88e8\u6fa9\u04a6\u8204\u0df9\u6717\u793c\u5fc7\uf92c\u90c9\ud1a9\u284a\u0b44\ua93b\u581a\u993f\ubf63\u690b\u2e7f\u326d\uf5b3\uaa19\ub161\ua74c\u3945\u3bae\u59cc\u9ee5\uf57d\u074c\u41b2\u570a\u2491\ucc11\uf642\u08fc\ufca4\ube14\u0ab6\uda7f\ue7a1\u9db5\u7164\ua320\u7c7e\u8ed6\u89d9\ue27a\uc7de\u0ff8\u4048\ue438\ubd6b\u6dcc\u561b\u61e2\ud7aa\u0286\u2529\uced0\ueb09\ubfb6\u5207\u2ce8\u0e73\u0fa6\u63da\u5f6e\u3083\uc504\u8fba\ud230\u6f03\u0ac4\u28f8\u7f75\ua2dd\ud280";
        var8_3 = "\u0010\u00044\b\u0004\f\f\u0004\u0010\f".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl12
        while (true) {
            block11: {
                block10: {
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block10;
                    var13_8 = 0;
lbl12:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = '\u0000';
                    if (var13_8 == 0) break block11;
                }
                var12_7 = var8_3[var10_5];
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl42
            }
            FastPlace.III = var9_4;
            FastPlace.IIl = new Object[var9_4.length];
            var2_13 = 1911972418;
            var0_11 = "\u00ab\u00a2\u00a18Ng\u00df\u00a3v\u00ea\u00ca\u00ddZ2\u00c6\u00ff\u009d\u0017+h8\u00a0\u0081'\u0091\u0082\u00f1!AaH\u0019,\u001a\u00fa\u0083\u00e4\u00d4\u00ce\u00d63.\u0001\u007f\u0010\u008b\u009c\u00af\u0088\u009d\u00ac\u0090\t1\u00a0\u0011\u0000q<r\u0094\u0000\u00d0\u001b\u0099\u0091\u009d\u00fe\u00a5\u00b8\u00d9\n]!\u008b$\u00d6\u00c8\u007f\u00f5\u00eaU\u00069\u000e\u00af\u00b8\u00bd\u00e0\u0011\u00f53\u00bb\u00e5\u00dd\u00e1".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            FastPlace.ll = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                FastPlace.ll[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            FastPlace.Il = new String[10];
            FastPlace.lII();
            FastPlace.l = "Blacklist";
            FastPlace.lI = "Block Filter";
            return;
        }
        while (true) {
            if (var15_10 >= var14_9.length) ** continue;
lbl42:
            // 2 sources

            switch (var15_10 % 6) {
                case 5: {
                    v0 = 86;
                    break;
                }
                case 1: {
                    v0 = 108;
                    break;
                }
                case 2: {
                    v0 = 14;
                    break;
                }
                case 3: {
                    v0 = 40;
                    break;
                }
                default: {
                    v0 = 8;
                    break;
                }
                case 4: {
                    v0 = 69;
                }
            }
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
        }
    }

    private static void lII() {
        FastPlace.Il[0] = FastPlace.IIII(FastPlace.IlII(6628, (short)4280, 1489532580).toCharArray(), 82152L, -889956751);
        FastPlace.Il[1] = FastPlace.IIII(FastPlace.IlII(6629, (short)9223, 2065181229).toCharArray(), 56038L, -594053222);
        FastPlace.Il[2] = FastPlace.IIII(FastPlace.IlII(6630, (short)3665, -1889980858).toCharArray(), 76661L, -1899714440);
        FastPlace.Il[3] = FastPlace.IIII(FastPlace.IlII(6631, (short)28173, -1824055595).toCharArray(), 85515L, -478983214);
        FastPlace.Il[4] = FastPlace.IIII(FastPlace.IlII(6624, (short)9797, 2133407909).toCharArray(), 34361L, -1238870070);
        FastPlace.Il[5] = FastPlace.IIII(FastPlace.IlII(6625, (short)62670, -1622774032).toCharArray(), 51800L, -458607703);
        FastPlace.Il[6] = FastPlace.IIII(FastPlace.IlII(6626, (short)10672, -1058862857).toCharArray(), 3271L, 190456017);
        FastPlace.Il[7] = FastPlace.IIII(FastPlace.IlII(6627, (short)22361, 872819915).toCharArray(), 29159L, -178663864);
        FastPlace.Il[8] = FastPlace.IIII(FastPlace.IlII(6636, (short)43248, -1675855703).toCharArray(), 1374L, -2055898610);
        FastPlace.Il[9] = FastPlace.IIII(FastPlace.IlII(6637, (short)35446, 76422886).toCharArray(), 68323L, 911307654);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIllIl(JsonObject jsonObject) {
        JsonObject jsonObject2;
        if (jsonObject != null && jsonObject.has("settings") && (jsonObject2 = jsonObject.getAsJsonObject("settings")) != null && !jsonObject2.has(l) && jsonObject2.has(lI)) {
            jsonObject2.add(l, jsonObject2.get(lI).deepCopy());
        }
        super.IIllIl(jsonObject);
    }

    private int llI() {
        int n;
        int n2 = Math.max(1, Math.min(4, (int)Math.round(this.II.IIIl())));
        return n2 != (n = Math.max(n2, Math.min(4, (int)Math.round(this.II.IIII())))) ? ThreadLocalRandom.current().nextInt(n2, n + 1) : n2;
    }

    public void lll(MinecraftClient minecraftClient) {
        this.l(minecraftClient, true);
    }

    @Override
    public void III() {
        this.l(MinecraftClient.getInstance(), false);
    }

    private static String IIII(char[] cArray, long l2, int n) {
        int n2 = 0xCDDFE207 ^ n;
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

    private static int IIlI(int n, int n2) {
        return ll[n ^ 0x6CB46957] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlII(int n, short s, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x19E4;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            FastPlace.IIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5FB3;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 26167;
            n7 -= 4481;
            n7 += 37671;
            n7 ^= 0x7E9B;
            n7 -= 16854;
            n7 += 3057;
            n7 ^= 0xA6B9;
            cArray[n6] = (char)((n7 -= 29299) ^ n4 ^ s ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

