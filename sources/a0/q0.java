package A0;

import J0.AbstractC0386b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.T;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class q0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Executor f270g = d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I0.r f271a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.firebase.firestore.T f275e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f272b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f273c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Set f276f = new HashSet();

    public q0(I0.r rVar) {
        this.f271a = rVar;
    }

    private static Executor d() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    private void f() {
        AbstractC0386b.d(!this.f274d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
    }

    public static Executor g() {
        return f270g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task h(Task task) {
        return task.isSuccessful() ? Tasks.forResult(null) : Tasks.forException(task.getException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task i(Task task) throws com.google.firebase.firestore.T {
        if (task.isSuccessful()) {
            Iterator it = ((List) task.getResult()).iterator();
            while (it.hasNext()) {
                m((D0.s) it.next());
            }
        }
        return task;
    }

    private E0.m k(D0.l lVar) {
        D0.w wVar = (D0.w) this.f272b.get(lVar);
        return (this.f276f.contains(lVar) || wVar == null) ? E0.m.f1404c : wVar.equals(D0.w.f1302b) ? E0.m.a(false) : E0.m.f(wVar);
    }

    private E0.m l(D0.l lVar) throws com.google.firebase.firestore.T {
        D0.w wVar = (D0.w) this.f272b.get(lVar);
        if (this.f276f.contains(lVar) || wVar == null) {
            return E0.m.a(true);
        }
        if (wVar.equals(D0.w.f1302b)) {
            throw new com.google.firebase.firestore.T("Can't update a document that doesn't exist.", T.a.INVALID_ARGUMENT);
        }
        return E0.m.f(wVar);
    }

    private void m(D0.s sVar) throws com.google.firebase.firestore.T {
        D0.w wVarL;
        if (sVar.d()) {
            wVarL = sVar.l();
        } else {
            if (!sVar.j()) {
                throw AbstractC0386b.a("Unexpected document type in transaction: " + sVar, new Object[0]);
            }
            wVarL = D0.w.f1302b;
        }
        if (!this.f272b.containsKey(sVar.getKey())) {
            this.f272b.put(sVar.getKey(), wVarL);
        } else if (!((D0.w) this.f272b.get(sVar.getKey())).equals(sVar.l())) {
            throw new com.google.firebase.firestore.T("Document version changed between two reads.", T.a.ABORTED);
        }
    }

    private void p(List list) {
        f();
        this.f273c.addAll(list);
    }

    public Task c() {
        f();
        com.google.firebase.firestore.T t2 = this.f275e;
        if (t2 != null) {
            return Tasks.forException(t2);
        }
        HashSet<D0.l> hashSet = new HashSet(this.f272b.keySet());
        Iterator it = this.f273c.iterator();
        while (it.hasNext()) {
            hashSet.remove(((E0.f) it.next()).g());
        }
        for (D0.l lVar : hashSet) {
            this.f273c.add(new E0.q(lVar, k(lVar)));
        }
        this.f274d = true;
        return this.f271a.d(this.f273c).continueWithTask(J0.s.f2500b, new Continuation() { // from class: A0.p0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return q0.h(task);
            }
        });
    }

    public void e(D0.l lVar) {
        p(Collections.singletonList(new E0.c(lVar, k(lVar))));
        this.f276f.add(lVar);
    }

    public Task j(List list) {
        f();
        return this.f273c.size() != 0 ? Tasks.forException(new com.google.firebase.firestore.T("Firestore transactions require all reads to be executed before all writes.", T.a.INVALID_ARGUMENT)) : this.f271a.n(list).continueWithTask(J0.s.f2500b, new Continuation() { // from class: A0.o0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f253a.i(task);
            }
        });
    }

    public void n(D0.l lVar, y0 y0Var) {
        p(Collections.singletonList(y0Var.a(lVar, k(lVar))));
        this.f276f.add(lVar);
    }

    public void o(D0.l lVar, z0 z0Var) {
        try {
            p(Collections.singletonList(z0Var.a(lVar, l(lVar))));
        } catch (com.google.firebase.firestore.T e3) {
            this.f275e = e3;
        }
        this.f276f.add(lVar);
    }
}
