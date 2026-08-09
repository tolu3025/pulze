package H1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f2125a;

    static {
        Object obj;
        Class<?> cls;
        a aVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                aVar = (a) cls.asSubclass(a.class).getConstructor(d.class).newInstance(a.f2122a);
            } catch (Throwable th2) {
                obj = th2;
                aVar = null;
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new a(a.f2122a);
        }
        f2125a = aVar;
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, c.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(d dVar) {
        f2125a.a(dVar);
    }

    public static d b(String str) {
        return f2125a.b(str, Long.MIN_VALUE);
    }

    public static d c(String str, long j3) {
        return f2125a.b(str, j3);
    }

    public static void d(String str, d dVar) {
        f2125a.c(str, dVar);
    }

    public static void e(b bVar) {
        f2125a.d(bVar);
    }

    public static b f() {
        return f2125a.e();
    }

    public static void g() {
        f2125a.g();
    }

    public static e h(String str) {
        f2125a.f(str);
        return e.f2128a;
    }
}
