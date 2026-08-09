package com.google.firebase.firestore;

import A0.AbstractC0204d;
import A0.AbstractC0219q;
import A0.C0203c0;
import A0.C0210h;
import A0.C0211i;
import A0.C0213k;
import A0.C0217o;
import A0.C0218p;
import A0.f0;
import A0.h0;
import J0.AbstractC0386b;
import V0.C0423b;
import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.AbstractC0764z;
import com.google.firebase.firestore.T;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final A0.f0 f6176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final FirebaseFirestore f6177b;

    class a extends ArrayList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC0715a f6178a;

        a(AbstractC0715a abstractC0715a) {
            this.f6178a = abstractC0715a;
            add(abstractC0715a);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6180a;

        static {
            int[] iArr = new int[C0218p.b.values().length];
            f6180a = iArr;
            try {
                iArr[C0218p.b.NOT_EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6180a[C0218p.b.ARRAY_CONTAINS_ANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6180a[C0218p.b.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6180a[C0218p.b.NOT_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum c {
        ASCENDING,
        DESCENDING
    }

    D0(A0.f0 f0Var, FirebaseFirestore firebaseFirestore) {
        this.f6176a = (A0.f0) J0.C.b(f0Var);
        this.f6177b = (FirebaseFirestore) J0.C.b(firebaseFirestore);
    }

    private D0 A(D0.r rVar, c cVar) {
        J0.C.c(cVar, "Provided direction must not be null.");
        if (this.f6176a.o() != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
        }
        if (this.f6176a.g() == null) {
            return new D0(this.f6176a.A(C0203c0.d(cVar == c.ASCENDING ? C0203c0.a.ASCENDING : C0203c0.a.DESCENDING, rVar)), this.f6177b);
        }
        throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
    }

    private AbstractC0219q C(AbstractC0764z.a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.m().iterator();
        while (it.hasNext()) {
            AbstractC0219q abstractC0219qF = F((AbstractC0764z) it.next());
            if (!abstractC0219qF.b().isEmpty()) {
                arrayList.add(abstractC0219qF);
            }
        }
        return arrayList.size() == 1 ? (AbstractC0219q) arrayList.get(0) : new C0213k(arrayList, aVar.n());
    }

    private V0.I D(Object obj) {
        D0.f fVarB;
        D0.l lVarR;
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
            }
            if (!this.f6176a.q() && str.contains("/")) {
                throw new IllegalArgumentException("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '" + str + "' contains a '/' character.");
            }
            D0.u uVar = (D0.u) this.f6176a.n().l(D0.u.B(str));
            if (!D0.l.r(uVar)) {
                throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + uVar + "' is not because it has an odd number of segments (" + uVar.w() + ").");
            }
            fVarB = p().B();
            lVarR = D0.l.j(uVar);
        } else {
            if (!(obj instanceof C0752t)) {
                throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: " + J0.L.w(obj));
            }
            fVarB = p().B();
            lVarR = ((C0752t) obj).r();
        }
        return D0.z.d0(fVarB, lVarR);
    }

    private C0218p E(AbstractC0764z.b bVar) {
        V0.I i3;
        C0760x c0760xM = bVar.m();
        C0218p.b bVarN = bVar.n();
        Object objO = bVar.o();
        J0.C.c(c0760xM, "Provided field path must not be null.");
        J0.C.c(bVarN, "Provided op must not be null.");
        if (!c0760xM.c().D()) {
            C0218p.b bVar2 = C0218p.b.IN;
            if (bVarN == bVar2 || bVarN == C0218p.b.NOT_IN || bVarN == C0218p.b.ARRAY_CONTAINS_ANY) {
                I(objO, bVarN);
            }
            i3 = this.f6177b.F().i(objO, bVarN == bVar2 || bVarN == C0218p.b.NOT_IN);
        } else {
            if (bVarN == C0218p.b.ARRAY_CONTAINS || bVarN == C0218p.b.ARRAY_CONTAINS_ANY) {
                throw new IllegalArgumentException("Invalid query. You can't perform '" + bVarN.toString() + "' queries on FieldPath.documentId().");
            }
            if (bVarN == C0218p.b.IN || bVarN == C0218p.b.NOT_IN) {
                I(objO, bVarN);
                C0423b.C0068b c0068bJ0 = C0423b.j0();
                Iterator it = ((List) objO).iterator();
                while (it.hasNext()) {
                    c0068bJ0.x(D(it.next()));
                }
                i3 = (V0.I) V0.I.J0().x(c0068bJ0).n();
            } else {
                i3 = D(objO);
            }
        }
        return C0218p.e(c0760xM.c(), bVarN, i3);
    }

    private AbstractC0219q F(AbstractC0764z abstractC0764z) {
        boolean z2 = abstractC0764z instanceof AbstractC0764z.b;
        AbstractC0386b.d(z2 || (abstractC0764z instanceof AbstractC0764z.a), "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", new Object[0]);
        return z2 ? E((AbstractC0764z.b) abstractC0764z) : C((AbstractC0764z.a) abstractC0764z);
    }

    private void I(Object obj, C0218p.b bVar) {
        if (!(obj instanceof List) || ((List) obj).size() == 0) {
            throw new IllegalArgumentException("Invalid Query. A non-empty array is required for '" + bVar.toString() + "' filters.");
        }
    }

    private void J() {
        if (this.f6176a.l().equals(f0.a.LIMIT_TO_LAST) && this.f6176a.h().isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    private void K(A0.f0 f0Var, C0218p c0218p) {
        C0218p.b bVarG = c0218p.g();
        C0218p.b bVarN = n(f0Var.i(), k(bVarG));
        if (bVarN != null) {
            if (bVarN == bVarG) {
                throw new IllegalArgumentException("Invalid Query. You cannot use more than one '" + bVarG.toString() + "' filter.");
            }
            throw new IllegalArgumentException("Invalid Query. You cannot use '" + bVarG.toString() + "' filters with '" + bVarN.toString() + "' filters.");
        }
    }

    private void L(AbstractC0219q abstractC0219q) {
        A0.f0 f0VarE = this.f6176a;
        for (C0218p c0218p : abstractC0219q.c()) {
            K(f0VarE, c0218p);
            f0VarE = f0VarE.e(c0218p);
        }
    }

    private InterfaceC0720c0 h(Executor executor, final C0217o.b bVar, final Activity activity, final InterfaceC0756v interfaceC0756v) {
        J();
        final C0210h c0210h = new C0210h(executor, new InterfaceC0756v() { // from class: com.google.firebase.firestore.x0
            @Override // com.google.firebase.firestore.InterfaceC0756v
            public final void a(Object obj, T t2) {
                this.f6417a.s(interfaceC0756v, (A0.E0) obj, t2);
            }
        });
        return (InterfaceC0720c0) this.f6177b.s(new J0.y() { // from class: com.google.firebase.firestore.y0
            @Override // J0.y
            public final Object c(Object obj) {
                return this.f6424a.u(bVar, c0210h, activity, (A0.S) obj);
            }
        });
    }

    private C0211i j(String str, Object[] objArr, boolean z2) {
        V0.I iH;
        List listH = this.f6176a.h();
        if (objArr.length > listH.size()) {
            throw new IllegalArgumentException("Too many arguments provided to " + str + "(). The number of arguments must be less than or equal to the number of orderBy() clauses.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (!((C0203c0) listH.get(i3)).c().equals(D0.r.f1277b)) {
                iH = this.f6177b.F().h(obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + obj + ".");
                }
                String str2 = (String) obj;
                if (!this.f6176a.q() && str2.contains("/")) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to " + str + "() must be a plain document ID, but '" + str2 + "' contains a slash.");
                }
                D0.u uVar = (D0.u) this.f6176a.n().l(D0.u.B(str2));
                if (!D0.l.r(uVar)) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + uVar + "' is not because it contains an odd number of segments.");
                }
                iH = D0.z.d0(this.f6177b.B(), D0.l.j(uVar));
            }
            arrayList.add(iH);
        }
        return new C0211i(arrayList, z2);
    }

    private List k(C0218p.b bVar) {
        int i3 = b.f6180a[bVar.ordinal()];
        return i3 != 1 ? (i3 == 2 || i3 == 3) ? Arrays.asList(C0218p.b.NOT_IN) : i3 != 4 ? new ArrayList() : Arrays.asList(C0218p.b.ARRAY_CONTAINS_ANY, C0218p.b.IN, C0218p.b.NOT_IN, C0218p.b.NOT_EQUAL) : Arrays.asList(C0218p.b.NOT_EQUAL, C0218p.b.NOT_IN);
    }

    private C0218p.b n(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (C0218p c0218p : ((AbstractC0219q) it.next()).c()) {
                if (list2.contains(c0218p.g())) {
                    return c0218p.g();
                }
            }
        }
        return null;
    }

    private Task q(final P0 p02) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        C0217o.b bVar = new C0217o.b();
        bVar.f235a = true;
        bVar.f236b = true;
        bVar.f237c = true;
        taskCompletionSource2.setResult(h(J0.s.f2500b, bVar, null, new InterfaceC0756v() { // from class: com.google.firebase.firestore.B0
            @Override // com.google.firebase.firestore.InterfaceC0756v
            public final void a(Object obj, T t2) {
                D0.x(taskCompletionSource, taskCompletionSource2, p02, (G0) obj, t2);
            }
        }));
        return taskCompletionSource.getTask();
    }

    private static C0217o.b r(EnumC0736k0 enumC0736k0, EnumC0718b0 enumC0718b0) {
        C0217o.b bVar = new C0217o.b();
        EnumC0736k0 enumC0736k02 = EnumC0736k0.INCLUDE;
        bVar.f235a = enumC0736k0 == enumC0736k02;
        bVar.f236b = enumC0736k0 == enumC0736k02;
        bVar.f237c = false;
        bVar.f238d = enumC0718b0;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(InterfaceC0756v interfaceC0756v, A0.E0 e02, T t2) {
        if (t2 != null) {
            interfaceC0756v.a(null, t2);
        } else {
            AbstractC0386b.d(e02 != null, "Got event without value or error set", new Object[0]);
            interfaceC0756v.a(new G0(this, e02, this.f6177b), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(C0210h c0210h, A0.S s2, A0.g0 g0Var) {
        c0210h.d();
        s2.q0(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC0720c0 u(C0217o.b bVar, final C0210h c0210h, Activity activity, final A0.S s2) {
        final A0.g0 g0VarL0 = s2.l0(new h0.b(this.f6176a), bVar, c0210h);
        return AbstractC0204d.c(activity, new InterfaceC0720c0() { // from class: com.google.firebase.firestore.C0
            @Override // com.google.firebase.firestore.InterfaceC0720c0
            public final void remove() {
                D0.t(c0210h, s2, g0VarL0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task v(A0.S s2) {
        return s2.H(new h0.b(this.f6176a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ G0 w(Task task) {
        return new G0(new D0(this.f6176a, this.f6177b), (A0.E0) task.getResult(), this.f6177b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, P0 p02, G0 g02, T t2) {
        if (t2 != null) {
            taskCompletionSource.setException(t2);
            return;
        }
        try {
            ((InterfaceC0720c0) Tasks.await(taskCompletionSource2.getTask())).remove();
            if (g02.n().b() && p02 == P0.SERVER) {
                taskCompletionSource.setException(new T("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", T.a.UNAVAILABLE));
            } else {
                taskCompletionSource.setResult(g02);
            }
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            throw AbstractC0386b.b(e3, "Failed to register a listener for a query result", new Object[0]);
        } catch (ExecutionException e4) {
            throw AbstractC0386b.b(e4, "Failed to register a listener for a query result", new Object[0]);
        }
    }

    public D0 B(C0760x c0760x, c cVar) {
        J0.C.c(c0760x, "Provided field path must not be null.");
        return A(c0760x.c(), cVar);
    }

    public D0 G(Object... objArr) {
        return new D0(this.f6176a.B(j("startAfter", objArr, false)), this.f6177b);
    }

    public D0 H(Object... objArr) {
        return new D0(this.f6176a.B(j("startAt", objArr, true)), this.f6177b);
    }

    public D0 M(AbstractC0764z abstractC0764z) {
        AbstractC0219q abstractC0219qF = F(abstractC0764z);
        if (abstractC0219qF.b().isEmpty()) {
            return this;
        }
        L(abstractC0219qF);
        return new D0(this.f6176a.e(abstractC0219qF), this.f6177b);
    }

    public D0 N(C0760x c0760x, Object obj) {
        return M(AbstractC0764z.b(c0760x, obj));
    }

    public D0 O(C0760x c0760x, List list) {
        return M(AbstractC0764z.c(c0760x, list));
    }

    public D0 P(C0760x c0760x, Object obj) {
        return M(AbstractC0764z.d(c0760x, obj));
    }

    public D0 Q(C0760x c0760x, Object obj) {
        return M(AbstractC0764z.e(c0760x, obj));
    }

    public D0 R(C0760x c0760x, Object obj) {
        return M(AbstractC0764z.f(c0760x, obj));
    }

    public D0 S(C0760x c0760x, List list) {
        return M(AbstractC0764z.g(c0760x, list));
    }

    public D0 T(C0760x c0760x, Object obj) {
        return M(AbstractC0764z.h(c0760x, obj));
    }

    public D0 U(C0760x c0760x, Object obj) {
        return M(AbstractC0764z.i(c0760x, obj));
    }

    public D0 V(C0760x c0760x, Object obj) {
        return M(AbstractC0764z.j(c0760x, obj));
    }

    public D0 W(C0760x c0760x, List list) {
        return M(AbstractC0764z.k(c0760x, list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        return this.f6176a.equals(d02.f6176a) && this.f6177b.equals(d02.f6177b);
    }

    public InterfaceC0720c0 g(N0 n02, InterfaceC0756v interfaceC0756v) {
        J0.C.c(n02, "Provided options value must not be null.");
        J0.C.c(interfaceC0756v, "Provided EventListener must not be null.");
        return h(n02.b(), r(n02.c(), n02.d()), n02.a(), interfaceC0756v);
    }

    public int hashCode() {
        return (this.f6176a.hashCode() * 31) + this.f6177b.hashCode();
    }

    public C0721d i(AbstractC0715a abstractC0715a, AbstractC0715a... abstractC0715aArr) {
        a aVar = new a(abstractC0715a);
        aVar.addAll(Arrays.asList(abstractC0715aArr));
        return new C0721d(this, aVar);
    }

    public D0 l(Object... objArr) {
        return new D0(this.f6176a.d(j("endAt", objArr, true)), this.f6177b);
    }

    public D0 m(Object... objArr) {
        return new D0(this.f6176a.d(j("endBefore", objArr, false)), this.f6177b);
    }

    public Task o(P0 p02) {
        J();
        return p02 == P0.CACHE ? ((Task) this.f6177b.s(new J0.y() { // from class: com.google.firebase.firestore.z0
            @Override // J0.y
            public final Object c(Object obj) {
                return this.f6433a.v((A0.S) obj);
            }
        })).continueWith(J0.s.f2500b, new Continuation() { // from class: com.google.firebase.firestore.A0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f6167a.w(task);
            }
        }) : q(p02);
    }

    public FirebaseFirestore p() {
        return this.f6177b;
    }

    public D0 y(long j3) {
        if (j3 > 0) {
            return new D0(this.f6176a.s(j3), this.f6177b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j3 + ") is invalid. Limit must be positive.");
    }

    public D0 z(long j3) {
        if (j3 > 0) {
            return new D0(this.f6176a.t(j3), this.f6177b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limitToLast (" + j3 + ") is invalid. Limit must be positive.");
    }
}
