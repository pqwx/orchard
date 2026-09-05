/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.lllllll
 * Mixin target   : ClientPlayerEntity
 *
 * Recovered strings in this class:
 *   - lastPitchClient
 *   - lastYawClient
 *   - lastSprinting
 *   - lastZClient
 *   - lastYClient
 *   - lastXClient
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.network.ClientPlayerEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ClientPlayerEntity.class})
public interface ClientPlayerEntityMixin2 {
    @Accessor(value="lastPitchClient")
    public void virel$setLastPitchClient(float var1);

    @Accessor(value="lastZClient")
    public double virel$getLastZClient();

    @Accessor(value="lastYawClient")
    public float virel$getLastYawClient();

    @Accessor(value="lastYClient")
    public double virel$getLastYClient();

    @Accessor(value="lastXClient")
    public void virel$setLastXClient(double var1);

    @Accessor(value="lastSprinting")
    public void virel$setLastSprinting(boolean var1);

    @Accessor(value="ticksSinceLastPositionPacketSent")
    public void virel$setTicksSinceLastPositionPacketSent(int var1);

    @Accessor(value="lastPitchClient")
    public float virel$getLastPitchClient();

    @Accessor(value="lastYClient")
    public void virel$setLastYClient(double var1);

    @Accessor(value="lastSprinting")
    public boolean virel$getLastSprinting();

    @Accessor(value="lastXClient")
    public double virel$getLastXClient();

    @Accessor(value="lastZClient")
    public void virel$setLastZClient(double var1);

    @Accessor(value="ticksSinceLastPositionPacketSent")
    public int virel$getTicksSinceLastPositionPacketSent();

    @Accessor(value="lastYawClient")
    public void virel$setLastYawClient(float var1);
}

