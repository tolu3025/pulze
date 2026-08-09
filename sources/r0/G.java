package r0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x0.C1270a;
import x0.InterfaceC1271b;

/* JADX INFO: loaded from: classes.dex */
final class G implements InterfaceC1202e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f11103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f11104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f11105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f11106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f11107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f11108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1202e f11109g;

    private static class a implements InterfaceC1271b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f11110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC1271b f11111b;

        public a(Set set, InterfaceC1271b interfaceC1271b) {
            this.f11110a = set;
            this.f11111b = interfaceC1271b;
        }

        @Override // x0.InterfaceC1271b
        public void a(C1270a c1270a) {
            if (!this.f11110a.contains(c1270a.a())) {
                throw new t(String.format("Attempting to publish an undeclared event %s.", c1270a));
            }
            this.f11111b.a(c1270a);
        }
    }

    G(C1200c c1200c, InterfaceC1202e interfaceC1202e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : c1200c.g()) {
            if (rVar.e()) {
                boolean zG = rVar.g();
                F fC = rVar.c();
                if (zG) {
                    hashSet4.add(fC);
                } else {
                    hashSet.add(fC);
                }
            } else if (rVar.d()) {
                hashSet3.add(rVar.c());
            } else {
                boolean zG2 = rVar.g();
                F fC2 = rVar.c();
                if (zG2) {
                    hashSet5.add(fC2);
                } else {
                    hashSet2.add(fC2);
                }
            }
        }
        if (!c1200c.k().isEmpty()) {
            hashSet.add(F.b(InterfaceC1271b.class));
        }
        this.f11103a = Collections.unmodifiableSet(hashSet);
        this.f11104b = Collections.unmodifiableSet(hashSet2);
        this.f11105c = Collections.unmodifiableSet(hashSet3);
        this.f11106d = Collections.unmodifiableSet(hashSet4);
        this.f11107e = Collections.unmodifiableSet(hashSet5);
        this.f11108f = c1200c.k();
        this.f11109g = interfaceC1202e;
    }

    @Override // r0.InterfaceC1202e
    public Object a(Class cls) {
        if (!this.f11103a.contains(F.b(cls))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f11109g.a(cls);
        return !cls.equals(InterfaceC1271b.class) ? objA : new a(this.f11108f, (InterfaceC1271b) objA);
    }

    @Override // r0.InterfaceC1202e
    public L0.a b(F f3) {
        if (this.f11105c.contains(f3)) {
            return this.f11109g.b(f3);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", f3));
    }

    @Override // r0.InterfaceC1202e
    public L0.b c(F f3) {
        if (this.f11104b.contains(f3)) {
            return this.f11109g.c(f3);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", f3));
    }

    @Override // r0.InterfaceC1202e
    public /* synthetic */ Set d(Class cls) {
        return AbstractC1201d.e(this, cls);
    }

    @Override // r0.InterfaceC1202e
    public L0.b e(Class cls) {
        return c(F.b(cls));
    }

    @Override // r0.InterfaceC1202e
    public Set f(F f3) {
        if (this.f11106d.contains(f3)) {
            return this.f11109g.f(f3);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", f3));
    }

    @Override // r0.InterfaceC1202e
    public Object g(F f3) {
        if (this.f11103a.contains(f3)) {
            return this.f11109g.g(f3);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", f3));
    }

    @Override // r0.InterfaceC1202e
    public L0.a h(Class cls) {
        return b(F.b(cls));
    }

    @Override // r0.InterfaceC1202e
    public L0.b i(F f3) {
        if (this.f11107e.contains(f3)) {
            return this.f11109g.i(f3);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f3));
    }
}
