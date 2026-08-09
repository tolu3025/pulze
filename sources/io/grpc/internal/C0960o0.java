package io.grpc.internal;

import e0.AbstractC0829j;
import y1.AbstractC1299b;
import y1.AbstractC1308k;
import y1.C1300c;

/* JADX INFO: renamed from: io.grpc.internal.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0960o0 extends AbstractC1299b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0968t f9230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.a0 f9231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y1.Z f9232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1300c f9233d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f9235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC1308k[] f9236g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private r f9238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f9239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    C f9240k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f9237h = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y1.r f9234e = y1.r.e();

    /* JADX INFO: renamed from: io.grpc.internal.o0$a */
    public interface a {
        void a();
    }

    C0960o0(InterfaceC0968t interfaceC0968t, y1.a0 a0Var, y1.Z z2, C1300c c1300c, a aVar, AbstractC1308k[] abstractC1308kArr) {
        this.f9230a = interfaceC0968t;
        this.f9231b = a0Var;
        this.f9232c = z2;
        this.f9233d = c1300c;
        this.f9235f = aVar;
        this.f9236g = abstractC1308kArr;
    }

    private void c(r rVar) {
        boolean z2;
        AbstractC0829j.u(!this.f9239j, "already finalized");
        this.f9239j = true;
        synchronized (this.f9237h) {
            try {
                if (this.f9238i == null) {
                    this.f9238i = rVar;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            AbstractC0829j.u(this.f9240k != null, "delayedStream is null");
            Runnable runnableX = this.f9240k.x(rVar);
            if (runnableX != null) {
                runnableX.run();
            }
        }
        this.f9235f.a();
    }

    @Override // y1.AbstractC1299b.a
    public void a(y1.Z z2) {
        AbstractC0829j.u(!this.f9239j, "apply() or fail() already called");
        AbstractC0829j.o(z2, "headers");
        this.f9232c.m(z2);
        y1.r rVarB = this.f9234e.b();
        try {
            r rVarB2 = this.f9230a.b(this.f9231b, this.f9232c, this.f9233d, this.f9236g);
            this.f9234e.f(rVarB);
            c(rVarB2);
        } catch (Throwable th) {
            this.f9234e.f(rVarB);
            throw th;
        }
    }

    @Override // y1.AbstractC1299b.a
    public void b(y1.l0 l0Var) {
        AbstractC0829j.e(!l0Var.o(), "Cannot fail with OK status");
        AbstractC0829j.u(!this.f9239j, "apply() or fail() already called");
        c(new G(S.o(l0Var), this.f9236g));
    }

    r d() {
        synchronized (this.f9237h) {
            try {
                r rVar = this.f9238i;
                if (rVar != null) {
                    return rVar;
                }
                C c3 = new C();
                this.f9240k = c3;
                this.f9238i = c3;
                return c3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
