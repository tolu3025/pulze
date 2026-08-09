package A0;

import A0.C0;
import A0.E0;
import A0.X;
import A0.n0;
import C0.C0267n;
import C0.C0274p0;
import C0.C0279r0;
import C0.EnumC0271o0;
import C0.R1;
import I0.U;
import J0.AbstractC0386b;
import J0.C0391g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.C0724e0;
import com.google.firebase.firestore.C0726f0;
import com.google.firebase.firestore.T;
import com.google.firebase.firestore.T0;
import com.google.protobuf.AbstractC0791i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import y0.C1288j;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements U.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f186o = "k0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0.M f187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I0.U f188b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f191e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C1288j f199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f200n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f189c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f190d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LinkedHashSet f192f = new LinkedHashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f193g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f194h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C0279r0 f195i = new C0279r0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f196j = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m0 f198l = m0.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f197k = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f201a;

        static {
            int[] iArr = new int[X.a.values().length];
            f201a = iArr;
            try {
                iArr[X.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f201a[X.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final D0.l f202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f203b;

        b(D0.l lVar) {
            this.f202a = lVar;
        }
    }

    interface c {
        void a(EnumC0201b0 enumC0201b0);

        void b(h0 h0Var, y1.l0 l0Var);

        void c(List list);
    }

    public k0(C0.M m3, I0.U u2, C1288j c1288j, int i3) {
        this.f187a = m3;
        this.f188b = u2;
        this.f191e = i3;
        this.f199m = c1288j;
    }

    private void B(X x2) {
        D0.l lVarA = x2.a();
        if (this.f193g.containsKey(lVarA) || this.f192f.contains(lVarA)) {
            return;
        }
        J0.A.a(f186o, "New document in limbo: %s", lVarA);
        this.f192f.add(lVarA);
        s();
    }

    private void D(List list, int i3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X x2 = (X) it.next();
            int i4 = a.f201a[x2.b().ordinal()];
            if (i4 == 1) {
                this.f195i.a(x2.a(), i3);
                B(x2);
            } else {
                if (i4 != 2) {
                    throw AbstractC0386b.a("Unknown limbo change type: %s", x2.b());
                }
                J0.A.a(f186o, "Document no longer in limbo: %s", x2.a());
                D0.l lVarA = x2.a();
                this.f195i.f(lVarA, i3);
                if (!this.f195i.c(lVarA)) {
                    v(lVarA);
                }
            }
        }
    }

    private void g(int i3, TaskCompletionSource taskCompletionSource) {
        Map map = (Map) this.f196j.get(this.f199m);
        if (map == null) {
            map = new HashMap();
            this.f196j.put(this.f199m, map);
        }
        map.put(Integer.valueOf(i3), taskCompletionSource);
    }

    private void h(String str) {
        AbstractC0386b.d(this.f200n != null, "Trying to call %s before setting callback", str);
    }

    private void i(t0.c cVar, I0.O o2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f189c.entrySet().iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) ((Map.Entry) it.next()).getValue();
            C0 c0C = i0Var.c();
            C0.b bVarH = c0C.h(cVar);
            boolean z2 = false;
            if (bVarH.b()) {
                bVarH = c0C.i(this.f187a.C(i0Var.a(), false).a(), bVarH);
            }
            I0.X x2 = o2 == null ? null : (I0.X) o2.d().get(Integer.valueOf(i0Var.b()));
            if (o2 != null && o2.e().get(Integer.valueOf(i0Var.b())) != null) {
                z2 = true;
            }
            D0 d0D = i0Var.c().d(bVarH, x2, z2);
            D(d0D.a(), i0Var.b());
            if (d0D.b() != null) {
                arrayList.add(d0D.b());
                arrayList2.add(C0.N.a(i0Var.b(), d0D.b()));
            }
        }
        this.f200n.c(arrayList);
        this.f187a.i0(arrayList2);
    }

    private boolean j(y1.l0 l0Var) {
        l0.b bVarM = l0Var.m();
        return (bVarM == l0.b.FAILED_PRECONDITION && (l0Var.n() != null ? l0Var.n() : "").contains("requires an index")) || bVarM == l0.b.PERMISSION_DENIED;
    }

    private void k() {
        Iterator it = this.f197k.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
            while (it2.hasNext()) {
                ((TaskCompletionSource) it2.next()).setException(new com.google.firebase.firestore.T("'waitForPendingWrites' task is cancelled due to User change.", T.a.CANCELLED));
            }
        }
        this.f197k.clear();
    }

    private E0 m(h0 h0Var, int i3, AbstractC0791i abstractC0791i) {
        C0274p0 c0274p0C = this.f187a.C(h0Var, true);
        E0.a aVarM = E0.a.NONE;
        if (this.f190d.get(Integer.valueOf(i3)) != null) {
            aVarM = ((i0) this.f189c.get((h0) ((List) this.f190d.get(Integer.valueOf(i3))).get(0))).c().m();
        }
        I0.X xA = I0.X.a(aVarM == E0.a.SYNCED, abstractC0791i);
        C0 c02 = new C0(h0Var, c0274p0C.b());
        D0 d0C = c02.c(c02.h(c0274p0C.a()), xA);
        D(d0C.a(), i3);
        this.f189c.put(h0Var, new i0(h0Var, i3, c02));
        if (!this.f190d.containsKey(Integer.valueOf(i3))) {
            this.f190d.put(Integer.valueOf(i3), new ArrayList(1));
        }
        ((List) this.f190d.get(Integer.valueOf(i3))).add(h0Var);
        return d0C.b();
    }

    private void q(y1.l0 l0Var, String str, Object... objArr) {
        if (j(l0Var)) {
            J0.A.e("Firestore", "%s: %s", String.format(str, objArr), l0Var);
        }
    }

    private void r(int i3, y1.l0 l0Var) {
        Map map = (Map) this.f196j.get(this.f199m);
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i3);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(numValueOf);
            if (taskCompletionSource != null) {
                if (l0Var != null) {
                    taskCompletionSource.setException(J0.L.o(l0Var));
                } else {
                    taskCompletionSource.setResult(null);
                }
                map.remove(numValueOf);
            }
        }
    }

    private void s() {
        while (!this.f192f.isEmpty() && this.f193g.size() < this.f191e) {
            Iterator it = this.f192f.iterator();
            D0.l lVar = (D0.l) it.next();
            it.remove();
            int iC = this.f198l.c();
            this.f194h.put(Integer.valueOf(iC), new b(lVar));
            this.f193g.put(lVar, Integer.valueOf(iC));
            this.f188b.G(new R1(new n0.b(f0.b(lVar.p()).D()), iC, -1L, EnumC0271o0.LIMBO_RESOLUTION));
        }
    }

    private void u(int i3, y1.l0 l0Var) {
        for (h0 h0Var : (List) this.f190d.get(Integer.valueOf(i3))) {
            this.f189c.remove(h0Var);
            if (!l0Var.o()) {
                this.f200n.b(h0Var, l0Var);
                q(l0Var, "Listen for %s failed", h0Var);
            }
        }
        this.f190d.remove(Integer.valueOf(i3));
        t0.e<D0.l> eVarD = this.f195i.d(i3);
        this.f195i.h(i3);
        for (D0.l lVar : eVarD) {
            if (!this.f195i.c(lVar)) {
                v(lVar);
            }
        }
    }

    private void v(D0.l lVar) {
        this.f192f.remove(lVar);
        Integer num = (Integer) this.f193g.get(lVar);
        if (num != null) {
            this.f188b.T(num.intValue());
            this.f193g.remove(lVar);
            this.f194h.remove(num);
            s();
        }
    }

    private void w(int i3) {
        if (this.f197k.containsKey(Integer.valueOf(i3))) {
            Iterator it = ((List) this.f197k.get(Integer.valueOf(i3))).iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).setResult(null);
            }
            this.f197k.remove(Integer.valueOf(i3));
        }
    }

    void A(h0 h0Var) {
        h("stopListeningToRemoteStore");
        i0 i0Var = (i0) this.f189c.get(h0Var);
        AbstractC0386b.d(i0Var != null, "Trying to stop listening to a query not found", new Object[0]);
        int iB = i0Var.b();
        List list = (List) this.f190d.get(Integer.valueOf(iB));
        list.remove(h0Var);
        if (list.isEmpty()) {
            this.f188b.T(iB);
        }
    }

    public Task C(C0391g c0391g, T0 t02, J0.y yVar) {
        return new u0(c0391g, this.f188b, t02, yVar).i();
    }

    public void E(List list, TaskCompletionSource taskCompletionSource) {
        h("writeMutations");
        C0267n c0267nT0 = this.f187a.t0(list);
        g(c0267nT0.b(), taskCompletionSource);
        i(c0267nT0.c(), null);
        this.f188b.u();
    }

    @Override // I0.U.c
    public void a(EnumC0201b0 enumC0201b0) {
        h("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f189c.entrySet().iterator();
        while (it.hasNext()) {
            D0 d0E = ((i0) ((Map.Entry) it.next()).getValue()).c().e(enumC0201b0);
            AbstractC0386b.d(d0E.a().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (d0E.b() != null) {
                arrayList.add(d0E.b());
            }
        }
        this.f200n.c(arrayList);
        this.f200n.a(enumC0201b0);
    }

    @Override // I0.U.c
    public t0.e b(int i3) {
        b bVar = (b) this.f194h.get(Integer.valueOf(i3));
        if (bVar != null && bVar.f203b) {
            return D0.l.h().d(bVar.f202a);
        }
        t0.e eVarH = D0.l.h();
        if (this.f190d.containsKey(Integer.valueOf(i3))) {
            for (h0 h0Var : (List) this.f190d.get(Integer.valueOf(i3))) {
                if (this.f189c.containsKey(h0Var)) {
                    eVarH = eVarH.m(((i0) this.f189c.get(h0Var)).c().n());
                }
            }
        }
        return eVarH;
    }

    @Override // I0.U.c
    public void c(int i3, y1.l0 l0Var) {
        h("handleRejectedListen");
        b bVar = (b) this.f194h.get(Integer.valueOf(i3));
        D0.l lVar = bVar != null ? bVar.f202a : null;
        if (lVar == null) {
            this.f187a.m0(i3);
            u(i3, l0Var);
            return;
        }
        this.f193g.remove(lVar);
        this.f194h.remove(Integer.valueOf(i3));
        s();
        D0.w wVar = D0.w.f1302b;
        f(new I0.O(wVar, Collections.emptyMap(), Collections.emptyMap(), Collections.singletonMap(lVar, D0.s.s(lVar, wVar)), Collections.singleton(lVar)));
    }

    @Override // I0.U.c
    public void d(int i3, y1.l0 l0Var) {
        h("handleRejectedWrite");
        t0.c cVarL0 = this.f187a.l0(i3);
        if (!cVarL0.isEmpty()) {
            q(l0Var, "Write failed at %s", ((D0.l) cVarL0.l()).p());
        }
        r(i3, l0Var);
        w(i3);
        i(cVarL0, null);
    }

    @Override // I0.U.c
    public void e(E0.h hVar) {
        h("handleSuccessfulWrite");
        r(hVar.b().e(), null);
        w(hVar.b().e());
        i(this.f187a.v(hVar), null);
    }

    @Override // I0.U.c
    public void f(I0.O o2) {
        h("handleRemoteEvent");
        for (Map.Entry entry : o2.d().entrySet()) {
            Integer num = (Integer) entry.getKey();
            I0.X x2 = (I0.X) entry.getValue();
            b bVar = (b) this.f194h.get(num);
            if (bVar != null) {
                AbstractC0386b.d((x2.b().size() + x2.c().size()) + x2.d().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (x2.b().size() > 0) {
                    bVar.f203b = true;
                } else if (x2.c().size() > 0) {
                    AbstractC0386b.d(bVar.f203b, "Received change for limbo target document without add.", new Object[0]);
                } else if (x2.d().size() > 0) {
                    AbstractC0386b.d(bVar.f203b, "Received remove for limbo target document without add.", new Object[0]);
                    bVar.f203b = false;
                }
            }
        }
        i(this.f187a.x(o2), o2);
    }

    public void l(C1288j c1288j) {
        boolean z2 = !this.f199m.equals(c1288j);
        this.f199m = c1288j;
        if (z2) {
            k();
            i(this.f187a.M(c1288j), null);
        }
        this.f188b.v();
    }

    public int n(h0 h0Var, boolean z2) {
        h("listen");
        AbstractC0386b.d(!this.f189c.containsKey(h0Var), "We already listen to query: %s", h0Var);
        R1 r1W = this.f187a.w(h0Var.i());
        this.f200n.c(Collections.singletonList(m(h0Var, r1W.h(), r1W.d())));
        if (z2) {
            this.f188b.G(r1W);
        }
        return r1W.h();
    }

    public void o(h0 h0Var) {
        h("listenToRemoteStore");
        AbstractC0386b.d(this.f189c.containsKey(h0Var), "This is the first listen to query: %s", h0Var);
        this.f188b.G(this.f187a.w(h0Var.i()));
    }

    public void p(z0.f fVar, C0724e0 c0724e0) {
        try {
            try {
                z0.e eVarD = fVar.d();
                if (this.f187a.N(eVarD)) {
                    c0724e0.e(C0726f0.b(eVarD));
                    try {
                        fVar.b();
                        return;
                    } catch (IOException e3) {
                        J0.A.e("SyncEngine", "Exception while closing bundle", e3);
                        return;
                    }
                }
                c0724e0.f(C0726f0.a(eVarD));
                z0.d dVar = new z0.d(this.f187a, eVarD);
                long j3 = 0;
                while (true) {
                    z0.c cVarF = fVar.f();
                    if (cVarF == null) {
                        i(dVar.b(), null);
                        this.f187a.a(eVarD);
                        c0724e0.e(C0726f0.b(eVarD));
                        try {
                            fVar.b();
                            return;
                        } catch (IOException e4) {
                            J0.A.e("SyncEngine", "Exception while closing bundle", e4);
                            return;
                        }
                    }
                    long jE = fVar.e();
                    C0726f0 c0726f0A = dVar.a(cVarF, jE - j3);
                    if (c0726f0A != null) {
                        c0724e0.f(c0726f0A);
                    }
                    j3 = jE;
                }
            } catch (Exception e5) {
                J0.A.e("Firestore", "Loading bundle failed : %s", e5);
                c0724e0.d(new com.google.firebase.firestore.T("Bundle failed to load", T.a.INVALID_ARGUMENT, e5));
                try {
                    fVar.b();
                } catch (IOException e6) {
                    J0.A.e("SyncEngine", "Exception while closing bundle", e6);
                }
            }
        } catch (Throwable th) {
            try {
                fVar.b();
            } catch (IOException e7) {
                J0.A.e("SyncEngine", "Exception while closing bundle", e7);
            }
            throw th;
        }
    }

    public void t(TaskCompletionSource taskCompletionSource) {
        if (!this.f188b.n()) {
            J0.A.a(f186o, "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
        }
        int iD = this.f187a.D();
        if (iD == -1) {
            taskCompletionSource.setResult(null);
            return;
        }
        if (!this.f197k.containsKey(Integer.valueOf(iD))) {
            this.f197k.put(Integer.valueOf(iD), new ArrayList());
        }
        ((List) this.f197k.get(Integer.valueOf(iD))).add(taskCompletionSource);
    }

    public Task x(f0 f0Var, List list) {
        return this.f188b.K(f0Var, list);
    }

    public void y(c cVar) {
        this.f200n = cVar;
    }

    void z(h0 h0Var, boolean z2) {
        h("stopListening");
        i0 i0Var = (i0) this.f189c.get(h0Var);
        AbstractC0386b.d(i0Var != null, "Trying to stop listening to a query not found", new Object[0]);
        this.f189c.remove(h0Var);
        int iB = i0Var.b();
        List list = (List) this.f190d.get(Integer.valueOf(iB));
        list.remove(h0Var);
        if (list.isEmpty()) {
            this.f187a.m0(iB);
            if (z2) {
                this.f188b.T(iB);
            }
            u(iB, y1.l0.f11960e);
        }
    }
}
