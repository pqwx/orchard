/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .packet.s2c.play.
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
 *  net.minecraft.network.packet.Packet
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.packet.Packet;

@Environment(value=EnvType.CLIENT)
public final class IIIlIIlll {
    private static final IIIlIIlll I;
    private volatile long l;
    private volatile long II;
    private static String[] Il;
    private volatile long lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    public void I() {
        this.l = 0L;
        this.lI = 0L;
        this.II = 0L;
    }

    public long l() {
        return this.lI;
    }

    public static IIIlIIlll II() {
        return I;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Il(Packet<?> packet) {
        String string = packet.getClass().getName();
        if (!string.contains(".packet.s2c.play.")) {
            return false;
        }
        if (string.endsWith("KeepAliveS2CPacket")) return false;
        if (!string.endsWith("CommonPingS2CPacket")) return true;
        return false;
    }

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0x9D1ACE63 ^ n;
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

    public long ll() {
        return this.II;
    }

    private static void III() {
        IIIlIIlll.Il[0] = IIIlIIlll.lI(IIIlIIlll.lIl(-504119996, -1706028156).toCharArray(), 98688L, 937013218);
        IIIlIIlll.Il[1] = IIIlIIlll.lI(IIIlIIlll.lIl(-504119995, -1791988252).toCharArray(), 92728L, -1470284969);
        IIIlIIlll.Il[2] = IIIlIIlll.lI(IIIlIIlll.lIl(-504119994, 1848142084).toCharArray(), 30372L, 1042092217);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIl(Packet<?> packet) {
        long l2;
        this.lI = l2 = System.currentTimeMillis();
        if (this.l == 0L) {
            this.l = l2;
        }
        if (!this.Il(packet)) return;
        this.II = l2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block33: {
                        block31: {
                            block32: {
                                block30: {
                                    break block30;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl3:
                                    // 1 sources

                                    while (true) {
                                        IIIlIIlll.Il = new String[3];
                                        IIIlIIlll.III();
                                        IIIlIIlll.I = new IIIlIIlll();
                                        return;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        var11_7 += var12_8;
                                        break block27;
                                        break;
                                    }
lbl11:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var1_13 = var0_1.length / 4;
                                    break block31;
lbl15:
                                    // 1 sources

                                    while (true) {
                                        v0 = 20;
                                        break block28;
                                        break;
                                    }
lbl18:
                                    // 1 sources

                                    while (true) {
                                        v0 = 3;
                                        break block28;
                                        break;
                                    }
lbl21:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl23:
                                    // 1 sources

                                    while (true) {
                                        var4_15 = 0;
                                        ** GOTO lbl11
                                        break;
                                    }
lbl26:
                                    // 1 sources

                                    while (true) {
                                        var9_5[var10_6] = new String(var14_10).intern();
                                        ** continue;
                                        break;
                                    }
lbl29:
                                    // 1 sources

                                    while (true) {
                                        var0_1 = "u\u00ce^\u000bFa\u009e\u0014\u00b8\u0017\u00af\u00cb\u00fb:\u00c5\u00ff\u0005ybU".getBytes("ISO-8859-1");
                                        ** continue;
                                        break;
                                    }
lbl32:
                                    // 1 sources

                                    while (true) {
                                        v0 = 3;
                                        break block28;
                                        break;
                                    }
lbl35:
                                    // 1 sources

                                    while (true) {
                                        var13_9 = 0;
                                        break block29;
                                        break;
                                    }
lbl38:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl40:
                                    // 1 sources

                                    while (true) {
                                        var2_2 = -411498771;
                                        ** continue;
                                        break;
                                    }
                                }
                                var6 = 17823;
                                break block32;
                                var9_5 = new String[var8_4.length];
                                var13_9 = -1;
                                break block29;
lbl49:
                                // 1 sources

                                while (true) {
                                    v0 = 26;
                                    break block28;
                                    break;
                                }
lbl52:
                                // 1 sources

                                while (true) {
                                    v0 = 51;
                                    break block28;
                                    break;
                                }
lbl55:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var7_3 = "\u0949\ud3f3\u3cba\u3b40\u8ebb\ud386\u61fc\u5d6c\u2781\uf3fc\u8193\u8def\u3da7\u3b23\u321d\uea20\u625d\uf0d1\u4d8d\ude34\u9e33\u78d6\ucd45\ua6ac\u6a67\u1c85\u2aae\udd18\uf8dc\u9370\u9a46\u67b5\u8e57\u57ed\uc41d\u26fd\u764f\ue5fb\u062b\u26ae\ucc45\ue2f7\uc56e\ube12\u987c\uc2d5\u7a46\u4990\u96f7\u93eb\uc354\ua464\u0b0a\u674a\u9216\udce4\u52e0\u0a35\ub7f9\ua6de\ub2f4\ua825\u8ec3\ue8a2\ubfd6\u0351\uc3a5\ub5e2\u9b49\u7bce\u2820\ucccf\uc507\u426d\ua814\uc22d";
                            var8_4 = "\u0018\u0018\u001c".toCharArray();
                            ** while (true)
                        }
                        IIIlIIlll.ll = new int[var1_13];
                        var3_14 = 0;
                        ** while (true)
                        var5_16 = (var0_1[var3_14] & 255) << 24 | (var0_1[var3_14 + 1] & 255) << 16 | (var0_1[var3_14 + 2] & 255) << 8 | var0_1[var3_14 + 3] & 255;
                        break block33;
lbl67:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl69:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    IIIlIIlll.ll[var4_15] = var5_16 ^= var2_2;
                    var3_14 += 4;
                    if (++var4_15 >= var1_13) ** break;
                    ** while (true)
                    ** while (true)
                    var12_8 = var8_4[var10_6];
                    var14_10 = var7_3.substring(var11_7, var11_7 + var12_8).toCharArray();
                    var15_11 = 0;
                    while (true) {
                        switch (var15_11 % 5) {
                            case 1: {
                                ** continue;
                            }
                            default: {
                                ** continue;
                            }
                            case 2: {
                                ** continue;
                            }
                            case 3: {
                                ** continue;
                            }
                            ** case 4:
lbl91:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
lbl92:
                    // 1 sources

                    while (true) {
                        if (var15_11 < var14_10.length) ** continue;
                        ** continue;
                        break;
                    }
                    v1 = var15_11++;
                    var14_10[v1] = (char)(var14_10[v1] ^ var16_12 ^ var6);
                    ** while (true)
                }
                if (++var10_6 < var8_4.length) ** GOTO lbl69
                ** while (true)
                IIIlIIlll.III = var9_5;
                IIIlIIlll.IIl = new Object[var9_5.length];
                ** while (true)
            }
            var16_12 = v0;
            ** while (true)
            var12_8 = '\u0000';
            if (var13_9 == 0) ** break;
            ** while (true)
            ** while (true)
        }
        var10_6 = 0;
        var11_7 = 0;
        ** while (true)
    }

    public long IlI() {
        return this.l;
    }

    public void Ill() {
        long l2;
        this.l = l2 = System.currentTimeMillis();
        this.lI = l2;
        this.II = l2;
    }

    private static int lII(int n, int n2) {
        return ll[n ^ 0xF970D769] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xE1F3BD44;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIlIIlll.IIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x51C0BA9D;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 16 -> 113;
                case 11 -> 196;
                case 21 -> 242;
                case 10 -> 172;
                case 20 -> 127;
                case 4 -> 130;
                case 5 -> 121;
                case 24 -> 177;
                case 15 -> 125;
                case 28 -> 92;
                case 26 -> 40;
                case 19 -> 203;
                case 2 -> 22;
                case 8 -> 199;
                case 6 -> 9;
                case 25 -> 253;
                case 29 -> 187;
                case 27 -> 227;
                case 30 -> 138;
                case 7 -> 189;
                case 17 -> 227;
                case 18 -> 146;
                case 22 -> 53;
                case 1 -> 12;
                case 9 -> 100;
                case 13 -> 171;
                case 3 -> 36;
                default -> 38;
                case 23 -> 87;
                case 31 -> 196;
                case 14 -> 230;
                case 12 -> 176;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

