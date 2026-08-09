package f0;

/* JADX INFO: renamed from: f0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0858q {
    static Object a(Object obj, int i3) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i3);
    }

    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static Object[] c(Object[] objArr, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            a(objArr[i4], i4);
        }
        return objArr;
    }

    public static Object[] d(Object[] objArr, int i3) {
        return AbstractC0860s.b(objArr, i3);
    }
}
