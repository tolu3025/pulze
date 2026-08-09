package io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import y1.AbstractC1308k;
import y1.C1298a;

/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P0 f8646c = new P0(new y1.o0[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.o0[] f8647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f8648b = new AtomicBoolean(false);

    P0(y1.o0[] o0VarArr) {
        this.f8647a = o0VarArr;
    }

    public static P0 h(AbstractC1308k[] abstractC1308kArr, C1298a c1298a, y1.Z z2) {
        P0 p02 = new P0(abstractC1308kArr);
        for (AbstractC1308k abstractC1308k : abstractC1308kArr) {
            abstractC1308k.n(c1298a, z2);
        }
        return p02;
    }

    public void a() {
        for (y1.o0 o0Var : this.f8647a) {
            ((AbstractC1308k) o0Var).k();
        }
    }

    public void b(y1.Z z2) {
        for (y1.o0 o0Var : this.f8647a) {
            ((AbstractC1308k) o0Var).l(z2);
        }
    }

    public void c() {
        for (y1.o0 o0Var : this.f8647a) {
            ((AbstractC1308k) o0Var).m();
        }
    }

    public void d(int i3) {
        for (y1.o0 o0Var : this.f8647a) {
            o0Var.a(i3);
        }
    }

    public void e(int i3, long j3, long j4) {
        for (y1.o0 o0Var : this.f8647a) {
            o0Var.b(i3, j3, j4);
        }
    }

    public void f(long j3) {
        for (y1.o0 o0Var : this.f8647a) {
            o0Var.c(j3);
        }
    }

    public void g(long j3) {
        for (y1.o0 o0Var : this.f8647a) {
            o0Var.d(j3);
        }
    }

    public void i(int i3) {
        for (y1.o0 o0Var : this.f8647a) {
            o0Var.e(i3);
        }
    }

    public void j(int i3, long j3, long j4) {
        for (y1.o0 o0Var : this.f8647a) {
            o0Var.f(i3, j3, j4);
        }
    }

    public void k(long j3) {
        for (y1.o0 o0Var : this.f8647a) {
            o0Var.g(j3);
        }
    }

    public void l(long j3) {
        for (y1.o0 o0Var : this.f8647a) {
            o0Var.h(j3);
        }
    }

    public void m(y1.l0 l0Var) {
        if (this.f8648b.compareAndSet(false, true)) {
            for (y1.o0 o0Var : this.f8647a) {
                o0Var.i(l0Var);
            }
        }
    }
}
