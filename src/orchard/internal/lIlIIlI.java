/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIIlI
 * Purpose not identified - name is the original obfuscated one.
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
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIllIl;

@Environment(value=EnvType.CLIENT)
public final class lIlIIlI
extends IIllIl<Double> {
    private double I;
    private final double l;
    private double II;
    private IIIlIIIII Il = StringFactory.lIl("");
    private static final int[] lII;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double I(double d) {
        if (this.l <= 0.0) {
            return d;
        }
        long l2 = Math.round(d / this.l);
        return BigDecimal.valueOf(this.l).multiply(BigDecimal.valueOf(l2)).setScale(this.IlI(), RoundingMode.HALF_UP).doubleValue();
    }

    public double Il() {
        return this.I;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public lIlIIlI(Object object, double d, double d2, double d3, double d4) {
        super(object, Double.valueOf(d));
        this.II = d2;
        this.I = d3;
        this.l = d4;
    }

    public void lI(Double d) {
        double d2 = Math.max(this.II, Math.min(this.I, d));
        super.II(this.I(d2));
    }

    public lIlIIlI(String string, double d, double d2, double d3, double d4) {
        this((Object)string, d, d2, d3, d4);
    }

    public lIlIIlI ll(double d) {
        this.II = d;
        this.lI((Double)this.lIl());
        return this;
    }

    public lIlIIlI IIl(double d) {
        this.I = d;
        this.lI((Double)this.lIl());
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IlI() {
        double d = Math.abs(this.l);
        int n = 0;
        while (n < 6 && Math.abs(d - Math.rint(d)) > 1.0E-6) {
            d *= 10.0;
            ++n;
        }
        return n;
    }

    public double Ill() {
        return this.II;
    }

    public IIIlIIIII lII() {
        return this.Il;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void l(JsonElement jsonElement) {
        if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
            return;
        }
        this.lI(jsonElement.getAsDouble());
    }

    @Override
    public double lIl() {
        return this.l;
    }

    public String llI() {
        return this.Il.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    public lIlIIlI lll(double d, double d2) {
        this.II = d;
        this.I = d2;
        this.lI((Double)this.lIl());
        return this;
    }

    @Override
    public JsonElement III() {
        return new JsonPrimitive((Number)this.lIl());
    }

    /*
     * Enabled aggressive block sorting
     */
    public lIlIIlI IIII(Object object) {
        IIIlIIIII iIIlIIIII;
        if (object instanceof IIIlIIIII) {
            IIIlIIIII iIIlIIIII2 = (IIIlIIIII)object;
            iIIlIIIII = iIIlIIIII2;
        } else {
            iIIlIIIII = StringFactory.lIl(object == null ? "" : object.toString());
        }
        this.Il = iIIlIIIII;
        return this;
    }

    public lIlIIlI IIIl(String string) {
        return this.IIII(string);
    }

    private static int IIlI(int n, int n2) {
        return lII[n ^ 0xA55889F8] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -625165541;
        byte[] byArray = "vZB\u00be".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        lII = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            lIlIIlI.lII[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

