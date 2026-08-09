package C0;

import C0.T;
import J0.AbstractC0386b;
import java.util.HashMap;
import java.util.Map;
import y0.C1288j;

/* JADX INFO: renamed from: C0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0244f0 extends AbstractC0262l0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC0277q0 f965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f966k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y f958c = new Y();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f959d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Z f961f = new Z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0250h0 f962g = new C0250h0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final V f963h = new V();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C0247g0 f964i = new C0247g0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f960e = new HashMap();

    private C0244f0() {
    }

    public static C0244f0 o() {
        C0244f0 c0244f0 = new C0244f0();
        c0244f0.u(new X(c0244f0));
        return c0244f0;
    }

    public static C0244f0 p(T.b bVar, r rVar) {
        C0244f0 c0244f0 = new C0244f0();
        c0244f0.u(new C0232b0(c0244f0, bVar, rVar));
        return c0244f0;
    }

    private void u(InterfaceC0277q0 interfaceC0277q0) {
        this.f965j = interfaceC0277q0;
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0228a a() {
        return this.f963h;
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0231b b(C1288j c1288j) {
        W w2 = (W) this.f960e.get(c1288j);
        if (w2 != null) {
            return w2;
        }
        W w3 = new W();
        this.f960e.put(c1288j, w3);
        return w3;
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0246g c() {
        return this.f958c;
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0253i0 e(C1288j c1288j, InterfaceC0264m interfaceC0264m) {
        C0238d0 c0238d0 = (C0238d0) this.f959d.get(c1288j);
        if (c0238d0 != null) {
            return c0238d0;
        }
        C0238d0 c0238d02 = new C0238d0(this, c1288j);
        this.f959d.put(c1288j, c0238d02);
        return c0238d02;
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0256j0 f() {
        return new C0241e0();
    }

    @Override // C0.AbstractC0262l0
    public InterfaceC0277q0 g() {
        return this.f965j;
    }

    @Override // C0.AbstractC0262l0
    public boolean j() {
        return this.f966k;
    }

    @Override // C0.AbstractC0262l0
    Object k(String str, J0.E e3) {
        this.f965j.k();
        try {
            return e3.get();
        } finally {
            this.f965j.h();
        }
    }

    @Override // C0.AbstractC0262l0
    void l(String str, Runnable runnable) {
        this.f965j.k();
        try {
            runnable.run();
        } finally {
            this.f965j.h();
        }
    }

    @Override // C0.AbstractC0262l0
    public void m() {
        AbstractC0386b.d(this.f966k, "MemoryPersistence shutdown without start", new Object[0]);
        this.f966k = false;
    }

    @Override // C0.AbstractC0262l0
    public void n() {
        AbstractC0386b.d(!this.f966k, "MemoryPersistence double-started!", new Object[0]);
        this.f966k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // C0.AbstractC0262l0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Z d(C1288j c1288j) {
        return this.f961f;
    }

    Iterable r() {
        return this.f959d.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // C0.AbstractC0262l0
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0247g0 h() {
        return this.f964i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // C0.AbstractC0262l0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public C0250h0 i() {
        return this.f962g;
    }
}
