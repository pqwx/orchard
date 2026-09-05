/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - outbound;inbound
 *   - toString
 *   - hashCode
 *   - equals
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

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public record IlllIIlI(boolean I, boolean l) {
    private final boolean I;
    private final boolean l;
    private static final IlllIIlI II = new IlllIIlI(false, false);

    public boolean I() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlllIIlI.class, "outbound;inbound", "I", "l"}, this, object);
    }

    public boolean l() {
        return !this.I && !this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlllIIlI II(boolean bl, boolean bl2) {
        boolean bl3;
        boolean bl4 = this.I || bl;
        if (!this.l && !bl2) {
            bl3 = false;
            return new IlllIIlI(bl4, bl3);
        }
        bl3 = true;
        return new IlllIIlI(bl4, bl3);
    }

    public boolean Il() {
        return this.I;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlllIIlI.class, "outbound;inbound", "I", "l"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlllIIlI.class, "outbound;inbound", "I", "l"}, this);
    }
}

