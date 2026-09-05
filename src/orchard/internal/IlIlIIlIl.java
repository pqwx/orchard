/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
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
 *  net.minecraft.client.util.InputUtil$Key
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.util.InputUtil;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.internal.IIlllIll;
import orchard.internal.lIIllII;

@Environment(value=EnvType.CLIENT)
final class IlIlIIlIl
extends Record {
    private final boolean I;
    private final IIlllIll l;
    private final ModuleBase II;
    private final lIIllII Il;
    private final String lI;
    private final ClientEntrypoint ll;

    public boolean I() {
        return this.I;
    }

    static IlIlIIlIl l(ModuleBase moduleBase) {
        return new IlIlIIlIl(moduleBase, null, false, null, null, null);
    }

    static IlIlIIlIl II(IIlllIll iIlllIll, String string) {
        return new IlIlIIlIl(null, null, false, null, iIlllIll, string);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIlIIlIl.class, "module;setting;q2cfa68f0;runtime;inventoryPresets;presetId", "II", "Il", "I", "ll", "l", "lI"}, this);
    }

    public IIlllIll Il() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIlIIlIl.class, "module;setting;q2cfa68f0;runtime;inventoryPresets;presetId", "II", "Il", "I", "ll", "l", "lI"}, this, object);
    }

    private IlIlIIlIl(ModuleBase moduleBase, lIIllII lIIllII2, boolean bl, ClientEntrypoint clientEntrypoint, IIlllIll iIlllIll, String string) {
        this.II = moduleBase;
        this.Il = lIIllII2;
        this.I = bl;
        this.ll = clientEntrypoint;
        this.l = iIlllIll;
        this.lI = string;
    }

    public ClientEntrypoint lI() {
        return this.ll;
    }

    public ModuleBase ll() {
        return this.II;
    }

    static IlIlIIlIl III(ClientEntrypoint clientEntrypoint) {
        return new IlIlIIlIl(null, null, true, clientEntrypoint, null, null);
    }

    public lIIllII IIl() {
        return this.Il;
    }

    void IlI(InputUtil.Key key) {
        if (this.I && this.ll != null) {
            this.ll.IIl().llIII(key);
            return;
        }
        if (this.II != null) {
            this.II.IIIIIll(key);
            return;
        }
        if (this.Il != null) {
            this.Il.Il(key);
            return;
        }
        if (this.l != null) {
            try {
                this.l.lIIl(this.lI, key);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    static IlIlIIlIl Ill(lIIllII lIIllII2) {
        return new IlIlIIlIl(null, lIIllII2, false, null, null, null);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIlIIlIl.class, "module;setting;q2cfa68f0;runtime;inventoryPresets;presetId", "II", "Il", "I", "ll", "l", "lI"}, this);
    }

    public String lII() {
        return this.lI;
    }
}

