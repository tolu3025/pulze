package y1;

import e0.AbstractC0825f;
import e0.AbstractC0826g;
import e0.AbstractC0829j;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import y1.AbstractC1308k;
import y1.C1298a;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1298a.c f11803b = C1298a.c.a("internal:health-checking-config");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b.C0190b f11804c = b.C0190b.b("internal:health-check-consumer-listener");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1298a.c f11805d = C1298a.c.a("internal:has-health-check-producer-listener");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1298a.c f11806e = C1298a.c.a("io.grpc.IS_PETIOLE_POLICY");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f11807f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11808a;

    class a extends j {
        a() {
        }

        @Override // y1.S.j
        public f a(g gVar) {
            return f.g();
        }

        public String toString() {
            return "EMPTY_PICKER";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f11809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1298a f11810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[][] f11811c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List f11812a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C1298a f11813b = C1298a.f11856c;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object[][] f11814c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public a d(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.f11814c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public a b(C0190b c0190b, Object obj) {
                AbstractC0829j.o(c0190b, "key");
                AbstractC0829j.o(obj, "value");
                int length = 0;
                while (true) {
                    Object[][] objArr = this.f11814c;
                    if (length >= objArr.length) {
                        length = -1;
                        break;
                    }
                    if (c0190b.equals(objArr[length][0])) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f11814c.length + 1, 2);
                    Object[][] objArr3 = this.f11814c;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.f11814c = objArr2;
                    length = objArr2.length - 1;
                }
                this.f11814c[length] = new Object[]{c0190b, obj};
                return this;
            }

            public b c() {
                return new b(this.f11812a, this.f11813b, this.f11814c, null);
            }

            public a e(List list) {
                AbstractC0829j.e(!list.isEmpty(), "addrs is empty");
                this.f11812a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a f(C1298a c1298a) {
                this.f11813b = (C1298a) AbstractC0829j.o(c1298a, "attrs");
                return this;
            }
        }

        /* JADX INFO: renamed from: y1.S$b$b, reason: collision with other inner class name */
        public static final class C0190b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f11815a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f11816b;

            private C0190b(String str, Object obj) {
                this.f11815a = str;
                this.f11816b = obj;
            }

            public static C0190b b(String str) {
                AbstractC0829j.o(str, "debugString");
                return new C0190b(str, null);
            }

            public String toString() {
                return this.f11815a;
            }
        }

        private b(List list, C1298a c1298a, Object[][] objArr) {
            this.f11809a = (List) AbstractC0829j.o(list, "addresses are not set");
            this.f11810b = (C1298a) AbstractC0829j.o(c1298a, "attrs");
            this.f11811c = (Object[][]) AbstractC0829j.o(objArr, "customOptions");
        }

        public static a d() {
            return new a();
        }

        public List a() {
            return this.f11809a;
        }

        public C1298a b() {
            return this.f11810b;
        }

        public Object c(C0190b c0190b) {
            AbstractC0829j.o(c0190b, "key");
            int i3 = 0;
            while (true) {
                Object[][] objArr = this.f11811c;
                if (i3 >= objArr.length) {
                    return c0190b.f11816b;
                }
                if (c0190b.equals(objArr[i3][0])) {
                    return this.f11811c[i3][1];
                }
                i3++;
            }
        }

        public a e() {
            return d().e(this.f11809a).f(this.f11810b).d(this.f11811c);
        }

        public String toString() {
            return AbstractC0825f.b(this).d("addrs", this.f11809a).d("attrs", this.f11810b).d("customOptions", Arrays.deepToString(this.f11811c)).toString();
        }

        /* synthetic */ b(List list, C1298a c1298a, Object[][] objArr, a aVar) {
            this(list, c1298a, objArr);
        }
    }

    public static abstract class c {
        public abstract S a(e eVar);
    }

    public static final class d extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f11817a;

        public d(f fVar) {
            this.f11817a = (f) AbstractC0829j.o(fVar, "result");
        }

        @Override // y1.S.j
        public f a(g gVar) {
            return this.f11817a;
        }

        public String toString() {
            return "FixedResultPicker(" + this.f11817a + ")";
        }
    }

    public static abstract class e {
        public abstract i a(b bVar);

        public abstract AbstractC1303f b();

        public abstract ScheduledExecutorService c();

        public abstract p0 d();

        public abstract void e();

        public abstract void f(EnumC1313p enumC1313p, j jVar);
    }

    public static final class f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final f f11818e = new f(null, null, l0.f11960e, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f11819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC1308k.a f11820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l0 f11821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f11822d;

        private f(i iVar, AbstractC1308k.a aVar, l0 l0Var, boolean z2) {
            this.f11819a = iVar;
            this.f11820b = aVar;
            this.f11821c = (l0) AbstractC0829j.o(l0Var, "status");
            this.f11822d = z2;
        }

        public static f e(l0 l0Var) {
            AbstractC0829j.e(!l0Var.o(), "drop status shouldn't be OK");
            return new f(null, null, l0Var, true);
        }

        public static f f(l0 l0Var) {
            AbstractC0829j.e(!l0Var.o(), "error status shouldn't be OK");
            return new f(null, null, l0Var, false);
        }

        public static f g() {
            return f11818e;
        }

        public static f h(i iVar) {
            return i(iVar, null);
        }

        public static f i(i iVar, AbstractC1308k.a aVar) {
            return new f((i) AbstractC0829j.o(iVar, "subchannel"), aVar, l0.f11960e, false);
        }

        public l0 a() {
            return this.f11821c;
        }

        public AbstractC1308k.a b() {
            return this.f11820b;
        }

        public i c() {
            return this.f11819a;
        }

        public boolean d() {
            return this.f11822d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC0826g.a(this.f11819a, fVar.f11819a) && AbstractC0826g.a(this.f11821c, fVar.f11821c) && AbstractC0826g.a(this.f11820b, fVar.f11820b) && this.f11822d == fVar.f11822d;
        }

        public int hashCode() {
            return AbstractC0826g.b(this.f11819a, this.f11821c, this.f11820b, Boolean.valueOf(this.f11822d));
        }

        public String toString() {
            return AbstractC0825f.b(this).d("subchannel", this.f11819a).d("streamTracerFactory", this.f11820b).d("status", this.f11821c).e("drop", this.f11822d).toString();
        }
    }

    public static abstract class g {
        public abstract C1300c a();

        public abstract Z b();

        public abstract a0 c();
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f11823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1298a f11824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f11825c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List f11826a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C1298a f11827b = C1298a.f11856c;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f11828c;

            a() {
            }

            public h a() {
                return new h(this.f11826a, this.f11827b, this.f11828c, null);
            }

            public a b(List list) {
                this.f11826a = list;
                return this;
            }

            public a c(C1298a c1298a) {
                this.f11827b = c1298a;
                return this;
            }

            public a d(Object obj) {
                this.f11828c = obj;
                return this;
            }
        }

        private h(List list, C1298a c1298a, Object obj) {
            this.f11823a = Collections.unmodifiableList(new ArrayList((Collection) AbstractC0829j.o(list, "addresses")));
            this.f11824b = (C1298a) AbstractC0829j.o(c1298a, "attributes");
            this.f11825c = obj;
        }

        public static a d() {
            return new a();
        }

        public List a() {
            return this.f11823a;
        }

        public C1298a b() {
            return this.f11824b;
        }

        public Object c() {
            return this.f11825c;
        }

        public a e() {
            return d().b(this.f11823a).c(this.f11824b).d(this.f11825c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return AbstractC0826g.a(this.f11823a, hVar.f11823a) && AbstractC0826g.a(this.f11824b, hVar.f11824b) && AbstractC0826g.a(this.f11825c, hVar.f11825c);
        }

        public int hashCode() {
            return AbstractC0826g.b(this.f11823a, this.f11824b, this.f11825c);
        }

        public String toString() {
            return AbstractC0825f.b(this).d("addresses", this.f11823a).d("attributes", this.f11824b).d("loadBalancingPolicyConfig", this.f11825c).toString();
        }

        /* synthetic */ h(List list, C1298a c1298a, Object obj, a aVar) {
            this(list, c1298a, obj);
        }
    }

    public static abstract class i {
        /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final y1.C1320x a() {
            /*
                r4 = this;
                java.util.List r0 = r4.b()
                r1 = 0
                if (r0 == 0) goto Lf
                int r2 = r0.size()
                r3 = 1
                if (r2 != r3) goto Lf
                goto L10
            Lf:
                r3 = r1
            L10:
                java.lang.String r2 = "%s does not have exactly one group"
                e0.AbstractC0829j.w(r3, r2, r0)
                java.lang.Object r0 = r0.get(r1)
                y1.x r0 = (y1.C1320x) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: y1.S.i.a():y1.x");
        }

        public abstract List b();

        public abstract C1298a c();

        public abstract AbstractC1303f d();

        public abstract Object e();

        public abstract void f();

        public abstract void g();

        public abstract void h(k kVar);

        public abstract void i(List list);
    }

    public interface k {
        void a(C1314q c1314q);
    }

    public l0 a(h hVar) {
        if (!hVar.a().isEmpty() || b()) {
            int i3 = this.f11808a;
            this.f11808a = i3 + 1;
            if (i3 == 0) {
                d(hVar);
            }
            this.f11808a = 0;
            return l0.f11960e;
        }
        l0 l0VarQ = l0.f11975t.q("NameResolver returned no usable address. addrs=" + hVar.a() + ", attrs=" + hVar.b());
        c(l0VarQ);
        return l0VarQ;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(l0 l0Var);

    public void d(h hVar) {
        int i3 = this.f11808a;
        this.f11808a = i3 + 1;
        if (i3 == 0) {
            a(hVar);
        }
        this.f11808a = 0;
    }

    public abstract void f();

    public static abstract class j {
        public abstract f a(g gVar);

        public void b() {
        }
    }

    public void e() {
    }
}
