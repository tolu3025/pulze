package io.grpc.internal;

import c.AbstractC0527b;
import e0.AbstractC0829j;
import e0.AbstractC0834o;
import e0.AbstractC0836q;
import e0.C0831l;
import io.grpc.internal.M0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.C1298a;
import y1.C1320x;
import y1.c0;

/* JADX INFO: loaded from: classes.dex */
public class D extends y1.c0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static String f8434A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Logger f8435s = Logger.getLogger(D.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f8436t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f8437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f8438v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f8439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static boolean f8440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static boolean f8441y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static boolean f8442z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y1.h0 f8443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Random f8444b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile b f8445c = d.INSTANCE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f8446d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final M0.d f8450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f8451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final y1.p0 f8452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C0831l f8453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f8454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f8455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Executor f8456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f8457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c0.f f8458p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f8459q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c0.d f8460r;

    public interface b {
        List c(String str);
    }

    protected static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y1.l0 f8461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f8462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c0.b f8463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C1298a f8464d;

        private c() {
        }
    }

    private enum d implements b {
        INSTANCE;

        @Override // io.grpc.internal.D.b
        public List c(String str) {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    private final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0.d f8467a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f8469a;

            a(boolean z2) {
                this.f8469a = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f8469a) {
                    D d3 = D.this;
                    d3.f8454l = true;
                    if (d3.f8451i > 0) {
                        D.this.f8453k.f().g();
                    }
                }
                D.this.f8459q = false;
            }
        }

        e(c0.d dVar) {
            this.f8467a = (c0.d) AbstractC0829j.o(dVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            y1.p0 p0Var;
            a aVar;
            Logger logger = D.f8435s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                D.f8435s.finer("Attempting DNS resolution of " + D.this.f8448f);
            }
            c cVarN = null;
            try {
                try {
                    C1320x c1320xM = D.this.m();
                    c0.e.a aVarD = c0.e.d();
                    if (c1320xM != null) {
                        if (D.f8435s.isLoggable(level)) {
                            D.f8435s.finer("Using proxy address " + c1320xM);
                        }
                        aVarD.b(Collections.singletonList(c1320xM));
                    } else {
                        cVarN = D.this.n(false);
                        if (cVarN.f8461a != null) {
                            this.f8467a.a(cVarN.f8461a);
                            D.this.f8452j.execute(new a(cVarN != null && cVarN.f8461a == null));
                            return;
                        }
                        if (cVarN.f8462b != null) {
                            aVarD.b(cVarN.f8462b);
                        }
                        if (cVarN.f8463c != null) {
                            aVarD.d(cVarN.f8463c);
                        }
                        C1298a c1298a = cVarN.f8464d;
                        if (c1298a != null) {
                            aVarD.c(c1298a);
                        }
                    }
                    this.f8467a.b(aVarD.a());
                    z2 = cVarN != null && cVarN.f8461a == null;
                    p0Var = D.this.f8452j;
                    aVar = new a(z2);
                } catch (IOException e3) {
                    this.f8467a.a(y1.l0.f11975t.q("Unable to resolve host " + D.this.f8448f).p(e3));
                    z2 = 0 != 0 && null.f8461a == null;
                    p0Var = D.this.f8452j;
                    aVar = new a(z2);
                }
                p0Var.execute(aVar);
            } catch (Throwable th) {
                D.this.f8452j.execute(new a(0 != 0 && null.f8461a == null));
                throw th;
            }
        }
    }

    public interface f {
    }

    interface g {
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f8437u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f8438v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f8439w = property3;
        f8440x = Boolean.parseBoolean(property);
        f8441y = Boolean.parseBoolean(property2);
        f8442z = Boolean.parseBoolean(property3);
        u(D.class.getClassLoader());
    }

    protected D(String str, String str2, c0.a aVar, M0.d dVar, C0831l c0831l, boolean z2) {
        AbstractC0829j.o(aVar, "args");
        this.f8450h = dVar;
        URI uriCreate = URI.create("//" + ((String) AbstractC0829j.o(str2, "name")));
        AbstractC0829j.j(uriCreate.getHost() != null, "Invalid DNS name: %s", str2);
        this.f8447e = (String) AbstractC0829j.p(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.f8448f = uriCreate.getHost();
        this.f8449g = uriCreate.getPort() == -1 ? aVar.a() : uriCreate.getPort();
        this.f8443a = (y1.h0) AbstractC0829j.o(aVar.c(), "proxyDetector");
        this.f8451i = r(z2);
        this.f8453k = (C0831l) AbstractC0829j.o(c0831l, "stopwatch");
        this.f8452j = (y1.p0) AbstractC0829j.o(aVar.f(), "syncContext");
        Executor executorB = aVar.b();
        this.f8456n = executorB;
        this.f8457o = executorB == null;
        this.f8458p = (c0.f) AbstractC0829j.o(aVar.e(), "serviceConfigParser");
    }

    private c0.b A() {
        List listEmptyList = Collections.emptyList();
        t();
        if (listEmptyList.isEmpty()) {
            f8435s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f8448f});
            return null;
        }
        c0.b bVarW = w(listEmptyList, this.f8444b, q());
        if (bVarW != null) {
            return bVarW.d() != null ? c0.b.b(bVarW.d()) : this.f8458p.a((Map) bVarW.c());
        }
        return null;
    }

    protected static boolean B(boolean z2, boolean z3, String str) {
        if (!z2) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z3;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z4 = true;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '.') {
                z4 &= cCharAt >= '0' && cCharAt <= '9';
            }
        }
        return true ^ z4;
    }

    private boolean l() {
        if (this.f8454l) {
            long j3 = this.f8451i;
            if (j3 != 0 && (j3 <= 0 || this.f8453k.d(TimeUnit.NANOSECONDS) <= this.f8451i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1320x m() {
        y1.g0 g0VarA = this.f8443a.a(InetSocketAddress.createUnresolved(this.f8448f, this.f8449g));
        if (g0VarA != null) {
            return new C1320x(g0VarA);
        }
        return null;
    }

    private static final List o(Map map) {
        return AbstractC0936c0.g(map, "clientLanguage");
    }

    private static final List p(Map map) {
        return AbstractC0936c0.g(map, "clientHostname");
    }

    private static String q() {
        if (f8434A == null) {
            try {
                f8434A = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e3) {
                throw new RuntimeException(e3);
            }
        }
        return f8434A;
    }

    private static long r(boolean z2) {
        if (z2) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j3 = 30;
        if (property != null) {
            try {
                j3 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f8435s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j3 > 0 ? TimeUnit.SECONDS.toNanos(j3) : j3;
    }

    private static final Double s(Map map) {
        return AbstractC0936c0.h(map, "percentage");
    }

    static g u(ClassLoader classLoader) {
        Logger logger;
        Level level;
        String str;
        try {
            try {
                try {
                    AbstractC0527b.a(Class.forName("io.grpc.internal.a0", true, classLoader).asSubclass(g.class).getConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e3) {
                    e = e3;
                    logger = f8435s;
                    level = Level.FINE;
                    str = "Can't construct JndiResourceResolverFactory, skipping.";
                    logger.log(level, str, e);
                    return null;
                }
            } catch (Exception e4) {
                e = e4;
                logger = f8435s;
                level = Level.FINE;
                str = "Can't find JndiResourceResolverFactory ctor, skipping.";
            }
        } catch (ClassCastException e5) {
            e = e5;
            logger = f8435s;
            level = Level.FINE;
            str = "Unable to cast JndiResourceResolverFactory, skipping.";
        } catch (ClassNotFoundException e6) {
            e = e6;
            logger = f8435s;
            level = Level.FINE;
            str = "Unable to find JndiResourceResolverFactory, skipping.";
        }
    }

    static Map v(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            AbstractC0836q.a(f8436t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listO = o(map);
        if (listO != null && !listO.isEmpty()) {
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dS = s(map);
        if (dS != null) {
            int iIntValue = dS.intValue();
            AbstractC0836q.a(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dS);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listP = p(map);
        if (listP != null && !listP.isEmpty()) {
            Iterator it2 = listP.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapJ = AbstractC0936c0.j(map, "serviceConfig");
        if (mapJ != null) {
            return mapJ;
        }
        throw new e0.r(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    static c0.b w(List list, Random random, String str) {
        y1.l0 l0Var;
        String str2;
        try {
            Iterator it = x(list).iterator();
            Map mapV = null;
            while (it.hasNext()) {
                try {
                    mapV = v((Map) it.next(), random, str);
                    if (mapV != null) {
                        break;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    l0Var = y1.l0.f11962g;
                    str2 = "failed to pick service config choice";
                    return c0.b.b(l0Var.q(str2).p(e));
                }
            }
            if (mapV == null) {
                return null;
            }
            return c0.b.a(mapV);
        } catch (IOException | RuntimeException e4) {
            e = e4;
            l0Var = y1.l0.f11962g;
            str2 = "failed to parse TXT records";
        }
    }

    static List x(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                Object objA = AbstractC0934b0.a(str.substring(12));
                if (!(objA instanceof List)) {
                    throw new ClassCastException("wrong type " + objA);
                }
                arrayList.addAll(AbstractC0936c0.a((List) objA));
            } else {
                f8435s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    private void y() {
        if (this.f8459q || this.f8455m || !l()) {
            return;
        }
        this.f8459q = true;
        this.f8456n.execute(new e(this.f8460r));
    }

    private List z() {
        Exception e3 = null;
        try {
            try {
                List listC = this.f8445c.c(this.f8448f);
                ArrayList arrayList = new ArrayList(listC.size());
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C1320x(new InetSocketAddress((InetAddress) it.next(), this.f8449g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e4) {
                e3 = e4;
                AbstractC0834o.f(e3);
                throw new RuntimeException(e3);
            }
        } catch (Throwable th) {
            if (e3 != null) {
                f8435s.log(Level.FINE, "Address resolution failure", (Throwable) e3);
            }
            throw th;
        }
    }

    @Override // y1.c0
    public String a() {
        return this.f8447e;
    }

    @Override // y1.c0
    public void b() {
        AbstractC0829j.u(this.f8460r != null, "not started");
        y();
    }

    @Override // y1.c0
    public void c() {
        if (this.f8455m) {
            return;
        }
        this.f8455m = true;
        Executor executor = this.f8456n;
        if (executor == null || !this.f8457o) {
            return;
        }
        this.f8456n = (Executor) M0.f(this.f8450h, executor);
    }

    @Override // y1.c0
    public void d(c0.d dVar) {
        AbstractC0829j.u(this.f8460r == null, "already started");
        if (this.f8457o) {
            this.f8456n = (Executor) M0.d(this.f8450h);
        }
        this.f8460r = (c0.d) AbstractC0829j.o(dVar, "listener");
        y();
    }

    protected c n(boolean z2) {
        c cVar = new c();
        try {
            cVar.f8462b = z();
        } catch (Exception e3) {
            if (!z2) {
                cVar.f8461a = y1.l0.f11975t.q("Unable to resolve host " + this.f8448f).p(e3);
                return cVar;
            }
        }
        if (f8442z) {
            cVar.f8463c = A();
        }
        return cVar;
    }

    protected f t() {
        if (!B(f8440x, f8441y, this.f8448f)) {
            return null;
        }
        AbstractC0527b.a(this.f8446d.get());
        return null;
    }
}
