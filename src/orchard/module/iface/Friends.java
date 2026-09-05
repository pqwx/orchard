/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIIlll
 * Module         : Friends  [IFACE]
 * Description    : Keeps selected players out of module targeting.   (client's own text)
 *
 * Recovered strings in this class:
 *   -  : string.trim().replaceAll(
 *   - Middle click friend
 *   - , list) : 
 *   - .getBytes(
 *   - Protect
 *   - friends
 *   - friend
 *   - remove
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
 *  net.minecraft.client.util.InputUtil$Type
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.hit.EntityHitResult
 */
package orchard.module.iface;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.EntityHitResult;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIII;
import orchard.internal.IIIlIIIII;
import orchard.internal.IlIlIlllI;
import orchard.internal.Illllll;
import orchard.internal.lIIIlII;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class Friends
extends ModuleBase {
    private final Illllll I;
    private boolean l;
    private final llIll II = this.IIlllIl(new llIll((Object)StringFactory.IIII("Protect"), true));
    private final llIll Il = this.IIlllIl(new llIll((Object)StringFactory.IIII("Middle click friend"), false));
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Enabled aggressive block sorting
     */
    public boolean I(PlayerEntity playerEntity) {
        if (!this.IIIlIIl()) return false;
        if (playerEntity == null) return false;
        if (playerEntity.getGameProfile() != null) return this.IlII(IlIlIlllI.ll(playerEntity.getGameProfile()));
        return false;
    }

    public List<String> lI() {
        return List.copyOf(this.I.lll());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl() {
        List<String> list = this.lI();
        String string = !list.isEmpty() ? String.join((CharSequence)", ", list) : "-";
        String string2 = ": ";
        String string3 = this.IIllllI();
        lIIIlII.I(string3 + string2 + string);
    }

    @Override
    public void llll() {
        this.l = false;
        IIIIIIIII.IIl();
    }

    @Override
    public void III() {
        IIIIIIIII.IIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlI(String string) {
        String string2;
        String string3;
        String string4 = string3 = string == null ? "" : string.trim().replaceAll("[^A-Za-z0-9_]", "");
        if (string3.length() > 16) {
            string2 = string3.substring(0, 16);
            return string2;
        }
        string2 = string3;
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void lII(String string) {
        String string2 = Friends.IlI(string);
        if (string2.isEmpty() || this.IlII(string2)) {
            return;
        }
        this.I.IlI(string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) {
            this.l = false;
            return;
        }
        boolean bl = lIIllllI.llI(minecraftClient, InputUtil.Type.MOUSE.createFromCode(2));
        boolean bl2 = bl && !this.l;
        this.l = bl;
        if (!bl2) return;
        if ((Boolean)this.Il.lIl() == false) return;
        if (minecraftClient.currentScreen != null) return;
        if (minecraftClient.player == null) return;
        Object object = minecraftClient.crosshairTarget;
        if (!(object instanceof EntityHitResult)) return;
        EntityHitResult entityHitResult = (EntityHitResult)object;
        object = entityHitResult.getEntity();
        if (!(object instanceof PlayerEntity)) return;
        PlayerEntity playerEntity = (PlayerEntity)object;
        if (playerEntity == minecraftClient.player) return;
        if (playerEntity.getGameProfile() == null) {
            return;
        }
        object = Friends.IlI(IlIlIlllI.ll(playerEntity.getGameProfile()));
        if (((String)object).isEmpty()) {
            return;
        }
        if (this.IlII((String)object)) {
            this.lll((String)object);
        } else {
            this.lII((String)object);
        }
        this.IIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public Friends() {
        super(StringFactory.IIII("Friends"), Category.lI, StringFactory.IIII("Keeps selected players out of module targeting."));
        this.I = this.IIlllIl(new Illllll((Object)StringFactory.IIII("Friends"), (Collection<?>)List.of()));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String lIl(String string) {
        if (string == null) {
            return "";
        }
        String string2 = string.trim().toLowerCase(Locale.ROOT);
        return string2;
    }

    private void lll(String string) {
        String string2 = Friends.lIl(string);
        if (!string2.isEmpty()) {
            this.I.llI(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIII(String string) {
        block9: {
            String[] stringArray;
            block11: {
                block12: {
                    block10: {
                        String string2;
                        block8: {
                            block6: {
                                block7: {
                                    block5: {
                                        if (string == null) return false;
                                        if (string.isBlank()) break block5;
                                        string2 = string.trim();
                                        if (string2.startsWith(".")) break block6;
                                        break block7;
                                    }
                                    return false;
                                }
                                if (!string2.startsWith("/")) break block8;
                            }
                            string2 = string2.substring(1).trim();
                        }
                        if ((stringArray = string2.split("\\s+", 3)).length == 0) break block9;
                        String string3 = stringArray[0];
                        if (!(string3.equalsIgnoreCase("friend") || string3.equalsIgnoreCase("friends") || string3.equalsIgnoreCase("f"))) {
                            return false;
                        }
                        if (stringArray.length >= 3 && stringArray[1].equalsIgnoreCase("add")) {
                            this.lII(stringArray[2]);
                            this.IIl();
                            return true;
                        }
                        if (stringArray.length >= 3 && (stringArray[1].equalsIgnoreCase("remove") || stringArray[1].equalsIgnoreCase("del") || stringArray[1].equalsIgnoreCase("delete"))) break block10;
                        if (stringArray.length != 1 && (stringArray.length < 2 || !stringArray[1].equalsIgnoreCase(StringFactory.IIl("lJ1HiA==")))) break block11;
                        break block12;
                    }
                    this.lll(stringArray[2]);
                    this.IIl();
                    return true;
                }
                this.IIl();
                return true;
            }
            if (stringArray.length < 2) return true;
            if (!stringArray[1].equalsIgnoreCase("clear")) return true;
            this.I.IlII(List.of());
            this.IIl();
            return true;
        }
        return false;
    }

    public boolean IIlI(PlayerEntity playerEntity) {
        return ((Boolean)this.II.lIl()).booleanValue() && this.I(playerEntity);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IlII(String string) {
        IIIlIIIII iIIlIIIII;
        String string2 = Friends.lIl(string);
        if (string2.isEmpty()) {
            return false;
        }
        Iterator<IIIlIIIII> iterator = this.I.IIll().iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!(iIIlIIIII = iterator.next()).Il(string2));
        return true;
    }

    private static int IllI(int n, int n2) {
        return lI[n ^ 0xD67CAE87] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block28: {
            block31: {
                block24: {
                    block27: {
                        block30: {
                            block26: {
                                block25: {
                                    block29: {
                                        break block29;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var4_15 = 0;
                                            ** GOTO lbl61
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl6:
                                        // 1 sources

                                        while (true) {
                                            v0 = 3;
                                            break block24;
                                            break;
                                        }
                                    }
                                    var6 = 16467;
                                    var7_5 = "\u48c9\u48ea\u4898\u48e3\uf19b\uf1db\uf1e0\uf1f7\u274b\u2714\u275c\u2727\u5eb0\u5ec9\u5ed8\u5e8e\u5e80\u5ee8\u5ec6\u5e37\u5ea3\u5e41\u5ea5\u5ee0\u5e8d\u5ee8\u5e87\u5e17\u5ee7\u5ecb\u5e4f\u5ec7\u7564\u755d\u753f\u7516\u7510\u7524\u7521\u75f9\u7577\u75aa\u7537\u7558\uf4e9\uf48f\uf4ab\uf4a8\uf49f\uf4bf\uf4a2\uf47d\uf4ff\uf42d\uf4ef\uf48f\uf4de\uf494\uf4e0\uf471\uf4ac\uf49d\uf452\uf4da\uf4b7\uf49e\uf4cd\uf427\uf4db\uf4c1\uf4a9\uf4d7\uf485\uf489\uf435\uf4e6\uf48b\uf48f\uf4f3\uf4c3\uf4b1\uf49b\uf4d6\uf42c\uf4fa\uf43f\uf4d7\uf48c\uf48b\uf4c5\uf495\uf43a\uf4aa\uf4be\uf40f\uf4b0\uf4fd\uf4c1\uf4cd\uf43d\uf490\uf4f7\uf4e7\uf486\uf4f4\uf483\uf443\uf4d2\u9816\u980e\u984a\u9865\u9861\u9841\u9848\u988d\u9801\u98e9\u9842\u982d\ue36b\ue365\ue359\ue32e\ue31d\ue339\ue31e\ue3f3\ue36e\ue392\ue32c\ue30a\ue35e\ue311\ue365\ue3e9\ue33e\ue355\ue3ea\ue377\ue334\ue35e\ue329\ue395\ue35f\ue35f\ue37a\ue323\ua467\ua45e\ua43c\ua415\ua413\ua427\ua422\ua4fa\ua474\ua4a9\ua434\ua45b\ue589\ue5ff\ue5f2\ue5e5\u4be8\u4b8e\u4b93\u4b84\ua2b5\ua2ac\ua2d1\ua2c3\u28ba\u289b\u28f9\u28d0\u28d6\u28e2\u28e7\u283f\ud73f\ud71e\ud77c\ud755\ud753\ud767\ud762\ud7ba\ud734\ud7e9\ud774\ud71b\ud5d5\ud5fc\ud5f1\ud5e6\u23de\u23c9\u2386\u2382\ud067\ud05e\ud03f\ud034\ud00a\ud01d\ud060\ud0e2\uacf9\uacfd\uaca6\uacae\u3976\u3972\u3929\u3921\u391a\u392d\u397e\u39f4\u9a07\u9a01\u9a2d\u9a43\u9a6d\u9a4e\u9a01\u9ae9\u58e8\u5890\u589a\u58b7\u5884\u58b0\u58a1\u5807";
                                    break block30;
                                    while (true) {
                                        break block25;
                                        break;
                                    }
lbl15:
                                    // 1 sources

                                    while (true) {
                                        if (var13_11 != 0) break block26;
                                        ** GOTO lbl87
                                        break;
                                    }
lbl18:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var9_7[var10_8] = new String(var14_12).intern();
                                var11_9 += var12_10;
                                break block31;
                            }
lbl25:
                            // 2 sources

                            while (true) {
                                break block27;
                                break;
                            }
                        }
                        var8_6 = "\u0004\u0004\u0004\u0014\f@\f\u001c\f\u0004\u0004\u0004\b\f\u0004\u0004\b\u0004\b\b\b".toCharArray();
                        ** GOTO lbl89
lbl30:
                        // 1 sources

                        while (true) {
                            var1_2 = var0_1.length / 4;
                            ** continue;
                            break;
                        }
                        Friends.lI = new int[var1_2];
                        var3_4 = 0;
                        ** while (true)
lbl36:
                        // 1 sources

                        return;
lbl38:
                        // 1 sources

                        while (true) {
                            v0 = 94;
                            break block24;
                            break;
                        }
                    }
                    var12_10 = var8_6[var10_8];
                    var14_12 = var7_5.substring(var11_9, var11_9 + var12_10).toCharArray();
                    var15_13 = 0;
                    ** GOTO lbl54
lbl46:
                    // 1 sources

                    while (true) {
                        var0_1 = "d~\u00c9\u0096Di\u000f\u00a0".getBytes("ISO-8859-1");
                        ** continue;
                        break;
                    }
                    var10_8 = 0;
                    var11_9 = 0;
                    if (true) ** GOTO lbl59
                    block18: while (true) {
                        if (var15_13 >= var14_12.length) ** continue;
lbl54:
                        // 2 sources

                        switch (var15_13 % 6) {
                            case 3: {
                                ** continue;
                            }
                            case 1: {
                                ** continue;
                            }
lbl59:
                            // 1 sources

                            var12_10 = '\u0000';
                            ** continue;
lbl61:
                            // 2 sources

                            while (true) {
                                ** GOTO lbl78
                                break;
                            }
                            case 2: {
                                v0 = 31;
                                break block18;
                            }
lbl66:
                            // 1 sources

                            while (true) {
                                var13_11 = 0;
                                ** GOTO lbl18
                                break;
                            }
lbl69:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl71:
                            // 1 sources

                            while (true) {
                                v1 = var15_13++;
                                var14_12[v1] = (char)(var14_12[v1] ^ var16_14 ^ var6);
                                continue block18;
                                break;
                            }
                            Friends.III = new Object[var9_7.length];
                            var2_3 = 710465767;
                            ** continue;
lbl78:
                            // 1 sources

                            var5_16 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                            Friends.lI[var4_15] = var5_16 ^= var2_3;
                            break block28;
                            default: {
                                v0 = 105;
                                break block18;
                            }
                            case 4: {
                                v0 = 123;
                                break block18;
                            }
lbl87:
                            // 1 sources

                            Friends.ll = var9_7;
                            ** continue;
lbl89:
                            // 1 sources

                            var9_7 = new String[var8_6.length];
                            var13_11 = -1;
                            ** continue;
                        }
                        break;
                    }
                }
lbl93:
                // 2 sources

                while (true) {
                    var16_14 = v0;
                    ** continue;
                    break;
                }
            }
            ** while (++var10_8 < var8_6.length)
lbl98:
            // 1 sources

            ** while (true)
            {
                ** case 5:
            }
lbl100:
            // 1 sources

            v0 = 92;
            ** while (true)
        }
        var3_4 += 4;
        ** while (++var4_15 < var1_2)
lbl105:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Illl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x82435048;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Friends.III[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xFF88CA9A;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 17 -> 252;
                case 25 -> 140;
                case 11 -> 248;
                case 4 -> 199;
                case 28 -> 229;
                case 12 -> 186;
                case 29 -> 222;
                case 19 -> 168;
                case 22 -> 172;
                case 8 -> 248;
                case 6 -> 237;
                case 2 -> 187;
                case 5 -> 235;
                case 16 -> 221;
                case 15 -> 117;
                case 31 -> 165;
                case 23 -> 100;
                case 3 -> 176;
                case 9 -> 31;
                case 10 -> 176;
                case 7 -> 50;
                case 26 -> 148;
                case 18 -> 23;
                case 13 -> 217;
                case 14 -> 206;
                case 20 -> 139;
                case 30 -> 84;
                default -> 186;
                case 24 -> 175;
                case 1 -> 173;
                case 21 -> 164;
                case 27 -> 209;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

