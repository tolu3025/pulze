package r0;

import L0.a;

/* JADX INFO: loaded from: classes.dex */
class D implements L0.b, L0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC0050a f11097c = new a.InterfaceC0050a() { // from class: r0.A
        @Override // L0.a.InterfaceC0050a
        public final void a(L0.b bVar) {
            D.f(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final L0.b f11098d = new L0.b() { // from class: r0.B
        @Override // L0.b
        public final Object get() {
            return D.g();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.InterfaceC0050a f11099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile L0.b f11100b;

    private D(a.InterfaceC0050a interfaceC0050a, L0.b bVar) {
        this.f11099a = interfaceC0050a;
        this.f11100b = bVar;
    }

    static D e() {
        return new D(f11097c, f11098d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC0050a interfaceC0050a, a.InterfaceC0050a interfaceC0050a2, L0.b bVar) {
        interfaceC0050a.a(bVar);
        interfaceC0050a2.a(bVar);
    }

    static D i(L0.b bVar) {
        return new D(null, bVar);
    }

    @Override // L0.a
    public void a(final a.InterfaceC0050a interfaceC0050a) {
        L0.b bVar;
        L0.b bVar2;
        L0.b bVar3 = this.f11100b;
        L0.b bVar4 = f11098d;
        if (bVar3 != bVar4) {
            interfaceC0050a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f11100b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0050a interfaceC0050a2 = this.f11099a;
                this.f11099a = new a.InterfaceC0050a() { // from class: r0.C
                    @Override // L0.a.InterfaceC0050a
                    public final void a(L0.b bVar5) {
                        D.h(interfaceC0050a2, interfaceC0050a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0050a.a(bVar);
        }
    }

    @Override // L0.b
    public Object get() {
        return this.f11100b.get();
    }

    void j(L0.b bVar) {
        a.InterfaceC0050a interfaceC0050a;
        if (this.f11100b != f11098d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0050a = this.f11099a;
            this.f11099a = null;
            this.f11100b = bVar;
        }
        interfaceC0050a.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(L0.b bVar) {
    }
}
