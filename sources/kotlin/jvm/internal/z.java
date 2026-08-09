package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final A f9751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Z1.c[] f9752b;

    static {
        A a3 = null;
        try {
            a3 = (A) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (a3 == null) {
            a3 = new A();
        }
        f9751a = a3;
        f9752b = new Z1.c[0];
    }

    public static Z1.e a(j jVar) {
        return f9751a.a(jVar);
    }

    public static Z1.c b(Class cls) {
        return f9751a.b(cls);
    }

    public static Z1.d c(Class cls) {
        return f9751a.c(cls, "");
    }

    public static Z1.f d(p pVar) {
        return f9751a.d(pVar);
    }

    public static Z1.g e(r rVar) {
        return f9751a.e(rVar);
    }

    public static Z1.h f(t tVar) {
        return f9751a.f(tVar);
    }

    public static String g(i iVar) {
        return f9751a.g(iVar);
    }

    public static String h(n nVar) {
        return f9751a.h(nVar);
    }
}
