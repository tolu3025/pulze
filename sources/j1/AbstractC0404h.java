package J1;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: J1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0404h {
    public static final Object[] a(Object[] reference, int i3) {
        kotlin.jvm.internal.m.e(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i3);
        kotlin.jvm.internal.m.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    public static final void b(int i3, int i4) {
        if (i3 <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i4 + ").");
    }
}
