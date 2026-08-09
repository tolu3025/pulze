package G0;

import D0.z;
import G0.F0;
import G0.M;
import J0.AbstractC0386b;
import V0.I;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U1.l f1646a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U1.l f1647b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U1.l f1648c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final U1.l f1649d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final U1.l f1650e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final U1.l f1651f = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final U1.l f1652g = new h(I.c.BOOLEAN_VALUE);

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1653a;

        static {
            int[] iArr = new int[z.a.EnumC0007a.values().length];
            try {
                iArr[z.a.EnumC0007a.f1331c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.a.EnumC0007a.f1330b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.a.EnumC0007a.f1329a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1653a = iArr;
        }
    }

    public static final class b implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1654a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1655b;

            public a(U1.l lVar, U1.l lVar2) {
                this.f1654a = lVar;
                this.f1655b = lVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1654a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1655b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                try {
                    return M.f1683a.b(z.a.f1327a.a(m3.f(), m4.f()));
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

    public static final class c implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1656a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1657b;

            public a(U1.l lVar, U1.l lVar2) {
                this.f1656a = lVar;
                this.f1657b = lVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                if (((M) this.f1656a.invoke(input)).g()) {
                    return N.f1689g;
                }
                if (((M) this.f1657b.invoke(input)).g()) {
                    return N.f1689g;
                }
                try {
                    return M.f1683a.a(Boolean.valueOf(!z.a.f1327a.a(r0.f(), r4.f())));
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

    public static final class d implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1658a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1659b;

            public a(U1.l lVar, U1.l lVar2) {
                this.f1658a = lVar;
                this.f1659b = lVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1658a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1659b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                try {
                    V0.I iF = m3.f();
                    V0.I iF2 = m4.f();
                    M.a aVar = M.f1683a;
                    z.a.EnumC0007a enumC0007aC = z.a.f1327a.c(iF, iF2);
                    boolean z2 = true;
                    if (a.f1653a[enumC0007aC.ordinal()] != 1) {
                        z2 = false;
                    }
                    return aVar.b(z2);
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
            final /* synthetic */ U1.l f1660a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1661b;

            public a(U1.l lVar, U1.l lVar2) {
                this.f1660a = lVar;
                this.f1661b = lVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1660a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1661b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                try {
                    V0.I iF = m3.f();
                    V0.I iF2 = m4.f();
                    M.a aVar = M.f1683a;
                    int i3 = a.f1653a[z.a.f1327a.c(iF, iF2).ordinal()];
                    boolean z2 = true;
                    if (i3 != 1 && i3 != 2) {
                        z2 = false;
                    }
                    return aVar.b(z2);
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
            final /* synthetic */ U1.l f1662a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1663b;

            public a(U1.l lVar, U1.l lVar2) {
                this.f1662a = lVar;
                this.f1663b = lVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1662a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1663b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                try {
                    return M.f1683a.b(a.f1653a[z.a.f1327a.c(m3.f(), m4.f()).ordinal()] == 3);
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
            final /* synthetic */ U1.l f1664a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1665b;

            public a(U1.l lVar, U1.l lVar2) {
                this.f1664a = lVar;
                this.f1665b = lVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1664a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1665b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                try {
                    V0.I iF = m3.f();
                    V0.I iF2 = m4.f();
                    M.a aVar = M.f1683a;
                    int i3 = a.f1653a[z.a.f1327a.c(iF, iF2).ordinal()];
                    boolean z2 = true;
                    if (i3 != 2 && i3 != 3) {
                        z2 = false;
                    }
                    return aVar.b(z2);
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

    public static final class h implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1666a;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1667a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ I.c f1668b;

            public a(U1.l lVar, I.c cVar) {
                this.f1667a = lVar;
                this.f1668b = cVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    M m3 = (M) this.f1667a.invoke(input);
                    if (!m3.g()) {
                        V0.I iF = m3.f();
                        I.c cVarB0 = iF != null ? iF.B0() : null;
                        int i3 = cVarB0 == null ? -1 : F0.a.f1644a[cVarB0.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (cVarB0 == this.f1668b) {
                                try {
                                    return M.f1683a.b(!iF.p0());
                                } catch (Exception unused) {
                                }
                            }
                        }
                        return M.f1683a.g();
                    }
                    return N.f1689g;
                } catch (Exception unused2) {
                    return N.f1689g;
                }
            }
        }

        public h(I.c cVar) {
            this.f1666a = cVar;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 1) {
                return new a((U1.l) params.get(0), this.f1666a);
            }
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final U1.l a() {
        return f1646a;
    }

    public static final U1.l b() {
        return f1648c;
    }

    public static final U1.l c() {
        return f1649d;
    }

    public static final U1.l d() {
        return f1650e;
    }

    public static final U1.l e() {
        return f1651f;
    }

    public static final U1.l f() {
        return f1647b;
    }

    public static final U1.l g() {
        return f1652g;
    }
}
