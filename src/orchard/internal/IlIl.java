/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - handlers
 *   - update
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
 */
package orchard.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.CodeSource;
import java.util.ArrayList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import orchard.internal.lIIlI;

@Environment(value=EnvType.CLIENT)
public final class IlIl {
    private static final URL I;
    private static final String[] l;
    private static final Object[] II;

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block25: {
                block29: {
                    block32: {
                        block28: {
                            block27: {
                                block26: {
                                    block30: {
                                        block31: {
                                            break block32;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                v0 = 19;
                                                break block25;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var5_5 = 0;
                                                break block26;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (true) {
                                                break block27;
                                                break;
                                            }
lbl9:
                                            // 1 sources

                                            while (true) {
                                                if (var9_9 < var8_8.length) break block28;
                                                break block29;
                                                break;
                                            }
lbl12:
                                            // 1 sources

                                            while (true) {
                                                if (var7_7 != 0) break block30;
                                                break block31;
                                                break;
                                            }
lbl15:
                                            // 1 sources

                                            while (true) {
                                                var7_7 = 0;
lbl17:
                                                // 2 sources

                                                while (true) {
                                                    var4_4 = 0;
                                                    ** continue;
                                                    break;
                                                }
                                                break;
                                            }
lbl20:
                                            // 1 sources

                                            while (true) {
                                                var7_7 = -1;
                                                ** continue;
                                                break;
                                            }
lbl23:
                                            // 1 sources

                                            while (true) {
                                                v0 = 125;
                                                break block25;
                                                break;
                                            }
lbl26:
                                            // 1 sources

                                            while (true) {
                                                v0 = 14;
                                                break block25;
                                                break;
                                            }
                                        }
                                        IlIl.l = var3_3;
                                        break block33;
lbl32:
                                        // 1 sources

                                        while (true) {
                                            var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                                            var9_9 = 0;
                                            break block28;
                                            break;
                                        }
lbl36:
                                        // 1 sources

                                        while (true) {
                                            v0 = 0;
                                            break block25;
                                            break;
                                        }
                                    }
lbl40:
                                    // 2 sources

                                    while (true) {
                                        var6_6 = var2_2[var4_4];
                                        ** continue;
                                        break;
                                    }
                                }
                                var6_6 = '\u0000';
                                ** while (true)
                            }
                            ** while (++var4_4 < var2_2.length)
lbl48:
                            // 1 sources

                            ** while (true)
lbl49:
                            // 1 sources

                            while (true) {
                                v0 = 117;
                                break block25;
                                break;
                            }
lbl52:
                            // 1 sources

                            while (true) {
                                v0 = 57;
                                break block25;
                                break;
                            }
lbl55:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        switch (var9_9 % 6) {
                            default: {
                                ** continue;
                            }
                            case 5: {
                                ** continue;
                            }
                            case 3: {
                                ** continue;
                            }
                            case 1: {
                                ** continue;
                            }
                            case 2: {
                                ** continue;
                            }
                            ** case 4:
lbl70:
                            // 1 sources

                            ** continue;
                        }
lbl71:
                        // 1 sources

                        while (true) {
                            ** continue;
                            break;
                        }
lbl73:
                        // 1 sources

                        while (true) {
                            v1 = var9_9++;
                            var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
                            ** continue;
                            break;
                        }
                    }
                    var0 = 7899;
                    var1_1 = "\uf30f\uf37e\uf3bc\uf364\uf37f\uf320\uf3fb\uf30c\uf337\uf3d5\uf320\uf3d6\ubd6d\ubd0e\ubddb\ubd37\ubd1f\ubd50\ubdff\ubd6f";
                    ** while (true)
                }
                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                ** while (true)
                var2_2 = "\f\b".toCharArray();
                var3_3 = new String[var2_2.length];
                ** while (true)
            }
            var10_10 = v0;
            ** while (true)
        }
        IlIl.II = new Object[var3_3.length];
        IlIl.I = IlIl.ll(IlIl.class);
    }

    private IlIl() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean I(Object object) {
        URL uRL = IlIl.ll(object.getClass());
        if (I == null) return false;
        if (!I.equals(uRL)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void l() {
        IlIl.Il(ClientTickEvents.END_CLIENT_TICK);
        IlIl.Il(HudRenderCallback.EVENT);
        IlIl.Il(lIIlI.l);
        IlIl.Il(ClientPlayConnectionEvents.JOIN);
    }

    private static Method II(Class<?> clazz, String string) {
        for (Class<?> clazz2 = clazz; clazz2 != null && clazz2 != Object.class; clazz2 = clazz2.getSuperclass()) {
            try {
                return clazz2.getDeclaredMethod(string, new Class[0]);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                continue;
            }
        }
        return null;
    }

    private static void Il(Object object) {
        try {
            IlIl.III(object);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static Field lI(Class<?> clazz, String string) {
        for (Class<?> clazz2 = clazz; clazz2 != null && clazz2 != Object.class; clazz2 = clazz2.getSuperclass()) {
            try {
                return clazz2.getDeclaredField(string);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                continue;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static URL ll(Class<?> clazz) {
        if (clazz == null) return null;
        if (clazz.getProtectionDomain() == null) return null;
        CodeSource codeSource = clazz.getProtectionDomain().getCodeSource();
        if (codeSource == null) {
            return null;
        }
        URL uRL = codeSource.getLocation();
        return uRL;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static void III(Object object) throws ReflectiveOperationException {
        if (object == null) {
            return;
        }
        Field field = IlIl.lI(object.getClass(), "handlers");
        if (field == null) {
            return;
        }
        field.setAccessible(true);
        Object object2 = field.get(object);
        if (!(object2 instanceof Object[])) return;
        Object[] objectArray = (Object[])object2;
        if (objectArray.length == 0) {
            return;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(objectArray.length);
        Object[] objectArray2 = objectArray;
        int n = objectArray2.length;
        int n2 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                ++n2;
            }
            if (n2 >= n) break;
            Object object3 = objectArray2[n2];
            if (object3 == null || IlIl.I(object3)) continue;
            arrayList.add(object3);
        }
        if (arrayList.size() == objectArray.length) {
            return;
        }
        Object object4 = Array.newInstance(objectArray.getClass().getComponentType(), arrayList.size());
        n = 0;
        while (true) {
            if (n >= arrayList.size()) {
                field.set(object, object4);
                Method method = IlIl.II(object.getClass(), "update");
                if (method == null) return;
                method.setAccessible(true);
                method.invoke(object, new Object[0]);
                return;
            }
            Array.set(object4, n, arrayList.get(n));
            ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x75320D;
        char[] cArray = l[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])II[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIl.II[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xF3CD1541;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 12 -> 44;
                case 15 -> 204;
                case 30 -> 63;
                case 20 -> 18;
                case 6 -> 201;
                case 5 -> 104;
                case 21 -> 86;
                case 16 -> 41;
                case 9 -> 203;
                case 7 -> 40;
                case 4 -> 92;
                case 28 -> 231;
                case 25 -> 229;
                case 26 -> 189;
                case 8 -> 100;
                case 31 -> 3;
                case 24 -> 162;
                case 23 -> 142;
                case 22 -> 84;
                case 10 -> 86;
                case 18 -> 175;
                case 27 -> 175;
                case 11 -> 225;
                case 2 -> 232;
                case 29 -> 81;
                case 3 -> 124;
                case 1 -> 67;
                case 17 -> 107;
                default -> 0;
                case 14 -> 214;
                case 13 -> 71;
                case 19 -> 87;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

