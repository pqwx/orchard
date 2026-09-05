/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlllIII
 * Module         : XCarry  [PLAYER]
 * Description    : Keeps your crafting inventory open server-side for extra storage.   (client's own text)
 *
 * Recovered strings in this class:
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
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 */
package orchard.module.player;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public final class XCarry
extends ModuleBase {
    private boolean I;
    private static String[] l;
    private static final int[] II;
    private static final String[] Il;
    private static final Object[] lI;

    @Override
    public void llll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player != null) {
            if (minecraftClient.getNetworkHandler() != null) {
                this.I = true;
                minecraftClient.getNetworkHandler().sendPacket((Packet)new CloseHandledScreenC2SPacket(minecraftClient.player.playerScreenHandler.syncId));
                return;
            }
        }
        this.I = false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block18: {
                block21: {
                    block15: {
                        block20: {
                            block17: {
                                block14: {
                                    block19: {
                                        block13: {
                                            break block17;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl3:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            XCarry.Il = var9_3;
                                            break block18;
lbl7:
                                            // 1 sources

                                            while (true) {
                                                if (var13_7 == 0) {
                                                    ** continue;
                                                }
                                                break block13;
                                                break;
                                            }
                                            var1_10 = var0_8.length / 4;
                                            break block19;
lbl13:
                                            // 1 sources

                                            while (true) {
                                                break block14;
                                                break;
                                            }
lbl15:
                                            // 1 sources

                                            while (true) {
                                                var4_12 = 0;
                                                break block15;
                                                break;
                                            }
lbl18:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
lbl21:
                                        // 2 sources

                                        while (true) {
                                            var12_6 = var8_2[var10_4] ^ var6;
                                            ** continue;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        while (true) {
                                            var3_11 += 4;
                                            if (++var4_12 < var1_10) break block15;
                                            break block16;
                                            break;
                                        }
                                    }
                                    XCarry.II = new int[var1_10];
                                    var3_11 = 0;
                                    ** while (true)
lbl32:
                                    // 1 sources

                                    while (true) {
                                        var12_6 = 0;
                                        ** continue;
                                        break;
                                    }
                                    var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                                    var11_5 += var12_6;
                                    ** while (true)
lbl38:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                ** while (++var10_4 < var8_2.length)
lbl42:
                                // 1 sources

                                break block20;
                            }
                            var6 = 3800;
                            break block21;
                            var10_4 = 0;
                            var11_5 = 0;
                            ** while (true)
lbl49:
                            // 1 sources

                            while (true) {
                                var13_7 = -1;
                                ** GOTO lbl38
                                break;
                            }
                        }
                        var13_7 = 0;
                        ** while (true)
lbl55:
                        // 1 sources

                        while (true) {
                            XCarry.II[var4_12] = var5_13 ^= var2_9;
                            ** continue;
                            break;
                        }
                    }
                    var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
                    ** while (true)
                }
                var7_1 = "\u477f\ue789\uf10e\u9d5b\u7580\u7502\ua8e1\u0554\u8118\ua352\u46b8\uc25b\u9890\ua776\ub393\uf295\u1e5d\uc533\u7008\u4c80\ud6b1\udcf3\u4015\u969e\u3140\u983f\udf9e\u38ae\u7e65\u1995\ud363\u4a3e\u2511\ua6d8\ua7d4\uf88e\u62d1\u20b4\u1ef6\u62f7\uf36b\ub083\ude9a\u1ff2\u3f7f\uf1cf\u6c65\ucc41\u1460\u633a\ucc0f\u36d1\u2259\u1f15\ua23f\ucd5d\u170c\uf2c4\ueebb\ub480\u3d0b\u03b0\u89bc\u550b\u3be8\u3341\u215e\ua249\u7ced\u246d\ucb53\u6bb6\ua94c\u387d\u7a99\u13de\u7541\u5f16\u2d1c\u54c1\ubabf\u9729\u8ed4\u68b5\u0531\u5373\u8f12\uf994\u0740\ud83f\u755e\u5f0f\ud129\ua6ee\u8915\u395a";
                var8_2 = "\u0ed0\u0e80".toCharArray();
                var9_3 = new String[var8_2.length];
                ** while (true)
            }
            XCarry.lI = new Object[var9_3.length];
            var2_9 = 1022682561;
            var0_8 = "O\u0010\u00d3\u0010\u00ae\u00da\u0093\u00bbrY\u00a8^W\u0097\u00e8\u000e".getBytes("ISO-8859-1");
            ** while (true)
        }
        XCarry.l = new String[2];
        XCarry.lII();
    }

    public XCarry() {
        super(StringFactory.IIII("XCarry"), Category.IIl, StringFactory.IIII("Keeps your crafting inventory open server-side for extra storage."));
    }

    public boolean lI() {
        return this.IIIlIIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIl(CloseHandledScreenC2SPacket closeHandledScreenC2SPacket) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return false;
        if (closeHandledScreenC2SPacket != null) {
            if (closeHandledScreenC2SPacket.getSyncId() != minecraftClient.player.playerScreenHandler.syncId) {
                return false;
            }
            if (!this.I) return this.IIIlIIl();
            this.I = false;
            return false;
        }
        return false;
    }

    public void IlI() {
        this.I = true;
    }

    private static void lII() {
        XCarry.l[0] = XCarry.lIl(XCarry.IIII('\ucb0b', -1495714308, '\u4aed').toCharArray(), 88785L, 1299895910);
        XCarry.l[1] = XCarry.lIl(XCarry.IIII('\ucf7c', -1556189346, '\u4aec').toCharArray(), 48249L, 1758325837);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(char[] cArray, long l2, int n) {
        int n2 = 0xDF48AC2B ^ n;
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

    @Override
    public void ll() {
        this.I = false;
    }

    private static int lll(int n, int n2) {
        return II[n ^ 0xC54F9B05] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIII(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x4AED;
        char[] cArray = Il[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            XCarry.lI[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x693D;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 34188;
            n6 -= 64187;
            n6 ^= 0xBC71;
            n6 -= 49134;
            cArray[n5] = (char)((n6 += 33104) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

