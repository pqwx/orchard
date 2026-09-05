/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIlIIl
 * Module         : Visual Switch  [IFACE]
 * Description    : Visually switches hotbar slots during module actions.   (client's own text)
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
 */
package orchard.module.iface;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIllIIIIl;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
public final class VisualSwitch
extends ModuleBase {
    private int I = -1;
    private int l = -1;
    private static final int[] II;
    private static final String[] Il;
    private static final Object[] lI;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (this.I < 0) return;
        this.lII(minecraftClient.player.age);
    }

    public void lI() {
        this.I = -1;
        this.l = -1;
    }

    @Override
    public boolean IlIlIII() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIl(int n, int n2) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (n < 0) return;
        if (n >= 9) return;
        this.I = n;
        this.l = IIllIIIIl.llI(minecraftClient.player.getInventory());
    }

    public void IlI(int n) {
        this.IIl(n, 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public VisualSwitch() {
        super(StringFactory.IIII("rp1HiRhbEC+AAYtaBw=="), Category.lI, StringFactory.IIII("rp1HiRhbXAXXG4hQG9DWm4vUXJMNVVEO1xuTVhvAnpqNhl2SHhddE5Mdk1xP0t2KkZtaj1c="));
    }

    @Override
    public void llll() {
        this.lI();
    }

    /*
     * Enabled aggressive block sorting
     */
    public int lII(int n) {
        if (!this.IIIlIIl()) {
            return -1;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null && minecraftClient.player != null && this.l >= 0 && IIllIIIIl.llI(minecraftClient.player.getInventory()) != this.l) {
            this.lI();
            return -1;
        }
        if (minecraftClient != null && minecraftClient.player != null && this.I >= 0 && this.I <= 8 && lIIllllI.lll(minecraftClient, this.I)) {
            return this.I;
        }
        this.lI();
        return -1;
    }

    private static int lIl(int n, int n2) {
        return II[n ^ 0xB82B2E76] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 30571;
        var7_2 = "\u091f\u0e9a\u0f82\u093e\u094d\u093f\u0972\u092b\u0921\u0963\u0938\u0949\u0912\u092d\u0922\u0916\u0950\u0958\u0dc9\u0d99\u38aa\u38db\u3a37\u3a2f\u3a88\u3a0a\u3aa3\u3ade\u3aff\u3a80\u3aec\u3a93\u3af9\u3a0b\u3a9f\u3a33\u3aa2\u3a1f\u3adb\u3b8e\u3aff\u3a67\u3aca\u3a14\u3aaf\u3a22\u3aa0\u3882\u3bdd\u3b8d\u3ad7\u38da\u3a37\u3a9f\u38e4\u3a38\u3bb1\u3af8\u3afd\u3a80\u3ac6\u38db\u3af7\u38b5\u3a9f\u3af0\u3b95\u3a2d\u3a2f\u3a9f\u3ae8\u3a97\u3af3\u3bf4\u3a9c\u3ae8\u3abe\u3a37\u3a9f\u3a47\u3be4\u3aa7\u3bce\u3a32\u3a82\u3ad2\u3aa7\u3ac7\u3ad1\u3a50\u3af9\u3a50";
        var8_3 = "\u0014H".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl15
        while (true) {
            block12: {
                block13: {
                    v0 = var15_10++;
                    var14_9[v0] = (char)(var14_9[v0] ^ var16_1 ^ var6);
                    if (var15_10 < var14_9.length) break block12;
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block13;
                    var13_8 = 0;
lbl15:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = '\u0000';
                    if (var13_8 == 0) {
                        VisualSwitch.Il = var9_4;
                        VisualSwitch.lI = new Object[var9_4.length];
                        var2_13 = -1537758633;
                        var0_11 = "H\u00b4\u0086\u00c6oy\u00f8\u00f9".getBytes("ISO-8859-1");
                        var1_12 = var0_11.length / 4;
                        VisualSwitch.II = new int[var1_12];
                        var3_14 = 0;
                        var4_15 = 0;
                        do {
                            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                            VisualSwitch.II[var4_15] = var5_16 ^= var2_13;
                            var3_14 += 4;
                        } while (++var4_15 < var1_12);
                        return;
                    }
                }
                var12_7 = var8_3[var10_5];
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
            }
            switch (var15_10 % 5) {
                case 3: {
                    v1 = 77;
                    break;
                }
                case 1: {
                    v1 = 33;
                    break;
                }
                case 2: {
                    v1 = 122;
                    break;
                }
                default: {
                    v1 = 94;
                    break;
                }
                case 4: {
                    v1 = 29;
                }
            }
            var16_1 = v1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lll(int n, int n2, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0x42A1;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            VisualSwitch.lI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x40CE;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0xAA04;
            n7 -= 34492;
            n7 ^= 0xC125;
            n7 += 40263;
            n7 ^= 0x9B46;
            n7 += 54627;
            n7 ^= 0x5AEB;
            n7 += 23877;
            cArray[n6] = (char)((n7 += 31826) ^ n4 ^ s ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

