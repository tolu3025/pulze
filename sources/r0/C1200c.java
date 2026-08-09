package r0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: r0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1200c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f11115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f11116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f11118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f11119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f11120g;

    private C1200c(String str, Set set, Set set2, int i3, int i4, h hVar, Set set3) {
        this.f11114a = str;
        this.f11115b = Collections.unmodifiableSet(set);
        this.f11116c = Collections.unmodifiableSet(set2);
        this.f11117d = i3;
        this.f11118e = i4;
        this.f11119f = hVar;
        this.f11120g = Collections.unmodifiableSet(set3);
    }

    public static b c(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static b e(F f3) {
        return new b(f3, new F[0]);
    }

    public static b f(F f3, F... fArr) {
        return new b(f3, fArr);
    }

    public static C1200c l(final Object obj, Class cls) {
        return m(cls).e(new h() { // from class: r0.a
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return C1200c.q(obj, interfaceC1202e);
            }
        }).d();
    }

    public static b m(Class cls) {
        return c(cls).f();
    }

    public static C1200c s(final Object obj, Class cls, Class... clsArr) {
        return d(cls, clsArr).e(new h() { // from class: r0.b
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return C1200c.r(obj, interfaceC1202e);
            }
        }).d();
    }

    public Set g() {
        return this.f11116c;
    }

    public h h() {
        return this.f11119f;
    }

    public String i() {
        return this.f11114a;
    }

    public Set j() {
        return this.f11115b;
    }

    public Set k() {
        return this.f11120g;
    }

    public boolean n() {
        return this.f11117d == 1;
    }

    public boolean o() {
        return this.f11117d == 2;
    }

    public boolean p() {
        return this.f11118e == 0;
    }

    public C1200c t(h hVar) {
        return new C1200c(this.f11114a, this.f11115b, this.f11116c, this.f11117d, this.f11118e, hVar, this.f11120g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f11115b.toArray()) + ">{" + this.f11117d + ", type=" + this.f11118e + ", deps=" + Arrays.toString(this.f11116c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: r0.c$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f11121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f11122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f11123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f11125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private h f11126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set f11127g;

        private b(Class cls, Class... clsArr) {
            this.f11121a = null;
            HashSet hashSet = new HashSet();
            this.f11122b = hashSet;
            this.f11123c = new HashSet();
            this.f11124d = 0;
            this.f11125e = 0;
            this.f11127g = new HashSet();
            E.c(cls, "Null interface");
            hashSet.add(F.b(cls));
            for (Class cls2 : clsArr) {
                E.c(cls2, "Null interface");
                this.f11122b.add(F.b(cls2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b f() {
            this.f11125e = 1;
            return this;
        }

        private b h(int i3) {
            E.d(this.f11124d == 0, "Instantiation type has already been set.");
            this.f11124d = i3;
            return this;
        }

        private void i(F f3) {
            E.a(!this.f11122b.contains(f3), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(r rVar) {
            E.c(rVar, "Null dependency");
            i(rVar.c());
            this.f11123c.add(rVar);
            return this;
        }

        public b c() {
            return h(1);
        }

        public C1200c d() {
            E.d(this.f11126f != null, "Missing required property: factory.");
            return new C1200c(this.f11121a, new HashSet(this.f11122b), new HashSet(this.f11123c), this.f11124d, this.f11125e, this.f11126f, this.f11127g);
        }

        public b e(h hVar) {
            this.f11126f = (h) E.c(hVar, "Null factory");
            return this;
        }

        public b g(String str) {
            this.f11121a = str;
            return this;
        }

        private b(F f3, F... fArr) {
            this.f11121a = null;
            HashSet hashSet = new HashSet();
            this.f11122b = hashSet;
            this.f11123c = new HashSet();
            this.f11124d = 0;
            this.f11125e = 0;
            this.f11127g = new HashSet();
            E.c(f3, "Null interface");
            hashSet.add(f3);
            for (F f4 : fArr) {
                E.c(f4, "Null interface");
            }
            Collections.addAll(this.f11122b, fArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, InterfaceC1202e interfaceC1202e) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, InterfaceC1202e interfaceC1202e) {
        return obj;
    }
}
