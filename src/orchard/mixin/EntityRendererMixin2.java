/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.llllIlI
 * Mixin target   : EntityRenderer
 *
 * Recovered strings in this class:
 *   - ) || string.contains(
 *   - renderLabelIfPresent
 *   - INVOKE
 *   - HEAD
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
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.render.RenderLayers
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.command.RenderCommandQueue
 *  net.minecraft.client.render.entity.EntityRenderer
 *  net.minecraft.client.render.entity.state.EntityRenderState
 *  net.minecraft.client.render.state.CameraRenderState
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.StringVisitable
 *  net.minecraft.text.Text
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.command.RenderCommandQueue;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.MutableText;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import orchard.internal.IIIII;
import orchard.internal.IIlIllIII;
import orchard.internal.IIlllIIII;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={EntityRenderer.class})
public abstract class EntityRendererMixin2<S extends EntityRenderState> {
    private static List<Field> I(Class<?> clazz) {
        ArrayList<Field> arrayList = new ArrayList<Field>();
        for (Class<?> clazz2 = clazz; clazz2 != null && clazz2 != Object.class; clazz2 = clazz2.getSuperclass()) {
            Field[] fieldArray;
            for (Field field : fieldArray = clazz2.getDeclaredFields()) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    private void l(OrderedRenderCommandQueue orderedRenderCommandQueue, MatrixStack matrixStack, Vec3d vec3d, int n, int n2, CameraRenderState cameraRenderState, Text text, IIlllIIII iIlllIIII) {
        TextRenderer textRenderer = this.getTextRenderer();
        if (orderedRenderCommandQueue == null || matrixStack == null || cameraRenderState == null || textRenderer == null || text == null || iIlllIIII == null) {
            return;
        }
        int n3 = textRenderer.getWidth((StringVisitable)text);
        float f = (float)(-n3) / 2.0f;
        float f2 = n;
        Objects.requireNonNull(textRenderer);
        float f3 = f2 + (9.0f - iIlllIIII.Ill()) / 2.0f;
        float f4 = iIlllIIII.IlI();
        float f5 = iIlllIIII.Ill();
        matrixStack.push();
        matrixStack.translate(vec3d.x, vec3d.y + 0.5, vec3d.z);
        matrixStack.multiply((Quaternionfc)cameraRenderState.orientation);
        matrixStack.scale(0.025f, -0.025f, 0.025f);
        orderedRenderCommandQueue.submitCustom(matrixStack, RenderLayers.entityTranslucent((Identifier)iIlllIIII.l()), (entry, vertexConsumer) -> this.lI(vertexConsumer, entry, f, f3, f4, f5, n2));
        matrixStack.pop();
    }

    @Shadow
    public abstract TextRenderer getTextRenderer();

    private static Entity II(Object object) {
        for (Field field : EntityRendererMixin2.I(object.getClass())) {
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

    private void lI(VertexConsumer vertexConsumer, MatrixStack.Entry entry, float f, float f2, float f3, float f4, int n) {
        vertexConsumer.vertex(entry, f, f2 + f4, 0.0f).texture(0.0f, 1.0f).color(-1).light(n);
        vertexConsumer.vertex(entry, f + f3, f2 + f4, 0.0f).texture(1.0f, 1.0f).color(-1).light(n);
        vertexConsumer.vertex(entry, f + f3, f2, 0.0f).texture(1.0f, 0.0f).color(-1).light(n);
        vertexConsumer.vertex(entry, f, f2, 0.0f).texture(0.0f, 0.0f).color(-1).light(n);
    }

    private static Integer ll(Object object) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Field object2 : EntityRendererMixin2.I(object.getClass())) {
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

    @Inject(method={"renderLabelIfPresent"}, at={@At(value="HEAD")})
    private void III(S s, MatrixStack matrixStack, OrderedRenderCommandQueue orderedRenderCommandQueue, CameraRenderState cameraRenderState, CallbackInfo callbackInfo) {
        ((EntityRenderState)s).displayName = this.IIl(s, ((EntityRenderState)s).displayName);
    }

    private Text IIl(S s, Text text) {
        if (text == null) {
            return null;
        }
        boolean bl = IIlIllIII.II();
        boolean bl2 = IIIII.lIII();
        if (!bl && !bl2) {
            return text;
        }
        Text text2 = text;
        if (bl) {
            Text text3;
            Entity entity = EntityRendererMixin2.Ill(s);
            if (entity instanceof PlayerEntity) {
                PlayerEntity playerEntity = (PlayerEntity)entity;
                text3 = IIlIllIII.III(playerEntity.getGameProfile(), text);
            } else {
                text3 = IIlIllIII.ll(text);
            }
            text2 = text3;
        }
        return bl2 ? IIIII.IllI(text2) : text2;
    }

    private Text IlI(Text text, int n) {
        TextRenderer textRenderer = this.getTextRenderer();
        if (text == null || textRenderer == null || n <= 0) {
            return text;
        }
        StringBuilder stringBuilder = new StringBuilder(" ");
        MutableText mutableText = Text.literal((String)stringBuilder.toString()).append((Text)text.copy());
        int n2 = textRenderer.getWidth((StringVisitable)text);
        while (textRenderer.getWidth((StringVisitable)mutableText) - n2 < n) {
            stringBuilder.append(' ');
            mutableText = Text.literal((String)stringBuilder.toString()).append((Text)text.copy());
        }
        return mutableText;
    }

    private static Entity Ill(Object object) {
        if (object == null) {
            return null;
        }
        Entity entity = EntityRendererMixin2.II(object);
        if (entity != null) {
            return entity;
        }
        Integer n = EntityRendererMixin2.ll(object);
        if (n == null) {
            return null;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || minecraftClient.world == null) {
            return null;
        }
        return minecraftClient.world.getEntityById(n.intValue());
    }

    @Redirect(method={"renderLabelIfPresent"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11785;method_73482(Lnet/minecraft/class_4587;Lnet/minecraft/class_243;ILnet/minecraft/class_2561;ZIDLnet/minecraft/class_12075;)V"))
    private void lII(RenderCommandQueue renderCommandQueue, MatrixStack matrixStack, Vec3d vec3d, int n, Text text, boolean bl, int n2, double d, CameraRenderState cameraRenderState, S s, MatrixStack matrixStack2, OrderedRenderCommandQueue orderedRenderCommandQueue, CameraRenderState cameraRenderState2) {
        Text text2 = this.IIl(s, text);
        IIlllIIII iIlllIIII = IIIII.IlI(text);
        if (iIlllIIII == null) {
            renderCommandQueue.submitLabel(matrixStack, vec3d, n, text2, bl, n2, d, cameraRenderState);
            return;
        }
        Text text3 = this.IlI(text2, iIlllIIII.IIl());
        this.l(orderedRenderCommandQueue, matrixStack2, vec3d, n, n2, cameraRenderState2, text3, iIlllIIII);
        renderCommandQueue.submitLabel(matrixStack, vec3d, n, text3, bl, n2, d, cameraRenderState);
    }
}

