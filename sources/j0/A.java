package J0;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f2420a = b.WARN;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2421a;

        static {
            int[] iArr = new int[b.values().length];
            f2421a = iArr;
            try {
                iArr[b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2421a[b.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2421a[b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        DEBUG,
        WARN,
        NONE
    }

    public static void a(String str, String str2, Object... objArr) {
        b(b.DEBUG, str, str2, objArr);
    }

    private static void b(b bVar, String str, String str2, Object... objArr) {
        if (bVar.ordinal() >= f2420a.ordinal()) {
            String str3 = String.format("(%s) [%s]: ", "26.2.0", str);
            if (objArr.length > 0) {
                str2 = String.format(str2, objArr);
            }
            String str4 = str3 + str2;
            int i3 = a.f2421a[bVar.ordinal()];
            if (i3 == 1) {
                Log.i("Firestore", str4);
            } else if (i3 == 2) {
                Log.w("Firestore", str4);
            } else if (i3 == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static boolean c() {
        return f2420a.ordinal() >= b.DEBUG.ordinal();
    }

    public static void d(b bVar) {
        f2420a = bVar;
    }

    public static void e(String str, String str2, Object... objArr) {
        b(b.WARN, str, str2, objArr);
    }
}
