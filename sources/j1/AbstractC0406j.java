package J1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: J1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0406j extends AbstractC0405i {
    public static List c(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        List listA = AbstractC0408l.a(objArr);
        kotlin.jvm.internal.m.d(listA, "asList(...)");
        return listA;
    }

    public static byte[] d(byte[] bArr, byte[] destination, int i3, int i4, int i5) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(bArr, i4, destination, i3, i5 - i4);
        return destination;
    }

    public static Object[] e(Object[] objArr, Object[] destination, int i3, int i4, int i5) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(objArr, i4, destination, i3, i5 - i4);
        return destination;
    }

    public static /* synthetic */ byte[] f(byte[] bArr, byte[] bArr2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = bArr.length;
        }
        return d(bArr, bArr2, i3, i4, i5);
    }

    public static /* synthetic */ Object[] g(Object[] objArr, Object[] objArr2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = objArr.length;
        }
        return e(objArr, objArr2, i3, i4, i5);
    }

    public static byte[] h(byte[] bArr, int i3, int i4) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        AbstractC0404h.b(i4, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, i4);
        kotlin.jvm.internal.m.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] i(Object[] objArr, int i3, int i4) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        AbstractC0404h.b(i4, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i3, i4);
        kotlin.jvm.internal.m.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void j(Object[] objArr, Object obj, int i3, int i4) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        Arrays.fill(objArr, i3, i4, obj);
    }

    public static byte[] k(byte[] bArr, byte[] elements) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        kotlin.jvm.internal.m.b(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final void l(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void m(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
