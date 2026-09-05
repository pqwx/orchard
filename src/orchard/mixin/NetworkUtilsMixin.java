/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIllll
 * Mixin target   : NetworkUtils
 *
 * Recovered strings in this class:
 *   - download
 *   - INVOKE
 *   - HEAD
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.HashFunction
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.util.NetworkUtils
 *  net.minecraft.util.NetworkUtils$DownloadListener
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Path;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.NetworkUtils;
import orchard.net.PacketInterceptor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={NetworkUtils.class})
public abstract class NetworkUtilsMixin {
    @ModifyArg(method={"download"}, at=@At(value="INVOKE", target="Ljava/net/HttpURLConnection;setInstanceFollowRedirects(Z)V"), index=0)
    private static boolean I(boolean bl) {
        return PacketInterceptor.IlII() ? false : bl;
    }

    @Inject(method={"download"}, at={@At(value="HEAD")})
    private static void l(Path path, URL uRL, Map<String, String> map, HashFunction hashFunction, HashCode hashCode, int n, Proxy proxy, NetworkUtils.DownloadListener downloadListener, CallbackInfoReturnable<Path> callbackInfoReturnable) {
        if (!PacketInterceptor.IlII()) {
            return;
        }
        if (!PacketInterceptor.Il(uRL.toString())) {
            PacketInterceptor.Ill(uRL.toString());
            throw new IllegalArgumentException();
        }
    }
}

