package Y1;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Y1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3536e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f3537f = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public c(char c3, char c4) {
        super(c3, c4, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (a() != cVar.a() || b() != cVar.b()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    public boolean isEmpty() {
        return m.f(a(), b()) > 0;
    }

    public String toString() {
        return a() + ".." + b();
    }
}
