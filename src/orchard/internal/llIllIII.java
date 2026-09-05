/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIllIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.gui.Click
 */
package orchard.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.Click;
import orchard.internal.IIIIlIII;
import orchard.internal.IlIIIlllI;
import orchard.internal.IlIllIllI;
import orchard.internal.lllIlIlI;

@Environment(value=EnvType.CLIENT)
final class llIllIII {
    private final List<IlIIIlllI> I;
    private final List<IlIllIllI> l = new ArrayList<IlIllIllI>();

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    boolean I(double d, double d2, double d3, double d4) {
        block3: {
            IlIllIllI ilIllIllI;
            int n;
            block2: {
                n = this.l.size() - 1;
                if (!true) break block2;
                if (n < 0) return false;
                ilIllIllI = this.l.get(n);
                if (ilIllIllI.I != null && ilIllIllI.II(d, d2) && ilIllIllI.I.I(d, d2, d3, d4)) break block3;
            }
            do {
                --n;
                if (n < 0) return false;
                ilIllIllI = this.l.get(n);
            } while (ilIllIllI.I == null || !ilIllIllI.II(d, d2) || !ilIllIllI.I.I(d, d2, d3, d4));
        }
        return true;
    }

    void l() {
        if (!this.I.isEmpty()) {
            this.I.remove(this.I.size() - 1);
        }
    }

    void II(double d, double d2, double d3, double d4, IIIIlIII iIIIlIII) {
        this.Il(d, d2, d3, d4, iIIIlIII, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    void Il(double d, double d2, double d3, double d4, IIIIlIII iIIIlIII, lllIlIlI lllIlIlI2) {
        if (d3 <= 0.0) return;
        if (d4 <= 0.0) {
            return;
        }
        double d5 = d;
        double d6 = d2;
        double d7 = d3;
        double d8 = d4;
        Iterator<IlIIIlllI> iterator = this.I.iterator();
        do {
            if (!iterator.hasNext()) {
                this.l.add(new IlIllIllI(d5, d6, d7, d8, iIIIlIII, lllIlIlI2));
                return;
            }
            IlIIIlllI ilIIIlllI = iterator.next();
            double d9 = Math.max(d5, ilIIIlllI.II);
            double d10 = Math.max(d6, ilIIIlllI.Il);
            double d11 = Math.min(d5 + d7, ilIIIlllI.II + ilIIIlllI.I);
            double d12 = Math.min(d6 + d8, ilIIIlllI.Il + ilIIIlllI.l);
            d5 = d9;
            d6 = d10;
            d7 = d11 - d9;
            d8 = d12 - d10;
            if (d7 <= 0.0) return;
        } while (!(d8 <= 0.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    void lI(double d, double d2, double d3, double d4) {
        if (!(d3 <= 0.0) && !(d4 <= 0.0)) {
            this.I.add(new IlIIIlllI(d, d2, d3, d4));
            return;
        }
        this.I.add(new IlIIIlllI(0.0, 0.0, 0.0, 0.0));
    }

    llIllIII() {
        this.I = new ArrayList<IlIIIlllI>();
    }

    void ll() {
        this.l.clear();
    }

    /*
     * Unable to fully structure code
     */
    boolean III(Click var1_1, boolean var2_2) {
        var3_3 = this.l.size() - 1;
        if (true) ** GOTO lbl8
        while (true) {
            block4: {
                block6: {
                    block7: {
                        block5: {
                            if (!var4_4.II(var1_1.x(), var1_1.y())) break block5;
                            break block6;
lbl6:
                            // 1 sources

                            return true;
lbl8:
                            // 2 sources

                            while (var3_3 >= 0) {
                                break block4;
                            }
                            break block7;
                        }
lbl12:
                        // 3 sources

                        while (true) {
                            --var3_3;
                            ** GOTO lbl8
                            break;
                        }
                    }
                    return false;
                }
                if (!var4_4.lI.I(var1_1, var2_2)) ** GOTO lbl12
                ** continue;
            }
            var4_4 = this.l.get(var3_3);
            if (var4_4.lI != null) ** break;
            ** continue;
        }
    }
}

