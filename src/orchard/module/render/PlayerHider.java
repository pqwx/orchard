/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIll
 * Module         : Player Hider  [RENDER]
 * Description    : Hides all other players from your local view.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Hide Nametags
 *   - Hide Players
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 */
package orchard.module.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class PlayerHider
extends ModuleBase {
    private static volatile PlayerHider I;
    private final llIll l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Hide Players"), true));
    private final llIll II = this.IIlllIl(new llIll((Object)StringFactory.IIII("Hide Nametags"), true));
    private static final String[] Il;
    private static final Object[] lI;

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lI(Entity entity) {
        PlayerHider playerHider = I;
        if (playerHider == null) return false;
        if (!playerHider.IIIlIIl()) return false;
        if ((Boolean)playerHider.l.lIl() == false) return false;
        if (!(entity instanceof PlayerEntity)) return false;
        PlayerEntity playerEntity = (PlayerEntity)entity;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return false;
        if (playerEntity != minecraftClient.player) return true;
        return false;
    }

    public static void IIl() {
        I = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IlI(Entity entity) {
        PlayerHider playerHider = I;
        if (playerHider == null) return false;
        if (!playerHider.IIIlIIl()) return false;
        if ((Boolean)playerHider.II.lIl() == false) return false;
        if (!(entity instanceof PlayerEntity)) return false;
        PlayerEntity playerEntity = (PlayerEntity)entity;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return false;
        if (playerEntity == minecraftClient.player) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public PlayerHider() {
        super(StringFactory.IIII("qJhVhRxFEDSeDJpL"), Category.l, StringFactory.IIII("sJ1QmQoXURCbSJBNB9bM3oiYVYUcRUNckRqQVE/K0YuK1FiTGlZcXIEBmk5B"));
        I = this;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 20693;
        var1_1 = "\uf8e3\uf896\uf839\uf8c9\uf8c7\uf877\uf8bf\uf89b\uf8d4\uf84e\uf888\uf81e\uf84a\uf8f5\uf89d\uf837\ubc1b\ubc6c\ubc9a\ubc34\ubc38\ubc8e\ubc52\ubc7f\ubc3e\ubca2\ubc62\ubce3\ubca7\ubc0f\ubc55\ubccf\ubcc9\ubc31\ubcb3\ubc78\ubc22\ubcc3\ubc01\ubc21\ubc21\ubc40\ubcaf\ubc1c\ubcb1\ubc3f\ubc65\ubcef\ubc4b\ubc60\ubcbc\ubc0f\ubc2d\ubcb5\ubc5a\ubc78\ubc3d\ubc92\ubc7a\ubce5\ubc8d\ubc17\ubc18\ubcee\ubce2\ubc4b\ubcc3\ubc42\ubc2f\ubcde\ubc03\ubc15\ubc52\ubc66\ubca9\ubc06\ua1a8\ua1df\ua129\ua187\ua18b\ua13a\ua1e2\ua1fa\ua180\ua101\ua1a0\ua17d\ua103\ua1af\ua195\ua179\ub074\ub003\ub0f5\ub05b\ub057\ub0e6\ub03e\ub07d\ub051\ub0cd\ub009\ub0bd\ub0d3\ub060\ub04d\ub08b\ub0ac\ub026\ub083\ub067";
        var2_2 = "\u50c5\u50e9\u50c5\u50c1".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        ** GOTO lbl12
        while (true) {
            block13: {
                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                if (++var4_4 < var2_2.length) break block13;
                var7_7 = 0;
lbl12:
                // 2 sources

                var4_4 = 0;
                var5_5 = 0;
                var6_6 = 0;
                if (var7_7 == 0) {
                    PlayerHider.Il = var3_3;
                    PlayerHider.lI = new Object[var3_3.length];
                    return;
                }
            }
            var6_6 = var2_2[var4_4] ^ var0;
            var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
            var9_9 = 0;
            if (true) ** GOTO lbl29
            break;
        }
        block8: while (true) {
            var10_10 = v0;
            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
            if (var9_9 >= var8_8.length) ** continue;
lbl29:
            // 2 sources

            switch (var9_9 % 6) {
                case 1: {
                    v0 = 60;
                    continue block8;
                }
                case 4: {
                    v0 = 81;
                    continue block8;
                }
                case 3: {
                    v0 = 40;
                    continue block8;
                }
                default: {
                    v0 = 127;
                    continue block8;
                }
                case 2: {
                    v0 = 55;
                    continue block8;
                }
                case 5: 
            }
            v0 = 19;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x80F957B5;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            PlayerHider.lI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x269F8D1D;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 13 -> 106;
                case 8 -> 79;
                case 15 -> 186;
                case 12 -> 152;
                case 14 -> 51;
                default -> 4;
                case 29 -> 106;
                case 24 -> 27;
                case 25 -> 54;
                case 27 -> 68;
                case 2 -> 143;
                case 28 -> 161;
                case 4 -> 23;
                case 20 -> 53;
                case 30 -> 71;
                case 11 -> 129;
                case 22 -> 42;
                case 7 -> 8;
                case 9 -> 203;
                case 19 -> 26;
                case 18 -> 189;
                case 31 -> 163;
                case 3 -> 94;
                case 6 -> 81;
                case 21 -> 151;
                case 26 -> 222;
                case 5 -> 223;
                case 17 -> 8;
                case 16 -> 201;
                case 23 -> 120;
                case 10 -> 99;
                case 1 -> 9;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

