package f0;

import java.util.Arrays;

/* JADX INFO: renamed from: f0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0860s {
    static Object[] a(Object[] objArr, int i3, int i4, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i3, i4, objArr2.getClass());
    }

    static Object[] b(Object[] objArr, int i3) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i3);
    }
}
