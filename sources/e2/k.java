package e2;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7166a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f7167b = new c();

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f7168a;

        public a(Throwable th) {
            this.f7168a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.m.a(this.f7168a, ((a) obj).f7168a);
        }

        public int hashCode() {
            Throwable th = this.f7168a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // e2.k.c
        public String toString() {
            return "Closed(" + this.f7168a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final Object a(Throwable th) {
            return k.b(new a(th));
        }

        public final Object b() {
            return k.b(k.f7167b);
        }

        public final Object c(Object obj) {
            return k.b(obj);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static final Throwable c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f7168a;
        }
        return null;
    }

    public static final Object d(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static final boolean e(Object obj) {
        return obj instanceof a;
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof c);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
