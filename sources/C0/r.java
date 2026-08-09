package C0;

import A0.f0;
import A0.n0;
import D0.q;
import H0.a;
import H0.b;
import H0.c;
import H0.d;
import H0.e;
import J0.AbstractC0386b;
import T0.a;
import U0.a;
import V0.C0432k;
import V0.F;
import V0.J;
import V0.p;
import com.google.protobuf.AbstractC0791i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I0.P f1082a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f1084b;

        static {
            int[] iArr = new int[c.EnumC0043c.values().length];
            f1084b = iArr;
            try {
                iArr[c.EnumC0043c.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1084b[c.EnumC0043c.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1084b[c.EnumC0043c.PIPELINE_QUERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[a.c.values().length];
            f1083a = iArr2;
            try {
                iArr2[a.c.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1083a[a.c.NO_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1083a[a.c.UNKNOWN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public r(I0.P p2) {
        this.f1082a = p2;
    }

    private D0.s b(C0432k c0432k, boolean z2) {
        D0.s sVarQ = D0.s.q(this.f1082a.o(c0432k.h0()), this.f1082a.E(c0432k.i0()), D0.t.h(c0432k.f0()));
        return z2 ? sVarQ.u() : sVarQ;
    }

    private D0.s g(H0.b bVar, boolean z2) {
        D0.s sVarS = D0.s.s(this.f1082a.o(bVar.d0()), this.f1082a.E(bVar.e0()));
        return z2 ? sVarS.u() : sVarS;
    }

    private D0.s i(H0.d dVar) {
        return D0.s.t(this.f1082a.o(dVar.d0()), this.f1082a.E(dVar.e0()));
    }

    private C0432k k(D0.i iVar) {
        C0432k.b bVarN0 = C0432k.n0();
        bVarN0.x(this.f1082a.R(iVar.getKey()));
        bVarN0.w(iVar.b().k());
        bVarN0.y(this.f1082a.c0(iVar.l().e()));
        return (C0432k) bVarN0.n();
    }

    private H0.b p(D0.i iVar) {
        b.C0042b c0042bF0 = H0.b.f0();
        c0042bF0.w(this.f1082a.R(iVar.getKey()));
        c0042bF0.x(this.f1082a.c0(iVar.l().e()));
        return (H0.b) c0042bF0.n();
    }

    private H0.d r(D0.i iVar) {
        d.b bVarF0 = H0.d.f0();
        bVarF0.w(this.f1082a.R(iVar.getKey()));
        bVarF0.x(this.f1082a.c0(iVar.l().e()));
        return (H0.d) bVarF0.n();
    }

    public z0.i a(U0.a aVar) {
        return new z0.i(this.f1082a.z(aVar.e0(), aVar.f0()), aVar.d0().equals(a.c.FIRST) ? f0.a.LIMIT_TO_FIRST : f0.a.LIMIT_TO_LAST);
    }

    public List c(T0.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (a.c cVar : aVar.e0()) {
            arrayList.add(q.c.e(D0.r.B(cVar.d0()), cVar.f0().equals(a.c.d.ARRAY_CONFIG) ? q.c.a.CONTAINS : cVar.e0().equals(a.c.EnumC0059c.ASCENDING) ? q.c.a.ASCENDING : q.c.a.DESCENDING));
        }
        return arrayList;
    }

    D0.s d(H0.a aVar) {
        int i3 = a.f1083a[aVar.f0().ordinal()];
        if (i3 == 1) {
            return b(aVar.e0(), aVar.g0());
        }
        if (i3 == 2) {
            return g(aVar.h0(), aVar.g0());
        }
        if (i3 == 3) {
            return i(aVar.i0());
        }
        throw AbstractC0386b.a("Unknown MaybeDocument %s", aVar);
    }

    public E0.f e(V0.J j3) {
        return this.f1082a.r(j3);
    }

    E0.g f(H0.e eVar) {
        int iK0 = eVar.k0();
        C1004r c1004rC = this.f1082a.C(eVar.l0());
        int iJ0 = eVar.j0();
        ArrayList arrayList = new ArrayList(iJ0);
        for (int i3 = 0; i3 < iJ0; i3++) {
            arrayList.add(this.f1082a.r(eVar.i0(i3)));
        }
        ArrayList arrayList2 = new ArrayList(eVar.n0());
        int i4 = 0;
        while (i4 < eVar.n0()) {
            V0.J jM0 = eVar.m0(i4);
            int i5 = i4 + 1;
            if (i5 >= eVar.n0() || !eVar.m0(i5).r0()) {
                arrayList2.add(this.f1082a.r(jM0));
            } else {
                AbstractC0386b.d(eVar.m0(i4).s0(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                J.b bVarV0 = V0.J.v0(jM0);
                Iterator it = eVar.m0(i5).l0().b0().iterator();
                while (it.hasNext()) {
                    bVarV0.w((p.c) it.next());
                }
                arrayList2.add(this.f1082a.r((V0.J) bVarV0.n()));
                i4 = i5;
            }
            i4++;
        }
        return new E0.g(iK0, c1004rC, arrayList, arrayList2);
    }

    R1 h(H0.c cVar) {
        A0.n0 bVar;
        int iR0 = cVar.r0();
        D0.w wVarE = this.f1082a.E(cVar.q0());
        D0.w wVarE2 = this.f1082a.E(cVar.l0());
        AbstractC0791i abstractC0791iP0 = cVar.p0();
        long jM0 = cVar.m0();
        int i3 = a.f1084b[cVar.s0().ordinal()];
        if (i3 == 1) {
            bVar = new n0.b(this.f1082a.f(cVar.k0()));
        } else if (i3 == 2) {
            bVar = new n0.b(this.f1082a.y(cVar.o0()));
        } else {
            if (i3 != 3) {
                throw AbstractC0386b.a("Unknown targetType %d", cVar.s0());
            }
            bVar = new n0.a(this.f1082a.v(cVar.n0()));
        }
        return new R1(bVar, iR0, jM0, EnumC0271o0.LISTEN, wVarE, wVarE2, abstractC0791iP0, null);
    }

    public U0.a j(z0.i iVar) {
        F.e eVarY = this.f1082a.Y(iVar.b());
        a.b bVarG0 = U0.a.g0();
        bVarG0.w(iVar.a().equals(f0.a.LIMIT_TO_FIRST) ? a.c.FIRST : a.c.LAST);
        bVarG0.x(eVarY.d0());
        bVarG0.y(eVarY.e0());
        return (U0.a) bVarG0.n();
    }

    public T0.a l(List list) {
        a.b bVarF0 = T0.a.f0();
        bVarF0.x(a.d.COLLECTION_GROUP);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q.c cVar = (q.c) it.next();
            a.c.b bVarG0 = a.c.g0();
            bVarG0.x(cVar.g().n());
            if (cVar.h() == q.c.a.CONTAINS) {
                bVarG0.w(a.c.EnumC0057a.CONTAINS);
            } else {
                bVarG0.y(cVar.h() == q.c.a.ASCENDING ? a.c.EnumC0059c.ASCENDING : a.c.EnumC0059c.DESCENDING);
            }
            bVarF0.w(bVarG0);
        }
        return (T0.a) bVarF0.n();
    }

    H0.a m(D0.i iVar) {
        a.b bVarJ0 = H0.a.j0();
        if (iVar.j()) {
            bVarJ0.y(p(iVar));
        } else if (iVar.d()) {
            bVarJ0.w(k(iVar));
        } else {
            if (!iVar.k()) {
                throw AbstractC0386b.a("Cannot encode invalid document %s", iVar);
            }
            bVarJ0.z(r(iVar));
        }
        bVarJ0.x(iVar.f());
        return (H0.a) bVarJ0.n();
    }

    public V0.J n(E0.f fVar) {
        return this.f1082a.U(fVar);
    }

    H0.e o(E0.g gVar) {
        e.b bVarO0 = H0.e.o0();
        bVarO0.y(gVar.e());
        bVarO0.z(this.f1082a.c0(gVar.g()));
        Iterator it = gVar.d().iterator();
        while (it.hasNext()) {
            bVarO0.w(this.f1082a.U((E0.f) it.next()));
        }
        Iterator it2 = gVar.h().iterator();
        while (it2.hasNext()) {
            bVarO0.x(this.f1082a.U((E0.f) it2.next()));
        }
        return (H0.e) bVarO0.n();
    }

    H0.c q(R1 r12) {
        EnumC0271o0 enumC0271o0 = EnumC0271o0.LISTEN;
        AbstractC0386b.d(enumC0271o0.equals(r12.c()), "Only queries with purpose %s may be stored, got %s", enumC0271o0, r12.c());
        c.b bVarT0 = H0.c.t0();
        bVarT0.E(r12.h()).z(r12.e()).y(this.f1082a.f0(r12.b())).D(this.f1082a.f0(r12.f())).C(r12.d());
        A0.n0 n0VarG = r12.g();
        if (!n0VarG.d()) {
            bVarT0.A(F.d.e0().w(n0VarG.e().s()));
        } else if (n0VarG.f().s()) {
            bVarT0.x(this.f1082a.L(n0VarG.f()));
        } else {
            bVarT0.B(this.f1082a.Y(n0VarG.f()));
        }
        return (H0.c) bVarT0.n();
    }
}
