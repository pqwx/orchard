/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIIll
 * Module         : Teams  [PLAYER]
 * Description    : Prevents modules from targeting players that look like teammates.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Armor Color
 *   - Glow Color
 *   - Name Color
 *   - .getBytes(
 *   - dye:
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
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.scoreboard.Team
 *  net.minecraft.text.Text
 *  net.minecraft.text.TextColor
 */
package orchard.module.player;

import java.util.Iterator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class Teams
extends ModuleBase {
    private final llIll I = this.IIlllIl(new llIll((Object)StringFactory.IIII("Armor Color"), true));
    private final llIll l;
    private static final EquipmentSlot[] II;
    private static String[] Il;
    private final llIll lI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Glow Color"), true));
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean I(PlayerEntity playerEntity, PlayerEntity playerEntity2) {
        Team team = playerEntity.getScoreboardTeam();
        Team team2 = playerEntity2.getScoreboardTeam();
        if (team == null) return false;
        if (team2 == null) return false;
        Integer n = this.lI(team);
        Integer n2 = this.lI(team2);
        if (n == null) return false;
        if (!n.equals(n2)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean l(PlayerEntity playerEntity, PlayerEntity playerEntity2) {
        EquipmentSlot[] equipmentSlotArray = II;
        int n = equipmentSlotArray.length;
        int n2 = 0;
        while (n2 < n) {
            EquipmentSlot equipmentSlot = equipmentSlotArray[n2];
            String string = this.lll(playerEntity.getEquippedStack(equipmentSlot));
            if (!string.isEmpty()) {
                String string2 = this.lll(playerEntity2.getEquippedStack(equipmentSlot));
                if (string.equals(string2)) {
                    return true;
                }
            }
            ++n2;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean II(PlayerEntity playerEntity, PlayerEntity playerEntity2) {
        Integer n = this.IlI(playerEntity.getDisplayName());
        Integer n2 = this.IlI(playerEntity2.getDisplayName());
        if (n == null) {
            n = this.lI(playerEntity.getScoreboardTeam());
        }
        if (n2 == null) {
            n2 = this.lI(playerEntity2.getScoreboardTeam());
        }
        if (n == null) return false;
        if (n.equals(n2)) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Integer lI(Team team) {
        if (team == null) return null;
        if (team.getColor() == null) return null;
        Integer n = team.getColor().getColorValue();
        return n;
    }

    private static void IIl() {
        Teams.Il[0] = Teams.llI(Teams.IIlI('\u3de7', '\u9450', -1098764855).toCharArray(), 42019L, -1791906178);
        Teams.Il[1] = Teams.llI(Teams.IIlI('\u3de6', '\uf51b', 1698906285).toCharArray(), 96330L, 926001706);
        Teams.Il[2] = Teams.llI(Teams.IIlI('\u3de5', '\ub924', -207600825).toCharArray(), 62791L, -388672572);
        Teams.Il[3] = Teams.llI(Teams.IIlI('\u3de4', '\u985d', -1536656769).toCharArray(), 12293L, 1677159961);
        Teams.Il[4] = Teams.llI(Teams.IIlI('\u3de3', '\u0d60', -1537777403).toCharArray(), 63594L, -776517193);
        Teams.Il[5] = Teams.llI(Teams.IIlI('\u3de2', '\u1922', -782232020).toCharArray(), 64797L, -1329345869);
        Teams.Il[6] = Teams.llI(Teams.IIlI('\u3de1', '\u4fd8', 732836275).toCharArray(), 29120L, -1115518570);
        Teams.Il[7] = Teams.llI("".toCharArray(), 36107L, 362728082);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            var6 = 28490;
            var7_2 = "\u199d\u1a7c|\u2055\u89a4\u80ba\ud035\u412c\u355d\u3961\u6d69\ubf7d\udaa1\u1fc3\ue19e\u4e5c\ub18a\uefaa\u6218\u321c\u0c6b\u9f7d\ub4ec\u0ccc\uf6c8\u28ee\u5cf5\uefb2\u4a7e\ud31a\u61ea\u48f8\u435d\uceb2\u448a\u050d\ue486\u7106\u8b63\uffc1\uf525\u1a3a\u2a4b\u495a\u8ffb\uf5c5\u8c58\u5c17\ub3aa\ub715\u9465\u10b2\uf9c7\u9ad4\uc756\ucf71\u42cc\u5dd0\u27a4\u0876\u86ea\u635d\u756e\ubd56\ud7f1\uf0bd\uc9ac\u2e55\u2dbd\u5935\u0d56\uc6f4\uda4b\u7c6d\ua7c1\ud94c\u1a0a\uad2d\u4a75\u099d\u56e7\u84a6\u7c37\u87e5\ub545\u1935\u4cf0\ue107\uf29a\u06d0\u2cfe\u3589\ua359\u0521\u15a4\u7e46\ue6ee\u403a\uabd8\u6d61\u29b2\u9456\ubdc4\ubc63\u523f\ub67a\uc564\u55fd\uca22\u65f9\u9de3\u48d0\u37e4\u7868\u82af\ucc7a\u40ad\ued85\u167c\ua549\u87bd\ube11\u4b45\u6083\ud343\u3805\uabd5\u2f82\u7865\u6648\u2959\u1e88\ub188\u98ed\ub484\u6f06\u8fe4\u736d\u97b4\u0130\u79c4\u11a8\u183e\u7584\ub344\u61c6\u9456\u8adb\ue91e\u0a49\ubb7e\uf14a\u7908\u845f\u40d5\u167f";
            var8_3 = "\u0004\bX\u0010\u0010\u0010\b".toCharArray();
            var9_4 = new String[var8_3.length];
            var13_8 = -1;
lbl6:
            // 2 sources

            while (true) {
                var10_5 = 0;
                var11_6 = 0;
                var12_7 = '\u0000';
                if (var13_8 != 0) ** GOTO lbl22
                break block12;
                break;
            }
lbl-1000:
            // 6 sources

            {
                block13: {
                    var16_1 = v0;
                    v1 = var15_10++;
                    var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
                    if (var15_10 >= var14_9.length) {
                        var9_4[var10_5] = new String(var14_9).intern();
                        var11_6 += var12_7;
                        if (++var10_5 >= var8_3.length) {
                            var13_8 = 0;
                            ** continue;
                        } else {
                            ** GOTO lbl22
                        }
                    }
                    break block13;
lbl22:
                    // 3 sources

                    var12_7 = var8_3[var10_5];
                    var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                    var15_10 = 0;
                }
                switch (var15_10 % 6) {
                    case 3: {
                        v0 = 14;
                        continue block8;
                    }
                    case 4: {
                        v0 = 58;
                        continue block8;
                    }
                    case 2: {
                        v0 = 88;
                        continue block8;
                    }
                    case 5: {
                        v0 = 120;
                        continue block8;
                    }
                    default: {
                        v0 = 107;
                        continue block8;
                    }
                    case 1: 
                }
                v0 = 6;
                ** while (true)
            }
        }
        Teams.III = var9_4;
        Teams.IIl = new Object[var9_4.length];
        var2_13 = 444746094;
        var0_11 = "i\u00f8\b\u00e1\u00a6\f+\u00c0\u00e8\u0017\u008f\u0093\u0015t\u0086\u00107\u0097\u00ce\u00aa\u008a\u00ba\u0003\u009fvS\u00d1JC\u00e5\u0088xL\u00b1\u00ce$\b&BSro\u00fd0U\u00b1V\u00ado3\u0086\u00b1u\u00cc7UZ\u00b0\u00d2A\n\u00f5\u0004\u0000".getBytes("ISO-8859-1");
        var1_12 = var0_11.length / 4;
        Teams.ll = new int[var1_12];
        var3_14 = 0;
        var4_15 = 0;
        do {
            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
            Teams.ll[var4_15] = var5_16 ^= var2_13;
            var3_14 += 4;
        } while (++var4_15 < var1_12);
        Teams.Il = new String[8];
        Teams.IIl();
        Teams.II = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
    }

    /*
     * Enabled aggressive block sorting
     */
    private Integer IlI(Text text) {
        Text text2;
        Integer n;
        if (text == null) {
            return null;
        }
        TextColor textColor = text.getStyle().getColor();
        if (textColor != null) {
            return textColor.getRgb();
        }
        Iterator iterator = text.getSiblings().iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((n = this.IlI(text2 = (Text)iterator.next())) == null);
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lII(PlayerEntity playerEntity) {
        if (!this.IIIlIIl()) return false;
        if (playerEntity == null) {
            return false;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (playerEntity == minecraftClient.player) {
            return false;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (((Boolean)this.I.lIl()).booleanValue()) {
            if (this.l((PlayerEntity)clientPlayerEntity, playerEntity)) return true;
        }
        if (((Boolean)this.lI.lIl()).booleanValue()) {
            if (this.I((PlayerEntity)clientPlayerEntity, playerEntity)) return true;
        }
        if ((Boolean)this.l.lIl() == false) return false;
        if (!this.II((PlayerEntity)clientPlayerEntity, playerEntity)) return false;
        return true;
    }

    private Integer lIl(ItemStack itemStack) {
        Object object = itemStack.get(DataComponentTypes.DYED_COLOR);
        if (object == null) {
            return null;
        }
        try {
            Integer n;
            Object object2 = object.getClass().getMethod("rgb", new Class[0]).invoke(object, new Object[0]);
            if (object2 instanceof Number) {
                Number number = (Number)object2;
                n = number.intValue();
            } else {
                n = null;
            }
            return n;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return null;
        }
    }

    public Teams() {
        super(StringFactory.IIII("Teams"), Category.IIl, StringFactory.IIII("Prevents modules from targeting players that look like teammates."));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Name Color"), true));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llI(char[] cArray, long l2, int n) {
        int n2 = 0x5B5D3D93 ^ n;
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
    private String lll(ItemStack itemStack) {
        if (itemStack == null) return "";
        if (!itemStack.isEmpty()) {
            Integer n = this.lIl(itemStack);
            if (n == null) return "";
            Integer n2 = n;
            String string = "dye:";
            return string + n2;
        }
        return "";
    }

    private static int IIII(int n, int n2) {
        return ll[n ^ 0x4A2B4E8C] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlI(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x3DE7;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Teams.IIl[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3EA7;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 15893;
            n6 += 57681;
            n6 -= 24798;
            n6 -= 20564;
            n6 -= 57647;
            cArray[n5] = (char)((n6 ^= 0x3788) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

