/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIlII
 * Module         : FakeLag  [IFACE]
 * Description    : Removed legacy helper   (client's own text)
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
package orchard.module.iface;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.packet.Packet;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public final class FakeLag
extends ModuleBase {
    private static volatile FakeLag I;
    private static final String[] l;
    private static final Object[] II;

    public boolean lI(Packet<?> packet) {
        return false;
    }

    private FakeLag() {
        super(StringFactory.IIII("FakeLag"), Category.lI, StringFactory.IIII("Removed legacy helper"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static FakeLag IIl() {
        FakeLag fakeLag = I;
        if (fakeLag != null) return fakeLag;
        Class<FakeLag> clazz = FakeLag.class;
        synchronized (FakeLag.class) {
            fakeLag = I;
            if (fakeLag != null) return fakeLag;
            I = fakeLag = new FakeLag();
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return fakeLag;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 22196;
        String string = "\u433d\u433b\u435d\u432d\u4338\u435f\u435d\u435e\u435d\u433e\u4388\u4388\ud6f2\ud6f1\ud727\ud70b\ud6fc\ud6f8\ud6aa\ud714\ud717\ud727\ud6ea\ud703\ud725\ud70b\ud6f9\ud70a\ud725\ud71e\ud6f2\ud706\ud6fd\ud6f1\ud6b3\ud70a\ud713\ud71b\ud6fc\ud71d";
        char[] cArray = "\u56b8\u56a8".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        l = stringArray;
        II = new Object[stringArray.length];
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlI(short s, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0xB865;
        char[] cArray = l[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])II[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            FakeLag.II[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7367;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 10961;
            n7 += 54671;
            n7 -= 6517;
            n7 += 1601;
            cArray[n6] = (char)((n7 -= 52403) ^ n4 ^ s ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

