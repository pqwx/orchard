/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIllI
 * Module         : StreamerMode  [RENDER]
 * Description    : Moves HUD elements into an external overlay for streaming.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Stream Proof
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
 *  net.minecraft.client.gui.DrawContext
 */
package orchard.module.render;

import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIIIIII;
import orchard.internal.lIllIIlI;
import orchard.internal.llIl;
import orchard.internal.llIll;
import orchard.internal.lllIIlI;
import orchard.module.render.Chinahat;
import orchard.module.render.Glow;

@Environment(value=EnvType.CLIENT)
public final class StreamerMode
extends ModuleBase {
    private final llIll I = this.IIlllIl(new llIll((Object)StringFactory.IIII("Stream Proof"), true));
    private static final String[] l;
    private static final Object[] II;

    @Override
    public void llll() {
        llIl.lll();
    }

    public void I(II iI, Consumer<II> consumer) {
        llIl.lIl(iI, consumer);
    }

    @Override
    public void III() {
        this.lII();
        llIl.II((Boolean)this.I.lIl());
    }

    @Override
    public void ll() {
        this.lII();
        llIl.Ill((Boolean)this.I.lIl());
    }

    public DrawContext lI(DrawContext drawContext) {
        return llIl.IIII(drawContext, 0, 0);
    }

    public DrawContext IIl(DrawContext drawContext, int n, int n2) {
        return llIl.IIII(drawContext, n, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IlI() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (!(minecraftClient.currentScreen instanceof lIllIIlI)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII() {
        lllIIlI lllIIlI2;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        lllIIlI lllIIlI3 = lllIIlI2 = clientEntrypoint == null ? null : clientEntrypoint.IlI();
        if (lllIIlI2 != null) {
            Chinahat chinahat;
            Glow glow = lllIIlI2.IIlIlIl();
            if (glow != null && glow.IIIlIIl()) {
                glow.IIlIIll(false);
            }
            if ((chinahat = lllIIlI2.IllII()) != null && chinahat.IIIlIIl()) {
                chinahat.IIlIIll(false);
            }
        }
        IIIIIIIII.Ill();
        IIIIIIIII.IIl();
        IIIIIIIII.IlI();
    }

    public StreamerMode() {
        super(StringFactory.IIII("StreamerMode"), Category.l, StringFactory.IIII("Moves HUD elements into an external overlay for streaming."));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 28196;
        var1_2 = "\u5f19\u5e46\u5f48\u5f51\u5f12\u5f36\u5f1a\u5f67\u5f40\u5f2e\u5e5a\u5e40\u5f48\u5e27\u5f0b\u5f07\uc1c9\uc1f9\uc1a7\uc180\uc1c7\uc1ec\uc1f4\uc18b\uc1a2\uc1ed\uc1d0\uc1d9\uc184\uc189\uc1da\uc1e7\uc1e0\uc1a7\uc0fc\uc1cc\uc1d2\uc1ee\uc1aa\uc18f\uc1e0\uc1f3\uc1f2\uc18b\uc196\uc09b\uc084\uc1c0\uc1bf\uc1ac\uc1cc\uc1d7\uc1ff\uc195\uc1ad\uc1e2\uc08b\uc093\uc1aa\uc19c\uc1c6\uc1e7\uc1c9\uc1b4\uc18d\uc1c5\uc1f7\uc1fd\uc197\uc1b7\uc1dd\uc1f3\uc1cf\uc1bb\uc1a8\uc1e4\uc08a\uc1ea\uc1ad\uc1a2\uc1c3\uc089\uc1e1\uc198\uc1aa\uc1fc\uc1d5\uc1c6\uc188\uc191\uc1e5\uc1ec\uc1f1\uc1b8\uc0fa\uc097\u8c3b\u8f6c\u8c62\u8c73\u8c28\u8c1c\u8c38\u8c45\u8c7d\u8c1a\u8f33\u8c12\u8c62\u8f0d\u8c1b\u8c28";
        var2_3 = "\u0010P\u0010".toCharArray();
        var3_1 = new String[var2_3.length];
        var7_7 = -1;
        ** GOTO lbl9
        while (true) {
            var7_7 = 0;
lbl9:
            // 2 sources

            var4_4 = 0;
            var5_5 = 0;
            var6_6 = '\u0000';
            if (var7_7 != 0) ** GOTO lbl22
            StreamerMode.l = var3_1;
            StreamerMode.II = new Object[var3_1.length];
            return;
        }
lbl-1000:
        // 1 sources

        {
            block10: {
                v0 = var9_9++;
                var8_8[v0] = (char)(var8_8[v0] ^ var10_10 ^ var0);
                if (var9_9 < var8_8.length) break block10;
                var3_1[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                if (++var4_4 >= var2_3.length) ** continue;
lbl22:
                // 2 sources

                var6_6 = var2_3[var4_4];
                var8_8 = var1_2.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
            }
            switch (var9_9 % 5) {
                default: {
                    v1 = 41;
                    break;
                }
                case 1: {
                    v1 = 51;
                    break;
                }
                case 2: {
                    v1 = 71;
                    break;
                }
                case 3: {
                    v1 = 83;
                    break;
                }
                case 4: {
                    v1 = 62;
                }
            }
            var10_10 = v1;
            ** while (true)
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(int n, int n2, int n3) {
        StackTraceElement[] stackTraceElementArray;
        int n4 = n2 ^ 0x1FB5;
        char[] cArray = l[n4].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])II[n4];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            StreamerMode.II[n4] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n5 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6A0A;
        int n6 = 0;
        do {
            int n7 = n6++;
            int n8 = cArray[n7] + 26564;
            n8 ^= 0x64A3;
            n8 ^= 0xDE21;
            n8 -= 42745;
            n8 += 35204;
            n8 += 4143;
            cArray[n7] = (char)((n8 ^= 0x28C) ^ n5 ^ n3 ^ n >> 16);
        } while (n6 < cArray.length);
        return new String(cArray).intern();
    }
}

