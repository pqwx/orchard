/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Failed to {} for Fake Client badge rendering
 *   - inspect Feather nametag state
 *   - render Feather nametag badge
 *   - render fake client tab badge
 *   - update Feather nametag width
 *   - read Feather nametag state
 *   - resolve world badge layer
 *   - getEntityTranslucent
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
 *  net.minecraft.client.font.TextRenderer$TextLayerType
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.text.StringVisitable
 *  net.minecraft.text.Text
 *  net.minecraft.util.Identifier
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package orchard.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import orchard.core.ClientEntrypoint;
import orchard.internal.IIIIllIII;
import orchard.internal.IIIlI;
import orchard.internal.IIlllIIII;
import orchard.internal.IlIlIlllI;
import orchard.internal.IllllIl;
import orchard.internal.lllIII;
import orchard.module.render.FakeClient;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public final class IIIII {
    private static Field I;
    private static boolean l;
    private static Class<?> II;
    private static Class<?> Il;
    private static Field lI;
    private static Method ll;
    private static final float III = 3.0f;
    private static Class<?> IIl;
    private static Field IlI;
    private static final float Ill = 2.0f;
    private static Method lII;
    private static final float lIl = -0.1f;
    private static Method llI;
    private static Field lll;
    private static Method IIII;
    private static Method IIIl;
    private static Method IIlI;
    private static boolean IIll;
    private static final Logger IlII;
    private static Field IlIl;
    private static final int[] IllI;
    private static final String[] Illl;
    private static final Object[] lIII;

    /*
     * Enabled aggressive block sorting
     */
    public static int I(Text text) {
        IIlllIIII iIlllIIII = IIIII.IlI(text);
        if (iIlllIIII == null) return 0;
        int n = iIlllIIII.IIl();
        return n;
    }

    private static IIlllIIII l() {
        FakeClient fakeClient = IIIII.IIIl();
        return fakeClient != null ? fakeClient.IIII() : null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int II(DrawContext drawContext, PlayerListEntry playerListEntry, TextRenderer textRenderer, int n, int n2) {
        if (drawContext == null) return 0;
        if (playerListEntry != null) {
            IIlllIIII iIlllIIII = IIIII.lll(IlIlIlllI.III(playerListEntry.getProfile()));
            if (iIlllIIII == null) {
                return 0;
            }
            float f = iIlllIIII.lIl();
            float f2 = iIlllIIII.IIIl();
            float f3 = n2;
            Objects.requireNonNull(textRenderer);
            float f4 = f3 + (9.0f - f) / 2.0f;
            IIIlI.IlIlIl(drawContext, iIlllIIII.l(), n, f4, f2, f, iIlllIIII.II(), iIlllIIII.lII());
            return iIlllIIII.llI();
        }
        return 0;
    }

    public static boolean Il(Object object, Object object2, float f, float f2, Object object3) {
        IIlllIIII iIlllIIII = IIIII.lll(IIIII.IIll(object2));
        if (iIlllIIII == null || !IIIII.IlII(object2) || !IIIII.llI(object, object2, object3)) {
            return false;
        }
        try {
            Object object4 = ll.invoke(IIIl.invoke(object, new Object[0]), "nametag_logo", iIlllIIII.l(), object3);
            int n = (Integer)IIII.invoke(object, -1, object2);
            float f3 = (float)(-IlIl.getInt(object2)) / 2.0f + f;
            float f4 = f2 - iIlllIIII.Ill() / 2.0f;
            lII.invoke(null, object4, Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(-0.1f), Float.valueOf(iIlllIIII.IlI()), Float.valueOf(iIlllIIII.Ill()), Float.valueOf(iIlllIIII.II()), Float.valueOf(iIlllIIII.lII()), n);
            return true;
        }
        catch (Exception exception) {
            IIIII.lI("render Feather nametag badge", exception);
            return false;
        }
    }

    private IIIII() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void lI(String string, Exception exception) {
        if (IIll) {
            return;
        }
        IIll = true;
        IlII.warn("Failed to {} for Fake Client badge rendering", (Object)string, (Object)exception);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static IllllIl ll(UUID uUID) {
        IllllIl illllIl;
        if (!IIIII.llII(uUID)) {
            illllIl = IllllIl.II;
            return illllIl;
        }
        illllIl = new IllllIl(true, null);
        return illllIl;
    }

    private static boolean III() {
        return false;
    }

    private static boolean IIl(UUID uUID) {
        return IIIIllIII.lI(uUID);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static IIlllIIII IlI(Text text) {
        if (!IIIII.lIIl(text)) return null;
        IIlllIIII iIlllIIII = IIIII.l();
        return iIlllIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void Ill(IIlllIIII iIlllIIII, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, float f, float f2, boolean bl, int n) {
        Matrix4f matrix4f = matrixStack.peek().getPositionMatrix();
        RenderLayer renderLayer = IIIII.lII(iIlllIIII.l());
        if (renderLayer == null) {
            return;
        }
        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(renderLayer);
        float f3 = iIlllIIII.IlI();
        float f4 = iIlllIIII.Ill();
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2 + f4, 0.0f).texture(0.0f, 1.0f).color(-1).light(n);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f + f3, f2 + f4, 0.0f).texture(1.0f, 1.0f).color(-1).light(n);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f + f3, f2, 0.0f).texture(1.0f, 0.0f).color(-1).light(n);
        vertexConsumer.vertex((Matrix4fc)matrix4f, f, f2, 0.0f).texture(0.0f, 0.0f).color(-1).light(n);
    }

    private static RenderLayer lII(Identifier identifier) {
        if (llI != null) {
            try {
                return (RenderLayer)llI.invoke(null, identifier);
            }
            catch (Exception exception) {
                IIIII.lI("resolve world badge layer", exception);
                return null;
            }
        }
        for (String string : new String[]{"getTextSeeThrough", "getText", "getGuiTextured", "getEntityTranslucent"}) {
            try {
                Method method;
                llI = method = RenderLayer.class.getMethod(string, Identifier.class);
                return (RenderLayer)method.invoke(null, identifier);
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (Exception exception) {
                IIIII.lI("resolve world badge layer", exception);
                return null;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String lIl(Text text) {
        if (text == null) {
            return "";
        }
        String string = text.getString().trim();
        return string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block20: {
                block14: {
                    block16: {
                        block18: {
                            block19: {
                                block13: {
                                    block15: {
                                        block12: {
                                            block11: {
                                                break block15;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl3:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl5:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                                IIIII.lIII = new Object[var9_4.length];
                                                var2_1 = 1305494249;
                                                ** while (true)
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl12:
                                                // 1 sources

                                                while (true) {
                                                    var3_11 += 4;
                                                    if (++var4_12 < var1_10) break block11;
                                                    break block12;
                                                    break;
                                                }
                                                var0_9 = "\u0006\b\u00f6k\u00b5\u00d7\u00e1\u00f6l\u00b6\u00e8g\u00dej\u00c8$\u000e\u0016+\u007f%\u008a\u00d6V\u00d1k\u00e4\u00c5\u007f\u00fb\u001c\u00d0U\u009e'\u00fepNH\u0019\u00e5\u00aaz\u0095".getBytes("ISO-8859-1");
                                                break block16;
lbl18:
                                                // 1 sources

                                                while (true) {
                                                    break block13;
                                                    break;
                                                }
                                            }
lbl21:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        IIIII.IlII = LoggerFactory.getLogger(IIIII.class);
                                        return;
lbl26:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl28:
                                        // 1 sources

                                        while (true) {
                                            if (var13_8 != 0) ** GOTO lbl26
                                            break block14;
                                            break;
                                        }
                                        var9_4 = new String[var8_3.length];
                                        var13_8 = -1;
                                        break block17;
                                        var5_13 = (var0_9[var3_11] & 255) << 24 | (var0_9[var3_11 + 1] & 255) << 16 | (var0_9[var3_11 + 2] & 255) << 8 | var0_9[var3_11 + 3] & 255;
                                        IIIII.IllI[var4_12] = var5_13 ^= var2_1;
                                        ** while (true)
                                    }
                                    var6 = 16062;
                                    break block18;
                                }
                                if (++var10_5 >= var8_3.length) ** break;
                                ** while (true)
                                break block19;
lbl44:
                                // 1 sources

                                while (true) {
                                    var11_6 += var12_7;
                                    ** continue;
                                    break;
                                }
                                var11_6 = 0;
                                var12_7 = 0;
                                ** while (true)
                            }
                            var13_8 = 0;
                            break block17;
                            var12_7 = var8_3[var10_5] ^ var6;
                            var9_4[var10_5] = var7_2.substring(var11_6, var11_6 + var12_7);
                            ** while (true)
lbl56:
                            // 1 sources

                            while (true) {
                                var4_12 = 0;
                                ** continue;
                                break;
                            }
                        }
                        var7_2 = "\u8184\u8170\u814e\u815a\u8185\u8151\u81b1\u814f\u814e\u8179\u8167\u8182\u8162\u81ad\u8188\u814f\uf627\uf60e\uf640\uf61f\uf62b\uf63c\uf616\uf640\uf643\uf642\uf60f\uf62d\uf63d\uf637\uf612\uf62c\uf63d\uf60d\uf641\uf623\uf625\uf644\uf62b\uf634\uf633\uf637\uf621\uf637\uf633\uf63c\uf63f\uf623\uf62a\uf621\uf617\uf637\uf636\uf63f\uf5db\uf5db\ue671\ue66f\ue651\ue683\ue684\ue65d\ue677\ue653\ue662\ue65e\ue686\ue656\ue64c\ue666\ue64d\ue662\ue653\ue6b6\ue657\ue64d\ue685\ue669\ue686\ue676\ue651\ue655\ue67c\ue67c\ue661\ue6ac\ue66a\ue64e\ue689\ue680\ue6ad\ue64d\ue653\ue652\ue6c8\ue64d\ue6ac\ue6b2\ue66e\ue681\ue684\ue64d\ue64c\ue668\ue667\ue661\ue68b\ue652\ue660\ue656\ue652\ue65d\ue684\ue651\ue6b3\ue6ba\ua6f1\ua708\ua6d6\ua6d0\ua6f3\ua700\ua6e6\ua6da\ua6e6\ua6e6\ua701\ua6d9\ua6da\ua744\ua749\ua6e6\ua6db\ua745\ua6e8\ua6fb\ua6ee\ua745\ua701\ua6e4\ua6e5\ua6f4\ua707\ua6e6\ua6e6\ua6f3\ua6f3\ua6e2\ua6f0\ua6e9\ua73d\ua73d\u9107\u912c\u90df\u90e0\u90f0\u90e3\u90f9\u90d1\u90d3\u90e2\u914a\u90d2\u90dd\u9100\u90ed\u90d3\u90e9\u90fd\u90fb\u90e5\u9104\u90db\u90e0\u9134\udc46\udbed\udc1e\udc21\udc31\udc22\udc38\udc10\udc12\udc21\udbf5\udbf5\ud7ce\uc825\ud7f6\ud7f9\ud7e5\ud7e7\ud7e0\ud7d5\uc802\ud7fa\ud7cd\uc808\ud7f0\ud7f1\ud7e8\ud7ec\ud7fb\ud7e4\ud7db\uc81d\u5068\u5093\u5080\u507f\u5053\u506c\u5062\u5082\u5071\u506f\u5067\u5089\u506e\u5087\u508f\u5077\u507f\u505d\u5082\u506d\u5067\u5093\u5053\u506c\u5071\u5069\u5061\u509b\ued62\ued5b\ued85\ued83\ued60\ued53\ued75\ued89\ued75\ued75\ued52\ued8a\ued89\ued97\ued9a\ued75\ued88\ued96\ued7b\ued68\ued5d\ued96\ued52\ued77\ued76\ued67\ued54\ued75\ued75\ued60\ued60\ued71\ued63\ued7a\ued8e\ued8e\u45bc\u45b5\u45ab\u459b\u45c0\u45ab\u45c1\u45ad\u459b\u4597\u4577\u45a9\u45a4\u459f\u45b5\u45a1\u4599\u456c\u4576\u45cb\u45be\u4578\u4577\u45a4\u459b\u458f\u45b9\u458f\u4597\u45a8\u4594\u45c9\u45ca\u45ba\u4575\u4570\uf401\uf3d0\uf3fa\uf3e2\uf400\uf3e8\uf3f2\uf3d7\uf3d8\uf3e4\uf3f3\uf3f2\uf3e6\uf3d0\uf437\uf3dc\uf3e8\uf433\uf408\uf3df\uf439\uf3fa\uf40b\uf3d4\uf3d5\uf3d0\uf401\uf3dc\uf3d4\uf3fe\uf406\uf409\uf402\uf3e8\uf3f3\uf407\uf3d6\uf3db\uf3fd\uf42f\u9d2f\u9d46\u9d18\u9d37\u9d33\u9d14\u9d3e\u9d18\u9d1b\u9d14\u9d47\u9d29\u9d17\u9d0b\u9d31\u9d1c\u9d1a\u9d10\u9cf1\u9d1e\u9d33\u9d0b\u9d37\u9d17\u9d18\u9d0f\u9d39\u9d1f\u9d28\u9d24\u9d17\u9d3b\u9d32\u9d39\u9d3f\u9d1f\u9d1e\u9d17\u9d03\u9d03\u2d5a\u2d89\u2d82\u2d81\u2d56\u2d81\u2da1\u2d83\u2d6d\u2d6c\u2d61\u2d83\u2d73\u2d89\u2d5c\u2d82\u2d73\u2d63\u2d6f\u2d4d\u2d5b\u2d7a\u2d55\u2d8a\u2d7d\u2d89\u2d4f\u2d89\u2d7d\u2d72\u2d71\u2d74\u2d56\u2d4f\u2d69\u2d74\u2d7d\u2d81\u2da5\u2da5";
                        var8_3 = "\u3eae\u3e96\u3e82\u3e9a\u3ea6\u3eb2\u3eaa\u3ea2\u3e9a\u3e9a\u3e96\u3e96\u3e96".toCharArray();
                        ** while (true)
                    }
                    var1_10 = var0_9.length / 4;
                    break block20;
                }
                IIIII.Illl = var9_4;
                ** while (true)
            }
            IIIII.IllI = new int[var1_10];
            var3_11 = 0;
            ** while (true)
        }
        var10_5 = 0;
        ** while (true)
    }

    private static boolean llI(Object object, Object object2, Object object3) {
        return false;
    }

    public static IIlllIIII lll(UUID uUID) {
        FakeClient fakeClient = IIIII.IIIl();
        if (fakeClient == null || !fakeClient.lI(uUID)) {
            return null;
        }
        return fakeClient.IIII();
    }

    private static boolean IIII(Object object) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static FakeClient IIIl() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return null;
        }
        FakeClient fakeClient = clientEntrypoint.IlI().IIIlIII();
        if (fakeClient == null) return null;
        if (!fakeClient.IIIlIIl()) return null;
        FakeClient fakeClient2 = fakeClient;
        return fakeClient2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIlI(Text text, TextRenderer textRenderer, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, float f, float f2, TextRenderer.TextLayerType textLayerType, int n) {
        IIlllIIII iIlllIIII = IIIII.lIIl(text) ? IIIII.l() : null;
        if (iIlllIIII == null) return;
        if (textRenderer == null) return;
        if (matrixStack == null) return;
        if (vertexConsumerProvider == null) {
            return;
        }
        float f3 = f - (float)iIlllIIII.IIl();
        Objects.requireNonNull(textRenderer);
        float f4 = f2 + (9.0f - iIlllIIII.Ill()) / 2.0f;
        IIIII.Ill(iIlllIIII, matrixStack, vertexConsumerProvider, f3, f4, textLayerType == TextRenderer.TextLayerType.SEE_THROUGH, n);
    }

    private static UUID IIll(Object object) {
        if (object == null || !IIIII.IIII(object)) {
            return null;
        }
        try {
            UUID uUID;
            Object object2 = IlI.get(object);
            if (object2 instanceof Entity) {
                Entity entity = (Entity)object2;
                uUID = entity.getUuid();
            } else {
                uUID = null;
            }
            return uUID;
        }
        catch (Exception exception) {
            IIIII.lI("read Feather nametag state", exception);
            return null;
        }
    }

    private static boolean IlII(Object object) {
        if (object == null || !IIIII.IIII(object)) {
            return false;
        }
        try {
            Object object2 = IlI.get(object);
            if (!(object2 instanceof Entity)) {
                return false;
            }
            return !lI.getBoolean(object) && lll.getBoolean(object) && I.get(object) == null;
        }
        catch (Exception exception) {
            IIIII.lI("inspect Feather nametag state", exception);
            return false;
        }
    }

    public static lllIII IlIl(UUID uUID, int n, int n2) {
        IIlllIIII iIlllIIII = IIIII.lll(uUID);
        if (iIlllIIII == null || !IIIII.III()) {
            return lllIII.II;
        }
        try {
            IIlI.invoke(null, iIlllIIII.l(), Float.valueOf(n), Float.valueOf(n2), Float.valueOf(iIlllIIII.IIIl()), Float.valueOf(iIlllIIII.lIl()), 0, 0, iIlllIIII.II(), iIlllIIII.lII(), Float.valueOf(iIlllIIII.II()), Float.valueOf(iIlllIIII.lII()), -1);
            return new lllIII(true, iIlllIIII.llI());
        }
        catch (Exception exception) {
            IIIII.lI("render fake client tab badge", exception);
            return lllIII.II;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Text IllI(Text text) {
        Text text2;
        if (!IIIII.lIIl(text)) {
            text2 = text;
            return text2;
        }
        text2 = IIIIllIII.I(text);
        return text2;
    }

    public static void Illl(Object object, Text text) {
        if (object == null || text == null || !IIIII.IIII(object)) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.textRenderer == null) {
            return;
        }
        try {
            int n = minecraftClient.textRenderer.getWidth((StringVisitable)text);
            IIlllIIII iIlllIIII = IIIII.lll(IIIII.IIll(object));
            if (iIlllIIII != null) {
                n += iIlllIIII.IIl();
            }
            IlIl.setInt(object, n);
        }
        catch (Exception exception) {
            IIIII.lI("update Feather nametag width", exception);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lIII() {
        if (IIIII.IIIl() == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lIIl(Text text) {
        FakeClient fakeClient = IIIII.IIIl();
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (fakeClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (text == null) return false;
        String string = IIIII.lIl(IIIIllIII.I(text));
        if (string.isBlank()) return false;
        String string2 = IIIII.lIl(IIIIllIII.I(minecraftClient.player.getDisplayName()));
        if (!string2.isBlank()) {
            if (string.equalsIgnoreCase(string2)) {
                return true;
            }
        }
        String string3 = IlIlIlllI.ll(minecraftClient.player.getGameProfile());
        if (string3 == null) return false;
        if (!string.equalsIgnoreCase(string3)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static void lIlI() {
        IIlI = null;
        lII = null;
        ll = null;
        IIIl = null;
        IIII = null;
        llI = null;
        IlI = null;
        lI = null;
        lll = null;
        I = null;
        IlIl = null;
        II = null;
        Il = null;
        IIl = null;
        l = false;
        IIll = false;
    }

    public static IIlllIIII lIll(PlayerEntity playerEntity) {
        return playerEntity == null ? null : IIIII.lll(playerEntity.getUuid());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean llII(UUID uUID) {
        FakeClient fakeClient = IIIII.IIIl();
        if (fakeClient == null) return false;
        if (!fakeClient.lI(uUID)) return false;
        return true;
    }

    private static int llIl(int n, int n2) {
        return IllI[n ^ 0x1899B36] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lllI(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x2B2E;
        char[] cArray = Illl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIII[n2];
        if (stackTraceElementArray2 == null) {
            IIIII.lIII[n2] = stackTraceElementArray = new Throwable().getStackTrace();
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x20C6;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xA7FC;
            n6 += 10831;
            n6 -= 14649;
            cArray[n5] = (char)((n6 -= 61130) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

