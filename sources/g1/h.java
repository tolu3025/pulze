package G1;

import e0.AbstractC0829j;
import f0.AbstractC0847f;
import io.grpc.internal.L0;
import io.grpc.internal.S0;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import y1.AbstractC1303f;
import y1.AbstractC1308k;
import y1.C1298a;
import y1.C1314q;
import y1.C1320x;
import y1.EnumC1313p;
import y1.S;
import y1.Z;
import y1.l0;
import y1.p0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends S {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final C1298a.c f2024p = C1298a.c.a("addressTrackerKey");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final c f2025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p0 f2026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final S.e f2027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final G1.e f2028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private S0 f2029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ScheduledExecutorService f2030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p0.d f2031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Long f2032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AbstractC1303f f2033o;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f2034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile a f2035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f2036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f2037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f2038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Set f2039f = new HashSet();

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            AtomicLong f2040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            AtomicLong f2041b;

            private a() {
                this.f2040a = new AtomicLong();
                this.f2041b = new AtomicLong();
            }

            void a() {
                this.f2040a.set(0L);
                this.f2041b.set(0L);
            }
        }

        b(g gVar) {
            this.f2035b = new a();
            this.f2036c = new a();
            this.f2034a = gVar;
        }

        boolean b(i iVar) {
            if (m() && !iVar.o()) {
                iVar.n();
            } else if (!m() && iVar.o()) {
                iVar.q();
            }
            iVar.p(this);
            return this.f2039f.add(iVar);
        }

        void c() {
            int i3 = this.f2038e;
            this.f2038e = i3 == 0 ? 0 : i3 - 1;
        }

        void d(long j3) {
            this.f2037d = Long.valueOf(j3);
            this.f2038e++;
            Iterator it = this.f2039f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).n();
            }
        }

        double e() {
            return this.f2036c.f2041b.get() / f();
        }

        long f() {
            return this.f2036c.f2040a.get() + this.f2036c.f2041b.get();
        }

        void g(boolean z2) {
            g gVar = this.f2034a;
            if (gVar.f2054e == null && gVar.f2055f == null) {
                return;
            }
            (z2 ? this.f2035b.f2040a : this.f2035b.f2041b).getAndIncrement();
        }

        public boolean h(long j3) {
            return j3 > this.f2037d.longValue() + Math.min(this.f2034a.f2051b.longValue() * ((long) this.f2038e), Math.max(this.f2034a.f2051b.longValue(), this.f2034a.f2052c.longValue()));
        }

        boolean i(i iVar) {
            iVar.m();
            return this.f2039f.remove(iVar);
        }

        void j() {
            this.f2035b.a();
            this.f2036c.a();
        }

        void k() {
            this.f2038e = 0;
        }

        void l(g gVar) {
            this.f2034a = gVar;
        }

        boolean m() {
            return this.f2037d != null;
        }

        double n() {
            return this.f2036c.f2040a.get() / f();
        }

        void o() {
            this.f2036c.a();
            a aVar = this.f2035b;
            this.f2035b = this.f2036c;
            this.f2036c = aVar;
        }

        void p() {
            AbstractC0829j.u(this.f2037d != null, "not currently ejected");
            this.f2037d = null;
            Iterator it = this.f2039f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).q();
            }
        }

        public String toString() {
            return "AddressTracker{subchannels=" + this.f2039f + '}';
        }
    }

    static class c extends AbstractC0847f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f2042a = new HashMap();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f0.AbstractC0848g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map a() {
            return this.f2042a;
        }

        void c() {
            for (b bVar : this.f2042a.values()) {
                if (bVar.m()) {
                    bVar.p();
                }
                bVar.k();
            }
        }

        double d() {
            if (this.f2042a.isEmpty()) {
                return 0.0d;
            }
            Iterator it = this.f2042a.values().iterator();
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                i4++;
                if (((b) it.next()).m()) {
                    i3++;
                }
            }
            return (((double) i3) / ((double) i4)) * 100.0d;
        }

        void e(Long l3) {
            for (b bVar : this.f2042a.values()) {
                if (!bVar.m()) {
                    bVar.c();
                }
                if (bVar.m() && bVar.h(l3.longValue())) {
                    bVar.p();
                }
            }
        }

        void f(g gVar, Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                SocketAddress socketAddress = (SocketAddress) it.next();
                if (!this.f2042a.containsKey(socketAddress)) {
                    this.f2042a.put(socketAddress, new b(gVar));
                }
            }
        }

        void g() {
            Iterator it = this.f2042a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).j();
            }
        }

        void h() {
            Iterator it = this.f2042a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).o();
            }
        }

        void i(g gVar) {
            Iterator it = this.f2042a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).l(gVar);
            }
        }
    }

    class d extends G1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private S.e f2043a;

        d(S.e eVar) {
            this.f2043a = new G1.f(eVar);
        }

        @Override // G1.c, y1.S.e
        public S.i a(S.b bVar) {
            i iVar = h.this.new i(bVar, this.f2043a);
            List listA = bVar.a();
            if (h.m(listA) && h.this.f2025g.containsKey(((C1320x) listA.get(0)).a().get(0))) {
                b bVar2 = (b) h.this.f2025g.get(((C1320x) listA.get(0)).a().get(0));
                bVar2.b(iVar);
                if (bVar2.f2037d != null) {
                    iVar.n();
                }
            }
            return iVar;
        }

        @Override // G1.c, y1.S.e
        public void f(EnumC1313p enumC1313p, S.j jVar) {
            this.f2043a.f(enumC1313p, h.this.new C0039h(jVar));
        }

        @Override // G1.c
        protected S.e g() {
            return this.f2043a;
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f2045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        AbstractC1303f f2046b;

        e(g gVar, AbstractC1303f abstractC1303f) {
            this.f2045a = gVar;
            this.f2046b = abstractC1303f;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f2032n = Long.valueOf(hVar.f2029k.a());
            h.this.f2025g.h();
            for (j jVar : G1.i.a(this.f2045a, this.f2046b)) {
                h hVar2 = h.this;
                jVar.a(hVar2.f2025g, hVar2.f2032n.longValue());
            }
            h hVar3 = h.this;
            hVar3.f2025g.e(hVar3.f2032n);
        }
    }

    static class f implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f2048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC1303f f2049b;

        f(g gVar, AbstractC1303f abstractC1303f) {
            this.f2048a = gVar;
            this.f2049b = abstractC1303f;
        }

        @Override // G1.h.j
        public void a(c cVar, long j3) {
            List<b> listN = h.n(cVar, this.f2048a.f2055f.f2067d.intValue());
            if (listN.size() < this.f2048a.f2055f.f2066c.intValue() || listN.size() == 0) {
                return;
            }
            for (b bVar : listN) {
                if (cVar.d() >= this.f2048a.f2053d.intValue()) {
                    return;
                }
                if (bVar.f() >= this.f2048a.f2055f.f2067d.intValue() && bVar.e() > ((double) this.f2048a.f2055f.f2064a.intValue()) / 100.0d) {
                    this.f2049b.b(AbstractC1303f.a.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", bVar, Double.valueOf(bVar.e()));
                    if (new Random().nextInt(100) < this.f2048a.f2055f.f2065b.intValue()) {
                        bVar.d(j3);
                    }
                }
            }
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f2050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f2051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f2052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f2053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f2054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final b f2055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final L0.b f2056g;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Long f2057a = 10000000000L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Long f2058b = 30000000000L;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Long f2059c = 300000000000L;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Integer f2060d = 10;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            c f2061e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            b f2062f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            L0.b f2063g;

            public g a() {
                AbstractC0829j.t(this.f2063g != null);
                return new g(this.f2057a, this.f2058b, this.f2059c, this.f2060d, this.f2061e, this.f2062f, this.f2063g);
            }

            public a b(Long l3) {
                AbstractC0829j.d(l3 != null);
                this.f2058b = l3;
                return this;
            }

            public a c(L0.b bVar) {
                AbstractC0829j.t(bVar != null);
                this.f2063g = bVar;
                return this;
            }

            public a d(b bVar) {
                this.f2062f = bVar;
                return this;
            }

            public a e(Long l3) {
                AbstractC0829j.d(l3 != null);
                this.f2057a = l3;
                return this;
            }

            public a f(Integer num) {
                AbstractC0829j.d(num != null);
                this.f2060d = num;
                return this;
            }

            public a g(Long l3) {
                AbstractC0829j.d(l3 != null);
                this.f2059c = l3;
                return this;
            }

            public a h(c cVar) {
                this.f2061e = cVar;
                return this;
            }
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f2064a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f2065b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f2066c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f2067d;

            public static class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Integer f2068a = 85;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Integer f2069b = 100;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Integer f2070c = 5;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Integer f2071d = 50;

                public b a() {
                    return new b(this.f2068a, this.f2069b, this.f2070c, this.f2071d);
                }

                public a b(Integer num) {
                    boolean z2 = false;
                    AbstractC0829j.d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z2 = true;
                    }
                    AbstractC0829j.d(z2);
                    this.f2069b = num;
                    return this;
                }

                public a c(Integer num) {
                    AbstractC0829j.d(num != null);
                    AbstractC0829j.d(num.intValue() >= 0);
                    this.f2070c = num;
                    return this;
                }

                public a d(Integer num) {
                    AbstractC0829j.d(num != null);
                    AbstractC0829j.d(num.intValue() >= 0);
                    this.f2071d = num;
                    return this;
                }

                public a e(Integer num) {
                    boolean z2 = false;
                    AbstractC0829j.d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z2 = true;
                    }
                    AbstractC0829j.d(z2);
                    this.f2068a = num;
                    return this;
                }
            }

            b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f2064a = num;
                this.f2065b = num2;
                this.f2066c = num3;
                this.f2067d = num4;
            }
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f2072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f2073b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f2074c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f2075d;

            public static final class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Integer f2076a = 1900;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Integer f2077b = 100;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Integer f2078c = 5;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Integer f2079d = 100;

                public c a() {
                    return new c(this.f2076a, this.f2077b, this.f2078c, this.f2079d);
                }

                public a b(Integer num) {
                    boolean z2 = false;
                    AbstractC0829j.d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z2 = true;
                    }
                    AbstractC0829j.d(z2);
                    this.f2077b = num;
                    return this;
                }

                public a c(Integer num) {
                    AbstractC0829j.d(num != null);
                    AbstractC0829j.d(num.intValue() >= 0);
                    this.f2078c = num;
                    return this;
                }

                public a d(Integer num) {
                    AbstractC0829j.d(num != null);
                    AbstractC0829j.d(num.intValue() >= 0);
                    this.f2079d = num;
                    return this;
                }

                public a e(Integer num) {
                    AbstractC0829j.d(num != null);
                    this.f2076a = num;
                    return this;
                }
            }

            c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f2072a = num;
                this.f2073b = num2;
                this.f2074c = num3;
                this.f2075d = num4;
            }
        }

        private g(Long l3, Long l4, Long l5, Integer num, c cVar, b bVar, L0.b bVar2) {
            this.f2050a = l3;
            this.f2051b = l4;
            this.f2052c = l5;
            this.f2053d = num;
            this.f2054e = cVar;
            this.f2055f = bVar;
            this.f2056g = bVar2;
        }

        boolean a() {
            return (this.f2054e == null && this.f2055f == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: G1.h$h, reason: collision with other inner class name */
    class C0039h extends S.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S.j f2080a;

        /* JADX INFO: renamed from: G1.h$h$a */
        class a extends AbstractC1308k.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f2082a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final AbstractC1308k.a f2083b;

            /* JADX INFO: renamed from: G1.h$h$a$a, reason: collision with other inner class name */
            class C0040a extends G1.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ AbstractC1308k f2085b;

                C0040a(AbstractC1308k abstractC1308k) {
                    this.f2085b = abstractC1308k;
                }

                @Override // y1.o0
                public void i(l0 l0Var) {
                    a.this.f2082a.g(l0Var.o());
                    o().i(l0Var);
                }

                @Override // G1.a
                protected AbstractC1308k o() {
                    return this.f2085b;
                }
            }

            /* JADX INFO: renamed from: G1.h$h$a$b */
            class b extends AbstractC1308k {
                b() {
                }

                @Override // y1.o0
                public void i(l0 l0Var) {
                    a.this.f2082a.g(l0Var.o());
                }
            }

            a(b bVar, AbstractC1308k.a aVar) {
                this.f2082a = bVar;
                this.f2083b = aVar;
            }

            @Override // y1.AbstractC1308k.a
            public AbstractC1308k a(AbstractC1308k.b bVar, Z z2) {
                AbstractC1308k.a aVar = this.f2083b;
                return aVar != null ? new C0040a(aVar.a(bVar, z2)) : new b();
            }
        }

        C0039h(S.j jVar) {
            this.f2080a = jVar;
        }

        @Override // y1.S.j
        public S.f a(S.g gVar) {
            S.f fVarA = this.f2080a.a(gVar);
            S.i iVarC = fVarA.c();
            return iVarC != null ? S.f.i(iVarC, new a((b) iVarC.c().b(h.f2024p), fVarA.b())) : fVarA;
        }
    }

    class i extends G1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S.i f2088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f2089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C1314q f2091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private S.k f2092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AbstractC1303f f2093f;

        class a implements S.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final S.k f2095a;

            a(S.k kVar) {
                this.f2095a = kVar;
            }

            @Override // y1.S.k
            public void a(C1314q c1314q) {
                i.this.f2091d = c1314q;
                if (i.this.f2090c) {
                    return;
                }
                this.f2095a.a(c1314q);
            }
        }

        i(S.b bVar, S.e eVar) {
            S.i iVarA;
            S.b.C0190b c0190b = S.f11804c;
            S.k kVar = (S.k) bVar.c(c0190b);
            if (kVar != null) {
                this.f2092e = kVar;
                iVarA = eVar.a(bVar.e().b(c0190b, new a(kVar)).c());
            } else {
                iVarA = eVar.a(bVar);
            }
            this.f2088a = iVarA;
            this.f2093f = this.f2088a.d();
        }

        @Override // G1.d, y1.S.i
        public C1298a c() {
            return this.f2089b != null ? this.f2088a.c().d().d(h.f2024p, this.f2089b).a() : this.f2088a.c();
        }

        @Override // G1.d, y1.S.i
        public void g() {
            b bVar = this.f2089b;
            if (bVar != null) {
                bVar.i(this);
            }
            super.g();
        }

        @Override // G1.d, y1.S.i
        public void h(S.k kVar) {
            if (this.f2092e != null) {
                super.h(kVar);
            } else {
                this.f2092e = kVar;
                super.h(new a(kVar));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00aa A[PHI: r0
          0x00aa: PHI (r0v20 java.net.SocketAddress) = (r0v11 java.net.SocketAddress), (r0v32 java.net.SocketAddress) binds: [B:24:0x00a8, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // G1.d, y1.S.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(java.util.List r4) {
            /*
                r3 = this;
                java.util.List r0 = r3.b()
                boolean r0 = G1.h.j(r0)
                r1 = 0
                if (r0 == 0) goto L3d
                boolean r0 = G1.h.j(r4)
                if (r0 == 0) goto L3d
                G1.h r0 = G1.h.this
                G1.h$c r0 = r0.f2025g
                G1.h$b r2 = r3.f2089b
                boolean r0 = r0.containsValue(r2)
                if (r0 == 0) goto L22
                G1.h$b r0 = r3.f2089b
                r0.i(r3)
            L22:
                java.lang.Object r0 = r4.get(r1)
                y1.x r0 = (y1.C1320x) r0
                java.util.List r0 = r0.a()
                java.lang.Object r0 = r0.get(r1)
                java.net.SocketAddress r0 = (java.net.SocketAddress) r0
                G1.h r1 = G1.h.this
                G1.h$c r1 = r1.f2025g
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto Lb7
                goto Laa
            L3d:
                java.util.List r0 = r3.b()
                boolean r0 = G1.h.j(r0)
                if (r0 == 0) goto L80
                boolean r0 = G1.h.j(r4)
                if (r0 != 0) goto L80
                G1.h r0 = G1.h.this
                G1.h$c r0 = r0.f2025g
                y1.x r2 = r3.a()
                java.util.List r2 = r2.a()
                java.lang.Object r2 = r2.get(r1)
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto Lb7
                G1.h r0 = G1.h.this
                G1.h$c r0 = r0.f2025g
                y1.x r2 = r3.a()
                java.util.List r2 = r2.a()
                java.lang.Object r1 = r2.get(r1)
                java.lang.Object r0 = r0.get(r1)
                G1.h$b r0 = (G1.h.b) r0
                r0.i(r3)
                r0.j()
                goto Lb7
            L80:
                java.util.List r0 = r3.b()
                boolean r0 = G1.h.j(r0)
                if (r0 != 0) goto Lb7
                boolean r0 = G1.h.j(r4)
                if (r0 == 0) goto Lb7
                java.lang.Object r0 = r4.get(r1)
                y1.x r0 = (y1.C1320x) r0
                java.util.List r0 = r0.a()
                java.lang.Object r0 = r0.get(r1)
                java.net.SocketAddress r0 = (java.net.SocketAddress) r0
                G1.h r1 = G1.h.this
                G1.h$c r1 = r1.f2025g
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto Lb7
            Laa:
                G1.h r1 = G1.h.this
                G1.h$c r1 = r1.f2025g
                java.lang.Object r0 = r1.get(r0)
                G1.h$b r0 = (G1.h.b) r0
                r0.b(r3)
            Lb7:
                y1.S$i r0 = r3.f2088a
                r0.i(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G1.h.i.i(java.util.List):void");
        }

        @Override // G1.d
        protected S.i j() {
            return this.f2088a;
        }

        void m() {
            this.f2089b = null;
        }

        void n() {
            this.f2090c = true;
            this.f2092e.a(C1314q.b(l0.f11975t));
            this.f2093f.b(AbstractC1303f.a.INFO, "Subchannel ejected: {0}", this);
        }

        boolean o() {
            return this.f2090c;
        }

        void p(b bVar) {
            this.f2089b = bVar;
        }

        void q() {
            this.f2090c = false;
            C1314q c1314q = this.f2091d;
            if (c1314q != null) {
                this.f2092e.a(c1314q);
                this.f2093f.b(AbstractC1303f.a.INFO, "Subchannel unejected: {0}", this);
            }
        }

        @Override // G1.d
        public String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.f2088a.b() + '}';
        }
    }

    interface j {
        void a(c cVar, long j3);
    }

    static class k implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f2097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC1303f f2098b;

        k(g gVar, AbstractC1303f abstractC1303f) {
            AbstractC0829j.e(gVar.f2054e != null, "success rate ejection config is null");
            this.f2097a = gVar;
            this.f2098b = abstractC1303f;
        }

        static double b(Collection collection) {
            Iterator it = collection.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += ((Double) it.next()).doubleValue();
            }
            return dDoubleValue / ((double) collection.size());
        }

        static double c(Collection collection, double d3) {
            Iterator it = collection.iterator();
            double d4 = 0.0d;
            while (it.hasNext()) {
                double dDoubleValue = ((Double) it.next()).doubleValue() - d3;
                d4 += dDoubleValue * dDoubleValue;
            }
            return Math.sqrt(d4 / ((double) collection.size()));
        }

        @Override // G1.h.j
        public void a(c cVar, long j3) {
            Iterator it;
            List listN = h.n(cVar, this.f2097a.f2054e.f2075d.intValue());
            if (listN.size() < this.f2097a.f2054e.f2074c.intValue() || listN.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listN.iterator();
            while (it2.hasNext()) {
                arrayList.add(Double.valueOf(((b) it2.next()).n()));
            }
            double dB = b(arrayList);
            double dC = c(arrayList, dB);
            double dIntValue = dB - (((double) (this.f2097a.f2054e.f2072a.intValue() / 1000.0f)) * dC);
            Iterator it3 = listN.iterator();
            while (it3.hasNext()) {
                b bVar = (b) it3.next();
                if (cVar.d() >= this.f2097a.f2053d.intValue()) {
                    return;
                }
                if (bVar.n() < dIntValue) {
                    it = it3;
                    this.f2098b.b(AbstractC1303f.a.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", bVar, Double.valueOf(bVar.n()), Double.valueOf(dB), Double.valueOf(dC), Double.valueOf(dIntValue));
                    if (new Random().nextInt(100) < this.f2097a.f2054e.f2073b.intValue()) {
                        bVar.d(j3);
                    }
                } else {
                    it = it3;
                }
                it3 = it;
            }
        }
    }

    public h(S.e eVar, S0 s02) {
        AbstractC1303f abstractC1303fB = eVar.b();
        this.f2033o = abstractC1303fB;
        d dVar = new d((S.e) AbstractC0829j.o(eVar, "helper"));
        this.f2027i = dVar;
        this.f2028j = new G1.e(dVar);
        this.f2025g = new c();
        this.f2026h = (p0) AbstractC0829j.o(eVar.d(), "syncContext");
        this.f2030l = (ScheduledExecutorService) AbstractC0829j.o(eVar.c(), "timeService");
        this.f2029k = s02;
        abstractC1303fB.a(AbstractC1303f.a.DEBUG, "OutlierDetection lb created.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C1320x) it.next()).a().size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List n(c cVar, int i3) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : cVar.values()) {
            if (bVar.f() >= i3) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // y1.S
    public l0 a(S.h hVar) {
        this.f2033o.b(AbstractC1303f.a.DEBUG, "Received resolution result: {0}", hVar);
        g gVar = (g) hVar.c();
        ArrayList arrayList = new ArrayList();
        Iterator it = hVar.a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C1320x) it.next()).a());
        }
        this.f2025g.keySet().retainAll(arrayList);
        this.f2025g.i(gVar);
        this.f2025g.f(gVar, arrayList);
        this.f2028j.r(gVar.f2056g.b());
        if (gVar.a()) {
            Long lValueOf = this.f2032n == null ? gVar.f2050a : Long.valueOf(Math.max(0L, gVar.f2050a.longValue() - (this.f2029k.a() - this.f2032n.longValue())));
            p0.d dVar = this.f2031m;
            if (dVar != null) {
                dVar.a();
                this.f2025g.g();
            }
            this.f2031m = this.f2026h.e(new e(gVar, this.f2033o), lValueOf.longValue(), gVar.f2050a.longValue(), TimeUnit.NANOSECONDS, this.f2030l);
        } else {
            p0.d dVar2 = this.f2031m;
            if (dVar2 != null) {
                dVar2.a();
                this.f2032n = null;
                this.f2025g.c();
            }
        }
        this.f2028j.d(hVar.e().d(gVar.f2056g.a()).a());
        return l0.f11960e;
    }

    @Override // y1.S
    public void c(l0 l0Var) {
        this.f2028j.c(l0Var);
    }

    @Override // y1.S
    public void f() {
        this.f2028j.f();
    }
}
