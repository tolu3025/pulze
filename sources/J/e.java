package j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static float a(float f3, String str) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f3)) {
            return f3;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    public static Object b(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }
}
