/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIllIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Blocked Server
 *   - .getBytes(
 *   - entity
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.client.network.ServerInfo
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.PlainTextContent
 *  net.minecraft.text.Text
 *  net.minecraft.text.TextContent
 */
package orchard.internal;

import com.mojang.authlib.GameProfile;
import java.lang.reflect.Field;
import java.util.List;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.MutableText;
import net.minecraft.text.PlainTextContent;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import orchard.core.ClientEntrypoint;
import orchard.core.StringFactory;
import orchard.internal.IIIIlI;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIllIlIl;
import orchard.internal.IlIlIIll;
import orchard.internal.IlIlIlllI;
import orchard.internal.IlllIllI;
import orchard.internal.lllIIIIl;
import orchard.module.render.FakeClient;

@Environment(value=EnvType.CLIENT)
public final class IIIIllIII {
    private static final List<IIIlIIIII> I;
    private static Field l;
    private static boolean II;
    private static final int[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    /*
     * Enabled aggressive block sorting
     */
    public static Text I(Text text) {
        Text text2;
        if (text == null) {
            return null;
        }
        IIIllIlIl iIIllIlIl = IIIIllIII.IIII(text, true);
        if (!iIIllIlIl.I()) {
            text2 = text;
            return text2;
        }
        text2 = iIIllIlIl.l();
        return text2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void II() {
        if (II) {
            return;
        }
        II = true;
        ClientPlayConnectionEvents.JOIN.register((clientPlayNetworkHandler, packetSender, minecraftClient) -> {
            if (IlllIllI.I()) {
                return;
            }
            ServerInfo serverInfo = clientPlayNetworkHandler.getServerInfo();
            if (serverInfo == null || !lllIIIIl.l(serverInfo.address)) {
                IIIIllIII.Illl(IIIIllIII.lIl());
                return;
            }
            clientPlayNetworkHandler.getConnection().disconnect((Text)Text.literal((String)"Blocked Server"));
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Il(GameProfile gameProfile) {
        if (gameProfile == null) return false;
        if (!IIIIllIII.III(IlIlIlllI.III(gameProfile))) return false;
        return true;
    }

    public static boolean lI(UUID uUID) {
        return IIIIllIII.III(uUID);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block39: {
            block37: {
                block41: {
                    block35: {
                        block34: {
                            block40: {
                                block32: {
                                    block36: {
                                        block33: {
                                            block38: {
                                                break block38;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    var4_15 = 0;
                                                    break block32;
                                                    break;
                                                }
lbl4:
                                                // 1 sources

                                                while (true) {
                                                    var13_11 = 0;
                                                    break block33;
                                                    break;
                                                }
lbl7:
                                                // 1 sources

                                                while (var13_11 == 0) {
                                                    break block34;
                                                }
                                                break block39;
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 94;
                                                    break block35;
                                                    break;
                                                }
lbl13:
                                                // 1 sources

                                                while (true) {
                                                    var3_4 += 4;
                                                    if (++var4_15 < var1_2) break block32;
                                                    break block36;
                                                    break;
                                                }
lbl17:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var6 = 21792;
                                            break block40;
lbl22:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl24:
                                            // 1 sources

                                            while (true) {
                                                v0 = 127;
                                                break block35;
                                                break;
                                            }
lbl27:
                                            // 1 sources

                                            while (true) {
                                                var3_4 = 0;
                                                ** continue;
                                                break;
                                            }
                                        }
lbl31:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl33:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl35:
                                        // 1 sources

                                        while (true) {
                                            var12_10 = 0;
                                            ** GOTO lbl7
                                            break;
                                        }
lbl38:
                                        // 1 sources

                                        while (true) {
                                            v0 = 94;
                                            break block35;
                                            break;
                                        }
lbl41:
                                        // 1 sources

                                        while (true) {
                                            IIIIllIII.Il[var4_15] = var5_16 ^= var2_3;
                                            ** continue;
                                            break;
                                        }
lbl44:
                                        // 1 sources

                                        while (true) {
                                            if (var15_13 < var14_12.length) break block37;
                                            ** continue;
                                            break;
                                        }
lbl47:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl49:
                                        // 1 sources

                                        while (++var10_8 >= var8_6.length) {
                                            ** continue;
lbl51:
                                            // 1 sources

                                            ** GOTO lbl4
                                        }
                                        break block39;
                                    }
                                    IIIIllIII.I = List.of(StringFactory.IIII("o7hBkhhFbQ=="), StringFactory.IIII("o7JRnQ1fVQ6q"), StringFactory.IIII("o7JVngteUyE="));
                                    return;
                                }
                                var5_16 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                                ** while (true)
                                var10_8 = 0;
                                var11_9 = 0;
                                ** while (true)
lbl62:
                                // 1 sources

                                while (true) {
                                    v0 = 109;
                                    break block35;
                                    break;
                                }
                            }
                            var7_5 = "\u2812\u28ab\u2819\u28f8\u289d\u2828\u2887\u28fe\u2846\u289b\u286b\u28e4\u28c1\u288d\u281f\u286a\u2845\u2862\u2842\u2808\u5d71\u5d95\u5d60\u5da1\u5de1\u5d41\u5ddc\u5d92\u5d0b\u5df5\u5d56\u5dcb\uc685\uc661\uc6b6\uc645\uc610\uc68c\uc671\uc646\uc6cb\uc601\uc6a9\uc673\u4e44\u4ea0\u4e77\u4e80\u4ed1\u4e7b\u4ef5\u4e84\u4e09\u4ee8\u4e1b\u4efe\u0c7b\u0cf3\u0c73\u0ca9\u0ced\u0c73\u0c8e\u0c90";
                            break block41;
lbl68:
                            // 1 sources

                            while (true) {
                                ** GOTO lbl49
                                break;
                            }
lbl70:
                            // 1 sources

                            while (true) {
                                v0 = 19;
                                break block35;
                                break;
                            }
lbl73:
                            // 1 sources

                            while (true) {
                                v0 = 85;
                                break block35;
                                break;
                            }
                        }
                        IIIIllIII.lI = var9_7;
                        ** while (true)
lbl79:
                        // 1 sources

                        while (true) {
                            var13_11 = -1;
                            ** continue;
                            break;
                        }
                    }
                    var16_14 = v0;
                    ** while (true)
lbl85:
                    // 1 sources

                    while (true) {
                        IIIIllIII.Il = new int[var1_2];
                        ** continue;
                        break;
                    }
                }
                var8_6 = "\u5534\u552c\u552c\u552c\u5528".toCharArray();
                var9_7 = new String[var8_6.length];
                ** while (true)
                var9_7[var10_8] = new String(var14_12).intern();
                var11_9 += var12_10;
                ** while (true)
                IIIIllIII.ll = new Object[var9_7.length];
                var2_3 = 2064936580;
                ** while (true)
            }
lbl99:
            // 2 sources

            while (true) {
                switch (var15_13 % 6) {
                    default: {
                        ** continue;
                    }
                    case 3: {
                        ** continue;
                    }
                    case 5: {
                        ** continue;
                    }
                    case 2: {
                        ** continue;
                    }
                    case 1: {
                        ** continue;
                    }
                    ** case 4:
lbl112:
                    // 1 sources

                    ** continue;
                }
                break;
            }
lbl113:
            // 1 sources

            while (true) {
                var14_12 = var7_5.substring(var11_9, var11_9 + var12_10).toCharArray();
                var15_13 = 0;
                ** continue;
                break;
            }
            v1 = var15_13++;
            var14_12[v1] = (char)(var14_12[v1] ^ var16_14);
            ** while (true)
        }
        var12_10 = var8_6[var10_8] ^ var6;
        ** while (true)
        var0_1 = "0S\u00fa]\u00cc\u00cc\u001b\u00c7\u000ea\u0095\u008e\u008aj\u007f\u00ac\u00fe\u00cb\u00cf\u0000\u007f\u0096\u00f3:g\u00df_\u00f8f\u00be:K.H\u00a4l\u00df\u00c6\u0084P\u00d6\u00ae9\u00e3".getBytes("ISO-8859-1");
        var1_2 = var0_1.length / 4;
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ll(PlayerEntity playerEntity) {
        if (playerEntity == null) return false;
        if (!IIIIllIII.III(playerEntity.getUuid())) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean III(UUID uUID) {
        if (uUID == null) {
            return false;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) {
            return false;
        }
        if (uUID.equals(minecraftClient.player.getUuid())) {
            return true;
        }
        UUID uUID2 = IlIlIlllI.III(minecraftClient.player.getGameProfile());
        if (uUID2 == null) return false;
        if (!uUID.equals(uUID2)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Text IIl(PlayerEntity playerEntity, Text text) {
        FakeClient fakeClient = IIIIllIII.lIl();
        if (fakeClient == null) return text;
        if (playerEntity == null) return text;
        if (fakeClient.lII(playerEntity)) return IIIIllIII.I(text);
        return text;
    }

    private static UUID IlI(Object object) {
        if (object == null) {
            return null;
        }
        try {
            UUID uUID;
            Object object2;
            if (l == null || l.getDeclaringClass() != object.getClass()) {
                l = object.getClass().getDeclaredField("entity");
                l.setAccessible(true);
            }
            if ((object2 = l.get(object)) instanceof Entity) {
                Entity entity = (Entity)object2;
                uUID = entity.getUuid();
            } else {
                uUID = null;
            }
            return uUID;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String Ill(String var0) {
        block13: {
            block17: {
                block12: {
                    block11: {
                        block16: {
                            block14: {
                                var1_1 = var0;
                                break block14;
lbl3:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            while (true) {
                                var2_2 = false;
                                break block11;
                                break;
                            }
lbl9:
                            // 3 sources

                            while (true) {
                                var1_1 = var1_1.substring(Character.charCount(var6_6));
                                ** GOTO lbl21
                                break;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                if (var6_6 == 8201) ** GOTO lbl9
                                break block12;
                                break;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                block15: {
                                    var1_1 = var1_1.substring(var5_5.length());
                                    break block15;
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var5_5 = var4_4.IIII();
                                        break block13;
                                        break;
                                    }
                                }
                                if (!var1_1.isEmpty()) {
                                    ** continue;
                                }
                                break block12;
                                break;
                            }
                            var6_6 = var1_1.codePointAt(0);
                            if (Character.isWhitespace(var6_6)) ** GOTO lbl9
                            break block16;
lbl28:
                            // 1 sources

                            while (true) {
                                var4_4 = var3_3.next();
                                ** continue;
                                break;
                            }
lbl31:
                            // 1 sources

                            return var1_1;
                        }
                        if (!Character.isSpaceChar(var6_6)) ** break;
                        ** while (true)
                        ** while (true)
                        while (true) {
                            if (var2_2) ** continue;
                            ** continue;
                            break;
                        }
                    }
                    var3_3 = IIIIllIII.I.iterator();
                    break block17;
                }
                var2_2 = true;
            }
lbl46:
            // 2 sources

            while (true) {
                if (!var3_3.hasNext()) ** continue;
                ** continue;
                break;
            }
        }
        ** while (!IIIIllIII.lII((String)var1_1, (String)var5_5))
lbl51:
        // 1 sources

        ** while (true)
    }

    private static boolean lII(String string, String string2) {
        return string.regionMatches(true, 0, string2, 0, string2.length());
    }

    /*
     * Enabled aggressive block sorting
     */
    private static FakeClient lIl() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return null;
        }
        FakeClient fakeClient = clientEntrypoint.IlI().IIIlIII();
        if (fakeClient == null) return null;
        if (!fakeClient.IIIlIIl()) {
            return null;
        }
        FakeClient fakeClient2 = fakeClient;
        return fakeClient2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean llI(UUID uUID) {
        if (!IIIIllIII.IlII(uUID)) return false;
        if (IIIIllIII.lIl() == null) return false;
        return true;
    }

    private IIIIllIII() {
    }

    private static boolean lll(Text text) {
        PlainTextContent plainTextContent;
        TextContent textContent = text.getContent();
        return textContent instanceof PlainTextContent && (plainTextContent = (PlainTextContent)textContent).string().isEmpty();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static IIIllIlIl IIII(Text text, boolean bl) {
        Text text2;
        PlainTextContent plainTextContent;
        boolean bl2;
        boolean bl3;
        TextContent textContent;
        block6: {
            block5: {
                textContent = text.getContent();
                bl3 = false;
                bl2 = bl;
                if (bl2 && IIIIlI.IlIl(text.getStyle())) break block5;
                if (!bl2 || !(textContent instanceof PlainTextContent)) {
                    bl2 = bl2 && IIIIllIII.lll(text);
                    break block6;
                } else {
                    plainTextContent = (PlainTextContent)textContent;
                    IlIlIIll ilIlIIll = IIIIllIII.IIll(plainTextContent.string());
                    if (ilIlIIll.II()) {
                        textContent = PlainTextContent.of((String)ilIlIIll.I());
                        bl3 = true;
                    }
                    bl2 = ilIlIIll.l();
                }
                break block6;
            }
            bl2 = false;
        }
        plainTextContent = MutableText.of((TextContent)textContent).setStyle(text.getStyle());
        for (Text text3 : text.getSiblings()) {
            IIIllIlIl iIIllIlIl = IIIIllIII.IIII(text3, bl2);
            plainTextContent.append(iIIllIlIl.l());
            bl3 |= iIIllIlIl.I();
            bl2 = iIIllIlIl.II();
        }
        if (bl3) {
            text2 = plainTextContent;
            return new IIIllIlIl(text2, bl3, bl2);
        }
        text2 = text;
        return new IIIllIlIl(text2, bl3, bl2);
    }

    public static Text IIIl(PlayerListEntry playerListEntry, Text text) {
        FakeClient fakeClient = IIIIllIII.lIl();
        if (fakeClient != null) {
            if (playerListEntry != null) {
                if (fakeClient.IIl(playerListEntry.getProfile())) {
                    return IIIIllIII.I(text);
                }
            }
        }
        return text;
    }

    public static boolean IIlI(Object object) {
        return IIIIllIII.llI(IIIIllIII.IlI(object));
    }

    /*
     * Unable to fully structure code
     */
    private static IlIlIIll IIll(String var0) {
        block26: {
            block23: {
                block30: {
                    block27: {
                        block25: {
                            block24: {
                                block29: {
                                    block21: {
                                        block22: {
                                            block28: {
                                                if (var0 == null) break block28;
                                                break block29;
lbl3:
                                                // 1 sources

                                                while (true) {
                                                    if (Character.isWhitespace(var5_7)) break block21;
                                                    break block22;
                                                    break;
                                                }
lbl6:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
lbl9:
                                            // 2 sources

                                            return new IlIlIIll("", false, true);
                                        }
                                        if (!Character.isSpaceChar(var5_7)) break block30;
                                    }
lbl14:
                                    // 3 sources

                                    while (true) {
                                        var4_5 = var4_5.substring(Character.charCount(var5_7));
                                        break block23;
                                        break;
                                    }
lbl17:
                                    // 2 sources

                                    return new IlIlIIll(var4_5, var2_2, var4_5.isBlank());
lbl19:
                                    // 1 sources

                                    while (true) {
                                        v0 = true;
                                        break block24;
                                        break;
                                    }
lbl22:
                                    // 1 sources

                                    while (true) {
                                        var2_2 = false;
                                        break block25;
                                        break;
                                    }
lbl25:
                                    // 1 sources

                                    while (true) {
                                        var1_1 += Character.charCount(var3_4);
                                        break block26;
                                        break;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        if (Character.isSpaceChar(var4_6)) ** GOTO lbl6
                                        break block25;
                                        break;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var5_7 = var4_5.codePointAt(0);
                                        ** continue;
                                        break;
                                    }
lbl34:
                                    // 2 sources

                                    while (true) {
                                        if (var4_5.isEmpty()) ** GOTO lbl17
                                        ** continue;
                                        break;
                                    }
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var1_1 = 0;
                                        ** continue;
                                        break;
                                    }
                                    while (true) {
                                        var2_2 = true;
                                        ** continue;
                                        break;
                                    }
lbl43:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                ** while (!var0.isEmpty())
lbl47:
                                // 1 sources

                                ** while (true)
                            }
lbl49:
                            // 2 sources

                            while (true) {
                                var2_2 |= v0;
                                ** GOTO lbl34
                                break;
                            }
lbl52:
                            // 1 sources

                            while (true) {
                                if (IIIIllIII.IllI(var3_4)) ** continue;
                                ** GOTO lbl43
                                break;
                            }
                        }
lbl56:
                        // 2 sources

                        while (true) {
                            if (var1_1 < var0.length()) ** break;
                            ** continue;
                            break block27;
                            break;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            if (var5_7 == 160) ** GOTO lbl14
                            ** continue;
                            break;
                        }
                    }
                    var3_4 = var0.codePointAt(var1_1);
                    ** while (true)
                    var2_2 = true;
                    var1_1 += Character.charCount(var4_6);
                    break block26;
                }
                if (var5_7 != 8201) ** break;
                ** while (true)
                ** while (true)
lbl73:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
                while (true) {
                    v0 = false;
                    ** continue;
                    break;
                }
            }
            var2_2 = true;
            ** while (true)
        }
        ** while (var1_1 >= var0.length())
lbl83:
        // 1 sources

        ** while (true)
        var4_6 = var0.codePointAt(var1_1);
        if (!Character.isWhitespace(var4_6)) ** break;
        ** while (true)
        ** while (true)
lbl88:
        // 1 sources

        while (true) {
            if (var4_5.equals(var3_3)) ** continue;
            ** continue;
            break;
        }
        var3_3 = var0.substring(var1_1);
        var4_5 = IIIIllIII.Ill(var3_3);
        ** while (true)
    }

    private static boolean IlII(UUID uUID) {
        return IIIIllIII.III(uUID);
    }

    static void IlIl() {
        l = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IllI(int n) {
        if (n == 57600) return true;
        if (n == 57856) return true;
        if (n >= 57857) {
            if (n <= 57864) return true;
        }
        if (n >= 58112) {
            if (n <= 58122) return true;
        }
        if (n < 57344) return false;
        if (n <= 63743) return true;
        return false;
    }

    public static void Illl(FakeClient fakeClient) {
    }

    public static Text lIII(Object object, Text text) {
        FakeClient fakeClient = IIIIllIII.lIl();
        if (fakeClient != null && fakeClient.lI(IIIIllIII.IlI(object))) {
            return IIIIllIII.I(text);
        }
        return text;
    }

    private static int lIIl(int n, int n2) {
        return Il[n ^ 0xE619047] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIlI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x87B4FB1;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIllIII.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x60DE77D5;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 22 -> 14;
                case 16 -> 49;
                case 28 -> 129;
                case 19 -> 68;
                case 3 -> 135;
                case 6 -> 241;
                case 26 -> 82;
                case 29 -> 90;
                case 24 -> 25;
                default -> 91;
                case 15 -> 39;
                case 4 -> 196;
                case 30 -> 116;
                case 17 -> 45;
                case 31 -> 206;
                case 2 -> 126;
                case 13 -> 165;
                case 10 -> 37;
                case 20 -> 32;
                case 27 -> 51;
                case 21 -> 95;
                case 8 -> 31;
                case 7 -> 220;
                case 23 -> 125;
                case 18 -> 59;
                case 9 -> 192;
                case 14 -> 33;
                case 1 -> 170;
                case 5 -> 108;
                case 25 -> 151;
                case 11 -> 179;
                case 12 -> 185;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

