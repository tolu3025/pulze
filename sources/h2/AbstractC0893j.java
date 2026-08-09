package h2;

import java.util.ArrayList;

/* JADX INFO: renamed from: h2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0893j {
    public static /* synthetic */ Object b(Object obj, int i3, kotlin.jvm.internal.h hVar) {
        if ((i3 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, Object obj2) {
        if (obj == null) {
            return a(obj2);
        }
        if (obj instanceof ArrayList) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(obj2);
            return a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return a(arrayList);
    }

    public static Object a(Object obj) {
        return obj;
    }
}
