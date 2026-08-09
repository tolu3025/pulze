package K1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Object[] d(int i3) {
        if (i3 >= 0) {
            return new Object[i3];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final Object[] e(Object[] objArr, int i3) {
        m.e(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i3);
        m.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static final void f(Object[] objArr, int i3) {
        m.e(objArr, "<this>");
        objArr[i3] = null;
    }

    public static final void g(Object[] objArr, int i3, int i4) {
        m.e(objArr, "<this>");
        while (i3 < i4) {
            f(objArr, i3);
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Object[] objArr, int i3, int i4, List list) {
        if (i4 != list.size()) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!m.a(objArr[i3 + i5], list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(Object[] objArr, int i3, int i4) {
        int iHashCode = 1;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = objArr[i3 + i5];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Object[] objArr, int i3, int i4, Collection collection) {
        StringBuilder sb = new StringBuilder((i4 * 3) + 2);
        sb.append("[");
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i3 + i5];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
