package G0;

import D0.z;
import G0.F0;
import G0.M;
import J0.AbstractC0386b;
import V0.C0423b;
import V0.I;
import com.google.protobuf.AbstractC0791i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U1.l f1607a = new i(M.f1683a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U1.l f1608b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U1.l f1609c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final U1.l f1610d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final U1.l f1611e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final U1.l f1612f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final U1.l f1613g = new g();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final U1.l f1614h = new h();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final U1.l f1615i = new U1.l() { // from class: G0.b
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.K((List) obj);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final U1.l f1616j = new U1.l() { // from class: G0.z
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.U((List) obj);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final U1.l f1617k = new U1.l() { // from class: G0.A
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.M((List) obj);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final U1.l f1618l = new U1.l() { // from class: G0.B
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.W((List) obj);
        }
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final U1.l f1619m = new U1.l() { // from class: G0.C
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.e0((List) obj);
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final U1.l f1620n = new U1.l() { // from class: G0.D
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.Y((List) obj);
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final U1.l f1621o = new U1.l() { // from class: G0.E
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.g0((List) obj);
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final U1.l f1622p = new U1.l() { // from class: G0.c
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.a0((List) obj);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final U1.l f1623q = new U1.l() { // from class: G0.d
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.k0((List) obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final U1.l f1624r = new U1.l() { // from class: G0.e
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.O((List) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final U1.l f1625s = new U1.l() { // from class: G0.m
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.I((List) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final U1.l f1626t = new U1.l() { // from class: G0.x
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.Q((List) obj);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final U1.l f1627u = new U1.l() { // from class: G0.y
        @Override // U1.l
        public final Object invoke(Object obj) {
            return F.S((List) obj);
        }
    };

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1629b;

        static {
            int[] iArr = new int[z.a.EnumC0007a.values().length];
            try {
                iArr[z.a.EnumC0007a.f1329a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.a.EnumC0007a.f1331c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1628a = iArr;
            int[] iArr2 = new int[I.c.values().length];
            try {
                iArr2[I.c.STRING_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[I.c.BYTES_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[I.c.NULL_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f1629b = iArr2;
        }
    }

    public static final class b implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1630a;

            public a(List list) {
                this.f1630a = list;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                List<V0.I> listG;
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) ((U1.l) this.f1630a.get(0)).invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                V0.I iF = m3.f();
                M m4 = (M) ((U1.l) this.f1630a.get(1)).invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                V0.I iF2 = m4.f();
                List listG2 = null;
                I.c cVarB0 = iF != null ? iF.B0() : null;
                int i3 = cVarB0 == null ? -1 : G0.f1669a[cVarB0.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    listG = null;
                } else {
                    if (i3 != 2) {
                        return N.f1689g;
                    }
                    listG = iF.o0().g();
                }
                I.c cVarB02 = iF2 != null ? iF2.B0() : null;
                int i4 = cVarB02 == null ? -1 : G0.f1669a[cVarB02.ordinal()];
                if (i4 != -1 && i4 != 1) {
                    if (i4 != 2) {
                        return N.f1689g;
                    }
                    listG2 = iF2.o0().g();
                }
                if (listG == null || listG2 == null) {
                    return M.f1683a.g();
                }
                for (V0.I i5 : listG) {
                    Iterator it = listG2.iterator();
                    while (it.hasNext()) {
                        boolean zA = z.a.f1327a.a(i5, (V0.I) it.next());
                        if (zA) {
                            return M.f1683a.h();
                        }
                        if (zA) {
                            throw new I1.k();
                        }
                    }
                }
                return M.f1683a.e();
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a(params);
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class c implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1631a;

            public a(List list) {
                this.f1631a = list;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                List listG;
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) ((U1.l) this.f1631a.get(0)).invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                V0.I iF = m3.f();
                M m4 = (M) ((U1.l) this.f1631a.get(1)).invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                V0.I iF2 = m4.f();
                List<V0.I> listG2 = null;
                I.c cVarB0 = iF != null ? iF.B0() : null;
                int i3 = cVarB0 == null ? -1 : G0.f1669a[cVarB0.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    listG = null;
                } else {
                    if (i3 != 2) {
                        return N.f1689g;
                    }
                    listG = iF.o0().g();
                }
                I.c cVarB02 = iF2 != null ? iF2.B0() : null;
                int i4 = cVarB02 == null ? -1 : G0.f1669a[cVarB02.ordinal()];
                if (i4 != -1 && i4 != 1) {
                    if (i4 != 2) {
                        return N.f1689g;
                    }
                    listG2 = iF2.o0().g();
                }
                if (listG == null || listG2 == null) {
                    return M.f1683a.g();
                }
                for (V0.I i5 : listG2) {
                    Iterator it = listG.iterator();
                    while (it.hasNext()) {
                        boolean zA = z.a.f1327a.a((V0.I) it.next(), i5);
                        if (zA) {
                            break;
                        }
                        if (zA) {
                            throw new I1.k();
                        }
                    }
                    return M.f1683a.e();
                }
                return M.f1683a.h();
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a(params);
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class d implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1632a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1633b;

            public a(U1.l lVar, U1.l lVar2) {
                this.f1632a = lVar;
                this.f1633b = lVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1632a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1633b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                try {
                    V0.I iF = m3.f();
                    V0.I iF2 = m4.f();
                    I.c cVarB0 = iF != null ? iF.B0() : null;
                    int i3 = cVarB0 == null ? -1 : F0.a.f1644a[cVarB0.ordinal()];
                    if (i3 == -1 || i3 == 1) {
                        return M.f1683a.g();
                    }
                    if (i3 != 2) {
                        return N.f1689g;
                    }
                    List listG = iF.o0().g();
                    kotlin.jvm.internal.m.d(listG, "getValuesList(...)");
                    return iF2 == null ? M.f1683a.e() : F.H(iF2, listG);
                } catch (Exception unused) {
                    return N.f1689g;
                }
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a((U1.l) params.get(0), (U1.l) params.get(1));
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class e implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1634a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1635b;

            public a(U1.l lVar, U1.l lVar2) {
                this.f1634a = lVar;
                this.f1635b = lVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1634a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1635b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                try {
                    V0.I iF = m3.f();
                    V0.I iF2 = m4.f();
                    I.c cVarB0 = iF2 != null ? iF2.B0() : null;
                    int i3 = cVarB0 == null ? -1 : F0.a.f1644a[cVarB0.ordinal()];
                    if (i3 == -1 || i3 == 1) {
                        return M.f1683a.g();
                    }
                    if (i3 != 2) {
                        return N.f1689g;
                    }
                    List listG = iF2.o0().g();
                    kotlin.jvm.internal.m.d(listG, "getValuesList(...)");
                    return iF == null ? M.f1683a.e() : F.H(iF, listG);
                } catch (Exception unused) {
                    return N.f1689g;
                }
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a((U1.l) params.get(0), (U1.l) params.get(1));
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class f implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1636a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1637b;

            public a(U1.l lVar, U1.l lVar2) {
                this.f1636a = lVar;
                this.f1637b = lVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1636a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1637b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                try {
                    V0.I iF = m3.f();
                    V0.I iF2 = m4.f();
                    I.c cVarB0 = iF2 != null ? iF2.B0() : null;
                    int i3 = cVarB0 == null ? -1 : F0.a.f1644a[cVarB0.ordinal()];
                    if (i3 == -1 || i3 == 1) {
                        return M.f1683a.g();
                    }
                    if (i3 != 2) {
                        return N.f1689g;
                    }
                    List listG = iF2.o0().g();
                    kotlin.jvm.internal.m.d(listG, "getValuesList(...)");
                    return iF == null ? M.f1683a.e() : F.J0(iF, listG);
                } catch (Exception unused) {
                    return N.f1689g;
                }
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a((U1.l) params.get(0), (U1.l) params.get(1));
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class g implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1638a;

            public a(U1.l lVar) {
                this.f1638a = lVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    V0.I iF = ((M) this.f1638a.invoke(input)).f();
                    if (iF != null) {
                        I.c cVarB0 = iF.B0();
                        int i3 = cVarB0 == null ? -1 : F0.a.f1644a[cVarB0.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                return N.f1689g;
                            }
                            List listG = iF.o0().g();
                            kotlin.jvm.internal.m.d(listG, "getValuesList(...)");
                            return M.f1683a.j(listG.size());
                        }
                    }
                    return M.f1683a.g();
                } catch (Exception unused) {
                    return N.f1689g;
                }
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 1) {
                return new a((U1.l) params.get(0));
            }
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class h implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1639a;

            public a(U1.l lVar) {
                this.f1639a = lVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    V0.I iF = ((M) this.f1639a.invoke(input)).f();
                    if (iF != null) {
                        I.c cVarB0 = iF.B0();
                        int i3 = cVarB0 == null ? -1 : F0.a.f1644a[cVarB0.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                return N.f1689g;
                            }
                            List listG = iF.o0().g();
                            kotlin.jvm.internal.m.d(listG, "getValuesList(...)");
                            return M.f1683a.o(D0.z.E(J1.x.L(listG)));
                        }
                    }
                    return M.f1683a.g();
                } catch (Exception unused) {
                    return N.f1689g;
                }
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 1) {
                return new a((U1.l) params.get(0));
            }
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class i implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ M.a f1640a;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1641a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ M.a f1642b;

            public a(List list, M.a aVar) {
                this.f1641a = list;
                this.f1642b = aVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                List list = this.f1641a;
                ArrayList arrayList = new ArrayList(J1.q.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((M) ((U1.l) it.next()).invoke(input));
                }
                try {
                    ArrayList arrayList2 = new ArrayList(J1.q.n(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        V0.I iF = ((M) it2.next()).f();
                        if (iF == null) {
                            return N.f1689g;
                        }
                        arrayList2.add(iF);
                    }
                    return this.f1642b.i(arrayList2);
                } catch (Exception unused) {
                    return N.f1689g;
                }
            }
        }

        public i(M.a aVar) {
            this.f1640a = aVar;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            return new a(params, this.f1640a);
        }
    }

    public static final U1.l A0() {
        return f1622p;
    }

    public static final U1.l B0() {
        return f1619m;
    }

    public static final U1.l C0() {
        return f1621o;
    }

    public static final U1.l D0() {
        return f1614h;
    }

    public static final U1.l E0() {
        return f1608b;
    }

    public static final U1.l F0() {
        return f1623q;
    }

    public static final P G(List arrays) {
        kotlin.jvm.internal.m.e(arrays, "arrays");
        return M.f1683a.o(D0.z.E(J1.q.o(arrays)));
    }

    public static final U1.l G0() {
        return f1609c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M H(V0.I i3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean zA = z.a.f1327a.a(i3, (V0.I) it.next());
            if (zA) {
                return M.f1683a.h();
            }
            if (zA) {
                throw new I1.k();
            }
        }
        return M.f1683a.e();
    }

    private static final M H0(List list, AbstractC0791i abstractC0791i) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean z2 = true;
        for (int i3 = 0; i3 < size; i3++) {
            I.c cVarB0 = ((V0.I) list.get(i3)).B0();
            int i4 = cVarB0 == null ? -1 : a.f1629b[cVarB0.ordinal()];
            if (i4 == 2) {
                if (!z2) {
                    Iterator it = abstractC0791i.iterator();
                    while (it.hasNext()) {
                        Byte b3 = (Byte) it.next();
                        kotlin.jvm.internal.m.b(b3);
                        arrayList.add(b3);
                    }
                }
                AbstractC0791i<Byte> abstractC0791iQ0 = ((V0.I) list.get(i3)).q0();
                kotlin.jvm.internal.m.d(abstractC0791iQ0, "getBytesValue(...)");
                for (Byte b4 : abstractC0791iQ0) {
                    kotlin.jvm.internal.m.b(b4);
                    arrayList.add(b4);
                }
                z2 = false;
            } else if (i4 != 3) {
                return N.f1689g;
            }
        }
        return M.f1683a.o(D0.z.L(J1.x.R(arrayList)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l I(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.s
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.J(params, (D0.s) obj);
            }
        };
    }

    private static final M I0(List list, String str) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        boolean z2 = true;
        for (int i3 = 0; i3 < size; i3++) {
            V0.I i4 = (V0.I) list.get(i3);
            I.c cVarB0 = i4.B0();
            int i5 = cVarB0 == null ? -1 : a.f1629b[cVarB0.ordinal()];
            if (i5 == 1) {
                if (!z2) {
                    sb.append(str);
                }
                sb.append(i4.z0());
                z2 = false;
            } else if (i5 != 3) {
                return N.f1689g;
            }
        }
        M.a aVar = M.f1683a;
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return aVar.l(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M J(List list, D0.s input) {
        boolean z2 = false;
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() < 2) {
            throw AbstractC0386b.a("Function should have at least 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            M m3 = (M) ((U1.l) it.next()).invoke(input);
            if (m3 instanceof P) {
                P p2 = (P) m3;
                V0.I iF = p2.f();
                if (iF == null || !iF.C0()) {
                    V0.I iF2 = p2.f();
                    if (iF2 == null || !iF2.G0()) {
                        return N.f1689g;
                    }
                } else {
                    List listG = p2.f().o0().g();
                    kotlin.jvm.internal.m.d(listG, "getValuesList(...)");
                    arrayList.add(listG);
                }
            } else if (!kotlin.jvm.internal.m.a(m3, O.f1694g)) {
                N n3 = N.f1689g;
                if (kotlin.jvm.internal.m.a(m3, n3)) {
                    return n3;
                }
                throw new I1.k();
            }
            z2 = true;
        }
        return z2 ? M.f1683a.g() : G(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M J0(V0.I i3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean zA = z.a.f1327a.a(i3, (V0.I) it.next());
            if (zA) {
                return M.f1683a.e();
            }
            if (zA) {
                throw new I1.k();
            }
        }
        return M.f1683a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l K(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.j
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.L(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M L(List list, D0.s input) {
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() != 1) {
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        }
        M m3 = (M) ((U1.l) list.get(0)).invoke(input);
        if (m3.g()) {
            return N.f1689g;
        }
        if (m3.i()) {
            return M.f1683a.g();
        }
        V0.I iF = m3.f();
        kotlin.jvm.internal.m.b(iF);
        if (iF.G0()) {
            return M.f1683a.g();
        }
        if (!iF.C0()) {
            return N.f1689g;
        }
        List listG = iF.o0().g();
        if (listG.isEmpty()) {
            return O.f1694g;
        }
        M.a aVar = M.f1683a;
        kotlin.jvm.internal.m.b(listG);
        Object objC = J1.x.C(listG);
        kotlin.jvm.internal.m.d(objC, "first(...)");
        return aVar.o((V0.I) objC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l M(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.i
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.N(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M N(List list, D0.s input) {
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() != 2) {
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        M m3 = (M) ((U1.l) list.get(0)).invoke(input);
        if (m3.g()) {
            return N.f1689g;
        }
        if (m3.i()) {
            return M.f1683a.g();
        }
        V0.I iF = m3.f();
        kotlin.jvm.internal.m.b(iF);
        if (iF.G0()) {
            return M.f1683a.g();
        }
        if (!iF.C0()) {
            return N.f1689g;
        }
        List listG = iF.o0().g();
        M m4 = (M) ((U1.l) list.get(1)).invoke(input);
        if (m4.g()) {
            return N.f1689g;
        }
        V0.I iF2 = m4.f();
        if (iF2 == null || !iF2.E0()) {
            return N.f1689g;
        }
        int iW0 = (int) iF2.w0();
        return iW0 < 0 ? N.f1689g : M.f1683a.i(listG.subList(0, Y1.i.c(iW0, listG.size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l O(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.r
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.P(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M P(List list, D0.s input) {
        V0.I iF;
        C0423b c0423bO0;
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() != 2) {
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        M m3 = (M) ((U1.l) list.get(0)).invoke(input);
        V0.I iF2 = m3.f();
        List listG = (iF2 == null || !iF2.C0() || (iF = m3.f()) == null || (c0423bO0 = iF.o0()) == null) ? null : c0423bO0.g();
        M m4 = (M) ((U1.l) list.get(1)).invoke(input);
        V0.I iF3 = m4.f();
        if (iF3 == null || !iF3.E0()) {
            return N.f1689g;
        }
        V0.I iF4 = m4.f();
        Long lValueOf = iF4 != null ? Long.valueOf(iF4.w0()) : null;
        if (listG == null) {
            return O.f1694g;
        }
        kotlin.jvm.internal.m.b(lValueOf);
        long jLongValue = lValueOf.longValue();
        if (jLongValue >= listG.size() || jLongValue < (-listG.size())) {
            return O.f1694g;
        }
        if (jLongValue < 0) {
            jLongValue += (long) listG.size();
        }
        M.a aVar = M.f1683a;
        Object obj = listG.get((int) jLongValue);
        kotlin.jvm.internal.m.d(obj, "get(...)");
        return aVar.o((V0.I) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l Q(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.f
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.R(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final G0.M R(java.util.List r6, D0.s r7) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.F.R(java.util.List, D0.s):G0.M");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l S(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.l
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.T(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M T(List list, D0.s input) {
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() != 2) {
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        M m3 = (M) ((U1.l) list.get(0)).invoke(input);
        M m4 = (M) ((U1.l) list.get(1)).invoke(input);
        if (m3.g() || m4.g()) {
            return N.f1689g;
        }
        V0.I iF = m3.f();
        if (iF == null || D0.z.W(iF)) {
            return M.f1683a.o(D0.z.f1310c);
        }
        if (!iF.C0()) {
            return N.f1689g;
        }
        V0.I iF2 = m4.f();
        if (iF2 == null) {
            return M.f1683a.o(D0.z.f1310c);
        }
        List listG = iF.o0().g();
        ArrayList arrayList = new ArrayList();
        int size = listG.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (z.a.f1327a.a((V0.I) listG.get(i3), iF2)) {
                arrayList.add(D0.z.w(i3));
            }
        }
        return M.f1683a.i(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l U(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.h
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.V(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M V(List list, D0.s input) {
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() != 1) {
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        }
        M m3 = (M) ((U1.l) list.get(0)).invoke(input);
        if (m3.g()) {
            return N.f1689g;
        }
        if (m3.i()) {
            return M.f1683a.g();
        }
        V0.I iF = m3.f();
        kotlin.jvm.internal.m.b(iF);
        if (iF.G0()) {
            return M.f1683a.g();
        }
        if (!iF.C0()) {
            return N.f1689g;
        }
        List listG = iF.o0().g();
        if (listG.isEmpty()) {
            return O.f1694g;
        }
        M.a aVar = M.f1683a;
        kotlin.jvm.internal.m.b(listG);
        Object objH = J1.x.H(listG);
        kotlin.jvm.internal.m.d(objH, "last(...)");
        return aVar.o((V0.I) objH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l W(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.p
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.X(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M X(List list, D0.s input) {
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() != 2) {
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        M m3 = (M) ((U1.l) list.get(0)).invoke(input);
        if (m3.g()) {
            return N.f1689g;
        }
        if (m3.i()) {
            return M.f1683a.g();
        }
        V0.I iF = m3.f();
        kotlin.jvm.internal.m.b(iF);
        if (iF.G0()) {
            return M.f1683a.g();
        }
        if (!iF.C0()) {
            return N.f1689g;
        }
        List listG = iF.o0().g();
        M m4 = (M) ((U1.l) list.get(1)).invoke(input);
        if (m4.g()) {
            return N.f1689g;
        }
        V0.I iF2 = m4.f();
        if (iF2 == null || !iF2.E0()) {
            return N.f1689g;
        }
        int iW0 = (int) iF2.w0();
        return iW0 < 0 ? N.f1689g : M.f1683a.i(listG.subList(listG.size() - Y1.i.c(iW0, listG.size()), listG.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l Y(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.g
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.Z(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M Z(List list, D0.s input) {
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() != 1) {
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        }
        M m3 = (M) ((U1.l) list.get(0)).invoke(input);
        if (m3.g()) {
            return N.f1689g;
        }
        if (m3.i()) {
            return M.f1683a.g();
        }
        V0.I iF = m3.f();
        kotlin.jvm.internal.m.b(iF);
        if (iF.G0()) {
            return M.f1683a.g();
        }
        if (!iF.C0()) {
            return N.f1689g;
        }
        List listG = iF.o0().g();
        if (listG.isEmpty()) {
            return M.f1683a.g();
        }
        V0.I i3 = (V0.I) listG.get(0);
        int size = listG.size();
        for (int i4 = 1; i4 < size; i4++) {
            if (z.a.f1327a.c((V0.I) listG.get(i4), i3) == z.a.EnumC0007a.f1331c) {
                i3 = (V0.I) listG.get(i4);
            }
        }
        M.a aVar = M.f1683a;
        kotlin.jvm.internal.m.b(i3);
        return aVar.o(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l a0(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.n
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.b0(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M b0(List list, D0.s input) {
        V0.I iF;
        C0423b c0423bO0;
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() != 2) {
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        M m3 = (M) ((U1.l) list.get(0)).invoke(input);
        V0.I iF2 = m3.f();
        List listG = (iF2 == null || !iF2.C0() || (iF = m3.f()) == null || (c0423bO0 = iF.o0()) == null) ? null : c0423bO0.g();
        M m4 = (M) ((U1.l) list.get(1)).invoke(input);
        V0.I iF3 = m4.f();
        if (iF3 == null || !iF3.E0()) {
            return N.f1689g;
        }
        V0.I iF4 = m4.f();
        Integer numValueOf = iF4 != null ? Integer.valueOf((int) iF4.w0()) : null;
        if (listG == null) {
            return O.f1694g;
        }
        kotlin.jvm.internal.m.b(numValueOf);
        if (numValueOf.intValue() < 0) {
            return N.f1689g;
        }
        final U1.p pVar = new U1.p() { // from class: G0.t
            @Override // U1.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(F.c0((V0.I) obj, (V0.I) obj2));
            }
        };
        List listO = J1.x.O(listG, new Comparator() { // from class: G0.u
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return F.d0(pVar, obj, obj2);
            }
        });
        return M.f1683a.i(listO.subList(0, Y1.i.c(numValueOf.intValue(), listO.size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c0(V0.I i3, V0.I i4) {
        int i5 = a.f1628a[z.a.f1327a.c(i3, i4).ordinal()];
        if (i5 != 1) {
            return i5 != 2 ? 0 : -1;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d0(U1.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l e0(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.k
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.f0(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M f0(List list, D0.s input) {
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() != 1) {
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        }
        M m3 = (M) ((U1.l) list.get(0)).invoke(input);
        if (m3.g()) {
            return N.f1689g;
        }
        if (m3.i()) {
            return M.f1683a.g();
        }
        V0.I iF = m3.f();
        kotlin.jvm.internal.m.b(iF);
        if (iF.G0()) {
            return M.f1683a.g();
        }
        if (!iF.C0()) {
            return N.f1689g;
        }
        List listG = iF.o0().g();
        if (listG.isEmpty()) {
            return M.f1683a.g();
        }
        V0.I i3 = (V0.I) listG.get(0);
        int size = listG.size();
        for (int i4 = 1; i4 < size; i4++) {
            if (z.a.f1327a.c((V0.I) listG.get(i4), i3) == z.a.EnumC0007a.f1329a) {
                i3 = (V0.I) listG.get(i4);
            }
        }
        M.a aVar = M.f1683a;
        kotlin.jvm.internal.m.b(i3);
        return aVar.o(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l g0(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.o
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.h0(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M h0(List list, D0.s input) {
        V0.I iF;
        C0423b c0423bO0;
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() != 2) {
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        M m3 = (M) ((U1.l) list.get(0)).invoke(input);
        V0.I iF2 = m3.f();
        List listG = (iF2 == null || !iF2.C0() || (iF = m3.f()) == null || (c0423bO0 = iF.o0()) == null) ? null : c0423bO0.g();
        M m4 = (M) ((U1.l) list.get(1)).invoke(input);
        V0.I iF3 = m4.f();
        if (iF3 == null || !iF3.E0()) {
            return N.f1689g;
        }
        V0.I iF4 = m4.f();
        Integer numValueOf = iF4 != null ? Integer.valueOf((int) iF4.w0()) : null;
        if (listG == null) {
            return O.f1694g;
        }
        kotlin.jvm.internal.m.b(numValueOf);
        if (numValueOf.intValue() < 0) {
            return N.f1689g;
        }
        final U1.p pVar = new U1.p() { // from class: G0.v
            @Override // U1.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(F.i0((V0.I) obj, (V0.I) obj2));
            }
        };
        List listO = J1.x.O(listG, new Comparator() { // from class: G0.w
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return F.j0(pVar, obj, obj2);
            }
        });
        return M.f1683a.i(listO.subList(0, Y1.i.c(numValueOf.intValue(), listO.size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i0(V0.I i3, V0.I i4) {
        int i5 = a.f1628a[z.a.f1327a.c(i3, i4).ordinal()];
        if (i5 != 1) {
            return i5 != 2 ? 0 : 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j0(U1.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l k0(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.q
            @Override // U1.l
            public final Object invoke(Object obj) {
                return F.l0(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M l0(List list, D0.s input) {
        boolean z2 = false;
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() != 2) {
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        M m3 = (M) ((U1.l) list.get(0)).invoke(input);
        if (m3 instanceof N) {
            return N.f1689g;
        }
        if (m3 instanceof O) {
            return N.f1689g;
        }
        M.a aVar = M.f1683a;
        if (kotlin.jvm.internal.m.a(m3, aVar.g())) {
            z2 = true;
        } else {
            V0.I iF = m3.f();
            if ((iF != null ? iF.B0() : null) != I.c.ARRAY_VALUE) {
                return N.f1689g;
            }
        }
        M m4 = (M) ((U1.l) list.get(1)).invoke(input);
        if (m4 instanceof N) {
            return N.f1689g;
        }
        if (m4 instanceof O) {
            return N.f1689g;
        }
        if (kotlin.jvm.internal.m.a(m4, aVar.g())) {
            return aVar.g();
        }
        V0.I iF2 = m4.f();
        I.c cVarB0 = iF2 != null ? iF2.B0() : null;
        int i3 = cVarB0 == null ? -1 : a.f1629b[cVarB0.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return N.f1689g;
            }
            if (!z2) {
                V0.I iF3 = m3.f();
                C0423b c0423bO0 = iF3 != null ? iF3.o0() : null;
                kotlin.jvm.internal.m.b(c0423bO0);
                List listG = c0423bO0.g();
                kotlin.jvm.internal.m.d(listG, "getValuesList(...)");
                V0.I iF4 = m4.f();
                AbstractC0791i abstractC0791iQ0 = iF4 != null ? iF4.q0() : null;
                kotlin.jvm.internal.m.b(abstractC0791iQ0);
                return H0(listG, abstractC0791iQ0);
            }
        } else if (!z2) {
            V0.I iF5 = m3.f();
            C0423b c0423bO02 = iF5 != null ? iF5.o0() : null;
            kotlin.jvm.internal.m.b(c0423bO02);
            List listG2 = c0423bO02.g();
            kotlin.jvm.internal.m.d(listG2, "getValuesList(...)");
            V0.I iF6 = m4.f();
            String strZ0 = iF6 != null ? iF6.z0() : null;
            kotlin.jvm.internal.m.b(strZ0);
            return I0(listG2, strZ0);
        }
        return aVar.g();
    }

    public static final U1.l m0() {
        return f1607a;
    }

    public static final U1.l n0() {
        return f1625s;
    }

    public static final U1.l o0() {
        return f1610d;
    }

    public static final U1.l p0() {
        return f1612f;
    }

    public static final U1.l q0() {
        return f1611e;
    }

    public static final U1.l r0() {
        return f1615i;
    }

    public static final U1.l s0() {
        return f1617k;
    }

    public static final U1.l t0() {
        return f1624r;
    }

    public static final U1.l u0() {
        return f1626t;
    }

    public static final U1.l v0() {
        return f1627u;
    }

    public static final U1.l w0() {
        return f1616j;
    }

    public static final U1.l x0() {
        return f1618l;
    }

    public static final U1.l y0() {
        return f1613g;
    }

    public static final U1.l z0() {
        return f1620n;
    }
}
