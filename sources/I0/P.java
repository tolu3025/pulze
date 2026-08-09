package I0;

import A0.AbstractC0219q;
import A0.C0203c0;
import A0.C0211i;
import A0.C0213k;
import A0.C0218p;
import A0.f0;
import A0.n0;
import C0.EnumC0271o0;
import C0.R1;
import E0.a;
import F0.AbstractC0315t;
import F0.C0309m;
import F0.C0310n;
import F0.C0314s;
import F0.E;
import I0.a0;
import J0.AbstractC0386b;
import V0.C;
import V0.C0423b;
import V0.C0426e;
import V0.C0431j;
import V0.C0432k;
import V0.C0433l;
import V0.C0434m;
import V0.E;
import V0.F;
import V0.G;
import V0.I;
import V0.J;
import V0.n;
import V0.p;
import V0.w;
import V0.y;
import V0.z;
import com.google.firebase.firestore.AbstractC0715a;
import com.google.firebase.firestore.J0;
import com.google.firebase.firestore.V0;
import com.google.protobuf.C0807z;
import com.google.protobuf.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.C1004r;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.f f2188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2189b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f2192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f2193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f2194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f2195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ int[] f2196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final /* synthetic */ int[] f2197h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final /* synthetic */ int[] f2198i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ int[] f2199j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final /* synthetic */ int[] f2200k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final /* synthetic */ int[] f2201l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final /* synthetic */ int[] f2202m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f2203n;

        static {
            int[] iArr = new int[w.c.values().length];
            f2203n = iArr;
            try {
                iArr[w.c.TARGET_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2203n[w.c.DOCUMENT_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2203n[w.c.DOCUMENT_DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2203n[w.c.DOCUMENT_REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2203n[w.c.FILTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2203n[w.c.RESPONSETYPE_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[G.c.values().length];
            f2202m = iArr2;
            try {
                iArr2[G.c.NO_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2202m[G.c.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2202m[G.c.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2202m[G.c.CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2202m[G.c.RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2202m[G.c.UNRECOGNIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[E.e.values().length];
            f2201l = iArr3;
            try {
                iArr3[E.e.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2201l[E.e.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[E.f.b.values().length];
            f2200k = iArr4;
            try {
                iArr4[E.f.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2200k[E.f.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2200k[E.f.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2200k[E.f.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f2200k[E.f.b.GREATER_THAN_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f2200k[E.f.b.GREATER_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f2200k[E.f.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f2200k[E.f.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f2200k[E.f.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f2200k[E.f.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[C0218p.b.values().length];
            f2199j = iArr5;
            try {
                iArr5[C0218p.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f2199j[C0218p.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f2199j[C0218p.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f2199j[C0218p.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f2199j[C0218p.b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f2199j[C0218p.b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f2199j[C0218p.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f2199j[C0218p.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f2199j[C0218p.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f2199j[C0218p.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr6 = new int[E.k.b.values().length];
            f2198i = iArr6;
            try {
                iArr6[E.k.b.IS_NAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f2198i[E.k.b.IS_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f2198i[E.k.b.IS_NOT_NAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f2198i[E.k.b.IS_NOT_NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr7 = new int[E.h.b.values().length];
            f2197h = iArr7;
            try {
                iArr7[E.h.b.COMPOSITE_FILTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f2197h[E.h.b.FIELD_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f2197h[E.h.b.UNARY_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] iArr8 = new int[E.d.b.values().length];
            f2196g = iArr8;
            try {
                iArr8[E.d.b.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f2196g[E.d.b.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr9 = new int[C0213k.a.values().length];
            f2195f = iArr9;
            try {
                iArr9[C0213k.a.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f2195f[C0213k.a.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr10 = new int[I.c.values().length];
            f2194e = iArr10;
            try {
                iArr10[I.c.FIELD_REFERENCE_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f2194e[I.c.FUNCTION_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            int[] iArr11 = new int[EnumC0271o0.values().length];
            f2193d = iArr11;
            try {
                iArr11[EnumC0271o0.LISTEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f2193d[EnumC0271o0.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f2193d[EnumC0271o0.EXISTENCE_FILTER_MISMATCH_BLOOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f2193d[EnumC0271o0.LIMBO_RESOLUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused51) {
            }
            int[] iArr12 = new int[p.c.EnumC0069c.values().length];
            f2192c = iArr12;
            try {
                iArr12[p.c.EnumC0069c.SET_TO_SERVER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f2192c[p.c.EnumC0069c.APPEND_MISSING_ELEMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f2192c[p.c.EnumC0069c.REMOVE_ALL_FROM_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f2192c[p.c.EnumC0069c.INCREMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused55) {
            }
            int[] iArr13 = new int[z.c.values().length];
            f2191b = iArr13;
            try {
                iArr13[z.c.UPDATE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f2191b[z.c.EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f2191b[z.c.CONDITIONTYPE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused58) {
            }
            int[] iArr14 = new int[J.c.values().length];
            f2190a = iArr14;
            try {
                iArr14[J.c.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f2190a[J.c.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f2190a[J.c.VERIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused61) {
            }
        }
    }

    public P(D0.f fVar) {
        this.f2188a = fVar;
        this.f2189b = g0(fVar).n();
    }

    private D0.u A(String str) {
        D0.u uVarB = D0.u.B(str);
        AbstractC0386b.d(k0(uVarB), "Tried to deserialize invalid key %s", uVarB);
        return uVarB;
    }

    private F0.O B(y.c cVar) {
        String strH0;
        List<V0.I> listF0;
        strH0 = cVar.h0();
        listF0 = cVar.f0();
        strH0.hashCode();
        switch (strH0) {
            case "collection":
                AbstractC0386b.d(listF0.size() >= 1 && ((V0.I) listF0.get(0)).B0() == I.c.REFERENCE_VALUE, "Invalid 'collection' stage: missing or invalid arguments", new Object[0]);
                return new C0310n(D0.u.B(((V0.I) listF0.get(0)).y0()), this, F0.B.f1420c);
            case "collection_group":
                AbstractC0386b.d(listF0.size() >= 1 && ((V0.I) listF0.get(0)).B0() == I.c.STRING_VALUE, "Invalid 'collection_group' stage: missing or invalid arguments", new Object[0]);
                return new C0309m(((V0.I) listF0.get(0)).z0(), F0.B.f1420c);
            case "sort":
                AbstractC0386b.d(listF0.size() > 0, "Invalid 'sort' stage: missing arguments", new Object[0]);
                ArrayList arrayList = new ArrayList();
                Iterator it = listF0.iterator();
                while (it.hasNext()) {
                    arrayList.add(u((V0.I) it.next()));
                }
                return new F0.N((F0.E[]) arrayList.toArray(new F0.E[0]), F0.B.f1420c);
            case "limit":
                AbstractC0386b.d(listF0.size() >= 1 && ((V0.I) listF0.get(0)).B0() == I.c.INTEGER_VALUE, "Invalid 'limit' stage: missing or invalid arguments", new Object[0]);
                return new F0.C((int) ((V0.I) listF0.get(0)).w0(), F0.B.f1420c);
            case "where":
                AbstractC0386b.d(listF0.size() >= 1, "Invalid 'where' stage: missing or invalid arguments", new Object[0]);
                return new F0.V(g((V0.I) listF0.get(0)), F0.B.f1420c);
            case "documents":
                ArrayList arrayList2 = new ArrayList();
                for (V0.I i3 : listF0) {
                    AbstractC0386b.d(i3.B0() == I.c.REFERENCE_VALUE, "Invalid argument type for 'documents' stage: expected reference_value", new Object[0]);
                    arrayList2.add(D0.u.B(i3.y0()));
                }
                return new C0314s((D0.u[]) arrayList2.toArray(new D0.u[0]), F0.B.f1420c);
            default:
                throw new IllegalArgumentException("Unsupported stage type: " + strH0);
        }
    }

    private AbstractC0219q D(E.k kVar) {
        C0218p.b bVar;
        V0.I i3;
        D0.r rVarB = D0.r.B(kVar.d0().c0());
        int i4 = a.f2198i[kVar.e0().ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                bVar = C0218p.b.EQUAL;
            } else if (i4 == 3) {
                bVar = C0218p.b.NOT_EQUAL;
            } else {
                if (i4 != 4) {
                    throw AbstractC0386b.a("Unrecognized UnaryFilter.operator %d", kVar.e0());
                }
                bVar = C0218p.b.NOT_EQUAL;
            }
            i3 = D0.z.f1310c;
            return C0218p.e(rVarB, bVar, i3);
        }
        bVar = C0218p.b.EQUAL;
        i3 = D0.z.f1309b;
        return C0218p.e(rVarB, bVar, i3);
    }

    private V0.n K(E0.d dVar) {
        n.b bVarG0 = V0.n.g0();
        Iterator it = dVar.c().iterator();
        while (it.hasNext()) {
            bVarG0.w(((D0.r) it.next()).n());
        }
        return (V0.n) bVarG0.n();
    }

    private E.f.b M(C0218p.b bVar) {
        switch (a.f2199j[bVar.ordinal()]) {
            case 1:
                return E.f.b.LESS_THAN;
            case 2:
                return E.f.b.LESS_THAN_OR_EQUAL;
            case 3:
                return E.f.b.EQUAL;
            case 4:
                return E.f.b.NOT_EQUAL;
            case 5:
                return E.f.b.GREATER_THAN;
            case 6:
                return E.f.b.GREATER_THAN_OR_EQUAL;
            case 7:
                return E.f.b.ARRAY_CONTAINS;
            case 8:
                return E.f.b.IN;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return E.f.b.ARRAY_CONTAINS_ANY;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return E.f.b.NOT_IN;
            default:
                throw AbstractC0386b.a("Unknown operator %d", bVar);
        }
    }

    private E.g N(D0.r rVar) {
        return (E.g) E.g.d0().w(rVar.n()).n();
    }

    private p.c O(E0.e eVar) {
        p.c.a aVarY;
        E0.p pVarB = eVar.b();
        if (pVarB instanceof E0.n) {
            aVarY = p.c.l0().x(eVar.a().n()).A(p.c.b.REQUEST_TIME);
        } else if (pVarB instanceof a.b) {
            aVarY = p.c.l0().x(eVar.a().n()).w(C0423b.j0().w(((a.b) pVarB).f()));
        } else if (pVarB instanceof a.C0010a) {
            aVarY = p.c.l0().x(eVar.a().n()).z(C0423b.j0().w(((a.C0010a) pVarB).f()));
        } else {
            if (!(pVarB instanceof E0.j)) {
                throw AbstractC0386b.a("Unknown transform: %s", pVarB);
            }
            aVarY = p.c.l0().x(eVar.a().n()).y(((E0.j) pVarB).d());
        }
        return (p.c) aVarY.n();
    }

    private E.h Q(List list) {
        return P(new C0213k(list, C0213k.a.AND));
    }

    private String S(EnumC0271o0 enumC0271o0) {
        int i3 = a.f2193d[enumC0271o0.ordinal()];
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return "existence-filter-mismatch";
        }
        if (i3 == 3) {
            return "existence-filter-mismatch-bloom";
        }
        if (i3 == 4) {
            return "limbo-document";
        }
        throw AbstractC0386b.a("Unrecognized query purpose: %s", enumC0271o0);
    }

    private E.i V(C0203c0 c0203c0) {
        E.i.a aVarE0 = E.i.e0();
        aVarE0.w(c0203c0.b().equals(C0203c0.a.ASCENDING) ? E.e.ASCENDING : E.e.DESCENDING);
        aVarE0.x(N(c0203c0.c()));
        return (E.i) aVarE0.n();
    }

    private V0.z W(E0.m mVar) {
        z.b bVarW;
        AbstractC0386b.d(!mVar.d(), "Can't serialize an empty precondition", new Object[0]);
        z.b bVarG0 = V0.z.g0();
        if (mVar.c() != null) {
            bVarW = bVarG0.x(f0(mVar.c()));
        } else {
            if (mVar.b() == null) {
                throw AbstractC0386b.a("Unknown Precondition", new Object[0]);
            }
            bVarW = bVarG0.w(mVar.b().booleanValue());
        }
        return (V0.z) bVarW.n();
    }

    private String X(D0.u uVar) {
        return Z(this.f2188a, uVar);
    }

    private String Z(D0.f fVar, D0.u uVar) {
        return ((D0.u) ((D0.u) g0(fVar).m("documents")).l(uVar)).n();
    }

    private E.h d0(E.g gVar, E.k.b bVar) {
        E.k.a aVarF0 = E.k.f0();
        aVarF0.w(gVar);
        aVarF0.x(bVar);
        return (E.h) E.h.i0().y(aVarF0).n();
    }

    private E0.d e(V0.n nVar) {
        int iF0 = nVar.f0();
        HashSet hashSet = new HashSet(iF0);
        for (int i3 = 0; i3 < iF0; i3++) {
            hashSet.add(D0.r.B(nVar.e0(i3)));
        }
        return E0.d.b(hashSet);
    }

    private AbstractC0315t g(V0.I i3) {
        int i4 = a.f2194e[i3.B0().ordinal()];
        return i4 != 1 ? i4 != 2 ? new AbstractC0315t.b(i3) : n(i3.u0()) : new F0.w(D0.r.B(i3.t0()));
    }

    private static D0.u g0(D0.f fVar) {
        return D0.u.A(Arrays.asList("projects", fVar.i(), "databases", fVar.h()));
    }

    private static D0.u h0(D0.u uVar) {
        AbstractC0386b.d(uVar.w() > 4 && uVar.t(4).equals("documents"), "Tried to deserialize invalid key %s", uVar);
        return (D0.u) uVar.x(5);
    }

    private C0218p.b i(E.f.b bVar) {
        switch (a.f2200k[bVar.ordinal()]) {
            case 1:
                return C0218p.b.LESS_THAN;
            case 2:
                return C0218p.b.LESS_THAN_OR_EQUAL;
            case 3:
                return C0218p.b.EQUAL;
            case 4:
                return C0218p.b.NOT_EQUAL;
            case 5:
                return C0218p.b.GREATER_THAN_OR_EQUAL;
            case 6:
                return C0218p.b.GREATER_THAN;
            case 7:
                return C0218p.b.ARRAY_CONTAINS;
            case 8:
                return C0218p.b.IN;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return C0218p.b.ARRAY_CONTAINS_ANY;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return C0218p.b.NOT_IN;
            default:
                throw AbstractC0386b.a("Unhandled FieldFilter.operator %d", bVar);
        }
    }

    private l0 i0(Z0.a aVar) {
        return l0.h(aVar.a0()).q(aVar.c0());
    }

    private E0.e j(p.c cVar) {
        int i3 = a.f2192c[cVar.k0().ordinal()];
        if (i3 == 1) {
            AbstractC0386b.d(cVar.j0() == p.c.b.REQUEST_TIME, "Unknown transform setToServerValue: %s", cVar.j0());
            return new E0.e(D0.r.B(cVar.g0()), E0.n.d());
        }
        if (i3 == 2) {
            return new E0.e(D0.r.B(cVar.g0()), new a.b(cVar.f0().g()));
        }
        if (i3 == 3) {
            return new E0.e(D0.r.B(cVar.g0()), new a.C0010a(cVar.i0().g()));
        }
        if (i3 == 4) {
            return new E0.e(D0.r.B(cVar.g0()), new E0.j(cVar.h0()));
        }
        throw AbstractC0386b.a("Unknown FieldTransform proto: %s", cVar);
    }

    private static boolean k0(D0.u uVar) {
        return uVar.w() >= 4 && uVar.t(0).equals("projects") && uVar.t(2).equals("databases");
    }

    private List l(E.h hVar) {
        AbstractC0219q abstractC0219qK = k(hVar);
        if (abstractC0219qK instanceof C0213k) {
            C0213k c0213k = (C0213k) abstractC0219qK;
            if (c0213k.i()) {
                return c0213k.b();
            }
        }
        return Collections.singletonList(abstractC0219qK);
    }

    private D0.s m(C0426e c0426e) {
        AbstractC0386b.d(c0426e.e0().equals(C0426e.c.FOUND), "Tried to deserialize a found document from a missing document.", new Object[0]);
        D0.l lVarO = o(c0426e.b0().h0());
        D0.t tVarH = D0.t.h(c0426e.b0().f0());
        D0.w wVarE = E(c0426e.b0().i0());
        AbstractC0386b.d(!wVarE.equals(D0.w.f1302b), "Got a document response with no snapshot version", new Object[0]);
        return D0.s.q(lVarO, wVarE, tVarH);
    }

    private F0.z n(V0.u uVar) {
        String strI0 = uVar.i0();
        ArrayList arrayList = new ArrayList();
        Iterator it = uVar.f0().iterator();
        while (it.hasNext()) {
            arrayList.add(g((V0.I) it.next()));
        }
        return new F0.z(strI0, arrayList, F0.B.f1420c);
    }

    private D0.s q(C0426e c0426e) {
        AbstractC0386b.d(c0426e.e0().equals(C0426e.c.MISSING), "Tried to deserialize a missing document from a found document.", new Object[0]);
        D0.l lVarO = o(c0426e.c0());
        D0.w wVarE = E(c0426e.d0());
        AbstractC0386b.d(!wVarE.equals(D0.w.f1302b), "Got a no document response with no snapshot version", new Object[0]);
        return D0.s.s(lVarO, wVarE);
    }

    private C0203c0 t(E.i iVar) {
        C0203c0.a aVar;
        D0.r rVarB = D0.r.B(iVar.d0().c0());
        int i3 = a.f2201l[iVar.c0().ordinal()];
        if (i3 == 1) {
            aVar = C0203c0.a.ASCENDING;
        } else {
            if (i3 != 2) {
                throw AbstractC0386b.a("Unrecognized direction %d", iVar.c0());
            }
            aVar = C0203c0.a.DESCENDING;
        }
        return C0203c0.d(aVar, rVarB);
    }

    private F0.E u(V0.I i3) {
        AbstractC0386b.d(i3.B0() == I.c.MAP_VALUE, "Invalid proto_value type for Ordering, expected map_value.", new Object[0]);
        AbstractC0315t abstractC0315tG = null;
        E.b bVar = null;
        for (Map.Entry entry : i3.x0().d0().entrySet()) {
            String str = (String) entry.getKey();
            V0.I i4 = (V0.I) entry.getValue();
            if (str.equals("expression")) {
                AbstractC0386b.d(abstractC0315tG == null, "Duplicate 'expression' field in Ordering proto.", new Object[0]);
                abstractC0315tG = g(i4);
            } else if (str.equals("direction")) {
                AbstractC0386b.d(bVar == null, "Duplicate 'direction' field in Ordering proto.", new Object[0]);
                AbstractC0386b.d(i4.B0() == I.c.STRING_VALUE, "Invalid type for 'direction' field in Ordering proto, expected string_value.", new Object[0]);
                String strZ0 = i4.z0();
                if (strZ0.equals("ascending")) {
                    bVar = E.b.f1427b;
                } else {
                    if (!strZ0.equals("descending")) {
                        throw new IllegalArgumentException("Invalid string value '" + strZ0 + "' for 'direction' field in Ordering proto.");
                    }
                    bVar = E.b.f1428c;
                }
            } else {
                continue;
            }
        }
        AbstractC0386b.d(abstractC0315tG != null, "Missing 'expression' field in Ordering proto.", new Object[0]);
        AbstractC0386b.d(bVar != null, "Missing 'direction' field in Ordering proto.", new Object[0]);
        return new F0.E(abstractC0315tG, bVar);
    }

    private E0.m w(V0.z zVar) {
        int i3 = a.f2191b[zVar.c0().ordinal()];
        if (i3 == 1) {
            return E0.m.f(E(zVar.f0()));
        }
        if (i3 == 2) {
            return E0.m.a(zVar.e0());
        }
        if (i3 == 3) {
            return E0.m.f1404c;
        }
        throw AbstractC0386b.a("Unknown precondition", new Object[0]);
    }

    private D0.u x(String str) {
        D0.u uVarA = A(str);
        return uVarA.w() == 4 ? D0.u.f1301b : h0(uVarA);
    }

    public C1004r C(t0 t0Var) {
        return new C1004r(t0Var.e0(), t0Var.d0());
    }

    public D0.w E(t0 t0Var) {
        return (t0Var.e0() == 0 && t0Var.d0() == 0) ? D0.w.f1302b : new D0.w(C(t0Var));
    }

    public D0.w F(V0.w wVar) {
        return wVar.f0() != w.c.TARGET_CHANGE ? D0.w.f1302b : wVar.g0().f0() != 0 ? D0.w.f1302b : E(wVar.g0().c0());
    }

    public a0 G(V0.w wVar) {
        a0.e eVar;
        a0 dVar;
        int i3 = a.f2203n[wVar.f0().ordinal()];
        l0 l0VarI0 = null;
        if (i3 == 1) {
            V0.G gG0 = wVar.g0();
            int i4 = a.f2202m[gG0.e0().ordinal()];
            if (i4 == 1) {
                eVar = a0.e.NoChange;
            } else if (i4 == 2) {
                eVar = a0.e.Added;
            } else if (i4 == 3) {
                eVar = a0.e.Removed;
                l0VarI0 = i0(gG0.a0());
            } else if (i4 == 4) {
                eVar = a0.e.Current;
            } else {
                if (i4 != 5) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                eVar = a0.e.Reset;
            }
            dVar = new a0.d(eVar, gG0.g0(), gG0.d0(), l0VarI0);
        } else if (i3 == 2) {
            C0433l c0433lB0 = wVar.b0();
            List listD0 = c0433lB0.d0();
            List listC0 = c0433lB0.c0();
            D0.l lVarO = o(c0433lB0.b0().h0());
            D0.w wVarE = E(c0433lB0.b0().i0());
            AbstractC0386b.d(!wVarE.equals(D0.w.f1302b), "Got a document change without an update time", new Object[0]);
            D0.s sVarQ = D0.s.q(lVarO, wVarE, D0.t.h(c0433lB0.b0().f0()));
            dVar = new a0.b(listD0, listC0, sVarQ.getKey(), sVarQ);
        } else {
            if (i3 == 3) {
                C0434m c0434mC0 = wVar.c0();
                List listD02 = c0434mC0.d0();
                D0.s sVarS = D0.s.s(o(c0434mC0.b0()), E(c0434mC0.c0()));
                return new a0.b(Collections.emptyList(), listD02, sVarS.getKey(), sVarS);
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IllegalArgumentException("Unknown change type set");
                }
                V0.s sVarE0 = wVar.e0();
                return new a0.c(sVarE0.c0(), new C0377s(sVarE0.a0(), sVarE0.d0()));
            }
            V0.o oVarD0 = wVar.d0();
            dVar = new a0.b(Collections.emptyList(), oVarD0.c0(), o(oVarD0.b0()), null);
        }
        return dVar;
    }

    E.h H(C0213k c0213k) {
        Object objN;
        ArrayList arrayList = new ArrayList(c0213k.b().size());
        Iterator it = c0213k.b().iterator();
        while (it.hasNext()) {
            arrayList.add(P((AbstractC0219q) it.next()));
        }
        if (arrayList.size() == 1) {
            objN = arrayList.get(0);
        } else {
            E.d.a aVarH0 = E.d.h0();
            aVarH0.x(I(c0213k.e()));
            aVarH0.w(arrayList);
            objN = E.h.i0().w(aVarH0).n();
        }
        return (E.h) objN;
    }

    E.d.b I(C0213k.a aVar) {
        int i3 = a.f2195f[aVar.ordinal()];
        if (i3 == 1) {
            return E.d.b.AND;
        }
        if (i3 == 2) {
            return E.d.b.OR;
        }
        throw AbstractC0386b.a("Unrecognized composite filter type.", new Object[0]);
    }

    public C0432k J(D0.l lVar, D0.t tVar) {
        C0432k.b bVarN0 = C0432k.n0();
        bVarN0.x(R(lVar));
        bVarN0.w(tVar.k());
        return (C0432k) bVarN0.n();
    }

    public F.c L(A0.l0 l0Var) {
        F.c.a aVarG0 = F.c.g0();
        aVarG0.w(X(l0Var.n()));
        return (F.c) aVarG0.n();
    }

    E.h P(AbstractC0219q abstractC0219q) {
        if (abstractC0219q instanceof C0218p) {
            return e0((C0218p) abstractC0219q);
        }
        if (abstractC0219q instanceof C0213k) {
            return H((C0213k) abstractC0219q);
        }
        throw AbstractC0386b.a("Unrecognized filter type %s", abstractC0219q.toString());
    }

    public String R(D0.l lVar) {
        return Z(this.f2188a, lVar.p());
    }

    public Map T(R1 r12) {
        String strS = S(r12.c());
        if (strS == null) {
            return null;
        }
        HashMap map = new HashMap(1);
        map.put("goog-listen-tags", strS);
        return map;
    }

    public V0.J U(E0.f fVar) {
        J.b bVarU0 = V0.J.u0();
        if (fVar instanceof E0.o) {
            bVarU0.z(J(fVar.g(), ((E0.o) fVar).o()));
        } else if (fVar instanceof E0.l) {
            bVarU0.z(J(fVar.g(), ((E0.l) fVar).q()));
            bVarU0.A(K(fVar.e()));
        } else if (fVar instanceof E0.c) {
            bVarU0.y(R(fVar.g()));
        } else {
            if (!(fVar instanceof E0.q)) {
                throw AbstractC0386b.a("unknown mutation type %s", fVar.getClass());
            }
            bVarU0.B(R(fVar.g()));
        }
        Iterator it = fVar.f().iterator();
        while (it.hasNext()) {
            bVarU0.w(O((E0.e) it.next()));
        }
        if (!fVar.h().d()) {
            bVarU0.x(W(fVar.h()));
        }
        return (V0.J) bVarU0.n();
    }

    public F.e Y(A0.l0 l0Var) {
        F.e.a aVarF0 = F.e.f0();
        E.b bVarX0 = V0.E.x0();
        D0.u uVarN = l0Var.n();
        if (l0Var.d() != null) {
            AbstractC0386b.d(uVarN.w() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            aVarF0.w(X(uVarN));
            E.c.a aVarE0 = E.c.e0();
            aVarE0.x(l0Var.d());
            aVarE0.w(true);
            bVarX0.w(aVarE0);
        } else {
            AbstractC0386b.d(uVarN.w() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            aVarF0.w(X((D0.u) uVarN.y()));
            E.c.a aVarE02 = E.c.e0();
            aVarE02.x(uVarN.s());
            bVarX0.w(aVarE02);
        }
        if (l0Var.h().size() > 0) {
            bVarX0.B(Q(l0Var.h()));
        }
        Iterator it = l0Var.m().iterator();
        while (it.hasNext()) {
            bVarX0.x(V((C0203c0) it.next()));
        }
        if (l0Var.r()) {
            bVarX0.z(C0807z.d0().w((int) l0Var.j()));
        }
        if (l0Var.p() != null) {
            C0431j.b bVarG0 = C0431j.g0();
            bVarG0.w(l0Var.p().b());
            bVarG0.x(l0Var.p().c());
            bVarX0.A(bVarG0);
        }
        if (l0Var.f() != null) {
            C0431j.b bVarG02 = C0431j.g0();
            bVarG02.w(l0Var.f().b());
            bVarG02.x(!l0Var.f().c());
            bVarX0.y(bVarG02);
        }
        aVarF0.x(bVarX0);
        return (F.e) aVarF0.n();
    }

    public D0.f a() {
        return this.f2188a;
    }

    V0.C a0(F.e eVar, List list, HashMap map) {
        C.c cVarE0 = V0.C.e0();
        cVarE0.x(eVar.e0());
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            AbstractC0715a abstractC0715a = (AbstractC0715a) it.next();
            if (!hashSet.contains(abstractC0715a.c())) {
                hashSet.add(abstractC0715a.c());
                StringBuilder sb = new StringBuilder();
                sb.append("aggregate_");
                int i4 = i3 + 1;
                sb.append(i3);
                String string = sb.toString();
                map.put(string, abstractC0715a.c());
                C.b.C0066b c0066bE0 = C.b.e0();
                E.g gVar = (E.g) E.g.d0().w(abstractC0715a.d()).n();
                if (abstractC0715a instanceof AbstractC0715a.c) {
                    c0066bE0.y(C.b.c.a0());
                } else if (abstractC0715a instanceof AbstractC0715a.d) {
                    c0066bE0.z((C.b.d) C.b.d.b0().w(gVar).n());
                } else {
                    if (!(abstractC0715a instanceof AbstractC0715a.b)) {
                        throw new RuntimeException("Unsupported aggregation");
                    }
                    c0066bE0.x((C.b.a) C.b.a.b0().w(gVar).n());
                }
                c0066bE0.w(string);
                arrayList.add((C.b) c0066bE0.n());
                i3 = i4;
            }
        }
        cVarE0.w(arrayList);
        return (V0.C) cVarE0.n();
    }

    public String b() {
        return this.f2189b;
    }

    public V0.F b0(R1 r12) {
        F.b bVarH0 = V0.F.h0();
        n0 n0VarG = r12.g();
        if (n0VarG.c()) {
            bVarH0.y(F.d.e0().w(n0VarG.e().s()));
        } else {
            boolean zS = n0VarG.f().s();
            A0.l0 l0VarF = n0VarG.f();
            if (zS) {
                bVarH0.w(L(l0VarF));
            } else {
                bVarH0.z(Y(l0VarF));
            }
        }
        bVarH0.C(r12.h());
        if (!r12.d().isEmpty() || r12.f().compareTo(D0.w.f1302b) <= 0) {
            bVarH0.B(r12.d());
        } else {
            bVarH0.A(c0(r12.f().e()));
        }
        if (r12.a() != null && (!r12.d().isEmpty() || r12.f().compareTo(D0.w.f1302b) > 0)) {
            bVarH0.x(C0807z.d0().w(r12.a().intValue()));
        }
        return (V0.F) bVarH0.n();
    }

    C0213k c(E.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = dVar.f0().iterator();
        while (it.hasNext()) {
            arrayList.add(k((E.h) it.next()));
        }
        return new C0213k(arrayList, d(dVar.g0()));
    }

    public t0 c0(C1004r c1004r) {
        t0.b bVarF0 = t0.f0();
        bVarF0.x(c1004r.l());
        bVarF0.w(c1004r.i());
        return (t0) bVarF0.n();
    }

    C0213k.a d(E.d.b bVar) {
        int i3 = a.f2196g[bVar.ordinal()];
        if (i3 == 1) {
            return C0213k.a.AND;
        }
        if (i3 == 2) {
            return C0213k.a.OR;
        }
        throw AbstractC0386b.a("Only AND and OR composite filter types are supported.", new Object[0]);
    }

    E.h e0(C0218p c0218p) {
        C0218p.b bVarG = c0218p.g();
        V0.I iH = c0218p.h();
        E.g gVarN = N(c0218p.f());
        if (bVarG == C0218p.b.EQUAL) {
            if (D0.z.V(iH)) {
                return d0(gVarN, E.k.b.IS_NAN);
            }
            if (D0.z.W(iH)) {
                return d0(gVarN, E.k.b.IS_NULL);
            }
        } else if (bVarG == C0218p.b.NOT_EQUAL) {
            if (D0.z.V(iH)) {
                return d0(gVarN, E.k.b.IS_NOT_NAN);
            }
            if (D0.z.W(iH)) {
                return d0(gVarN, E.k.b.IS_NOT_NULL);
            }
        }
        E.f.a aVarH0 = E.f.h0();
        aVarH0.w(gVarN);
        aVarH0.x(M(bVarG));
        aVarH0.y(iH);
        return (E.h) E.h.i0().x(aVarH0).n();
    }

    public A0.l0 f(F.c cVar) {
        int iF0 = cVar.f0();
        AbstractC0386b.d(iF0 == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(iF0));
        return f0.b(x(cVar.e0(0))).D();
    }

    public t0 f0(D0.w wVar) {
        return c0(wVar.e());
    }

    C0218p h(E.f fVar) {
        return C0218p.e(D0.r.B(fVar.e0().c0()), i(fVar.f0()), fVar.g0());
    }

    public boolean j0(D0.u uVar) {
        return k0(uVar) && uVar.t(1).equals(this.f2188a.i()) && uVar.t(3).equals(this.f2188a.h());
    }

    AbstractC0219q k(E.h hVar) {
        int i3 = a.f2197h[hVar.g0().ordinal()];
        if (i3 == 1) {
            return c(hVar.d0());
        }
        if (i3 == 2) {
            return h(hVar.f0());
        }
        if (i3 == 3) {
            return D(hVar.h0());
        }
        throw AbstractC0386b.a("Unrecognized Filter.filterType %d", hVar.g0());
    }

    public D0.l o(String str) {
        D0.u uVarA = A(str);
        AbstractC0386b.d(uVarA.t(1).equals(this.f2188a.i()), "Tried to deserialize key from different project.", new Object[0]);
        AbstractC0386b.d(uVarA.t(3).equals(this.f2188a.h()), "Tried to deserialize key from different database.", new Object[0]);
        return D0.l.j(h0(uVarA));
    }

    public D0.s p(C0426e c0426e) {
        if (c0426e.e0().equals(C0426e.c.FOUND)) {
            return m(c0426e);
        }
        if (c0426e.e0().equals(C0426e.c.MISSING)) {
            return q(c0426e);
        }
        throw new IllegalArgumentException("Unknown result case: " + c0426e.e0());
    }

    public E0.f r(V0.J j3) {
        E0.m mVarW = j3.q0() ? w(j3.i0()) : E0.m.f1404c;
        ArrayList arrayList = new ArrayList();
        Iterator it = j3.o0().iterator();
        while (it.hasNext()) {
            arrayList.add(j((p.c) it.next()));
        }
        int i3 = a.f2190a[j3.k0().ordinal()];
        if (i3 == 1) {
            return j3.t0() ? new E0.l(o(j3.m0().h0()), D0.t.h(j3.m0().f0()), e(j3.n0()), mVarW, arrayList) : new E0.o(o(j3.m0().h0()), D0.t.h(j3.m0().f0()), mVarW, arrayList);
        }
        if (i3 == 2) {
            return new E0.c(o(j3.j0()), mVarW);
        }
        if (i3 == 3) {
            return new E0.q(o(j3.p0()), mVarW);
        }
        throw AbstractC0386b.a("Unknown mutation operation: %d", j3.k0());
    }

    public E0.i s(V0.M m3, D0.w wVar) {
        D0.w wVarE = E(m3.c0());
        if (!D0.w.f1302b.equals(wVarE)) {
            wVar = wVarE;
        }
        int iB0 = m3.b0();
        ArrayList arrayList = new ArrayList(iB0);
        for (int i3 = 0; i3 < iB0; i3++) {
            arrayList.add(m3.a0(i3));
        }
        return new E0.i(wVar, arrayList);
    }

    public J0 v(F.d dVar) {
        AbstractC0386b.d(dVar.c0() == F.d.b.STRUCTURED_PIPELINE, "Unknown pipeline_type in PipelineQueryTarget: " + dVar.c0(), new Object[0]);
        V0.y yVarE0 = dVar.d0().e0();
        ArrayList arrayList = new ArrayList();
        Iterator it = yVarE0.e0().iterator();
        while (it.hasNext()) {
            arrayList.add(B((y.c) it.next()));
        }
        return new J0(null, this, new V0(a()), arrayList, null);
    }

    public A0.l0 y(F.e eVar) {
        return z(eVar.d0(), eVar.e0());
    }

    public A0.l0 z(String str, V0.E e3) {
        D0.u uVar;
        String str2;
        List listEmptyList;
        D0.u uVarX = x(str);
        int iN0 = e3.n0();
        if (iN0 <= 0) {
            uVar = uVarX;
            str2 = null;
        } else {
            AbstractC0386b.d(iN0 == 1, "StructuredQuery.from with more than one collection is not supported.", new Object[0]);
            E.c cVarM0 = e3.m0(0);
            boolean zC0 = cVarM0.c0();
            String strD0 = cVarM0.d0();
            if (zC0) {
                uVar = uVarX;
                str2 = strD0;
            } else {
                uVarX = (D0.u) uVarX.m(strD0);
                uVar = uVarX;
                str2 = null;
            }
        }
        List listL = e3.w0() ? l(e3.s0()) : Collections.emptyList();
        int iQ0 = e3.q0();
        if (iQ0 > 0) {
            ArrayList arrayList = new ArrayList(iQ0);
            for (int i3 = 0; i3 < iQ0; i3++) {
                arrayList.add(t(e3.p0(i3)));
            }
            listEmptyList = arrayList;
        } else {
            listEmptyList = Collections.emptyList();
        }
        return new A0.l0(uVar, str2, listL, listEmptyList, e3.u0() ? e3.o0().c0() : -1L, e3.v0() ? new C0211i(e3.r0().g(), e3.r0().e0()) : null, e3.t0() ? new C0211i(e3.l0().g(), !e3.l0().e0()) : null);
    }
}
