/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.III
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
 *  net.minecraft.util.math.MathHelper
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.MathHelper;
import orchard.internal.IlIIlIll;

@Environment(value=EnvType.CLIENT)
final class III
extends IlIIlIll {
    @Override
    float l(float f) {
        return f * f * (3.0f - 2.0f * f);
    }

    @Override
    float I(float f) {
        return MathHelper.sin((double)(this.l(f) * (float)Math.PI));
    }

    private III(String string2) {
    }
}

