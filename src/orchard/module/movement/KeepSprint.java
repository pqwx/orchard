/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllllll
 * Module         : KeepSprint  [MOVEMENT]
 * Description    : Resets sprint after hits so follow-up hits keep momentum.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Sprint Condition
 *   - Velocity Ratio
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
 */
package orchard.module.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlllllI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class KeepSprint
extends ModuleBase {
    private static String[] I;
    private final llIll l;
    private final lIlIIlI II = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Velocity Ratio"), 0.6, 0.6, 1.0, 0.1));
    private final IIIIIIIIl<lIlllllI> Il;
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Enabled aggressive block sorting
     */
    public boolean lI(PlayerEntity playerEntity) {
        if (!this.IIIlIIl()) return false;
        if ((Boolean)this.l.lIl() == false) return false;
        if (!this.IIl(playerEntity)) {
            return false;
        }
        switch (((lIlllllI)((Object)this.Il.lIl())).ordinal()) {
            case 2: {
                boolean bl = playerEntity.isOnGround();
                return bl;
            }
            case 1: {
                if (!playerEntity.isOnGround()) return true;
                return false;
            }
            default: {
                throw new MatchException(null, null);
            }
            case 0: 
        }
        return true;
    }

    public KeepSprint() {
        super(StringFactory.IIII("KeepSprint"), Category.ll, StringFactory.IIII("Resets sprint after hits so follow-up hits keep momentum."));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Sprint"), true));
        this.Il = this.IIlllIl(new IIIIIIIIl<lIlllllI>(StringFactory.IIII("Sprint Condition"), lIlllllI.class, lIlllllI.II));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIl(PlayerEntity playerEntity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (playerEntity == null) return false;
        if (minecraftClient == null) return false;
        if (playerEntity != minecraftClient.player) return false;
        return true;
    }

    public double IlI() {
        return Math.max(0.6, Math.min(1.0, (Double)this.II.lIl()));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lII(char[] cArray, long l2, int n) {
        int n2 = 0xB96AE248 ^ n;
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
     * Unable to fully structure code
     */
    static {
        block36: {
            block30: {
                block38: {
                    block32: {
                        block39: {
                            block35: {
                                block33: {
                                    block37: {
                                        block31: {
                                            block34: {
                                                break block34;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    var11_6 += var12_7;
                                                    break block30;
                                                    break;
                                                }
lbl4:
                                                // 1 sources

                                                while (true) {
                                                    var13_8 = -1;
                                                    break block31;
                                                    break;
                                                }
lbl7:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl9:
                                                // 1 sources

                                                while (true) {
                                                    var9_4[var10_5] = new String(var14_9).intern();
                                                    ** continue;
                                                    break;
                                                }
lbl12:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var6 = 13015;
                                            break block35;
lbl17:
                                            // 1 sources

                                            while (var15_10 >= var14_9.length) {
                                                ** continue;
lbl19:
                                                // 1 sources

                                                ** GOTO lbl9
                                            }
                                            break block36;
                                        }
lbl22:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                                        break block37;
lbl26:
                                        // 1 sources

                                        while (true) {
                                            v0 = 33;
                                            break block32;
                                            break;
                                        }
lbl29:
                                        // 1 sources

                                        while (true) {
                                            if (var13_8 != 0) ** GOTO lbl7
                                            break block33;
                                            break;
                                        }
lbl32:
                                        // 1 sources

                                        while (true) {
                                            v0 = 119;
                                            break block32;
                                            break;
                                        }
lbl35:
                                        // 1 sources

                                        while (true) {
                                            var9_4 = new String[var8_3.length];
                                            ** continue;
                                            break;
                                        }
lbl38:
                                        // 1 sources

                                        while (true) {
                                            v0 = 61;
                                            break block32;
                                            break;
                                        }
lbl41:
                                        // 1 sources

                                        while (true) {
                                            KeepSprint.I = new String[5];
                                            KeepSprint.lIl();
                                            return;
                                        }
lbl45:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        var10_5 = 0;
                                        break block38;
lbl49:
                                        // 1 sources

                                        while (true) {
                                            var1_12 = var0_11.length / 4;
                                            ** continue;
                                            break;
                                        }
lbl52:
                                        // 1 sources

                                        while (true) {
                                            var4_15 = 0;
                                            ** GOTO lbl12
                                            break;
                                        }
lbl55:
                                        // 1 sources

                                        while (true) {
                                            var13_8 = 0;
                                            ** continue;
                                            break;
                                        }
lbl58:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        v1 = var15_10++;
                                        var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                                        ** GOTO lbl17
                                    }
                                    KeepSprint.lI[var4_15] = var5_16 ^= var2_13;
                                    var3_14 += 4;
                                    if (++var4_15 >= var1_12) ** break;
                                    ** while (true)
                                    ** while (true)
                                    var12_7 = var8_3[var10_5] ^ var6;
                                    var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                                    var15_10 = 0;
                                    break block36;
lbl73:
                                    // 1 sources

                                    while (true) {
                                        var0_11 = "y'\u00e2O\u00e0\u0014\u00a4\\$U\u00bd\u00b3b\u00aeh\u00a6\u00fa\u001b\u00ba\u000eK\u009c\u0080\u00f2\u0011\u00a9>\u00a2".getBytes("ISO-8859-1");
                                        ** continue;
                                        break;
                                    }
lbl76:
                                    // 1 sources

                                    while (true) {
                                        v0 = 30;
                                        break block32;
                                        break;
                                    }
                                }
                                KeepSprint.ll = var9_4;
                                break block39;
lbl82:
                                // 1 sources

                                while (true) {
                                    v0 = 106;
                                    break block32;
                                    break;
                                }
                            }
                            var7_2 = "\u3bd2\u7be2\udfaf\u1c91\ub4ac\u78dd\u7191\u9c81\ua329\ufde4\u7d7d\u968a\u5c58\u6d97\u42dc\u9d50\uf9ca\u7692\ufdfe\ua72e\uedc9\u4f6b\u9689\ud8db\u8663\u2154\u445d\u3185\ud80e\u7cfb\u3b86\u86fd\u8180\uf963\u6acf\ubfd3\u8503\u1817\u6d33\u1496\u7d85\u0434\u97db\u9c04\ueeb4\u3524\u8811\u9881\u84ef\u8157\u4d66\u229c\uce4b\uef1a\u919b\u0989\u1ace\ubdba\u01cd\uddbb\u87a0\ua089\u13cc\uef21\u513c\ufce6\uc3b9\u5f22\u8cf7\u034d\u08c3\u488a\u9032\ufe1e\ud495\u453b\u1997\ud112\u4243\ue77a\u471e\u7700\uf9e5\ueb69\ub3d6\ua8c6\ue76d\u5db5\u16fa\ud009G\u8c28\uf9a5\uaae1\udd87\uf3ef\ua802\u7463\uf7b8\ud79d\u6f3e\ud280\uc1e9\uddce\u34ba\ub422\u4b67\u2b0c\u69f7\u8ecd\uc6e0\u0da7\u12f8\u4ad4\u74d8\u3621\u6b33\ub151\u57b8\u9487\uf884\u44db\ua897\u9586\u9c3e\u7117\ua95c\u4f19\u31f4\ub3c2\uc1e4\ucde1\u85ca\u6e98\u16fa\ud772\u036f\u4b6e\u44ab\ue0f6\u7357\u0966\u13bc\ue048";
                            var8_3 = "\u329b\u32c7\u32cf\u32c3\u32df".toCharArray();
                            ** while (true)
                        }
                        KeepSprint.III = new Object[var9_4.length];
                        var2_13 = -1433018140;
                        ** while (true)
                    }
lbl94:
                    // 2 sources

                    while (true) {
                        var16_1 = v0;
                        ** continue;
                        break;
                    }
                }
                var11_6 = 0;
                var12_7 = 0;
                ** while (true)
lbl101:
                // 1 sources

                while (true) {
                    v0 = 109;
                    ** continue;
                    break;
                }
            }
            if (++var10_5 >= var8_3.length) ** break;
            ** while (true)
            ** while (true)
        }
        switch (var15_10 % 6) {
            case 2: {
                ** continue;
            }
            case 1: {
                ** continue;
            }
            case 5: {
                ** continue;
            }
            case 3: {
                ** continue;
            }
            case 4: {
                ** continue;
            }
            ** default:
lbl121:
            // 1 sources

            ** continue;
        }
        KeepSprint.lI = new int[var1_12];
        var3_14 = 0;
        ** while (true)
    }

    private static void lIl() {
        KeepSprint.I[0] = KeepSprint.lII(KeepSprint.IIlI(1789826089, 1667200609).toCharArray(), 33493L, 2036954899);
        KeepSprint.I[1] = KeepSprint.lII(KeepSprint.IIlI(1789826088, -796784573).toCharArray(), 30615L, -465195025);
        KeepSprint.I[2] = KeepSprint.lII(KeepSprint.IIlI(1789826091, 1762284662).toCharArray(), 6527L, -1923676459);
        KeepSprint.I[3] = KeepSprint.lII(KeepSprint.IIlI(1789826090, 1821930370).toCharArray(), 91492L, 1449267323);
        KeepSprint.I[4] = KeepSprint.lII(KeepSprint.IIlI(1789826093, -1462303999).toCharArray(), 77512L, 17167119);
    }

    public boolean lll(PlayerEntity playerEntity) {
        return this.IIIlIIl() && this.IIl(playerEntity);
    }

    private static int IIII(int n, int n2) {
        return lI[n ^ 0x92B3ACB7] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIlI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x6AAE9429;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            KeepSprint.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4C7AD4DB;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 8 -> 229;
                case 22 -> 64;
                case 6 -> 159;
                case 4 -> 89;
                case 26 -> 148;
                case 5 -> 72;
                case 17 -> 67;
                case 19 -> 44;
                case 27 -> 242;
                case 7 -> 152;
                case 15 -> 29;
                case 28 -> 4;
                case 18 -> 81;
                case 20 -> 93;
                case 13 -> 235;
                case 9 -> 210;
                case 11 -> 4;
                case 29 -> 246;
                case 21 -> 7;
                case 2 -> 254;
                case 3 -> 200;
                case 23 -> 111;
                case 16 -> 113;
                default -> 240;
                case 10 -> 131;
                case 12 -> 154;
                case 14 -> 253;
                case 1 -> 254;
                case 25 -> 172;
                case 30 -> 225;
                case 24 -> 98;
                case 31 -> 97;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

