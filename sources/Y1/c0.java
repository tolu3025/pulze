package y1;

import e0.AbstractC0825f;
import e0.AbstractC0826g;
import e0.AbstractC0829j;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h0 f11909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p0 f11910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f f11911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f11912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AbstractC1303f f11913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Executor f11914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f11915h;

        /* JADX INFO: renamed from: y1.c0$a$a, reason: collision with other inner class name */
        public static final class C0194a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Integer f11916a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private h0 f11917b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private p0 f11918c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private f f11919d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private ScheduledExecutorService f11920e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private AbstractC1303f f11921f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Executor f11922g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f11923h;

            C0194a() {
            }

            public a a() {
                return new a(this.f11916a, this.f11917b, this.f11918c, this.f11919d, this.f11920e, this.f11921f, this.f11922g, this.f11923h, null);
            }

            public C0194a b(AbstractC1303f abstractC1303f) {
                this.f11921f = (AbstractC1303f) AbstractC0829j.n(abstractC1303f);
                return this;
            }

            public C0194a c(int i3) {
                this.f11916a = Integer.valueOf(i3);
                return this;
            }

            public C0194a d(Executor executor) {
                this.f11922g = executor;
                return this;
            }

            public C0194a e(String str) {
                this.f11923h = str;
                return this;
            }

            public C0194a f(h0 h0Var) {
                this.f11917b = (h0) AbstractC0829j.n(h0Var);
                return this;
            }

            public C0194a g(ScheduledExecutorService scheduledExecutorService) {
                this.f11920e = (ScheduledExecutorService) AbstractC0829j.n(scheduledExecutorService);
                return this;
            }

            public C0194a h(f fVar) {
                this.f11919d = (f) AbstractC0829j.n(fVar);
                return this;
            }

            public C0194a i(p0 p0Var) {
                this.f11918c = (p0) AbstractC0829j.n(p0Var);
                return this;
            }
        }

        private a(Integer num, h0 h0Var, p0 p0Var, f fVar, ScheduledExecutorService scheduledExecutorService, AbstractC1303f abstractC1303f, Executor executor, String str) {
            this.f11908a = ((Integer) AbstractC0829j.o(num, "defaultPort not set")).intValue();
            this.f11909b = (h0) AbstractC0829j.o(h0Var, "proxyDetector not set");
            this.f11910c = (p0) AbstractC0829j.o(p0Var, "syncContext not set");
            this.f11911d = (f) AbstractC0829j.o(fVar, "serviceConfigParser not set");
            this.f11912e = scheduledExecutorService;
            this.f11913f = abstractC1303f;
            this.f11914g = executor;
            this.f11915h = str;
        }

        public static C0194a g() {
            return new C0194a();
        }

        public int a() {
            return this.f11908a;
        }

        public Executor b() {
            return this.f11914g;
        }

        public h0 c() {
            return this.f11909b;
        }

        public ScheduledExecutorService d() {
            ScheduledExecutorService scheduledExecutorService = this.f11912e;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService;
            }
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }

        public f e() {
            return this.f11911d;
        }

        public p0 f() {
            return this.f11910c;
        }

        public String toString() {
            return AbstractC0825f.b(this).b("defaultPort", this.f11908a).d("proxyDetector", this.f11909b).d("syncContext", this.f11910c).d("serviceConfigParser", this.f11911d).d("scheduledExecutorService", this.f11912e).d("channelLogger", this.f11913f).d("executor", this.f11914g).d("overrideAuthority", this.f11915h).toString();
        }

        /* synthetic */ a(Integer num, h0 h0Var, p0 p0Var, f fVar, ScheduledExecutorService scheduledExecutorService, AbstractC1303f abstractC1303f, Executor executor, String str, b0 b0Var) {
            this(num, h0Var, p0Var, fVar, scheduledExecutorService, abstractC1303f, executor, str);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l0 f11924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f11925b;

        private b(Object obj) {
            this.f11925b = AbstractC0829j.o(obj, "config");
            this.f11924a = null;
        }

        public static b a(Object obj) {
            return new b(obj);
        }

        public static b b(l0 l0Var) {
            return new b(l0Var);
        }

        public Object c() {
            return this.f11925b;
        }

        public l0 d() {
            return this.f11924a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC0826g.a(this.f11924a, bVar.f11924a) && AbstractC0826g.a(this.f11925b, bVar.f11925b);
        }

        public int hashCode() {
            return AbstractC0826g.b(this.f11924a, this.f11925b);
        }

        public String toString() {
            AbstractC0825f.b bVarB;
            String str;
            Object obj;
            if (this.f11925b != null) {
                bVarB = AbstractC0825f.b(this);
                str = "config";
                obj = this.f11925b;
            } else {
                bVarB = AbstractC0825f.b(this);
                str = "error";
                obj = this.f11924a;
            }
            return bVarB.d(str, obj).toString();
        }

        private b(l0 l0Var) {
            this.f11925b = null;
            this.f11924a = (l0) AbstractC0829j.o(l0Var, "status");
            AbstractC0829j.j(!l0Var.o(), "cannot use OK status: %s", l0Var);
        }
    }

    public static abstract class c {
        public abstract String a();

        public abstract c0 b(URI uri, a aVar);
    }

    public static abstract class d {
        public abstract void a(l0 l0Var);

        public abstract void b(e eVar);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f11926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1298a f11927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f11928c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List f11929a = Collections.emptyList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C1298a f11930b = C1298a.f11856c;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private b f11931c;

            a() {
            }

            public e a() {
                return new e(this.f11929a, this.f11930b, this.f11931c);
            }

            public a b(List list) {
                this.f11929a = list;
                return this;
            }

            public a c(C1298a c1298a) {
                this.f11930b = c1298a;
                return this;
            }

            public a d(b bVar) {
                this.f11931c = bVar;
                return this;
            }
        }

        e(List list, C1298a c1298a, b bVar) {
            this.f11926a = Collections.unmodifiableList(new ArrayList(list));
            this.f11927b = (C1298a) AbstractC0829j.o(c1298a, "attributes");
            this.f11928c = bVar;
        }

        public static a d() {
            return new a();
        }

        public List a() {
            return this.f11926a;
        }

        public C1298a b() {
            return this.f11927b;
        }

        public b c() {
            return this.f11928c;
        }

        public a e() {
            return d().b(this.f11926a).c(this.f11927b).d(this.f11928c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC0826g.a(this.f11926a, eVar.f11926a) && AbstractC0826g.a(this.f11927b, eVar.f11927b) && AbstractC0826g.a(this.f11928c, eVar.f11928c);
        }

        public int hashCode() {
            return AbstractC0826g.b(this.f11926a, this.f11927b, this.f11928c);
        }

        public String toString() {
            return AbstractC0825f.b(this).d("addresses", this.f11926a).d("attributes", this.f11927b).d("serviceConfig", this.f11928c).toString();
        }
    }

    public static abstract class f {
        public abstract b a(Map map);
    }

    public abstract String a();

    public abstract void b();

    public abstract void c();

    public abstract void d(d dVar);
}
