package y1;

import e0.AbstractC0829j;
import f0.AbstractC0852k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.c0;
import y1.k0;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f11932e = Logger.getLogger(e0.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static e0 f11933f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0.c f11934a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11935b = "unknown";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f11936c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC0852k f11937d = AbstractC0852k.j();

    private final class b extends c0.c {
        private b() {
        }
    }

    private static final class c implements k0.b {
        private c() {
        }

        @Override // y1.k0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(d0 d0Var) {
            return d0Var.f();
        }

        @Override // y1.k0.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(d0 d0Var) {
            return d0Var.e();
        }
    }

    private synchronized void a(d0 d0Var) {
        AbstractC0829j.e(d0Var.e(), "isAvailable() returned false");
        this.f11936c.add(d0Var);
    }

    public static synchronized e0 b() {
        try {
            if (f11933f == null) {
                List<d0> listE = k0.e(d0.class, d(), d0.class.getClassLoader(), new c());
                if (listE.isEmpty()) {
                    f11932e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f11933f = new e0();
                for (d0 d0Var : listE) {
                    f11932e.fine("Service loader found " + d0Var);
                    f11933f.a(d0Var);
                }
                f11933f.g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11933f;
    }

    static List d() {
        ArrayList arrayList = new ArrayList();
        try {
            int i3 = io.grpc.internal.E.f8584b;
            arrayList.add(io.grpc.internal.E.class);
        } catch (ClassNotFoundException e3) {
            f11932e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e3);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void g() {
        try {
            HashMap map = new HashMap();
            String strD = "unknown";
            int iF = Integer.MIN_VALUE;
            for (d0 d0Var : this.f11936c) {
                String strD2 = d0Var.d();
                d0 d0Var2 = (d0) map.get(strD2);
                if (d0Var2 == null || d0Var2.f() < d0Var.f()) {
                    map.put(strD2, d0Var);
                }
                if (iF < d0Var.f()) {
                    iF = d0Var.f();
                    strD = d0Var.d();
                }
            }
            this.f11937d = AbstractC0852k.c(map);
            this.f11935b = strD;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String c() {
        return this.f11935b;
    }

    public d0 e(String str) {
        if (str == null) {
            return null;
        }
        return (d0) f().get(str.toLowerCase(Locale.US));
    }

    synchronized Map f() {
        return this.f11937d;
    }
}
