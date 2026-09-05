/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIIllIll
 * Mixin target   : SystemDetails
 *
 * Recovered strings in this class:
 *   - Unavailable (hardware probe skipped)
 *   - Number of physical packages
 *   - Number of physical CPUs
 *   - Number of logical CPUs
 *   - Processor Vendor
 *   - Frequency (GHz)
 *   - Processor Name
 *   - Microarchitecture
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.util.SystemDetails
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  oshi.SystemInfo
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.SystemDetails;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oshi.SystemInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={SystemDetails.class})
public abstract class SystemDetailsMixin {
    @Inject(method={"addHardwareGroup"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(SystemInfo systemInfo, CallbackInfo callbackInfo) {
        String string = System.getProperty("os.name", "").toLowerCase();
        if (!string.contains("win")) {
            return;
        }
        this.addSection("Processor Vendor", "Unavailable (hardware probe skipped)");
        this.addSection("Processor Name", "Unavailable (hardware probe skipped)");
        this.addSection("Identifier", "Unavailable (hardware probe skipped)");
        this.addSection("Microarchitecture", "Unavailable (hardware probe skipped)");
        this.addSection("Frequency (GHz)", "Unavailable (hardware probe skipped)");
        this.addSection("Number of physical packages", "Unavailable (hardware probe skipped)");
        this.addSection("Number of physical CPUs", "Unavailable (hardware probe skipped)");
        this.addSection("Number of logical CPUs", "Unavailable (hardware probe skipped)");
        callbackInfo.cancel();
    }

    @Shadow
    public abstract void addSection(String var1, String var2);
}

