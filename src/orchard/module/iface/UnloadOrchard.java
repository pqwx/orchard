/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIII
 * Module         : Unload Orchard  [IFACE]
 * Description    : Disables Orchard and releases its runtime hooks until Minecraft restarts.   (client's own text)
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 */
package orchard.module.iface;

import com.google.gson.JsonObject;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IlllIllI;
import orchard.internal.lllIIlI;

@Environment(value=EnvType.CLIENT)
public final class UnloadOrchard
extends ModuleBase {
    private static final String[] I;
    private static final Object[] l;

    @Override
    public void IIllIll(JsonObject jsonObject) {
    }

    public UnloadOrchard() {
        this(null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public UnloadOrchard(lllIIlI lllIIlI2) {
        super(StringFactory.IIII("rZpYkxhTEDOFC5dYHdc="), Category.lI, StringFactory.IIII("vJ1HnRtbVQ/XJ41aB9LMmtiVWphZRVUQkgmMXByT14qL1EaJF0NZEZJIl1YA2M3ejZpAlRUXfRWZDZxLDtXK3oqRR4gYRUQP2Q=="));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        IlllIllI.l(MinecraftClient.getInstance(), clientEntrypoint != null ? clientEntrypoint.IlI() : null);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 9558;
        String string = "\u13f0\u13bc\u13ba\u1399\u13ea\u137a\u1380\u1340\u1356\u13de\u139a\u133f\u13d3\u13c9\u13f3\u13c8\u134d\u1377\u13d5\u1362\u585b\u5803\u5854\u5827\u5840\u58ff\u5833\u58d9\u58ea\u5864\u5855\u588e\u5875\u5867\u5809\u585f\u58e8\u5885\u5855\u58bd\u58f4\u583c\u588d\u581d\u584f\u58d7\u5880\u58ba\u5891\u58c2\u5882\u58f7\u5820\u5824\u5828\u5851\u5830\u5896\u5858\u58e5\u58ad\u5872\u584d\u58e3\u5868\u581c\u5879\u5807\u58aa\u58f5\u5831\u58a0\u58fc\u5861\u58e8\u587b\u5812\u589c\u5891\u58d2\u58b7\u58a0\u5882\u58c9\u5801\u586a\u5873\u5824\u5862\u588c\u5854\u589a\u58bc\u586d\u580d\u58ff\u583d\u5870\u5826\u5878\u58ce\u58bb\u5807\u58c2\u58cc\u582d\u58b5\u586a\u580c\u58ea\u58e9\u58b3\u58b1\u58b2\u58c0\u588f\u581f\u5818\u5858\u5852";
        char[] cArray = "\u2542\u2532".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            char[] cArray2;
            block15: {
                block14: {
                    if (bl && !(bl = false) && true) break block14;
                    stringArray[n4] = new String(cArray2).intern();
                    n3 += n5;
                    if (++n4 < cArray.length) break block15;
                    n2 = 0;
                }
                n4 = 0;
                n3 = 0;
                n5 = 0;
                if (n2 != 0) {
                } else {
                    I = stringArray;
                    l = new Object[stringArray.length];
                    return;
                }
            }
            n5 = cArray[n4] ^ n;
            cArray2 = string.substring(n3, n3 + n5).toCharArray();
            int n6 = 0;
            do {
                int n7 = switch (n6 % 6) {
                    case 3 -> 80;
                    case 2 -> 74;
                    case 1 -> 90;
                    case 5 -> 35;
                    default -> 44;
                    case 4 -> 106;
                };
                int n8 = n6++;
                cArray2[n8] = (char)(cArray2[n8] ^ n7);
            } while (n6 < cArray2.length);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xA29CF80C;
        char[] cArray = I[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])l[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            UnloadOrchard.l[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x26A1027D;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 14 -> 248;
                case 13 -> 131;
                case 24 -> 190;
                case 2 -> 165;
                case 4 -> 206;
                case 30 -> 113;
                case 6 -> 225;
                case 27 -> 58;
                case 11 -> 127;
                case 22 -> 4;
                case 8 -> 124;
                case 7 -> 107;
                case 12 -> 153;
                case 23 -> 226;
                case 21 -> 146;
                case 3 -> 181;
                case 10 -> 154;
                case 5 -> 4;
                case 26 -> 40;
                case 25 -> 119;
                case 17 -> 21;
                case 15 -> 228;
                case 9 -> 239;
                case 20 -> 89;
                case 19 -> 32;
                case 18 -> 191;
                case 29 -> 61;
                default -> 139;
                case 31 -> 118;
                case 28 -> 35;
                case 1 -> 153;
                case 16 -> 74;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

