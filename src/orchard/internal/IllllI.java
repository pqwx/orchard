/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllllI
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
 */
package orchard.internal;

import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class IllllI {
    private static final Robot I = IllllI.I();

    private IllllI() {
    }

    private static Robot I() {
        try {
            return GraphicsEnvironment.isHeadless() ? null : new Robot();
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static Robot l() {
        return I;
    }
}

