/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlllIl
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
 *  net.minecraft.entity.Entity
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import orchard.core.ClientEntrypoint;
import orchard.internal.Ill;
import orchard.module.combat.AutoMace;
import orchard.module.combat.KillAura;

@Environment(value=EnvType.CLIENT)
public final class lIIlllIl {
    private lIIlllIl() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float I(Ill ill, float f) {
        if (ill == Ill.II) {
            AutoMace autoMace = lIIlllIl.lI();
            if (autoMace == null) return 0.0f;
            float f2 = autoMace.IlI(f);
            return f2;
        }
        KillAura killAura = lIIlllIl.ll();
        if (ill != Ill.Il) return 0.0f;
        if (killAura == null) return 0.0f;
        float f3 = killAura.lIl(f);
        return f3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void l(Ill ill, float f, float f2, float f3, float f4) {
        if (ill == Ill.II) {
            AutoMace autoMace = lIIlllIl.lI();
            if (autoMace == null) return;
            autoMace.llIll(f, f2, f3, f4);
            return;
        }
        if (ill != Ill.Il) return;
        KillAura killAura = lIIlllIl.ll();
        if (killAura == null) return;
        killAura.IIIIIl(f, f2, f3, f4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Ill II() {
        Ill ill;
        AutoMace autoMace = lIIlllIl.lI();
        if (autoMace == null || !autoMace.IllII()) {
            KillAura killAura = lIIlllIl.ll();
            if (killAura != null && killAura.IIlIl()) {
                ill = Ill.Il;
                return ill;
            }
        } else {
            return Ill.II;
        }
        ill = Ill.I;
        return ill;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float Il(Ill ill, float f) {
        if (ill == Ill.II) {
            AutoMace autoMace = lIIlllIl.lI();
            if (autoMace == null) {
                return 0.0f;
            }
            float f2 = autoMace.lIII(f);
            return f2;
        }
        KillAura killAura = lIIlllIl.ll();
        if (ill != Ill.Il) return 0.0f;
        if (killAura == null) {
            return 0.0f;
        }
        float f3 = killAura.IIlll(f);
        return f3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static AutoMace lI() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return null;
        if (clientEntrypoint.IlI() == null) return null;
        AutoMace autoMace = clientEntrypoint.IlI().IIIlllI();
        return autoMace;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static KillAura ll() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return null;
        if (clientEntrypoint.IlI() == null) return null;
        KillAura killAura = clientEntrypoint.IlI().llIIIl();
        return killAura;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean III(Ill ill, Entity entity) {
        if (ill == Ill.II) {
            AutoMace autoMace = lIIlllIl.lI();
            if (autoMace == null) return false;
            if (autoMace.IllI(entity)) return true;
            return false;
        }
        if (ill != Ill.Il) return false;
        KillAura killAura = lIIlllIl.ll();
        if (killAura == null) return false;
        if (!killAura.IIIIll(entity)) return false;
        return true;
    }
}

