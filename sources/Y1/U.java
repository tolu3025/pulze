package y1;

import e0.AbstractC0829j;
import io.grpc.internal.C0973v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.k0;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static U f11831d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f11833a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f11834b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f11830c = Logger.getLogger(U.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Iterable f11832e = c();

    private static final class a implements k0.b {
        a() {
        }

        @Override // y1.k0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(T t2) {
            return t2.c();
        }

        @Override // y1.k0.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(T t2) {
            return t2.d();
        }
    }

    private synchronized void a(T t2) {
        AbstractC0829j.e(t2.d(), "isAvailable() returned false");
        this.f11833a.add(t2);
    }

    public static synchronized U b() {
        try {
            if (f11831d == null) {
                List<T> listE = k0.e(T.class, f11832e, T.class.getClassLoader(), new a());
                f11831d = new U();
                for (T t2 : listE) {
                    f11830c.fine("Service loader found " + t2);
                    f11831d.a(t2);
                }
                f11831d.e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11831d;
    }

    static List c() {
        ArrayList arrayList = new ArrayList();
        try {
            int i3 = C0973v0.f9358c;
            arrayList.add(C0973v0.class);
        } catch (ClassNotFoundException e3) {
            f11830c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e3);
        }
        try {
            int i4 = G1.l.f2104b;
            arrayList.add(G1.l.class);
        } catch (ClassNotFoundException e4) {
            f11830c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e4);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void e() {
        try {
            this.f11834b.clear();
            for (T t2 : this.f11833a) {
                String strB = t2.b();
                T t3 = (T) this.f11834b.get(strB);
                if (t3 == null || t3.c() < t2.c()) {
                    this.f11834b.put(strB, t2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized T d(String str) {
        return (T) this.f11834b.get(AbstractC0829j.o(str, "policy"));
    }
}
