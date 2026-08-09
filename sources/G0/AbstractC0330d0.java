package G0;

import D0.z;
import G0.M;
import J0.AbstractC0386b;
import J1.AbstractC0412p;
import V0.I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: G0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0330d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U1.l f1785a = new U1.l() { // from class: G0.V
        @Override // U1.l
        public final Object invoke(Object obj) {
            return AbstractC0330d0.i((List) obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U1.l f1786b = new U1.l() { // from class: G0.W
        @Override // U1.l
        public final Object invoke(Object obj) {
            return AbstractC0330d0.o((List) obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U1.l f1787c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final U1.l f1788d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final U1.l f1789e = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final U1.l f1790f = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final U1.l f1791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final U1.l f1792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final U1.l f1793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final U1.l f1794j;

    /* JADX INFO: renamed from: G0.d0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1795a;

        static {
            int[] iArr = new int[I.c.values().length];
            try {
                iArr[I.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1795a = iArr;
        }
    }

    /* JADX INFO: renamed from: G0.d0$b */
    static final class b implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1796a = new b();

        b() {
        }

        @Override // U1.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final V0.I invoke(V0.I i3, V0.I b3) {
            int iIntValue;
            kotlin.jvm.internal.m.e(b3, "b");
            return (i3 != null && ((iIntValue = ((Number) ((U1.p) z.a.f1327a.b()).invoke(i3, b3)).intValue()) == 0 || iIntValue > 0)) ? i3 : b3;
        }
    }

    /* JADX INFO: renamed from: G0.d0$c */
    static final class c implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f1797a = new c();

        c() {
        }

        @Override // U1.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final V0.I invoke(V0.I i3, V0.I b3) {
            int iIntValue;
            kotlin.jvm.internal.m.e(b3, "b");
            return (i3 != null && ((iIntValue = ((Number) ((U1.p) z.a.f1327a.b()).invoke(i3, b3)).intValue()) == 0 || iIntValue <= 0)) ? i3 : b3;
        }
    }

    /* JADX INFO: renamed from: G0.d0$d */
    public static final class d implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I.c f1799b;

        /* JADX INFO: renamed from: G0.d0$d$a */
        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ I.c f1801b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I.c f1802c;

            public a(U1.l lVar, I.c cVar, I.c cVar2) {
                this.f1800a = lVar;
                this.f1801b = cVar;
                this.f1802c = cVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                P pB;
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1800a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                V0.I iF = m3.f();
                I.c cVarB0 = iF != null ? iF.B0() : null;
                int i3 = cVarB0 == null ? -1 : J0.f1679a[cVarB0.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    return M.f1683a.g();
                }
                if (cVarB0 != this.f1801b) {
                    if (cVarB0 == this.f1802c) {
                        pB = M.f1683a.b(Double.isNaN(iF.s0()));
                    }
                    return N.f1689g;
                }
                iF.w0();
                pB = M.f1683a.e();
                return pB;
            }
        }

        public d(I.c cVar, I.c cVar2) {
            this.f1798a = cVar;
            this.f1799b = cVar2;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 1) {
                return new a((U1.l) params.get(0), this.f1798a, this.f1799b);
            }
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    /* JADX INFO: renamed from: G0.d0$e */
    public static final class e implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I.c f1804b;

        /* JADX INFO: renamed from: G0.d0$e$a */
        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1805a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ I.c f1806b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I.c f1807c;

            public a(U1.l lVar, I.c cVar, I.c cVar2) {
                this.f1805a = lVar;
                this.f1806b = cVar;
                this.f1807c = cVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                P pB;
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1805a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                V0.I iF = m3.f();
                I.c cVarB0 = iF != null ? iF.B0() : null;
                int i3 = cVarB0 == null ? -1 : J0.f1679a[cVarB0.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    return M.f1683a.g();
                }
                if (cVarB0 != this.f1806b) {
                    if (cVarB0 == this.f1807c) {
                        pB = M.f1683a.b(!Double.isNaN(iF.s0()));
                    }
                    return N.f1689g;
                }
                iF.w0();
                pB = M.f1683a.h();
                return pB;
            }
        }

        public e(I.c cVar, I.c cVar2) {
            this.f1803a = cVar;
            this.f1804b = cVar2;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 1) {
                return new a((U1.l) params.get(0), this.f1803a, this.f1804b);
            }
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    /* JADX INFO: renamed from: G0.d0$f */
    public static final class f implements U1.l {

        /* JADX INFO: renamed from: G0.d0$f$a */
        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1808a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1809b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ U1.l f1810c;

            /* JADX INFO: renamed from: G0.d0$f$a$a, reason: collision with other inner class name */
            public static final class C0032a implements U1.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ U1.l f1811a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ D0.s f1812b;

                public C0032a(U1.l lVar, D0.s sVar) {
                    this.f1811a = lVar;
                    this.f1812b = sVar;
                }

                @Override // U1.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final M invoke() {
                    return (M) this.f1811a.invoke(this.f1812b);
                }
            }

            /* JADX INFO: renamed from: G0.d0$f$a$b */
            public static final class b implements U1.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ U1.l f1813a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ D0.s f1814b;

                public b(U1.l lVar, D0.s sVar) {
                    this.f1813a = lVar;
                    this.f1814b = sVar;
                }

                @Override // U1.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final M invoke() {
                    return (M) this.f1813a.invoke(this.f1814b);
                }
            }

            /* JADX INFO: renamed from: G0.d0$f$a$c */
            public static final class c implements U1.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ U1.l f1815a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ D0.s f1816b;

                public c(U1.l lVar, D0.s sVar) {
                    this.f1815a = lVar;
                    this.f1816b = sVar;
                }

                @Override // U1.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final M invoke() {
                    return (M) this.f1815a.invoke(this.f1816b);
                }
            }

            public a(U1.l lVar, U1.l lVar2, U1.l lVar3) {
                this.f1808a = lVar;
                this.f1809b = lVar2;
                this.f1810c = lVar3;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[Catch: Exception -> 0x005d, TRY_LEAVE, TryCatch #0 {Exception -> 0x005d, blocks: (B:3:0x000b, B:5:0x0026, B:6:0x0029, B:8:0x002f, B:20:0x004b, B:22:0x0051, B:23:0x0055, B:24:0x0058, B:13:0x003a), top: B:28:0x000b }] */
            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final G0.M invoke(D0.s r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = "input"
                    kotlin.jvm.internal.m.e(r6, r0)
                    U1.l r0 = r5.f1808a
                    U1.l r1 = r5.f1809b
                    U1.l r2 = r5.f1810c
                    G0.d0$f$a$a r3 = new G0.d0$f$a$a     // Catch: java.lang.Exception -> L5d
                    r3.<init>(r0, r6)     // Catch: java.lang.Exception -> L5d
                    G0.d0$f$a$b r0 = new G0.d0$f$a$b     // Catch: java.lang.Exception -> L5d
                    r0.<init>(r1, r6)     // Catch: java.lang.Exception -> L5d
                    G0.d0$f$a$c r1 = new G0.d0$f$a$c     // Catch: java.lang.Exception -> L5d
                    r1.<init>(r2, r6)     // Catch: java.lang.Exception -> L5d
                    java.lang.Object r6 = r3.invoke()     // Catch: java.lang.Exception -> L5d
                    G0.M r6 = (G0.M) r6     // Catch: java.lang.Exception -> L5d
                    boolean r2 = r6.g()     // Catch: java.lang.Exception -> L5d
                    if (r2 == 0) goto L29
                L26:
                    G0.N r6 = G0.N.f1689g     // Catch: java.lang.Exception -> L5d
                    goto L5f
                L29:
                    V0.I r6 = r6.f()     // Catch: java.lang.Exception -> L5d
                    if (r6 == 0) goto L34
                    V0.I$c r2 = r6.B0()     // Catch: java.lang.Exception -> L5d
                    goto L35
                L34:
                    r2 = 0
                L35:
                    r3 = -1
                    if (r2 != 0) goto L3a
                    r2 = r3
                    goto L42
                L3a:
                    int[] r4 = G0.AbstractC0330d0.a.f1795a     // Catch: java.lang.Exception -> L5d
                    int r2 = r2.ordinal()     // Catch: java.lang.Exception -> L5d
                    r2 = r4[r2]     // Catch: java.lang.Exception -> L5d
                L42:
                    if (r2 == r3) goto L58
                    r3 = 1
                    if (r2 == r3) goto L58
                    r3 = 2
                    if (r2 == r3) goto L4b
                    goto L26
                L4b:
                    boolean r6 = r6.p0()     // Catch: java.lang.Exception -> L5d
                    if (r6 == 0) goto L58
                    java.lang.Object r6 = r0.invoke()     // Catch: java.lang.Exception -> L5d
                L55:
                    G0.M r6 = (G0.M) r6     // Catch: java.lang.Exception -> L5d
                    goto L5f
                L58:
                    java.lang.Object r6 = r1.invoke()     // Catch: java.lang.Exception -> L5d
                    goto L55
                L5d:
                    G0.N r6 = G0.N.f1689g
                L5f:
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: G0.AbstractC0330d0.f.a.invoke(D0.s):G0.M");
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 3) {
                return new a((U1.l) params.get(0), (U1.l) params.get(1), (U1.l) params.get(2));
            }
            throw AbstractC0386b.a("Function should have exactly 3 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    /* JADX INFO: renamed from: G0.d0$g */
    public static final class g implements U1.l {

        /* JADX INFO: renamed from: G0.d0$g$a */
        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1817a;

            public a(List list) {
                this.f1817a = list;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                int size = this.f1817a.size();
                boolean[] zArr = new boolean[size];
                boolean z2 = false;
                int i3 = 0;
                for (Object obj : this.f1817a) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC0412p.m();
                    }
                    M m3 = (M) ((U1.l) obj).invoke(input);
                    if (m3.g()) {
                        return N.f1689g;
                    }
                    V0.I iF = m3.f();
                    I.c cVarB0 = iF != null ? iF.B0() : null;
                    int i5 = cVarB0 == null ? -1 : K0.f1680a[cVarB0.ordinal()];
                    if (i5 == -1 || i5 == 1) {
                        z2 = true;
                    } else {
                        if (i5 != 2) {
                            return N.f1689g;
                        }
                        zArr[i3] = iF.p0();
                    }
                    i3 = i4;
                }
                if (z2) {
                    return M.f1683a.g();
                }
                try {
                    M.a aVar = M.f1683a;
                    Boolean boolValueOf = Boolean.FALSE;
                    for (int i6 = 0; i6 < size; i6++) {
                        boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() ^ zArr[i6]);
                    }
                    return aVar.b(boolValueOf.booleanValue());
                } catch (Exception unused) {
                    return N.f1689g;
                }
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            return new a(params);
        }
    }

    /* JADX INFO: renamed from: G0.d0$h */
    public static final class h implements U1.l {

        /* JADX INFO: renamed from: G0.d0$h$a */
        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1818a;

            public a(List list) {
                this.f1818a = list;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                List list = this.f1818a;
                ArrayList<M> arrayList = new ArrayList(J1.q.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((M) ((U1.l) it.next()).invoke(input));
                }
                try {
                    if (arrayList.size() >= 2) {
                        b bVar = b.f1796a;
                        V0.I i3 = null;
                        for (M m3 : arrayList) {
                            if (!m3.g()) {
                                V0.I iF = m3.f();
                                I.c cVarB0 = iF != null ? iF.B0() : null;
                                int i4 = cVarB0 == null ? -1 : a.f1795a[cVarB0.ordinal()];
                                if (i4 != -1 && i4 != 1) {
                                    i3 = (V0.I) bVar.invoke(i3, iF);
                                }
                            }
                        }
                        return i3 == null ? M.f1683a.g() : M.f1683a.o(i3);
                    }
                    return N.f1689g;
                } catch (Exception unused) {
                    return N.f1689g;
                }
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            return new a(params);
        }
    }

    /* JADX INFO: renamed from: G0.d0$i */
    public static final class i implements U1.l {

        /* JADX INFO: renamed from: G0.d0$i$a */
        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1819a;

            public a(List list) {
                this.f1819a = list;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                List list = this.f1819a;
                ArrayList<M> arrayList = new ArrayList(J1.q.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((M) ((U1.l) it.next()).invoke(input));
                }
                try {
                    if (arrayList.size() >= 2) {
                        c cVar = c.f1797a;
                        V0.I i3 = null;
                        for (M m3 : arrayList) {
                            if (!m3.g()) {
                                V0.I iF = m3.f();
                                I.c cVarB0 = iF != null ? iF.B0() : null;
                                int i4 = cVarB0 == null ? -1 : a.f1795a[cVarB0.ordinal()];
                                if (i4 != -1 && i4 != 1) {
                                    i3 = (V0.I) cVar.invoke(i3, iF);
                                }
                            }
                        }
                        return i3 == null ? M.f1683a.g() : M.f1683a.o(i3);
                    }
                    return N.f1689g;
                } catch (Exception unused) {
                    return N.f1689g;
                }
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            return new a(params);
        }
    }

    static {
        I.c cVar = I.c.INTEGER_VALUE;
        I.c cVar2 = I.c.DOUBLE_VALUE;
        f1791g = new d(cVar, cVar2);
        f1792h = new e(cVar, cVar2);
        f1793i = new U1.l() { // from class: G0.X
            @Override // U1.l
            public final Object invoke(Object obj) {
                return AbstractC0330d0.m((List) obj);
            }
        };
        f1794j = new U1.l() { // from class: G0.Y
            @Override // U1.l
            public final Object invoke(Object obj) {
                return AbstractC0330d0.k((List) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l i(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.a0
            @Override // U1.l
            public final Object invoke(Object obj) {
                return AbstractC0330d0.j(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M j(List list, D0.s sVar) {
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            M m3 = (M) ((U1.l) it.next()).invoke(sVar);
            if (m3.g()) {
                return N.f1689g;
            }
            V0.I iF = m3.f();
            I.c cVarB0 = iF != null ? iF.B0() : null;
            int i3 = cVarB0 == null ? -1 : a.f1795a[cVarB0.ordinal()];
            if (i3 == -1 || i3 == 1) {
                z2 = true;
            } else {
                if (i3 != 2) {
                    return N.f1689g;
                }
                if (!iF.p0()) {
                    return M.f1683a.e();
                }
            }
        }
        M.a aVar = M.f1683a;
        return z2 ? aVar.g() : aVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l k(List params) {
        kotlin.jvm.internal.m.e(params, "params");
        if (params.size() != 1) {
            throw AbstractC0386b.a("IsNotNull function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
        final U1.l lVar = (U1.l) params.get(0);
        return new U1.l() { // from class: G0.b0
            @Override // U1.l
            public final Object invoke(Object obj) {
                return AbstractC0330d0.l(lVar, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M l(U1.l lVar, D0.s sVar) {
        return ((M) lVar.invoke(sVar)).f() == null ? N.f1689g : M.f1683a.b(!r0.G0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l m(List params) {
        kotlin.jvm.internal.m.e(params, "params");
        if (params.size() != 1) {
            throw AbstractC0386b.a("IsNull function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
        final U1.l lVar = (U1.l) params.get(0);
        return new U1.l() { // from class: G0.c0
            @Override // U1.l
            public final Object invoke(Object obj) {
                return AbstractC0330d0.n(lVar, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M n(U1.l lVar, D0.s sVar) {
        V0.I iF = ((M) lVar.invoke(sVar)).f();
        return iF == null ? N.f1689g : M.f1683a.b(iF.G0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l o(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.Z
            @Override // U1.l
            public final Object invoke(Object obj) {
                return AbstractC0330d0.p(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M p(List list, D0.s sVar) {
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            M m3 = (M) ((U1.l) it.next()).invoke(sVar);
            if (m3.g()) {
                return N.f1689g;
            }
            V0.I iF = m3.f();
            I.c cVarB0 = iF != null ? iF.B0() : null;
            int i3 = cVarB0 == null ? -1 : a.f1795a[cVarB0.ordinal()];
            if (i3 == -1 || i3 == 1) {
                z2 = true;
            } else {
                if (i3 != 2) {
                    return N.f1689g;
                }
                if (iF.p0()) {
                    return M.f1683a.h();
                }
            }
        }
        M.a aVar = M.f1683a;
        return z2 ? aVar.g() : aVar.e();
    }

    public static final U1.l q() {
        return f1785a;
    }

    public static final U1.l r() {
        return f1788d;
    }

    public static final U1.l s() {
        return f1791g;
    }

    public static final U1.l t() {
        return f1792h;
    }

    public static final U1.l u() {
        return f1794j;
    }

    public static final U1.l v() {
        return f1793i;
    }

    public static final U1.l w() {
        return f1789e;
    }

    public static final U1.l x() {
        return f1790f;
    }

    public static final U1.l y() {
        return f1786b;
    }

    public static final U1.l z() {
        return f1787c;
    }
}
