package C0;

import A0.f0;
import A0.h0;
import C0.InterfaceC0264m;
import D0.q;
import J0.AbstractC0386b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: C0.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0268n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0276q f1039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0264m f1040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1042d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1043e = 100;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f1044f = 2.0d;

    private t0.c a(Iterable iterable, A0.h0 h0Var, q.a aVar) {
        t0.c cVarI = this.f1039a.i(h0Var, aVar);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            D0.i iVar = (D0.i) it.next();
            cVarI = cVarI.m(iVar.getKey(), iVar);
        }
        return cVarI;
    }

    private t0.e b(A0.h0 h0Var, t0.c cVar) {
        t0.e eVar = new t0.e(Collections.emptyList(), h0Var.a());
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            D0.i iVar = (D0.i) ((Map.Entry) it.next()).getValue();
            if (h0Var.e(iVar)) {
                eVar = eVar.d(iVar);
            }
        }
        return eVar;
    }

    private void c(A0.h0 h0Var, C0265m0 c0265m0, int i3) {
        if (h0Var.c()) {
            J0.A.a("QueryEngine", "SDK will skip creating cache indexes for pipelines.", new Object[0]);
            return;
        }
        if (c0265m0.a() < this.f1043e) {
            J0.A.a("QueryEngine", "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents.", h0Var.toString(), Integer.valueOf(this.f1043e));
            return;
        }
        J0.A.a("QueryEngine", "Query: %s, scans %s local documents and returns %s documents as results.", h0Var.toString(), Integer.valueOf(c0265m0.a()), Integer.valueOf(i3));
        if (c0265m0.a() > this.f1044f * ((double) i3)) {
            this.f1040b.g(h0Var.h().D());
            J0.A.a("QueryEngine", "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance.", h0Var.toString());
        }
    }

    private t0.c d(A0.h0 h0Var, C0265m0 c0265m0) {
        if (J0.A.c()) {
            J0.A.a("QueryEngine", "Using full collection scan to execute query: %s", h0Var.toString());
        }
        return this.f1039a.j(h0Var, q.a.f1271a, c0265m0);
    }

    private boolean g(A0.h0 h0Var, int i3, t0.e eVar, D0.w wVar) {
        if (h0Var.c()) {
            return h0Var.b();
        }
        if (!h0Var.h().p()) {
            return false;
        }
        if (i3 != eVar.size()) {
            return true;
        }
        D0.i iVar = (D0.i) (h0Var.h().l() == f0.a.LIMIT_TO_FIRST ? eVar.a() : eVar.b());
        if (iVar == null) {
            return false;
        }
        return iVar.h() || iVar.l().compareTo(wVar) > 0;
    }

    private t0.c h(A0.h0 h0Var) {
        h0.b bVar;
        if (h0Var.c()) {
            J0.A.a("QueryEngine", "Skipping using indexes for pipelines.", new Object[0]);
            return null;
        }
        if (h0Var.h().v()) {
            return null;
        }
        A0.l0 l0VarD = h0Var.h().D();
        InterfaceC0264m.a aVarD = this.f1040b.d(l0VarD);
        if (aVarD.equals(InterfaceC0264m.a.NONE)) {
            return null;
        }
        if (h0Var.h().p() && aVarD.equals(InterfaceC0264m.a.PARTIAL)) {
            bVar = new h0.b(h0Var.h().s(-1L));
        } else {
            List listL = this.f1040b.l(l0VarD);
            AbstractC0386b.d(listL != null, "index manager must return results for partial and full indexes.", new Object[0]);
            t0.c cVarD = this.f1039a.d(listL);
            q.a aVarI = this.f1040b.i(l0VarD);
            t0.e eVarB = b(h0Var, cVarD);
            if (!g(h0Var, listL.size(), eVarB, aVarI.l())) {
                return a(eVarB, h0Var, aVarI);
            }
            bVar = new h0.b(h0Var.h().s(-1L));
        }
        return h(bVar);
    }

    private t0.c i(A0.h0 h0Var, t0.e eVar, D0.w wVar) {
        if (h0Var.f() || wVar.equals(D0.w.f1302b)) {
            return null;
        }
        t0.e eVarB = b(h0Var, this.f1039a.d(eVar));
        if (g(h0Var, eVar.size(), eVarB, wVar)) {
            return null;
        }
        if (J0.A.c()) {
            J0.A.a("QueryEngine", "Re-using previous result from %s to execute query: %s", wVar.toString(), h0Var.toString());
        }
        return a(eVarB, h0Var, q.a.h(wVar, -1));
    }

    public t0.c e(A0.h0 h0Var, D0.w wVar, t0.e eVar) {
        AbstractC0386b.d(this.f1041c, "initialize() not called", new Object[0]);
        t0.c cVarH = h(h0Var);
        if (cVarH != null) {
            return cVarH;
        }
        t0.c cVarI = i(h0Var, eVar, wVar);
        if (cVarI != null) {
            return cVarI;
        }
        C0265m0 c0265m0 = new C0265m0();
        t0.c cVarD = d(h0Var, c0265m0);
        if (cVarD != null && this.f1042d) {
            c(h0Var, c0265m0, cVarD.size());
        }
        return cVarD;
    }

    public void f(C0276q c0276q, InterfaceC0264m interfaceC0264m) {
        this.f1039a = c0276q;
        this.f1040b = interfaceC0264m;
        this.f1041c = true;
    }

    public void j(boolean z2) {
        this.f1042d = z2;
    }
}
