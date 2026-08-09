package T1;

import Z1.c;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Class a(c cVar) {
        m.e(cVar, "<this>");
        Class clsC = ((e) cVar).c();
        m.c(clsC, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsC;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class b(c cVar) {
        m.e(cVar, "<this>");
        Class clsC = ((e) cVar).c();
        if (!clsC.isPrimitive()) {
            m.c(clsC, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsC;
        }
        String name = clsC.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsC = Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsC = Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsC = Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsC = Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsC = Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsC = Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsC = Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsC = Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsC = Short.class;
                }
                break;
        }
        m.c(clsC, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsC;
    }
}
