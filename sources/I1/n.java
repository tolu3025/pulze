package I1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2411b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2412a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f2413a;

        public b(Throwable exception) {
            kotlin.jvm.internal.m.e(exception, "exception");
            this.f2413a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.m.a(this.f2413a, ((b) obj).f2413a);
        }

        public int hashCode() {
            return this.f2413a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f2413a + ')';
        }
    }

    private /* synthetic */ n(Object obj) {
        this.f2412a = obj;
    }

    public static final /* synthetic */ n a(Object obj) {
        return new n(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof n) && kotlin.jvm.internal.m.a(obj, ((n) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f2413a;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof b);
    }

    public static String h(Object obj) {
        if (obj instanceof b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f2412a, obj);
    }

    public int hashCode() {
        return e(this.f2412a);
    }

    public final /* synthetic */ Object i() {
        return this.f2412a;
    }

    public String toString() {
        return h(this.f2412a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
