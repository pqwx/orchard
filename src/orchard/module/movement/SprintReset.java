/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIllll
 * Module         : SprintReset  [MOVEMENT]
 * Description    : Instantly resets sprint after successful hits.   (client's own text)
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Delay
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
 *  net.minecraft.entity.LivingEntity
 */
package orchard.module.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IlIllIl;
import orchard.internal.lIlIIlI;

@Environment(value=EnvType.CLIENT)
public final class SprintReset
extends ModuleBase {
    private final lIlIIlI I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Delay"), 0.0, 0.0, 10.0, 1.0).IIIl("ms"));
    private static String[] l;
    private IlIllIl II = IlIllIl.I;
    private int Il = Integer.MAX_VALUE;
    private long lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    @Override
    public void llll() {
        this.lII();
    }

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0xF877050B ^ n;
        for (int i = 0; i < cArray.length; ++i) {
            n2 = n2 ^ (int)l2 ^ ~i;
            n2 ^= n - i * cArray.length;
            n2 = -n2 * n | i;
            cArray[i] = (char)(cArray[i] ^ n2);
            int n3 = i & 0xFF;
            n = n << n3 | n >>> -n3;
            l2 ^= (long)n3;
        }
        return new String(cArray);
    }

    @Override
    public String II() {
        String string;
        long l2 = this.IlI();
        if (l2 > 0L) {
            String string2 = "ms";
            long l3 = l2;
            string = l3 + string2;
        } else {
            string = "";
        }
        return string;
    }

    private static void IIl() {
        SprintReset.l[0] = SprintReset.lI(SprintReset.IIlI('\u83c9', '\u0272', -148566353).toCharArray(), 29308L, 828017675);
        SprintReset.l[1] = SprintReset.lI("".toCharArray(), 29414L, -2078728539);
        SprintReset.l[2] = SprintReset.lI(SprintReset.IIlI('\u83c8', '\u5add', 165380003).toCharArray(), 65848L, 1735613994);
        SprintReset.l[3] = SprintReset.lI(SprintReset.IIlI('\u83cb', '\ua4f0', 2056350616).toCharArray(), 81098L, -1136567443);
        SprintReset.l[4] = SprintReset.lI(SprintReset.IIlI('\u83ca', '\u099e', 1293907482).toCharArray(), 50525L, 1141510602);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IlIIlI(Entity entity) {
        if (!(entity instanceof LivingEntity)) return;
        LivingEntity livingEntity = (LivingEntity)entity;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (!minecraftClient.player.isSprinting()) return;
        if (livingEntity == minecraftClient.player) return;
        if (!livingEntity.isAlive()) return;
        if (!livingEntity.isRemoved()) {
            this.II = IlIllIl.l;
            this.lI = System.currentTimeMillis() + this.IlI();
            this.Il = Integer.MAX_VALUE;
            return;
        }
    }

    private long IlI() {
        return Math.max(0L, Math.min(10L, Math.round((Double)this.I.lIl())));
    }

    public SprintReset() {
        super(StringFactory.IIII("SprintReset"), Category.ll, StringFactory.IIII("Instantly resets sprint after successful hits."));
    }

    private void lII() {
        this.II = IlIllIl.I;
        this.lI = 0L;
        this.Il = Integer.MAX_VALUE;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIl(MinecraftClient minecraftClient) {
        if (!minecraftClient.options.forwardKey.isPressed()) return false;
        if (minecraftClient.options.backKey.isPressed()) return false;
        if (minecraftClient.player.isSneaking()) return false;
        if (minecraftClient.player.isUsingItem()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lll(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl() || this.II == IlIllIl.I) {
            this.lII();
            return false;
        }
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.options == null || minecraftClient.currentScreen != null || !minecraftClient.player.isAlive()) {
            this.lII();
            return false;
        }
        if (this.II == IlIllIl.l) {
            if (System.currentTimeMillis() < this.lI) {
                return false;
            }
        } else {
            if (minecraftClient.player.age >= this.Il) {
                boolean bl = this.lIl(minecraftClient);
                this.lII();
                if (!bl) return false;
                minecraftClient.player.setSprinting(true);
                return false;
            }
            return false;
        }
        if (minecraftClient.player.isSprinting()) {
            minecraftClient.player.setSprinting(false);
            this.II = IlIllIl.Il;
            this.Il = minecraftClient.player.age + 1;
            return true;
        }
        this.lII();
        return false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block20: {
                block12: {
                    block17: {
                        block19: {
                            block18: {
                                block15: {
                                    block13: {
                                        block16: {
                                            break block16;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var4_12 = 0;
                                                break block12;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            while (true) {
                                                break block13;
                                                break;
                                            }
lbl6:
                                            // 1 sources

                                            while (var13_11 == 0) {
                                                break block14;
                                            }
                                            break block17;
lbl9:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl11:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                SprintReset.l = new String[5];
                                                SprintReset.IIl();
                                                return;
                                            }
lbl17:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            var1_2 = var0_1.length / 4;
                                            break block18;
lbl21:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            SprintReset.ll[var4_12] = var5_13 ^= var2_3;
                                            var3_4 += 4;
                                            if (++var4_12 >= var1_2) {
                                                ** continue;
lbl27:
                                                // 1 sources

                                                while (true) {
                                                    var13_11 = -1;
                                                    break block15;
                                                    break;
                                                }
                                            }
                                            break block12;
                                        }
                                        var6 = 15415;
                                        break block19;
lbl34:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    if (++var10_8 < var8_6.length) break block17;
                                    break block20;
                                }
lbl40:
                                // 2 sources

                                while (true) {
                                    var10_8 = 0;
                                    ** continue;
                                    break;
                                }
                            }
                            SprintReset.ll = new int[var1_2];
                            var3_4 = 0;
                            ** while (true)
                        }
                        var7_5 = "\u18f5\u1379\uffd8\u95a7\uaa52\u2ee3\ud2ac\u1a36\u2639\ua830\u0fff\u912e\uc262\uabf8\u9311\ubb28\u78fb\uf8b4\u3649\u8046\u3bdd\ua4a2\uac92\u37a7\ufd5c\uaa83\uc6ac\u57fb\u2b9e\u7f70\u1997\udcdb\u98fc\u7172\u655c\u1af4\ub0ac\ude13\ud4cd\u96ed\u4b2d\ua90d\u498b\u039b\u28d2\uc641\ue847\u85e0\u503b\u66a6\u910b\u6560\u5055\u37b5\u8fdc\ucc82\u72da\u80d9\u59f2\u55fc\ufc30\u229c\u6f3b\u088a\ucc8a\u2708\u0f56\u9cf9\uf3aa\u8893\u7f4d\uc61f\u47e8\u7d69\u1098\u94c5\u70b4\u635c\ub5df\u79af\ubb47\udb24\u17e8\uc4a8\u0916\ueab6\ucbc1\ua299\uc60f\ufb31\uc28e\uf1b5";
                        var8_6 = "\u3c33\u3c3f\u3c77\u3c27".toCharArray();
                        var9_7 = new String[var8_6.length];
                        ** while (true)
                        var11_9 = 0;
                        var12_10 = 0;
                        ** GOTO lbl6
                    }
                    var12_10 = var8_6[var10_8] ^ var6;
                    ** while (true)
                }
                var5_13 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                ** while (true)
                var9_7[var10_8] = var7_5.substring(var11_9, var11_9 + var12_10);
                var11_9 += var12_10;
                ** while (true)
            }
            var13_11 = 0;
            ** while (true)
        }
        SprintReset.III = var9_7;
        SprintReset.IIl = new Object[var9_7.length];
        ** while (true)
        var2_3 = 792145857;
        var0_1 = "Fz\f\u00d94us\u0004\u0004\u000e\u0012\u0084\u00ca\u0011\u00cec\u00cf\u00cb\u009e,\u00d50\u00f9R\u00a4)\u00ef\u00be\u00a7\u00d9Nn5\u00c9I\u00f0\u009b\u0092\u000e\u008c".getBytes("ISO-8859-1");
        ** while (true)
    }

    private static int IIII(int n, int n2) {
        return ll[n ^ 0x46D555E1] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlI(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x83C9;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            SprintReset.IIl[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5785;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xDDF7;
            n6 += 53923;
            n6 ^= 0xF161;
            cArray[n5] = (char)((n6 += 1919) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

