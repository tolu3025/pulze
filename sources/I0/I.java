package I0;

import A0.C0214l;
import J0.C0391g;
import V0.t;
import a0.AbstractC0472a;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import y1.AbstractC1299b;
import y1.C1300c;
import y1.EnumC1313p;
import z1.C1327a;

/* JADX INFO: loaded from: classes.dex */
public class I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static J0.E f2163h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Task f2164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0391g f2165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1300c f2166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0391g.b f2167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f2168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0214l f2169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC1299b f2170g;

    I(C0391g c0391g, Context context, C0214l c0214l, AbstractC1299b abstractC1299b) {
        this.f2165b = c0391g;
        this.f2168e = context;
        this.f2169f = c0214l;
        this.f2170g = abstractC1299b;
        k();
    }

    private void h() {
        if (this.f2167d != null) {
            J0.A.a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f2167d.c();
            this.f2167d = null;
        }
    }

    private y1.V j(Context context, C0214l c0214l) {
        y1.W w2;
        try {
            AbstractC0472a.a(context);
        } catch (M.k | M.l | IllegalStateException e3) {
            J0.A.e("GrpcCallProvider", "Failed to update ssl context: %s", e3);
        }
        J0.E e4 = f2163h;
        if (e4 != null) {
            w2 = (y1.W) e4.get();
        } else {
            y1.W wB = y1.W.b(c0214l.b());
            if (!c0214l.d()) {
                wB.d();
            }
            w2 = wB;
        }
        w2.c(30L, TimeUnit.SECONDS);
        return C1327a.k(w2).i(context).a();
    }

    private void k() {
        this.f2164a = Tasks.call(J0.s.f2501c, new Callable() { // from class: I0.B
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2150a.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task l(y1.a0 a0Var, Task task) {
        return Tasks.forResult(((y1.V) task.getResult()).e(a0Var, this.f2166c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y1.V n() {
        final y1.V vJ = j(this.f2168e, this.f2169f);
        this.f2165b.l(new Runnable() { // from class: I0.C
            @Override // java.lang.Runnable
            public final void run() {
                this.f2151a.m(vJ);
            }
        });
        this.f2166c = ((t.b) ((t.b) V0.t.g(vJ).c(this.f2170g)).d(this.f2165b.o())).b();
        J0.A.a("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
        return vJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(y1.V v2) {
        J0.A.a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        h();
        t(v2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(final y1.V v2) {
        this.f2165b.l(new Runnable() { // from class: I0.G
            @Override // java.lang.Runnable
            public final void run() {
                this.f2159a.p(v2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(y1.V v2) {
        v2.o();
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void p(final y1.V v2) {
        EnumC1313p enumC1313pL = v2.l(true);
        J0.A.a("GrpcCallProvider", "Current gRPC connectivity state: " + enumC1313pL, new Object[0]);
        h();
        if (enumC1313pL == EnumC1313p.CONNECTING) {
            J0.A.a("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f2167d = this.f2165b.k(C0391g.d.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new Runnable() { // from class: I0.D
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2153a.o(v2);
                }
            });
        }
        v2.m(enumC1313pL, new Runnable() { // from class: I0.E
            @Override // java.lang.Runnable
            public final void run() {
                this.f2155a.q(v2);
            }
        });
    }

    private void t(final y1.V v2) {
        this.f2165b.l(new Runnable() { // from class: I0.H
            @Override // java.lang.Runnable
            public final void run() {
                this.f2161a.r(v2);
            }
        });
    }

    public Task i(final y1.a0 a0Var) {
        return this.f2164a.continueWithTask(this.f2165b.o(), new Continuation() { // from class: I0.F
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f2157a.l(a0Var, task);
            }
        });
    }

    public void u() {
        try {
            y1.V v2 = (y1.V) Tasks.await(this.f2164a);
            v2.n();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (v2.j(1L, timeUnit)) {
                    return;
                }
                J0.A.a(C0384z.class.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                v2.o();
                if (v2.j(60L, timeUnit)) {
                    return;
                }
                J0.A.e(C0384z.class.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
            } catch (InterruptedException unused) {
                v2.o();
                J0.A.e(C0384z.class.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException unused2) {
            J0.A.e(C0384z.class.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            J0.A.e(C0384z.class.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e3);
        }
    }
}
