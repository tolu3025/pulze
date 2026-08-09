package io.grpc.internal;

import y1.C1298a;
import y1.c0;

/* JADX INFO: loaded from: classes.dex */
final class G0 extends N {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final C1298a.c f8601e = C1298a.c.a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.c0 f8602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F0 f8603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y1.p0 f8604d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G0.this.b();
        }
    }

    class b {
        b() {
        }

        public void a(y1.l0 l0Var) {
            if (l0Var.o()) {
                G0.this.f8603c.reset();
            } else {
                G0.this.f8603c.a(G0.this.new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c extends c0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c0.d f8607a;

        c(c0.d dVar) {
            this.f8607a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            G0.this.f8603c.a(G0.this.new a());
        }

        @Override // y1.c0.d
        public void a(y1.l0 l0Var) {
            this.f8607a.a(l0Var);
            G0.this.f8604d.execute(new Runnable() { // from class: io.grpc.internal.H0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8611a.d();
                }
            });
        }

        @Override // y1.c0.d
        public void b(c0.e eVar) {
            C1298a c1298aB = eVar.b();
            C1298a.c cVar = G0.f8601e;
            if (c1298aB.b(cVar) != null) {
                throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
            }
            this.f8607a.b(eVar.e().c(eVar.b().d().d(cVar, G0.this.new b()).a()).a());
        }
    }

    G0(y1.c0 c0Var, F0 f02, y1.p0 p0Var) {
        super(c0Var);
        this.f8602b = c0Var;
        this.f8603c = f02;
        this.f8604d = p0Var;
    }

    @Override // io.grpc.internal.N, y1.c0
    public void c() {
        super.c();
        this.f8603c.reset();
    }

    @Override // io.grpc.internal.N, y1.c0
    public void d(c0.d dVar) {
        super.d(new c(dVar));
    }
}
