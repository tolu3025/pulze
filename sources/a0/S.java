package A0;

import A0.AbstractC0212j;
import A0.C0217o;
import C0.AbstractC0262l0;
import C0.C0261l;
import C0.C0274p0;
import C0.P1;
import J0.AbstractC0386b;
import J0.C0391g;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C0724e0;
import com.google.firebase.firestore.InterfaceC0755u0;
import com.google.firebase.firestore.InterfaceC0756v;
import com.google.firebase.firestore.T;
import com.google.firebase.firestore.T0;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import y0.AbstractC1279a;
import y0.C1288j;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0214l f79a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1279a f80b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1279a f81c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0391g f82d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z0.g f83e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AbstractC0262l0 f84f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0.M f85g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private I0.U f86h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k0 f87i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C0217o f88j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private P1 f89k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private P1 f90l;

    public S(final Context context, C0214l c0214l, AbstractC1279a abstractC1279a, AbstractC1279a abstractC1279a2, final C0391g c0391g, final I0.J j3, final AbstractC0212j abstractC0212j) {
        this.f79a = c0214l;
        this.f80b = abstractC1279a;
        this.f81c = abstractC1279a2;
        this.f82d = c0391g;
        this.f83e = new z0.g(new I0.P(c0214l.a()));
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c0391g.l(new Runnable() { // from class: A0.C
            @Override // java.lang.Runnable
            public final void run() {
                this.f17a.X(taskCompletionSource, context, abstractC0212j, j3);
            }
        });
        abstractC1279a.d(new J0.z() { // from class: A0.J
            @Override // J0.z
            public final void a(Object obj) {
                this.f62a.Z(atomicBoolean, taskCompletionSource, c0391g, (C1288j) obj);
            }
        });
        abstractC1279a2.d(new J0.z() { // from class: A0.K
            @Override // J0.z
            public final void a(Object obj) {
                S.a0((String) obj);
            }
        });
    }

    private void J(Context context, C1288j c1288j, AbstractC0212j abstractC0212j, I0.J j3) {
        J0.A.a("FirestoreClient", "Initializing. user=%s", c1288j.a());
        abstractC0212j.s(new AbstractC0212j.a(context, this.f82d, this.f79a, c1288j, 100, this.f80b, this.f81c, j3));
        this.f84f = abstractC0212j.o();
        this.f90l = abstractC0212j.l();
        this.f85g = abstractC0212j.n();
        this.f86h = abstractC0212j.q();
        this.f87i = abstractC0212j.r();
        this.f88j = abstractC0212j.k();
        C0261l c0261lM = abstractC0212j.m();
        P1 p12 = this.f90l;
        if (p12 != null) {
            p12.start();
        }
        if (c0261lM != null) {
            C0261l.a aVarF = c0261lM.f();
            this.f89k = aVarF;
            aVarF.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(InterfaceC0756v interfaceC0756v) {
        this.f88j.e(interfaceC0756v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(List list) {
        this.f85g.A(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        this.f85g.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        this.f86h.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P() {
        this.f86h.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(V0.q qVar, InterfaceC0755u0 interfaceC0755u0) {
        this.f86h.t(qVar, interfaceC0755u0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ D0.i R(Task task) throws com.google.firebase.firestore.T {
        D0.i iVar = (D0.i) task.getResult();
        if (iVar.d()) {
            return iVar;
        }
        if (iVar.j()) {
            return null;
        }
        throw new com.google.firebase.firestore.T("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", T.a.UNAVAILABLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ D0.i S(D0.l lVar) {
        return this.f85g.k0(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ E0 T(h0 h0Var) {
        C0274p0 c0274p0C = this.f85g.C(h0Var, true);
        C0 c02 = new C0(h0Var, c0274p0C.b());
        return c02.b(c02.h(c0274p0C.a())).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(String str, TaskCompletionSource taskCompletionSource) {
        z0.j jVarJ = this.f85g.J(str);
        if (jVarJ == null) {
            taskCompletionSource.setResult(null);
        } else {
            l0 l0VarB = jVarJ.a().b();
            taskCompletionSource.setResult(new f0(l0VarB.n(), l0VarB.d(), l0VarB.h(), l0VarB.m(), l0VarB.j(), jVarJ.a().a(), l0VarB.p(), l0VarB.f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(g0 g0Var) {
        this.f88j.d(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(z0.f fVar, C0724e0 c0724e0) {
        this.f87i.p(fVar, c0724e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(TaskCompletionSource taskCompletionSource, Context context, AbstractC0212j abstractC0212j, I0.J j3) {
        try {
            J(context, (C1288j) Tasks.await(taskCompletionSource.getTask()), abstractC0212j, j3);
        } catch (InterruptedException | ExecutionException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(C1288j c1288j) {
        AbstractC0386b.d(this.f87i != null, "SyncEngine not yet initialized", new Object[0]);
        J0.A.a("FirestoreClient", "Credential changed. Current user: %s", c1288j.a());
        this.f87i.l(c1288j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, C0391g c0391g, final C1288j c1288j) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            c0391g.l(new Runnable() { // from class: A0.L
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66a.Y(c1288j);
                }
            });
        } else {
            AbstractC0386b.d(!taskCompletionSource.getTask().isComplete(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.setResult(c1288j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(InterfaceC0756v interfaceC0756v) {
        this.f88j.h(interfaceC0756v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(f0 f0Var, List list, final TaskCompletionSource taskCompletionSource) {
        this.f87i.x(f0Var, list).addOnSuccessListener(new OnSuccessListener() { // from class: A0.F
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                taskCompletionSource.setResult((Map) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: A0.G
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                taskCompletionSource.setException(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(boolean z2) {
        this.f85g.n0(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(g0 g0Var) {
        this.f88j.g(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0() {
        this.f86h.P();
        this.f84f.m();
        P1 p12 = this.f90l;
        if (p12 != null) {
            p12.a();
        }
        P1 p13 = this.f89k;
        if (p13 != null) {
            p13.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task i0(T0 t02, J0.y yVar) {
        return this.f87i.C(this.f82d, t02, yVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(TaskCompletionSource taskCompletionSource) {
        this.f87i.t(taskCompletionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(List list, TaskCompletionSource taskCompletionSource) {
        this.f87i.E(list, taskCompletionSource);
    }

    private void t0() {
        if (K()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public void A(final InterfaceC0756v interfaceC0756v) {
        t0();
        this.f82d.l(new Runnable() { // from class: A0.I
            @Override // java.lang.Runnable
            public final void run() {
                this.f60a.L(interfaceC0756v);
            }
        });
    }

    public Task B(final List list) {
        t0();
        return this.f82d.i(new Runnable() { // from class: A0.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f297a.M(list);
            }
        });
    }

    public void C() {
        t0();
        this.f82d.l(new Runnable() { // from class: A0.Q
            @Override // java.lang.Runnable
            public final void run() {
                this.f78a.N();
            }
        });
    }

    public Task D() {
        t0();
        return this.f82d.i(new Runnable() { // from class: A0.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f312a.O();
            }
        });
    }

    public Task E() {
        t0();
        return this.f82d.i(new Runnable() { // from class: A0.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f302a.P();
            }
        });
    }

    public void F(final V0.q qVar, final InterfaceC0755u0 interfaceC0755u0) {
        this.f82d.l(new Runnable() { // from class: A0.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f306a.Q(qVar, interfaceC0755u0);
            }
        });
    }

    public Task G(final D0.l lVar) {
        t0();
        return this.f82d.j(new Callable() { // from class: A0.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f284a.S(lVar);
            }
        }).continueWith(new Continuation() { // from class: A0.u
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return S.R(task);
            }
        });
    }

    public Task H(final h0 h0Var) {
        t0();
        return this.f82d.j(new Callable() { // from class: A0.O
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f74a.T(h0Var);
            }
        });
    }

    public Task I(final String str) {
        t0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f82d.l(new Runnable() { // from class: A0.N
            @Override // java.lang.Runnable
            public final void run() {
                this.f71a.U(str, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public boolean K() {
        return this.f82d.p();
    }

    public g0 l0(h0 h0Var, C0217o.b bVar, InterfaceC0756v interfaceC0756v) {
        t0();
        final g0 g0Var = new g0(h0Var, bVar, interfaceC0756v);
        this.f82d.l(new Runnable() { // from class: A0.E
            @Override // java.lang.Runnable
            public final void run() {
                this.f40a.V(g0Var);
            }
        });
        return g0Var;
    }

    public void m0(InputStream inputStream, final C0724e0 c0724e0) {
        t0();
        final z0.f fVar = new z0.f(this.f83e, inputStream);
        this.f82d.l(new Runnable() { // from class: A0.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f280a.W(fVar, c0724e0);
            }
        });
    }

    public void n0(final InterfaceC0756v interfaceC0756v) {
        this.f82d.l(new Runnable() { // from class: A0.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f14a.b0(interfaceC0756v);
            }
        });
    }

    public Task o0(final f0 f0Var, final List list) {
        t0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f82d.l(new Runnable() { // from class: A0.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f4a.e0(f0Var, list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public void p0(final boolean z2) {
        t0();
        this.f82d.l(new Runnable() { // from class: A0.P
            @Override // java.lang.Runnable
            public final void run() {
                this.f76a.f0(z2);
            }
        });
    }

    public void q0(final g0 g0Var) {
        this.f82d.l(new Runnable() { // from class: A0.D
            @Override // java.lang.Runnable
            public final void run() {
                this.f36a.g0(g0Var);
            }
        });
    }

    public Task r0() {
        this.f80b.c();
        this.f81c.c();
        return this.f82d.n(new Runnable() { // from class: A0.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f277a.h0();
            }
        });
    }

    public Task s0(final T0 t02, final J0.y yVar) {
        t0();
        return C0391g.g(this.f82d.o(), new Callable() { // from class: A0.H
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f57a.i0(t02, yVar);
            }
        });
    }

    public Task u0() {
        t0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f82d.l(new Runnable() { // from class: A0.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f294a.j0(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public Task v0(final List list) {
        t0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f82d.l(new Runnable() { // from class: A0.M
            @Override // java.lang.Runnable
            public final void run() {
                this.f68a.k0(list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0(String str) {
    }
}
