/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Xylone_
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.text.Text
 */
package orchard.internal;

import com.mojang.authlib.GameProfile;
import java.lang.reflect.Field;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import orchard.core.ClientEntrypoint;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IlIlIlllI;
import orchard.module.render.FakeClient;

@Environment(value=EnvType.CLIENT)
public final class IllIIlll {
    private static Field I;
    private static final IIIlIIIII l;
    private static final String[] II;
    private static final Object[] Il;

    /*
     * Enabled aggressive block sorting
     */
    public static Text I(PlayerEntity playerEntity, Text text) {
        if (playerEntity == null) {
            return text;
        }
        if (!IllIIlll.IIl(playerEntity)) return IllIIlll.lIl(playerEntity.getGameProfile(), text);
        return text;
    }

    public static Text l(PlayerListEntry playerListEntry, Text text) {
        if (playerListEntry != null) {
            if (!IllIIlll.llI(playerListEntry.getProfile())) {
                return IllIIlll.lIl(playerListEntry.getProfile(), text);
            }
            return text;
        }
        return text;
    }

    static void II() {
        I = null;
    }

    public static Text Il(Object object, Text text) {
        if (object == null) {
            return text;
        }
        try {
            Object object2;
            if (I == null || I.getDeclaringClass() != object.getClass()) {
                I = object.getClass().getDeclaredField("entity");
                I.setAccessible(true);
            }
            if ((object2 = I.get(object)) instanceof PlayerEntity) {
                PlayerEntity playerEntity = (PlayerEntity)object2;
                if (IllIIlll.IIl(playerEntity)) {
                    return text;
                }
                return IllIIlll.lIl(playerEntity.getGameProfile(), text);
            }
            return text;
        }
        catch (Exception exception) {
            return text;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lI(UUID uUID) {
        PlayerEntity playerEntity;
        Object object;
        if (uUID == null) {
            return false;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player != null && IllIIlll.IlI(uUID, (PlayerEntity)minecraftClient.player) && IllIIlll.III(minecraftClient.player.getGameProfile())) {
            return true;
        }
        if (minecraftClient.getNetworkHandler() != null && (object = minecraftClient.getNetworkHandler().getPlayerListEntry(uUID)) != null && IllIIlll.III(object.getProfile())) {
            return true;
        }
        if (minecraftClient.world == null) {
            return false;
        }
        object = minecraftClient.world.getPlayers().iterator();
        do {
            if (!object.hasNext()) return false;
        } while (!IllIIlll.IlI(uUID, playerEntity = (PlayerEntity)object.next()) || !IllIIlll.III(playerEntity.getGameProfile()));
        return true;
    }

    public static boolean ll(Object object) {
        if (object == null) {
            return false;
        }
        try {
            PlayerEntity playerEntity;
            Object object2;
            if (I == null || I.getDeclaringClass() != object.getClass()) {
                I = object.getClass().getDeclaredField("entity");
                I.setAccessible(true);
            }
            return (object2 = I.get(object)) instanceof PlayerEntity && IllIIlll.III((playerEntity = (PlayerEntity)object2).getGameProfile());
        }
        catch (Exception exception) {
            return false;
        }
    }

    private static boolean III(GameProfile gameProfile) {
        if (gameProfile == null) {
            return false;
        }
        String string = IlIlIlllI.ll(gameProfile);
        return l.Il(string);
    }

    private IllIIlll() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIl(PlayerEntity playerEntity) {
        if (playerEntity == null) return false;
        if (!IllIIlll.lII()) return false;
        if (!IllIIlll.IlI(playerEntity.getUuid(), playerEntity)) return false;
        if (!IllIIlll.Ill(playerEntity)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IlI(UUID uUID, PlayerEntity playerEntity) {
        if (playerEntity == null) {
            return false;
        }
        if (uUID.equals(playerEntity.getUuid())) {
            return true;
        }
        UUID uUID2 = IlIlIlllI.III(playerEntity.getGameProfile());
        if (uUID2 == null) return false;
        if (!uUID.equals(uUID2)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean Ill(PlayerEntity playerEntity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return false;
        if (!IllIIlll.IlI(playerEntity.getUuid(), (PlayerEntity)minecraftClient.player)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lII() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return false;
        }
        FakeClient fakeClient = clientEntrypoint.IlI().IIIlIII();
        if (fakeClient == null) return false;
        if (!fakeClient.IIIlIIl()) return false;
        return true;
    }

    public static Text lIl(GameProfile gameProfile, Text text) {
        return text;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block10: {
                block13: {
                    block11: {
                        break block13;
lbl1:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl3:
                        // 1 sources

                        while (true) {
                            if (++var4_4 < var2_2.length) break block10;
                            break block11;
                            break;
                        }
lbl6:
                        // 1 sources

                        while (true) {
                            continue;
lbl8:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                            var3_3 = new String[var2_2.length];
                            var7_7 = -1;
                            ** GOTO lbl8
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            IllIIlll.II = var3_3;
                            ** continue;
                            break;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            var5_5 += var6_6;
                            break block12;
                            break;
                        }
                        IllIIlll.Il = new Object[var3_3.length];
                        IllIIlll.l = StringFactory.IIII("Xylone_");
                        return;
lbl24:
                        // 1 sources

                        while (true) {
                            var2_2 = "\u2c58\u2c58\u2c5c".toCharArray();
                            ** continue;
                            break;
                        }
                        var4_4 = 0;
                        var5_5 = 0;
                        ** while (true)
lbl30:
                        // 1 sources

                        while (true) {
                            var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                            ** continue;
                            break;
                        }
                        var6_6 = 0;
                        if (var7_7 == 0) {
                            ** continue;
                        }
                        break block10;
                    }
                    var7_7 = 0;
                    ** while (true)
                }
                var0 = 11344;
                var1_1 = "\u6f6a\u6fd9\u6f7a\u6f24\u6f97\u6fd8\u6f78\u6f49\u013d\u018e\u012d\u0173\u01c0\u018f\u012f\u011e\ua339\ua398\ua369\ua36e\ua3c2\ua3a3\ua37f\ua307\ua392\ua393\ua36e\ua33a";
                ** while (true)
            }
            var6_6 = var2_2[var4_4] ^ var0;
            ** while (true)
        }
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean llI(GameProfile gameProfile) {
        if (gameProfile == null) return false;
        if (!IllIIlll.lII()) {
            return false;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return false;
        UUID uUID = IlIlIlllI.III(gameProfile);
        if (uUID == null) return false;
        if (IllIIlll.IlI(uUID, (PlayerEntity)minecraftClient.player)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x4B9E3F99;
        char[] cArray = II[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IllIIlll.Il[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xA9813B99;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 4 -> 61;
                case 8 -> 100;
                case 6 -> 143;
                case 12 -> 128;
                case 28 -> 205;
                case 22 -> 144;
                case 10 -> 199;
                case 11 -> 147;
                case 18 -> 239;
                case 25 -> 186;
                case 23 -> 13;
                case 16 -> 217;
                case 9 -> 112;
                case 31 -> 164;
                case 5 -> 79;
                case 26 -> 115;
                case 7 -> 192;
                case 19 -> 144;
                case 2 -> 204;
                default -> 194;
                case 3 -> 163;
                case 27 -> 152;
                case 1 -> 69;
                case 24 -> 245;
                case 17 -> 53;
                case 21 -> 167;
                case 29 -> 53;
                case 15 -> 244;
                case 13 -> 54;
                case 14 -> 136;
                case 20 -> 195;
                case 30 -> 226;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

