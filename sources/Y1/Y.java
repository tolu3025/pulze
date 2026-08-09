package y1;

import e0.AbstractC0829j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.k0;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f11835c = Logger.getLogger(Y.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Y f11836d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f11837a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f11838b = Collections.emptyList();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(X x2, X x3) {
            return x2.c() - x3.c();
        }
    }

    private static final class b implements k0.b {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // y1.k0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(X x2) {
            return x2.c();
        }

        @Override // y1.k0.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(X x2) {
            return x2.b();
        }
    }

    private synchronized void a(X x2) {
        AbstractC0829j.e(x2.b(), "isAvailable() returned false");
        this.f11837a.add(x2);
    }

    public static synchronized Y b() {
        try {
            if (f11836d == null) {
                List<X> listE = k0.e(X.class, c(), X.class.getClassLoader(), new b(null));
                f11836d = new Y();
                for (X x2 : listE) {
                    f11835c.fine("Service loader found " + x2);
                    f11836d.a(x2);
                }
                f11836d.f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11836d;
    }

    static List c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(A1.g.class);
        } catch (ClassNotFoundException e3) {
            f11835c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e3);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e4) {
            f11835c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e4);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e5) {
            f11835c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e5);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void f() {
        ArrayList arrayList = new ArrayList(this.f11837a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f11838b = Collections.unmodifiableList(arrayList);
    }

    X d() {
        List listE = e();
        if (listE.isEmpty()) {
            return null;
        }
        return (X) listE.get(0);
    }

    synchronized List e() {
        return this.f11838b;
    }
}
