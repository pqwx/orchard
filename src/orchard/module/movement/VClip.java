/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlI
 * Module         : VClip  [MOVEMENT]
 * Description    : Clips you vertically through blocks.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Reset Motion
 *   - .getBytes(
 *   - Distance
 *   - blocks
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
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package orchard.module.movement;

import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIllIIIIl;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class VClip
extends ModuleBase {
    private final lIlIIlI I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Distance"), 3.0, -10.0, 10.0, 1.0).IIIl("blocks"));
    private static String[] l;
    private final llIll II = this.IIlllIl(new llIll((Object)StringFactory.IIII("Reset Motion"), true));
    private static final int[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0x98433676 ^ n;
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

    private static void IIl() {
        VClip.l[0] = VClip.lI(VClip.lll((short)20914, '\uc06f', 78473391).toCharArray(), 17914L, 1462518775);
        VClip.l[1] = VClip.lI(VClip.lll((short)7936, '\uc06e', -376162332).toCharArray(), 7748L, 2072805554);
        VClip.l[2] = VClip.lI(VClip.lll((short)11898, '\uc06d', -231781881).toCharArray(), 51357L, -1149323668);
        VClip.l[3] = VClip.lI(VClip.lll((short)36514, '\uc06c', 610095077).toCharArray(), 81144L, -1270875882);
        VClip.l[4] = VClip.lI(VClip.lll((short)7698, '\uc06b', 1338397865).toCharArray(), 11153L, 429271943);
        VClip.l[5] = VClip.lI(VClip.lll((short)21004, '\uc06a', -1189259900).toCharArray(), 67993L, 912415088);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 26116;
        String string = "\u5e39\ua583\u8030\u1950\ua3c1\uba0e\u5bed\u3b84\ue16a\ud83b\u7235\u3432\u3995\u0ab7\u0f54\ubf2e\ucf13\u5520\uc898\ub813\u8c1f\u8045\u17a9\u926f\uf6c3\ucbf5\uf6bb\ube2e\u68a1\u29e6\uc702\ua0c5\ub36e\ubc1b\u57b3\u62a8\u9fd0\u69af\uc0c4\ub0db\u5250\ub222\u7d83\u1f95\ueebc\u26e3\ue55c\ua430\u3803\udcd4\ud064\ud144\u5529\u7340\u7843\u4ddf\ud34b\u76ff\u0e57\uf625\u9259\u7498\ub60d\u80d5\u2ef4\ud2bf\u8738\u4b5d\u1dad\u40d7\u9e9f\u1875\ub1b6\ua43f\u073f\u311b\ua1b8\u963f\u4908\u849d\u812c\u82af\u57fd\u9a44\uaab8\uc164\u7add\u960c\u6cd3\ud96e\u0788\u15a9\ue8d5\u151b\uebb3\uf77b\u97bf\ua190\u5b7e\ue846";
        char[] cArray = "\u660c\u6634\u6614\u6608\u660c\u660c".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                n2 = 0;
            }
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
        }
        lI = stringArray;
        ll = new Object[stringArray.length];
        int n6 = -1960339792;
        byte[] byArray = "\u0000m\u0017Y\u0081\u00db^e9(\u00b9*;M\u0003gb\u00d7K{a*\tQvy\u0019\u0085w\u00d9\u00b5\u00ed\u00ff\u00c8\u0016W".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        Il = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            VClip.Il[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        l = new String[6];
        VClip.IIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity, double d) {
        if (clientPlayerEntity == null) return;
        if (Math.abs(d) < 1.0E-4) {
            return;
        }
        double d2 = clientPlayerEntity.getX();
        double d3 = clientPlayerEntity.getY() + d;
        double d4 = clientPlayerEntity.getZ();
        clientPlayerEntity.setPosition(d2, d3, d4);
        IIllIIIIl.lI(clientPlayerEntity, d2);
        IIllIIIIl.IIlII(clientPlayerEntity, d3);
        IIllIIIIl.IlIl(clientPlayerEntity, d4);
        IIllIIIIl.I(clientPlayerEntity, 0);
        lIIllllI.IIIIl(minecraftClient, d2, d3, d4, clientPlayerEntity.isOnGround());
        if (((Boolean)this.II.lIl()).booleanValue()) {
            clientPlayerEntity.setVelocity(0.0, 0.0, 0.0);
        }
        clientPlayerEntity.fallDistance = 0.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player != null && minecraftClient.world != null && minecraftClient.getNetworkHandler() != null) {
            double d = (Double)this.I.lIl();
            minecraftClient.execute(() -> this.IlI(minecraftClient, minecraftClient.player, d));
            this.IIlIIll(false);
            return;
        }
        this.IIlIIll(false);
    }

    @Override
    public String II() {
        return String.format(Locale.ROOT, "%.1f", this.I.lIl());
    }

    public VClip() {
        super(StringFactory.IIII("VClip"), Category.ll, StringFactory.IIII("Clips you vertically through blocks."));
    }

    private static int lIl(int n, int n2) {
        return Il[n ^ 0x69A1453C] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lll(short s, char c, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xC06F;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            VClip.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7F62;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 28409;
            n6 ^= 0x5AB9;
            n6 ^= 0x7ED7;
            n6 += 26000;
            n6 += 24694;
            n6 ^= 0x546E;
            cArray[n5] = (char)((n6 -= 39496) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

