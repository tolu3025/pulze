package A0;

import A0.C0215m;
import A0.E0;
import A0.X;
import A0.f0;
import J0.AbstractC0386b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f22a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private D0.n f25d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t0.e f26e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E0.a f23b = E0.a.NONE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private t0.e f27f = D0.l.h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t0.e f28g = D0.l.h();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29a;

        static {
            int[] iArr = new int[C0215m.a.values().length];
            f29a = iArr;
            try {
                iArr[C0215m.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29a[C0215m.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29a[C0215m.a.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29a[C0215m.a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final D0.n f30a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C0216n f31b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f32c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final t0.e f33d;

        private b(D0.n nVar, C0216n c0216n, t0.e eVar, boolean z2) {
            this.f30a = nVar;
            this.f31b = c0216n;
            this.f33d = eVar;
            this.f32c = z2;
        }

        public boolean b() {
            return this.f32c;
        }

        /* synthetic */ b(D0.n nVar, C0216n c0216n, t0.e eVar, boolean z2, a aVar) {
            this(nVar, c0216n, eVar, z2);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final D0.i f34a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final D0.i f35b;

        c(D0.i iVar, D0.i iVar2) {
            this.f34a = iVar;
            this.f35b = iVar2;
        }
    }

    public C0(h0 h0Var, t0.e eVar) {
        this.f22a = h0Var;
        this.f25d = D0.n.f(h0Var.a());
        this.f26e = eVar;
    }

    private void f(I0.X x2) {
        if (x2 != null) {
            Iterator it = x2.b().iterator();
            while (it.hasNext()) {
                this.f26e = this.f26e.d((D0.l) it.next());
            }
            for (D0.l lVar : x2.c()) {
                AbstractC0386b.d(this.f26e.contains(lVar), "Modified document %s not found in view.", lVar);
            }
            Iterator it2 = x2.d().iterator();
            while (it2.hasNext()) {
                this.f26e = this.f26e.l((D0.l) it2.next());
            }
            this.f24c = x2.f();
        }
    }

    private static int g(C0215m c0215m) {
        int i3 = a.f29a[c0215m.c().ordinal()];
        int i4 = 1;
        if (i3 != 1) {
            i4 = 2;
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + c0215m.c());
            }
        }
        return i4;
    }

    private static Long j(h0 h0Var) {
        long jK;
        if (h0Var.c()) {
            Integer numB = AbstractC0207e0.b(h0Var.g());
            if (numB == null) {
                return null;
            }
            jK = numB.intValue();
        } else {
            f0 f0VarH = h0Var.h();
            if (!f0VarH.p()) {
                return null;
            }
            jK = f0VarH.k();
        }
        return Long.valueOf(jK);
    }

    private static c k(h0 h0Var, D0.n nVar) {
        Long lJ = j(h0Var);
        if (lJ == null) {
            return new c(null, null);
        }
        if (!h0Var.c()) {
            f0 f0VarH = h0Var.h();
            if (f0VarH.l() == f0.a.LIMIT_TO_FIRST && nVar.size() == f0VarH.k()) {
                return new c(nVar.n(), null);
            }
            if (f0VarH.l() == f0.a.LIMIT_TO_LAST && nVar.size() == f0VarH.k()) {
                return new c(null, nVar.m());
            }
        } else {
            if (lJ.longValue() > 0 && nVar.size() == lJ.longValue()) {
                return new c(nVar.n(), null);
            }
            if (lJ.longValue() < 0 && nVar.size() == (-lJ.longValue())) {
                return new c(null, nVar.m());
            }
        }
        return new c(null, null);
    }

    private static f0.a l(h0 h0Var) {
        if (!h0Var.c()) {
            return h0Var.h().l();
        }
        Long lJ = j(h0Var);
        return (lJ == null || lJ.longValue() <= 0) ? f0.a.LIMIT_TO_LAST : f0.a.LIMIT_TO_FIRST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int o(Comparator comparator, C0215m c0215m, C0215m c0215m2) {
        int iCompare = Integer.compare(g(c0215m), g(c0215m2));
        return iCompare != 0 ? iCompare : comparator.compare(c0215m.b(), c0215m2.b());
    }

    private boolean p(D0.l lVar) {
        D0.i iVarL;
        return (this.f26e.contains(lVar) || (iVarL = this.f25d.l(lVar)) == null || iVarL.g()) ? false : true;
    }

    private boolean q(D0.i iVar, D0.i iVar2) {
        return iVar.g() && iVar2.f() && !iVar2.g();
    }

    private List r() {
        if (!this.f24c) {
            return Collections.emptyList();
        }
        t0.e<D0.l> eVar = this.f27f;
        this.f27f = D0.l.h();
        for (D0.i iVar : this.f25d) {
            if (p(iVar.getKey())) {
                this.f27f = this.f27f.d(iVar.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(eVar.size() + this.f27f.size());
        for (D0.l lVar : eVar) {
            if (!this.f27f.contains(lVar)) {
                arrayList.add(new X(X.a.REMOVED, lVar));
            }
        }
        for (D0.l lVar2 : this.f27f) {
            if (!eVar.contains(lVar2)) {
                arrayList.add(new X(X.a.ADDED, lVar2));
            }
        }
        return arrayList;
    }

    public D0 b(b bVar) {
        return c(bVar, null);
    }

    public D0 c(b bVar, I0.X x2) {
        return d(bVar, x2, false);
    }

    public D0 d(b bVar, I0.X x2, boolean z2) {
        E0 e02;
        AbstractC0386b.d(!bVar.f32c, "Cannot apply changes that need a refill", new Object[0]);
        D0.n nVar = this.f25d;
        this.f25d = bVar.f30a;
        this.f28g = bVar.f33d;
        List listB = bVar.f31b.b();
        final Comparator comparatorA = this.f22a.a();
        Collections.sort(listB, new Comparator() { // from class: A0.B0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C0.o(comparatorA, (C0215m) obj, (C0215m) obj2);
            }
        });
        f(x2);
        List listEmptyList = z2 ? Collections.emptyList() : r();
        E0.a aVar = (this.f27f.size() == 0 && this.f24c && !z2) ? E0.a.SYNCED : E0.a.LOCAL;
        boolean z3 = aVar != this.f23b;
        this.f23b = aVar;
        if (listB.size() != 0 || z3) {
            e02 = new E0(this.f22a, bVar.f30a, nVar, listB, aVar == E0.a.LOCAL, bVar.f33d, z3, false, (x2 == null || x2.e().isEmpty()) ? false : true);
        } else {
            e02 = null;
        }
        return new D0(e02, listEmptyList);
    }

    public D0 e(EnumC0201b0 enumC0201b0) {
        if (!this.f24c || enumC0201b0 != EnumC0201b0.OFFLINE) {
            return new D0(null, Collections.emptyList());
        }
        this.f24c = false;
        return b(new b(this.f25d, new C0216n(), this.f28g, false, null));
    }

    public b h(t0.c cVar) {
        return i(cVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb A[PHI: r17
      0x00eb: PHI (r17v5 D0.n) = (r17v0 D0.n), (r17v0 D0.n), (r17v6 D0.n), (r17v6 D0.n) binds: [B:59:0x00e7, B:60:0x00e9, B:46:0x00c1, B:43:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public A0.C0.b i(t0.c r19, A0.C0.b r20) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.C0.i(t0.c, A0.C0$b):A0.C0$b");
    }

    public E0.a m() {
        return this.f23b;
    }

    t0.e n() {
        return this.f26e;
    }
}
