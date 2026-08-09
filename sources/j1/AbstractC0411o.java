package J1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: J1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0411o {
    public static List a(List builder) {
        kotlin.jvm.internal.m.e(builder, "builder");
        return ((K1.a) builder).u();
    }

    public static final Object[] b(Object[] objArr, boolean z2) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (z2 && kotlin.jvm.internal.m.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new K1.a(0, 1, null);
    }

    public static List d(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.m.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List e(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        List listX = x.X(iterable);
        Collections.shuffle(listX);
        return listX;
    }

    public static Object[] f(int i3, Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }
}
