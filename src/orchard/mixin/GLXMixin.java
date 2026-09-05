/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIllIIll
 * Mixin target   : GLX
 *
 * Recovered strings in this class:
 *   - Skipping Windows OSHI CPU query
 *   - _getCpuInfo
 *   - os.name
 *   - INVOKE
 *   - win
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GLX
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  oshi.hardware.CentralProcessor
 *  oshi.hardware.HardwareAbstractionLayer
 */
package orchard.mixin;

import com.mojang.blaze3d.platform.GLX;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

@Environment(value=EnvType.CLIENT)
@Mixin(value={GLX.class})
public abstract class GLXMixin {
    @Redirect(method={"_getCpuInfo"}, remap=false, require=0, at=@At(value="INVOKE", target="Loshi/hardware/HardwareAbstractionLayer;getProcessor()Loshi/hardware/CentralProcessor;", remap=false))
    private static CentralProcessor I(HardwareAbstractionLayer hardwareAbstractionLayer) {
        String string = System.getProperty("os.name", "").toLowerCase();
        if (string.contains("win")) {
            throw new IllegalStateException("Skipping Windows OSHI CPU query");
        }
        return hardwareAbstractionLayer.getProcessor();
    }
}

