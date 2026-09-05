/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.lIIIlIll
 * Mixin target   : PlayerEntityRenderer
 *
 * Recovered strings in this class:
 *   - ) || string.contains(
 *   - net/minecraft/class_1007
 *   - renderLabelIfPresent
 *   - updateRenderState
 *   - HEAD
 *   - TAIL
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.entity.state.PlayerEntityRenderState
 *  net.minecraft.client.render.state.CameraRenderState
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.PlayerLikeEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.PlayerLikeEntity;
import orchard.core.ClientEntrypoint;
import orchard.internal.IlIlllI;
import orchard.module.render.Nametags;
import orchard.module.render.Rotations;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(targets={"net/minecraft/class_1007"})
public abstract class PlayerEntityRendererMixin {
    private static Integer I(Object object) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Field object2 : PlayerEntityRendererMixin.l(object.getClass())) {
            Class<?> clazz = object2.getType();
            if (clazz != Integer.TYPE && clazz != Integer.class) continue;
            try {
                Integer n;
                object2.setAccessible(true);
                Object object3 = object2.get(object);
                if (!(object3 instanceof Integer) || (n = (Integer)object3) < 0) continue;
                String string = object2.getName().toLowerCase();
                if ((string.equals("id") || string.contains("entityid") || string.contains("entity_id")) && (minecraftClient.world == null || minecraftClient.world.getEntityById(n.intValue()) != null)) {
                    return n;
                }
                arrayList.add(n);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {}
        }
        if (minecraftClient.world != null) {
            for (Integer n : arrayList) {
                if (minecraftClient.world.getEntityById(n.intValue()) == null) continue;
                return n;
            }
        }
        if (!arrayList.isEmpty()) {
            return (Integer)arrayList.get(0);
        }
        return null;
    }

    private static List<Field> l(Class<?> clazz) {
        ArrayList<Field> arrayList = new ArrayList<Field>();
        for (Class<?> clazz2 = clazz; clazz2 != null && clazz2 != Object.class; clazz2 = clazz2.getSuperclass()) {
            Field[] fieldArray;
            for (Field field : fieldArray = clazz2.getDeclaredFields()) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    private static Entity II(PlayerEntityRenderState playerEntityRenderState) {
        if (playerEntityRenderState == null) {
            return null;
        }
        Entity entity = PlayerEntityRendererMixin.ll(playerEntityRenderState);
        if (entity != null) {
            return entity;
        }
        Integer n = PlayerEntityRendererMixin.I(playerEntityRenderState);
        if (n == null) {
            return null;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || minecraftClient.world == null) {
            return null;
        }
        return minecraftClient.world.getEntityById(n.intValue());
    }

    @Inject(method={"renderLabelIfPresent"}, at={@At(value="HEAD")}, cancellable=true, require=0)
    private void Il(PlayerEntityRenderState playerEntityRenderState, MatrixStack matrixStack, OrderedRenderCommandQueue orderedRenderCommandQueue, CameraRenderState cameraRenderState, CallbackInfo callbackInfo) {
        if (!Nametags.lI()) {
            return;
        }
        Entity entity = PlayerEntityRendererMixin.II(playerEntityRenderState);
        if (entity == null || !Nametags.llIl(entity)) {
            return;
        }
        callbackInfo.cancel();
    }

    @Inject(method={"updateRenderState"}, at={@At(value="TAIL")}, require=0)
    private void lI(PlayerLikeEntity playerLikeEntity, PlayerEntityRenderState playerEntityRenderState, float f, CallbackInfo callbackInfo) {
        Rotations rotations;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        Rotations rotations2 = rotations = clientEntrypoint == null || clientEntrypoint.IlI() == null ? null : clientEntrypoint.IlI().llIIII();
        if (minecraftClient == null || playerLikeEntity != minecraftClient.player || rotations == null || !rotations.IIIlIIl()) {
            return;
        }
        IlIlllI.IIIlI(minecraftClient, playerEntityRenderState, f);
    }

    private static Entity ll(Object object) {
        for (Field field : PlayerEntityRendererMixin.l(object.getClass())) {
            if (!Entity.class.isAssignableFrom(field.getType())) continue;
            try {
                field.setAccessible(true);
                Object object2 = field.get(object);
                if (!(object2 instanceof Entity)) continue;
                Entity entity = (Entity)object2;
                return entity;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
            }
        }
        return null;
    }
}

