/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - ) : iIIlIIIII, iIIlIIIII2 == null ? StringFactory.lIl(
 *   - ), StringFactory.lIl(string2 == null ? 
 *   - .getBytes(
 *   - disabled
 *   - enabled
 *   - 2A==
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIlIIIl;
import orchard.internal.IIIlIIIII;
import orchard.internal.IlIIlllll;
import orchard.module.hud.Notifications;

@Environment(value=EnvType.CLIENT)
public final class IIlllIIIl {
    private final Deque<IIIIlIIIl> I = new ArrayDeque<IIIIlIIIl>();
    private static final long l = 320L;
    private static final int II = 8;
    private long Il;
    private static final IIlllIIIl lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    public synchronized List<IIIIlIIIl> I() {
        this.l(System.currentTimeMillis());
        return List.copyOf(this.I);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l(long l2) {
        ArrayList<IIIIlIIIl> arrayList = new ArrayList<IIIIlIIIl>();
        Iterator<IIIIlIIIl> iterator = this.I.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (arrayList.isEmpty()) return;
                this.I.removeAll(arrayList);
                return;
            }
            IIIIlIIIl iIIIlIIIl = iterator.next();
            if (iIIIlIIIl.I() + 320L > l2) continue;
            arrayList.add(iIIIlIIIl);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized void II(IlIIlllll ilIIlllll, IIIlIIIII iIIlIIIII, IIIlIIIII iIIlIIIII2, long l2) {
        long l3;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null) {
            Notifications notifications = clientEntrypoint.IlI().II(Notifications.class);
            if (notifications == null) return;
            if (!notifications.IIIlIIl()) {
                return;
            }
        }
        long l4 = System.currentTimeMillis();
        this.l(l4);
        ++this.Il;
        this.I.addFirst(new IIIIlIIIl(l3, ilIIlllll != null ? ilIIlllll : IlIIlllll.III, iIIlIIIII == null ? StringFactory.lIl("") : iIIlIIIII, iIIlIIIII2 == null ? StringFactory.lIl("") : iIIlIIIII2, l4, Math.max(250L, l2)));
        while (this.I.size() > 8) {
            this.I.removeLast();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized void Il(IlIIlllll ilIIlllll, String string, String string2, long l2) {
        this.II(ilIIlllll, StringFactory.lIl(string != null ? string : ""), StringFactory.lIl(string2 == null ? "" : string2), l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized boolean lI() {
        this.l(System.currentTimeMillis());
        if (this.I.isEmpty()) return false;
        return true;
    }

    public static IIlllIIIl ll() {
        return lI;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block18: {
                block19: {
                    block17: {
                        block14: {
                            block16: {
                                break block16;
lbl1:
                                // 1 sources

                                while (true) {
                                    var13_4 = -1;
                                    break block14;
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
                                    continue;
                                    break;
                                }
lbl8:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl12:
                                // 1 sources

                                while (true) {
                                    var3_11 += 4;
                                    if (++var4_12 < var1_10) ** GOTO lbl8
                                    break block15;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var9_3 = new String[var8_2.length];
                                    ** continue;
                                    break;
                                }
lbl21:
                                // 1 sources

                                while (true) {
                                    var8_2 = "\u1cae\u1cbe\u1cb6\u1cb6".toCharArray();
                                    ** continue;
                                    break;
                                }
lbl24:
                                // 1 sources

                                while (true) {
                                    var4_12 = 0;
                                    ** continue;
                                    break;
                                }
                            }
                            var6 = 7354;
                            var7_1 = "\u7f5e\u7f39\u7f1d\u7f92\u7f1c\u7f6b\u7fc8\u7f26\u7fb2\u7feb\u7f90\u7fb8\u7fc1\u7ffe\u7fce\u7fb0\u7fe1\u7f93\u7fda\u7f0e\u2894\u28ae\u28d8\u2872\u8335\u8348\u8368\u83e4\u836a\u8320\u83b9\u8357\u83d0\u8398\u83b1\u83bc\u950e\u9563\u9512\u95c1\u9551\u9521\u95a0\u955d\u95eb\u95b0\u95d0\u9587";
                            ** while (true)
                            var1_10 = var0_5.length / 4;
                            break block17;
                            var11_8 = 0;
                            break block18;
lbl35:
                            // 1 sources

                            while (true) {
                                IIlllIIIl.III = var9_3;
                                ** continue;
                                break;
                            }
lbl38:
                            // 1 sources

                            while (true) {
                                var0_5 = "\u00e7\u008f\u00e2_".getBytes("ISO-8859-1");
                                ** continue;
                                break;
                            }
                            var5_13 = (var0_5[var3_11] & 255) << 24 | (var0_5[var3_11 + 1] & 255) << 16 | (var0_5[var3_11 + 2] & 255) << 8 | var0_5[var3_11 + 3] & 255;
                            IIlllIIIl.ll[var4_12] = var5_13 ^= var2_6;
                            ** while (true)
lbl44:
                            // 2 sources

                            while (true) {
                                var12_9 = var8_2[var10_7] ^ var6;
                                ** continue;
                                break;
                            }
lbl47:
                            // 1 sources

                            while (true) {
                                var13_4 = 0;
                                break block14;
                                break;
                            }
                            var9_3[var10_7] = var7_1.substring(var11_8, var11_8 + var12_9);
                            var11_8 += var12_9;
                            break block19;
                            IIlllIIIl.IIl = new Object[var9_3.length];
                            var2_6 = -1439482390;
                            ** while (true)
                        }
                        var10_7 = 0;
                        ** while (true)
                    }
                    IIlllIIIl.ll = new int[var1_10];
                    var3_11 = 0;
                    ** while (true)
                }
                if (++var10_7 < var8_2.length) ** GOTO lbl44
                ** while (true)
            }
            var12_9 = 0;
            if (var13_4 == 0) ** break;
            ** while (true)
            ** while (true)
        }
        IIlllIIIl.lI = new IIlllIIIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized void III(ModuleBase moduleBase, boolean bl) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return;
        if (moduleBase == null) return;
        if (moduleBase.lllllI()) {
            if (!clientEntrypoint.IlI().IIIIIll().contains(moduleBase)) {
                return;
            }
        } else {
            return;
        }
        Notifications notifications = clientEntrypoint.IlI().II(Notifications.class);
        if (notifications == null) return;
        if (!notifications.IIIlIIl()) {
            return;
        }
        if (!notifications.IlIIl()) {
            return;
        }
        this.II(bl ? IlIIlllll.l : IlIIlllll.Il, StringFactory.IIII("tZtQiRVSECmHDJ5NCg=="), moduleBase.IIIlllI().llIl(StringFactory.IIII("2A==")).llIl(bl ? StringFactory.IIII("enabled") : StringFactory.IIII("disabled")), notifications.lIl());
    }

    public synchronized void IIl() {
        this.I.clear();
    }

    private static int IlI(int n, int n2) {
        return ll[n ^ 0xFF0B2B9F] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String Ill(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x98182C08;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlllIIIl.IIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xE16AFA78;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 31: {
                    n6 = 176;
                    continue block33;
                }
                case 7: {
                    n6 = 248;
                    continue block33;
                }
                case 4: {
                    n6 = 248;
                    continue block33;
                }
                case 22: {
                    n6 = 5;
                    continue block33;
                }
                case 21: {
                    n6 = 222;
                    continue block33;
                }
                case 13: {
                    n6 = 57;
                    continue block33;
                }
                case 2: {
                    n6 = 228;
                    continue block33;
                }
                case 24: {
                    n6 = 93;
                    continue block33;
                }
                case 30: {
                    n6 = 154;
                    continue block33;
                }
                case 23: {
                    n6 = 146;
                    continue block33;
                }
                case 1: {
                    n6 = 238;
                    continue block33;
                }
                case 8: {
                    n6 = 122;
                    continue block33;
                }
                case 12: {
                    n6 = 8;
                    continue block33;
                }
                case 10: {
                    n6 = 112;
                    continue block33;
                }
                case 14: {
                    n6 = 118;
                    continue block33;
                }
                case 5: {
                    n6 = 180;
                    continue block33;
                }
                case 9: {
                    n6 = 37;
                    continue block33;
                }
                case 3: {
                    n6 = 78;
                    continue block33;
                }
                default: {
                    n6 = 167;
                    continue block33;
                }
                case 28: {
                    n6 = 17;
                    continue block33;
                }
                case 16: {
                    n6 = 47;
                    continue block33;
                }
                case 15: {
                    n6 = 115;
                    continue block33;
                }
                case 17: {
                    n6 = 121;
                    continue block33;
                }
                case 18: {
                    n6 = 106;
                    continue block33;
                }
                case 29: {
                    n6 = 72;
                    continue block33;
                }
                case 19: {
                    n6 = 190;
                    continue block33;
                }
                case 20: {
                    n6 = 59;
                    continue block33;
                }
                case 27: {
                    n6 = 28;
                    continue block33;
                }
                case 11: {
                    n6 = 125;
                    continue block33;
                }
                case 6: {
                    n6 = 19;
                    continue block33;
                }
                case 26: {
                    n6 = 196;
                    continue block33;
                }
                case 25: 
            }
            n6 = 164;
        }
    }
}

