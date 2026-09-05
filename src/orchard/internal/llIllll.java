/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIllll
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
final class llIllll
extends IlIIlIll {
    @Override
    float I(float f) {
        return MathHelper.sin((double)(MathHelper.sqrt((float)f) * (float)Math.PI));
    }

    private llIllll(String string2) {
    }
}

