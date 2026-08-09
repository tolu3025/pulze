package com.google.firebase.firestore;

import A0.AbstractC0204d;
import A0.C0210h;
import A0.C0217o;
import A0.h0;
import J0.AbstractC0386b;
import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.T;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.firestore.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0752t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.l f6396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FirebaseFirestore f6397b;

    C0752t(D0.l lVar, FirebaseFirestore firebaseFirestore) {
        this.f6396a = (D0.l) J0.C.b(lVar);
        this.f6397b = (FirebaseFirestore) J0.C.b(firebaseFirestore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C0754u A(Task task) {
        D0.i iVar = (D0.i) task.getResult();
        return new C0754u(this.f6397b, this.f6396a, iVar, true, iVar != null && iVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, P0 p02, C0754u c0754u, T t2) {
        T t3;
        if (t2 != null) {
            taskCompletionSource.setException(t2);
            return;
        }
        try {
            ((InterfaceC0720c0) Tasks.await(taskCompletionSource2.getTask())).remove();
            if (!c0754u.a() && c0754u.f().b()) {
                t3 = new T("Failed to get document because the client is offline.", T.a.UNAVAILABLE);
            } else {
                if (!c0754u.a() || !c0754u.f().b() || p02 != P0.SERVER) {
                    taskCompletionSource.setResult(c0754u);
                    return;
                }
                t3 = new T("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", T.a.UNAVAILABLE);
            }
            taskCompletionSource.setException(t3);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            throw AbstractC0386b.b(e3, "Failed to register a listener for a single document", new Object[0]);
        } catch (ExecutionException e4) {
            throw AbstractC0386b.b(e4, "Failed to register a listener for a single document", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task C(List list, A0.S s2) {
        return s2.v0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task D(List list, A0.S s2) {
        return s2.v0(list);
    }

    private Task G(A0.z0 z0Var) {
        final List listSingletonList = Collections.singletonList(z0Var.a(this.f6396a, E0.m.a(true)));
        return ((Task) this.f6397b.s(new J0.y() { // from class: com.google.firebase.firestore.m
            @Override // J0.y
            public final Object c(Object obj) {
                return C0752t.D(listSingletonList, (A0.S) obj);
            }
        })).continueWith(J0.s.f2500b, J0.L.x());
    }

    private InterfaceC0720c0 k(Executor executor, final C0217o.b bVar, final Activity activity, final InterfaceC0756v interfaceC0756v) {
        final C0210h c0210h = new C0210h(executor, new InterfaceC0756v() { // from class: com.google.firebase.firestore.p
            @Override // com.google.firebase.firestore.InterfaceC0756v
            public final void a(Object obj, T t2) {
                this.f6367a.v(interfaceC0756v, (A0.E0) obj, t2);
            }
        });
        final A0.f0 f0VarL = l();
        return (InterfaceC0720c0) this.f6397b.s(new J0.y() { // from class: com.google.firebase.firestore.q
            @Override // J0.y
            public final Object c(Object obj) {
                return C0752t.x(f0VarL, bVar, c0210h, activity, (A0.S) obj);
            }
        });
    }

    private A0.f0 l() {
        return A0.f0.b(this.f6396a.p());
    }

    public static C0752t n(D0.u uVar, FirebaseFirestore firebaseFirestore) {
        if (uVar.w() % 2 == 0) {
            return new C0752t(D0.l.j(uVar), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + uVar.n() + " has " + uVar.w());
    }

    private Task t(final P0 p02) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        C0217o.b bVar = new C0217o.b();
        bVar.f235a = true;
        bVar.f236b = true;
        bVar.f237c = true;
        taskCompletionSource2.setResult(k(J0.s.f2500b, bVar, null, new InterfaceC0756v() { // from class: com.google.firebase.firestore.r
            @Override // com.google.firebase.firestore.InterfaceC0756v
            public final void a(Object obj, T t2) {
                C0752t.B(taskCompletionSource, taskCompletionSource2, p02, (C0754u) obj, t2);
            }
        }));
        return taskCompletionSource.getTask();
    }

    private static C0217o.b u(EnumC0736k0 enumC0736k0, EnumC0718b0 enumC0718b0) {
        C0217o.b bVar = new C0217o.b();
        EnumC0736k0 enumC0736k02 = EnumC0736k0.INCLUDE;
        bVar.f235a = enumC0736k0 == enumC0736k02;
        bVar.f236b = enumC0736k0 == enumC0736k02;
        bVar.f237c = false;
        bVar.f238d = enumC0718b0;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(InterfaceC0756v interfaceC0756v, A0.E0 e02, T t2) {
        if (t2 != null) {
            interfaceC0756v.a(null, t2);
            return;
        }
        AbstractC0386b.d(e02 != null, "Got event without value or error set", new Object[0]);
        AbstractC0386b.d(e02.e().size() <= 1, "Too many documents returned on a document query", new Object[0]);
        D0.i iVarL = e02.e().l(this.f6396a);
        interfaceC0756v.a(iVarL != null ? C0754u.b(this.f6397b, iVarL, e02.k(), e02.f().contains(iVarL.getKey())) : C0754u.c(this.f6397b, this.f6396a, e02.k()), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(C0210h c0210h, A0.S s2, A0.g0 g0Var) {
        c0210h.d();
        s2.q0(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC0720c0 x(A0.f0 f0Var, C0217o.b bVar, final C0210h c0210h, Activity activity, final A0.S s2) {
        final A0.g0 g0VarL0 = s2.l0(new h0.b(f0Var), bVar, c0210h);
        return AbstractC0204d.c(activity, new InterfaceC0720c0() { // from class: com.google.firebase.firestore.s
            @Override // com.google.firebase.firestore.InterfaceC0720c0
            public final void remove() {
                C0752t.w(c0210h, s2, g0VarL0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task y(List list, A0.S s2) {
        return s2.v0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task z(A0.S s2) {
        return s2.G(this.f6396a);
    }

    public Task E(Object obj) {
        return F(obj, M0.f6230c);
    }

    public Task F(Object obj, M0 m02) {
        J0.C.c(obj, "Provided data must not be null.");
        J0.C.c(m02, "Provided options must not be null.");
        final List listSingletonList = Collections.singletonList((m02.b() ? this.f6397b.F().g(obj, m02.a()) : this.f6397b.F().l(obj)).a(this.f6396a, E0.m.f1404c));
        return ((Task) this.f6397b.s(new J0.y() { // from class: com.google.firebase.firestore.l
            @Override // J0.y
            public final Object c(Object obj2) {
                return C0752t.C(listSingletonList, (A0.S) obj2);
            }
        })).continueWith(J0.s.f2500b, J0.L.x());
    }

    public Task H(C0760x c0760x, Object obj, Object... objArr) {
        return G(this.f6397b.F().m(J0.L.f(1, c0760x, obj, objArr)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0752t)) {
            return false;
        }
        C0752t c0752t = (C0752t) obj;
        return this.f6396a.equals(c0752t.f6396a) && this.f6397b.equals(c0752t.f6397b);
    }

    public int hashCode() {
        return (this.f6396a.hashCode() * 31) + this.f6397b.hashCode();
    }

    public InterfaceC0720c0 j(N0 n02, InterfaceC0756v interfaceC0756v) {
        J0.C.c(n02, "Provided options value must not be null.");
        J0.C.c(interfaceC0756v, "Provided EventListener must not be null.");
        return k(n02.b(), u(n02.c(), n02.d()), n02.a(), interfaceC0756v);
    }

    public Task m() {
        final List listSingletonList = Collections.singletonList(new E0.c(this.f6396a, E0.m.f1404c));
        return ((Task) this.f6397b.s(new J0.y() { // from class: com.google.firebase.firestore.k
            @Override // J0.y
            public final Object c(Object obj) {
                return C0752t.y(listSingletonList, (A0.S) obj);
            }
        })).continueWith(J0.s.f2500b, J0.L.x());
    }

    public Task o(P0 p02) {
        return p02 == P0.CACHE ? ((Task) this.f6397b.s(new J0.y() { // from class: com.google.firebase.firestore.n
            @Override // J0.y
            public final Object c(Object obj) {
                return this.f6365a.z((A0.S) obj);
            }
        })).continueWith(J0.s.f2500b, new Continuation() { // from class: com.google.firebase.firestore.o
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f6366a.A(task);
            }
        }) : t(p02);
    }

    public FirebaseFirestore p() {
        return this.f6397b;
    }

    public String q() {
        D0.f fVarB = this.f6397b.B();
        return String.format("projects/%s/databases/%s/documents/%s", fVarB.i(), fVarB.h(), s());
    }

    D0.l r() {
        return this.f6396a;
    }

    public String s() {
        return this.f6396a.p().n();
    }

    public String toString() {
        return "DocumentReference{key=" + this.f6396a + ", firestore=" + this.f6397b + '}';
    }
}
